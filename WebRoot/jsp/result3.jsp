<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html> 
	<head>
		<title>生产数据统计表-除锰</title>
	    <style type="text/css">
<!--
.STYLE14 {
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
		.STYLE9 {font-size: 12px}
		.STYLE10 {font-family: "宋体"}
		.STYLE13 {font-family: Arial, Helvetica, sans-serif; font-size: 12px; }
	-->
	</style>
	<body>
		<html:form action="/result3">
			<div align="center">
			    <p><img src="../iron/image/1.jpg"/></p>
			    
		  </div>
		  <table width="1024" align="center">
				<tr>
					<td align="left"><span class="STYLE14">生产数据统计表（等级：除锰）</span></td>
					<td align="right">
						<html:submit property="exportResult3">导出Excel</html:submit>
						<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
					</td>
				</tr>
			</table>
			<p></p>
			<hr width="1024" />
			<table align="center" border=1 style="BORDER-COLLAPSE: collapse">
				<tr>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">期号</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Fe</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Cl</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">N</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">O</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">HB</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总毛重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总炉次数</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">均毛重kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">Mg单耗</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">TiCl4单耗</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">成品率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">总净重量kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">均净重kg</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0A级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0A级率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0级率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">0级以上率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">1级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">1级率</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">2级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">3级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">4级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">5级</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">2级及以下</span></th>
					<th bgcolor="#99CC99"><span class="STYLE10 STYLE9">2级及以下率</span></th>
				</tr>
				<logic:notEmpty name="CHUMENGLIST">
					<logic:iterate id="result3FormBean" name="CHUMENGLIST">
				<tr>
					<td align="center"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="qihao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="fe" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="cl" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="n" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="o" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="hb" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="zongmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="zonglushu" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="junmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="junmgdanhao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="ticl4danhao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="junhuishoulv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="zongjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="junjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j0Aji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j0Ajilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j0ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j0jilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j0jiyishanglv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j1ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j1jilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j2ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j3ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j4ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j5ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j2jijiyixia" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE13">
					  <bean:write name="result3FormBean" property="j2jijiyixialv" ></bean:write>
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
			<br><br><br><br><br><br><br><br><br><br><br><br>
			<hr width="1024" />
			<table align="center">
				<tr>
					<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>

