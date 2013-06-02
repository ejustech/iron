/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.business.InputByUpdateBusiness;
import com.ejustech.iron.databean.form.InputByUpdateFormBean;
import com.ejustech.iron.form.InputByUpdateForm;

/** 
 * MyEclipse Struts
 * Creation date: 05-26-2013
 * 
 * XDoclet definition:
 * @struts.action path="/inputByUpdate" name="inputByUpdateForm" input="/jsp/inputByUpdate.jsp" scope="request" validate="true"
 */
public class InputByUpdateAction extends EventDispatchAction {
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
	public ActionForward Save(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
		InputByUpdateForm inputByUpdateForm = (InputByUpdateForm) form;// TODO Auto-generated method stub
		InputByUpdateBusiness inputByUpdateBusiness = new InputByUpdateBusiness();
		try {
			inputByUpdateBusiness.Save(inputByUpdateForm);
			
			inputByUpdateForm.setInputByUpdateList(initInputByUpdateForm());

			request.setAttribute("inputByUpdateForm", inputByUpdateForm);
			inputByUpdateForm.setRole("1");
			return mapping.findForward("OK");
			
		} catch (Exception e) {
			ActionErrors error = new ActionErrors();
			error.add("errors", new ActionMessage("error.inputByUpdate.updateError", e.toString()));
			this.saveErrors(request, error);
			inputByUpdateForm.setRole("1");
			return mapping.findForward("NG");
		}

	}
	// 处理返回跳转动作
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (request.getSession().getAttribute("logout") != null) {return mapping.findForward("relogin");}
			return mapping.findForward("back");
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("searchError");
		}
//				return null;
	}
	
	private ArrayList<InputByUpdateFormBean> initInputByUpdateForm() {
		ArrayList<InputByUpdateFormBean> inputByNewList = new ArrayList<InputByUpdateFormBean>();
		InputByUpdateBusiness inputByUpdateBusiness = new InputByUpdateBusiness();
		
		return inputByUpdateBusiness.InitInputByUpdateForm();
	}
}