<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Controlador de Finan�as Pessoais</title>
</head>
<body>
	<br />
	<br />
	<table>
		<tr bgcolor="brown">
			<th>Data</th>
			<th>Fonte / Aplica��o</th>
			<th>Tipo</th>
			<th>Valor</th>
		</tr>
		<c:forEach items="${movimentos}" var="movimento">
			<tr>
				<td></td>
				<td>${movimento.fonte}</td>
				<td>${movimento.tipo}</td>
				<td>${movimento.valor}</td>
			</tr>
		</c:forEach>


	</table>
</body>
</body>
</html>