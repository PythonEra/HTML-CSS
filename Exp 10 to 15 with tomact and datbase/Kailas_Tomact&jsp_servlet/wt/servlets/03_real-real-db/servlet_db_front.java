import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
// import java.sql.*;  
public class servlet_db_front extends HttpServlet
{  
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html><html><head><title></title></head><body>");
		out.println("<form action=\"/examples/servlets/servlet/servlet_db_back\" method=\"POST\" >");
		out.println("<label>Name:<input type=\"text\" name=\"name\"></label><br>");
		out.println("<label>PRN:<input type=\"text\" name=\"prn\"></label><br>");
		out.println("<label>Email:<input type=\"text\" name=\"email\"></label><br>");
		out.println("<label>Mobile No:<input type=\"text\" name=\"mobile\"></label><br>");
		out.println("<label><input type=\"submit\"></label>");
		out.println("<label><input type=\"reset\"></label>");
		out.println("</form></body></html>");
		out.close();
	}
}  