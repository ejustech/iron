<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
	<head>
		<title>等外钛统计表</title>
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
	<body>
		<html:form action="/result4">
			<div align="center">
			    <p><img src="../iron/image/1.jpg"/></p>
			    
		  </div>
		   <table width="1024" align="center">
				<tr>
					<td align="left">					
					<span class="STYLE13">
					等外钛统计表
					<logic:notEmpty name="RIQI">
						<bean:write name="RIQI" scope="session"></bean:write>
					</logic:notEmpty>
					</span>
					</td>
					<td align="right">
						<html:submit property="exportResult4">导出Excel</html:submit>
						<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
					</td>
				</tr>
			</table>
			<p></p>
			<hr width="1024" />
			<table align="center" border=1 style="BORDER-COLLAPSE: collapse">
				<tr>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">期号</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总炉次数</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">均毛重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">均净重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">成品率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">底皮kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">上帽kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">爬壁kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废底皮kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废底皮比例</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废上帽kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废上帽比例</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废爬壁kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废爬壁比例</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废钛粉kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">磁选kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">手选废料kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">损耗kg</span></th>
				</tr>
				<logic:notEmpty name="WAITAILIST">
					<logic:iterate id="result4FormBean" name="WAITAILIST">
				<tr>
					<td align="center"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="qihao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="zonglushu" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="junmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="junjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="junhuishoulv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="dipi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="shangmao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="pabi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="feidipi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="feidipibili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="feishangmao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="feishangmaobili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="feipabi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="feipabibili" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="shaixuanfeiliao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="cixuanfeiliao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="shouxuanfeiliao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result4FormBean" property="sunhao" ></bean:write>
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
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			<hr width="1024" />
			<table align="center">
				<tr>
					<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>

