<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/style.css">
<script type="text/javascript" src="../js/app.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h2>Hello <c:out value="${name}" />!</h2>
	<p> Welcome to SpringBoot!
</body>
</html>