<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>信息补全/更新</title>
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
    //alert(e.keyCode);
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
    for(i=0;i<rPort.length;i++) {
        if(rPort[i].checked){
                radioId=rPort[i].value;
                //alert("radioId = " + radioId);
                break;
        }
    }
    //x14-24 fe-kaohedengjichumeng
    // alert("button id = " + id);
    // alert("button radioId = " + radioId);
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
    document.getElementById("25,"+id).value = document.getElementById("25,"+radioId).value;
}

</script>

<body>
<html:form action="/inputByUpdate">
  <div align="center">
    <p><img src="../jinda/image/1.jpg"/></p>
  </div>
  
  <script src="../jinda/My97DatePicker/WdatePicker.js" type="text/javascript"></script>

<table width="1024" align="center">
<tr>
<logic:equal name="inputByUpdateForm" property="deleteId" value="">
<td align="left"><span class="STYLE15">信息补全</span></td>
</logic:equal>
<logic:notEqual name="inputByUpdateForm" property="deleteId" value="">
<td align="left"><span class="STYLE15">信息更新</span></td>
</logic:notEqual>
<td align="right">
<html:submit property="Save">保&nbsp&nbsp&nbsp&nbsp存</html:submit>
<html:submit property="Backkk">返&nbsp&nbsp&nbsp&nbsp回</html:submit>
</td>
</tr>
</table>

<p></p>
<hr width="1024" />

<table width="3000" align="center" border=1 style="BORDER-COLLAPSE: collapse">
    <tr><html:errors property="errors"></html:errors></tr>
    <tr><html:errors property="error01"></html:errors></tr>    
    <html:hidden name="inputByUpdateForm" property="deleteId" ></html:hidden>
    <tr bgcolor="#006699">
    <td width="21" align="center" bordercolor="#666666" bgcolor="#99CC99"><span class="STYLE13">No.</span></td>
    <td width="21" align="center" bordercolor="#666666" bgcolor="#99CC99"><span class="STYLE13">复制</span></td>    
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

    <logic:equal name="inputByUpdateForm" property="role" value="1">
    <% int a=0; %>
     <logic:iterate id="inputByUpdateList" name="inputByUpdateForm" property="inputByUpdateList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
            <logic:empty  name="inputByUpdateList" property="junPin">
            <% a=a+1; %>
          <%=a%>
      </logic:empty>
          </span></td>
<%int x = 0; int y = index; String focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <td><INPUT id='<%=index%>' type="radio" value='<%=index%>' name="RadioGroup"/></td>  
        <td><input id='<%=index%>'  name='<%=index%>'  type="button" value="粘贴" onclick="copy(this.id)" /></td> 

        <td align="center"> 
                


<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 3; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yearMonthDay" indexed="true" size="7" maxlength="10" onclick="WdatePicker()"></html:text> 
</logic:empty>
        </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
        <html:select name="inputByUpdateList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>
            </logic:empty>
        </td>
        <td align="center">
        <%x = 4; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="luCi" indexed="true" size="7" maxlength="9" disabled="true"></html:text>
        <html:hidden name="inputByUpdateList" property="id" indexed="true" ></html:hidden>
        <html:hidden name="inputByUpdateList" property="luCi" indexed="true" ></html:hidden>
        </td>
        <td align="center">
            <logic:notEmpty  name="inputByUpdateList" property="junPin">  
            <%x = 5; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="junPin" indexed="true" size="7" maxlength="10"></html:text>
            </logic:notEmpty> 
        </td>
        <td align="center">
        <%x = 6; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="guiGe" indexed="true" size="7" maxlength="10" disabled="true"></html:text>
        <html:hidden name="inputByUpdateList" property="guiGe" indexed="true" ></html:hidden>
        </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 7; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text>
        </logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
<%x = 8; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
</td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 9; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 10; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="mg" indexed="true" size="2" maxlength="5"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 11; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 12; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text></logic:empty> 
        </td>
        <td align="center"><%x = 13; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 14; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text>
</logic:empty>
        </td>
        <td align="center"><%x = 15; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 16; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 17; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 18; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 19; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 20; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 21; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <td align="center"><%x = 22; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><%x = 23; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <td align="center"><%x = 24; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"><%x =25; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 26; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
             </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 27; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 28; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 29; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 30; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 31; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 32; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
             </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 33; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> 
        </logic:empty>
    </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 34; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text>
        </logic:empty>
             </td>
        <td align="center">
        <logic:empty  name="inputByUpdateList" property="junPin">
         <%x = 35; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text>
         </logic:empty>
          </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 36; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> 
        </logic:empty>
    </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 37; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="sunHaoKg" indexed="true" size="1" style="width:50px" maxlength="6"></html:text></logic:empty> 
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 38; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 39; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 40; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 41; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 42; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 43; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 44; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
            <logic:empty name="inputByUpdateList" property="junPin">
        <%x = 45; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%>
        <html:select styleId='<%=focusIndex%>' name="inputByUpdateList" property="tongDao" indexed="true">
           <html:option value="0">√</html:option>
           <html:option value="1">×</html:option>
        </html:select>
    </logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <%x = 46; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text>
</logic:empty>
        </td>
        <td align="center"><%x = 47; focusIndex = String.valueOf(x) + "," + String.valueOf(y);%> <html:text styleId='<%=focusIndex%>' name="inputByUpdateList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate> 

    </logic:equal>
    <logic:equal name="inputByUpdateForm" property="role" value="2">
<% int a=0; %>
       <logic:iterate id="inputByUpdateList" name="inputByUpdateForm" property="inputByUpdateList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
            <logic:empty  name="inputByUpdateList" property="junPin">
            <% a=a+1; %>
          <%=a%>
      </logic:empty>
          </span></td>
        <td align="center"> <html:text name="inputByUpdateList" property="yearMonthDay" indexed="true" size="7" maxlength="10"></html:text> </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
        <html:select name="inputByUpdateList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>
            </logic:empty>
        </td>
        <td align="center">
        <html:text name="inputByUpdateList" property="luCi" indexed="true" size="7" maxlength="9" disabled="true"></html:text>
        <html:hidden name="inputByUpdateList" property="id" indexed="true" ></html:hidden>
        <html:hidden name="inputByUpdateList" property="luCi" indexed="true" ></html:hidden>
        </td>
        <td align="center">
            <logic:notEmpty  name="inputByUpdateList" property="junPin">  
            <html:text name="inputByUpdateList" property="junPin" indexed="true" size="7" maxlength="10"></html:text>
            </logic:notEmpty> 
        </td>
        <td align="center">
        <html:text name="inputByUpdateList" property="guiGe" indexed="true" size="7" maxlength="10" disabled="true"></html:text>
        <html:hidden name="inputByUpdateList" property="guiGe" indexed="true" ></html:hidden>
        </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text>
        </logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
<html:text name="inputByUpdateList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
</td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="mg" indexed="true" size="2" maxlength="5"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text></logic:empty> 
        </td>
        <td align="center"><html:text name="inputByUpdateList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text>
</logic:empty>
        </td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
             </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
             </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> 
        </logic:empty>
    </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text>
        </logic:empty>
             </td>
        <td align="center">
        <logic:empty  name="inputByUpdateList" property="junPin">
         <html:text name="inputByUpdateList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text>
         </logic:empty>
          </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> 
        </logic:empty>
    </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="sunHaoKg" indexed="true" size="1" style="width:50px" maxlength="6"></html:text></logic:empty> 
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
        <html:select name="inputByUpdateList" property="tongDao" indexed="true">
           <html:option value="0">√</html:option>
           <html:option value="1">×</html:option>
        </html:select>
    </logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text>
</logic:empty>
        </td>
        <td align="center"><html:text name="inputByUpdateList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate> 

    </logic:equal>
    <logic:equal name="inputByUpdateForm" property="role" value="3">
<% int a=0; %>
       <logic:iterate id="inputByUpdateList" name="inputByUpdateForm" property="inputByUpdateList" indexId="index">
    <tr>
        <td bordercolor="#666666" align="center"><span class="STYLE14">
            <logic:empty  name="inputByUpdateList" property="junPin">
            <% a=a+1; %>
          <%=a%>
      </logic:empty>
          </span></td>
        <td align="center"> <html:text name="inputByUpdateList" property="yearMonthDay" indexed="true" size="7" maxlength="10"></html:text> </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
        <html:select name="inputByUpdateList" property="qiHao" indexed="true">
           <html:option value="1">1</html:option>
           <html:option value="2">2</html:option>
           <html:option value="3">3</html:option>
           <html:option value="4">4</html:option>
        </html:select>
            </logic:empty>
        </td>
        <td align="center">
        <html:text name="inputByUpdateList" property="luCi" indexed="true" size="7" maxlength="9" disabled="true"></html:text>
        <html:hidden name="inputByUpdateList" property="id" indexed="true" ></html:hidden>
        <html:hidden name="inputByUpdateList" property="luCi" indexed="true" ></html:hidden>
        </td>
        <td align="center">
            <logic:notEmpty  name="inputByUpdateList" property="junPin">  
            <html:text name="inputByUpdateList" property="junPin" indexed="true" size="7" maxlength="10"></html:text>
            </logic:notEmpty> 
        </td>
        <td align="center">
        <html:text name="inputByUpdateList" property="guiGe" indexed="true" size="7" maxlength="10" disabled="true"></html:text>
        <html:hidden name="inputByUpdateList" property="guiGe" indexed="true" ></html:hidden>
        </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shengChanLuHao" indexed="true" size="1" maxlength="2"></html:text>
        </logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
<html:text name="inputByUpdateList" property="fanYingQiHao" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
</td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shiYongCiShu" indexed="true" size="1" maxlength="2"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="mg" indexed="true" size="2" maxlength="5"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="tiCl4" indexed="true" size="3" maxlength="6"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="maoZhong" indexed="true" size="2" maxlength="5"></html:text></logic:empty> 
        </td>
        <td align="center"><html:text name="inputByUpdateList" property="jingZhong" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="chengPinLv" indexed="true" size="3" maxlength="6"></html:text>
</logic:empty>
        </td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuFe" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuSi" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuCl" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuC" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuN" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuO" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuH" indexed="true" size="2" maxlength="6"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuMn" indexed="true" size="2" maxlength="5"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="yuanSuHb" indexed="true" size="1" maxlength="3"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="dengJiHanMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"><html:text name="inputByUpdateList" property="kaoHeDengJiChuMeng" indexed="true" size="1" maxlength="2"></html:text></td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="gongYiTiaoZheng" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
             </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="gongYiShiYan" indexed="true" size="5" maxlength="6"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="diPiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shangMaoKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="paBiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiDiPiKg" indexed="true" size="1" maxlength="4"></html:text> 
</logic:empty>
        </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiShangMaoKg" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
             </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiPaBiKg" indexed="true" size="1" maxlength="4"></html:text> 
        </logic:empty>
    </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="feiTaiFenKg" indexed="true" size="1" maxlength="4"></html:text>
        </logic:empty>
             </td>
        <td align="center">
        <logic:empty  name="inputByUpdateList" property="junPin">
         <html:text name="inputByUpdateList" property="ciYuanKg" indexed="true" size="1" maxlength="4"></html:text>
         </logic:empty>
          </td>
        <td align="center"> 
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shouXuanFeiLiaoKg" indexed="true" size="1" maxlength="4"></html:text> 
        </logic:empty>
    </td>
        <td align="center"> 
            <logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="sunHaoKg" indexed="true" size="1" style="width:50px" maxlength="6"></html:text></logic:empty> 
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="zongPaiMeiLiangKg" indexed="true" size="2" maxlength="6"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="chuLuZhenKongDu" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="yuanZuiGaoWenDu" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="zhengLiuGaoHengDian" indexed="true" size="1" maxlength="4"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="zhuanZhengLiu" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="jiaShouCi" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="jiaMoCi" indexed="true" size="7" maxlength="10"></html:text>
</logic:empty>
        </td>
        <td align="center">
            <logic:empty  name="inputByUpdateList" property="junPin">
        <html:select name="inputByUpdateList" property="tongDao" indexed="true">
           <html:option value="0">√</html:option>
           <html:option value="1">×</html:option>
        </html:select>
    </logic:empty>
        </td>
        <td align="center">
<logic:empty  name="inputByUpdateList" property="junPin">
            <html:text name="inputByUpdateList" property="shengChanGuZhang" indexed="true" size="1" maxlength="2"></html:text>
</logic:empty>
        </td>
        <td align="center"><html:text name="inputByUpdateList" property="beiZhuShuoMing" indexed="true" size="10" maxlength="200"></html:text></td>
    </tr>
  </logic:iterate> 

    </logic:equal>

  
</table>
<p>&nbsp;</p>

<hr width="1200" />
<table align="center">
    <tr>
        <td><span class="STYLE9">Copyright 大连毅展科技有限公司 2013 Dalian Ejustech Co., Ltd.</span></td>
    <tr>
</table>
</html:form>
</body>
</html>
