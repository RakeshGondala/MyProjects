<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
</head>
<body>
<fieldset>
<center><h1> Book Flight </h1></center>
<form action="BookServlet" method="post">
<center>Enter Name:-<input type="text" name="name" /></center></br>
<center>Enter Flight Name:-<input type="text" name="Flightname" /></center></br>
<center>Enter Source Name:-<input type="text" name="Sourcename" /></center></br>
<center>Enter Destination Name:-<input type="text" name="Destinationname" /></center></br>
<center>Enter Number of Passengers:-<input type="text" name="Passenger" /></center></br>
<center>Enter Ticket Price:-<input type="text" name="price" /></center></br>
<center>Enter credit/debit 16 digit number(ex:-1111-1111-1111-1111):-<input type="text" name="card" /></center></br>
<center>Enter cvv 3 digit number:-<input type="text" name="cvv"/></center></br>
<center><input type="submit" value="make Payment"/></center></br></br>
</fieldset>
</form>
</body>
</html>