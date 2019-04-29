/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.UserDOA;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Nitro
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.getSession().removeAttribute("user");
            String e = request.getParameter("uname");
            String p = request.getParameter("pass");
            String s = request.getParameter("type");

            if (s.equals("Reader")) {
                s = "1";
            } else if (s.equals("Author")) {
                s = "2";

            } else if (s.equals("Reviewer")) {
                s = "3";

            } else if (s.equals("Manager")) {
                s = "4";
            }
            UserDOA db = new UserDOA();
            boolean check = db.login(e, p, s);

            if (check) {
                System.out.println("here");
                User user = db.searchUser(e, s);
                out.print(user);
                System.out.println(user);
                request.getSession().setAttribute("user", user);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");//with request with mess
                dispatcher.forward(request, response);
                out.println("Please enter username or password correctly");
            }
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
