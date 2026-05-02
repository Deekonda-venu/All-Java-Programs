package Advance_Java.Sevlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Form Example</title></head>");
        out.println("<body>");
        out.println("<h1>User Registration Form</h1>");
        out.println("<form method='post' action='FormServlet'>");
        out.println("<p>Name: <input type='text' name='name' required></p>");
        out.println("<p>Email: <input type='email' name='email' required></p>");
        out.println("<p>Age: <input type='number' name='age' min='1' max='120'></p>");
        out.println("<p>Gender:");
        out.println("<input type='radio' name='gender' value='male'> Male");
        out.println("<input type='radio' name='gender' value='female'> Female");
        out.println("</p>");
        out.println("<p>Skills:");
        out.println("<input type='checkbox' name='skills' value='Java'> Java");
        out.println("<input type='checkbox' name='skills' value='HTML'> HTML");
        out.println("<input type='checkbox' name='skills' value='CSS'> CSS");
        out.println("</p>");
        out.println("<p><input type='submit' value='Register'></p>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        // Get form parameters
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");
        String[] skills = req.getParameterValues("skills");
        
        out.println("<html>");
        out.println("<head><title>Registration Success</title></head>");
        out.println("<body>");
        out.println("<h1>Registration Successful!</h1>");
        out.println("<h2>User Details:</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Gender:</strong> " + gender + "</p>");
        
        if (skills != null) {
            out.println("<p><strong>Skills:</strong> ");
            for (String skill : skills) {
                out.println(skill + " ");
            }
            out.println("</p>");
        }
        
        out.println("<p><a href='FormServlet'>Back to Form</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
