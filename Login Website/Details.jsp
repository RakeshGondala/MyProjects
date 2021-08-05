<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import=" java.sql.*"%>
     <%@ page  import=" javax.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Submission</title>
<link rel="Stylesheet" href="style.css">
</head>
<body>
<div class="hero">
<center>
<%
String PID=request.getParameter("PID");
String PAassword=request.getParameter("PAassword");
String PName=request.getParameter("PName");
String PDept=request.getParameter("PDept");
String PAddress=request.getParameter("PAddress");
try{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String Connection="jdbc:sqlserver://LAPTOP-6RU90B3K;database=mydata;integratedSecurity=true;";
	String uname="sujes";
	String pass="";
	String query="insert into PoliceDepartment values(?,?,?,?,?) ";
	Connection con=DriverManager.getConnection(Connection,uname,pass);
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,PID);
	ps.setString(2,PAassword);
	ps.setString(3,PName);
	ps.setString(4,PDept);
	ps.setString(5,PAddress);
	ps.executeUpdate();


}
catch(Exception e){
	out.println(e);
}

%>
</center>
<div class="para">
<p><bold><i>Registration Successful......</i></bold></p>
</div>

<div class="link">
<a href="LoginForm.html"><button class="Button1">Click Here To Login</button></a>
</div>
</div>
</body>
</html>