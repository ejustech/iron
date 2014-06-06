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
<script language="javascript">
function keystoke(obj){
	var e = window.event;
	var id = document.activeElement.id;

	switch(e.keyCode){

		case 40:
		//alert(id);
		var x = parseInt(id.split(",")[0]);
		var y = parseInt(id.split(",")[1]);

		var focusIndex = parseInt(id.split(",")[1]);

		var foucs_Down1 =  x + "," + (y + 1);
		var foucs_Down2 =  x + "," + (y + 2);
		var foucs_Down7 =  x + "," + (y + 7);

		if (x == "4"){
			if(y == "6" || y == "13" || y == "20" || y == "27" || y == "34" || y == "41" || y == "48" || y == "55" || y == "62"){
				document.getElementById(foucs_Down2).focus();
				//alert(foucs_Down2);
			}else{
				document.getElementById(foucs_Down1).focus();
				//alert(foucs_Down1);
			}
		}else if (x == "1" || x == "2" || x == "3" || x == "6" || x == "7" || x == "8" || x == "9" || x == "10" || x == "11" || x == "13" || x == "25" || x == "26" || x == "27" || x == "28" || x == "29" || x == "30" || x == "31" || x == "32" || x == "33" || x == "34" || x == "35" || x == "36" || x == "37" || x == "38" || x == "39" || x == "40" || x == "41" || x == "42" || x == "43" || x == "44" || x == "45"){
			document.getElementById(foucs_Down7).focus();
			//alert(foucs_Down7);
		}else{
			document.getElementById(foucs_Down1).focus();
			//alert(foucs_Down1);	
		}
		break;

		case 38:

		var x = parseInt(id.split(",")[0]);
		var y = parseInt(id.split(",")[1]);

		var focusIndex = parseInt(id.split(",")[1]);

		var foucs_Up1 =  x + "," + (y - 1);
		var foucs_Up2 =  x + "," + (y - 2);
		var foucs_Up7 =  x + "," + (y - 7);

		if (x == "4"){
			if(y == "8" || y == "15" || y == "22" || y == "29" || y == "36" || y == "43" || y == "50" || y == "57" || y == "64"){
				document.getElementById(foucs_Up2).focus();
				//alert(foucs_Up2);	
			}else{
				document.getElementById(foucs_Up1).focus();
				//alert(foucs_Up1);	
			}
		}else if (x == "1" || x == "2" || x == "3" || x == "6" || x == "7" || x == "8" || x == "9" || x == "10" || x == "11" || x == "13" || x == "25" || x == "26" || x == "27" || x == "28" || x == "29" || x == "30" || x == "31" || x == "32" || x == "33" || x == "34" || x == "35" || x == "36" || x == "37" || x == "38" || x == "39" || x == "40" || x == "41" || x == "42" || x == "43" || x == "44" || x == "45"){
			document.getElementById(foucs_Up7).focus();
		}else{
			document.getElementById(foucs_Up1).focus();
		}

		break;

		case 37:

		var x = parseInt(id.split(",")[0]);
		var y = parseInt(id.split(",")[1]);

		var focusIndex = parseInt(id.split(",")[1]);

		var foucs_Left1 = (x - 1) + "," + y;
		var foucs_Left2 = (x - 2) + "," + y;
		var foucs_Left7 = (x - 7) + "," + y;
		var foucs_Left22 = (x - 22) + "," + y;

		if (y == "0" || y == "7" || y == "14" || y == "21" || y == "28" || y == "35" || y == "42" || y == "49" || y == "56" || y == "63" || y == "70" || y == "77"){
			if (x == "5"){
				document.getElementById(foucs_Left2).focus();
			}else {
				document.getElementById(foucs_Left1).focus();
			}
		}else {
			if (x == "12"){
				document.getElementById(foucs_Left7).focus();
			}else if (x == "14"){
				document.getElementById(foucs_Left2).focus();
			}else if (x == "46"){
				document.getElementById(foucs_Left22).focus();
			}else{
				document.getElementById(foucs_Left1).focus();
			}	
		}

		break;

		case 39:

		var x = parseInt(id.split(",")[0]);
		var y = parseInt(id.split(",")[1]);

		var focusIndex = parseInt(id.split(",")[1]);

		var foucs_Right1 = (x + 1) + "," + y;
		var foucs_Right2 = (x + 2) + "," + y;
		var foucs_Right7 = (x + 7) + "," + y;
		var foucs_Right22 = (x + 22) + "," + y;

		if (y == "0" || y == "7" || y == "14" || y == "21" || y == "28" || y == "35" || y == "42" || y == "49" || y == "56" || y == "63" || y == "70" || y == "77"){
			if (x == "3"){
				document.getElementById(foucs_Right2).focus();
			}else {
				document.getElementById(foucs_Right1).focus();
			}
		}else {
			if (x == "5"){
				document.getElementById(foucs_Right7).focus();
			}else if (x == "12"){
				document.getElementById(foucs_Right2).focus();
			}else if (x == "24"){
				document.getElementById(foucs_Right22).focus();
			}else{
				document.getElementById(foucs_Right1).focus();
			}	
		}

		break;
	}
}
function copy(id){
	
	//alert("button id = " + id);
	var radioId = "";
　var rPort = document.getElementsByName("RadioGroup");
　for(i=0;i<rPort.length;i++){
　	if(rPort[i].checked){
			radioId=rPort[i].value;
			//alert("radioId = " + radioId);
			break;
		}
　}
	//x14-24 fe-kaohedengjichumeng

	document.getElementById("14,"+id).value = document.getElementById("14,"+radioId).value;
	document.getElementById("15,"+id).value = document.getElementById("15,"+radioId).value;
	document.getElementById("16,"+id).value = document.getElementById("16,"+radioId).value;
	document.getElementById("17,"+id).value = document.getElementById("17,"+radioId).value;
	document.getElementById("18,"+id).value = document.getElementById("18,"+radioId).value;
	document.getElementById("19,"+id).value = document.getElementById("19,"+radioId).value;
	document.getElementById("20,"+id).value = document.getElementById("20,"+radioId).value;
	document.getElementById("21,"+id).value = document.getElementById("21,"+radioId).value;
	document.getElementById("22,"+id).value = document.getElementById("22,"+radioId).value;
	document.getElementById("23,"+id).value = document.getElementById("23,"+radioId).value;
	document.getElementById("24,"+id).value = document.getElementById("24,"+radioId).value;
}
 </script>
<body onkeyup="keystoke()">
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
	<td width="21" align="center" bordercolor="#666666" bgcolor="#99CC99"><span class="STYLE13">复制</span></td>
	<td width="21" align="center" bordercolor="#666666" bgcolor="#99CC99"><span class="STYLE13"></span></td>
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
        <%int x = 0; int y = index; String focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        
          <%if (0 == index%7) {%>
          <%=index/6+1%>
          <%}%>
          </span></td>
		<td><INPUT id='<%=index%>' type="radio" value='<%=index%>' name="RadioGroup"/></td>  
		<td><input id='<%=index%>'  name='<%=index%>'  type="button" value="粘贴" onclick="copy(this.id)" /></td>  
        <td align="center"> <%if (0 == index%7) {x = 1; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yearMonthDay" indexed="true" size="7" maxlength="10" onclick="WdatePicker()"></html:text> <%} else {%>  <%}%> </td>
        <td align="center">
        <%if (0 == index%7) {x = 2; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> 
        <html:select styleId='<%=focusIndex%>' name="inputByNewList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>

        <%} else {%>  <%}%>
        </td>
        
        <td align="center"> <%if (0 == index%7) {x = 3; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="luCi" indexed="true" size="7" maxlength="9"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {%> <%} else {x = 4; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="junPin" indexed="true" size="7" maxlength="10"></html:text> <%}%> </td>
        <%x = 5; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="guiGe" indexed="true" size="7" maxlength="10"></html:text></td>

        <td align="center"> <%if (0 == index%7) {x = 6; focusIndex = String.valueOf(x) + "," + String.valueOf(y); %> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 7; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 8; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 9; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="mg" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 10; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 11; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <%x = 12; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        
        <td align="center"> <%if (0 == index%7) {x = 13; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <%x = 14; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 15; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 16; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 17; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 18; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 19; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 20; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <%x = 21; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <%x = 22; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <%x = 23; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <%x = 24; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        
        <td align="center"> <%if (0 == index%7) {x = 25; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 26; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 27; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 28; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 29; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 30; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 31; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 32; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x =33; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 34; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 35; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 36; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="sunHaoKg" indexed="true" size="1" style="width:50px" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        
        <td align="center"> <%if (0 == index%7) {x = 37; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 38; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 39; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 40; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 41; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 42; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 43; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        
        <td align="center"> <%if (0 == index%7) {x = 44; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <html:select styleId='<%=focusIndex%>' name="inputByNewList" property="tongDao" indexed="true">
                       <html:option value="0">√</html:option>
                       <html:option value="1">×</html:option>
        </html:select><%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%7) {x = 45; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByNewList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text><%} else {%>  <%}%></td>
        <%x = 46; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td align="center"><html:text styleId='<%=focusIndex%>' name="inputByNewList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate>
</logic:equal>
<logic:equal name="inputByNewForm" property="role" value="2">
<logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
          <%if (0 == index%7) {%>
          <%=index/6+1%>
          <%}%>
          </span></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center">
        <%if (0 == index%7) {%> 
        <html:select name="inputByNewList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>

        <%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="luCi" indexed="true" size="7" maxlength="9"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <%} else {%> <html:text name="inputByNewList" property="junPin" indexed="true" size="7" maxlength="10"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="guiGe" indexed="true" size="7" maxlength="10"></html:text></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="mg" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text><%} else {%>  <%}%></td>
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
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true" size="1" style="width:50px" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%>
        <html:select name="inputByNewList" property="tongDao" indexed="true">
                       <html:option value="0">√</html:option>
                       <html:option value="1">×</html:option>
        </html:select><%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text><%} else {%>  <%}%></td>
        <td align="center"><html:text name="inputByNewList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate>
</logic:equal>
<logic:equal name="inputByNewForm" property="role" value="3">
<logic:iterate id="inputByNewList" name="inputByNewForm" property="inputByNewList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
          <%if (0 == index%7) {%>
          <%=index/7+1%>
          <%}%>
          </span></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="yearMonthDay" indexed="true" size="7" maxlength="10"  onchange="WdatePicker()"></html:text> <%} else {%>  <%}%> </td>
        <td align="center">
        <%if (0 == index%7) {%> 
        <html:select name="inputByNewList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>

        <%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="luCi" indexed="true" size="7" maxlength="9"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <%} else {%> <html:text name="inputByNewList" property="junPin" indexed="true" size="7" maxlength="10"></html:text> <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="guiGe" indexed="true" size="7" maxlength="10"></html:text></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="mg" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"><html:text name="inputByNewList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text><%} else {%>  <%}%></td>
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
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="sunHaoKg" indexed="true" size="1" style="width:50px" maxlength="6"></html:text> <%} else {%>  <%}%> </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text><%} else {%>  <%}%></td>
        <td align="center"> <%if (0 == index%7) {%>
        <html:select name="inputByNewList" property="tongDao" indexed="true">
                       <html:option value="0">√</html:option>
                       <html:option value="1">×</html:option>
        </html:select><%} else {%>  <%}%>
        </td>
        <td align="center"> <%if (0 == index%7) {%> <html:text name="inputByNewList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text><%} else {%>  <%}%></td>
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
