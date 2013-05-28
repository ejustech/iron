<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>金达钛业生产数据统计系统</title>
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
</style></head>

<body>
<html:form action="/login" >
  <div align="center">
    <p><img src="<%=request.getContextPath() %>/image/1.jpg"/></p>
  </div>
<hr width="1200" />
<table height="375" align="center" border="0">
	<tr>
		<td valign="top">
			<table width="" border="0" bordercolor="#999999">
				<tr>
					<td>用户名:</td>
					<td><html:text property="userID"/><html:errors property="userID"/></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;码:</td>
					<td><input type="password" name="userPassword" maxlength="8"></td>
				<tr>
			</table>
			<table align="center">
				<tr>
					<td>
					  <label>
					  <html:submit value="登   录"/>
					  </label>
					  <label>
					  <html:cancel value="取   消"/>
					  </label>
					</td>
				<tr>
			</table>
		</td>
	</tr>
</table>
<hr width="1200" />
<table align="center">
	<tr>
		<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
	<tr>
</table>
</body>
</html:form>
