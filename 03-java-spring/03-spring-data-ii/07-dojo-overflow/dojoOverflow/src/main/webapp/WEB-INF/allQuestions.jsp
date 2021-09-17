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
<title>Dojo Overflow</title>
</head>
<body>
	<div class="container">
		<table>
    <thead>
        <tr>
            <th>Question</th>
            <th>Tags</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${questions}" var="question">
        <tr>
            <td><a href="/question/${question.id}"><c:out value="${question.body}"/></a></td>
        	<td><c:forEach items="${question.tags}" var="tag">
<c:out value="${tag.subject}"></c:out>
</c:forEach></td>
        </tr>
        </c:forEach>
    </tbody>
</table>

<h3><a href="/question/new">Create New Question</a></h3>
	</div>
</body>
</html>