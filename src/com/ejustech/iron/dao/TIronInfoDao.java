package com.ejustech.iron.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ejustech.iron.common.Output;
import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.form.Result1FormBean;
import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.Result3FormBean;
import com.ejustech.iron.databean.form.Result4FormBean;
import com.ejustech.iron.databean.form.Result5FormBean;

/***
 * T_Iron_Info表的数据访问对象
 */
public class TIronInfoDao extends BaseDao {

	// 全部信息输出表
	public ArrayList<Result1FormBean> getAllInfoList(
			HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result1FormBean> allInfoList = new ArrayList<Result1FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append(" SELECT");
		sqlBuffer.append(" *");
		sqlBuffer.append(" FROM");
		sqlBuffer.append(" ironinfo");

		String sql = sqlBuffer.append(sqlCondition).toString();
		System.out.println("sql=" + sql);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				Result1FormBean result1FormBean = new Result1FormBean();
//				String index = String.valueOf(resultSet.getRow());
				result1FormBean.setIndex(resultSet.getString("luci")+","+resultSet.getString("guige"));
				result1FormBean.setRiqi(resultSet.getString("riqi"));
				result1FormBean.setQihao(resultSet.getString("qihao"));
				result1FormBean.setLuci(resultSet.getString("luci"));
				if (!resultSet.getString("junpin").equals("")) {
					result1FormBean.setJunpin("("
							+ resultSet.getString("junpin") + ")");
				} else {
					result1FormBean.setJunpin(resultSet.getString("junpin"));
				}
				result1FormBean.setGuige(resultSet.getString("guige"));
				result1FormBean.setShengchanluhao(resultSet
						.getString("shengchanluhao"));
				result1FormBean.setFanyingqihao(resultSet
						.getString("fanyingqihao"));
				result1FormBean.setShiyongcishu(resultSet
						.getString("shiyongcishu"));
				result1FormBean.setMg(resultSet.getString("mg"));
				result1FormBean.setTicl(resultSet.getString("ticl"));
				result1FormBean.setMaozhong(resultSet.getString("maozhong"));
				result1FormBean.setJingzhong(resultSet.getString("jingzhong"));
				String cpl = Output.getSubValue(Output
						.getPercentValue(resultSet.getString("chengpinlv")), 2)
						+ "%";
				result1FormBean.setChengpinlv(cpl);
				result1FormBean.setFe(resultSet.getString("fe"));
				result1FormBean.setSi(resultSet.getString("si"));
				result1FormBean.setCl(resultSet.getString("cl"));
				result1FormBean.setC(resultSet.getString("c"));
				result1FormBean.setO(resultSet.getString("n"));
				result1FormBean.setN(resultSet.getString("o"));
				result1FormBean.setH(resultSet.getString("h"));
				result1FormBean.setMn(resultSet.getString("mn"));
				result1FormBean.setHb(resultSet.getString("hb"));
				result1FormBean.setDengji_hanmeng(resultSet
						.getString("dengji_hanmeng"));
				result1FormBean.setKaohedengji_chumeng(resultSet
						.getString("kaohedengji_chumeng"));
				result1FormBean.setGongyitiaozheng(resultSet
						.getString("gongyitiaozheng"));
				result1FormBean.setGongyishiyan(resultSet
						.getString("gongyishiyan"));
				result1FormBean.setDipi(resultSet.getString("dipi"));
				result1FormBean.setShangmao(resultSet.getString("shangmao"));
				result1FormBean.setPabi(resultSet.getString("pabi"));
				result1FormBean.setFeidipi(resultSet.getString("feidipi"));
				result1FormBean.setFeishangmao(resultSet
						.getString("feishangmao"));
				result1FormBean.setFeipabi(resultSet.getString("feipabi"));
				result1FormBean.setFeitaifen(resultSet.getString("feitaifen"));
				result1FormBean.setCixuan(resultSet.getString("cixuan"));
				result1FormBean.setShouxuanfeiliao(resultSet
						.getString("shouxuanfeiliao"));
				result1FormBean.setSunhao(resultSet.getString("sunhao"));
				result1FormBean.setZongpaimeiliang(resultSet
						.getString("zongpaimeiliang"));
				result1FormBean.setChuluzhenkongdu(resultSet
						.getString("chuluzhenkongdu"));
				result1FormBean.setHuanyuanzuigaowendu(resultSet
						.getString("huanyuanzuigaowendu"));
				result1FormBean.setZhengliugaoheng(resultSet
						.getString("zhengliugaoheng"));
				result1FormBean.setZhuanzhengliu(resultSet
						.getString("zhuanzhengliu"));
				result1FormBean.setJiashouci(resultSet.getString("jiashouci"));
				result1FormBean.setJiamoci(resultSet.getString("jiamoci"));
				result1FormBean.setTongdao(resultSet.getString("tongdao"));
				result1FormBean.setShengchanguzhang(resultSet
						.getString("shengchanguzhang"));
				result1FormBean.setBeizhushuoming(resultSet
						.getString("beizhushuoming"));

				allInfoList.add(result1FormBean);
			}
			return allInfoList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	// 月生产数据统计表-含锰
	public ArrayList<Result2FormBean> getHanmengList(
			HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result2FormBean> chumengList = new ArrayList<Result2FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sqlBuffer
				.append(" SELECT t1.qihao,t2.fe,t2.cl,t2.n,t2.o,t2.hb,t1.zonglushu,t2.zongmaozhong,t2.zongmaozhong/t1.zonglushu AS junmaozhong,t2.mgzongliang*1000/t2.zongmaozhong AS junmgdanhao,t2.zongjingzhong/t2.zongmaozhong AS junhuishoulv,t2.zongjingzhong,t2.zongjingzhong/t1.zonglushu AS junjingzhong,tj0A.0Aji,tj0A.0Ajilv,tj0.0ji,tj0.0jilv,(tj0A.0Aji+tj0.0ji)/t2.zongmaozhong as 0jiyishang,tj1.1ji,tj1.1jilv,tj2.2ji,tj3.3ji,tj4.4ji,tj5.5ji,tj2u.2jijiyixia,tj2u.2jijiyixialv FROM");

		sqlBuffer
				.append(
						" (SELECT qihao,count(qihao) AS zonglushu FROM ironinfo WHERE junpin !='军品'")
				.append(sqlBuffer2).append(" GROUP BY qihao)t1,");
		sqlBuffer
				.append(
						" (SELECT qihao,sum(jingzhong*fe)/sum(jingzhong) AS fe,sum(jingzhong*cl)/sum(jingzhong) AS cl,sum(jingzhong*n)/sum(jingzhong) AS n,sum(jingzhong*o)/sum(jingzhong) AS o,sum(jingzhong*hb)/sum(jingzhong) AS hb ,sum(maozhong) AS zongmaozhong,sum(mg) AS mgzongliang,sum(jingzhong) AS zongjingzhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t2,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_0A.0Aji as 0Aji,j_0A.0Aji/t_1.zongmaozhong as 0Ajilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0Aji FROM ironinfo WHERE dengji_hanmeng = '0A'")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_0A ON (t_1.qihao = j_0A.qihao) GROUP BY t_1.qihao)tj0A,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_0.0ji as 0ji,j_0.0ji/t_1.zongmaozhong as 0jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0ji FROM ironinfo WHERE dengji_hanmeng = '0' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_0 ON (t_1.qihao = j_0.qihao) GROUP BY t_1.qihao)tj0,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_1.1ji as 1ji,j_1.1ji/t_1.zongmaozhong as 1jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 1ji FROM ironinfo WHERE dengji_hanmeng = '1' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_1 ON (t_1.qihao = j_1.qihao) GROUP BY t_1.qihao)tj1,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_2.2ji as 2ji,j_2.2ji/t_1.zongmaozhong as 2jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2ji FROM ironinfo WHERE dengji_hanmeng = '2' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_2 ON (t_1.qihao = j_2.qihao) GROUP BY t_1.qihao)tj2,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_3.3ji as 3ji,j_3.3ji/t_1.zongmaozhong as 3jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 3ji FROM ironinfo WHERE dengji_hanmeng = '3' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_3 ON (t_1.qihao = j_3.qihao) GROUP BY t_1.qihao)tj3,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_4.4ji as 4ji,j_4.4ji/t_1.zongmaozhong as 4jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 4ji FROM ironinfo WHERE dengji_hanmeng = '4' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_4 ON (t_1.qihao = j_4.qihao) GROUP BY t_1.qihao)tj4,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_5.5ji as 5ji,j_5.5ji/t_1.zongmaozhong as 5jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 5ji FROM ironinfo WHERE dengji_hanmeng = '5' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_5 ON (t_1.qihao = j_5.qihao) GROUP BY t_1.qihao)tj5,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_2u.2jijiyixia as 2jijiyixia,j_2u.2jijiyixia/t_1.zongmaozhong as 2jijiyixialv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2jijiyixia FROM ironinfo WHERE dengji_hanmeng ='2' or dengji_hanmeng ='3' or dengji_hanmeng ='4' or dengji_hanmeng ='5' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_2u ON (t_1.qihao = j_2u.qihao) GROUP BY t_1.qihao)tj2u");
		sqlBuffer
				.append(" WHERE t1.qihao = t2.qihao AND t1.qihao = tj0A.qihao AND t1.qihao = tj0.qihao AND t1.qihao = tj1.qihao AND t1.qihao = tj2.qihao AND t1.qihao = tj3.qihao AND t1.qihao = tj4.qihao AND t1.qihao = tj5.qihao AND t1.qihao = tj2u.qihao GROUP BY t1.qihao");

		System.out.println("sql=" + sqlBuffer);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {

				Result2FormBean result2FormBean = new Result2FormBean();

				result2FormBean.setQihao(resultSet.getString("qihao"));
				result2FormBean.setFe(Output.getSubValue(resultSet
						.getString("fe"), 4));
				result2FormBean.setCl(Output.getSubValue(resultSet
						.getString("cl"), 4));
				result2FormBean.setO(Output.getSubValue(resultSet
						.getString("n"), 4));
				result2FormBean.setN(Output.getSubValue(resultSet
						.getString("o"), 4));
				result2FormBean.setHb(Output.getSubValue(resultSet
						.getString("hb"), 0));
				result2FormBean.setZongmaozhong(Output.getSubValue(resultSet
						.getString("zongmaozhong"), 0));
				result2FormBean.setZonglushu(resultSet.getString("zonglushu"));
				result2FormBean.setJunmaozhong(Output.getSubValue(resultSet
						.getString("junmaozhong"), 0));
				result2FormBean.setJunmgdanhao(Output.getSubValue(resultSet
						.getString("junmgdanhao"), 3));
				result2FormBean.setJunhuishoulv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("junhuishoulv")),
						2)
						+ "%");
				result2FormBean.setZongjingzhong(Output.getSubValue(resultSet
						.getString("zongjingzhong"), 0));
				result2FormBean.setJunjingzhong(Output.getSubValue(resultSet
						.getString("junjingzhong"), 0));
				result2FormBean.setJ0Aji(resultSet.getString("0Aji"));
				result2FormBean.setJ0Ajilv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("0Ajilv")), 2)
						+ "%");
				result2FormBean.setJ0ji(resultSet.getString("0ji"));
				result2FormBean.setJ0jilv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("0jilv")), 2)
						+ "%");
				result2FormBean.setJ0jiyishang(resultSet
						.getString("0jiyishang"));
				result2FormBean.setJ1ji(resultSet.getString("1ji"));
				result2FormBean.setJ1jilv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("1jilv")), 2)
						+ "%");
				result2FormBean.setJ2ji(resultSet.getString("2ji"));
				result2FormBean.setJ3ji(resultSet.getString("3ji"));
				result2FormBean.setJ4ji(resultSet.getString("4ji"));
				result2FormBean.setJ5ji(resultSet.getString("5ji"));
				result2FormBean.setJ2jijiyixia(resultSet
						.getString("2jijiyixia"));
				result2FormBean.setJ2jijiyixialv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("2jijiyixialv")),
						2)
						+ "%");

				chumengList.add(result2FormBean);
			}
			return chumengList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	// 月生产数据统计表-除锰
	public ArrayList<Result3FormBean> getChumengList(
			HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result3FormBean> chumengList = new ArrayList<Result3FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sqlBuffer
				.append(" SELECT t1.qihao,t2.fe,t2.cl,t2.n,t2.o,t2.hb,t1.zonglushu,t2.zongmaozhong,t2.zongmaozhong/t1.zonglushu AS junmaozhong,t2.mgzongliang*1000/t2.zongmaozhong AS junmgdanhao,t2.zongjingzhong/t2.zongmaozhong AS junhuishoulv,t2.zongjingzhong,t2.zongjingzhong/t1.zonglushu AS junjingzhong,tj0A.0Aji,tj0A.0Ajilv,tj0.0ji,tj0.0jilv,(tj0A.0Aji+tj0.0ji)/t2.zongmaozhong as 0jiyishang,tj1.1ji,tj1.1jilv,tj2.2ji,tj3.3ji,tj4.4ji,tj5.5ji,tj2u.2jijiyixia,tj2u.2jijiyixialv FROM");

		sqlBuffer
				.append(
						" (SELECT qihao,count(qihao) AS zonglushu FROM ironinfo WHERE junpin !='军品'")
				.append(sqlBuffer2).append(" GROUP BY qihao)t1,");
		sqlBuffer
				.append(
						" (SELECT qihao,sum(jingzhong*fe)/sum(jingzhong) AS fe,sum(jingzhong*cl)/sum(jingzhong) AS cl,sum(jingzhong*n)/sum(jingzhong) AS n,sum(jingzhong*o)/sum(jingzhong) AS o,sum(jingzhong*hb)/sum(jingzhong) AS hb ,sum(maozhong) AS zongmaozhong,sum(mg) AS mgzongliang,sum(jingzhong) AS zongjingzhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t2,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_0A.0Aji as 0Aji,j_0A.0Aji/t_1.zongmaozhong as 0Ajilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_0A ON (t_1.qihao = j_0A.qihao) GROUP BY t_1.qihao)tj0A,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_0.0ji as 0ji,j_0.0ji/t_1.zongmaozhong as 0jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_0 ON (t_1.qihao = j_0.qihao) GROUP BY t_1.qihao)tj0,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_1.1ji as 1ji,j_1.1ji/t_1.zongmaozhong as 1jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_1 ON (t_1.qihao = j_1.qihao) GROUP BY t_1.qihao)tj1,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_2.2ji as 2ji,j_2.2ji/t_1.zongmaozhong as 2jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2ji FROM ironinfo WHERE kaohedengji_chumeng = '2' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_2 ON (t_1.qihao = j_2.qihao) GROUP BY t_1.qihao)tj2,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_3.3ji as 3ji,j_3.3ji/t_1.zongmaozhong as 3jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 3ji FROM ironinfo WHERE kaohedengji_chumeng = '3' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_3 ON (t_1.qihao = j_3.qihao) GROUP BY t_1.qihao)tj3,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_4.4ji as 4ji,j_4.4ji/t_1.zongmaozhong as 4jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 4ji FROM ironinfo WHERE kaohedengji_chumeng = '4' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_4 ON (t_1.qihao = j_4.qihao) GROUP BY t_1.qihao)tj4,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_5.5ji as 5ji,j_5.5ji/t_1.zongmaozhong as 5jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 5ji FROM ironinfo WHERE kaohedengji_chumeng = '5' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_5 ON (t_1.qihao = j_5.qihao) GROUP BY t_1.qihao)tj5,");
		sqlBuffer
				.append(
						" (SELECT t_1.qihao as qihao,j_2u.2jijiyixia as 2jijiyixia,j_2u.2jijiyixia/t_1.zongmaozhong as 2jijiyixialv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer1)
				.append(
						" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng ='2' or kaohedengji_chumeng ='3' or kaohedengji_chumeng ='4' or kaohedengji_chumeng ='5' ")
				.append(sqlBuffer2)
				.append(
						" GROUP BY qihao)j_2u ON (t_1.qihao = j_2u.qihao) GROUP BY t_1.qihao)tj2u");
		sqlBuffer
				.append(" WHERE t1.qihao = t2.qihao AND t1.qihao = tj0A.qihao AND t1.qihao = tj0.qihao AND t1.qihao = tj1.qihao AND t1.qihao = tj2.qihao AND t1.qihao = tj3.qihao AND t1.qihao = tj4.qihao AND t1.qihao = tj5.qihao AND t1.qihao = tj2u.qihao GROUP BY t1.qihao");

		System.out.println("sql=" + sqlBuffer);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {

				Result3FormBean result3FormBean = new Result3FormBean();

				result3FormBean.setQihao(resultSet.getString("qihao"));
				result3FormBean.setFe(Output.getSubValue(resultSet
						.getString("fe"), 4));
				result3FormBean.setCl(Output.getSubValue(resultSet
						.getString("cl"), 4));
				result3FormBean.setO(Output.getSubValue(resultSet
						.getString("n"), 4));
				result3FormBean.setN(Output.getSubValue(resultSet
						.getString("o"), 4));
				result3FormBean.setHb(Output.getSubValue(resultSet
						.getString("hb"), 0));
				result3FormBean.setZongmaozhong(Output.getSubValue(resultSet
						.getString("zongmaozhong"), 0));
				result3FormBean.setZonglushu(resultSet.getString("zonglushu"));
				result3FormBean.setJunmaozhong(Output.getSubValue(resultSet
						.getString("junmaozhong"), 0));
				result3FormBean.setJunmgdanhao(Output.getSubValue(resultSet
						.getString("junmgdanhao"), 3));
				result3FormBean.setJunhuishoulv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("junhuishoulv")),
						2)
						+ "%");
				result3FormBean.setZongjingzhong(Output.getSubValue(resultSet
						.getString("zongjingzhong"), 0));
				result3FormBean.setJunjingzhong(Output.getSubValue(resultSet
						.getString("junjingzhong"), 0));
				result3FormBean.setJ0Aji(resultSet.getString("0Aji"));
				result3FormBean.setJ0Ajilv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("0Ajilv")), 2)
						+ "%");
				result3FormBean.setJ0ji(resultSet.getString("0ji"));
				result3FormBean.setJ0jilv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("0jilv")), 2)
						+ "%");
				result3FormBean.setJ0jiyishang(resultSet
						.getString("0jiyishang"));
				result3FormBean.setJ1ji(resultSet.getString("1ji"));
				result3FormBean.setJ1jilv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("1jilv")), 2)
						+ "%");
				result3FormBean.setJ2ji(resultSet.getString("2ji"));
				result3FormBean.setJ3ji(resultSet.getString("3ji"));
				result3FormBean.setJ4ji(resultSet.getString("4ji"));
				result3FormBean.setJ5ji(resultSet.getString("5ji"));
				result3FormBean.setJ2jijiyixia(resultSet
						.getString("2jijiyixia"));
				result3FormBean.setJ2jijiyixialv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("2jijiyixialv")),
						2)
						+ "%");

				chumengList.add(result3FormBean);
			}
			return chumengList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	// 月等外钛统计表
	public ArrayList<Result4FormBean> getWaitaiList(HttpServletRequest request,
			String sqlCondition) throws Exception {

		ArrayList<Result4FormBean> waitaiList = new ArrayList<Result4FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sqlBuffer.append("SELECT ");
		sqlBuffer.append("t1.qihao, ");
		sqlBuffer.append("t1.zonglushu, ");
		sqlBuffer.append("t2.zongmaozhong/t1.zonglushu AS junmaozhong, ");
		sqlBuffer.append("t2.zongjingzhong/t1.zonglushu AS junjingzhong, ");
		sqlBuffer.append("t2.zongjingzhong/t2.zongmaozhong AS junhuishoulv, ");
		sqlBuffer.append("t2.dipi/t1.zonglushu AS dipi, ");
		sqlBuffer.append("t2.shangmao/t1.zonglushu AS shangmao, ");
		sqlBuffer.append("t2.pabi/t1.zonglushu AS pabi, ");
		sqlBuffer.append("t2.feidipi/t1.zonglushu AS feidipi, ");
		sqlBuffer.append("t2.feidipi/t2.zongmaozhong AS feidipibili, ");
		sqlBuffer.append("t2.feishangmao/t1.zonglushu AS feishangmao, ");
		sqlBuffer.append("t2.feishangmao/t2.zongmaozhong AS feishangmaobili, ");
		sqlBuffer.append("t2.feipabi/t1.zonglushu AS feipabi, ");
		sqlBuffer.append("t2.feipabi/t2.zongmaozhong AS feipabibili, ");
		sqlBuffer
				.append("t2.shaixuanfeiliao/t1.zonglushu AS shaixuanfeiliao, ");
		sqlBuffer.append("t2.cixuanfeiliao/t1.zonglushu AS cixuanfeiliao, ");
		sqlBuffer
				.append("t2.shouxuanfeiliao/t1.zonglushu AS shouxuanfeiliao, ");
		sqlBuffer.append("t2.sunhao/t1.zonglushu AS sunhao ");
		sqlBuffer.append("FROM ");
		sqlBuffer
				.append(
						"(SELECT qihao,count(qihao) AS zonglushu FROM ironinfo WHERE junpin !='军品'")
				.append(sqlBuffer2).append(" GROUP BY qihao)t1, ");
		sqlBuffer.append("(SELECT  ");
		sqlBuffer.append("qihao,sum(maozhong) AS zongmaozhong, ");
		sqlBuffer.append("sum(jingzhong) AS zongjingzhong, ");
		sqlBuffer.append("SUM(dipi) AS dipi, ");
		sqlBuffer.append("SUM(shangmao) AS shangmao, ");
		sqlBuffer.append("SUM(pabi) AS pabi, ");
		sqlBuffer.append("SUM(feidipi) AS feidipi, ");
		sqlBuffer.append("SUM(feishangmao) AS feishangmao, ");
		sqlBuffer.append("SUM(feipabi) AS feipabi, ");
		sqlBuffer.append("SUM(feitaifen) AS shaixuanfeiliao, ");
		sqlBuffer.append("SUM(cixuan) AS cixuanfeiliao, ");
		sqlBuffer.append("SUM(shouxuanfeiliao) AS shouxuanfeiliao, ");
		sqlBuffer.append("SUM(sunhao) AS sunhao   ");
		sqlBuffer.append("FROM ironinfo ").append(sqlBuffer1).append(
				" GROUP BY qihao)t2 ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("t1.qihao = t2.qihao ");
		sqlBuffer.append("GROUP BY ");
		sqlBuffer.append("t1.qihao ");

		System.out.println("sql=" + sqlBuffer);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {

				Result4FormBean result4FormBean = new Result4FormBean();

				result4FormBean.setQihao(resultSet.getString("qihao"));
				result4FormBean.setZonglushu(resultSet.getString("zonglushu"));
				result4FormBean.setJunmaozhong(Output.getSubValue(resultSet
						.getString("junmaozhong"), 0));
				result4FormBean.setJunjingzhong(Output.getSubValue(resultSet
						.getString("junjingzhong"), 0));
				result4FormBean.setJunhuishoulv(Output.getSubValue(Output
						.getPercentValue(resultSet.getString("junhuishoulv")),
						2)
						+ "%");
				result4FormBean.setDipi(Output.getSubValue(resultSet
						.getString("dipi"), 2));
				result4FormBean.setShangmao(Output.getSubValue(resultSet
						.getString("shangmao"), 2));
				result4FormBean.setPabi(Output.getSubValue(resultSet
						.getString("pabi"), 2));
				result4FormBean.setFeidipi(Output.getSubValue(resultSet
						.getString("feidipi"), 2));
				result4FormBean.setFeidipibili(Output
						.getSubValue(Output.getPercentValue(resultSet
								.getString("feidipibili")), 2)
						+ "%");
				result4FormBean.setFeishangmao(Output.getSubValue(resultSet
						.getString("feishangmao"), 2));
				result4FormBean.setFeishangmaobili(Output.getSubValue(
						Output.getPercentValue(resultSet
								.getString("feishangmaobili")), 2)
						+ "%");
				result4FormBean.setFeipabi(Output.getSubValue(resultSet
						.getString("feipabi"), 2));
				result4FormBean.setFeipabibili(Output
						.getSubValue(Output.getPercentValue(resultSet
								.getString("feipabibili")), 2)
						+ "%");
				result4FormBean.setShaixuanfeiliao(Output.getSubValue(resultSet
						.getString("shaixuanfeiliao"), 2));
				result4FormBean.setCixuanfeiliao(Output.getSubValue(resultSet
						.getString("cixuanfeiliao"), 1));
				result4FormBean.setShouxuanfeiliao(Output.getSubValue(resultSet
						.getString("shouxuanfeiliao"), 2));
				result4FormBean.setSunhao(Output.getSubValue(resultSet
						.getString("sunhao"), 2));

				waitaiList.add(result4FormBean);
			}
			return waitaiList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}
	
	//月指标统计表
	public ArrayList<Result5FormBean> getZhibiaoList(HttpServletRequest request,
			String sqlCondition) throws Exception {

		ArrayList<Result5FormBean> zhibiaoList = new ArrayList<Result5FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sqlBuffer.append("SELECT  ");
		sqlBuffer.append("t.qihao, ");
		sqlBuffer.append("t.zongmaozhong, ");
		sqlBuffer.append("t.zongjingzhong, ");
		sqlBuffer.append("tj2u.2jijiyixialv, ");
		sqlBuffer.append("tfe008.fe008, ");
		sqlBuffer.append("tfe005.fe005, ");
		sqlBuffer.append("tcl008.cl008, ");
		sqlBuffer.append("tcl006.cl006, ");
		sqlBuffer.append("to008.o008, ");
		sqlBuffer.append("to005.o005, ");
		sqlBuffer.append("tn001.n001, ");
		sqlBuffer.append("tfecl008.fecl008, ");		
		sqlBuffer.append("tfe008.fe008bili, ");
		sqlBuffer.append("tfe005.fe005bili, ");
		sqlBuffer.append("tcl008.cl008bili, ");
		sqlBuffer.append("tcl006.cl006bili, ");
		sqlBuffer.append("to008.o008bili, ");
		sqlBuffer.append("to005.o005bili, ");
		sqlBuffer.append("tn001.n001bili, ");
		sqlBuffer.append("tfecl008.fecl008bili ");
		
		sqlBuffer.append("FROM ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong, SUM(jingzhong) AS zongjingzhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t, ");
		sqlBuffer.append("(SELECT t_1.qihao as qihao,j_2u.2jijiyixia as 2jijiyixia,j_2u.2jijiyixia/t_1.zongmaozhong as 2jijiyixialv FROM ");
		sqlBuffer.append("(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t_1 ");
		sqlBuffer.append("LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng in(2,3,4,5)")
				.append(sqlBuffer2).append(" GROUP BY qihao)j_2u ON (t_1.qihao = j_2u.qihao) GROUP BY t_1.qihao ");
		sqlBuffer.append(")tj2u, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS fe008,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS fe008bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE fe > 0.08")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))tfe008, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS fe005,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS fe005bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE fe > 0.05")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))tfe005, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS cl008,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS cl008bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE cl > 0.08")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))tcl008, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS cl006,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS cl006bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE cl > 0.06")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))tcl006, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS o008,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS o008bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE o > 0.08")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))to008, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS o005,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS o005bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE o > 0.05")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))to005, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS n001,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS n001bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE n > 0.01")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))tn001, ");
		sqlBuffer.append("(SELECT t1.qihao as qihao,  ");
		sqlBuffer.append("tm.zongjingzhong AS fecl008,  ");
		sqlBuffer.append("tm.zongjingzhong/t1.zongmaozhong AS fecl008bili  ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("(SELECT qihao, SUM(maozhong) AS zongmaozhong FROM")
				.append(sqlBuffer1).append(" ironinfo GROUP BY qihao)t1  ");
		sqlBuffer.append("LEFT JOIN  ");
		sqlBuffer.append("(SELECT qihao, SUM(jingzhong) AS zongjingzhong FROM ironinfo WHERE fe > 0.08 and cl > 0.08")
				.append(sqlBuffer2).append(" GROUP BY qihao)tm  ");
		sqlBuffer.append("ON  ");
		sqlBuffer.append("(t1.qihao = tm.qihao))tfecl008 ");
		sqlBuffer.append("WHERE t.qihao = tj2u.qihao ");
		sqlBuffer.append("AND t.qihao = tfe008.qihao ");
		sqlBuffer.append("AND t.qihao = tfe005.qihao ");
		sqlBuffer.append("AND t.qihao = tcl008.qihao ");
		sqlBuffer.append("AND t.qihao = tcl006.qihao ");
		sqlBuffer.append("AND t.qihao = to008.qihao ");
		sqlBuffer.append("AND t.qihao = to005.qihao ");
		sqlBuffer.append("AND t.qihao = tn001.qihao ");
		sqlBuffer.append("AND t.qihao = tn001.qihao ");
		sqlBuffer.append("AND t.qihao = tfecl008.qihao ");
		sqlBuffer.append("GROUP BY qihao ");

		System.out.println("sql=" + sqlBuffer);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {

				Result5FormBean result5FormBean = new Result5FormBean();

				result5FormBean.setQihao(resultSet.getString("qihao"));
				result5FormBean.setZongmaozhong(resultSet.getString("zongmaozhong"));
				result5FormBean.setZongjingzhong(resultSet.getString("zongjingzhong"));
				result5FormBean.setJ2jijiyixialv(resultSet.getString("2jijiyixialv"));
				result5FormBean.setFe008(resultSet.getString("fe008"));
				result5FormBean.setFe005(resultSet.getString("fe005"));				
				result5FormBean.setCl008(resultSet.getString("cl008"));				
				result5FormBean.setCl006(resultSet.getString("cl006"));				
				result5FormBean.setO008(resultSet.getString("o008"));				
				result5FormBean.setO005(resultSet.getString("o005"));				
				result5FormBean.setN001(resultSet.getString("n001"));
				result5FormBean.setFecl008(resultSet.getString("fecl008"));
				result5FormBean.setFe008bili(resultSet.getString("fe008bili"));
				result5FormBean.setFe005bili(resultSet.getString("fe005bili"));
				result5FormBean.setCl008bili(resultSet.getString("cl008bili"));
				result5FormBean.setCl006bili(resultSet.getString("cl006bili"));
				result5FormBean.setO008bili(resultSet.getString("o008bili"));
				result5FormBean.setO005bili(resultSet.getString("o005bili"));
				result5FormBean.setN001bili(resultSet.getString("n001bili"));
				result5FormBean.setFecl008bili(resultSet.getString("fecl008bili"));
				
				zhibiaoList.add(result5FormBean);
			}
			return zhibiaoList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

}
