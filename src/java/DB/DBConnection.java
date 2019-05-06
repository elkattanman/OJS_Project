
package DB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
        static  Connection con;


    public static Connection GetConnection () {
        con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/journal", "root", "");
            System.out.println("connected");
        } catch (Exception ex) {
            System.out.println("error db");
        }
        
        return con;
    }
    
    public static void closeCon(){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("connection can't close");
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    
    
}
