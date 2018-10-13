<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<h1>Registration Page</h1>
<form:form action="register" method="post" modelAttribute="user">
<form:label path="username">Username</form:label>
<form:input path="username" required="required"/><br><br>

<form:label path="password">Passwoord</form:label>
<form:password path="password" required="required"/><br><br>

<form:label path="email">Email</form:label>
<form:input path="email" type="email" required="required"/><br>

<input type="submit" value="Register">
</form:form>

</body>
</html>