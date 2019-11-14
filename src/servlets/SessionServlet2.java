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

@WebServlet(name = "sessionServlet2", urlPatterns = "/session2")
public class SessionServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		HttpSession session = req.getSession(); // session holen
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>Title</title></head> <body>");
		
		out.print("<h1>HAllo SessionServlet2 . . . </h1>");
		
		String vorname = String.valueOf(session.getAttribute("vorname"));
		LocalDate date = (LocalDate) session.getAttribute("date");
		
		out.print(vorname + "" + date);
		
//		out.print("<a href = '/app1/session2'> weiter </a> ");
		out.println("</body></html>");
	}
}
