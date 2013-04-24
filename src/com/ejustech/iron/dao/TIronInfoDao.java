package com.ejustech.iron.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.Result2FormBean;

/***
 * T_Iron_Info表的数据访问对象
 */
public class TIronInfoDao extends BaseDao {

	// 全部信息输出表
	public ArrayList<TIronInfoDaoBean> getAllInfoList(
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

		ArrayList<TIronInfoDaoBean> allInfoList = new ArrayList<TIronInfoDaoBean>();

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

				TIronInfoDaoBean tIronInfoBean = new TIronInfoDaoBean();

				tIronInfoBean.setRiqi(resultSet.getString("riqi"));
				tIronInfoBean.setQihao(resultSet.getString("qihao"));
				tIronInfoBean.setLuci(resultSet.getString("luci"));
				tIronInfoBean.setGuige(resultSet.getString("guige"));
				tIronInfoBean.setShengchanluhao(resultSet
						.getString("shengchanluhao"));
				tIronInfoBean.setFanyingqihao(resultSet
						.getString("fanyingqihao"));
				tIronInfoBean.setShiyongcishu(resultSet
						.getString("shiyongcishu"));
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
				tIronInfoBean.setDengji_hanmeng(resultSet
						.getString("dengji_hanmeng"));
				tIronInfoBean.setKaohedengji_chumeng(resultSet
						.getString("kaohedengji_chumeng"));
				tIronInfoBean.setGongyitiaozheng(resultSet
						.getString("gongyitiaozheng"));
				tIronInfoBean.setGongyishiyan(resultSet
						.getString("gongyishiyan"));
				tIronInfoBean.setDipi(resultSet.getString("dipi"));
				tIronInfoBean.setShangmao(resultSet.getString("shangmao"));
				tIronInfoBean.setPabi(resultSet.getString("pabi"));
				tIronInfoBean.setFeidipi(resultSet.getString("feidipi"));
				tIronInfoBean
						.setFeishangmao(resultSet.getString("feishangmao"));
				tIronInfoBean.setFeipabi(resultSet.getString("feipabi"));
				tIronInfoBean.setFeitaifen(resultSet.getString("feitaifen"));
				tIronInfoBean.setCixuan(resultSet.getString("cixuan"));
				tIronInfoBean.setShouxuanfeiliao(resultSet
						.getString("shouxuanfeiliao"));
				tIronInfoBean.setSunhao(resultSet.getString("sunhao"));
				tIronInfoBean.setZongpaimeiliang(resultSet
						.getString("zongpaimeiliang"));
				tIronInfoBean.setChuluzhenkongdu(resultSet
						.getString("chuluzhenkongdu"));
				tIronInfoBean.setHuanyuanzuigaowendu(resultSet
						.getString("huanyuanzuigaowendu"));
				tIronInfoBean.setZhengliugaoheng(resultSet
						.getString("zhengliugaoheng"));
				tIronInfoBean.setZhuanzhengliu(resultSet
						.getString("zhuanzhengliu"));
				tIronInfoBean.setJiashouci(resultSet.getString("jiashouci"));
				tIronInfoBean.setJiamoci(resultSet.getString("jiamoci"));
				tIronInfoBean.setTongdao(resultSet.getString("tongdao"));
				tIronInfoBean.setShengchanguzhang(resultSet
						.getString("shengchanguzhang"));
				tIronInfoBean.setBeizhushuoming(resultSet
						.getString("beizhushuoming"));

				allInfoList.add(tIronInfoBean);
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
				result2FormBean.setFe(getSubValue(resultSet.getString("fe"), 4));
				result2FormBean.setCl(getSubValue(resultSet.getString("cl"), 4));
				result2FormBean.setO(getSubValue(resultSet.getString("n"), 4));
				result2FormBean.setN(getSubValue(resultSet.getString("o"), 4));
				result2FormBean.setHb(getSubValue(resultSet.getString("hb"), 0));
				result2FormBean.setLushu(resultSet.getString("zonglushu"));
				result2FormBean.setZongmaozhong(getSubValue(resultSet.getString("zongmaozhong"), 0));
				result2FormBean.setJunmaozhong(getSubValue(resultSet.getString("junmaozhong"), 0));
				result2FormBean.setJunmgdanhao(getSubValue(resultSet.getString("junmgdanhao"), 3));
				result2FormBean.setJunhuishoulv(resultSet
						.getString("junhuishoulv"));
				result2FormBean.setZongjingzhong(getSubValue(resultSet.getString("zongjingzhong"), 0));
				result2FormBean.setJunjingzhong(getSubValue(resultSet.getString("junjingzhong"), 0));
				result2FormBean.setJ0Aji(resultSet.getString("0Aji"));
				result2FormBean.setJ0Ajilv(resultSet.getString("0Ajilv"));
				System.out.println("aaaaaa=" + getSubValue(getPercentValue(resultSet.getString("0Ajilv")),4)+"%");
				result2FormBean.setJ0ji(resultSet.getString("0ji"));
				result2FormBean.setJ0jilv(resultSet.getString("0jilv"));
				result2FormBean.setJ0jiyishang(resultSet
						.getString("0jiyishang"));
				result2FormBean.setJ1ji(resultSet.getString("1ji"));
				result2FormBean.setJ1jilv(resultSet.getString("1jilv"));
				result2FormBean.setJ2ji(resultSet.getString("2ji"));
				result2FormBean.setJ3ji(resultSet.getString("3ji"));
				result2FormBean.setJ4ji(resultSet.getString("4ji"));
				result2FormBean.setJ5ji(resultSet.getString("5ji"));
				result2FormBean.setJ2jijiyixia(resultSet
						.getString("2jijiyixia"));
				result2FormBean.setJ2jijiyixialv(resultSet
						.getString("2jijiyixialv"));

				chumengList.add(result2FormBean);
			}
			return chumengList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	public static String getSubValue(String s, int length) {
//		int lng = s.length();
//		if (lng <= length)
//			return s;
//		s = s.substring(0, length + 1);
//
//		int dotPos = s.indexOf(".") + 1;
//		if (dotPos == 0)
//			return s.substring(0, toLength - 1);
		
//		BigDecimal bd = BigDecimal.valueOf(s).setScale(s.length() - dotPos - 1,
//				BigDecimal.ROUND_HALF_UP);

		BigDecimal v = new BigDecimal(s).setScale(length,
				BigDecimal.ROUND_HALF_UP);
		return String.valueOf(v);
	}
	public static String getPercentValue(String s) {
	        BigDecimal bd = new BigDecimal(s);
	        System.out.println(bd.multiply(new BigDecimal(100))); //输出2.500
	        return String.valueOf(bd);
	}


}
