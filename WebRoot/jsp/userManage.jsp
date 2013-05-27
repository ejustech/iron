<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>用户管理</title>
		<link href="../jinda/css/style.css" rel="stylesheet" type="text/css">
	    <style type="text/css">  
<!--
.STYLE1 {
	font-family: "宋体";
	font-size: 14px;
	font-weight: bold;
	color: #FF0000;
}
-->
        </style>
</head>
	<body>
		<html:form action="/userManage">
		<div align="center">
			<p><img src="../jinda/image/1.jpg"/></p>
		</div>
	
		<table width="1024" align="center">
			<tr>
				<td align="left" class="STYLEMenu">用户管理</td>
				<td align="right">
					<html:submit property="add">添&nbsp&nbsp&nbsp&nbsp加</html:submit>
					<html:submit property="modify">修&nbsp&nbsp&nbsp&nbsp改</html:submit>
					<html:submit property="del">删&nbsp&nbsp&nbsp&nbsp除</html:submit>
					<html:submit property="back">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
				</td>
			</tr>
			<tr><td align="left"><html:errors property="errors"></html:errors></td><td align="left"></td></tr>
		</table>
		<p></p>
		<hr width="1024" />

		<table align="center" border=1 style="BORDER-COLLAPSE: collapse"  width="800" >
				<tr bgcolor="#99CC99">
					<th>删除</th>
					<th>No.</th>
					<th>用户名</th>
					<th>用户权限</th>
					<th>电话</th>
					<th>电子邮件</th>
					<th>修改</th>
			  	</tr>
				<logic:notEmpty name="USERLIST">
					<logic:iterate id="userManageFormBean" name="USERLIST">
				<tr class="STYLEListContent">
					<td align="center">
						<html:multibox property="indexCheckbox">
							<bean:write name="userManageFormBean" property="userID" />
						</html:multibox>			
					</td>
					<td align="center">
					  <bean:write name="userManageFormBean" property="index" ></bean:write>
					</td>
					<td align="center">					  
					  <bean:write name="userManageFormBean" property="userID" ></bean:write>
					</td>
					<td align="center">					
					  <bean:write name="userManageFormBean" property="authority" ></bean:write>
					</td>
					<td align="right">
					  <bean:write name="userManageFormBean" property="tel" ></bean:write>
					</td>
					<td align="right">
						<bean:write name="userManageFormBean" property="email" ></bean:write>
					</td>
					<td align="center">						
						<html:radio idName="userManageFormBean" property="indexModify" value="userID"/>
					</td>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
		  </table>
		<hr width="1024" />
		<table align="center">
			<tr>
				<td class="STYLECopyright">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</td>
			</tr>
		</table>	
		</html:form>
	</body>
</html>
<script>  
    document.all("indexModify")[0].checked=true;
</script>  

