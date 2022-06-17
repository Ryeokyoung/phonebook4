<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연락처</title>
</head>
<body>
	<h1>전화번호부</h1>
	<p>입력한 정보의 내역입니다.</p>

	<c:forEach items="${personList}" var="personVo">
		<table border="1">
			<tr>
				<td>이름(name)</td>
				<td>${personVo.name }</td>
			</tr>
			<tr>
				<td>휴대전화(hp)</td>
				<td>${personVo.hp }</td>
			</tr>
			<tr>
				<td>회사번호(company)</td>
				<td>${personVo.company }</td>
			</tr>
			<tr>
				<td><a href="./updateForm?personId=${p.personId }">[수정1]</a></td>
				<td><a href="./updateForm?personId=${p.personId }">[수정2]</a></td>
				<td><a href="./delete/${p.personId }">[삭제]</a></td>
			</tr>
		</table>
		<br>
	</c:forEach>

	<a href="./writeForm">번호 등록</a>
</body>
</html>