<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prenatal</title>

<style type="text/css">
label {
	display:block;
	width: 120px;
	float: left;
	clear: left;
}
input,select {
	display: block;
	width: 200px;
	float: left;
	clear: right;
}
button{
	display: block;
	clear: both;
	position: relative;
	width: 100px;
	left: 224px;
}

</style>

</head>
<body>
	<div>
		<form:form modelAttribute="informacaoTempoVida"
			action="/prenatal/informacaoTempoVida/salvar" method="post">

			<form:label path="quantidadeSemanas"> Quantidade de Semanas : </form:label>
			<form:input path="quantidadeSemanas" />
			<form:errors path="quantidadeSemanas" cssStyle="color:red" />
			
			<form:label path="conteudo"> Conteudo  : </form:label>
			<form:input path="conteudo" />
			<form:errors path="conteudo" cssStyle="color:red" />
						
			<button type="submit" id="salvar">Salvar</button>

		</form:form>
	</div>

</body>
</html>