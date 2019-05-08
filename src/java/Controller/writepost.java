/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.PostDOA;
import DB.UserDOA;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import model.post;

/**
 *
 * @author Nitro
 */
@WebServlet(name = "writepost", urlPatterns = {"/writepost"})
@MultipartConfig
public class writepost extends HttpServlet {

    post pst = new post();
    User u = new User();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            pst.setTitle(request.getParameter("title"));
            pst.setKeyword(request.getParameter("keyword"));
            pst.setDescription(request.getParameter("post"));
            pst.setPdf(request.getPart("pdfFile").getInputStream());
            pst.setHtml(request.getPart("htmlFile").getInputStream());
            pst.setDcox(request.getPart("docsFile").getInputStream());
            u = (User) request.getSession().getAttribute("user");
            pst.setCateg(u.getCid()); 
            pst.setUname(u.getUname());
            pst.setTime_stamp(new Date(System.currentTimeMillis()));
            System.out.println(pst);
            if (new PostDOA().insert(pst)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
            } else {
                out.print("problem");
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
