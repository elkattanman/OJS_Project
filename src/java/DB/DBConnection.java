
package DB;

import java.sql.*;


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
    
    
    
}
