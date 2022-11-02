<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	add
	<form action="/HelloWorld/view-user.do" method="post">
		<p>name</p>
		<input type="text" name="name"/>
		<p>age</p>
		<input type="text" name="age"/>
		<input value="them" type="submit" />
	</form>

</body>
</html>