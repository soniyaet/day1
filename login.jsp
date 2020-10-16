<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
<style type="text/css">
.error{
color:red;
}</style>
</head>
<body>
<form:form action="login" method="post" modelAttribute="user">
Enter userId :<form:input path="userId"/><br><br>
<form:errors path="userId"></form:errors>
Enter userName:<form:input path="userName"/><br><br>
<form:errors path="userName"></form:errors>
Enter password:<form:input path="password"/><br><br>
<form:errors path="password"></form:errors>
<input type="submit" value="Login">
</form:form>
</body>
</html>