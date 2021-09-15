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
<title>One Category</title>
</head>
<body>
<div class="container">
	<h1> All Categories </h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${categories}" var="category">
        <tr>
            <td><a href="/categories/${category.id}"><c:out value="${category.name}"/></a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>
<h1>New Category</h1>
	<form:form action="/categories/create" method="POST" modelAttribute="category">
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	
	<input type="submit" value="Submit"/>
</form:form>
	
</body>
</html>