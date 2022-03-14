<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Response.Write("<script>alert('${message}');</script>");
Response.Write("<script>location.href='home.do';</script>");
</body>
</html>