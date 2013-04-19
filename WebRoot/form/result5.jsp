<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>全部信息</title>
	</head>
	<body>
		<html:form action="/result1">
			<table>
				<tr>
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
					<logic:iterate id="tIronInfoBean" name="AllINFOLIST">
				<tr>
					<td><bean:write name="tIronInfoBean" property="riqi" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="qihao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="luci" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="guige" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="shengchanluhao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="fanyingqihao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="shiyongcishu" ></bean:write>	
					<td><bean:write name="tIronInfoBean" property="mg" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="ticl" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="maozhong" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="jingzhong" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="chengpinlv" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="fe" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="si" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="cl" ></bean:write>	
					<td><bean:write name="tIronInfoBean" property="c" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="n" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="o" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="h" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="mn" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="hb" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="dengji_hanmeng" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="kaohedengji_chumeng" ></bean:write>	
					<td><bean:write name="tIronInfoBean" property="gongyitiaozheng" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="gongyishiyan" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="dipi" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="shangmao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="pabi" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="feidipi" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="feishangmao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="feipabi" ></bean:write>	
					<td><bean:write name="tIronInfoBean" property="feitaifen" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="cixuan" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="shouxuanfeiliao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="sunhao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="zongpaimeiliang" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="chuluzhenkongdu" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="huanyuanzuigaowendu" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="zhengliugaoheng" ></bean:write>	
					<td><bean:write name="tIronInfoBean" property="zhuanzhengliu" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="jiashouci" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="jiamoci" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="tongdao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="shengchanguzhang" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="beizhushuoming" ></bean:write>
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
		</html:form>
	</body>
</html>

