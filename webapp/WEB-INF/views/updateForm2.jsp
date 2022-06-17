<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<h1>전화번호부</h1>
	<h2>연락처 수정폼</h2>
	<p>수정화면입니다</p>
	<form action="./update" method="get">
		이름(name)<input type="text" name="name" value="${requestScope.pMap.NAME }">
		핸드폰(hp)<input type="text" name="hp" value="${pMap.HP }">
		회사(company)<input type="text" name="company" value="${pMap.COMPANY }">
		pk(personId)<input type="text" name="personId" value="${pMap.PERSONID }">
		
		<button type="submit">수정</button>
	</form>
	
</body>
</html>