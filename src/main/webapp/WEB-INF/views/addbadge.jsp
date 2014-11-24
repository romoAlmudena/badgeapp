<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title><fmt:message key="title" /></title>
<style>
.error {
	color: red;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Product</title>
</head>
<body>

	<h1>New Product!</h1>

	<form:form  modelAttribute="newBadge" >
	

		<label>Nombre producto: </label>
		<form:input id ="description" path="description" required/> 
		<br/>
		<label>Precio: </label>
		<form:input id ="price" path="price" /> 

		<br>
		<input type="submit" value="Add">

	</form:form>

</body>
</html>
<a href="<c:url value="badgelist.htm"/>">Home</a>
</body>
</html>