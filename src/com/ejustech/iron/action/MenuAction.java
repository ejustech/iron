package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.business.InputByNewBusiness;
import com.ejustech.iron.business.InputByUpdateBusiness;
import com.ejustech.iron.common.Constant;
import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.databean.form.InputByUpdateFormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.SearchFormBean;
import com.ejustech.iron.databean.form.UserManageFormBean;
import com.ejustech.iron.form.InputByNewForm;
import com.ejustech.iron.form.InputByUpdateForm;
import com.ejustech.iron.form.UserManageForm;

public class MenuAction extends EventDispatchAction {
	// 处理信息检索动作
	public ActionForward search(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {
				return mapping.findForward("relogin");
			}
			SearchFormBean searchFormBean = new SearchFormBean();
			searchFormBean.setSelInfoList("1");
			ArrayList<SearchFormBean> selList = new ArrayList<SearchFormBean>();
			selList.add(searchFormBean);
			request.setAttribute("SELLIST", selList);
			return mapping.findForward("search");
		} catch (Exception e) {
		}
		return null;
	}

	// 处理信息输入动作
	public ActionForward inputByUpdate(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {
				return mapping.findForward("relogin");
			}

			InputByUpdateForm inputByUpdateForm = new InputByUpdateForm();
			inputByUpdateForm.setInputByUpdateList(initInputByUpdateForm());
			inputByUpdateForm.setRole("1");

			request.setAttribute("inputByUpdateForm", inputByUpdateForm);

			return mapping.findForward("inputByUpdate");
		} catch (Exception e) {
		}
		return null;
	}

	// 处理信息输入动作
	public ActionForward inputByNew(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {
				return mapping.findForward("relogin");
			}

			InputByNewBusiness inputByNewBusiness = new InputByNewBusiness();
			ArrayList<InputByNewFormBean> initList = inputByNewBusiness.initInputByNewForm();

			InputByNewForm inputByNewForm = new InputByNewForm();
			inputByNewForm.setInputByNewList(initList);
			inputByNewForm.setRole("1");

			request.setAttribute("inputByNewForm", inputByNewForm);

			return mapping.findForward("inputByNew");
		} catch (Exception e) {
		}
		return null;
	}

	// 处理用户管理动作
	public ActionForward userManage(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {
				return mapping.findForward("relogin");
			}

			MUserDao mUserDao = new MUserDao();
			// 取得用户列表
			ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
			userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
			request.setAttribute("USERLIST", userList);

			// 设置第一个userID radio被选中
			UserManageForm userManageForm = new UserManageForm();
			userManageForm.setIndexModify(userList.get(0).getUserID());

			return mapping.findForward("userManage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户注销动作
	public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {
				return mapping.findForward("relogin");
			}

			HttpSession session = request.getSession();
			session.setAttribute("logout", "true");

			return mapping.findForward("logout");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private ArrayList<InputByUpdateFormBean> initInputByUpdateForm() {
		ArrayList<InputByUpdateFormBean> inputByNewList = new ArrayList<InputByUpdateFormBean>();
		InputByUpdateBusiness inputByUpdateBusiness = new InputByUpdateBusiness();

		return inputByUpdateBusiness.InitInputByUpdateForm();
	}
}
