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
 *
 * @author Nitro
 */
public class maint {

    public static void main(String[] args) {
        PostDOA o = new PostDOA();
        ArrayList<post> i = o.VIEWPOST_cat("1");
        System.out.println(i);
      
    
       

      
    }
}
