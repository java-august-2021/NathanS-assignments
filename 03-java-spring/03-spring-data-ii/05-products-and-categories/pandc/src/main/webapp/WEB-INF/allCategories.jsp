<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Categories</title>
</head>
<body>
	<h1><c:out value="${category.name}"/></h1>

<h2>Add a product to this category:</h2>

<form:form action="/categories/${category.id}/addproduct">

<select name="prodId">
	<c:forEach items="${unaffiliatedProducts}" var="product">
		<option value="${product.id}"><c:out value="${product.name}"/></option>
	</c:forEach>
	</select>
	<input type="submit" value="Submit"/>
</form:form>

<h3>Products:</h3>

<c:forEach items="${affiliatedProducts}" var="product">
		<option value="${product.id}"><c:out value="${product.name}"/></option>
	</c:forEach>
</body>
</html>