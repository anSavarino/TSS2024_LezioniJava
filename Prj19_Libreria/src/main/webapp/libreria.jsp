<%@page import="model.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Libri</h1>
	<%ArrayList<Libro> libri = (ArrayList<Libro>)request.getAttribute("libri"); %>
	<%@include file="addLibro.html" %>
	<ul>
		<% for (Libro l : libri){ %>
			<li><% l.getTitolo();%></li>
			<%} %>
	</ul>
</body>
</html>