/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listener;

import DB.DBConnection;
import DB.PostDOA;
import DB.UserDOA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author mustafa
 */
public class contextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        PostDOA postDB = new PostDOA();
        UserDOA userDB = new UserDOA();
        sce.getServletContext().setAttribute("postDB", postDB);
        sce.getServletContext().setAttribute("userDB", userDB);
        //sce.getServletContext().setAttribute("DB", db.GetConnection());
        DBConnection db = new DBConnection();
        Connection con= db.GetConnection();
        HashMap mp = new HashMap();
        HashMap mp2 = new HashMap();
        HashMap mp3 = new HashMap();
        try {
            PreparedStatement preparedStmt;
            PreparedStatement preparedStmt2;
            preparedStmt = con.prepareStatement("SELECT * FROM catog");
            preparedStmt2 = con.prepareStatement("SELECT * FROM `premetion`");
            ResultSet rs = preparedStmt.executeQuery();
            ResultSet rs2 = preparedStmt2.executeQuery();
            while (rs.next()) {
                mp.put(rs.getString("cat_id"), rs.getString("cat_name"));
                mp3.put(rs.getString("cat_name") , rs.getString("cat_id"));
            }
            while (rs2.next()) {
                mp2.put(rs2.getString("perm_id"), rs2.getString("perm"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(contextListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        sce.getServletContext().setAttribute("categ",mp);
        sce.getServletContext().setAttribute("premetion",mp2);
        sce.getServletContext().setAttribute("categ2",mp3);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("End World!");
    }
}
