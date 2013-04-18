<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for SampleQueryForm form</title>
	</head>
	<body>
		<html:form action="/sampleQuery">
			id : <html:text property="id"/><html:errors property="id"/><br/>
			lastName : <html:text property="lastName"/><html:errors property="lastName"/><br/>
			fullName : <html:text property="fullName"/><html:errors property="fullName"/><br/>
			firstName : <html:text property="firstName"/><html:errors property="firstName"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

