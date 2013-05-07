<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>生产数据查询</title>
	    <style type="text/css">
<!--
.STYLE10 {font-family: "宋体"}
-->
        </style>
</head>
	<style type="text/css">
	<!--
		body {
			background-color: #C9D3DA;
		}
		.STYLE9 {font-size: 12px}
.STYLE11 {font-size: 14px}
.STYLE12 {
	font-family: "新宋体";
	font-size: 14px;
	font-weight: bold;
}
	-->
	</style>
	<script>   
    	document.all("selInfoList")[0].checked=true;//第一个radio选中   
		//function goMenu(){
			//document.forms[0].submit()
			//window.history.back()
		//}
  	</script>
	<body>
		<html:form action="/search">
		<div align="center">
			<p><img src="../iron/image/1.jpg"/></p>
		</div>
		<!--
		<table align="left">
		<tr><td><a href="javascript:goMenu()">功能列表</a></td></tr>
		</table>
		-->
		
		<table width="1024" align="center">
			<tr>
				<td align="left"><span class="STYLE12">信息查询</span></td>
				<td align="right">
					<html:submit property="srch1">查&nbsp&nbsp&nbsp&nbsp询</html:submit>
					<html:reset property="reset">重&nbsp&nbsp&nbsp&nbsp置</html:reset>
					<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
				</td>
			</tr>
		</table>
		
		<p></p>
		<hr width="1024" />
		<table width="1024" align="center" border=1 style="BORDER-COLLAPSE: collapse">
			<tr>
				<td valign="top">
					<table align="center">
					<logic:iterate id="sList" name="SELLIST" >
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="1"/>
						  全部信息输出表</span></td>
						</tr>
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="2"/>
						  月生产数据统计表-含锰</span></td>
						</tr>
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="3"/>
						  月生产数据统计表-除锰</span></td>
						</tr>
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="4"/>
						  月等外钛统计表</span></td>
						</tr>
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="5"/>
						  月指标统计表</span></td>
						</tr>
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="6"/>
						  单炉生产数据统计表</span></td>
						</tr>
						<tr>
						  <td><span class="STYLE10 STYLE11">
						  <html:radio name="sList" property="selInfoList" value="7"/>
						  月还渗炉次生产数据汇总表</span></td>
						</tr>
					</logic:iterate>
					</table>
				</td>
				<td valign="top">
					<table width="815" align="center" border=1 style="BORDER-COLLAPSE: collapse">
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">日期:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="riqi1"/>
						    <html:errors property="riqi1"/>
						    -
						    <html:text property="riqi2"/>
						    <html:errors property="riqi2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">期号:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:multibox property="qihao" value="1"/>
						    1
						    <html:multibox property="qihao" value="2"/>
						    2
						    <html:multibox property="qihao" value="3"/>
						    3
						    <html:multibox property="qihao" value="4"/>
						    4</span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">炉次:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="luci1"/>
						    <html:errors property="luci1"/>
						    -
						    <html:text property="luci2"/>
						    <html:errors property="luci2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">规格:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="guige"/>
						    <html:errors property="guige"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">ticl4:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="ticl41"/>
						    <html:errors property="ticl41"/>
						    -
						    <html:text property="ticl42"/>
						    <html:errors property="ticl42"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">反应器号:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="fanyingqihao"/>
						    <html:errors property="fanyingqihao"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">使用次数:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="shiyongcishu1"/>
						    <html:errors property="shiyongcishu1"/>
						    -
						    <html:text property="shiyongcishu2"/>
						    <html:errors property="shiyongcishu2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">生产炉号:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="shengchanluhao"/>
						    <html:errors property="shengchanluhao"/>
							  </span></td>
						</tr>	
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">出炉真空度Pa1:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="chuluzhenkongdupa1"/>
						    <html:errors property="chuluzhenkongdupa1"/>
						    -
						    <html:text property="chuluzhenkongdupa2"/>
						    <html:errors property="chuluzhenkongdupa2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">转蒸馏:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="zhuanzhengliu"/>
						    <html:errors property="zhuanzhengliu"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">总排镁量:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="zongpaimeiliang1"/>
						    <html:errors property="zongpaimeiliang1"/>
						    -
						    <html:text property="zongpaimeiliang2"/>
						    <html:errors property="zongpaimeiliang2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">实验炉次 : </span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="shiyanluci"/>
						    <html:errors property="shiyanluci"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">Fe:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="fe1"/>
						    <html:errors property="fe1"/>
						    -
						    <html:text property="fe2"/>
						    <html:errors property="fe2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">加首次:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="jiashouci"/>
						    <html:errors property="jiashouci"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">Cl:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="cl1"/>
						    <html:errors property="cl1"/>
						    -
						    <html:text property="cl2"/>
						    <html:errors property="cl2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">加末次:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="jiamoci"/>
						    <html:errors property="jiamoci"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">Hb:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="hb1"/>
						    <html:errors property="hb1"/>
						    -
						    <html:text property="hb2"/>
						    <html:errors property="hb2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">工艺调整炉次:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="gongyitiaozhengluci"/>
						    <html:errors property="gongyitiaozhengluci"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">回收率:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="huishoulv1"/>
						    <html:errors property="huishoulv1"/>
						    -
						    <html:text property="huishoulv2"/>
						    <html:errors property="huishoulv2"/>
							  </span></td>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">通道:</span></td>
							<td><span class="STYLE10 STYLE11">
						    <html:text property="tongdao"/>
						    <html:errors property="tongdao"/>
							  </span></td>
						</tr>
						<tr>
							<td bgcolor="#99CCCC"><span class="STYLE10 STYLE11">生产故障:</span></td>
							<td colspan="3"><span class="STYLE10 STYLE11">
						    <html:text property="shengchanguzhang"/>
						    <html:errors property="shengchanguzhang"/>
							  </span></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<!--
		<table align="center" width="900">
			<tr>
				<td align="right">
					<html:submit property="srch1">查&nbsp&nbsp&nbsp&nbsp询</html:submit>
					<html:reset property="reset">重&nbsp&nbsp&nbsp&nbsp置</html:reset>
					<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">
					
					<html:submit property="backToMenu">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
					
				</td>
			</tr>
		</table>
		-->
		<hr width="1024" />
		<table align="center">
			<tr>
				<td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
			</tr>
		</table>	
		</html:form>
	</body>
</html>

