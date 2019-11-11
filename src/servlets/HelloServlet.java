package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		System.out.println("abcabnsdkjcakcnkancknakscnaknckanskcnaskcnakcn");
		out.println("<html><head><title>Title</title></head> <body>");
		
		out.print("<h1>HAllo Servlet . . . </h1>");
		
		out.println("</body></html>");
	}
}
