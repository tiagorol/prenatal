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
		<form:form modelAttribute="pendencias"
			action="/prenatal/pendencias/salvar" method="post">

			<form:label path="semana"> Semana : </form:label>
			<form:input path="semana" />
			<form:errors path="semana" cssStyle="color:red" />
			
			<form:label path="titulo"> titulo  : </form:label>
			<form:input path="titulo" />
			<form:errors path="titulo" cssStyle="color:red" />
						
			<button type="submit" id="salvar">Salvar</button>

		</form:form>
	</div>

</body>
</html>