<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information page</title>
</head>
<body>
<h1>User Name is : ${user.name}</h1>
<h1>User Id is : ${user.id}</h1>
<h1>User Address is : ${user.address }</h1>
<h1>User DOB is : ${user.DOB }</h1>
<h1>User selected courses are : ${user.courses }</h1>
<h1>User gender is : ${user.gender }</h1>
<h1>User type : ${user.type }</h1>
</body>
</html>