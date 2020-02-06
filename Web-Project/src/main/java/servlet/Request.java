package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Request", urlPatterns = "/Request")
public class Request extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames = request.getHeaderNames();
        List<String> names = new ArrayList<>();
        List<String> values = new ArrayList<>();

        while(headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            names.add(name);
            values.add(request.getHeader(name));
        }
        request.setAttribute("names",names);
        request.setAttribute("values", values);
        request.getRequestDispatcher("pages/RequestDisplay.jsp").forward(request,response);
    }
}
