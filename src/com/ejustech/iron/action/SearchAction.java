package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.form.SearchForm;

/**
 * MyEclipse Struts Creation date: 04-16-2013
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/search" name="searchForm" input="/form/search.jsp"
 *                scope="request" validate="true"
 */
public class SearchAction extends EventDispatchAction {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	/**
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	/**
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward srch1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		try {
			SearchForm searchForm = (SearchForm) form;// TODO Auto-generated
			// method stub
			TIronInfoDao searchDao = new TIronInfoDao();

			String riqi1 = searchForm.getRiqi1();
			String riqi2 = searchForm.getRiqi2();
			String[] qihao = searchForm.getQihao();
			String luci1 = searchForm.getLuci1();
			String luci2 = searchForm.getLuci2();
			String guige = searchForm.getGuige();
			String shengchanluhao = searchForm.getShengchanluhao();
			String fanyingqihao = searchForm.getFanyingqihao();
			String shiyongcishu1 = searchForm.getShiyongcishu1();
			String shiyongcishu2 = searchForm.getShiyongcishu2();
			String ticl41 = searchForm.getTicl41();
			String ticl42 = searchForm.getTicl42();
			String chuluzhenkongdu1 = searchForm.getChuluzhenkongdupa1();
			String chuluzhenkongdu2 = searchForm.getChuluzhenkongdupa2();
			String zhuanzhengliu = searchForm.getZhuanzhengliu();
			String jiashouci = searchForm.getJiashouci();
			String jiamoci = searchForm.getJiamoci();
			String shiyanluci = searchForm.getShiyanluci();
			String gongyitiaozhengluci = searchForm.getGongyitiaozhengluci();
			String tongdao = searchForm.getTongdao();
			String shengchanguzhang = searchForm.getShengchanguzhang();
			String huishoulv1 = searchForm.getHuishoulv1();
			String huishoulv2 = searchForm.getHuishoulv2();
			String zongpaimeiliang1 = searchForm.getZongpaimeiliang1();
			String zongpaimeiliang2 = searchForm.getZongpaimeiliang2();
			String fe1 = searchForm.getFe1();
			String fe2 = searchForm.getFe2();
			String hb1 = searchForm.getHb1();
			String hb2 = searchForm.getHb2();
			String cl1 = searchForm.getCl1();
			String cl2 = searchForm.getCl2();
			String selInfoList = searchForm.getSelInfoList();

			String sqlCondition = new String();

			StringBuffer sqlBufferCondition = new StringBuffer();

			// 检索条件_日期
			if (!riqi1.equals("")) {
				sqlBufferCondition.append(" riqi between '");
				sqlBufferCondition.append(riqi1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(riqi2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_期号
			if (qihao.length != 0) {
				if (!riqi1.equals("") || !riqi2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" qihao in (");
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
				sqlBufferCondition.append(transmode.toString());
				sqlBufferCondition.append(")");
			}
			// 检索条件_炉次(区间)
			if (!luci1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" luci between '");
				sqlBufferCondition.append(luci1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(luci2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_规格
			if (!guige.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" guige ='");
				sqlBufferCondition.append(guige);
				sqlBufferCondition.append("'");
			}
			// 检索条件_生产炉号
			if (!shengchanluhao.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" shengchanluhao ='");
				sqlBufferCondition.append(shengchanluhao);
				sqlBufferCondition.append("'");
			}
			// 检索条件_反应器号
			if (!fanyingqihao.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" fanyingqihao ='");
				sqlBufferCondition.append(fanyingqihao);
				sqlBufferCondition.append("'");
			}
			// 检索条件_使用次数(区间)
			if (!shiyongcishu1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" shiyongcishu between ");
				sqlBufferCondition.append(shiyongcishu1);
				sqlBufferCondition.append(" and ");
				sqlBufferCondition.append(shiyongcishu2);
			}
			// 检索条件_Ticl4(区间)
			if (!ticl41.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" ticl between '");
				sqlBufferCondition.append(ticl41);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(ticl42);
				sqlBufferCondition.append("'");
			}
			// 检索条件_出炉真空度(三段区间)
			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" chuluzhenkongdu <='");
				sqlBufferCondition.append(chuluzhenkongdu1);
				sqlBufferCondition.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& chuluzhenkongdu1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" chuluzhenkongdu >='");
				sqlBufferCondition.append(chuluzhenkongdu2);
				sqlBufferCondition.append("'");
			} else if (!chuluzhenkongdu2.equals("")
					&& !chuluzhenkongdu1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" chuluzhenkongdu between '");
				sqlBufferCondition.append(chuluzhenkongdu1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(chuluzhenkongdu2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_转蒸馏
			if (!zhuanzhengliu.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" zhuanzhengliu ='");
				sqlBufferCondition.append(zhuanzhengliu);
				sqlBufferCondition.append("'");
			}
			// 检索条件_加首次
			if (!jiashouci.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" jiashouci ='");
				sqlBufferCondition.append(jiashouci);
				sqlBufferCondition.append("'");
			}
			// 检索条件_加末次
			if (!jiamoci.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" jiamoci ='");
				sqlBufferCondition.append(jiamoci);
				sqlBufferCondition.append("'");
			}
			// 检索条件_实验炉次
			if (!shiyanluci.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" shiyanluci ='");
				sqlBufferCondition.append(shiyanluci);
				sqlBufferCondition.append("'");
			}
			// 检索条件_工艺调整炉次
			if (!gongyitiaozhengluci.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" gongyitiaozhengluci ='");
				sqlBufferCondition.append(gongyitiaozhengluci);
				sqlBufferCondition.append("'");
			}
			// 检索条件_通道
			if (!tongdao.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" tongdao ='");
				sqlBufferCondition.append(tongdao);
				sqlBufferCondition.append("'");
			}
			// 检索条件_生产故障
			if (!shengchanguzhang.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" shengchanguzhang ='");
				sqlBufferCondition.append(shengchanguzhang);
				sqlBufferCondition.append("'");
			}
			// 检索条件_回收率(三段区间)
			if (!huishoulv1.equals("") && huishoulv2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" huishoulv <='");
				sqlBufferCondition.append(huishoulv1);
				sqlBufferCondition.append("'");
			} else if (!huishoulv2.equals("") && huishoulv1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" huishoulv >='");
				sqlBufferCondition.append(huishoulv2);
				sqlBufferCondition.append("'");
			} else if (!huishoulv1.equals("") && !huishoulv2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" huishoulv between '");
				sqlBufferCondition.append(huishoulv1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(huishoulv2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_总排镁量(三段区间)
			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" zongpaimeiliang <='");
				sqlBufferCondition.append(zongpaimeiliang1);
				sqlBufferCondition.append("'");
			} else if (!zongpaimeiliang2.equals("")
					&& zongpaimeiliang1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" zongpaimeiliang >='");
				sqlBufferCondition.append(zongpaimeiliang2);
				sqlBufferCondition.append("'");
			} else if (!zongpaimeiliang1.equals("")
					&& !zongpaimeiliang2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" zongpaimeiliang between '");
				sqlBufferCondition.append(zongpaimeiliang1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(zongpaimeiliang2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_Fe(三段区间)
			if (!fe1.equals("") && fe2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" fe <='");
				sqlBufferCondition.append(fe1);
				sqlBufferCondition.append("'");
			} else if (!fe2.equals("") && fe1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" fe >='");
				sqlBufferCondition.append(fe2);
				sqlBufferCondition.append("'");
			} else if (!fe1.equals("") && !fe2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" fe between '");
				sqlBufferCondition.append(fe1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(fe2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_HB(三段区间)
			if (!hb1.equals("") && hb2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" hb <='");
				sqlBufferCondition.append(hb1);
				sqlBufferCondition.append("'");
			} else if (!hb2.equals("") && hb1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" hb >='");
				sqlBufferCondition.append(hb2);
				sqlBufferCondition.append("'");
			} else if (!hb1.equals("") && !hb2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" hb between '");
				sqlBufferCondition.append(hb1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(hb2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_Cl(三段区间)
			if (!cl1.equals("") && cl2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("") || !hb1.equals("")
						|| !hb2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" cl <='");
				sqlBufferCondition.append(cl1);
				sqlBufferCondition.append("'");
			} else if (!cl2.equals("") && cl1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("") || !hb1.equals("")
						|| !hb2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" cl >='");
				sqlBufferCondition.append(cl2);
				sqlBufferCondition.append("'");
			} else if (!cl1.equals("") && !cl2.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("") || !hb1.equals("")
						|| !hb2.equals("")) {
					sqlBufferCondition.append(" and");
				}
				sqlBufferCondition.append(" cl between '");
				sqlBufferCondition.append(cl1);
				sqlBufferCondition.append("' and '");
				sqlBufferCondition.append(cl2);
				sqlBufferCondition.append("'");
			}

			switch (Integer.parseInt(selInfoList)) {
			case 1: {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0
						|| !luci1.equals("") || !luci2.equals("")
						|| !guige.equals("") || !shengchanluhao.equals("")
						|| !fanyingqihao.equals("")
						|| !shiyongcishu1.equals("")
						|| !shiyongcishu2.equals("") || !ticl41.equals("")
						|| !ticl42.equals("") || !chuluzhenkongdu1.equals("")
						|| !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("")
						|| !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("")
						|| !tongdao.equals("") || !shengchanguzhang.equals("")
						|| !huishoulv1.equals("") || !huishoulv2.equals("")
						|| !zongpaimeiliang1.equals("")
						|| !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("") || !hb1.equals("")
						|| !hb2.equals("") || !cl1.equals("")
						|| !cl2.equals("")) {
					sqlCondition = " WHERE" + sqlBufferCondition.toString();
				} else {
					// sqlCondition = sqlBufferCondition.toString();
					sqlCondition = "";
				}
				ArrayList allInfoList = new ArrayList();
				allInfoList = (ArrayList) searchDao.getAllInfoList(request,
						sqlCondition);
				request.setAttribute("AllINFOLIST", allInfoList);
				// 全部信息输出表
				return mapping.findForward("srch1");
			}
			case 2: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList hanmengList = new ArrayList();
				hanmengList = (ArrayList) searchDao.getHanmengList(request,
						sqlCondition);
				request.setAttribute("HANMENGLIST", hanmengList);

				// 月生产数据统计表-含锰
				return mapping.findForward("srch2");
			}
			case 3: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList chumengList = new ArrayList();
				chumengList = (ArrayList) searchDao.getChumengList(request,
						sqlCondition);
				request.setAttribute("CHUMENGLIST", chumengList);
				// 月生产数据统计表-除锰
				return mapping.findForward("srch3");
			}
			case 4: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList waitaiList = new ArrayList();
				waitaiList = (ArrayList) searchDao.getWaitaiList(request,
						sqlCondition);
				request.setAttribute("WAITAILIST", waitaiList);
				// 月等外钛统计表
				return mapping.findForward("srch4");
			}
			case 5: {
				// 月指标统计表
				return mapping.findForward("srch5");
			}
			case 6: {
				// 单炉生产数据统计表
				return mapping.findForward("srch6");
			}
			case 7: {
				// 月还渗炉次生产数据汇总表
				return mapping.findForward("srch7");
			}
			}

			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("loginError");
		}
	}

	// 处理返回menu动作
	public ActionForward backToMenu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			return mapping.findForward("backToMenu");
		} catch (Exception e) {
			return mapping.findForward("loginError");
		}
	}
}