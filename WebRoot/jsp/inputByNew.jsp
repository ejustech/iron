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
  <logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
	<tr>
		<td bordercolor="#666666" align="center"><%=index+1%></td>

		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].year"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].month"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].day"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yearMonthDay"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].qiHao"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].luCi"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].guiGe"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shengChanLuHao"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].fanYingQiHao"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shiYongCiShu"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].mg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].tiCl4"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].maoZhong"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jingZhong"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].chengPinLv"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuFe"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuSi"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuCl"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuC"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuN"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuO"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuH"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuMn"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuHb"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].dengJiHanMeng"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].kaoHeDengJiChuMeng"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].gongYiTiaoZheng"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].gongYiShiYan"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].diPiKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shangMaoKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].paBiKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiDiPiKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiShangMaoKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiPaBiKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiTaiFenKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].ciYuanKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shouXuanFeiLiaoKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].sunHaoKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zongPaiMeiLiangKg"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].chuLuZhenKongDu"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanZuiGaoWenDu"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zhengLiuGaoHengDian"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zhuanZhengLiu"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jiaShouCi"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jiaMoCi"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].tongDao"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shengChanGuZhang"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].beiZhuShuoMing"> </td>
	</tr>
	<tr>
		<td align="center" bordercolor="#666666"></td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yearJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].monthJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].dayJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yearMonthDayJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].qiHaoJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].luCiJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].guiGeJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shengChanLuHaoJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].fanYingQiHaoJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shiYongCiShuJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].mgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].tiCl4JunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].maoZhongJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jingZhongJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].chengPinLvJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuFeJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuSiJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuClJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuCJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuNJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuOJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuHJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuMnJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuHbJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].dengJiHanMengJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].kaoHeDengJiChuMengJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].gongYiTiaoZhengJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].gongYiShiYanJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].diPiKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shangMaoKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].paBiKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiDiPiKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiShangMaoKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiPaBiKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiTaiFenKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].ciYuanKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shouXuanFeiLiaoKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].sunHaoKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zongPaiMeiLiangKgJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].chuLuZhenKongDuJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanZuiGaoWenDuJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zhengLiuGaoHengDianJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zhuanZhengLiuJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jiaShouCiJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jiaMoCiJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].tongDaoJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shengChanGuZhangJunPin1"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].beiZhuShuoMingJunPin1"> </td>
	</tr>
	<tr>
		<td align="center" bordercolor="#666666"></td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yearJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].monthJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].dayJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yearMonthDayJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].qiHaoJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].luCiJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].guiGeJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shengChanLuHaoJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].fanYingQiHaoJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shiYongCiShuJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].mgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].tiCl4JunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].maoZhongJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jingZhongJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].chengPinLvJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuFeJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuSiJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuClJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuCJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuNJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuOJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuHJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuMnJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanSuHbJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].dengJiHanMengJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].kaoHeDengJiChuMengJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].gongYiTiaoZhengJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].gongYiShiYanJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].diPiKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shangMaoKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].paBiKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiDiPiKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiShangMaoKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiPaBiKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].feiTaiFenKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].ciYuanKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shouXuanFeiLiaoKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].sunHaoKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zongPaiMeiLiangKgJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].chuLuZhenKongDuJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].yuanZuiGaoWenDuJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zhengLiuGaoHengDianJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].zhuanZhengLiuJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jiaShouCiJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].jiaMoCiJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].tongDaoJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].shengChanGuZhangJunPin2"> </td>
		<td align="center"><input type="text" name="inputByNewList[<bean:write name="index"/>].beiZhuShuoMingJunPin2"> </td>
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
