package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.databean.form.Result3FormBean;
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
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
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
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			// 动作状态放到session用于执行用户名是否存在的验证

			HttpSession session = request.getSession();
			// session.removeAttribute("USERID");
			// session.invalidate();
			session.setAttribute("USERID", "");
			session.setAttribute("EMAIL", "");
			session.setAttribute("TEL", "");
			session.setAttribute("UPDATE_FLAG", "Add");
			return mapping.findForward("add");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户修改跳转动作
	public ActionForward modify(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			UserManageForm userManageForm = (UserManageForm) form;
			// 获取要更新的用户名称
			String userID = userManageForm.getIndexModify();
			MUserDao mUserDao = new MUserDao();
			ArrayList<UserManageFormBean> sendUserList = new ArrayList<UserManageFormBean>();

			// 获取要修改的用户相关信息传递到更新页面
			sendUserList = (ArrayList<UserManageFormBean>) mUserDao.sendUserList(userID);
			;
			HttpSession session = request.getSession();
			session.setAttribute("USERID", sendUserList.get(0).getUserID());
			session.setAttribute("EMAIL", sendUserList.get(0).getEmail());
			session.setAttribute("TEL", sendUserList.get(0).getTel());
			// 传值到UserAddAction用来判断是更新还是添加
			session.setAttribute("UPDATE_FLAG", "Modify");
			return mapping.findForward("modify");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户返回跳转动作
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			return mapping.findForward("back");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}