<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>메인 페이지</title>
</head>
<body>
<h1><center>MyBatis</center></h1>


	<form method="post" action="t1">
		<table border="3"  width ="400" height="200" align = "center" >
			<tr align='center'>
				<td>이름 </td>
				<td><input type="text" name=name value='강동하'></td>
			</tr>
			<tr align='center'>
				<td>나이 </td>
				<td><input type="text" name=age value=25></td>
			</tr>
			<tr align='center'>
				<td colspan='2' align='center'><input type="submit" value="전송">
				</td>
			</tr>
		</table>
		
	</form>
</body>