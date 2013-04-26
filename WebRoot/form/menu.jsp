<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
	<head>
		<title>功能导航</title>
	</head>
	<style type="text/css">
	<!--
		body {
			background-color: #C9D3DA;
		}
		.STYLE1 {
			font-size: 16px;
			font-weight: bold;
		}
		.STYLE9 {font-size: 12px}
	-->
	</style>
	<body>
		<html:form action="/menu">
			<div align="center">
			    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
			    <p class="STYLE1">金达钛业生产数据统计系统</p>
			  </div>
			<hr width="1200" />
			<table align="center">
				<tr>
					<td><html:submit property="inputByNew">信息录入</html:submit></td>
					<td><html:submit property="search">信息查询</html:submit></td>
					<td><html:submit property="userManage">用户管理</html:submit></td>
					<td><html:submit property="logoff">注&nbsp&nbsp&nbsp&nbsp销</html:submit></td>
				</tr>
			</table>
			
		</html:form>
		<hr width="1200" />
		<table align="center">
			<tr>
				<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
			</tr>
		</table>
	</body>
</html>