<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table cellpadding="2" cellspacing="2" border="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Rating</th>
			<th>Rate</th>
			<th>Available Rooms</th>
		</tr>
		<a:forEach var="hotel" items="${temp}">
			<tr>
				<td><a href="searchhotel?">${hotel.id}</a></td>
				<td>${hotel.name}</td>
				<td>${hotel.rating}</td>
				<td>${hotel.rate}</td>
				<td>${hotel.availableRooms}</td>
			</tr>
		</a:forEach>

	</table>
</body>
</html>