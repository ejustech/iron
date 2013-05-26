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
.STYLE9 {font-size: 12px}
.STYLE13 {font-family: "宋体"; font-size: 12px; font-weight: bold; }
.STYLE14 {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 12px;
}
-->
</style>
</head>

<body>
<html:form action="/inputByUpdate" >
  <div align="center">
    <p><img src="../jinda/image/1.jpg"/></p>
  </div>
<hr width="1200" />


<table width="3000" align="center" border=1 style="BORDER-COLLAPSE: collapse">
    <tr bgcolor="#006699">
    <td width="21" align="center" bordercolor="#666666" bgcolor="#99CC99"><span class="STYLE13">No.</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">年月日</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">期号</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">炉次</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">军品</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">规格</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">生产炉号</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">反应器号</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">使用次数</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">Mg（t）</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">TiCl4</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">毛重</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">净重</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">成品率</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">Fe</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">Si</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">Cl</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">C</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">N</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">O</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">H</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">Mn</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">HB</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">等级(含锰)</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">考核等级(除锰)</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">工艺调整</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">工艺试验</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">底皮Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">上帽Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">爬壁Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">废底皮Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">废上帽Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">废爬壁Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">废钛粉Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">磁选Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">手选废料Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">损耗Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">总排镁量Kg</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">出炉真空度Pa</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">还原最高温度℃</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">蒸馏高恒A点最高℃</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">转蒸馏</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">加首次</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">加末次</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">通道</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">生产故障</span></td>
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">备注说明</span></td>
  </tr>
  <logic:iterate id="inputByUpdateList" name="inputByUpdateForm" property="inputByUpdateList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
          <%=index+1%>
          </span></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="yearMonthDay" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="yearMonthDay" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="qiHao" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="qiHao" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="luCi" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="luCi" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByUpdateList" property="junPin" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="guiGe" indexed="true"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="shengChanLuHao" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="shengChanLuHao" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="fanYingQiHao" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="fanYingQiHao" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="shiYongCiShu" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="shiYongCiShu" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="mg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="mg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="tiCl4" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="tiCl4" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="maoZhong" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="maoZhong" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByUpdateList" property="jingZhong" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="chengPinLv" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuFe" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuSi" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuCl" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuC" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuN" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuO" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuH" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuMn" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuHb" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="dengJiHanMeng" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="kaoHeDengJiChuMeng" indexed="true"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="gongYiTiaoZheng" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="gongYiTiaoZheng" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="gongYiShiYan" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="gongYiShiYan" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="diPiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="diPiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="shangMaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="shangMaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="paBiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="paBiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="feiDiPiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="feiDiPiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="feiShangMaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="feiShangMaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="feiPaBiKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="feiPaBiKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="feiTaiFenKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="feiTaiFenKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="ciYuanKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="ciYuanKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="shouXuanFeiLiaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="shouXuanFeiLiaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByUpdateList" property="sunHaoKg" indexed="true"></html:text> <%} else {%> <html:text name="inputByUpdateList" property="sunHaoKg" indexed="true" disabled="true"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByUpdateList" property="zongPaiMeiLiangKg" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="chuLuZhenKongDu" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanZuiGaoWenDu" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="zhengLiuGaoHengDian" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="zhuanZhengLiu" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="jiaShouCi" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="jiaMoCi" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="tongDao" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="shengChanGuZhang" indexed="true"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="beiZhuShuoMing" indexed="true"></html:text></td>
    </tr>
  </logic:iterate>  
</table>
<p>&nbsp;</p>
<input id = isSave type="hidden" name="hide" value="" />
<table align="center">
    <tr>
        <td>
            <!-- <html:submit property="Save">保&nbsp&nbsp&nbsp&nbsp存</html:submit> -->
            <input type = "button" value = "保&nbsp&nbsp&nbsp&nbsp存" onclick = "javascript:document.getElementById('isSave').value='Save'" />
            <html:submit property="Save">提&nbsp&nbsp&nbsp&nbsp交</html:submit>
            <html:submit property="Reset">重&nbsp&nbsp&nbsp&nbsp置</html:submit>
            <html:submit property="Return">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
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
