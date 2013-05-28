package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.databean.form.UserManageFormBean;
import com.ejustech.iron.form.UserAddForm;
import com.ejustech.iron.form.UserManageForm;

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
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			UserAddForm userAddForm = (UserAddForm) form;
			String userID = userAddForm.getUserID();
			String password = userAddForm.getPassword();
			String authority = userAddForm.getAuthority();
			String tel = userAddForm.getTel();
			String email = userAddForm.getEmail();
			
			ActionErrors error = new ActionErrors();
			HttpSession session = request.getSession();
			session.setAttribute("USERERRORMSG","");
			if(userID.equals("") || password.equals("")){
				error.add("errors", new ActionMessage("error.userIDpassword.empty"));
				session.setAttribute("USERERRORMSG","用户名密码不能为空！");
				return mapping.findForward("userExistError");
			}
			if(!password.equals(userAddForm.getPasswordv())){
				error.add("errors", new ActionMessage("error.password.match"));
				session.setAttribute("USERERRORMSG","你所输入的两次密码不一致！");
				return mapping.findForward("userExistError");
			}

//			return error;


			// 获取用户权限
			// HttpSession session = request.getSession();
			// ArrayList<Result2FormBean> list = new
			// ArrayList<Result2FormBean>();
			// list = (ArrayList<Result2FormBean>)
			// session.getAttribute("HANMENGLIST"); //此时取出来的是Object, 需要强转
			
			// 取得动作状态判断是修改还是添加
			
			String update_flag = (String) session.getAttribute("UPDATE_FLAG");
			
			MUserDao mUserDao = new MUserDao();
			//判断是添加用户还是更新用户
			if(update_flag.equals("Add")){
				// 添加用户
				boolean flag = mUserDao.addUser(userID, password, authority, tel, email);
				//用户不存在添加成功，用户存在添加失败返回错误页面
				if(flag == true){
					// //返回删除后的用户列表
					ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
					userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
					request.setAttribute("USERLIST", userList);
					return mapping.findForward("update");
				}else{
					session.setAttribute("USERERRORMSG","您所输入的用户名已经存在！");
					return mapping.findForward("userExistError");
				}
			}else if (update_flag.equals("Modify")){
				mUserDao.updateUser(userID, password, authority, tel, email);
				ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
				userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
				request.setAttribute("USERLIST", userList);
				return mapping.findForward("update");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理返回跳转动作
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			MUserDao mUserDao = new MUserDao();
			//返回用户管理列表
			ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
			userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
			request.setAttribute("USERLIST", userList);
			//设置第一个userID radio被选中
			UserManageForm userManageForm = new UserManageForm();
			userManageForm.setIndexModify(userList.get(0).getUserID());
			return mapping.findForward("back");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}