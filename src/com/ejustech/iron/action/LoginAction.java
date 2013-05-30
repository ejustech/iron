package com.ejustech.iron.action; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ejustech.iron.business.Login;
import com.ejustech.iron.common.IronStatus.LoginCheckResult;
import com.ejustech.iron.form.LoginForm;

/** 
 * MyEclipse Struts
 * Creation date: 04-13-2013
 * 
 * XDoclet definition:
 * @struts.action path="/login" name="loginForm" input="/form/login.jsp" scope="request" validate="true"
 * @struts.action-forward name="loginOK" path="/form/loginOK.jsp"
 * @struts.action-forward name="loginError" path="/form/loginError.jsp"
 */
public class LoginAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			LoginForm loginForm = (LoginForm) form;// TODO Auto-generated method stub
			
			//Login画面的业务逻辑类定义并初始化
//			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			Login loginModule = new Login(loginForm.getUserID(), loginForm.getUserPassword());
			
			//登陆验证，并返回一个验证的结果
			LoginCheckResult loginCheckResult = loginModule.LoginCheck(request);
			
			switch (loginCheckResult) {
			case USER_ID_IS_EMPTY:
				return mapping.findForward("loginError");
			case USER_PASSWORD_IS_EMPTY:
				return mapping.findForward("loginError");
			case ALL_ITEMS_IS_EMPTY:
				return mapping.findForward("loginError");
			case USER_ID_NOT_FOUND:
				return mapping.findForward("loginError");
			case USER_PASSWORD_IS_ERROR:
				return mapping.findForward("loginError");
			case USER_ID_NOT_ROLE:
				return mapping.findForward("loginError");
			case OK:
				request.getSession().setAttribute("logout", null);
				return mapping.findForward("loginOK");
				
			default:
				return mapping.findForward("loginOK");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("loginError");
		}
	}
}