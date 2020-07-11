<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report Data</title>
</head>
<body>

<h1 align="center">
<%
       List<String> data=(List<String>)request.getAttribute("rdata");
		int sum=0,c=0;

		 Iterator tr=data.iterator();
		
			tr.next();
			
			out.println("Avg Price -- ");
			
		while(tr.hasNext())
		{
			String[] st1=(tr.next().toString()).split(",");
			
			sum+=Integer.parseInt(st1[9]);
			c++;
 
		}
		
		
		out.println(sum/c);
		
		out.println("<br><br>");
		out.println("Total Price--"+sum +"    Total Entrie--"+c);
		
%>

</h1>

</body>
</html>