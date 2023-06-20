<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Hi this is Anand Shiraganve's Home URL</h4>
<%
String a=(String)request.getAttribute("A");
Integer id=(Integer)request.getAttribute("B");
List<String> a1=(List<String>)request.getAttribute("AC");
%>
<h1>I am <%=a %></h1>
<h1>my id is : <%=id %></h1>

<h1>my frenz names are<%
for(String d:a1){
	%>
	<h1><%=d %></h1><%
}
%></h1>

</body>
</html>