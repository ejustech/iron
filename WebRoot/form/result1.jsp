<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>全部信息</title>
	</head>
	<body>
		<html:form action="/result1">
	<table>
		<tr>
			<th>luci</th>
			<th>fanyingqihao</th>
		</tr>
		<logic:notEmpty name="AllINFOLIST" property="list">
			<logic:iterate id="tIronInfoBean" name="AllINFOLIST" property="list">
		<tr>	
			<td><bean:write name="tIronInfoBean" property="luci" ></bean:write>
			<td><bean:write name="tIronInfoBean" property="fanyingqihao"></bean:write>
		</tr>
			</logic:iterate>
		</logic:notEmpty>
	</table>
			<!--  shengchanluhao : <html:text property="shengchanluhao"/><html:errors property="shengchanluhao"/><br/>
			zhengliugaoheng : <html:text property="zhengliugaoheng"/><html:errors property="zhengliugaoheng"/><br/>
			feipabi : <html:text property="feipabi"/><html:errors property="feipabi"/><br/>
			zhuanzhengliu : <html:text property="zhuanzhengliu"/><html:errors property="zhuanzhengliu"/><br/>
			tongdao : <html:text property="tongdao"/><html:errors property="tongdao"/><br/>
			zongpaimeiliang : <html:text property="zongpaimeiliang"/><html:errors property="zongpaimeiliang"/><br/>
			shangmao : <html:text property="shangmao"/><html:errors property="shangmao"/><br/>
			shengchanguzhang : <html:text property="shengchanguzhang"/><html:errors property="shengchanguzhang"/><br/>
			pabi : <html:text property="pabi"/><html:errors property="pabi"/><br/>
			gongyitiaozheng : <html:text property="gongyitiaozheng"/><html:errors property="gongyitiaozheng"/><br/>
			riqi : <html:text property="riqi"/><html:errors property="riqi"/><br/>
			chengpinlv : <html:text property="chengpinlv"/><html:errors property="chengpinlv"/><br/>
			mg : <html:text property="mg"/><html:errors property="mg"/><br/>
			beizhushuoming : <html:text property="beizhushuoming"/><html:errors property="beizhushuoming"/><br/>
			feishangmao : <html:text property="feishangmao"/><html:errors property="feishangmao"/><br/>
			shiyojngcishu : <html:text property="shiyojngcishu"/><html:errors property="shiyojngcishu"/><br/>
			huanyuanzuigaowendu : <html:text property="huanyuanzuigaowendu"/><html:errors property="huanyuanzuigaowendu"/><br/>
			dengji_hanmeng : <html:text property="dengji_hanmeng"/><html:errors property="dengji_hanmeng"/><br/>
			sunhao : <html:text property="sunhao"/><html:errors property="sunhao"/><br/>
			mn : <html:text property="mn"/><html:errors property="mn"/><br/>
			maozhong : <html:text property="maozhong"/><html:errors property="maozhong"/><br/>
			jingzhong : <html:text property="jingzhong"/><html:errors property="jingzhong"/><br/>
			c : <html:text property="c"/><html:errors property="c"/><br/>
			jiashouci : <html:text property="jiashouci"/><html:errors property="jiashouci"/><br/>
			feitaifen : <html:text property="feitaifen"/><html:errors property="feitaifen"/><br/>
			n : <html:text property="n"/><html:errors property="n"/><br/>
			o : <html:text property="o"/><html:errors property="o"/><br/>
			cixuan : <html:text property="cixuan"/><html:errors property="cixuan"/><br/>
			hb : <html:text property="hb"/><html:errors property="hb"/><br/>
			fe : <html:text property="fe"/><html:errors property="fe"/><br/>
			qihao : <html:text property="qihao"/><html:errors property="qihao"/><br/>
			h : <html:text property="h"/><html:errors property="h"/><br/>
			dipi : <html:text property="dipi"/><html:errors property="dipi"/><br/>
			fanyingqihao : <html:text property="fanyingqihao"/><html:errors property="fanyingqihao"/><br/>
			si : <html:text property="si"/><html:errors property="si"/><br/>
			shouxuanfeiliao : <html:text property="shouxuanfeiliao"/><html:errors property="shouxuanfeiliao"/><br/>
			ticl : <html:text property="ticl"/><html:errors property="ticl"/><br/>
			jiamoci : <html:text property="jiamoci"/><html:errors property="jiamoci"/><br/>
			cl : <html:text property="cl"/><html:errors property="cl"/><br/>
			luci : <html:text property="luci"/><html:errors property="luci"/><br/>
			chuluzhenkongdu : <html:text property="chuluzhenkongdu"/><html:errors property="chuluzhenkongdu"/><br/>
			feidipi : <html:text property="feidipi"/><html:errors property="feidipi"/><br/>
			guige : <html:text property="guige"/><html:errors property="guige"/><br/>
			kaohedengji_chumeng : <html:text property="kaohedengji_chumeng"/><html:errors property="kaohedengji_chumeng"/><br/>
			gongyishiyan : <html:text property="gongyishiyan"/><html:errors property="gongyishiyan"/><br/>
			<html:submit/><html:cancel/>-->
		</html:form>
	</body>
</html>

