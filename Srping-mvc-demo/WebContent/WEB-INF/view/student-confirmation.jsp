<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student confirmation</title>
</head>
<body>
	<div>
		<header>
		</header>
		<br>
		<main>
			
			<h4>The student is confirmed:</h4>
			<h4>First name: ${student.firstName}</h4>
			<h4>Last name: ${student.lastName}</h4>
			<h4>Country: ${student.country}</h4>
			<h4>Favorite programming language ${student.favoriteLanguage}</h4>
		</main>
		<br>
		<footer>
		</footer>
	</div>
</body>
</html>