package pl.coderslab.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet(name = "Servlet15",urlPatterns = "/Servlet15")
public class Servlet15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        Integer[] randoms = new Integer[10];
        for(int i = 0; i < 10; i++){
            randoms[i] = random.nextInt(100)+1;
        }
        response.getWriter().println(Arrays.toString(randoms));
        Arrays.sort(randoms);
        response.getWriter().println(Arrays.toString(randoms));

    }
}
