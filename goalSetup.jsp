<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<label>Username : ${UserName}</label>
	<div>
	<form action="saveUserGoals" name="userGoalSetupForm" id="userGoalSetupForm">
	<label>Set Goals</label>
	<br>
	<label>Push-ups :</label>
	<input type="text" id="pushupCount" name="pushupCount">
	<br>
	<label>Walk/Run (in Kms):</label>
	<input type="text" id="walkDistance" name="walkDistance">
	<br>
	<input type="submit" id="submit">
	</form>
	</div>
</body>
</html>