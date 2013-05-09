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
import com.ejustech.iron.form.UserAddForm;

/**
 * MyEclipse Struts Creation date: 05-09-2013
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 */
public class UserAddAction extends EventDispatchAction {
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
	// 处理用户更新动作
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			UserAddForm userAddForm = (UserAddForm) form;
			String userID = userAddForm.getUserID();
			String password = userAddForm.getPassword();
			String authority = userAddForm.getAuthority();
			String tel = userAddForm.getTel();
			String email = userAddForm.getEmail();
			// 获取用户权限
			// HttpSession session = request.getSession();
			// ArrayList<Result2FormBean> list = new
			// ArrayList<Result2FormBean>();
			// list = (ArrayList<Result2FormBean>)
			// session.getAttribute("HANMENGLIST"); //此时取出来的是Object, 需要强转

			MUserDao mUserDao = new MUserDao();
			// 添加用户
			mUserDao.addUser(userID, password, authority, tel, email);
			// //返回删除后的用户列表
			ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
			userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
			request.setAttribute("USERLIST", userList);

			return mapping.findForward("update");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理返回跳转动作
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			MUserDao mUserDao = new MUserDao();
			//返回用户管理列表
			ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
			userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
			request.setAttribute("USERLIST", userList);
			return mapping.findForward("back");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}