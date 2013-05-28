package com.ejustech.iron.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author NZ
 *
 */
public class UserAddForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String userID;
	private String password;
	private String passwordv;
	private String authority;
	private String tel;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordv() {
		return passwordv;
	}
	public void setPasswordv(String passwordv) {
		this.passwordv = passwordv;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	
//	//用户名密码校验
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//
//		ActionErrors error = new ActionErrors();
//
//		if(getUserID().equals("") || getPassword().equals("")){
//			error.add("errors", new ActionMessage("error.userIDpassword.empty"));
//		}
//		if(!getPassword().equals(getPasswordv())){
//			error.add("errors", new ActionMessage("error.password.match"));
//		}
//
//		return error;
//		
//	}
}
