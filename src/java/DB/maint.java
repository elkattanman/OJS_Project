/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Date;
import java.util.ArrayList;
import model.User;
import model.post;

/**
 *s
 * @author Nitro
 */
public class maint {

    public static void main(String[] args) {
        UserDOA o=new UserDOA();
        System.out.println(o.login("sasa", "admin", "1"));
        System.out.println(o.update_data("Mustafa", "asdxasd012@gmail.com", "01090481564", "sasa"));
        
    }
}
