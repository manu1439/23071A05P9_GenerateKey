import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GenerateKeyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String dob = request.getParameter("dob");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy credentials for verification
        if (username.equals("sarap123") && password.equals("sarap123")) {
            String key = firstname.substring(0, 2).toLowerCase() + dob;
            
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h3>Login Successful</h3>");
            out.println("<p>Welcome, " + firstname + " " + lastname + "</p>");
            out.println("<p>Your Generated Key: <strong>" + key + "</strong></p>");
            out.println("</body></html>");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><h3>Invalid Credentials</h3></body></html>");
       }
   }
}

