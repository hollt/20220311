<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1>전호민 : 2022년 3월 14일 서버 프로그램 구현</h1>
	</div>
	<div align="center">
		<a href="memberList.do" class="btn btn-primary">회원리스트</a> 
		<a class="btn btn-primary" href="memberInsertForm.do">회원가입</a>
		<c:if test="${empty sessionId }">
		<a href="memberLoginForm.do" class="btn btn-primary">로그인</a>
		</c:if>
		<c:if test="${not empty sessionId }">
		<a href="memberLogout.do" class="btn btn-primary">로그아웃</a>
		</c:if>
	</div>
</body>
</html>