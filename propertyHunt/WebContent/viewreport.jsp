<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report View</title>
</head>
<body>

<%
		
		
		HttpSession sn=request.getSession();
		if(sn.getAttribute("username")==null)
			response.sendRedirect("index.jsp");
		

%>



<h1 align="center">PropertyHunt Report View</h1>

<p>

<form action="reportgenerator">

<input type="file" name="sheet"> Upload File for calculation
<br><br>

<button type="submit">View Average Price </button>
</form>
</p>

<form action="logoutpage">
<button type="submit" style="float:right">Logout</button>
</form>


</body>
</html>