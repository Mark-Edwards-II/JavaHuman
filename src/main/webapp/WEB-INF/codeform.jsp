<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>What is the Code???</title>
<style>
	body {
		text-align: center;
	}
	h2 {
		color: red;
	}
	
</style>
</head>
<body>
	<h2 id="error"><c:out value="${error}"/></h2>
	<h1>What is the code?</h1>
	<form action="/validatecode" method="post">
		<p><input id="code" type="text" name="code"></p>
		<p><input id="btn" type="submit" value="Submit"></p>
	</form>
</body>
</html>