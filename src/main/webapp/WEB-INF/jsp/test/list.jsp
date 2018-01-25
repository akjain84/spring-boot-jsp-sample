
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test: sub page</title>
</head>
<body>
	<h1>Sub page</h1>

	
<table>
<c:forEach items="${userForms}" var="userForm"> 
  <tr>
    <td>${userForm.name}</td>
    <td>${userForm.address}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>