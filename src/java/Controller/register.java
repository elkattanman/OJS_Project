/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.UserDOA;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Nitro
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
@MultipartConfig
public class register extends HttpServlet {

    InputStream is = null;
    java.util.Date result;
    User user = new User();
    int auth, rev;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            user.setUname(request.getParameter("uname"));
            user.setName(request.getParameter("name"));
            user.setPass(request.getParameter("pass"));
            user.setEmail(request.getParameter("email"));
            String dateStr = request.getParameter("DOB");
            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

            result = formater.parse(dateStr);
            SimpleDateFormat newFormater = new SimpleDateFormat("yyyy-MM-dd");
            newFormater.format(result);
            java.sql.Date sqlDate = new java.sql.Date(result.getTime());
            user.setDOB(sqlDate);
            user.setImage(request.getPart("image").getInputStream());
            user.setGender(request.getParameter("gender"));
            if(request.getParameter("cat").equals("Computer Science")){  user.setCid("1");}
          
            
            user.setPhone(request.getParameter("phone"));
            user.setCv(request.getPart("cv").getInputStream());
           user.setType(request.getParameter("type"));

            if (request.getParameter("author") != null) {
                auth = 1;
            }
            if (request.getParameter("reviwer") != null) {
                rev = 1;
            }
            out.print("get all  prameter ");
            out.print(user);
            if (new UserDOA().insert(user, auth, rev)) {
                request.getSession().setAttribute("user", user);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
            } else {
                out.print("problem");
            }

        } catch (ParseException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
