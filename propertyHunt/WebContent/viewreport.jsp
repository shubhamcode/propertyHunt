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

<form action="reportgenerator" method="post" enctype="multipart/form-data">

<input type="file" name="sheet" multiple> 
<br><br>

<button type="submit">Upload File for calculation </button>
</form>
</p>

<form action="logoutpage">
<button type="submit" style="float:right">Logout</button>
</form>


</body>
</html>