<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>User Rank page</title>
</head>
<body>
	<label>User Name : ${UserName}</label>
	<label>User Acivity Information</label>
	<div>
	<label>Your push-up count:</label>${user.userPushupCount}
	<label>Your push-up count:</label>${user.userWalkDistance}
	
	</div>
	<div>
	<table>
		<thead>
			<tr>
				<th>User Name</th>
				<th>Rank</th>
			</tr>
		</thead>
		<tbody>
			<c:foreach items="${userList }" var="user">
				<tr>
					<td>user.getUserName</td>
					<td>user.getRank</td>
				</tr>
			</c:foreach>
		</tbody>
	</table>
	</div>
</body>
</html>