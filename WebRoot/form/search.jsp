<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>生产数据查询</title>
	</head>
	<body>
		<html:form action="/search">
			日期 : <html:text property="riqi1"/><html:errors property="riqi1"/>-<html:text property="riqi2"/><html:errors property="riqi2"/><br/>
			期号 : <html:multibox property="qihao" value="1"/>1
			<html:multibox property="qihao" value="2"/>2
			<html:multibox property="qihao" value="3"/>3
			<html:multibox property="qihao" value="4"/>4
			<br/>
			炉次 : <html:text property="luci1"/><html:errors property="luci1"/>-<html:text property="luci2"/><html:errors property="luci2"/><br/>
			规格 : <html:text property="guige"/><html:errors property="guige"/><br/>
			
			生产炉号 : <html:text property="shengchanluhao"/><html:errors property="shengchanluhao"/><br/>
			反应器号 : <html:text property="fanyingqihao"/><html:errors property="fanyingqihao"/><br/>
			使用次数 : <html:text property="shiyongcishu"/><html:errors property="shiyongcishu"/><br/>
			ticl4 : <html:text property="ticl41"/><html:errors property="ticl41"/>-<html:text property="ticl42"/><html:errors property="ticl42"/><br/>
			
			出炉真空度Pa1 : <html:text property="chuluzhenkongdupa1"/><html:errors property="chuluzhenkongdupa1"/>-<html:text property="chuluzhenkongdupa2"/><html:errors property="chuluzhenkongdupa2"/><br/>
			转蒸馏 : <html:text property="zhuanzhengliu"/><html:errors property="zhuanzhengliu"/><br/>
			加首次 : <html:text property="jiashouci"/><html:errors property="jiashouci"/><br/>
			加末次 : <html:text property="jiamoci"/><html:errors property="jiamoci"/><br/>
			
			实验炉次 : <html:text property="shiyanluci"/><html:errors property="shiyanluci"/><br/>
			工艺调整炉次 : <html:text property="gongyitiaozhengluci"/><html:errors property="gongyitiaozhengluci"/><br/>
			通道 : <html:text property="tongdao"/><html:errors property="tongdao"/><br/>
			生产故障 : <html:text property="shengchanguzhang"/><html:errors property="shengchanguzhang"/><br/>
			
			回收率 : <html:text property="huishoulv1"/><html:errors property="huishoulv1"/>-<html:text property="huishoulv2"/><html:errors property="huishoulv2"/><br/>
		          总排镁量 : <html:text property="zongpaimeiliang1"/><html:errors property="zongpaimeiliang1"/>-<html:text property="zongpaimeiliang2"/><html:errors property="zongpaimeiliang2"/><br/>
			fe : <html:text property="fe1"/><html:errors property="fe1"/>-<html:text property="fe2"/><html:errors property="fe2"/><br/>
			hb : <html:text property="hb1"/><html:errors property="hb1"/>-<html:text property="hb2"/><html:errors property="hb2"/><br/>
			cl : <html:text property="cl1"/><html:errors property="cl1"/>-<html:text property="cl2"/><html:errors property="cl2"/><br/>
			<br/>
			<html:radio property="selInfoList" value="1"/>全部信息输出表
			<html:radio property="selInfoList" value="2"/>月生产数据统计表-含锰
			<html:radio property="selInfoList" value="3"/>月生产数据统计表-除锰
			<html:radio property="selInfoList" value="4"/>月等外钛统计表
			<html:radio property="selInfoList" value="5"/>月指标统计表
			<html:radio property="selInfoList" value="6"/>单炉生产数据统计表
			<html:radio property="selInfoList" value="7"/>月还渗炉次生产数据汇总表
			<br/>
			<html:submit property="srch1">查询</html:submit>
			<html:reset property="reset">重置</html:reset>
			<html:submit property="back">返回</html:submit>
		</html:form>
	</body>
</html>

