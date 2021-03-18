import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
// import java.sql.*;  
public class session_store extends HttpServlet
{  
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html><html><head><title></title></head><body>");
		// action=\"/examples/servlets/servlet/rutusessionextract\" 
		out.println("<form method=\"GET\" >");
		out.println("<label>Name:<input type=\"text\" name=\"name\"></label><br>");
		out.println("<label><input type=\"submit\"></label>");
		String name = req.getParameter("name");
		HttpSession s = req.getSession(true);
		s.setAttribute("name",name);
		out.println("</form><br><h1><a href=\"http://localhost:8080/examples/servlets/servlet/session_ext\">View Retrieved</a></h1></body></html>");
		out.close();
	}
}  