<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<form method="GET">
	<label>Name:<input type="text" name="name"></label><br>
	<label><input type="submit"></label>
		<%
		String name = request.getParameter("name");
		
		session.setAttribute("name",name);
		%>
		<br>
		<h1><a href="http://localhost:8080/examples/jsp/jspsessionextract.jsp">
			View Stored
		</a></h1>
		
</form>
</body>
</html>