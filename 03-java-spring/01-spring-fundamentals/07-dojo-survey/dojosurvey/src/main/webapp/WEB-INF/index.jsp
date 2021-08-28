<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey!</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
    <script type="text/javascript" src="js/app.js"></script>
    
    <script src="/webjars/jquery/jquery.min.js"></script> 
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" id="wrapper">
		<div class="container border border-dark border-5" id="survey">
			<h1 id="survey-title">Dojo Survey!</h1>
			<form class="form-group" method="POST" action="/survey">
			
				<div class="row mb-3">
					<label for="name" class="col-sm-2 col-form-label">Your Name:</label>
					<div class="col-sm-10">
						<input type="text" name="name" class="form-control">
					</div>
				</div>
				
				<div class="row mb-3">
					<label for="location" class="col-sm-2 col-form-label">Dojo Location:</label>
					<div class="col-sm-10">
						<input type="text" name="location" class="form-control">
					</div>
				</div>
				
				<div class="row mb-3">
					<label for="language" class="col-sm-2 col-form-label">Favorite Language:</label>
					<div class="col-sm-10">
						<select class="form-select" name="language">
							<option value="Python">Python</option>
							<option value="Java">Java</option>
							<option value="Ruby">Ruby</option>
						</select>
					</div>
				</div>
				<div class="row mb-3">
					<label for="comment" class="col-sm-2 col-form-label">Comment (optional):</label>
					<div class="col-sm-10">
						<textarea class="form-control" name="comment"></textarea>
					</div>
				</div>
				
				
				<div class="container" id="survey-button">
					<input type="submit" value="Submit" class="btn btn-primary">
				</div>
				
			</form>
		</div>
	</div>
</body>
</html>