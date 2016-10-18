<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<header>
		</header>
		<br/>
		<main>
			<form:form action="processForm" modelAttribute="student">
			
				First name: <form:input path="firstName" />
				<br/><br/>
				Last name: <form:input path="lastName" />
				<br/><br/>
				Country : 
				<form:select path="country">
				
					<form:options items="${student.countryOptions}"/>
					
				</form:select>
				<br/><br/>
				Favorite programming language:
				<br/>
				<form:radiobuttons path="favoriteLanguage"
				items="${student.favoriteLanguageOptions}"/>
				
				<br/><br/>
				What Operating system do you have experience?
				<br/>
				
				<form:checkboxes items="${student.favoriteOSOptions}" path="favoriteOS"/>
				
				<br/><br/>
				<button type="submit">Go</button>
				<button type="reset">Reset</button>
				
			</form:form >
		</main>
			<br/>
		<footer>
		
		</footer>
		
	</div>
</body>
</html>