package Advance_Java.Sevlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import java.util.Random;

public class DynamicServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        // Dynamic content examples
        Date currentDate = new Date();
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000);
        String fakeCreditCard = generateFakeCreditCard();
        
        out.println("<html>");
        out.println("<head><title>Dynamic Content</title></head>");
        out.println("<body>");
        out.println("<h1>Dynamic Content Examples</h1>");
        out.println("<p><strong>Current Time:</strong> " + currentDate + "</p>");
        out.println("<p><strong>Random Number:</strong> " + randomNumber + "</p>");
        out.println("<p><strong>Fake Credit Card:</strong> " + fakeCreditCard + "</p>");
        out.println("<p><strong>User Agent:</strong> " + req.getHeader("User-Agent") + "</p>");
        out.println("<p><strong>Client IP:</strong> " + req.getRemoteAddr() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
    
    private String generateFakeCreditCard() {
        // Generate a fake credit card number (for educational purposes only)
        Random rand = new Random();
        StringBuilder card = new StringBuilder();
        
        // Generate 16 digits
        for (int i = 0; i < 16; i++) {
            if (i > 0 && i % 4 == 0) {
                card.append(" ");
            }
            card.append(rand.nextInt(10));
        }
        
        return card.toString();
    }
}
