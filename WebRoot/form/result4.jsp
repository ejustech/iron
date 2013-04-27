<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
	<head>
		<title>月等外钛统计表</title>
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
		<html:form action="/result4">
			<div align="center">
			    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
			    <p class="STYLE1">金达钛业生产数据统计系统</p>
			  </div>
			<hr width="1200" />
			<table>
				<tr>
					<td>月等外钛统计表</td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<th>期号</th>
					<th>总炉次数</th>
					<th>均毛重量kg</th>
					<th>均净重量kg</th>
					<th>成品率</th>
					<th>底皮kg</th>
					<th>上帽kg</th>
					<th>爬壁kg</th>
					<th>废底皮kg</th>
					<th>废底皮比例</th>
					<th>废上帽kg</th>
					<th>废上帽 比例</th>
					<th>废爬壁kg</th>
					<th>废爬壁 比例</th>
					<th>废钛粉kg</th>
					<th>磁选kg</th>
					<th>手选废料kg</th>
					<th>损耗kg</th>
				</tr>
				<logic:notEmpty name="WAITAILIST">
					<logic:iterate id="result4FormBean" name="WAITAILIST">
				<tr>
					<td><bean:write name="result4FormBean" property="qihao" ></bean:write>期</td>
					<td><bean:write name="result4FormBean" property="zonglushu" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="junmaozhong" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="junjingzhong" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="junhuishoulv" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="dipi" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="shangmao" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="pabi" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="feidipi" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="feidipibili" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="feishangmao" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="feishangmaobili" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="feipabi" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="feipabibili" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="shaixuanfeiliao" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="cixuanfeiliao" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="shouxuanfeiliao" ></bean:write></td>
					<td><bean:write name="result4FormBean" property="sunhao" ></bean:write></td>
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

