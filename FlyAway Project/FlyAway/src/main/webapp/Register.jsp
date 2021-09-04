<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<fieldset>
<h1> New User Registration </h1>
<form action="UserServlet" method="post">
<center><input type="text" name="name" placeholder="Enter Name"/></center></br></br>
<center><input type="text" name="username" placeholder="Enter User Name"/></center></br></br>
<center><input type="password" name="password" placeholder="Enter Password"/></center></br></br>
<center><input type="submit" name="btnRegister" value="Submit Now"/></center></br></br>
</fieldset>
</form>
<center><a href="BookFlight.jsp">Already a User?</a></center></br></br>
</body>
</html>