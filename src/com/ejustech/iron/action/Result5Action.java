package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ejustech.iron.common.Excel;
import com.ejustech.iron.databean.form.Result5FormBean;

/**
 * @author NZ
 *
 */
public class Result5Action extends Action {
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
			ArrayList<Result5FormBean> list = new ArrayList<Result5FormBean>();
			list = (ArrayList<Result5FormBean>) session.getAttribute("ZHIBIAOLIST"); // 此时取出来的是Object,
																						// 需要强转
			// 定义导出excel名字
			String fileName = "result5.xls";
			// 导出excel到服务器
			Excel.exportResult5Excel(list, fileName);
			// 下载excel到本地
			FileAction fileDownload = new FileAction();
			fileDownload.downFile(response, fileName);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("loginError");
		}
	}
}