<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1 align="center">
		<fmt:message key="heading" />
	</h1>

	<h3>Operational Menu </h3>
	<!-- model es el contrator entre model&view -->
	<table width="80%" border="1" cellspacing="0" cellpadding="0" align="center">

		
		<tr align="center"><td colspan=2> Badge Actions</td></tr>
		<tr align="center">
			<td> <a href="<c:url value='badgelist.htm'/>"> Badge List </a></td>
			<td> <a href="<c:url value='addbadge.htm'/>"> Add Badge </a></td>
		</tr>
		
		<tr align="center"><td colspan=2> Issuer Actions</td></tr>
		<tr align="center">
			<td> <a href="<c:url value='issuerlist.htm'/>"> Issuer List </a></td>
			<td> <a href="<c:url value='addissuer.htm'/>"> Add Issuer </a></td>
		</tr>
		
		<tr align="center"><td colspan=2> System Actions</td></tr>
		<tr align="center">
			<td> <a href="<c:url value='systemlist.htm'/>"> Systems List </a></td>
			<td> <a href="<c:url value='addsystem.htm'/>"> Add System </a></td>
		</tr>
		
		<tr align="center"><td colspan=2> Program Actions</td></tr>
		<tr align="center">
			<td> <a href="<c:url value='programlist.htm'/>"> Programs List </a></td>
			<td> <a href="<c:url value='addprogram.htm'/>"> Add Program </a></td>
		</tr>
		
	</table>
	
	<br><br>
	
	<label>Category List:</label> 
	<select>    
		<c:forEach items="${model.categories}" var="category">
	       <option value="${category.label}" selected="selected">${category.label}</option>
 		</c:forEach>
	</select>

</body>
</html>
