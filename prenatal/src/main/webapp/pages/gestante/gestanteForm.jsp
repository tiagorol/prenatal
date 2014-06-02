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
span{

display: block;
float: left;
clear: both;

}


</style>


</head>
<body>
	<div>
		<form:form modelAttribute="gestante"
			action="/prenatal/gestante/salvar" method="post">

			<form:label path="nome"> Nome : </form:label>
			<form:input path="nome" />
			<form:errors path="nome" cssStyle="color:red" />
						
			<form:label path="cpf"> CPF  : </form:label>
			<form:input path="cpf" />
			<form:errors path="cpf" cssStyle="color:red" />
			
			<form:label path="rg"> RG : </form:label>
			<form:input path="rg" />
			<form:errors path="rg" />
			
			<form:label path="dataNascimento"> Data Nascimento : </form:label>
			<form:input path="dataNascimento" />
			<form:errors path="dataNascimento" cssStyle="color:red" />
			
			<form:label path="EstadoCivil"> Estado Civil : </form:label>
			<form:select path="EstadoCivil">
				<form:options items="${listaEstadoCivil}" itemLabel="estadoCivil" />
				<form:errors path="EstadoCivil" cssStyle="color:red"/>
			</form:select>

			<form:label path="escolaridade"> Escolaridade : </form:label>
			<form:select path="escolaridade">
				<form:options items="${listaGrauEscolaridade}"
					itemLabel="grauEscolaridade" />
					<form:errors path="escolaridade" cssStyle="color:red"/>
			</form:select>

			<form:label path="logradouro"> Logradouro : </form:label>
			<form:input path="logradouro" />
			<form:errors path="logradouro" cssStyle="color:red"/>
			
			<form:label path="bairro"> Bairro : </form:label>
			<form:input path="bairro" />
			<form:errors path="bairro" cssStyle="color:red"/>
			
			<form:label path="cidade.id"> Cidade : </form:label>
			<form:select path="cidade.id">
				<form:options items="${listaCidade}" itemLabel="nome" itemValue="id" />
					<form:errors path="cidade.id" cssStyle="color:red"/>	
			</form:select>

			<form:label path="estado.id"> Estado : </form:label>
			<form:select path="estado.id">
				<form:options items="${listaEstado}" itemLabel="nome" itemValue="id" />
					<form:errors path="estado.id" cssStyle="color:red"/>
			</form:select>

			<form:label path="profissao"> Profissão : </form:label>
			<form:input path="profissao" />
			<form:errors path="profissao" cssStyle="color:red"/>
			
			<form:label path="usuario.email"> E-mail : </form:label>
			<form:input path="usuario.email" />
			
			
			<form:label path="usuario.senha"> Senha : </form:label>
			<form:password path="usuario.senha" />
			
			<form:label path="dataUltimaMestruacao"> Data Ultima Mestruação : </form:label>
			<form:input path="dataUltimaMestruacao" />
			<form:errors path="dataUltimaMestruacao" cssStyle="color:red" />
			
			
			<button type="submit" id="salvar">Salvar</button>

		</form:form>
	</div>

</body>
</html>