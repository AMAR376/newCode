<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to sale order page</h2>

	<form:form action="insert" method="post" modelAttribute="saleorder">

		<form:input path="oCode" />
		<form: select path="sMode">
			<option value="A">AMAR</option>
			<option value="B">AM</option>
		</form:>
		
		<form:select path="sCust">
			<option value="X">X</option>
			<option value="Y">Y</option>
		</form:select>
		
		<form:input path="refNo" />
		
		<form:checkbox path="stockMode" value="A" />
		<form:checkbox path="stockMode" value="B" />
		
		<form:select path="stockSource">

			<option value="A">A</option>
			<option value="B">B</option>
		</form:select>
		<form:textarea path="sdesc" />
	<input type="submit" value ="register">
	</form:form>








</body>
</html>