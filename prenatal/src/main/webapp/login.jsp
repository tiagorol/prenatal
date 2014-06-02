<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prenatal</title>
<link type="text/css" href="/css/bootstrap-theme.min.css" rel="stylesheet" />
<link type="text/css" href="/css/bootstrap.min.css" rel="stylesheet" />
<link type="text/css" href="/css/estrutura.css" rel="stylesheet" />
</head>
<body>
	<div class="main">

		<div class="Centro">
			<div class="Esquerda">
				<label>Baixe o aplicativo do Pré-Natal.</label> 
 				<img class="Img" src="/imagens/logo.png"> 
			</div>

		<form:form action="/prenatal/login/logar" method="post">
			<table>
				<tr>
					<td>E-mail:</td>	
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="senha" /></td>
				</tr>
				<tr>
					<td></td>
					<td align="right"><button type="submit" >Entrar</button></td>
				</tr>
			</table>
			
		</form:form>
		</div><!-- fecha div centro -->
	</div>
<a href="/prenatal/gestante/prepararInserir">Inscreva-se</a>
</body>
</html>