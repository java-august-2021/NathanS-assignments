<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Code!</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
    <script type="text/javascript" src="js/app.js"></script>
    
    <script src="/webjars/jquery/jquery.min.js"></script> 
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" id="wrapper">
		<h2 id="error"><c:out value="${errors}"/></h2>
		<h1>What is the Code?</h1>
		<form method="POST" action="/check">
			<div class="form-group">
				<input type="password" name="code">
				<input type="submit" class="btn btn-primary">
			</div>
		</form>
	</div>
</body>
</html>