<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Survey Results!</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
    <script type="text/javascript" src="js/app.js"></script>
    
    <script src="/webjars/jquery/jquery.min.js"></script> 
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" id="wrapper">
		<div class="contaier border border-dark border-5" id="survey-results">
			<h2 class="text-decoration-underline" id="results-title">Submitted Info!</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Name:</th>
						<th>Dojo Location:</th>
						<th>Favorite Language:</th>
						<th>Comment:</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th><c:out value="${name}"/></th>
						<th><c:out value="${location}"/></th>
						<th><c:out value="${language}"/></th>
						<th><c:out value="${comment}"/></th>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>