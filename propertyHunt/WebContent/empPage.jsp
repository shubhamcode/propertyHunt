<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Detail</title>
</head>
<body>
<h1 align="center">PropertyHunt Employee Details</h1>

<%
		

response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires","0");

		HttpSession sn=request.getSession();
		if(sn.getAttribute("username")==null)
			response.sendRedirect("index.jsp");
		
%>
<p>
<h1>Welcome <span style="color: red">${username}</span></h1>

<form action="viewreport.jsp">
<button type="submit">View Report</button>
</form>
<form action="logoutpage">
<button type="submit" style="float:right">Logout</button>
</form>
</body>
</html>

