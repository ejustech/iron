package com.ejustech.iron.form;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 04-13-2013
 * 
 * XDoclet definition:
 * 
 * @struts.form name="loginForm"
 */
public class LoginForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** userID property */
	private String userID;

	/** userPassword property */
	private String userPassword;

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, ServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, ServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the userID.
	 * 
	 * @return String
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * Set the userID.
	 * 
	 * @param userID
	 *            The userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * Returns the userPassword.
	 * 
	 * @return String
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Set the userPassword.
	 * 
	 * @param userPassword
	 *            The userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}