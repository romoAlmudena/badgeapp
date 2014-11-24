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
<%@ include file="/WEB-INF/views/include.jsp"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>

	<h1>
		<fmt:message key="modifybadge.heading" />
	</h1>
	<h4>Hello Product!</h4>

<%-- 	<form:form  method="post" modelAttribute="modifyProduct" > (ResquestParam)  --%>
		<form:form  method="post"  commandName="modifyBadge" >
	

		<label>Name: </label>
		<form:input path="name"/> 
		<br/>
		<label>Description User: </label>
		<form:input path="consumerDescription" /> 

		<br>
		<input type="submit">

	</form:form>

</body>
</html>
<a href="<c:url value="home.htm"/>">Home</a>
</body>
</html>