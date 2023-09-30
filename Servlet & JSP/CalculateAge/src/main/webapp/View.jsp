<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Age</title>
<style>
.styleH3{background-color:green;color:white;}
</style>
</head>
<body>
<form action="calculate" method="post">
<label> Date of birth <input type="date" name="dateOfBirth"> </label><br>
<label> Age at the date of <input type="date" name="age"> </label><br>
<input value="Calculate" type="submit">

<h3 class="styleH3">Result</h3>
<p>
Age: <% out.println(request.getAttribute("years")); %><br>
<% out.println(request.getAttribute("months"));%> months <br>
<% out.println(request.getAttribute("days"));%> days <br> 
</p>
</form>
</body>
</html>