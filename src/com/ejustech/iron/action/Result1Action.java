package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.common.Excel;
import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.form.Result1FormBean;
import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.SearchFormBean;
import com.ejustech.iron.form.Result1Form;
import com.ejustech.iron.form.SearchForm;

/**
 * @author NZ
 * 
 */
public class Result1Action extends EventDispatchAction {
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
	// 处理删除动作
	public ActionForward res1_del(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			SearchFormBean searchFormBean = new SearchFormBean();
			// 取得删除的主键（index=炉次&规格）
			Result1Form result1Form = (Result1Form) form;
			String[] indexValue = result1Form.getIndexCheckbox();
			String luci = new String();
			String guige = new String();
			String[] trans = indexValue;

			TIronInfoDao tIronInfoDao = new TIronInfoDao();

			if (trans != null && trans.length > 0) {
				for (int i = 0; i < trans.length; i++) {
//					luci = "'" + trans[i].substring(0, 9) + "'";
//					guige = "'" + trans[i].substring(10) + "'";
					
					luci = "'" + trans[i].split("~")[0] + "'";
					guige = "'" + trans[i].split("~")[1] + "'";
					// 删除操作
					tIronInfoDao.delAllInfoList(luci, guige);
				}
			}

			// 返回删除后的用户列表
			ArrayList<Result1FormBean> allInfoList = new ArrayList<Result1FormBean>();
			// 从session获取sqlCondition
			HttpSession session = request.getSession();
			String sqlCondition = new String();
			sqlCondition = (String) session.getAttribute("SQLCONDITION"); // 此时取出来的是Object,
																			// 需要强转

			allInfoList = (ArrayList<Result1FormBean>) tIronInfoDao.getAllInfoList(request, sqlCondition);
			request.setAttribute("AllINFOLIST", allInfoList);

			return mapping.findForward("res1_del");

		} catch (Exception e) {
		}
		return null;
	}

	// 处理用户返回跳转动作
	public ActionForward res1_back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			try {
				SearchFormBean searchFormBean = new SearchFormBean();

				searchFormBean.setSelInfoList("1");
				ArrayList<SearchFormBean> selList = new ArrayList<SearchFormBean>();
				selList.add(searchFormBean);
				request.setAttribute("SELLIST", selList);

//				SearchForm searchForm = new SearchForm();
//				searchForm.set
//				Result1Form result1Form = (Result1Form) form;
//				SearchForm searchForm = (SearchForm) form;
//				System.out.println("llll = " + result1Form.getIndexCheckbox().length);
//				String[] indexValue = result1Form.getIndexCheckbox();
//				StringBuffer transmode = new StringBuffer("");
//				String[] trans = indexValue;
//				if (trans != null && trans.length > 0) {
//					for (int i = 0; i < trans.length; i++) {
//						transmode.append(trans[i]);
//						if (!(i == trans.length - 1)) {
//							transmode.append(",");
//						}
//					}
//				}
//				System.out.println("indexValue = " + transmode.toString());
				return mapping.findForward("res1_back");
			} catch (Exception e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// Excel导出
	public ActionForward exportResult1(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			// 从session获取数据list
			HttpSession session = request.getSession();
			ArrayList<Result1FormBean> list = new ArrayList<Result1FormBean>();
			list = (ArrayList<Result1FormBean>) session.getAttribute("AllINFOLIST"); // 此时取出来的是Object,
																						// 需要强转
			// 定义导出excel名字
			String fileName = "全部数据输出表.xls";
			fileName = new String(fileName.getBytes("UTF-8"), "utf-8");
			//取得检索日期
			String riqi = (String) session.getAttribute("RIQI");
			// 导出excel到服务器
			Excel.exportResult1Excel(list, fileName, riqi);
			// 下载excel到本地
			FileAction fileDownload = new FileAction();
			fileDownload.downFile(response, fileName);
			
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("searchError");
		}
	}

	// 处理search动作
	// public ActionForward search(ActionMapping mapping, ActionForm form,
	// HttpServletRequest request, HttpServletResponse response) {
	// try {
	// SearchFormBean searchFormBean = new SearchFormBean();
	//
	// searchFormBean.setSelInfoList("1");
	// ArrayList<SearchFormBean> selList = new ArrayList<SearchFormBean>();
	// selList.add(searchFormBean);
	// request.setAttribute("SELLIST", selList);

	// Result1Form result1Form = (Result1Form)form;
	// SearchForm searchForm = (SearchForm) form;
	// System.out.println("llll = " + result1Form.getIndexCheckbox().length);
	// String[] indexValue = result1Form.getIndexCheckbox();
	// StringBuffer transmode = new StringBuffer("");
	// String[] trans = indexValue;
	// if (trans != null && trans.length > 0) {
	// for (int i = 0; i < trans.length; i++) {
	// transmode.append(trans[i]);
	// if (!(i == trans.length - 1)) {
	// transmode.append(",");
	// }
	// }
	// }
	// System.out.println("indexValue = " + transmode.toString());

	// return mapping.findForward("search");
	// } catch (Exception e) {
	// }
	// return null;
	// }
}