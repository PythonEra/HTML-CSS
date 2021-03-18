import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;  
public class servlet_db_back extends HttpServlet
{  
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html><html><head><title></title></head><body>");
	
		String name = req.getParameter("name");
		// out.println(name);
	
		String prn = req.getParameter("prn");
		// out.println(prn);
	
		String email = req.getParameter("email");
		// out.println(email);
	
		String mobile = req.getParameter("mobile");
		// out.println(mobile);
	

		// save to db
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:cd");
			stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO students(sname,sprn,semail,smobile) VALUES('"+name+"','"+prn+"','"+email+"','"+mobile+"')");
			out.println("<h1>Record Inseted<h1>");

			out.println("<h1>Inseted Records<h1>");
			ResultSet rs = stmt.executeQuery("SELECT sname,sprn,semail,smobile FROM students");

			out.println("<table border=1><tr><td>Name</td><td>PRN</td><td>Emain</td><td>Mobile</td></tr>");
			while(rs.next())
			{
				String t1 = rs.getString(1);
				String t2 = rs.getString(2);
				String t3 = rs.getString(3);
				String t4 = rs.getString(4);
				out.println("<tr><td>"+t1+"</td><td>"+t2+"</td><td>"+t3+"</td><td>"+t4+"</td></tr>");

			}

		}




		catch(Exception e)
		{
			out.println("ERROR");
			out.println(e);

		}

		out.println("</table></body></html>");
		out.close();
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		doGet(req,res);	
	}
}  