<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<% 
 response.setHeader("Pragma","No-cache"); 
 response.setHeader("Cache-Control","No-cache"); 
 response.setDateHeader("Expires", -1); 
 response.setHeader("Cache-Control", "No-store");
%>
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
        .STYLEBUTTON{height:30px;width:100px;font-size: 15px;}
	-->
	</style>
	<body>
		<html:form action="/menu">
			<div align="center">
			    <p><img src="../jinda/image/1.jpg"/></p>
			    
			  </div>
			<table width="1024" align="center">
				<tr>
					<td align="left"><span class="STYLE12">功能列表</span></td>
					<td align="right"><span class="STYLE12">
					<logic:notEmpty name="USERNAME">
						<bean:write name="USERNAME" scope="session"></bean:write>
						，你好！欢迎登陆金达钛业生产数据统计系统
					</logic:notEmpty>
					</span></td>
				</tr>
			</table>
			<p></p>
			<hr width="1024" />
			<table align="center">
				<tr>
					<td>
						<logic:equal name="AUTHORITY" scope="session" value="2">
							<input type=button value="信息录入" disabled="disabled" class="STYLEBUTTON" >
	    				</logic:equal>
	    				<logic:notEqual name="AUTHORITY" scope="session" value="2">
	       					<html:submit property="inputByNew" styleClass="STYLEBUTTON">信息录入</html:submit>
	    				</logic:notEqual>
					</td>
					<td>
						<logic:equal name="AUTHORITY" scope="session" value="2">
							<input type=button value="信息补全" disabled="disabled" class="STYLEBUTTON" >
	    				</logic:equal>
	    				<logic:notEqual name="AUTHORITY" scope="session" value="2">
	       					<html:submit property="inputByUpdate" styleClass="STYLEBUTTON">信息补全</html:submit>
	    				</logic:notEqual>
					
					</td>
					<td><html:submit property="search" styleClass="STYLEBUTTON">信息查询</html:submit></td>
					<td>
						<logic:equal name="AUTHORITY" scope="session" value="0">
	       					<html:submit property="userManage" styleClass="STYLEBUTTON">用户管理</html:submit>
	    				</logic:equal>
	    				<logic:notEqual name="AUTHORITY" scope="session" value="0">
	       					<input type=button value="用户管理" disabled="disabled" class="STYLEBUTTON" >
	    				</logic:notEqual>
	    			</td>
					<td><html:submit property="logout" styleClass="STYLEBUTTON">注&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp销</html:submit></td>
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