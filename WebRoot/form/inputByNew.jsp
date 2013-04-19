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
<html:form action="/inputByNew">
  <div align="center">
    <p><img src="../image/1.jpg" width="1090" height="112" /></p>
    <p class="STYLE1">金达钛业生产数据统计系统</p>
  </div>
<hr width="1200" />


<table width="3000" border=1 align="center" bordercolor="#999999" >
  <tr bgcolor="#006699">
    <td align="center" width="21" bordercolor="#666666">No.</td>
    <td align="center" height="43">年</td>
    <td align="center">月</td>
    <td align="center">日</td>
    <td align="center">年月日</td>
    <td align="center">期号</td>
    <td align="center">炉次</td>
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
  <logic:iterate id="itemKey01" name="inputByNewList" indexId="index">
	<tr>
		<td bordercolor="#666666" align="center"><%=index+1%></td>
		<td align="center"><html:text name="itemKey01" property="year" /></td>
		<td align="center"><html:text name="itemKey01" property="month" /></td>
		<td align="center"><html:text name="itemKey01" property="day" /></td>
		<td align="center"><html:text name="itemKey01" property="yearMonthDay" /></td>
		<td align="center"><html:text name="itemKey01" property="qiHao" /></td>
		<td align="center"><html:text name="itemKey01" property="luCi" /></td>
		<td align="center"><html:text name="itemKey01" property="guiGe" /></td>
		<td align="center"><html:text name="itemKey01" property="shengChanLuHao" /></td>
		<td align="center"><html:text name="itemKey01" property="fanYingQiHao" /></td>
		<td align="center"><html:text name="itemKey01" property="shiYongCiShu" /></td>
		<td align="center"><html:text name="itemKey01" property="mg" /></td>
		<td align="center"><html:text name="itemKey01" property="tiCl4" /></td>
		<td align="center"><html:text name="itemKey01" property="maoZhong" /></td>
		<td align="center"><html:text name="itemKey01" property="jingZhong" /></td>
		<td align="center"><html:text name="itemKey01" property="chengPinLv" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuFe" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuSi" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuCl" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuC" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuN" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuO" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuH" /></td>
		<td align="center"><html:text name="itemKey01" property="yuansuMn" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuHb" /></td>
		<td align="center"><html:text name="itemKey01" property="dengJiHanMeng" /></td>
		<td align="center"><html:text name="itemKey01" property="kaoHeDengJiChuMeng" /></td>
		<td align="center"><html:text name="itemKey01" property="gongYiTiaoZheng" /></td>
		<td align="center"><html:text name="itemKey01" property="gongYiShiYan" /></td>
		<td align="center"><html:text name="itemKey01" property="diPiKg" /></td>
		<td align="center"><html:text name="itemKey01" property="shangMaoKg" /></td>
		<td align="center"><html:text name="itemKey01" property="paBiKg" /></td>
		<td align="center"><html:text name="itemKey01" property="feiDiPiKg" /></td>
		<td align="center"><html:text name="itemKey01" property="feiShangMaoKg" /></td>
		<td align="center"><html:text name="itemKey01" property="feiPaBiKg" /></td>
		<td align="center"><html:text name="itemKey01" property="feiTaiFenKg" /></td>
		<td align="center"><html:text name="itemKey01" property="ciYuanKg" /></td>
		<td align="center"><html:text name="itemKey01" property="shouXuanFeiLiaoKg" /></td>
		<td align="center"><html:text name="itemKey01" property="sunHaoKg" /></td>
		<td align="center"><html:text name="itemKey01" property="zongPaiMeiLiangKg" /></td>
		<td align="center"><html:text name="itemKey01" property="chuLuZhenKongDu" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanZuiGaoWenDu" /></td>
		<td align="center"><html:text name="itemKey01" property="zhengLiuGaoHengDian" /></td>
		<td align="center"><html:text name="itemKey01" property="zhuanZhengLiu" /></td>
		<td align="center"><html:text name="itemKey01" property="jiaShouCi" /></td>
		<td align="center"><html:text name="itemKey01" property="jiaMoCi" /></td>
		<td align="center"><html:text name="itemKey01" property="tongDao" /></td>
		<td align="center"><html:text name="itemKey01" property="shengChanGuZhang" /></td>
		<td align="center"><html:text name="itemKey01" property="beiZhuShuoMing" /></td>
	</tr>
	<tr>
		<td align="center" bordercolor="#666666"></td>
		<td align="center"><html:text name="itemKey01" property="yearJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="monthJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="dayJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yearMonthDayJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="qiHaoJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="luCiJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="guiGeJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="shengChanLuHaoJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="fanYingQiHaoJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="shiYongCiShuJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="mgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="tiCl4JunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="maoZhongJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="jingZhongJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="chengPinLvJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuFeJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuSiJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuClJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuCJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuNJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuOJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuHJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuansuMnJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanSuHbJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="dengJiHanMengJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="kaoHeDengJiChuMengJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="gongYiTiaoZhengJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="gongYiShiYanJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="diPiKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="shangMaoKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="paBiKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="feiDiPiKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="feiShangMaoKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="feiPaBiKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="feiTaiFenKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="ciYuanKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="shouXuanFeiLiaoKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="sunHaoKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="zongPaiMeiLiangKgJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="chuLuZhenKongDuJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="yuanZuiGaoWenDuJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="zhengLiuGaoHengDianJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="zhuanZhengLiuJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="jiaShouCiJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="jiaMoCiJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="tongDaoJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="shengChanGuZhangJunPin" /></td>
		<td align="center"><html:text name="itemKey01" property="beiZhuShuoMingJunPin" /></td>
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
