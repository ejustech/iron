package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.databean.form.UserManageFormBean;
import com.ejustech.iron.form.UserManageForm;

/**
 * MyEclipse Struts Creation date: 05-07-2013
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 */
public class UserManageAction extends EventDispatchAction {
	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	// 处理用户删除动作
	public ActionForward del(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			UserManageForm userManageForm = (UserManageForm) form;
			// 获取用户
			String[] userID = userManageForm.getIndexCheckbox();
			StringBuffer transmode = new StringBuffer("");
			String[] trans = userID;
			if (trans != null && trans.length > 0) {
				for (int i = 0; i < trans.length; i++) {
					transmode.append("'" + trans[i] + "'");
					if (!(i == trans.length - 1)) {
						transmode.append(",");
					}
				}
			}
			System.out.println("indexValue = " + transmode.toString());

			MUserDao mUserDao = new MUserDao();
			// 执行删除选定用户
			mUserDao.delUserList(transmode.toString());
			// 返回删除后的用户列表
			ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
			userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
			request.setAttribute("USERLIST", userList);

			return mapping.findForward("del");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户添加跳转动作
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			return mapping.findForward("add");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户更新跳转动作
	public ActionForward modify(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			UserManageForm userManageForm = (UserManageForm) form;
			// 获取用户
			String[] userID = userManageForm.getIndexCheckbox();
			StringBuffer transmode = new StringBuffer("");
			String[] trans = userID;
			if (trans != null && trans.length > 0) {
				for (int i = 0; i < trans.length; i++) {
					transmode.append("'" + trans[i] + "'");
					if (!(i == trans.length - 1)) {
						transmode.append(",");
					}
				}
			}
			System.out.println("indexValue = " + transmode.toString());
			
			return mapping.findForward("modify");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户返回跳转动作
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			return mapping.findForward("back");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}