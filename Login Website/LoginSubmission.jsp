<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import=" java.sql.*"%>
     <%@ page  import=" javax.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Submission</title>
<link rel="Stylesheet" href="style.css">
</head>
<body>
<center>
<%
String PID=request.getParameter("PID");
String PAassword=request.getParameter("PAassword");
try{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String Connection="jdbc:sqlserver://LAPTOP-6RU90B3K;database=mydata;integratedSecurity=true;";
	String uname="sujes";
	String pass="";
	String query="select*from PoliceDepartment where PID=? and PAassword=?";
	Connection con=DriverManager.getConnection(Connection,uname,pass);
	PreparedStatement ps=con.prepareStatement(query);
	  ps.setString(1,PID);
	  ps.setString(2,PAassword);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
      String PName=rs.getString(3);
      String PDept=rs.getString(4);
      String PAddress=rs.getString(5);
      
      session.setAttribute("PID",PID);
      session.setAttribute("PAassword",PAassword);
      session.setAttribute("PName",PName);
      session.setAttribute("PDept",PDept);
      session.setAttribute("PAddress",PAddress);
      response.sendRedirect("MyProfile.jsp");
    }
    else
    	response.sendRedirect("Failed.jsp");
 
}  

catch(Exception e){
	out.println(e);
}

%>

</center>
</body>
</html>