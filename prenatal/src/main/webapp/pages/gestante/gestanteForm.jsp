<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prenatal</title>
</head>
<body>
	<div>

		<form:form modelAttribute="gestante" action="/prenatal/gestante/salvar" method="post">
			<form:label path="nome"> Nome : </form:label><form:input path="nome" />
			<button type="submit" id="salvar"> Salvar </button>
		</form:form>
	</div>
	
</body>
</html>