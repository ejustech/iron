<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>生产数据查询</title>
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
	<script>   
    	document.all("selInfoList")[0].checked=true;//第一个radio选中   
  	</script>
	<body>
		<html:form action="/search">
		<div align="center">
		    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
		    <p class="STYLE1">金达钛业生产数据统计系统</p>
		  </div>
		<hr width="1200" />
		<table border="1" align="center">
			<tr>
				<td>日&nbsp;期 : <html:text property="riqi1"/><html:errors property="riqi1"/>-<html:text property="riqi2"/><html:errors property="riqi2"/></td>
				<td>期号 : <html:multibox property="qihao" value="1"/>1
				<html:multibox property="qihao" value="2"/>2
				<html:multibox property="qihao" value="3"/>3
				<html:multibox property="qihao" value="4"/>4
				</td>
			</tr>
			<tr>
				<td>炉次 : <html:text property="luci1"/><html:errors property="luci1"/>-<html:text property="luci2"/><html:errors property="luci2"/></td>
				<td>规格 : <html:text property="guige"/><html:errors property="guige"/></td>
			</tr>
			<tr>
				<td>生产炉号 : <html:text property="shengchanluhao"/><html:errors property="shengchanluhao"/></td>
				<td>反应器号 : <html:text property="fanyingqihao"/><html:errors property="fanyingqihao"/></td>
			</tr>
			<tr>
				<td>使用次数 : <html:text property="shiyongcishu1"/><html:errors property="shiyongcishu1"/>-<html:text property="shiyongcishu2"/><html:errors property="shiyongcishu2"/></td>
				<td>ticl4 : <html:text property="ticl41"/><html:errors property="ticl41"/>-<html:text property="ticl42"/><html:errors property="ticl42"/></td>
			</tr>	
			<tr>
				<td>出炉真空度Pa1 : <html:text property="chuluzhenkongdupa1"/><html:errors property="chuluzhenkongdupa1"/>-<html:text property="chuluzhenkongdupa2"/><html:errors property="chuluzhenkongdupa2"/></td>
				<td>转蒸馏 : <html:text property="zhuanzhengliu"/><html:errors property="zhuanzhengliu"/></td>
			</tr>
			<tr>
				<td>加首次 : <html:text property="jiashouci"/><html:errors property="jiashouci"/></td>
				<td>加末次 : <html:text property="jiamoci"/><html:errors property="jiamoci"/></td>
			</tr>
			<tr>
				<td>实验炉次 : <html:text property="shiyanluci"/><html:errors property="shiyanluci"/></td>
				<td>工艺调整炉次 : <html:text property="gongyitiaozhengluci"/><html:errors property="gongyitiaozhengluci"/></td>
			</tr>
			<tr>
				<td>通道 : <html:text property="tongdao"/><html:errors property="tongdao"/></td>
				<td>生产故障 : <html:text property="shengchanguzhang"/><html:errors property="shengchanguzhang"/></td>
			</tr>
			<tr>
				<td>回收率 : <html:text property="huishoulv1"/><html:errors property="huishoulv1"/>-<html:text property="huishoulv2"/><html:errors property="huishoulv2"/></td>
				<td>总排镁量 : <html:text property="zongpaimeiliang1"/><html:errors property="zongpaimeiliang1"/>-<html:text property="zongpaimeiliang2"/><html:errors property="zongpaimeiliang2"/></td>
			</tr>
			<tr>
				<td>fe : <html:text property="fe1"/><html:errors property="fe1"/>-<html:text property="fe2"/><html:errors property="fe2"/></td>
				<td>hb : <html:text property="hb1"/><html:errors property="hb1"/>-<html:text property="hb2"/><html:errors property="hb2"/></td>
			</tr>
			<tr>
				<td>cl : <html:text property="cl1"/><html:errors property="cl1"/>-<html:text property="cl2"/><html:errors property="cl2"/></td>
			</tr>
		</table>
		<table align="center">
			<tr>
			<logic:iterate id="sList" name="SELLIST" >
				<td>
					<html:radio name="sList" property="selInfoList" value="1"/>全部信息输出表
					<html:radio name="sList" property="selInfoList" value="2"/>月生产数据统计表-含锰
					<html:radio name="sList" property="selInfoList" value="3"/>月生产数据统计表-除锰
					<html:radio name="sList" property="selInfoList" value="4"/>月等外钛统计表
					<html:radio name="sList" property="selInfoList" value="5"/>月指标统计表
					<html:radio name="sList" property="selInfoList" value="6"/>单炉生产数据统计表
					<html:radio name="sList" property="selInfoList" value="7"/>月还渗炉次生产数据汇总表
				</td>
			</logic:iterate>
			</tr>
		</table>
		<table align="center">
			<tr>
				<td>
					<html:submit property="srch1">查&nbsp&nbsp&nbsp&nbsp询</html:submit>
					<html:reset property="reset">重&nbsp&nbsp&nbsp&nbsp置</html:reset>
					<html:submit property="backToMenu">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
				</td>
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

