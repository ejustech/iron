<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>全部信息输出表</title>
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
		<html:form action="/result1">
			<div align="center">
			    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
			    <p class="STYLE1">金达钛业生产数据统计系统</p>
			  </div>
			<hr width="1200" />
			<table>
				<tr>
					<td>全部信息输出表</td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<th></th>
					<th>日期</th>
					<th>期号</th>
					<th>炉次</th>
					<th>规格</th>
					<th>生产炉号</th>
					<th>反应器号</th>
					<th>使用次数</th>
					<th>Mg(t)</th>
					<th>TiCl4</th>
					<th>毛重</th>
					<th>净重</th>
					<th>成品率</th>
					<th>Fe</th>
					<th>Si</th>
					<th>Cl</th>
					<th>C</th>
					<th>N</th>
					<th>O</th>
					<th>H</th>
					<th>Mn</th>
					<th>HB</th>
					<th>等级(含锰)</th>
					<th>考核等级(除锰)</th>
					<th>工艺调整</th>
					<th>工艺试验</th>
					<th>底皮Kg</th>
					<th>上帽Kg</th>
					<th>爬壁Kg</th>
					<th>废底皮Kg</th>
					<th>废上帽Kg</th>
					<th>废爬壁Kg</th>
					<th>废钛粉Kg</th>
					<th>磁选Kg</th>
					<th>手选废料Kg</th>
					<th>损耗Kg</th>
					<th>总排镁量Kg</th>
					<th>出炉真空度Pa</th>
					<th>还原最高温度℃</th>
					<th>蒸馏高恒A点最高℃</th>
					<th>转蒸馏</th>
					<th>加首次</th>
					<th>加末次</th>
					<th>通道</th>
					<th>生产故障</th>
					<th>备注说明</th>
				</tr>
				<logic:notEmpty name="AllINFOLIST">
					<logic:iterate id="result1FormBean" name="AllINFOLIST">
				<tr>
					<td>
						<html:multibox property="indexCheckbox">
							<logic:empty name="result1FormBean" property="index"></logic:empty>
							<bean:write name="result1FormBean" property="index" />
						</html:multibox>
					</td>
					<td><bean:write name="result1FormBean" property="riqi" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="qihao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="luci" ></bean:write><bean:write name="result1FormBean" property="junpin" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="guige" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="shengchanluhao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="fanyingqihao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="shiyongcishu" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="mg" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="ticl" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="maozhong" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="jingzhong" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="chengpinlv" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="fe" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="si" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="cl" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="c" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="n" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="o" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="h" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="mn" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="hb" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="dengji_hanmeng" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="kaohedengji_chumeng" ></bean:write></td>	
					<td><bean:write name="result1FormBean" property="gongyitiaozheng" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="gongyishiyan" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="dipi" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="shangmao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="pabi" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="feidipi" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="feishangmao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="feipabi" ></bean:write></td>	
					<td><bean:write name="result1FormBean" property="feitaifen" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="cixuan" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="shouxuanfeiliao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="sunhao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="zongpaimeiliang" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="chuluzhenkongdu" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="huanyuanzuigaowendu" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="zhengliugaoheng" ></bean:write></td>	
					<td><bean:write name="result1FormBean" property="zhuanzhengliu" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="jiashouci" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="jiamoci" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="tongdao" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="shengchanguzhang" ></bean:write></td>
					<td><bean:write name="result1FormBean" property="beizhushuoming" ></bean:write></td>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
			<table>
				<tr>
					<!-- <td><html:submit property="search">返&nbsp&nbsp&nbsp&nbsp回</html:submit></td> -->
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

