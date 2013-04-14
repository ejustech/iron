<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<html:form action="/login">
			userID : <html:text property="userID"/><html:errors property="userID"/><br/>
			userPassword : <html:text property="userPassword"/><html:errors property="userPassword"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

