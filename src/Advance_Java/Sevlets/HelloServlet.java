package Advance_Java.Sevlets;

import java.io.*;
import javax.servlet.*;

public class HelloServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from Generic Servlet!</h1>");
        out.println("<p>This is a basic servlet example.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
