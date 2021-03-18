<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<%
String name =(String) session.getAttribute("name");
%>

<h1>Name : <%= name %>
</h1>
</body>
</html>