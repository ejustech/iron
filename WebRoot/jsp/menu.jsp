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
		.STYLE12 {
	font-family: "新宋体";
	font-size: 14px;
	font-weight: bold;
}
	-->
	</style>
	<body>
		<html:form action="/menu">
			<div align="center">
			    <p><img src="../iron/image/1.jpg"/></p>
			    
			  </div>
			<table width="1024" align="center">
				<tr><td align="left"><span class="STYLE12">功能列表</span></td></tr>
			</table>
			<p></p>
			<hr width="1024" />
			<table align="center">
				<tr>
					<td><html:submit property="inputByNew">信息录入</html:submit></td>
					<td><html:submit property="search">信息查询</html:submit></td>
					<td><html:submit property="userManage">用户管理</html:submit></td>
					<td><html:submit property="logout">注&nbsp&nbsp&nbsp&nbsp销</html:submit></td>
				</tr>
			</table>
		</html:form>
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<hr width="1024" />
		<table align="center">
			<tr>
				<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
			</tr>
		</table>
	</body>
</html>