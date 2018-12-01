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
			<th>Course Id</th>
			<th>Course Name</th>
			<th>Course Fees</th>
			<th>Enroll</th>
		</tr>
		<a:forEach var="emp" items="${course}">
			<tr>
				<td>${emp.courseId}</td>
				<td>${emp.courseName}</td>
				<td>${emp.courseFee}</td>
				<td><a href="enroll?name=${emp.courseId}">Enroll</a></td>
			</tr>
		</a:forEach>

	</table>
</body>
</html>