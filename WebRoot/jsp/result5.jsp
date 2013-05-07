<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
	<head>
		<title>月指标统计表</title>
	    <style type="text/css">
<!--
.STYLE13 {
	font-family: "新宋体";
	font-size: 14px;
	font-weight: bold;
}
-->
        </style>
</head>
	<style type="text/css">
	<!--
		body {
			background-color: #C9D3DA;
		}
		.STYLE12 {font-family: Arial, Helvetica, sans-serif; font-size: 12px; }
		.STYLE9 {font-size: 12px}
		.STYLE10 {font-family: "宋体"}
	-->
	</style>
	<body>
		<html:form action="/result5">
			<div align="center">
			    <p><img src="../iron/image/1.jpg"/></p>
			    
		  </div>
		  <table width="1024" align="center">
				<tr>
					<td align="left"><span class="STYLE13">月指标统计表</span></td>
					<td align="right">
						<html:submit property="exportResult5">导出Excel</html:submit>
						<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
					</td>
				</tr>
			</table>
			<p></p>
			<hr width="1024" />
			<table align="center" border=1 style="BORDER-COLLAPSE: collapse">
				<tr>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">期号</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总毛重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总净重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">2级及以下率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe>0.05</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Cl>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Cl>0.06</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">O>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">O>0.05</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">N>0.01</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe>0.08,  Cl>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe>0.05</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Cl>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Cl>0.06</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">O>0.08</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">O>0.05</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">N>0.01</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe>0.08,Cl>0.08</span></th>
				</tr>
				<logic:notEmpty name="ZHIBIAOLIST">
					<logic:iterate id="result5FormBean" name="ZHIBIAOLIST">
				<tr>
					<td align="center"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="qihao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="zongmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="zongjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="j2jijiyixialv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="fe008" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="fe005" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="cl008" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="cl006" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="o008" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="o005" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="n001" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="fecl008" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="fe008bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="fe005bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="cl008bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="cl006bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="o008bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="o005bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="n001bili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result5FormBean" property="fecl008bili" ></bean:write>
					</span></td>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
			<!--
			<table align="center" width="900">
			<tr>
				<td align="right"><input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();"></td>
				</tr>
			</table>
			-->
			<br><br><br><br><br><br><br><br><br><br><br><br><br>
			<hr width="1024" />
			<table align="center">
				<tr>
					<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>

