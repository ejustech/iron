<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
	<head>
		<title>功能导航</title>
	</head>
	<body>
		<html:form action="/menu">
			<html:submit property="inputByNew">信息录入</html:submit>
			<html:submit property="search">信息查询</html:submit>
			<html:submit property="userManage">用户管理</html:submit>
			<html:submit property="logoff">注        销</html:submit>
		</html:form>
	</body>
</html>