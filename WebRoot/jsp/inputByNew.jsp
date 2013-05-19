<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>全部信息输出表</title>
<style type="text/css">
<!--
body {
    background-color: #C9D3DA;
}
.STYLE1 {
    font-size: 16px;
    font-weight: bold;
}
.STYLE4 {font-size: 12px}
.STYLE6 {font-size: 12px; font-weight: bold; }
.STYLE9 {font-size: 12px}
-->
</style>
</head>

<body>
<html:form action="/inputByNew" >
  <div align="center">
    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
    <p class="STYLE1">金达钛业生产数据统计系统</p>
  </div>
<hr width="1200" />


<table width="3000" border=1 align="center" bordercolor="#999999" >
	<tr><html:errors property="errors"></html:errors></tr>
	<tr><html:errors property="error01"></html:errors></tr>
  	<tr bgcolor="#006699">
    <td align="center" width="21" bordercolor="#666666">No.</td>
    <td align="center">年月日</td>
    <td align="center">期号</td>
    <td align="center">炉次</td>
    <td align="center">军品</td>
    <td align="center">规格</td>
    <td align="center">生产炉号</td>
    <td align="center">反应器号</td>
    <td align="center">使用次数</td>
    <td align="center">Mg（t）</td>
    <td align="center">TiCl4</td>
    <td align="center">毛重</td>
    <td align="center">净重</td>
    <td align="center">成品率</td>
    <td align="center">Fe</td>
    <td align="center">Si</td>
    <td align="center">Cl</td>
    <td align="center">C</td>
    <td align="center">N</td>
    <td align="center">O</td>
    <td align="center">H</td>
    <td align="center">Mn</td>
    <td align="center">HB</td>
    <td align="center">等级(含锰)</td>
    <td align="center">考核等级(除锰)</td>
    <td align="center">工艺调整</td>
    <td align="center">工艺试验</td>
    <td align="center">底皮Kg</td>
    <td align="center">上帽Kg</td>
    <td align="center">爬壁Kg</td>
    <td align="center">废底皮Kg</td>
    <td align="center">废上帽Kg</td>
    <td align="center">废爬壁Kg</td>
    <td align="center">废钛粉Kg</td>
    <td align="center">磁选Kg</td>
    <td align="center">手选废料Kg</td>
    <td align="center">损耗Kg</td>
    <td align="center">总排镁量Kg</td>
    <td align="center">出炉真空度Pa</td>
    <td align="center">还原最高温度℃</td>
    <td align="center">蒸馏高恒A点最高℃</td>
    <td align="center">转蒸馏</td>
    <td align="center">加首次</td>
    <td align="center">加末次</td>
    <td align="center">通道</td>
    <td align="center">生产故障</td>
    <td align="center">备注说明</td>
  </tr>
  <logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
  	<tr>
  		<td bordercolor="#666666" align="center"><%if (0 == index%3) {%><%=index/3+1%><%}%></td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="qiHao" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="qiHao" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="luCi" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="luCi" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="junPin" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="guiGe" indexed="true"></html:text></td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="mg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="mg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="tiCl4" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="tiCl4" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="maoZhong" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="maoZhong" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"><html:text name="inputByNewList" property="jingZhong" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="chengPinLv" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuFe" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuSi" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuCl" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuC" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuN" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuO" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuH" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuMn" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanSuHb" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="dengJiHanMeng" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="kaoHeDengJiChuMeng" indexed="true"></html:text></td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="diPiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="diPiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="paBiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="paBiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
		<td align="center"><html:text name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="chuLuZhenKongDu" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="zhuanZhengLiu" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="jiaShouCi" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="jiaMoCi" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="tongDao" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="shengChanGuZhang" indexed="true"></html:text></td>
		<td align="center"><html:text name="inputByNewList" property="beiZhuShuoMing" indexed="true"></html:text></td>
  	</tr>
  </logic:iterate>
</table>
<p>&nbsp;</p>

<table align="center">
    <tr>
        <td>
            <html:submit property="Save">保 存</html:submit>
            <html:submit property="Reset">重 置</html:submit>
            <html:submit property="Return">返 回</html:submit>
        </td>
    <tr>
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
