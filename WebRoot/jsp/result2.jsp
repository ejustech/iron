<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html> 
	<head>
		<title>生产数据统计表-含锰</title>
        <style type="text/css">
<!--
.STYLE15 {
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
		.STYLE14 {font-family: Arial, Helvetica, sans-serif; font-size: 12px; }
		.STYLE9 {font-size: 12px}
		.STYLE10 {font-family: "宋体"}
	-->
	</style>
	<body>
		<html:form action="/result2" >
			<div align="center">
			    <p><img src="../jinda/image/1.jpg"/></p>
		  	</div>
		  	<table width="1024" align="center">
				<tr>
					<td align="left">
					<span class="STYLE15">
					生产数据统计表（等级：含锰）
					<logic:notEmpty name="RIQI">
						<bean:write name="RIQI" scope="session"></bean:write>
					</logic:notEmpty>				
					</span>
					</td>
					<td align="right">
						<html:submit property="exportResult2">导出Excel</html:submit>
						<html:submit property="back">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
						<!--  
						<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
						-->
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
				<logic:notEmpty name="HANMENGLIST">
					<logic:iterate id="result2FormBean" name="HANMENGLIST">
				<tr>
					<td align="center"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="qihao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="fe" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="cl" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="n" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="o" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="hb" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="zongmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="zonglushu" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="junmaozhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="junmgdanhao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="ticl4danhao" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="junhuishoulv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="zongjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="junjingzhong" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j0Aji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j0Ajilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j0ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j0jilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j0jiyishanglv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j1ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j1jilv" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j2ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j3ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j4ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j5ji" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j2jijiyixia" ></bean:write>
					</span></td>
					<td align="right"><span class="STYLE14">
					  <bean:write name="result2FormBean" property="j2jijiyixialv" ></bean:write>
					</span></td>				
				</tr>
					</logic:iterate>
				</logic:notEmpty>
		  </table>
		  <!--
			<table align="center" width="900">
			<tr>
				<td align="right">
					<html:submit property="exportResult2">导出Excel</html:submit></td>
					<td><input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();"></td>
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

