<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Student</h2>
<form action="addStudent" method="post">
<table>
	<tr>
		<td>Student Id: </td>
		<td><input type="text" name="roll_number" /></td>
	</tr>
	<tr>
		<td>Student Name: </td>
		<td><input type="text" name="student_name" /></td>
	</tr>
	<tr>
		<td>Course: </td>
		<td><input type="text" name="course" /></td>
	</tr>
	<tr>
		<td>Duration : </td>
		<td><input type="text" name="duration" /></td>
	</tr>
	<tr>
		<td>Age: </td>
		<td><input type="text" name="age" /></td>
	</tr>
	<tr>
	
	<tr>
	<td>
	male:<input type="radio" id="male" name="gender" value="male">
	</td>
	<td>
	female:<input type="radio" id="female" name="gender" value="female">
	</td>
	</tr>
	<tr>
	<td>
	<label for="hometown">HomeTown:</label>
	
	<select name="hometown" id="hometown">
		<option value="pune">pune</option>
		<option value="nashik">nashik</option>
		<option value="mumbai">mumbai</option>
	</select>
	</td>
	</tr>
		<td>&nbsp; </td>
		<td><input type="submit" value="Add Student" /></td>
	
	</table>
	</form>

</body>
</html>