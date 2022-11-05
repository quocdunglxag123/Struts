<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div align="center">
  <h1>Employee Register Form</h1>
  <bean:write name="user" property="error" filter="false"/>
  
  <form action="/HelloWorld/T001.do" method="post">
	<table style="with: 80%">
    <tr>
     <td>CustomerId</td>
     <td><input type="text" name="customerId" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>