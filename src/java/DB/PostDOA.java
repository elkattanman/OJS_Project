/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.post;

/**
 *
 * @author Nitro
 */
public class PostDOA {

    Connection con = DBConnection.GetConnection();

    String insert_query       = " INSERT INTO  submission( title , keyword ,discreption , pdf , docs  , html , time_stamp ,  uname,  cat_id ) VALUES (?,?,?,?,?,?,?,?,?)";
    String view_posts_not     = " SELECT   title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image ,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='0' and submission.cat_id=?";
    String view_posts         = " SELECT   title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image ,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='1' ";
    String Search             = " SELECT   title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image ,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='1' and title like ? or keyword like ?";
    String view_posts_rej     = " SELECT   title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image ,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='2' ";
    String view_post_pdf      = " SELECT   pdf ,   html , docs  FROM submission WHERE  	sub_id  = ? ";
    String view_posts_uname   = " SELECT   title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='1' and submission.uname=? ";
    String view_posts_cat     = " SELECT   title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='1' and submission.cat_id=?";
    String view_posts_cat_rej = " SELECT title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image,sub_id FROM submission JOIN users ON submission.uname=users.uname where statepost='2' and submission.cat_id=?";
    String update_posts_state = " UPDATE submission SET  statepost=? WHERE sub_id=? ";

    public boolean insert(post p) {
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(insert_query);

            ps.setString(1, p.getTitle());
            ps.setString(2, p.getKeyword());
            ps.setString(3, p.getDescription());

            ps.setBlob(4, p.getPdf());
            ps.setBlob(5, p.getDcox());
            ps.setBlob(6, p.getHtml());
            ps.setDate(7, new Date(System.currentTimeMillis()));
            ps.setString(8, p.getUname());
            ps.setString(9, p.getCateg());
            int ret = ps.executeUpdate();

            /////////////////////////////////////////////
            if (ret == 1) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error fe insert");
            return false;
        }
        // ps.setBlob(8, u.getCv());        
    }

    public ArrayList<post> VIEWPOST() {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(view_posts);

            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image , sub_id
                //1         2              3                   4            5    6      7       8         9                  10        11   12     13
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);

                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public ArrayList<post> Search(String key) {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(Search);
            preparedStmt.setString(1, key);
            preparedStmt.setString(2, key);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image , sub_id
                //1         2              3                   4            5    6      7       8         9                  10        11   12     13
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);

                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    public ArrayList<post> VIEWPOSTNOTACCEPTED(String cat_id) {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(view_posts_not);
            preparedStmt.setString(1, cat_id);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image , sub_id
                //1         2              3                   4            5    6      7       8         9                  10        11   12     13
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);

                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    public ArrayList<post> VIEWPOSTREJ() {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(view_posts_rej);

            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image , sub_id
                //1         2              3                   4            5    6      7       8         9                  10        11   12     13
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);
                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    public post VIEWPOST(int id) {
        PreparedStatement preparedStmt;
        post retP = new post();
        try {
            preparedStmt = con.prepareStatement(view_post_pdf);
            preparedStmt.setInt(1, id);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image
                //1         2              3                   4            5    6      7       8         9                  10        11   12
                retP.setPdf(rs.getBlob(1).getBinaryStream());
                retP.setHtml(rs.getBlob(2).getBinaryStream());
                retP.setDcox(rs.getBlob(3).getBinaryStream());
                System.out.println(retP);
            }

        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retP;
    }

    public ArrayList<post> VIEWPOST_uname(String uname) {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(view_posts_uname);
            preparedStmt.setString(1, uname);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image
                //1         2              3                   4            5    6      7       8         9                  10        11   12
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);
                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    public ArrayList<post> VIEWPOST_cat(String cat) {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(view_posts_cat);
            preparedStmt.setString(1, cat);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image
                //1         2              3                   4            5    6      7       8         9                  10        11   12
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);
                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

 
    public ArrayList<post> VIEWPOST_cat_rej(String cat) {
        ArrayList<post> ret = new ArrayList<>();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(view_posts_cat_rej);
            preparedStmt.setString(1, cat);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                // title , discreption , submission.cat_id , time_stamp , pdf , html , docs , keyword , submission.uname , statepost ,name,image
                //1         2              3                   4            5    6      7       8         9                  10        11   12
                post retP = new post();
                retP.setTitle(rs.getString(1));
                retP.setDescription(rs.getString(2));
                retP.setCateg(rs.getString(3));
                retP.setTime_stamp(rs.getDate(4));
                retP.setPdf(rs.getBlob(5).getBinaryStream());
                retP.setHtml(rs.getBlob(6).getBinaryStream());
                retP.setDcox(rs.getBlob(7).getBinaryStream());
                retP.setKeyword(rs.getString(8));
                retP.setUname(rs.getString(9));
                retP.setState(rs.getString(10));
                retP.setName(rs.getString(11));
                retP.setImage(rs.getBlob(12).getBinaryStream());
                retP.setId(rs.getInt(13));
                ret.add(retP);
                System.out.println(retP);
            }
        } catch (SQLException ex) {
            System.err.println("error in select Posts");
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    public void update_post(String i, String s) {
        PreparedStatement preparedStmt;
        try {
            System.out.println("here eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            preparedStmt = con.prepareStatement(update_posts_state);
            preparedStmt.setString(1, s);
            preparedStmt.setString(2, i);
            preparedStmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PostDOA.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}