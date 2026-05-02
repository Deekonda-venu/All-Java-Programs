package Advance_Java.Sevlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpServletExample extends HttpServlet {
    
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet initialized");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html>");
        out.println("<head><title>HTTP Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>HTTP GET Request</h1>");
        out.println("<p>This is handled by doGet() method</p>");
        out.println("<form method='post'>");
        out.println("<input type='text' name='name' placeholder='Enter your name'>");
        out.println("<input type='submit' value='Submit POST'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        
        out.println("<html>");
        out.println("<head><title>HTTP Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>HTTP POST Request</h1>");
        out.println("<p>Hello, " + (name != null ? name : "Guest") + "!</p>");
        out.println("<p>This is handled by doPost() method</p>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}
