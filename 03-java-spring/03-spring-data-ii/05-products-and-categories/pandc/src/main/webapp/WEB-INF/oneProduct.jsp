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
<title>One Product</title>
</head>
<body>
	<div class="container">
		<div class="container" id="prod-info">
			<h1><c:out value="${ product.name }"/></h1>
			<h2>Categories</h2>
			<ul>
			<c:forEach items="${ affilatedCategories }" var="c">
				<li value="${ c.id }">${ c.name }</li>
			</c:forEach>
			</ul>
		</div>
		<div class="container" id="cat-form">
		
<form:form action="/products/${product.id}/addcategory" method="POST" modelAttribute="category">

<select class="form-select" name="catId">
	<c:forEach items="${ categories }" var="category">
		<option value="${ category.id }"><c:out value="${ category.name }"/></option>
	</c:forEach>
	</select>
	<input class="btn btn-success" type="submit" value="Submit"/>
</form:form>
		</div>
		<a href="/categories/new" class="btn btn-lg btn-primary">New Category</a>
	</div>
</body>
</html>