<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of teams</title>
</head>
<body>
<h1>Lista de Informa��o Tempo de Vida</h1>

<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="50%">Conte�do</th>
<th width="20%">Quantidade Semana</th>
<th width="10%">A��es</th>

</tr>
</thead>
<tbody>
	<c:forEach var="informacaoTempoVida" items="${listaInformacaoTempoVida}">
		<tr>
			<td>${informacaoTempoVida.conteudo}</td>
			<td>${informacaoTempoVida.quantidadeSemanas}</td>
			<td>
			<a href="/prenatal/informacaoTempoVida/remover/${informacaoTempoVida.id}">Remover</a>
			<a href="/prenatal/informacaoTempoVida/prepararEditar/${informacaoTempoVida.id}">Editar</a>
			</td>
		</tr>
	</c:forEach>	
</tbody>
</table>

<p><a href="/prenatal/informacaoTempoVida/prepararInserir">Novo</a></p>

<p><a href="/prenatal/pages/index.jsp">Home page</a></p>

</body>
</html>