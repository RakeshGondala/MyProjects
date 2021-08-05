<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Details</title>
</head>
<body>
<table border=""1>
<tr>
<td>PID</td>
<td>PAassword</td>
<td>PName</td>
<td>PDept</td>
<td>PAddress</td>
</tr>
<%
Object PID=session.getAttribute("PID");
Object PAassword=session.getAttribute("PAassword");
Object PName=session.getAttribute("PName");
Object PDept=session.getAttribute("PDept");
Object PAddress=session.getAttribute("PAddress");

if(PID!=null)
{
%>
<tr>
<td><%out.println(PID); %> </td>
<td><%out.println(PAassword); %> </td>
<td><%out.println(PName); %> </td>
<td><%out.println(PDept); %> </td>
<td><%out.println(PAddress); %> </td>
</tr>
<% 
	
}
else
	out.println("Some error occured");
%>
</table>
</body>
</html>