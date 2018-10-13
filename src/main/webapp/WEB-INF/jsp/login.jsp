<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Login Page</h1>
<form:form action="login" method="post" modelAttribute="user">
<form:label path="username">Username</form:label>
<form:input path="username"/><br>

<form:label path="password">Password</form:label>
<form:password path="password"/><br><br>

<input type="submit" value="Login">
</form:form>
<div style="color:red">${message}</div>

</body>
</html>