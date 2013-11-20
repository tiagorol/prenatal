<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prenatal</title>
</head>
<body>
	<div>
		<form:form modelAttribute="gestante"
			action="/prenatal/gestante/salvar" method="post">
			<table>
				<tr>
					<td><form:label path="nome"> Nome : </form:label></td>
					<td><form:input path="nome" /></td>
				</tr>
				<tr>
					<td><form:label path="cpf"> CPF  : </form:label></td>
					<td><form:input path="cpf" /></td>
				</tr>
				<tr>
					<td><form:label path="rg"> RG : </form:label></td>
					<td><form:input path="rg" /></td>
				</tr>
				<tr>
					<td><form:label path="dataNascimento"> Data Nascimento : </form:label></td>
					<td><form:input path="dataNascimento" /></td>
				</tr>

				<tr>
					<td><form:label path="EstadoCivil"> Estado Civil : </form:label></td>
					<td><form:select path="EstadoCivil">
							<form:options items="${listaEstadoCivil}" />

						</form:select>
				</tr>
				<tr>			
					<td><form:label path="escolaridade"> Escolaridade : </form:label></td>
					<td><form:select path="escolaridade">
							<form:options items="${listaGrauEscolaridade}" />

						</form:select>
				</tr>	
				
				<tr>
				<tr>
					<td><form:label path="logradouro"> Logradouro : </form:label></td>
					<td><form:input path="logradouro" /></td>
				</tr>
				<tr>
					<td><form:label path="bairro"> Bairro : </form:label></td>
					<td><form:input path="bairro" /></td>
				</tr>

				<tr>
					<td><form:label path="cidade.id"> Cidade : </form:label></td>
					<td><form:select path="cidade.id">
							<form:options items="${listaCidade}" itemLabel="nome"
								itemValue="id" />

						</form:select>
				</tr>

				<tr>
					<td><form:label path="estado.id"> Estado : </form:label></td>

					<td><form:select path="estado.id">
							<form:options items="${listaEstado}" itemLabel="nome"
								itemValue="id" />

						</form:select></td>
				</tr>

				<tr>
					<td><form:label path="profissao"> Profissão : </form:label></td>
					<td><form:input path="profissao" /></td>
				</tr>
				<tr>
					<td><form:label path="usuario.email"> E-mail : </form:label></td>
					<td><form:input path="usuario.email" /></td>
				</tr>
				<tr>
					<td><form:label path="usuario.senha"> Senha : </form:label></td>
					<td><form:password path="usuario.senha" /></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit" id="salvar">
							Salvar</button></td>
				</tr>				
			</table>
		</form:form>
	</div>

</body>
</html>