package DB;

import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

public class UserDOA {

    Connection con = DBConnection.GetConnection();

    String insert_user = " INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?,?)";
    String insert_userperm = " INSERT INTO userpermetion VALUES(?,?,?)";
    String login_query = "SELECT * FROM users as u JOIN userpermetion as p on u.uname=p.uname WHERE (u.uname=? and u.pass=?) and (p.perm_id=? and p.states='1')";
    String search_query = "SELECT   users.uname  ,   pass  ,   name  ,   email  ,   DOB  ,   image  ,   gender  ,   phone  ,   cat_id  ,   cv   ,  perm_id  ,     states   FROM users  JOIN userpermetion ON users.uname =userpermetion.uname  WHERE users.uname = ? and perm_id=?";

    public boolean insert(User u, int author, int reviewer) {
        PreparedStatement ps, psusp;
        try {
            ps = con.prepareStatement(insert_user);
            psusp = con.prepareStatement(insert_userperm);
            ps.setString(1, u.getUname());
            ps.setString(2, u.getPass());
            ps.setString(3, u.getName());
            ps.setString(4, u.getEmail());
            ps.setDate(5, u.getDOB());
            ps.setBlob(6, u.getImage());
            ps.setString(7, u.getGender());
            ps.setString(8, u.getPhone());
            ps.setString(9, u.getCid());
            ps.setBlob(10, u.getCv());
            int ret = ps.executeUpdate();
            //////////////////////////////////
            psusp.setString(1, "1");    //reader
            psusp.setString(2, u.getUname());
            psusp.setString(3, "1");
            psusp.executeUpdate();
            //////////////////////////////
            if (author == 1) {
                psusp.setString(1, "2");    //author
                psusp.setString(2, u.getUname());
                psusp.setString(3, "0");
                psusp.executeUpdate();
            }
            ////////////////////////////////
            if (reviewer == 1) {
                psusp.setString(1, "3");    //reviewer
                psusp.setString(2, u.getUname());
                psusp.setString(3, "0");
                psusp.executeUpdate();
            }
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

    public boolean login(String uname, String pass , String perm) {
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(login_query);
            preparedStmt.setString(1, uname);
            preparedStmt.setString(2, pass);
            preparedStmt.setString(3, perm);
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    public User searchUser(String uname ,String prem_id) {
        User ret = new User();
        PreparedStatement preparedStmt;
        try {
            preparedStmt = con.prepareStatement(search_query);
            preparedStmt.setString(1, uname);
            preparedStmt.setString(2, prem_id);
            //users.uname  ,   pass  ,   name  ,   email  ,   DOB  ,   image  ,   gender  ,   phone  ,   cat_id  ,   cv   ,  perm_id  ,     states
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                ret.setUname(rs.getString(1));
                ret.setPass(rs.getString(2));
                ret.setName(rs.getString(3));
                ret.setEmail(rs.getString(4));
                ret.setDOB(rs.getDate(5));
                ret.setImage(rs.getBlob(6).getBinaryStream());
                ret.setGender(rs.getString(7));
                ret.setPhone(rs.getString(8));
                ret.setCid(rs.getString(9));
                ret.setCv(rs.getBlob(10).getBinaryStream());
                ret.setType(prem_id);
                System.out.println(ret);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
}
