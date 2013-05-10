<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

 
<html> 
	<head>
		<title>用户维护</title>
		<link href="../iron/css/style.css" rel="stylesheet" type="text/css">
	    <style type="text/css">
<!--
.STYLE10 {font-family: "宋体"}
-->
        </style>
</head>
	<style type="text/css">
	<!--
		body {
			background-color: #C9D3DA;
		}
		.STYLE9 {font-size: 12px}
.STYLE11 {font-size: 14px}
.STYLE12 {
	font-family: "新宋体";
	font-size: 14px;
	font-weight: bold;
}
.STYLE1 {
	font-family: "宋体";
	font-size: 14px;
	font-weight: bold;
	color: #FF0000;
}
	-->
	</style>
	<body>
		<html:form action="/userAdd">
		<div align="center">
			<p><img src="../iron/image/1.jpg"/></p>
		</div>
		<table width="1024" align="center">
			<tr>
				<td align="left"><span class="STYLE12">用户维护</span></td>
				<td align="right">
					<html:submit property="update">更&nbsp&nbsp&nbsp&nbsp新</html:submit>
					<html:reset property="reset">重&nbsp&nbsp&nbsp&nbsp置</html:reset>
					<html:submit property="back">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
				</td>
				<tr><td align="left"><html:errors property="errors"></html:errors></td><td align="left"></td></tr>
			</tr>
		</table>
		
		<p></p>
		<hr width="1024" />
		<table align="center" border=1 style="BORDER-COLLAPSE: collapse">
			<tr>
				<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">用户名:</span></td>
				<td><span class="STYLE10 STYLE11">
				<input type="text" name="userID" maxlength="10" value="<bean:write name="USERID" scope="session"/>">
				  </span></td>
				  
			</tr>
			<tr>
				<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">权限:</span></td>
				<td><html:select property="authority">
					   <html:option value="0">管理员</html:option>
					   <html:option value="1">普通用户1</html:option>
					   <html:option value="2">普通用户2</html:option>
					</html:select>
				</td>
			</tr>
			<tr>
				<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">密码:</span></td>
				<td><span class="STYLE10 STYLE11">
				<input type="password" name="password" maxlength="8">
				  </span></td>
			</tr>
			<tr>
				<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">确认密码:</span></td>
				<td><span class="STYLE10 STYLE11">
				<input type="password" name="passwordv" maxlength="8"><span class="STYLE1">
				  </span></span></td>
			</tr>	
			<tr>
				<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">电话:</span></td>
				<td><span class="STYLE10 STYLE11">
				<input type="text" name="tel" maxlength="12" value="<bean:write name="TEL" scope="session"/>">
				  </span></td>
			</tr>
			<tr>
				<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">电子邮箱:</span></td>
				<td><span class="STYLE10 STYLE11">
				<input type="text" name="email" maxlength="20" value="<bean:write name="EMAIL" scope="session"/>">
				  </span></td>
			</tr>			
		</table>
				
		<hr width="1024" />
		<table align="center">
			<tr>
				<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
			</tr>
		</table>	
		</html:form>
	</body>
</html>

