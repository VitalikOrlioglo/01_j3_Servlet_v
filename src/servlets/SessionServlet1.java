package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "sessionServlet1", urlPatterns = "/session1")
public class SessionServlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		HttpSession session = req.getSession(true); // erzeugt eine Session, when paramter true ist
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>Title</title></head> <body>");
		
		out.print("<h1>HAllo SessionServlet1 . . . </h1>");
		
		String vorname = req.getParameter("vorname");
		out.print(vorname);
		
		out.print("<a href = '/app1/session2'> weiter </a> ");
		out.println("</body></html>");
		
		session.setAttribute("vorname", vorname);
		session.setAttribute("date", LocalDate.now());
	}
}
