<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>用户管理</title>
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
.STYLE12 {
	font-family: "新宋体";
	font-size: 14px;
	font-weight: bold;
}
.STYLE9 {font-size: 12px}
.STYLE13 {font-size: 12px}
.STYLE15 {font-family: "新宋体"; font-size: 12px; }
	-->
	</style>
	<body>
		<html:form action="/userManage">
		<div align="center">
			<p><img src="../iron/image/1.jpg"/></p>
		</div>
	
		<table width="1024" align="center">
			<tr>
				<td align="left"><span class="STYLE12">用户管理</span></td>
				<td align="right">
					<html:submit property="add">添&nbsp&nbsp&nbsp&nbsp加</html:submit>
					<html:submit property="modify">修&nbsp&nbsp&nbsp&nbsp改</html:submit>
					<html:submit property="del">删&nbsp&nbsp&nbsp&nbsp除</html:submit>
					<html:submit property="back">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
				</td>
			</tr>
		</table>
		<p></p>
		<hr width="1024" />
		<table width="800" align="center" border=1 style="BORDER-COLLAPSE: collapse">
				<tr>
					<th bgcolor="#99CC99"></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE13">用户名</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE13">用户权限</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE13">电话</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE13">电子邮件</span></th>
			  	</tr>
				<logic:notEmpty name="USERLIST">
					<logic:iterate id="userManageFormBean" name="USERLIST">
				<tr>
					<td align="center">
						<html:multibox property="indexCheckbox">
							<logic:empty name="userManageFormBean" property="userID"></logic:empty>
							<bean:write name="userManageFormBean" property="userID" />
						</html:multibox>					
					</span></td>
					<td align="center">
					  <span class="STYLE15">
					  <bean:write name="userManageFormBean" property="userID" ></bean:write>
					  </span> </td>
					<td align="center">
					  <span class="STYLE15">
					  <bean:write name="userManageFormBean" property="authority" ></bean:write>
					  </span> </td>
					<td align="right">
					  <span class="STYLE15">
					  <bean:write name="userManageFormBean" property="tel" ></bean:write>
					  </span> </td>
					<td align="right">
					  <span class="STYLE15">
					  <bean:write name="userManageFormBean" property="email" ></bean:write>
					  </span> </td>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
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

