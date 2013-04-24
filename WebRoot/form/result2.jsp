<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>月生产数据统计表-含锰</title>
	</head>
	<body>
		<html:form action="/result2">
			<table>
				<tr>
					<td>****年**月生产数据统计表（等级：含锰）</td>
				</tr>
			</table>
			<table>
				<tr>
					<th>单位（期号）</th>
					<th>Fe</th>
					<th>Cl</th>
					<th>N</th>
					<th>O</th>
					<th>HB</th>
					<th>总毛重</th>
					<th>总炉数</th>
					<th>均毛重</th>
					<th>均Mg单耗</th>
					<th>均回收率</th>
					<th>净重量</th>
					<th>均净重</th>
					<th>0A级</th>
					<th>0A级率</th>
					<th>0级</th>
					<th>0级率</th>
					<th>0级以上</th>
					<th>1级</th>
					<th>1级率</th>
					<th>2级</th>
					<th>3级</th>
					<th>4级</th>
					<th>5级</th>
					<th>2级及以下</th>
					<th>2级及以下率</th>
				</tr>
				<logic:notEmpty name="AllINFOLIST">
					<logic:iterate id="tIronInfoBean" name="AllINFOLIST">
				<tr>
					<td><bean:write name="tIronInfoBean" property="qihao" ></bean:write>期
					<td><bean:write name="tIronInfoBean" property="fe" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="cl" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="n" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="o" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="hb" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="lushu" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="zongmaozhong" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="junmaozhong" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="junmgdanhao" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="junhuishoulv" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="zongjingzhong" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="junjingzhong" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j0Aji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j0Ajilv" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j0ji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j0jilv" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j0jiyishang" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j1ji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j1jilv" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j2ji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j3ji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j4ji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j5ji" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j2jijiyixia" ></bean:write>
					<td><bean:write name="tIronInfoBean" property="j2jijiyixialv" ></bean:write>				
				</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
		</html:form>
	</body>
</html>

