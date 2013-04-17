package com.ejustech.iron.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.TIronInfoBean;

/***
 * T_Iron_Info表的数据访问对象
 * 
 */
public class TIronInfoDao extends BaseDao {
	/***
	 * 构造函数
	 */
	public TIronInfoDao() throws NamingException {
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findCounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet select() {
		// TODO Auto-generated method stub
		return null;
	}

	// 其他对IronInfo表的数据访问方法
	public ArrayList<TIronInfoBean> getAllInfoList(String riqi1, String riqi2,
			String qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1, String chuluzhenkongdu2,
			String zhuanzherngliu, String jiashouci, String jiamoci,
			String shiyanluci, String gongyitiaozhengluci, String tongdao,
			String shengchanguzhang, String huishoulv1, String huishoulv2,
			String zongpaimeiliang1, String zongpaimeiliang2, String fe1,
			String fe2, String hb1, String hb2, String cl1, String cl2)
			throws Exception {
		ArrayList<TIronInfoBean> allInfoList = new ArrayList<TIronInfoBean>();

		TIronInfoBean result1Form = null;
		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append("select");
		sqlBuffer.append(" *");
		sqlBuffer.append(" from");
		sqlBuffer.append(" ironinfo");

		if (!riqi1.equals("") || !riqi2.equals("") || !qihao.equals("")
				|| !luci1.equals("") || !luci2.equals("") || !guige.equals("")
				|| !shengchanluhao.equals("") || !fanyingqihao.equals("")
				|| !shiyongcishu.equals("") || !ticl41.equals("") || !ticl42.equals("")
				|| !chuluzhenkongdu1.equals("") || !chuluzhenkongdu2.equals("")
				|| !zhuanzherngliu.equals("") || !jiashouci.equals("")
				|| !jiamoci.equals("") || !shiyanluci.equals("")
				|| !gongyitiaozhengluci.equals("") || !tongdao.equals("")
				|| !shengchanguzhang.equals("") || !huishoulv1.equals("")
				|| !huishoulv2.equals("") || !zongpaimeiliang1.equals("")
				|| !zongpaimeiliang2.equals("") || !fe1.equals("")
				|| !fe2.equals("") || !hb1.equals("") || !hb2.equals("")
				|| !cl1.equals("") || !cl2.equals("")) {

			sqlBuffer.append(" where");
			
			if (!riqi1.equals("")) {
				sqlBuffer.append(" riqi between '");
				sqlBuffer.append(riqi1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(riqi2);
				sqlBuffer.append("'");
			}

//			if (!riqi2.equals("")) {
//				if (!riqi1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" riqi2 ='");
//				sqlBuffer.append(riqi2);
//				sqlBuffer.append("'");
//			}
//			
			if (!qihao.equals("")) {
				if (!riqi2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" qihao ='");
				sqlBuffer.append(qihao);
				sqlBuffer.append("'");
			}
			
			if (!luci1.equals("")) {
				if (!qihao.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" luci between '");
				sqlBuffer.append(luci1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(luci2);
				sqlBuffer.append("'");
			}

//			if (!luci2.equals("")) {
//				if (!luci1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" luci2 ='");
//				sqlBuffer.append(luci2);
//				sqlBuffer.append("'");
//			}
			
			if (!guige.equals("")) {
				if (!luci2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" guige ='");
				sqlBuffer.append(guige);
				sqlBuffer.append("'");
			}

			if (!shengchanluhao.equals("")) {
				if (!guige.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" shengchanluhao ='");
				sqlBuffer.append(shengchanluhao);
				sqlBuffer.append("'");
			}

			if (!fanyingqihao.equals("")) {
				if (!shengchanluhao.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fanyingqihao ='");
				sqlBuffer.append(fanyingqihao);
				sqlBuffer.append("'");
			}

			if (!shiyongcishu.equals("")) {
				if (!fanyingqihao.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" shiyongcishu ='");
				sqlBuffer.append(shiyongcishu);
				sqlBuffer.append("'");
			}

			if (!ticl41.equals("")) {
				if (!shiyongcishu.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" ticl4 between '");
				sqlBuffer.append(ticl41);
				sqlBuffer.append("' and '");
				sqlBuffer.append(ticl42);
				sqlBuffer.append("'");
			}
			
			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("") ) {
				if (!ticl42.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" chuluzhenkongdu <='");
				sqlBuffer.append(chuluzhenkongdu1);
				sqlBuffer.append("'");
			}else if (!chuluzhenkongdu2.equals("") && chuluzhenkongdu1.equals("")){
				if (!ticl42.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" chuluzhenkongdu >='");
				sqlBuffer.append(chuluzhenkongdu2);
				sqlBuffer.append("'");
			}else if (!chuluzhenkongdu2.equals("") && !chuluzhenkongdu1.equals("")){
				if (!ticl42.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" chuluzhenkongdu between '");
				sqlBuffer.append(chuluzhenkongdu1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(chuluzhenkongdu2);
				sqlBuffer.append("'");
			}

//			if (!chuluzhenkongdu2.equals("")) {
//				if (!chuluzhenkongdu1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" chuluzhenkongdu2 ='");
//				sqlBuffer.append(chuluzhenkongdu2);
//				sqlBuffer.append("'");
//			}

			if (!zhuanzherngliu.equals("")) {
				if (!chuluzhenkongdu2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zhuanzherngliu ='");
				sqlBuffer.append(zhuanzherngliu);
				sqlBuffer.append("'");
			}

			if (!jiashouci.equals("")) {
				if (!zhuanzherngliu.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" jiashouci ='");
				sqlBuffer.append(jiashouci);
				sqlBuffer.append("'");
			}

			if (!jiamoci.equals("")) {
				if (!jiashouci.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" jiamoci ='");
				sqlBuffer.append(jiamoci);
				sqlBuffer.append("'");
			}

			if (!shiyanluci.equals("")) {
				if (!jiamoci.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" shiyanluci ='");
				sqlBuffer.append(shiyanluci);
				sqlBuffer.append("'");
			}

			if (!gongyitiaozhengluci.equals("")) {
				if (!shiyanluci.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" gongyitiaozhengluci ='");
				sqlBuffer.append(gongyitiaozhengluci);
				sqlBuffer.append("'");
			}
			
			if (!tongdao.equals("")) {
				if (!gongyitiaozhengluci.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" tongdao ='");
				sqlBuffer.append(tongdao);
				sqlBuffer.append("'");
			}
			
			if (!shengchanguzhang.equals("")) {
				if (!tongdao.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" shengchanguzhang ='");
				sqlBuffer.append(shengchanguzhang);
				sqlBuffer.append("'");
			}

			if (!huishoulv1.equals("") && huishoulv2.equals("") ) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" huishoulv <='");
				sqlBuffer.append(huishoulv1);
				sqlBuffer.append("'");
			}else if (!huishoulv2.equals("") && huishoulv1.equals("")){
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" huishoulv >='");
				sqlBuffer.append(huishoulv2);
				sqlBuffer.append("'");
			}else if (!huishoulv1.equals("") && !huishoulv2.equals("")){
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" huishoulv between '");
				sqlBuffer.append(huishoulv1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(huishoulv2);
				sqlBuffer.append("'");
			}

//			if (!huishoulv2.equals("")) {
//				if (!huishoulv1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" huishoulv2 ='");
//				sqlBuffer.append(huishoulv2);
//				sqlBuffer.append("'");
//			}

			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("") ) {
				if (!huishoulv2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zongpaimeiliang <='");
				sqlBuffer.append(zongpaimeiliang1);
				sqlBuffer.append("'");
			}else if (!zongpaimeiliang2.equals("") && zongpaimeiliang1.equals("")){
				if (!huishoulv2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zongpaimeiliang >='");
				sqlBuffer.append(zongpaimeiliang2);
				sqlBuffer.append("'");
			}else if (!zongpaimeiliang1.equals("") && !zongpaimeiliang2.equals("")){
				if (!huishoulv2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zongpaimeiliang between '");
				sqlBuffer.append(zongpaimeiliang1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(zongpaimeiliang2);
				sqlBuffer.append("'");
			}

//			if (!zongpaimeiliang2.equals("")) {
//				if (!zongpaimeiliang1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" zongpaimeiliang2 ='");
//				sqlBuffer.append(zongpaimeiliang2);
//				sqlBuffer.append("'");
//			}

//			if (!fe1.equals("")) {
//				if (!zongpaimeiliang2.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" fe1 ='");
//				sqlBuffer.append(fe1);
//				sqlBuffer.append("'");
//			}
			if (!fe1.equals("") && fe2.equals("") ) {
				if (!zongpaimeiliang2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fe <='");
				sqlBuffer.append(fe1);
				sqlBuffer.append("'");
			}else if (!fe2.equals("") && fe1.equals("")){
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fe >='");
				sqlBuffer.append(fe2);
				sqlBuffer.append("'");
			}else if (!fe1.equals("") && !fe2.equals("")){
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fe between '");
				sqlBuffer.append(fe1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(fe2);
				sqlBuffer.append("'");
			}

//			if (!fe2.equals("")) {
//				if (!fe1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" fe2 ='");
//				sqlBuffer.append(fe2);
//				sqlBuffer.append("'");
//			}

//			if (!hb1.equals("")) {
//				if (!fe2.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" hb1 ='");
//				sqlBuffer.append(hb1);
//				sqlBuffer.append("'");
//			}
			if (!hb1.equals("") && hb2.equals("") ) {
				if (!fe2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" hb <='");
				sqlBuffer.append(hb1);
				sqlBuffer.append("'");
			}else if (!hb2.equals("") && hb1.equals("")){
				if (!fe2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" hb >='");
				sqlBuffer.append(hb2);
				sqlBuffer.append("'");
			}else if (!hb1.equals("") && !hb2.equals("")){
				if (!fe2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" hb between '");
				sqlBuffer.append(hb1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(hb2);
				sqlBuffer.append("'");
			}

//			if (!hb2.equals("")) {
//				if (!hb1.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" hb2 ='");
//				sqlBuffer.append(hb2);
//				sqlBuffer.append("'");
//			}

//			if (!cl1.equals("")) {
//				if (!hb2.equals("")) {
//					sqlBuffer.append(" and");
//				}
//				sqlBuffer.append(" cl1 ='");
//				sqlBuffer.append(cl1);
//				sqlBuffer.append("'");
//			}
			if (!cl1.equals("") && cl2.equals("") ) {
				if (!hb2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" cl <='");
				sqlBuffer.append(cl1);
				sqlBuffer.append("'");
			}else if (!cl2.equals("") && cl1.equals("")){
				if (!hb2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" cl >='");
				sqlBuffer.append(cl2);
				sqlBuffer.append("'");
			}else if (!cl1.equals("") && !cl2.equals("")){
				if (!hb2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" cl between '");
				sqlBuffer.append(cl1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(cl2);
				sqlBuffer.append("'");
			}

			if (!cl2.equals("")) {
				if (!cl1.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" cl2 ='");
				sqlBuffer.append(cl2);
				sqlBuffer.append("'");
			}
		}
		
		System.out.println("sql=" + sqlBuffer);
		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.getConn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {
				result1Form = new TIronInfoBean();
				result1Form.setRiqi(resultSet.getString("riqi"));
				result1Form.setQihao(resultSet.getString("qihao"));
				result1Form.setLuci(resultSet.getString("luci"));
				result1Form.setGuige(resultSet.getString("guige"));
				result1Form.setShengchanluhao(resultSet.getString("shengchanluhao"));
				result1Form.setFanyingqihao(resultSet.getString("fanyingqihao"));
				result1Form.setShiyojngcishu(resultSet.getString("shiyojngcishu"));
				result1Form.setMg(resultSet.getString("mg"));
				result1Form.setTicl(resultSet.getString("ticl"));
				result1Form.setMaozhong(resultSet.getString("maozhong"));
				result1Form.setJingzhong(resultSet.getString("jingzhong"));
				result1Form.setChengpinlv(resultSet.getString("chengpinlv"));
				result1Form.setFe(resultSet.getString("fe"));
				result1Form.setSi(resultSet.getString("si"));
				result1Form.setCl(resultSet.getString("cl"));
				result1Form.setC(resultSet.getString("c"));
				result1Form.setO(resultSet.getString("n"));
				result1Form.setN(resultSet.getString("o"));
				result1Form.setH(resultSet.getString("h"));
				result1Form.setMn(resultSet.getString("mn"));
				result1Form.setHb(resultSet.getString("hb"));
				result1Form.setDengji_hanmeng(resultSet.getString("dengji_hanmeng"));
				result1Form.setKaohedengji_chumeng(resultSet.getString("kaohedengji_chumeng"));
				result1Form.setGongyitiaozheng(resultSet.getString("gongyitiaozheng"));
				result1Form.setGongyishiyan(resultSet.getString("gongyishiyan"));
				result1Form.setDipi(resultSet.getString("dipi"));
				result1Form.setShangmao(resultSet.getString("shangmao"));
				result1Form.setPabi(resultSet.getString("pabi"));
				result1Form.setFeidipi(resultSet.getString("feidipi"));
				result1Form.setFeishangmao(resultSet.getString("feishangmao"));
				result1Form.setFeipabi(resultSet.getString("feipabi"));
				result1Form.setFeitaifen(resultSet.getString("feitaifen"));
				result1Form.setCixuan(resultSet.getString("cixuan"));
				result1Form.setShouxuanfeiliao(resultSet.getString("shouxuanfeiliao"));
				result1Form.setSunhao(resultSet.getString("sunhao"));
				result1Form.setZongpaimeiliang(resultSet.getString("zongpaimeiliang"));
				result1Form.setChuluzhenkongdu(resultSet.getString("chuluzhenkongdu"));
				result1Form.setHuanyuanzuigaowendu(resultSet.getString("huanyuanzuigaowendu"));
				result1Form.setZhengliugaoheng(resultSet.getString("zhengliugaoheng"));
				result1Form.setZhuanzhengliu(resultSet.getString("zhuanzhengliu"));
				result1Form.setJiashouci(resultSet.getString("jiashouci"));
				result1Form.setJiamoci(resultSet.getString("jiamoci"));
				result1Form.setTongdao(resultSet.getString("tongdao"));
				result1Form.setShengchanguzhang(resultSet.getString("shengchanguzhang"));
				result1Form.setBeizhushuoming(resultSet.getString("beizhushuoming"));
				
				allInfoList.add(result1Form);
			}
			return allInfoList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}
}
