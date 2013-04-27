<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
	<head>
		<title>月指标统计表</title>
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
		<html:form action="/result5">
			<div align="center">
			    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
			    <p class="STYLE1">金达钛业生产数据统计系统</p>
			  </div>
			<hr width="1200" />
			<table>
				<tr>
					<td>月指标统计表</td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<th>期号</th>
					<th>总毛重量kg</th>
					<th>总净重量kg</th>
					<th>2级及以下率</th>
					<th>Fe>0.08</th>
					<th>Fe>0.05</th>
					<th>Cl>0.08</th>
					<th>Cl>0.06</th>
					<th>O>0.08</th>
					<th>O>0.05</th>
					<th>N>0.01</th>
					<th>Fe>0.08,  Cl>0.08</th>
					<th>Fe>0.08</th>
					<th>Fe>0.05</th>
					<th>Cl>0.08</th>
					<th>Cl>0.06</th>
					<th>O>0.08</th>
					<th>O>0.05</th>
					<th>N>0.01</th>
					<th>Fe>0.08,Cl>0.08</th>
				</tr>
				<logic:notEmpty name="ZHIBIAOLIST">
					<logic:iterate id="result5FormBean" name="ZHIBIAOLIST">
				<tr>
					<td><bean:write name="result5FormBean" property="qihao" ></bean:write>期</td>
					<td><bean:write name="result5FormBean" property="zongmaozhong" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="zongjingzhong" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="j2jijiyixialv" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="fe008" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="fe005" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="cl008" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="cl006" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="o008" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="o005" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="n001" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="fecl008" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="fe008bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="fe005bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="cl008bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="cl006bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="o008bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="o005bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="n001bili" ></bean:write></td>
					<td><bean:write name="result5FormBean" property="fecl008bili" ></bean:write></td>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
			<table>
				<tr>
					<td><input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onclick="javascript:window.history.back();"></td>
				</tr>
			</table>
			<hr width="1200" />
			<table align="center">
				<tr>
					<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>

