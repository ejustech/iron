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
import com.ejustech.iron.databean.form.Result4FormBean;

/**
 * @author NZ
 * 
 */
public class Result4Action extends EventDispatchAction {
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
			ArrayList<Result4FormBean> list = new ArrayList<Result4FormBean>();
			list = (ArrayList<Result4FormBean>) session.getAttribute("WAITAILIST"); // 此时取出来的是Object,
																					// 需要强转
			// 定义导出excel名字
			String fileName = "等外钛统计表.xls";
			fileName = new String(fileName.getBytes("UTF-8"), "utf-8");
			// 导出excel到服务器
			Excel.exportResult4Excel(list, fileName);
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