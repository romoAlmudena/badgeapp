<%@page import="org.apache.taglibs.standard.tag.common.xml.IfTag"%>
<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>

	<h3>Systems</h3>
	<!-- model es el contrator entre model&view -->
	<table width="80%" border="1" cellspacing="0" cellpadding="0"
		align="center">
		<tr align="center">
			<td>Name</td>
			<td>Url</td>
			<td colspan=2>Actions</td>
		</tr>
		<c:forEach items="${model.systems}" var="system">

			<tr align="center">
				<td><c:out value="${system.name}" /></td>
				<td><c:out value="${system.url}" /></td>
			
  				<td><a href="<c:url value='modifysystem/${system.slug}.htm'/>">Modify</a></td>
  				<td><a href="<c:url value='deletesystem/${system.slug}.htm'/>">Delete</a></td>
		
			</tr>

		</c:forEach>
	</table>
	<a href="<c:url value="home.htm"/>">Home</a>

</body>
</html>
