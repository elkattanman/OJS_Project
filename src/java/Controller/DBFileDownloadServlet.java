/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.PostDOA;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.post;

/**
 *
 * @author Nitro
 */
@WebServlet("/downloadAttachment")
public class DBFileDownloadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    InputStream inputStream;
    post p;
    PostDOA po = new PostDOA();
    private static final int BUFFER_SIZE = 4096;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String i = request.getParameter("id");
        String type = request.getParameter("type");
        p = po.VIEWPOST(Integer.valueOf(i));
        if (type.equals("1")) {
            inputStream = p.getPdf();
            int fileLength = inputStream.available();
            System.out.println("fileLength = " + fileLength);
            ServletContext context = getServletContext();
            // sets MIME type for the file download
            String mimeType = context.getMimeType("file_name.pdf");
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }

            // set content properties and header attributes for the response
            response.setContentType(mimeType);
            response.setContentLength(fileLength);
            String headerKey = "Content-Disposition";
            String headerValue = String.format("attachment; filename=\"%s\"", "file_name.pdf");
            response.setHeader(headerKey, headerValue);

            // writes the file to the client
            OutputStream outStream = response.getOutputStream();

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outStream.close();
        } else if (type.equals("2")) {
            inputStream = p.getDcox();
            int fileLength = inputStream.available();

            System.out.println("fileLength = " + fileLength);

            ServletContext context = getServletContext();

            // sets MIME type for the file download
            String mimeType = context.getMimeType("file_name.txt");
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }

            // set content properties and header attributes for the response
            response.setContentType(mimeType);
            response.setContentLength(fileLength);
            String headerKey = "Content-Disposition";
            String headerValue = String.format("attachment; filename=\"%s\"", "file_name.txt");
            response.setHeader(headerKey, headerValue);

            // writes the file to the client
            OutputStream outStream = response.getOutputStream();

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outStream.close();
        } else if (type.equals("3")) {
            inputStream = p.getHtml();
            int fileLength = inputStream.available();

            System.out.println("fileLength = " + fileLength);

            ServletContext context = getServletContext();

            // sets MIME type for the file download
            String mimeType = context.getMimeType("file_name.html");
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }

            // set content properties and header attributes for the response
            response.setContentType(mimeType);
            response.setContentLength(fileLength);
            String headerKey = "Content-Disposition";
            String headerValue = String.format("attachment; filename=\"%s\"", "file_name.html");
            response.setHeader(headerKey, headerValue);

            // writes the file to the client
            OutputStream outStream = response.getOutputStream();

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outStream.close();
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
