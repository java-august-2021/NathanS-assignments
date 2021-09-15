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
<title>All Products</title>
</head>
<body>
	<div class="container" id="wrapper">
		<div class="container" id="prod-table">
			<h1>Look at all these Products!</h1>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Product Name</th>
						<th>Product Description</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${ products }" var="p">
					<tr>
						<td><a href="/products/${p.id}">${ p.name }</a></td>
						<td>${ p.description }</td>
						<td>$${ p.price }</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="container" id="prod-form">
		<h1>Add a product!</h1>
	<form:form action="/products/create" method="POST" modelAttribute="product">
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	
	<form:label path="description">Description</form:label>
	<form:errors path="description"/>
	<form:input path="description"/>
	
	<form:label path="price">Price</form:label>
	<form:errors path="price"/>
	<form:input path="price"/>
	
	<input type="submit" value="Submit"/>
</form:form>
		</div>
	</div>
</body>
</html>