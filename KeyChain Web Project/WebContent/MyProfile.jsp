<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Details</title>
</head>
<body>
<p><i>The Order will be delivered to the given address</i></p>
<table border=""1>
<tr>
<td>NAame</td>
<td>Phone</td>
<td>Country</td>
<td>City</td>
<td>Aaddress</td>
</tr>
<%
Object NAame=session.getAttribute("NAame");
Object Phone=session.getAttribute("Phone");
Object Country=session.getAttribute("Country");
Object City=session.getAttribute("City");
Object Aaddress=session.getAttribute("Aaddress");

if(NAame!=null)
{
%>
<tr>
<td><%out.println(NAame); %> </td>
<td><%out.println(Phone); %> </td>
<td><%out.println(Country); %> </td>
<td><%out.println(City); %> </td>
<td><%out.println(Aaddress); %> </td>
</tr>
<% 
	
}
else
	out.println("Some error occured");
%>
</table>
</body>
</html>