package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.form.Result1FormBean;
import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.Result3FormBean;
import com.ejustech.iron.databean.form.Result4FormBean;
import com.ejustech.iron.databean.form.Result5FormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.Result7FormBean;
import com.ejustech.iron.form.SearchForm;

/**
 * @author NZ
 * 用于检索画面
 */
public class SearchAction extends EventDispatchAction {
	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward srch1(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {

		try {
			HttpSession session = request.getSession();
			SearchForm searchForm = (SearchForm) form;// TODO Auto-generated
			TIronInfoDao searchDao = new TIronInfoDao();
			// 检索条件
			String sqlCondition = new String();
			// 检索条件拼接字符串
			StringBuffer sqlBufferCondition = new StringBuffer();
			// 从Form中获取Search页面的检索条件
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
//			String tongdao = searchForm.getTongdao();
			String[] tongdao = searchForm.getTongdao();
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

			// 检索条件_期号
			if (qihao.length != 0) {
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
			} else {
				sqlBufferCondition.append(" qihao in (1,2,3,4)");
			}
			
			// 放置session用于输出检索区间
			session.setAttribute("RIQI", "");
			// 检索条件_日期(三段区间)
			if (!riqi1.equals("") && !riqi2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" riqi BETWEEN '");
				sqlBufferCondition.append(riqi1);
				sqlBufferCondition.append("' AND '");
				sqlBufferCondition.append(riqi2);
				sqlBufferCondition.append("'");
				session.setAttribute("RIQI", "[" + riqi1 + "～" + riqi2 + "]");
			} else if (!riqi1.equals("") && riqi2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" riqi >= '");
				sqlBufferCondition.append(riqi1);
				sqlBufferCondition.append("'");
				session.setAttribute("RIQI", "[" + riqi1 + "～" + riqi2 + "]");
			} else if (riqi1.equals("") && !riqi2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" riqi <= '");
				sqlBufferCondition.append(riqi2);
				sqlBufferCondition.append("'");
				session.setAttribute("RIQI", "[" + riqi1 + "～" + riqi2 + "]");
			}			
			
			// 检索条件_炉次(三段区间)
			if (!luci1.equals("") && !luci2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" luci BETWEEN '");
				sqlBufferCondition.append(luci1);
				sqlBufferCondition.append("' AND '");
				sqlBufferCondition.append(luci2);
				sqlBufferCondition.append("'");
			} else if (!luci1.equals("") && luci2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" luci >= '");
				sqlBufferCondition.append(luci1);
				sqlBufferCondition.append("'");
			} else if (luci1.equals("") && !luci2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" luci <= '");
				sqlBufferCondition.append(luci2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_规格
			if (!guige.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" guige ='");
				sqlBufferCondition.append(guige);
				sqlBufferCondition.append("'");
			}
			// 检索条件_生产炉号
			if (!shengchanluhao.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" shengchanluhao ='");
				sqlBufferCondition.append(shengchanluhao);
				sqlBufferCondition.append("'");
			}
			// 检索条件_反应器号
			if (!fanyingqihao.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" fanyingqihao ='");
				sqlBufferCondition.append(fanyingqihao);
				sqlBufferCondition.append("'");
			}
			// 检索条件_使用次数(三段区间)
			if (!shiyongcishu1.equals("") && !shiyongcishu2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" shiyongcishu BETWEEN ");
				sqlBufferCondition.append(shiyongcishu1);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(shiyongcishu2);
			} else if (!shiyongcishu1.equals("") && shiyongcishu2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" shiyongcishu >= '");
				sqlBufferCondition.append(shiyongcishu1);
				sqlBufferCondition.append("'");
			} else if (shiyongcishu1.equals("") && !shiyongcishu2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" shiyongcishu <= '");
				sqlBufferCondition.append(shiyongcishu2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_Ticl4(三段区间)
			if (!ticl41.equals("") && !ticl42.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" ticl BETWEEN ");
				sqlBufferCondition.append(ticl41);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(ticl42);
			} else if (!ticl41.equals("") && ticl42.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" ticl >= '");
				sqlBufferCondition.append(ticl41);
				sqlBufferCondition.append("'");
			} else if (ticl41.equals("") && !ticl42.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" ticl <= '");
				sqlBufferCondition.append(ticl42);
				sqlBufferCondition.append("'");
			}
			// 检索条件_出炉真空度(三段区间)
			if (!chuluzhenkongdu1.equals("") && chuluzhenkongdu2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" chuluzhenkongdu >= ");
				sqlBufferCondition.append(chuluzhenkongdu1);
			} else if (!chuluzhenkongdu2.equals("") && chuluzhenkongdu1.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" chuluzhenkongdu <= ");
				sqlBufferCondition.append(chuluzhenkongdu2);
			} else if (!chuluzhenkongdu2.equals("") && !chuluzhenkongdu1.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" chuluzhenkongdu BETWEEN ");
				sqlBufferCondition.append(chuluzhenkongdu1);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(chuluzhenkongdu2);
			}
			// 检索条件_转蒸馏
			if (!zhuanzhengliu.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" zhuanzhengliu ='");
				// 非英文字符转换为UTF-8防止数据库解析成乱码
				sqlBufferCondition.append(new String(zhuanzhengliu.getBytes("ISO-8859-1"), "utf-8"));
				sqlBufferCondition.append("'");
			}
			// 检索条件_加首次
			if (!jiashouci.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" jiashouci ='");
				sqlBufferCondition.append(new String(jiashouci.getBytes("ISO-8859-1"), "utf-8"));
				sqlBufferCondition.append("'");
			}
			// 检索条件_加末次
			if (!jiamoci.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" jiamoci ='");
				sqlBufferCondition.append(new String(jiamoci.getBytes("ISO-8859-1"), "utf-8"));
				sqlBufferCondition.append("'");
			}
			// 检索条件_实验炉次
			if (!shiyanluci.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" gongyishiyan ='");
				sqlBufferCondition.append(shiyanluci);
				sqlBufferCondition.append("'");
			}
			// 检索条件_工艺调整炉次
			if (!gongyitiaozhengluci.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" gongyitiaozheng ='");
				sqlBufferCondition.append(new String(gongyitiaozhengluci.getBytes("ISO-8859-1"), "utf-8"));
				sqlBufferCondition.append("'");
			}
			// 检索条件_通道
			if (tongdao.length != 0) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" tongdao in (");
				StringBuffer transmode = new StringBuffer("");
				String[] trans = tongdao;
				
				if (trans != null && trans.length > 0) {
					for (int i = 0; i < trans.length; i++) {
						String t = trans[i];
						if(trans[i].equals("1")){
							t = "'" + new String("√".getBytes("utf-8"), "utf-8") + "'";
						}
						if(trans[i].equals("2")){
							t = "'" + new String("×".getBytes("utf-8"), "utf-8") + "'";
						}
						transmode.append(t);
						if (!(i == trans.length - 1)) {
							transmode.append(",");
						}
					}
				}
				sqlBufferCondition.append(transmode.toString());
				sqlBufferCondition.append(")");
				
//				sqlBufferCondition.append(" AND");
//				sqlBufferCondition.append(" tongdao ='");
//				sqlBufferCondition.append(new String(tongdao.getBytes("ISO-8859-1"), "utf-8"));
//				sqlBufferCondition.append("'");
			} else {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" tongdao in ('√', '×')");
			}
			// 检索条件_生产故障
			if (!shengchanguzhang.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" shengchanguzhang ='");
				sqlBufferCondition.append(shengchanguzhang);
				sqlBufferCondition.append("'");
			}
			// 检索条件_回收率（即成品率）(三段区间)
			if (!huishoulv1.equals("") && huishoulv2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" chengpinlv >='");
				sqlBufferCondition.append(huishoulv1);
				sqlBufferCondition.append("'");
			} else if (!huishoulv2.equals("") && huishoulv1.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" chengpinlv <='");
				sqlBufferCondition.append(huishoulv2);
				sqlBufferCondition.append("'");
			} else if (!huishoulv1.equals("") && !huishoulv2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" chengpinlv BETWEEN '");
				sqlBufferCondition.append(huishoulv1);
				sqlBufferCondition.append("' AND '");
				sqlBufferCondition.append(huishoulv2);
				sqlBufferCondition.append("'");
			}
			// 检索条件_总排镁量(三段区间)
			if (!zongpaimeiliang1.equals("") && zongpaimeiliang2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" zongpaimeiliang >= ");
				sqlBufferCondition.append(zongpaimeiliang1);
			} else if (!zongpaimeiliang2.equals("") && zongpaimeiliang1.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" zongpaimeiliang <= ");
				sqlBufferCondition.append(zongpaimeiliang2);
			} else if (!zongpaimeiliang1.equals("") && !zongpaimeiliang2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" zongpaimeiliang BETWEEN ");
				sqlBufferCondition.append(zongpaimeiliang1);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(zongpaimeiliang2);
			}
			// 检索条件_Fe(三段区间)
			if (!fe1.equals("") && fe2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" fe >= ");
				sqlBufferCondition.append(fe1);
			} else if (!fe2.equals("") && fe1.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" fe <= ");
				sqlBufferCondition.append(fe2);
			} else if (!fe1.equals("") && !fe2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" fe BETWEEN ");
				sqlBufferCondition.append(fe1);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(fe2);
			}
			// 检索条件_HB(三段区间)
			if (!hb1.equals("") && hb2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" hb >= ");
				sqlBufferCondition.append(hb1);
			} else if (!hb2.equals("") && hb1.equals("")) {
				if (!riqi1.equals("") || !riqi2.equals("") || qihao.length != 0 || !luci1.equals("") || !luci2.equals("") || !guige.equals("")
						|| !shengchanluhao.equals("") || !fanyingqihao.equals("") || !shiyongcishu1.equals("") || !shiyongcishu2.equals("")
						|| !ticl41.equals("") || !ticl42.equals("") || !chuluzhenkongdu1.equals("") || !chuluzhenkongdu2.equals("")
						|| !zhuanzhengliu.equals("") || !jiashouci.equals("") || !jiamoci.equals("") || !shiyanluci.equals("")
						|| !gongyitiaozhengluci.equals("") || !tongdao.equals("") || !shengchanguzhang.equals("") || !huishoulv1.equals("")
						|| !huishoulv2.equals("") || !zongpaimeiliang1.equals("") || !zongpaimeiliang2.equals("") || !fe1.equals("")
						|| !fe2.equals("")) {
					sqlBufferCondition.append(" AND");
				}
				sqlBufferCondition.append(" hb <= ");
				sqlBufferCondition.append(hb2);
			} else if (!hb1.equals("") && !hb2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" hb BETWEEN ");
				sqlBufferCondition.append(hb1);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(hb2);
			}
			// 检索条件_Cl(三段区间)
			if (!cl1.equals("") && cl2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" cl >= ");
				sqlBufferCondition.append(cl1);
			} else if (!cl2.equals("") && cl1.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" cl <= ");
				sqlBufferCondition.append(cl2);
			} else if (!cl1.equals("") && !cl2.equals("")) {
				sqlBufferCondition.append(" AND");
				sqlBufferCondition.append(" cl BETWEEN ");
				sqlBufferCondition.append(cl1);
				sqlBufferCondition.append(" AND ");
				sqlBufferCondition.append(cl2);
			}
			
			String monthFlag = "m";
			// 选定要查询的输出表
			switch (Integer.parseInt(selInfoList)) {
			case 1: {
				sqlCondition = " WHERE" + sqlBufferCondition.toString();
				// sqlCondition查询条件放到session用于result1画面删除后刷新页面的同样条件
//				HttpSession session = request.getSession();
				session.setAttribute("SQLCONDITION", sqlCondition);
				// 执行查询全部信息操作并放到AllINFOLIST供jsp读取
				ArrayList<Result1FormBean> allInfoList = new ArrayList<Result1FormBean>();
				allInfoList = (ArrayList<Result1FormBean>) searchDao.getAllInfoList(request, sqlCondition);
				request.setAttribute("AllINFOLIST", allInfoList);
				// 全部信息输出表
				return mapping.findForward("srch1");
			}
			case 2: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result2FormBean> hanmengList = new ArrayList<Result2FormBean>();
				hanmengList = (ArrayList<Result2FormBean>) searchDao.getHanmengList(request, sqlCondition,monthFlag);
				request.setAttribute("HANMENGLIST", hanmengList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("HANMENGLIST", hanmengList);
				// 生产数据统计表-含锰
				return mapping.findForward("srch2");
			}
			case 21: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result2FormBean> hanmengList = new ArrayList<Result2FormBean>();
				hanmengList = (ArrayList<Result2FormBean>) searchDao.getHanmengList(request, sqlCondition,"");
				request.setAttribute("HANMENGLIST", hanmengList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("HANMENGLIST", hanmengList);
				// 生产数据统计表-含锰
				return mapping.findForward("srch2");
			}
			case 3: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result3FormBean> chumengList = new ArrayList<Result3FormBean>();
				chumengList = (ArrayList<Result3FormBean>) searchDao.getChumengList(request, sqlCondition,monthFlag);
				request.setAttribute("CHUMENGLIST", chumengList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("CHUMENGLIST", chumengList);
				// 生产数据统计表-除锰
				return mapping.findForward("srch3");
			}
			case 31: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result3FormBean> chumengList = new ArrayList<Result3FormBean>();
				chumengList = (ArrayList<Result3FormBean>) searchDao.getChumengList(request, sqlCondition,"");
				request.setAttribute("CHUMENGLIST", chumengList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("CHUMENGLIST", chumengList);
				// 生产数据统计表-除锰
				return mapping.findForward("srch3");
			}
			case 4: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result4FormBean> waitaiList = new ArrayList<Result4FormBean>();
				waitaiList = (ArrayList<Result4FormBean>) searchDao.getWaitaiList(request, sqlCondition);
				request.setAttribute("WAITAILIST", waitaiList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("WAITAILIST", waitaiList);
				// 等外钛统计表
				return mapping.findForward("srch4");
			}
			case 5: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result5FormBean> zhibiaoList = new ArrayList<Result5FormBean>();
				zhibiaoList = (ArrayList<Result5FormBean>) searchDao.getZhibiaoList(request, sqlCondition);
				request.setAttribute("ZHIBIAOLIST", zhibiaoList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("ZHIBIAOLIST", zhibiaoList);
				// 指标统计表
				return mapping.findForward("srch5");
			}
			case 6: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result6FormBean> danluList = new ArrayList<Result6FormBean>();
				danluList = (ArrayList<Result6FormBean>) searchDao.getDanluList(request, sqlCondition);
				request.setAttribute("DANLULIST", danluList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("DANLULIST", danluList);
				// 单炉生产数据统计表
				return mapping.findForward("srch6");
			}
			case 7: {
				sqlCondition = sqlBufferCondition.toString();
				ArrayList<Result7FormBean> yueluList = new ArrayList<Result7FormBean>();
				yueluList = (ArrayList<Result7FormBean>) searchDao.getYueluList(request, sqlCondition);
				request.setAttribute("YUELULIST", yueluList);
				// list放到session用于excel导出
//				HttpSession session = request.getSession();
				session.setAttribute("YUELULIST", yueluList);
				// 月还渗炉次生产数据汇总表
				return mapping.findForward("srch7");
			}
			}
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("searchError");
		}
	}
	
	// 处理返回跳转动作
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			return mapping.findForward("back");
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("searchError");
		}
//			return null;
	}
	// 处理返回menu动作
//	public ActionForward backToMenu(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
//		try {
//			return mapping.findForward("backToMenu");
//		} catch (Exception e) {
//			return mapping.findForward("searchError");
//		}
//	}
}