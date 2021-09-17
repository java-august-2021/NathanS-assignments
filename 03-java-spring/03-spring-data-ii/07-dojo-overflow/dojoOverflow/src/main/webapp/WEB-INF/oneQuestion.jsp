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
	<h2><c:out value="${question.body}"/></h2>
<h2>Tags:</h2>
<c:forEach items="${question.tags}" var="tag">
<c:out value="${tag.subject}"></c:out>
</c:forEach>
<h2>Answers:</h2>
<c:forEach items="${question.answers}" var="answer">
<c:out value="${answer.body}"></c:out>
</c:forEach>
<br>

<h1>Add Answer</h1>

 <form:form action="/question/${question.id}/answer" method = "POST" modelAttribute="answer">
 
 	<form:label path = "body"></form:label>
 	<form:errors path="body"/>
 	<form:textarea path="body" rows="5" cols="40"/>
 	<form:hidden path = "question" value = "${question.id}"/>
	<input type="submit" value="Submit"/>
	
</form:form>
</body>
</html>