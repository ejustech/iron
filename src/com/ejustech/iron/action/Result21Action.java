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
import com.ejustech.iron.databean.form.Result2FormBean;

/**
 * @author NZ
 * 
 */
public class Result21Action extends EventDispatchAction {
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
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			// 从session获取list
			HttpSession session = request.getSession();
			ArrayList<Result2FormBean> list = new ArrayList<Result2FormBean>();
			list = (ArrayList<Result2FormBean>) session.getAttribute("HANMENG1LIST"); // 此时取出来的是Object,
																						// 需要强转
			// 定义导出excel名字
//			String fileName = "result2.xls";
			String fileName = "生产数据统计表-含锰（产量）.xls";
			fileName = new String(fileName.getBytes("UTF-8"), "utf-8");
			//取得检索日期
			String riqi = (String) session.getAttribute("RIQI");
			// 导出excel到服务器
			Excel.exportResult21Excel(list, fileName, riqi);
			// 下载excel到本地
			FileAction fileDownload = new FileAction();
			fileDownload.downFile(response, fileName);
			// 删除所有session中保存的键
			// session.removeAttribute("HANMENGLIST");
			// session.invalidate();
			// 返回检索画面
			// SearchFormBean searchFormBean = new SearchFormBean();
			// searchFormBean.setSelInfoList("1");
			// ArrayList<SearchFormBean> selList = new
			// ArrayList<SearchFormBean>();
			// selList.add(searchFormBean);
			// request.setAttribute("SELLIST", selList);
			// return mapping.findForward("search");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("searchError");
		}
	}
}