<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import=" java.sql.*"%>
     <%@ page  import=" javax.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Submission</title>
<link rel="Stylesheet" href="Style.css">
</head>
<body>
<div class="hero">
<center>
<%
String NAame=request.getParameter("NAame");
String Phone=request.getParameter("Phone");
String Country=request.getParameter("Country");
String City=request.getParameter("City");
String Aaddress=request.getParameter("Address");
try{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String Connection="jdbc:sqlserver://LAPTOP-6RU90B3K;database=mydata;integratedSecurity=true;";
	String uname="sujes";
	String pass="";
	String query="insert into Details values(?,?,?,?,?) ";
	Connection con=DriverManager.getConnection(Connection,uname,pass);
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,NAame);
	ps.setString(2,Phone);
	ps.setString(3,Country);
	ps.setString(4,City);
	ps.setString(5,Aaddress);

	ps.executeUpdate();


}
catch(Exception e){
	out.println(e);
}

%>
</center>
<div class="para">
<p><bold><i>Order Successful......</i></bold></p>
</div>

<div class="log">
<a href="MyProfile.jsp"><button class="login">Click Here To Check the Details</button></a>
</div>
</div>
</body>
</html>