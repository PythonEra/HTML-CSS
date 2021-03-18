import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
// import java.sql.*;  
public class session_ext extends HttpServlet
{  
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		HttpSession s = req.getSession(false);

		out.println("<!DOCTYPE html><html><head><title></title></head><body>");
	


		String name =(String) s.getAttribute("name");
		out.println("<h1>Name : "+name+"</h1>");

		out.println("</body></html>");
		out.close();
	}
	// public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	// {
	// 	doGet(req,res);	
	// }
}  