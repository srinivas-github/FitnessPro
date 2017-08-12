<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Core Tag JSP5</title>
</head>
<body>
	<label>User name: "${userName}"</label>
	<label>Enter your activities:</label>
	
	<form action="saveUserAcivity" name="userAcivityForm" id="userAcivityForm">
	<label>No.of Push-ups</label>
	<input type="text" id="userPushup">
	<br>
	<label>You covered distance by walk :</label>
	<input type="text" id="userCoveredDistance">
	<br>
	<input type="submit" id="submit" value="save">
	</form>
	<label></label>
</body>
</html>