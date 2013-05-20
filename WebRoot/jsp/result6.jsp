<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
	<head>
		<title>单炉生产数据统计表</title>
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
		<html:form action="/result6">
			<div align="center">
			    <p><img src="../jinda/image/1.jpg"/></p>
		  </div>
		  <table width="1024" align="center">
				<tr>
					<td align="left">					
					<span class="STYLE13">
					单炉生产数据统计表
					<logic:notEmpty name="RIQI">
						<bean:write name="RIQI" scope="session"></bean:write>
					</logic:notEmpty>
					</span>
					</td>
					<td align="right">
						<html:submit property="exportResult6">导出Excel</html:submit>
						<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
					</td>
				</tr>
			</table>
			<p></p>
			<hr width="1024" />
			<table align="center" border=1 style="BORDER-COLLAPSE: collapse">
				<tr>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">生产炉号</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总炉次数</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总毛重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总净重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">成品率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Mg单耗</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Cl</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">N</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">O</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0A级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">1级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">2级及以下</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0A级率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0级率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">1级率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">2级及以下率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">底皮kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">上帽kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">爬壁kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废底皮kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废上帽kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废爬壁kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">废钛粉kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">磁选废料kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">手选废料kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">损耗kg</span></th>
				</tr>
				<logic:notEmpty name="DANLULIST">
					<logic:iterate id="result6FormBean" name="DANLULIST">
				<tr>
					<td align="center"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="shengchanluhao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="zonglucishu" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="zongmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="zongjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="chengpinlv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="mgdanhao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="fe" ></bean:write>
					</span></td>	
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="cl" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="n" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="o" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j0Aji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j0ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j1ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j2jijiyixia" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j0Ajilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j0jilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j1jilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="j2jijiyixialv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="dipi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="shangmao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="pabi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="feidipi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="feishangmao" ></bean:write>
					</span></td>	
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="feipabi" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="feitaifen" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="cixuanfeiliao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="shouxuanfeiliao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE12">
					  <bean:write name="result6FormBean" property="sunhao" ></bean:write>
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
			<br>
			<hr width="1024" />
			<table align="center">
				<tr>
					<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>