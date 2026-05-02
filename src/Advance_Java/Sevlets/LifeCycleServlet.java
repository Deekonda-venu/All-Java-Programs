package Advance_Java.Sevlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LifeCycleServlet extends HttpServlet {
    
    private static AtomicInteger visitCount = new AtomicInteger(0);
    private String initTime;
    
    @Override
    public void init() throws ServletException {
        initTime = new java.util.Date().toString();
        System.out.println("LifeCycleServlet initialized at: " + initTime);
        System.out.println("Servlet instance: " + this.hashCode());
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        int currentCount = visitCount.incrementAndGet();
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Servlet Life Cycle</title></head>");
        out.println("<body>");
        out.println("<h1>Servlet Life Cycle Demo</h1>");
        out.println("<p><strong>Servlet Initialized:</strong> " + initTime + "</p>");
        out.println("<p><strong>Current Time:</strong> " + new java.util.Date() + "</p>");
        out.println("<p><strong>Visit Count:</strong> " + currentCount + "</p>");
        out.println("<p><strong>Servlet Instance:</strong> " + this.hashCode() + "</p>");
        out.println("<p><strong>Request Method:</strong> " + req.getMethod() + "</p>");
        out.println("<p><strong>Request URI:</strong> " + req.getRequestURI() + "</p>");
        out.println("</body>");
        out.println("</html>");
        
        System.out.println("Service method called - Visit #" + currentCount);
    }
    
    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet destroyed at: " + new java.util.Date());
        System.out.println("Total visits: " + visitCount.get());
    }
}
