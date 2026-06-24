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

public IndexServlet() {
    super();
}

@Override
protected void doGet(HttpServletRequest request,
                     HttpServletResponse response)
        throws ServletException, IOException {

    doPost(request, response);
}

@Override
protected void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

    String termin = request.getParameter("termin");
    String datum = request.getParameter("datum");
    String uhrzeit = request.getParameter("uhrzeit");

    response.setContentType("text/html;charset=UTF-8");

    response.getWriter().println("<html>");
    response.getWriter().println("<head>");
    response.getWriter().println("<title>Termin gespeichert</title>");
    response.getWriter().println("</head>");
    response.getWriter().println("<body>");

    response.getWriter().println("<h1>Termin erfolgreich gespeichert!</h1>");

    response.getWriter().println("<p><b>Termin:</b> "
            + termin + "</p>");

    response.getWriter().println("<p><b>Datum:</b> "
            + datum + "</p>");

    response.getWriter().println("<p><b>Uhrzeit:</b> "
            + uhrzeit + "</p>");

    response.getWriter().println("<hr>");
    response.getWriter().println("<p>Die Daten wurden erfolgreich vom JSP an das Servlet übertragen.</p>");

    response.getWriter().println("</body>");
    response.getWriter().println("</html>");
}

}