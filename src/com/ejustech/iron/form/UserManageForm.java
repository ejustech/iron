
package com.ejustech.iron.form;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * MyEclipse Struts Creation date: 04-16-2013
 * 
 * XDoclet definition:
 * 
 * @struts.form name="MenuForm"
 */
public class UserManageForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] indexCheckbox = new String[0];
	private String indexModify = new String();
//	private String userID = new String();
	

	/*
	 * Generated Methods
	 */

//	public String getUserID() {
//		return userID;
//	}
//
//	public void setUserID(String userID) {
//		this.userID = userID;
//	}

	public String getIndexModify() {
		return indexModify;
	}

	public void setIndexModify(String indexModify) {
		this.indexModify = indexModify;
	}

	public String[] getIndexCheckbox() {
		return indexCheckbox;
	}

	public void setIndexCheckbox(String[] indexCheckbox) {
		this.indexCheckbox = indexCheckbox;
	}

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
//	//修改确认
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//
//		ActionErrors error = new ActionErrors();
//		
//		if(getIndexModify().equals("")){
//			error.add("errors", new ActionMessage("error.userAdd.onlyOne"));
//		}
//		return error;
//	}

//	/**
//	 * Method reset
//	 * 
//	 * @param mapping
//	 * @param request
//	 */
//	public void reset(ActionMapping mapping, HttpServletRequest request) {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * Method validate
//	 * 
//	 * @param mapping
//	 * @param request
//	 * @return ActionErrors
//	 */
//	public ActionErrors validate(ActionMapping mapping, ServletRequest request) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	/**
//	 * Method reset
//	 * 
//	 * @param mapping
//	 * @param request
//	 */
//	public void reset(ActionMapping mapping, ServletRequest request) {
//		// TODO Auto-generated method stub
//	}
//	
	

}