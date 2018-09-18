package pl.coderslab.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet141", urlPatterns = "/Servlet141")
public class Servlet141 extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        for (int i = 0; i < 8; i++) {
            response.getWriter().println("<a href=" + request.getContextPath() + "/Servlet142?id=" + i + ">id: " + i + "</a><br></br>");
        }
    }
}
