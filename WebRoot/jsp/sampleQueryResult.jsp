<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>JSP for SampleQueryResultForm form</title>
	</head>
	<body>	
		<logic:iterate id="itemKey01" name="personList" >
			<tr>
				<td><bean:write name="itemKey01" property="id" /></td>
				<td><bean:write name="itemKey01" property="lastName" /></td>
				<td><bean:write name="itemKey01" property="firstName" /></td>
				<td><bean:write name="itemKey01" property="fullName" /></td>
				<td><bean:write name="itemKey01" property="phoneNumber" /></td>
				<td><bean:write name="itemKey01" property="school" /></td><br/>
			</tr>
		</logic:iterate>
	</body>
</html>

