<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<for:form method="post" action="update" modelAttribute="emp">
		<table>
			<tr>
				<td>Employee Id for update</td>
				<td><input name="empId" value="${emp.empId}"/></td>
				<td><for:errors path="empId"></for:errors></td>
			</tr>
			<tr>
				<td>New Employee Name</td>
				<td><input name="empName" value="${emp.empName}"/></td>
				<td><for:errors path="empName"></for:errors></td>
			</tr>

			<tr>
				<td>New Employee Salary</td>
				<td><input name="empSalary" value="${emp.empSalary}" /></td>
				<td><for:errors path="empSalary"></for:errors>
			</tr>

			<tr>
				<td>New Employee Designation</td>
				<td><for:select path="empDesignation" items="${deg}" /></td>
			</tr>

			<tr>
				<td>Employee Gender</td>
				<td><for:radiobutton path="empGender" value="male" />Male</td>
				<td><for:radiobutton path="empGender" value="female" />FeMale</td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Employee"></input></td>
			</tr>
		</table>


	</for:form>
</body>
</html>