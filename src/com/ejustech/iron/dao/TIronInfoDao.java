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

/***
 * T_Iron_Info表的数据访问对象
 */
public class TIronInfoDao extends BaseDao {
	

	// 全部信息输出表
	public ArrayList<Result1FormBean> getAllInfoList(
			HttpServletRequest request, String riqi1, String riqi2,
			String[] qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1,
			String chuluzhenkongdu2, String zhuanzherngliu, String jiashouci,
			String jiamoci, String shiyanluci, String gongyitiaozhengluci,
			String tongdao, String shengchanguzhang, String huishoulv1,
			String huishoulv2, String zongpaimeiliang1,
			String zongpaimeiliang2, String fe1, String fe2, String hb1,
			String hb2, String cl1, String cl2) throws Exception {

		ArrayList<Result1FormBean> allInfoList = new ArrayList<Result1FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append("select");
		sqlBuffer.append(" *");
		sqlBuffer.append(" from");
		sqlBuffer.append(" ironinfo");

		if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
				|| !luci1.equals("") || !luci2.equals("") || !guige.equals("")
				|| !shengchanluhao.equals("") || !fanyingqihao.equals("")
				|| !shiyongcishu.equals("") || !ticl41.equals("")
				|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
				|| !chuluzhenkongdu2.equals("") || !zhuanzherngliu.equals("")
				|| !jiashouci.equals("") || !jiamoci.equals("")
				|| !shiyanluci.equals("") || !gongyitiaozhengluci.equals("")
				|| !tongdao.equals("") || !shengchanguzhang.equals("")
				|| !huishoulv1.equals("") || !huishoulv2.equals("")
				|| !zongpaimeiliang1.equals("") || !zongpaimeiliang2.equals("")
				|| !fe1.equals("") || !fe2.equals("") || !hb1.equals("")
				|| !hb2.equals("") || !cl1.equals("") || !cl2.equals("")) {

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
				StringBuffer transmode = new StringBuffer("");
				String[] trans = qihao;
				if (trans != null && trans.length > 0) {
					for (int i = 0; i < trans.length; i++) {
						transmode.append(trans[i]);
						if (!(i == trans.length - 1)) {
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

			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" chuluzhenkongdu <='");
				sqlBuffer.append(chuluzhenkongdu1);
				sqlBuffer.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" chuluzhenkongdu >='");
				sqlBuffer.append(chuluzhenkongdu2);
				sqlBuffer.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& !chuluzhenkongdu1.equals("")) {
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

			if (!huishoulv1.equals("") && huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" huishoulv <='");
				sqlBuffer.append(huishoulv1);
				sqlBuffer.append("'");
			} else if (!huishoulv2.equals("") && huishoulv1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" huishoulv >='");
				sqlBuffer.append(huishoulv2);
				sqlBuffer.append("'");
			} else if (!huishoulv1.equals("") && !huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" huishoulv between '");
				sqlBuffer.append(huishoulv1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(huishoulv2);
				sqlBuffer.append("'");
			}

			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zongpaimeiliang <='");
				sqlBuffer.append(zongpaimeiliang1);
				sqlBuffer.append("'");
			} else if (!zongpaimeiliang2.equals("")
					&& zongpaimeiliang1.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zongpaimeiliang >='");
				sqlBuffer.append(zongpaimeiliang2);
				sqlBuffer.append("'");
			} else if (!zongpaimeiliang1.equals("")
					&& !zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" zongpaimeiliang between '");
				sqlBuffer.append(zongpaimeiliang1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(zongpaimeiliang2);
				sqlBuffer.append("'");
			}

			if (!fe1.equals("") && fe2.equals("")) {
				if (!zongpaimeiliang2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fe <='");
				sqlBuffer.append(fe1);
				sqlBuffer.append("'");
			} else if (!fe2.equals("") && fe1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fe >='");
				sqlBuffer.append(fe2);
				sqlBuffer.append("'");
			} else if (!fe1.equals("") && !fe2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" fe between '");
				sqlBuffer.append(fe1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(fe2);
				sqlBuffer.append("'");
			}

			if (!hb1.equals("") && hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" hb <='");
				sqlBuffer.append(hb1);
				sqlBuffer.append("'");
			} else if (!hb2.equals("") && hb1.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" hb >='");
				sqlBuffer.append(hb2);
				sqlBuffer.append("'");
			} else if (!hb1.equals("") && !hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" hb between '");
				sqlBuffer.append(hb1);
				sqlBuffer.append("' and '");
				sqlBuffer.append(hb2);
				sqlBuffer.append("'");
			}

			if (!cl1.equals("") && cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" cl <='");
				sqlBuffer.append(cl1);
				sqlBuffer.append("'");
			} else if (!cl2.equals("") && cl1.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer.append(" and");
				}
				sqlBuffer.append(" cl >='");
				sqlBuffer.append(cl2);
				sqlBuffer.append("'");
			} else if (!cl1.equals("") && !cl2.equals("")) {
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

				Result1FormBean result1FormBean = new Result1FormBean();

				result1FormBean.setRiqi(resultSet.getString("riqi"));
				result1FormBean.setQihao(resultSet.getString("qihao"));
				result1FormBean.setLuci(resultSet.getString("luci"));
				if (!resultSet.getString("junpin").equals("")){
					result1FormBean.setJunpin("("+resultSet.getString("junpin")+")");
				}else{
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
				String cpl = Output.getSubValue(Output.getPercentValue(resultSet.getString("chengpinlv")), 2)+"%";
				result1FormBean.setChengpinlv(cpl);
				System.out.println("chengpinlv--"+result1FormBean.getChengpinlv());
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
				result1FormBean
						.setFeishangmao(resultSet.getString("feishangmao"));
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
//				chumengList.add(result2FormBean);
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
			HttpServletRequest request, String riqi1, String riqi2,
			String[] qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1,
			String chuluzhenkongdu2, String zhuanzherngliu, String jiashouci,
			String jiamoci, String shiyanluci, String gongyitiaozhengluci,
			String tongdao, String shengchanguzhang, String huishoulv1,
			String huishoulv2, String zongpaimeiliang1,
			String zongpaimeiliang2, String fe1, String fe2, String hb1,
			String hb2, String cl1, String cl2) throws Exception {

		ArrayList<Result2FormBean> chumengList = new ArrayList<Result2FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		StringBuffer sqlBuffer3 = new StringBuffer();
		StringBuffer sqlBuffer4 = new StringBuffer();
		
		if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
				|| !luci1.equals("") || !luci2.equals("") || !guige.equals("")
				|| !shengchanluhao.equals("") || !fanyingqihao.equals("")
				|| !shiyongcishu.equals("") || !ticl41.equals("")
				|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
				|| !chuluzhenkongdu2.equals("") || !zhuanzherngliu.equals("")
				|| !jiashouci.equals("") || !jiamoci.equals("")
				|| !shiyanluci.equals("") || !gongyitiaozhengluci.equals("")
				|| !tongdao.equals("") || !shengchanguzhang.equals("")
				|| !huishoulv1.equals("") || !huishoulv2.equals("")
				|| !zongpaimeiliang1.equals("") || !zongpaimeiliang2.equals("")
				|| !fe1.equals("") || !fe2.equals("") || !hb1.equals("")
				|| !hb2.equals("") || !cl1.equals("") || !cl2.equals("")) {


			if (!riqi1.equals("")) {
				sqlBuffer2.append(" riqi between '");
				sqlBuffer2.append(riqi1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(riqi2);
				sqlBuffer2.append("'");
			}

			if (qihao.length != 0) {
				if (!riqi2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" qihao in (");
				StringBuffer transmode = new StringBuffer("");
				String[] trans = qihao;
				if (trans != null && trans.length > 0) {
					for (int i = 0; i < trans.length; i++) {
						transmode.append(trans[i]);
						if (!(i == trans.length - 1)) {
							transmode.append(",");
						}
					}
				}
				sqlBuffer2.append(transmode.toString());
				sqlBuffer2.append(")");
			}

			if (!luci1.equals("")) {
				if (!qihao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" luci between '");
				sqlBuffer2.append(luci1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(luci2);
				sqlBuffer2.append("'");
			}

			if (!guige.equals("")) {
				if (!luci2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" guige ='");
				sqlBuffer2.append(guige);
				sqlBuffer2.append("'");
			}

			if (!shengchanluhao.equals("")) {
				if (!guige.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shengchanluhao ='");
				sqlBuffer2.append(shengchanluhao);
				sqlBuffer2.append("'");
			}

			if (!fanyingqihao.equals("")) {
				if (!shengchanluhao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fanyingqihao ='");
				sqlBuffer2.append(fanyingqihao);
				sqlBuffer2.append("'");
			}

			if (!shiyongcishu.equals("")) {
				if (!fanyingqihao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shiyongcishu ='");
				sqlBuffer2.append(shiyongcishu);
				sqlBuffer2.append("'");
			}

			if (!ticl41.equals("")) {
				if (!shiyongcishu.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" ticl between '");
				sqlBuffer2.append(ticl41);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(ticl42);
				sqlBuffer2.append("'");
			}

			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu <='");
				sqlBuffer2.append(chuluzhenkongdu1);
				sqlBuffer2.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu >='");
				sqlBuffer2.append(chuluzhenkongdu2);
				sqlBuffer2.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& !chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu between '");
				sqlBuffer2.append(chuluzhenkongdu1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(chuluzhenkongdu2);
				sqlBuffer2.append("'");
			}

			if (!zhuanzherngliu.equals("")) {
				if (!chuluzhenkongdu2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zhuanzherngliu ='");
				sqlBuffer2.append(zhuanzherngliu);
				sqlBuffer2.append("'");
			}

			if (!jiashouci.equals("")) {
				if (!zhuanzherngliu.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" jiashouci ='");
				sqlBuffer2.append(jiashouci);
				sqlBuffer2.append("'");
			}

			if (!jiamoci.equals("")) {
				if (!jiashouci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" jiamoci ='");
				sqlBuffer2.append(jiamoci);
				sqlBuffer2.append("'");
			}

			if (!shiyanluci.equals("")) {
				if (!jiamoci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shiyanluci ='");
				sqlBuffer2.append(shiyanluci);
				sqlBuffer2.append("'");
			}

			if (!gongyitiaozhengluci.equals("")) {
				if (!shiyanluci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" gongyitiaozhengluci ='");
				sqlBuffer2.append(gongyitiaozhengluci);
				sqlBuffer2.append("'");
			}

			if (!tongdao.equals("")) {
				if (!gongyitiaozhengluci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" tongdao ='");
				sqlBuffer2.append(tongdao);
				sqlBuffer2.append("'");
			}

			if (!shengchanguzhang.equals("")) {
				if (!tongdao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shengchanguzhang ='");
				sqlBuffer2.append(shengchanguzhang);
				sqlBuffer2.append("'");
			}

			if (!huishoulv1.equals("") && huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv <='");
				sqlBuffer2.append(huishoulv1);
				sqlBuffer2.append("'");
			} else if (!huishoulv2.equals("") && huishoulv1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv >='");
				sqlBuffer2.append(huishoulv2);
				sqlBuffer2.append("'");
			} else if (!huishoulv1.equals("") && !huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv between '");
				sqlBuffer2.append(huishoulv1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(huishoulv2);
				sqlBuffer2.append("'");
			}

			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang <='");
				sqlBuffer2.append(zongpaimeiliang1);
				sqlBuffer2.append("'");
			} else if (!zongpaimeiliang2.equals("")
					&& zongpaimeiliang1.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang >='");
				sqlBuffer2.append(zongpaimeiliang2);
				sqlBuffer2.append("'");
			} else if (!zongpaimeiliang1.equals("")
					&& !zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang between '");
				sqlBuffer2.append(zongpaimeiliang1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(zongpaimeiliang2);
				sqlBuffer2.append("'");
			}

			if (!fe1.equals("") && fe2.equals("")) {
				if (!zongpaimeiliang2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe <='");
				sqlBuffer2.append(fe1);
				sqlBuffer2.append("'");
			} else if (!fe2.equals("") && fe1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe >='");
				sqlBuffer2.append(fe2);
				sqlBuffer2.append("'");
			} else if (!fe1.equals("") && !fe2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe between '");
				sqlBuffer2.append(fe1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(fe2);
				sqlBuffer2.append("'");
			}

			if (!hb1.equals("") && hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb <='");
				sqlBuffer2.append(hb1);
				sqlBuffer2.append("'");
			} else if (!hb2.equals("") && hb1.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb >='");
				sqlBuffer2.append(hb2);
				sqlBuffer2.append("'");
			} else if (!hb1.equals("") && !hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb between '");
				sqlBuffer2.append(hb1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(hb2);
				sqlBuffer2.append("'");
			}

			if (!cl1.equals("") && cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl <='");
				sqlBuffer2.append(cl1);
				sqlBuffer2.append("'");
			} else if (!cl2.equals("") && cl1.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl >='");
				sqlBuffer2.append(cl2);
				sqlBuffer2.append("'");
			} else if (!cl1.equals("") && !cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl between '");
				sqlBuffer2.append(cl1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(cl2);
				sqlBuffer2.append("'");
			}
			
			sqlBuffer3 = sqlBuffer3.append(" WHERE ").append(sqlBuffer2);
			sqlBuffer4 = sqlBuffer4.append(" AND ").append(sqlBuffer2);
		}
		
		sqlBuffer
				.append(" SELECT t1.qihao,t2.fe,t2.cl,t2.n,t2.o,t2.hb,t1.zonglushu,t2.zongmaozhong,t2.zongmaozhong/t1.zonglushu AS junmaozhong,t2.mgzongliang*1000/t2.zongmaozhong AS junmgdanhao,t2.zongjingzhong/t2.zongmaozhong AS junhuishoulv,t2.zongjingzhong,t2.zongjingzhong/t1.zonglushu AS junjingzhong,tj0A.0Aji,tj0A.0Ajilv,tj0.0ji,tj0.0jilv,(tj0A.0Aji+tj0.0ji)/t2.zongmaozhong as 0jiyishang,tj1.1ji,tj1.1jilv,tj2.2ji,tj3.3ji,tj4.4ji,tj5.5ji,tj2u.2jijiyixia,tj2u.2jijiyixialv FROM");
		sqlBuffer
				.append(" (SELECT qihao,count(qihao) AS zonglushu FROM ironinfo WHERE junpin !='军品' GROUP BY qihao)t1,");
		sqlBuffer
				.append(" (SELECT qihao,sum(jingzhong*fe)/sum(jingzhong) AS fe,sum(jingzhong*cl)/sum(jingzhong) AS cl,sum(jingzhong*n)/sum(jingzhong) AS n,sum(jingzhong*o)/sum(jingzhong) AS o,sum(jingzhong*hb)/sum(jingzhong) AS hb ,sum(maozhong) AS zongmaozhong,sum(mg) AS mgzongliang,sum(jingzhong) AS zongjingzhong FROM ironinfo")
				.append(sqlBuffer3).append(" GROUP BY qihao)t2,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_0A.0Aji as 0Aji,j_0A.0Aji/t_1.zongmaozhong as 0Ajilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0Aji FROM ironinfo WHERE dengji_hanmeng = '0A'")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_0A ON (t_1.qihao = j_0A.qihao) GROUP BY t_1.qihao)tj0A,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_0.0ji as 0ji,j_0.0ji/t_1.zongmaozhong as 0jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0ji FROM ironinfo WHERE dengji_hanmeng = '0' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_0 ON (t_1.qihao = j_0.qihao) GROUP BY t_1.qihao)tj0,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_1.1ji as 1ji,j_1.1ji/t_1.zongmaozhong as 1jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 1ji FROM ironinfo WHERE dengji_hanmeng = '1' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_1 ON (t_1.qihao = j_1.qihao) GROUP BY t_1.qihao)tj1,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_2.2ji as 2ji,j_2.2ji/t_1.zongmaozhong as 2jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2ji FROM ironinfo WHERE dengji_hanmeng = '2' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_2 ON (t_1.qihao = j_2.qihao) GROUP BY t_1.qihao)tj2,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_3.3ji as 3ji,j_3.3ji/t_1.zongmaozhong as 3jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 3ji FROM ironinfo WHERE dengji_hanmeng = '3' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_3 ON (t_1.qihao = j_3.qihao) GROUP BY t_1.qihao)tj3,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_4.4ji as 4ji,j_4.4ji/t_1.zongmaozhong as 4jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 4ji FROM ironinfo WHERE dengji_hanmeng = '4' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_4 ON (t_1.qihao = j_4.qihao) GROUP BY t_1.qihao)tj4,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_5.5ji as 5ji,j_5.5ji/t_1.zongmaozhong as 5jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 5ji FROM ironinfo WHERE dengji_hanmeng = '5' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_5 ON (t_1.qihao = j_5.qihao) GROUP BY t_1.qihao)tj5,");
		sqlBuffer
				.append(" (SELECT t_1.qihao as qihao,j_2u.2jijiyixia as 2jijiyixia,j_2u.2jijiyixia/t_1.zongmaozhong as 2jijiyixialv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
				.append(sqlBuffer3)
				.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2jijiyixia FROM ironinfo WHERE dengji_hanmeng ='2' or dengji_hanmeng ='3' or dengji_hanmeng ='4' or dengji_hanmeng ='5' ")
				.append(sqlBuffer4)
				.append(" GROUP BY qihao)j_2u ON (t_1.qihao = j_2u.qihao) GROUP BY t_1.qihao)tj2u");
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

				result2FormBean.setQihao(
						resultSet.getString("qihao"));
				result2FormBean.setFe(Output.getSubValue(resultSet.getString("fe"), 4));
				result2FormBean.setCl(Output.getSubValue(resultSet.getString("cl"), 4));
				result2FormBean.setO(Output.getSubValue(resultSet.getString("n"), 4));
				result2FormBean.setN(Output.getSubValue(resultSet.getString("o"), 4));
				result2FormBean.setHb(Output.getSubValue(resultSet.getString("hb"), 0));
				result2FormBean.setLushu(resultSet.getString("zonglushu"));
				result2FormBean.setZongmaozhong(Output.getSubValue(resultSet.getString("zongmaozhong"), 0));
				result2FormBean.setJunmaozhong(Output.getSubValue(resultSet.getString("junmaozhong"), 0));
				result2FormBean.setJunmgdanhao(Output.getSubValue(resultSet.getString("junmgdanhao"), 3));
				result2FormBean.setJunhuishoulv(Output.getSubValue(Output.getPercentValue(resultSet.getString("junhuishoulv")),2)+"%");
				result2FormBean.setZongjingzhong(Output.getSubValue(resultSet.getString("zongjingzhong"), 0));
				result2FormBean.setJunjingzhong(Output.getSubValue(resultSet.getString("junjingzhong"), 0));
				result2FormBean.setJ0Aji(resultSet.getString("0Aji"));
				result2FormBean.setJ0Ajilv(Output.getSubValue(Output.getPercentValue(resultSet.getString("0Ajilv")),2)+"%");
				result2FormBean.setJ0ji(resultSet.getString("0ji"));
				result2FormBean.setJ0jilv(Output.getSubValue(Output.getPercentValue(resultSet.getString("0jilv")),2)+"%");
				result2FormBean.setJ0jiyishang(resultSet
						.getString("0jiyishang"));
				result2FormBean.setJ1ji(resultSet.getString("1ji"));
				result2FormBean.setJ1jilv(Output.getSubValue(Output.getPercentValue(resultSet.getString("1jilv")),2)+"%");
				result2FormBean.setJ2ji(resultSet.getString("2ji"));
				result2FormBean.setJ3ji(resultSet.getString("3ji"));
				result2FormBean.setJ4ji(resultSet.getString("4ji"));
				result2FormBean.setJ5ji(resultSet.getString("5ji"));
				result2FormBean.setJ2jijiyixia(resultSet
						.getString("2jijiyixia"));
				result2FormBean.setJ2jijiyixialv(Output.getSubValue(Output.getPercentValue(resultSet.getString("2jijiyixialv")),2)+"%");

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
			HttpServletRequest request, String riqi1, String riqi2,
			String[] qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1,
			String chuluzhenkongdu2, String zhuanzherngliu, String jiashouci,
			String jiamoci, String shiyanluci, String gongyitiaozhengluci,
			String tongdao, String shengchanguzhang, String huishoulv1,
			String huishoulv2, String zongpaimeiliang1,
			String zongpaimeiliang2, String fe1, String fe2, String hb1,
			String hb2, String cl1, String cl2) throws Exception {

		ArrayList<Result3FormBean> chumengList = new ArrayList<Result3FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		StringBuffer sqlBuffer3 = new StringBuffer();
		StringBuffer sqlBuffer4 = new StringBuffer();
		
		if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
				|| !luci1.equals("") || !luci2.equals("") || !guige.equals("")
				|| !shengchanluhao.equals("") || !fanyingqihao.equals("")
				|| !shiyongcishu.equals("") || !ticl41.equals("")
				|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
				|| !chuluzhenkongdu2.equals("") || !zhuanzherngliu.equals("")
				|| !jiashouci.equals("") || !jiamoci.equals("")
				|| !shiyanluci.equals("") || !gongyitiaozhengluci.equals("")
				|| !tongdao.equals("") || !shengchanguzhang.equals("")
				|| !huishoulv1.equals("") || !huishoulv2.equals("")
				|| !zongpaimeiliang1.equals("") || !zongpaimeiliang2.equals("")
				|| !fe1.equals("") || !fe2.equals("") || !hb1.equals("")
				|| !hb2.equals("") || !cl1.equals("") || !cl2.equals("")) {


			if (!riqi1.equals("")) {
				sqlBuffer2.append(" riqi between '");
				sqlBuffer2.append(riqi1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(riqi2);
				sqlBuffer2.append("'");
			}

			if (qihao.length != 0) {
				if (!riqi2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" qihao in (");
				StringBuffer transmode = new StringBuffer("");
				String[] trans = qihao;
				if (trans != null && trans.length > 0) {
					for (int i = 0; i < trans.length; i++) {
						transmode.append(trans[i]);
						if (!(i == trans.length - 1)) {
							transmode.append(",");
						}
					}
				}
				sqlBuffer2.append(transmode.toString());
				sqlBuffer2.append(")");
			}

			if (!luci1.equals("")) {
				if (!qihao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" luci between '");
				sqlBuffer2.append(luci1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(luci2);
				sqlBuffer2.append("'");
			}

			if (!guige.equals("")) {
				if (!luci2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" guige ='");
				sqlBuffer2.append(guige);
				sqlBuffer2.append("'");
			}

			if (!shengchanluhao.equals("")) {
				if (!guige.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shengchanluhao ='");
				sqlBuffer2.append(shengchanluhao);
				sqlBuffer2.append("'");
			}

			if (!fanyingqihao.equals("")) {
				if (!shengchanluhao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fanyingqihao ='");
				sqlBuffer2.append(fanyingqihao);
				sqlBuffer2.append("'");
			}

			if (!shiyongcishu.equals("")) {
				if (!fanyingqihao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shiyongcishu ='");
				sqlBuffer2.append(shiyongcishu);
				sqlBuffer2.append("'");
			}

			if (!ticl41.equals("")) {
				if (!shiyongcishu.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" ticl between '");
				sqlBuffer2.append(ticl41);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(ticl42);
				sqlBuffer2.append("'");
			}

			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu <='");
				sqlBuffer2.append(chuluzhenkongdu1);
				sqlBuffer2.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu >='");
				sqlBuffer2.append(chuluzhenkongdu2);
				sqlBuffer2.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& !chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu between '");
				sqlBuffer2.append(chuluzhenkongdu1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(chuluzhenkongdu2);
				sqlBuffer2.append("'");
			}

			if (!zhuanzherngliu.equals("")) {
				if (!chuluzhenkongdu2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zhuanzherngliu ='");
				sqlBuffer2.append(zhuanzherngliu);
				sqlBuffer2.append("'");
			}

			if (!jiashouci.equals("")) {
				if (!zhuanzherngliu.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" jiashouci ='");
				sqlBuffer2.append(jiashouci);
				sqlBuffer2.append("'");
			}

			if (!jiamoci.equals("")) {
				if (!jiashouci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" jiamoci ='");
				sqlBuffer2.append(jiamoci);
				sqlBuffer2.append("'");
			}

			if (!shiyanluci.equals("")) {
				if (!jiamoci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shiyanluci ='");
				sqlBuffer2.append(shiyanluci);
				sqlBuffer2.append("'");
			}

			if (!gongyitiaozhengluci.equals("")) {
				if (!shiyanluci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" gongyitiaozhengluci ='");
				sqlBuffer2.append(gongyitiaozhengluci);
				sqlBuffer2.append("'");
			}

			if (!tongdao.equals("")) {
				if (!gongyitiaozhengluci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" tongdao ='");
				sqlBuffer2.append(tongdao);
				sqlBuffer2.append("'");
			}

			if (!shengchanguzhang.equals("")) {
				if (!tongdao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shengchanguzhang ='");
				sqlBuffer2.append(shengchanguzhang);
				sqlBuffer2.append("'");
			}

			if (!huishoulv1.equals("") && huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv <='");
				sqlBuffer2.append(huishoulv1);
				sqlBuffer2.append("'");
			} else if (!huishoulv2.equals("") && huishoulv1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv >='");
				sqlBuffer2.append(huishoulv2);
				sqlBuffer2.append("'");
			} else if (!huishoulv1.equals("") && !huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv between '");
				sqlBuffer2.append(huishoulv1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(huishoulv2);
				sqlBuffer2.append("'");
			}

			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang <='");
				sqlBuffer2.append(zongpaimeiliang1);
				sqlBuffer2.append("'");
			} else if (!zongpaimeiliang2.equals("")
					&& zongpaimeiliang1.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang >='");
				sqlBuffer2.append(zongpaimeiliang2);
				sqlBuffer2.append("'");
			} else if (!zongpaimeiliang1.equals("")
					&& !zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang between '");
				sqlBuffer2.append(zongpaimeiliang1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(zongpaimeiliang2);
				sqlBuffer2.append("'");
			}

			if (!fe1.equals("") && fe2.equals("")) {
				if (!zongpaimeiliang2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe <='");
				sqlBuffer2.append(fe1);
				sqlBuffer2.append("'");
			} else if (!fe2.equals("") && fe1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe >='");
				sqlBuffer2.append(fe2);
				sqlBuffer2.append("'");
			} else if (!fe1.equals("") && !fe2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe between '");
				sqlBuffer2.append(fe1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(fe2);
				sqlBuffer2.append("'");
			}

			if (!hb1.equals("") && hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb <='");
				sqlBuffer2.append(hb1);
				sqlBuffer2.append("'");
			} else if (!hb2.equals("") && hb1.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb >='");
				sqlBuffer2.append(hb2);
				sqlBuffer2.append("'");
			} else if (!hb1.equals("") && !hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb between '");
				sqlBuffer2.append(hb1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(hb2);
				sqlBuffer2.append("'");
			}

			if (!cl1.equals("") && cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl <='");
				sqlBuffer2.append(cl1);
				sqlBuffer2.append("'");
			} else if (!cl2.equals("") && cl1.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl >='");
				sqlBuffer2.append(cl2);
				sqlBuffer2.append("'");
			} else if (!cl1.equals("") && !cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl between '");
				sqlBuffer2.append(cl1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(cl2);
				sqlBuffer2.append("'");
			}
			
			sqlBuffer3 = sqlBuffer3.append(" WHERE ").append(sqlBuffer2);
			sqlBuffer4 = sqlBuffer4.append(" AND ").append(sqlBuffer2);
		}
		
		sqlBuffer
		.append(" SELECT t1.qihao,t2.fe,t2.cl,t2.n,t2.o,t2.hb,t1.zonglushu,t2.zongmaozhong,t2.zongmaozhong/t1.zonglushu AS junmaozhong,t2.mgzongliang*1000/t2.zongmaozhong AS junmgdanhao,t2.zongjingzhong/t2.zongmaozhong AS junhuishoulv,t2.zongjingzhong,t2.zongjingzhong/t1.zonglushu AS junjingzhong,tj0A.0Aji,tj0A.0Ajilv,tj0.0ji,tj0.0jilv,(tj0A.0Aji+tj0.0ji)/t2.zongmaozhong as 0jiyishang,tj1.1ji,tj1.1jilv,tj2.2ji,tj3.3ji,tj4.4ji,tj5.5ji,tj2u.2jijiyixia,tj2u.2jijiyixialv FROM");
sqlBuffer
		.append(" (SELECT qihao,count(qihao) AS zonglushu FROM ironinfo WHERE junpin !='军品' GROUP BY qihao)t1,");
sqlBuffer
		.append(" (SELECT qihao,sum(jingzhong*fe)/sum(jingzhong) AS fe,sum(jingzhong*cl)/sum(jingzhong) AS cl,sum(jingzhong*n)/sum(jingzhong) AS n,sum(jingzhong*o)/sum(jingzhong) AS o,sum(jingzhong*hb)/sum(jingzhong) AS hb ,sum(maozhong) AS zongmaozhong,sum(mg) AS mgzongliang,sum(jingzhong) AS zongjingzhong FROM ironinfo")
		.append(sqlBuffer3).append(" GROUP BY qihao)t2,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_0A.0Aji as 0Aji,j_0A.0Aji/t_1.zongmaozhong as 0Ajilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_0A ON (t_1.qihao = j_0A.qihao) GROUP BY t_1.qihao)tj0A,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_0.0ji as 0ji,j_0.0ji/t_1.zongmaozhong as 0jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_0 ON (t_1.qihao = j_0.qihao) GROUP BY t_1.qihao)tj0,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_1.1ji as 1ji,j_1.1ji/t_1.zongmaozhong as 1jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_1 ON (t_1.qihao = j_1.qihao) GROUP BY t_1.qihao)tj1,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_2.2ji as 2ji,j_2.2ji/t_1.zongmaozhong as 2jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2ji FROM ironinfo WHERE kaohedengji_chumeng = '2' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_2 ON (t_1.qihao = j_2.qihao) GROUP BY t_1.qihao)tj2,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_3.3ji as 3ji,j_3.3ji/t_1.zongmaozhong as 3jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 3ji FROM ironinfo WHERE kaohedengji_chumeng = '3' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_3 ON (t_1.qihao = j_3.qihao) GROUP BY t_1.qihao)tj3,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_4.4ji as 4ji,j_4.4ji/t_1.zongmaozhong as 4jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 4ji FROM ironinfo WHERE kaohedengji_chumeng = '4' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_4 ON (t_1.qihao = j_4.qihao) GROUP BY t_1.qihao)tj4,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_5.5ji as 5ji,j_5.5ji/t_1.zongmaozhong as 5jilv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 5ji FROM ironinfo WHERE kaohedengji_chumeng = '5' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_5 ON (t_1.qihao = j_5.qihao) GROUP BY t_1.qihao)tj5,");
sqlBuffer
		.append(" (SELECT t_1.qihao as qihao,j_2u.2jijiyixia as 2jijiyixia,j_2u.2jijiyixia/t_1.zongmaozhong as 2jijiyixialv FROM(SELECT qihao,sum(maozhong) AS zongmaozhong FROM ironinfo ")
		.append(sqlBuffer3)
		.append(" GROUP BY qihao)t_1 LEFT JOIN (SELECT qihao,sum(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng ='2' or kaohedengji_chumeng ='3' or kaohedengji_chumeng ='4' or kaohedengji_chumeng ='5' ")
		.append(sqlBuffer4)
		.append(" GROUP BY qihao)j_2u ON (t_1.qihao = j_2u.qihao) GROUP BY t_1.qihao)tj2u");
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

				result3FormBean.setQihao(
						resultSet.getString("qihao"));
				result3FormBean.setFe(Output.getSubValue(resultSet.getString("fe"), 4));
				result3FormBean.setCl(Output.getSubValue(resultSet.getString("cl"), 4));
				result3FormBean.setO(Output.getSubValue(resultSet.getString("n"), 4));
				result3FormBean.setN(Output.getSubValue(resultSet.getString("o"), 4));
				result3FormBean.setHb(Output.getSubValue(resultSet.getString("hb"), 0));
				result3FormBean.setLushu(resultSet.getString("zonglushu"));
				result3FormBean.setZongmaozhong(Output.getSubValue(resultSet.getString("zongmaozhong"), 0));
				result3FormBean.setJunmaozhong(Output.getSubValue(resultSet.getString("junmaozhong"), 0));
				result3FormBean.setJunmgdanhao(Output.getSubValue(resultSet.getString("junmgdanhao"), 3));
				result3FormBean.setJunhuishoulv(Output.getSubValue(Output.getPercentValue(resultSet.getString("junhuishoulv")),2)+"%");
				result3FormBean.setZongjingzhong(Output.getSubValue(resultSet.getString("zongjingzhong"), 0));
				result3FormBean.setJunjingzhong(Output.getSubValue(resultSet.getString("junjingzhong"), 0));
				result3FormBean.setJ0Aji(resultSet.getString("0Aji"));
				result3FormBean.setJ0Ajilv(Output.getSubValue(Output.getPercentValue(resultSet.getString("0Ajilv")),2)+"%");
				result3FormBean.setJ0ji(resultSet.getString("0ji"));
				result3FormBean.setJ0jilv(Output.getSubValue(Output.getPercentValue(resultSet.getString("0jilv")),2)+"%");
				result3FormBean.setJ0jiyishang(resultSet
						.getString("0jiyishang"));
				result3FormBean.setJ1ji(resultSet.getString("1ji"));
				result3FormBean.setJ1jilv(Output.getSubValue(Output.getPercentValue(resultSet.getString("1jilv")),2)+"%");
				result3FormBean.setJ2ji(resultSet.getString("2ji"));
				result3FormBean.setJ3ji(resultSet.getString("3ji"));
				result3FormBean.setJ4ji(resultSet.getString("4ji"));
				result3FormBean.setJ5ji(resultSet.getString("5ji"));
				result3FormBean.setJ2jijiyixia(resultSet
						.getString("2jijiyixia"));
				result3FormBean.setJ2jijiyixialv(Output.getSubValue(Output.getPercentValue(resultSet.getString("2jijiyixialv")),2)+"%");

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
	public ArrayList<Result4FormBean> getWaitaiList(
			HttpServletRequest request, String riqi1, String riqi2,
			String[] qihao, String luci1, String luci2, String guige,
			String shengchanluhao, String fanyingqihao, String shiyongcishu,
			String ticl41, String ticl42, String chuluzhenkongdu1,
			String chuluzhenkongdu2, String zhuanzherngliu, String jiashouci,
			String jiamoci, String shiyanluci, String gongyitiaozhengluci,
			String tongdao, String shengchanguzhang, String huishoulv1,
			String huishoulv2, String zongpaimeiliang1,
			String zongpaimeiliang2, String fe1, String fe2, String hb1,
			String hb2, String cl1, String cl2) throws Exception {

		ArrayList<Result4FormBean> waitaiList = new ArrayList<Result4FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		StringBuffer sqlBuffer3 = new StringBuffer();
		StringBuffer sqlBuffer4 = new StringBuffer();
		
		if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
				|| !luci1.equals("") || !luci2.equals("") || !guige.equals("")
				|| !shengchanluhao.equals("") || !fanyingqihao.equals("")
				|| !shiyongcishu.equals("") || !ticl41.equals("")
				|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
				|| !chuluzhenkongdu2.equals("") || !zhuanzherngliu.equals("")
				|| !jiashouci.equals("") || !jiamoci.equals("")
				|| !shiyanluci.equals("") || !gongyitiaozhengluci.equals("")
				|| !tongdao.equals("") || !shengchanguzhang.equals("")
				|| !huishoulv1.equals("") || !huishoulv2.equals("")
				|| !zongpaimeiliang1.equals("") || !zongpaimeiliang2.equals("")
				|| !fe1.equals("") || !fe2.equals("") || !hb1.equals("")
				|| !hb2.equals("") || !cl1.equals("") || !cl2.equals("")) {


			if (!riqi1.equals("")) {
				sqlBuffer2.append(" riqi between '");
				sqlBuffer2.append(riqi1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(riqi2);
				sqlBuffer2.append("'");
			}

			if (qihao.length != 0) {
				if (!riqi2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" qihao in (");
				StringBuffer transmode = new StringBuffer("");
				String[] trans = qihao;
				if (trans != null && trans.length > 0) {
					for (int i = 0; i < trans.length; i++) {
						transmode.append(trans[i]);
						if (!(i == trans.length - 1)) {
							transmode.append(",");
						}
					}
				}
				sqlBuffer2.append(transmode.toString());
				sqlBuffer2.append(")");
			}

			if (!luci1.equals("")) {
				if (!qihao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" luci between '");
				sqlBuffer2.append(luci1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(luci2);
				sqlBuffer2.append("'");
			}

			if (!guige.equals("")) {
				if (!luci2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" guige ='");
				sqlBuffer2.append(guige);
				sqlBuffer2.append("'");
			}

			if (!shengchanluhao.equals("")) {
				if (!guige.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shengchanluhao ='");
				sqlBuffer2.append(shengchanluhao);
				sqlBuffer2.append("'");
			}

			if (!fanyingqihao.equals("")) {
				if (!shengchanluhao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fanyingqihao ='");
				sqlBuffer2.append(fanyingqihao);
				sqlBuffer2.append("'");
			}

			if (!shiyongcishu.equals("")) {
				if (!fanyingqihao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shiyongcishu ='");
				sqlBuffer2.append(shiyongcishu);
				sqlBuffer2.append("'");
			}

			if (!ticl41.equals("")) {
				if (!shiyongcishu.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" ticl between '");
				sqlBuffer2.append(ticl41);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(ticl42);
				sqlBuffer2.append("'");
			}

			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu <='");
				sqlBuffer2.append(chuluzhenkongdu1);
				sqlBuffer2.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu >='");
				sqlBuffer2.append(chuluzhenkongdu2);
				sqlBuffer2.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& !chuluzhenkongdu1.equals("")) {
				if (!ticl42.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" chuluzhenkongdu between '");
				sqlBuffer2.append(chuluzhenkongdu1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(chuluzhenkongdu2);
				sqlBuffer2.append("'");
			}

			if (!zhuanzherngliu.equals("")) {
				if (!chuluzhenkongdu2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zhuanzherngliu ='");
				sqlBuffer2.append(zhuanzherngliu);
				sqlBuffer2.append("'");
			}

			if (!jiashouci.equals("")) {
				if (!zhuanzherngliu.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" jiashouci ='");
				sqlBuffer2.append(jiashouci);
				sqlBuffer2.append("'");
			}

			if (!jiamoci.equals("")) {
				if (!jiashouci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" jiamoci ='");
				sqlBuffer2.append(jiamoci);
				sqlBuffer2.append("'");
			}

			if (!shiyanluci.equals("")) {
				if (!jiamoci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shiyanluci ='");
				sqlBuffer2.append(shiyanluci);
				sqlBuffer2.append("'");
			}

			if (!gongyitiaozhengluci.equals("")) {
				if (!shiyanluci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" gongyitiaozhengluci ='");
				sqlBuffer2.append(gongyitiaozhengluci);
				sqlBuffer2.append("'");
			}

			if (!tongdao.equals("")) {
				if (!gongyitiaozhengluci.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" tongdao ='");
				sqlBuffer2.append(tongdao);
				sqlBuffer2.append("'");
			}

			if (!shengchanguzhang.equals("")) {
				if (!tongdao.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" shengchanguzhang ='");
				sqlBuffer2.append(shengchanguzhang);
				sqlBuffer2.append("'");
			}

			if (!huishoulv1.equals("") && huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv <='");
				sqlBuffer2.append(huishoulv1);
				sqlBuffer2.append("'");
			} else if (!huishoulv2.equals("") && huishoulv1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv >='");
				sqlBuffer2.append(huishoulv2);
				sqlBuffer2.append("'");
			} else if (!huishoulv1.equals("") && !huishoulv2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" huishoulv between '");
				sqlBuffer2.append(huishoulv1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(huishoulv2);
				sqlBuffer2.append("'");
			}

			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang <='");
				sqlBuffer2.append(zongpaimeiliang1);
				sqlBuffer2.append("'");
			} else if (!zongpaimeiliang2.equals("")
					&& zongpaimeiliang1.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang >='");
				sqlBuffer2.append(zongpaimeiliang2);
				sqlBuffer2.append("'");
			} else if (!zongpaimeiliang1.equals("")
					&& !zongpaimeiliang2.equals("")) {
				if (!huishoulv2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" zongpaimeiliang between '");
				sqlBuffer2.append(zongpaimeiliang1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(zongpaimeiliang2);
				sqlBuffer2.append("'");
			}

			if (!fe1.equals("") && fe2.equals("")) {
				if (!zongpaimeiliang2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe <='");
				sqlBuffer2.append(fe1);
				sqlBuffer2.append("'");
			} else if (!fe2.equals("") && fe1.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe >='");
				sqlBuffer2.append(fe2);
				sqlBuffer2.append("'");
			} else if (!fe1.equals("") && !fe2.equals("")) {
				if (!shengchanguzhang.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" fe between '");
				sqlBuffer2.append(fe1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(fe2);
				sqlBuffer2.append("'");
			}

			if (!hb1.equals("") && hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb <='");
				sqlBuffer2.append(hb1);
				sqlBuffer2.append("'");
			} else if (!hb2.equals("") && hb1.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb >='");
				sqlBuffer2.append(hb2);
				sqlBuffer2.append("'");
			} else if (!hb1.equals("") && !hb2.equals("")) {
				if (!fe2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" hb between '");
				sqlBuffer2.append(hb1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(hb2);
				sqlBuffer2.append("'");
			}

			if (!cl1.equals("") && cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl <='");
				sqlBuffer2.append(cl1);
				sqlBuffer2.append("'");
			} else if (!cl2.equals("") && cl1.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl >='");
				sqlBuffer2.append(cl2);
				sqlBuffer2.append("'");
			} else if (!cl1.equals("") && !cl2.equals("")) {
				if (!hb2.equals("")) {
					sqlBuffer2.append(" and");
				}
				sqlBuffer2.append(" cl between '");
				sqlBuffer2.append(cl1);
				sqlBuffer2.append("' and '");
				sqlBuffer2.append(cl2);
				sqlBuffer2.append("'");
			}
			
			sqlBuffer3 = sqlBuffer3.append(" WHERE ").append(sqlBuffer2);
			sqlBuffer4 = sqlBuffer4.append(" AND ").append(sqlBuffer2);
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
		sqlBuffer.append("t2.shaixuanfeiliao/t1.zonglushu AS shaixuanfeiliao, ");
		sqlBuffer.append("t2.cixuanfeiliao/t1.zonglushu AS cixuanfeiliao, ");
		sqlBuffer.append("t2.shouxuanfeiliao/t1.zonglushu AS shouxuanfeiliao, ");
		sqlBuffer.append("t2.sunhao/t1.zonglushu AS sunhao ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("(SELECT qihao,count(qihao) AS zonglushu FROM ironinfo WHERE junpin !='军品' GROUP BY qihao)t1, ");
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
		sqlBuffer.append("FROM ironinfo ").append(sqlBuffer3).append("GROUP BY qihao)t2 ");
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
				result4FormBean.setJunmaozhong(Output.getSubValue(resultSet.getString("junmaozhong"),0));
				result4FormBean.setJunjingzhong(Output.getSubValue(resultSet.getString("junjingzhong"),0));
				result4FormBean.setJunhuishoulv(Output.getSubValue(Output.getPercentValue(resultSet.getString("junhuishoulv")),2)+"%");
				result4FormBean.setDipi(Output.getSubValue(resultSet.getString("dipi"),2));
				result4FormBean.setShangmao(Output.getSubValue(resultSet.getString("shangmao"),2));
				result4FormBean.setPabi(Output.getSubValue(resultSet.getString("pabi"),2));
				result4FormBean.setFeidipi(Output.getSubValue(resultSet.getString("feidipi"),2));
				result4FormBean.setFeidipibili(Output.getSubValue(Output.getPercentValue(resultSet.getString("feidipibili")),2)+"%");
				result4FormBean.setFeishangmao(Output.getSubValue(resultSet.getString("feishangmao"),2));
				result4FormBean.setFeishangmaobili(Output.getSubValue(Output.getPercentValue(resultSet.getString("feishangmaobili")),2)+"%");
				result4FormBean.setFeipabi(Output.getSubValue(resultSet.getString("feipabi"),2));
				result4FormBean.setFeipabibili(Output.getSubValue(Output.getPercentValue(resultSet.getString("feipabibili")),2)+"%");
				result4FormBean.setShaixuanfeiliao(Output.getSubValue(resultSet.getString("shaixuanfeiliao"),2));
				result4FormBean.setCixuanfeiliao(Output.getSubValue(resultSet.getString("cixuanfeiliao"),1));
				result4FormBean.setShouxuanfeiliao(Output.getSubValue(resultSet.getString("shouxuanfeiliao"),2));
				result4FormBean.setSunhao(Output.getSubValue(resultSet.getString("sunhao"),2));
				
				waitaiList.add(result4FormBean);
			}
			return waitaiList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

}
