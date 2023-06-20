<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored="false" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Here we are using ModelAndView</title>
</head>
<body>

<%-- <%
String d=(String)request.getAttribute("na");
Integer id=(Integer)request.getAttribute("an");
LocalDateTime W=(LocalDateTime)request.getAttribute("timi");
%> --%>

<h1>This is my page : ${na}</h1>
<h1>this is my rolenumber : ${an}</h1>
<h1>the present time and date is : ${timi}</h1>
<hr>
<a:forEach var="Q" items="${Ob}">
<h1>${Q}</h1>
</a:forEach>
</body>
</html>