<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html> 
	<head>
		<title>月生产数据统计表-含锰</title>
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
		<html:form action="/result2">
			<div align="center">
			    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
			    <p class="STYLE1">金达钛业生产数据统计系统</p>
			  </div>
			<hr width="1200" />
			<table>
				<tr>
					<td>月生产数据统计表（等级：含锰）</td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<th>单位（期号）</th>
					<th>Fe</th>
					<th>Cl</th>
					<th>N</th>
					<th>O</th>
					<th>HB</th>
					<th>总毛重</th>
					<th>总炉数</th>
					<th>均毛重</th>
					<th>均Mg单耗</th>
					<th>均回收率</th>
					<th>净重量</th>
					<th>均净重</th>
					<th>0A级</th>
					<th>0A级率</th>
					<th>0级</th>
					<th>0级率</th>
					<th>0级以上</th>
					<th>1级</th>
					<th>1级率</th>
					<th>2级</th>
					<th>3级</th>
					<th>4级</th>
					<th>5级</th>
					<th>2级及以下</th>
					<th>2级及以下率</th>
				</tr>
				<logic:notEmpty name="HANMENGLIST">
					<logic:iterate id="result2FormBean" name="HANMENGLIST">
				<tr>
					<td><bean:write name="result2FormBean" property="qihao" ></bean:write>期
					<td><bean:write name="result2FormBean" property="fe" ></bean:write>
					<td><bean:write name="result2FormBean" property="cl" ></bean:write>
					<td><bean:write name="result2FormBean" property="n" ></bean:write>
					<td><bean:write name="result2FormBean" property="o" ></bean:write>
					<td><bean:write name="result2FormBean" property="hb" ></bean:write>
					<td><bean:write name="result2FormBean" property="lushu" ></bean:write>
					<td><bean:write name="result2FormBean" property="zongmaozhong" ></bean:write>
					<td><bean:write name="result2FormBean" property="junmaozhong" ></bean:write>
					<td><bean:write name="result2FormBean" property="junmgdanhao" ></bean:write>
					<td><bean:write name="result2FormBean" property="junhuishoulv" ></bean:write>
					<td><bean:write name="result2FormBean" property="zongjingzhong" ></bean:write>
					<td><bean:write name="result2FormBean" property="junjingzhong" ></bean:write>
					<td><bean:write name="result2FormBean" property="j0Aji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j0Ajilv" ></bean:write>
					<td><bean:write name="result2FormBean" property="j0ji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j0jilv" ></bean:write>
					<td><bean:write name="result2FormBean" property="j0jiyishang" ></bean:write>
					<td><bean:write name="result2FormBean" property="j1ji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j1jilv" ></bean:write>
					<td><bean:write name="result2FormBean" property="j2ji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j3ji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j4ji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j5ji" ></bean:write>
					<td><bean:write name="result2FormBean" property="j2jijiyixia" ></bean:write>
					<td><bean:write name="result2FormBean" property="j2jijiyixialv" ></bean:write>				
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
			<table>
				<tr>
					<td><html:submit property="search">返&nbsp&nbsp&nbsp&nbsp回</html:submit></td>
				</tr>
			</table>
			<hr width="1200" />
			<table align="center">
				<tr>
					<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
				<tr>
			</table>
		</html:form>
	</body>
</html>

