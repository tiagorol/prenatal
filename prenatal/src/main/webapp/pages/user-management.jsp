<%@ 
page 
language="java" 
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
%>

<%@ 
taglib 
prefix="form" 
uri="http://www.springframework.org/tags/form" 
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prenatal</title>
</head>
<body>
	<div>

		<form:form modelAttribute="user" action="/prenatal/user/management/save" method="post">
			<form:label path="username">User Name</form:label><form:input path="username" />
			<form:label path="firstname">First Name</form:label><form:input path="firstname" />
			<form:label path="lastname">Last Name</form:label><form:input path="lastname" />
			<form:label path="password">Password</form:label><form:password  path="password" />
			<button type="submit" id="save">Update User</button>
		</form:form>
	</div>
	
	<div>

		<form:form modelAttribute="user" action="/prenatal/user/management/delete" method="post">
			<form:label path="username">User Name</form:label><form:input path="username" />
			<button type="submit" id="delete">Delete User</button>
		</form:form>
	</div>

</body>
</html>