package com.ejustech.iron.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.Result1FormBean;
import com.ejustech.iron.databean.form.Result2FormBean;


/***
 * T_Iron_Info表的数据访问对象
 */
public class TIronInfoDao extends BaseDao {

	//全部信息输出表
	public ArrayList<TIronInfoDaoBean> getAllInfoList(HttpServletRequest request,String riqi1, String riqi2,
			String[] qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1, String chuluzhenkongdu2,
			String zhuanzherngliu, String jiashouci, String jiamoci,
			String shiyanluci, String gongyitiaozhengluci, String tongdao,
			String shengchanguzhang, String huishoulv1, String huishoulv2,
			String zongpaimeiliang1, String zongpaimeiliang2, String fe1,
			String fe2, String hb1, String hb2, String cl1, String cl2)
			throws Exception {
		
		ArrayList<TIronInfoDaoBean> allInfoList = new ArrayList<TIronInfoDaoBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		
		sqlBuffer.append("select");
		sqlBuffer.append(" *");
		sqlBuffer.append(" from");
		sqlBuffer.append(" ironinfo");

		if (!riqi1.equals("") || !riqi2.equals("") || qihao.length !=0 
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
				|| !cl1.equals("") || !cl2.equals("") ) {

			sqlBuffer.append(" where");
			
			if (!riqi1.equals("")) {
				sqlBuffer.append(" riqi between '");
				sqlBuffer.append(riqi1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(riqi2);
				sqlBuffer.append("'");
			}
	
			if (qihao.length != 0) {
				if (!riqi2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" qihao in (");
				StringBuffer transmode=new StringBuffer("");  
		        String[] trans=qihao;
		        if(trans!=null&&trans.length>0)  
		        {  
		            for(int i=0;i<trans.length;i++)  
		            {  
		                transmode.append(trans[i]);  
		                if(!(i==trans.length-1))  
		                {  
		                    transmode.append(",");  
		                }  
		            }  
		        }
				sqlBuffer.append(transmode.toString());
				sqlBuffer.append(")");
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
				sqlBuffer.append(" ticl between '");
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
		}
		
		System.out.println("sql=" + sqlBuffer);
		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {
				
				TIronInfoDaoBean tIronInfoBean = new TIronInfoDaoBean();
				
				tIronInfoBean.setRiqi(resultSet.getString("riqi"));
				tIronInfoBean.setQihao(resultSet.getString("qihao"));
				tIronInfoBean.setLuci(resultSet.getString("luci"));
				tIronInfoBean.setGuige(resultSet.getString("guige"));
				tIronInfoBean.setShengchanluhao(resultSet.getString("shengchanluhao"));
				tIronInfoBean.setFanyingqihao(resultSet.getString("fanyingqihao"));
				tIronInfoBean.setShiyongcishu(resultSet.getString("shiyongcishu"));
				tIronInfoBean.setMg(resultSet.getString("mg"));
				tIronInfoBean.setTicl(resultSet.getString("ticl"));
				tIronInfoBean.setMaozhong(resultSet.getString("maozhong"));
				tIronInfoBean.setJingzhong(resultSet.getString("jingzhong"));
				tIronInfoBean.setChengpinlv(resultSet.getString("chengpinlv"));
				tIronInfoBean.setFe(resultSet.getString("fe"));
				tIronInfoBean.setSi(resultSet.getString("si"));
				tIronInfoBean.setCl(resultSet.getString("cl"));
				tIronInfoBean.setC(resultSet.getString("c"));
				tIronInfoBean.setO(resultSet.getString("n"));
				tIronInfoBean.setN(resultSet.getString("o"));
				tIronInfoBean.setH(resultSet.getString("h"));
				tIronInfoBean.setMn(resultSet.getString("mn"));
				tIronInfoBean.setHb(resultSet.getString("hb"));
				tIronInfoBean.setDengji_hanmeng(resultSet.getString("dengji_hanmeng"));
				tIronInfoBean.setKaohedengji_chumeng(resultSet.getString("kaohedengji_chumeng"));
				tIronInfoBean.setGongyitiaozheng(resultSet.getString("gongyitiaozheng"));
				tIronInfoBean.setGongyishiyan(resultSet.getString("gongyishiyan"));
				tIronInfoBean.setDipi(resultSet.getString("dipi"));
				tIronInfoBean.setShangmao(resultSet.getString("shangmao"));
				tIronInfoBean.setPabi(resultSet.getString("pabi"));
				tIronInfoBean.setFeidipi(resultSet.getString("feidipi"));
				tIronInfoBean.setFeishangmao(resultSet.getString("feishangmao"));
				tIronInfoBean.setFeipabi(resultSet.getString("feipabi"));
				tIronInfoBean.setFeitaifen(resultSet.getString("feitaifen"));
				tIronInfoBean.setCixuan(resultSet.getString("cixuan"));
				tIronInfoBean.setShouxuanfeiliao(resultSet.getString("shouxuanfeiliao"));
				tIronInfoBean.setSunhao(resultSet.getString("sunhao"));
				tIronInfoBean.setZongpaimeiliang(resultSet.getString("zongpaimeiliang"));
				tIronInfoBean.setChuluzhenkongdu(resultSet.getString("chuluzhenkongdu"));
				tIronInfoBean.setHuanyuanzuigaowendu(resultSet.getString("huanyuanzuigaowendu"));
				tIronInfoBean.setZhengliugaoheng(resultSet.getString("zhengliugaoheng"));
				tIronInfoBean.setZhuanzhengliu(resultSet.getString("zhuanzhengliu"));
				tIronInfoBean.setJiashouci(resultSet.getString("jiashouci"));
				tIronInfoBean.setJiamoci(resultSet.getString("jiamoci"));
				tIronInfoBean.setTongdao(resultSet.getString("tongdao"));
				tIronInfoBean.setShengchanguzhang(resultSet.getString("shengchanguzhang"));
				tIronInfoBean.setBeizhushuoming(resultSet.getString("beizhushuoming"));
			
				allInfoList.add(tIronInfoBean);
			}
			return allInfoList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}
	
	//月生产数据统计表-含锰
	public ArrayList<Result2FormBean> getHanmengList(HttpServletRequest request,String riqi1, String riqi2,
			String[] qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1, String chuluzhenkongdu2,
			String zhuanzherngliu, String jiashouci, String jiamoci,
			String shiyanluci, String gongyitiaozhengluci, String tongdao,
			String shengchanguzhang, String huishoulv1, String huishoulv2,
			String zongpaimeiliang1, String zongpaimeiliang2, String fe1,
			String fe2, String hb1, String hb2, String cl1, String cl2)
			throws Exception {

		
		ArrayList<Result2FormBean> chumengList = new ArrayList<Result2FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		
		sqlBuffer.append("select");
		sqlBuffer.append(" qihao,sum(jingzhong*fe)/sum(jingzhong) as fe,");
		sqlBuffer.append(" sum(jingzhong*cl)/sum(jingzhong) as cl,");
		sqlBuffer.append(" sum(jingzhong*c)/sum(jingzhong) as c,");
		sqlBuffer.append(" sum(jingzhong*n)/sum(jingzhong) as n,");
		sqlBuffer.append(" sum(jingzhong*o)/sum(jingzhong) as o,");
		sqlBuffer.append(" sum(jingzhong*hb)/sum(jingzhong) as hb");
		sqlBuffer.append(" from");
		sqlBuffer.append(" ironinfo");

		if (!riqi1.equals("") || !riqi2.equals("") || qihao.length !=0 
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
				|| !cl1.equals("") || !cl2.equals("") ) {

			sqlBuffer.append(" where");
			
			if (!riqi1.equals("")) {
				sqlBuffer.append(" riqi between '");
				sqlBuffer.append(riqi1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(riqi2);
				sqlBuffer.append("'");
			}
	
			if (qihao.length != 0) {
				if (!riqi2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" qihao in (");
				StringBuffer transmode=new StringBuffer("");  
		        String[] trans=qihao;
		        if(trans!=null&&trans.length>0)  
		        {  
		            for(int i=0;i<trans.length;i++)  
		            {  
		                transmode.append(trans[i]);  
		                if(!(i==trans.length-1))  
		                {  
		                    transmode.append(",");  
		                }  
		            }  
		        }
				sqlBuffer.append(transmode.toString());
				sqlBuffer.append(")");
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
				sqlBuffer.append(" ticl between '");
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
		}
		sqlBuffer.append(" group by qihao");

		
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
				result2FormBean.setFe(resultSet.getString("fe"));
				result2FormBean.setCl(resultSet.getString("cl"));
				result2FormBean.setC(resultSet.getString("c"));
				result2FormBean.setO(resultSet.getString("n"));
				result2FormBean.setN(resultSet.getString("o"));
				result2FormBean.setHb(resultSet.getString("hb"));
				
				chumengList.add(result2FormBean);
			}
			return chumengList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

}
