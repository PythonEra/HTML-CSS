<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Record Inserted</h1>

	<br>
	<br>
	<h1>Insderted Records are : </h1>
	<%
		String name = request.getParameter("name");
		String prn = request.getParameter("prn");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:cd");
			stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO students(sname,sprn,semail,smobile) VALUES('"+name+"','"+prn+"','"+email+"','"+mobile+"')");
			ResultSet rs = stmt.executeQuery("SELECT sname,sprn,semail,smobile FROM students");
			%>

			<table border=1><tr><td>Name</td><td>PRN</td><td>Emain</td><td>Mobile</td></tr>
			<%
			while(rs.next())
			{
				String t1 = rs.getString(1);
				String t2 = rs.getString(2);
				String t3 = rs.getString(3);
				String t4 = rs.getString(4);
			%>
				<tr>
					<td><%=t1%></td>
					<td><%=t2%></td>
					<td><%=t3%></td>
					<td><%=t4%></td>
				</tr>
<%
			}
		}

		catch(Exception e)
		{
			out.println("ERROR");
			out.println(e);

		}



	%>


	<!-- %%%%%%%%%%%%%%%% -->


	<!-- %%%%%%%%%%%%%%%%%%%%%%% -->
</body>
</html>
		
		