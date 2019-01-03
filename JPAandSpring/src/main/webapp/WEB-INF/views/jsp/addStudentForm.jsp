<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<script type="text/javascript" src="/JPAandSpring/resources/js/jQuery/3.3.1/jquery.min.js"></script>
		<script type="text/javascript" src="/JPAandSpring/resources/js/addStudentForm.js"></script>
	</head>

	<body>
		<h2 id="message"></h2>
		
		<form:form id="studentAddForm" method="GET" commandName="student">
			<label for="name">
				<spring:message code="student.name"></spring:message>
			</label>
			<form:input path="name"/>
				
			<label for="age">
				<spring:message code="student.age"></spring:message>
			</label>
			<form:input path="age"/>
			
			<form:button id="addStudent">Add Student</form:button>
		</form:form>
		
	</body>
</html>