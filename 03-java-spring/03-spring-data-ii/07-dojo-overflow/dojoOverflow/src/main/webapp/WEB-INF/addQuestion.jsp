<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet">
<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Dojo Overflow</title>
</head>
<body>
 <h1>What is your question?</h1>
 
 <form:form action="/question/create" method = "POST" modelAttribute="question">
 	<form:label path = "body"></form:label>
 	<form:errors path="body"/>
 	<form:textarea path="body" rows="5" cols="40"/>
 	<br>
 	<form:label path="tagQuery">Tags: (must be comma separated)</form:label>
	<form:errors path="tagQuery"/>
	<form:input path="tagQuery"/>
	
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>