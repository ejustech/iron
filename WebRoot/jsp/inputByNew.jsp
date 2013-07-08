<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>信息录入</title>
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
.STYLE15 {
	font-family: "新宋体";
	font-size: 14px;
	font-weight: bold;
}
-->
</style>
</head>

<body>
<html:form action="/inputByNew" >
  <div align="center">
    <p><img src="../jinda/image/1.jpg"/></p>
  </div>
  
  <script src="../jinda/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
  
<table width="1024" align="center">
				<tr>
					<td align="left"><span class="STYLE15">信息录入</span></td>
				  	<td align="right">
			
            <html:submit property="Save">保&nbsp&nbsp&nbsp&nbsp存</html:submit>
            <html:submit property="Reset">重&nbsp&nbsp&nbsp&nbsp置</html:submit>
            <html:submit property="back">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
           </td>
				</tr>
		  </table>
			<p></p>
			<hr width="1024" />
<table width="3000" align="center" border=1 style="BORDER-COLLAPSE: collapse">
	<tr><html:errors property="errors"></html:errors></tr>
	<tr><html:errors property="error01"></html:errors></tr>
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
    <td align="center" bgcolor="#99CC99"><span class="STYLE13">TiCl</span><lable style="-webkit-text-size-adjust:none;font-size: 7px">4</lable></td>
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
<logic:equal name="inputByNewForm" property="role" value="1">
<logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
          <%if (0 == index%3) {%>
          <%=index/3+1%>
          <%}%>
          </span></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true" size="7" maxlength="10" onclick="WdatePicker()"></html:text> <%} else {%>  <%}%> </td>
        <td align="center">
        <%if (0 == index%3) {%> 
        <html:select name="inputByNewList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>

        <%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="luCi" indexed="true" size="7" maxlength="9"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <%} else {%> <html:text name="inputByNewList" property="junPin" indexed="true" size="7" maxlength="10"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="guiGe" indexed="true" size="7" maxlength="10"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="mg" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true" size="1" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%>
        <html:select name="inputByNewList" property="tongDao" indexed="true">
                       <html:option value="0">√</html:option>
                       <html:option value="1">×</html:option>
        </html:select><%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate>
</logic:equal>
<logic:equal name="inputByNewForm" property="role" value="2">
<logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
          <%if (0 == index%3) {%>
          <%=index/3+1%>
          <%}%>
          </span></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center">
        <%if (0 == index%3) {%> 
        <html:select name="inputByNewList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>

        <%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="luCi" indexed="true" size="7" maxlength="9"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <%} else {%> <html:text name="inputByNewList" property="junPin" indexed="true" size="7" maxlength="10"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="guiGe" indexed="true" size="7" maxlength="10"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="mg" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true" size="1" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%>
        <html:select name="inputByNewList" property="tongDao" indexed="true">
                       <html:option value="0">√</html:option>
                       <html:option value="1">×</html:option>
        </html:select><%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate>
</logic:equal>
<logic:equal name="inputByNewForm" property="role" value="3">
<logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
          <%if (0 == index%3) {%>
          <%=index/3+1%>
          <%}%>
          </span></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true" size="7" maxlength="10"  onchange="WdatePicker()"></html:text> <%} else {%>  <%}%> </td>
        <td align="center">
        <%if (0 == index%3) {%> 
        <html:select name="inputByNewList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>

        <%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="luCi" indexed="true" size="7" maxlength="9"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <%} else {%> <html:text name="inputByNewList" property="junPin" indexed="true" size="7" maxlength="10"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="guiGe" indexed="true" size="7" maxlength="10"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="mg" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"><html:text name="inputByNewList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true" size="1" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%3) {%>
        <html:select name="inputByNewList" property="tongDao" indexed="true">
                       <html:option value="0">√</html:option>
                       <html:option value="1">×</html:option>
        </html:select><%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%3) {%> <html:text name="inputByNewList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate>
</logic:equal>
  
</table>
<p>&nbsp;</p>
<input id = isSave type="hidden" name="hide" value="" />
<!-- 
<table align="center">
    <tr>
        <td>
		 -->
            <!-- <html:submit property="Save">保&nbsp&nbsp&nbsp&nbsp存</html:submit> -->
            <!-- 
			<input type = "button" value = "保&nbsp&nbsp&nbsp&nbsp存" onclick = "javascript:document.getElementById('isSave').value='Save'" />
            <html:submit property="Save">提&nbsp&nbsp&nbsp&nbsp交</html:submit>
            <html:submit property="Reset">重&nbsp&nbsp&nbsp&nbsp置</html:submit>
            <html:submit property="Return">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
        </td>
    <tr>
</table>
 -->
<hr width="1200" />
<table align="center">
    <tr>
        <td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
    <tr>
</table>
</html:form>
</body>
</html>
