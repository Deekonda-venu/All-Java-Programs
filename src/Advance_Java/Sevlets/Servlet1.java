package Advance_Java.Sevlets;

import java.io.*;
import javax.servlet.*;

public class Servlet1 extends GenericServlet {
    
    @Override
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello from GenericServlet!</h1>");
        out.println("<p>This is a basic servlet example.</p>");
    }
}
