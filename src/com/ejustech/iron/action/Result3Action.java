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
import com.ejustech.iron.databean.form.Result3FormBean;

/**
 * @author NZ
 *
 */
public class Result3Action extends EventDispatchAction {
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
			ArrayList<Result3FormBean> list = new ArrayList<Result3FormBean>();
			list = (ArrayList<Result3FormBean>) session.getAttribute("CHUMENGLIST"); // 此时取出来的是Object,
																						// 需要强转
			// 定义导出excel名字
			String fileName = "生产数据统计表-除锰.xls";
			fileName = new String(fileName.getBytes("UTF-8"), "utf-8");
			// 导出excel到服务器
			Excel.exportResult3Excel(list, fileName);
			// 下载excel到本地
			FileAction fileDownload = new FileAction();
			fileDownload.downFile(response, fileName);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("searchError");
		}
	}
}