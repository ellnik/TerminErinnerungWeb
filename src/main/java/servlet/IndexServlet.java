package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {

private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest request,
                     HttpServletResponse response)
        throws ServletException, IOException {

    request.getRequestDispatcher("/index.jsp")
           .forward(request, response);
}

@Override
protected void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

    String termin = request.getParameter("termin");
    String datum = request.getParameter("datum");
    String uhrzeit = request.getParameter("uhrzeit");

    request.setAttribute("termin", termin);
    request.setAttribute("datum", datum);
    request.setAttribute("uhrzeit", uhrzeit);

    request.getRequestDispatcher("/result.jsp")
           .forward(request, response);
}

}