<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of teams</title>
</head>
<body>
<h1>Lista de Pendencias</h1>

<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="50%">Conteúdo</th>
<th width="20%">Links</th>
<th width="10%">Ações</th>

</tr>
</thead>
<tbody>
	<c:forEach var="pendencias" items="${listaPendencias}">
		<tr>
			<td>${pendencias.titulo}</td>
			<td>${pendencias.semana}</td>
			<td><a href="/prenatal/pendencias/remover/${pendencias.id}">Remover</a></td>			
		</tr>
	</c:forEach>	
</tbody>
</table>

<p><a href="/prenatal/pendencias/prepararInserir">Novo</a></p>

<p><a href="/prenatal/pages/index.jsp">Home page</a></p>

</body>
</html>