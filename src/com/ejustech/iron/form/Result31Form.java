package com.ejustech.iron.form;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 04-16-2013
 * 
 * XDoclet definition:
 * @struts.form name="MenuForm"
 */
public class Result31Form extends ActionForm {
	/*
	 * Generated fields
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** search property */
	private String search;
	
	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
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
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Method validate
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
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, ServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the userID.
	 * @return String
	 */
	public String getSearch() {
		return search;
	}

	/** 
	 * Set the userID.
	 * @param userID The userID to set
	 */
	public void setSearch(String search) {
		this.search = search;
	}

}