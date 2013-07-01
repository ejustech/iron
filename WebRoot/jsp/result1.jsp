<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>全部信息输出表</title>
	    <style type="text/css">
<!--
.STYLE13 {font-family: "新宋体"}
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
.STYLE14 {
	font-size: 14px;
	font-weight: bold;
}
.STYLE16 {font-family: Arial, Helvetica, sans-serif; font-size: 12px; }

.STYLETD{white-space:nowrap;overflow:hidden;text-overflow:ellipsis;word-break:keep-all;}
.STYLEXIABIAO {font-size: 7px}
	-->
	</style>
	<body>
		<html:form action="/result1">
			<div align="center">
			    <p><img src="../jinda/image/1.jpg"/></p>
		  	</div>
		   <table width="1024" align="center">
				<tr>
					<td align="left"><span class="STYLE13 STYLE14">全部信息输出表</span></td>
				  	<td align="right">
				  		<!--
					  	<html:submit property="res1_add">添&nbsp&nbsp&nbsp&nbsp加</html:submit>
					  	-->
					  	
					  	<!--
						<html:submit property="res1_modify">修&nbsp&nbsp&nbsp&nbsp改</html:submit>
						-->
						
						<html:submit property="exportResult1">导出Excel</html:submit>
						
						<html:submit property="res1_del">删&nbsp&nbsp&nbsp&nbsp除</html:submit>

						<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();">

					  	<!--
					  	<html:submit property="res1_back">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
					  	-->
				  	</td>
				</tr>
		  </table>
			<p></p>
			<hr width="1024" />
			<table align="center" border=1 style="BORDER-COLLAPSE: collapse;table-layout:fixed;width:1850px">
				<tr>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE11">删除</span></th>
					<th bgcolor="#99CC99" style="width:50px;"><span class="STYLE11">修改</span></th>
					<th bgcolor="#99CC99" style="width:60px;"><span class="STYLE10 STYLE11 STYLE9">日期</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">期号</span></th>
					<th bgcolor="#99CC99" style="width:85px;"><span class="STYLE10 STYLE11 STYLE9">炉次</span></th>
					<th bgcolor="#99CC99" style="width:50px;"><span class="STYLE10 STYLE11 STYLE9">规格</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">生产炉号</span></th>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE10 STYLE11 STYLE9">反应器号</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">使用次数</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">Mg(t)</span></th>
					<th bgcolor="#99CC99" style="width:35px;"><span class="STYLE10 STYLE11 STYLE9">TiCl</span><lable style="font-size: 7px">4</lable></th>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE10 STYLE11 STYLE9">毛重</span></th>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE10 STYLE11 STYLE9">净重</span></th>
					<th bgcolor="#99CC99" style="width:40px;"><span class="STYLE10 STYLE11 STYLE9">成品率</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">Fe</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">Si</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">Cl</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">C</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">N</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">O</span></th>
					<th bgcolor="#99CC99" style="width:35px;"><span class="STYLE10 STYLE11 STYLE9">H</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">Mn</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">HB</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">等级(含锰)</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">考核等级(除锰)</span></th>
					<th bgcolor="#99CC99" style="width:45px;"><span class="STYLE10 STYLE11 STYLE9">工艺调整</span></th>
					<th bgcolor="#99CC99" style="width:45px;"><span class="STYLE10 STYLE11 STYLE9">工艺试验</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">底皮Kg</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">上帽Kg</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">爬壁Kg</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">废底皮Kg</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">废上帽Kg</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">废爬壁Kg</span></th>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE10 STYLE11 STYLE9">废钛粉Kg</span></th>
					<th bgcolor="#99CC99" style="width:20px;"><span class="STYLE10 STYLE11 STYLE9">磁选Kg</span></th>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE10 STYLE11 STYLE9">手选废料Kg</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">损耗Kg</span></th>
					<th bgcolor="#99CC99" style="width:35px;"><span class="STYLE10 STYLE11 STYLE9">总排镁量Kg</span></th>
					<th bgcolor="#99CC99" style="width:25px;"><span class="STYLE10 STYLE11 STYLE9">出炉真空度Pa</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">还原最高温度℃</span></th>
					<th bgcolor="#99CC99" style="width:30px;"><span class="STYLE10 STYLE11 STYLE9">蒸馏高恒A点最高℃</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">转蒸馏</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">加首次</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">加末次</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">通道</span></th>
					<th bgcolor="#99CC99" style="width:15px;"><span class="STYLE10 STYLE11 STYLE9">生产故障</span></th>
					<th bgcolor="#99CC99" style="width:45px;"><span class="STYLE10 STYLE11 STYLE9">备注说明</span></th>
				</tr>
				<logic:notEmpty name="AllINFOLIST">
					<logic:iterate id="result1FormBean" name="AllINFOLIST">
				<tr>
					<td align="center" class="STYLETD">
						<html:multibox property="indexCheckbox">
							<logic:empty name="result1FormBean" property="index"></logic:empty>
							<bean:write name="result1FormBean" property="index" />
						</html:multibox>					
					</td>
					<td align="center" class="STYLETD"><span class="STYLE16">
					  <!-- <html:text name="result1FormBean" property="id" indexed="true" ></html:text> -->
					  <input type="button" value="修改" onclick="window.location.href='/jinda/updateSingle.do?id=${result1FormBean.id}';" /> 
					</span></td>					
					<td align="center" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="riqi" ></bean:write>
					</span></td>
					<td align="center" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="qihao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="luci" ></bean:write>
					  <bean:write name="result1FormBean" property="junpin" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="guige" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="shengchanluhao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="fanyingqihao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="shiyongcishu" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="mg" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="ticl" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="maozhong" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="jingzhong" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="chengpinlv" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="fe" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="si" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="cl" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="c" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="n" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="o" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="h" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="mn" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="hb" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="dengji_hanmeng" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="kaohedengji_chumeng" ></bean:write>
					</span></td>	
					<td align="right" title="<bean:write name="result1FormBean" property="gongyitiaozheng" />" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="gongyitiaozheng" ></bean:write>
					</span></td>
					<td align="right" title="<bean:write name="result1FormBean" property="gongyishiyan" />" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="gongyishiyan" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="dipi" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="shangmao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="pabi" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="feidipi" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="feishangmao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="feipabi" ></bean:write>
					</span></td>	
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="feitaifen" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="cixuan" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="shouxuanfeiliao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="sunhao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="zongpaimeiliang" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="chuluzhenkongdu" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="huanyuanzuigaowendu" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="zhengliugaoheng" ></bean:write>
					</span></td>	
					<td align="right" title="<bean:write name="result1FormBean" property="zhuanzhengliu" />" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="zhuanzhengliu" ></bean:write>
					</span></td>
					<td align="right" title="<bean:write name="result1FormBean" property="jiashouci" />" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="jiashouci" ></bean:write>
					</span></td>
					<td align="right" title="<bean:write name="result1FormBean" property="jiamoci" />" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="jiamoci" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="tongdao" ></bean:write>
					</span></td>
					<td align="right" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="shengchanguzhang" ></bean:write>
					</span></td>
					<td align="right" title="<bean:write name="result1FormBean" property="beizhushuoming" />" class="STYLETD"><span class="STYLE16">
					  <bean:write name="result1FormBean" property="beizhushuoming" ></bean:write>
					</span></td>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
			<!--
			<table align="center" width="900">
			<tr>
				<td align="right">
					<td><html:submit property="search">返&nbsp&nbsp&nbsp&nbsp回</html:submit></td>
					<input type=button value="返&nbsp&nbsp&nbsp&nbsp回" onClick="javascript:window.history.back();"></td>
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

