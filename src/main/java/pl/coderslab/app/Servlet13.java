package pl.coderslab.app;

import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@WebServlet(name = "Servlet13", urlPatterns = "/Servlet13")
public class Servlet13 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File file = new File("/home/benek/workspace/Homework_02/oop.txt");
        List<String> list = FileUtils.readLines(file);
        for (String line : list) {
            response.getWriter().println(line);
        }
    }
}
