<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ page import="Pack01.*" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>등록되었습니다.</h1>
	<ul>
	
	<c:forEach var="i" items="${mm}">
	
    	<li>${i}</li>
    
	</c:forEach>
	
	</ul>


	<%-- <h1>${mm}</h1> --%>
	
</body>
</html>