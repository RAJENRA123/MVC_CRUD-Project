<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>USER REGI FORM</h1>
<form action="saveUser" Method ="get">
<h2>${LoadForm}</h2>
<table>
<tr>
<td>USER FIRST NAME</td>
<td><input type="text" name="fname"></td>
</tr>

<tr>
<td>USER LAST NAME</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td>USER EMAIL</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>USER  NAME</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>


</table>
</form>
</body>
</html>