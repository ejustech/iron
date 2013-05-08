package com.ejustech.iron.business;

import javax.naming.NamingException;

import com.ejustech.iron.common.IronStatus.LoginCheckResult;
import com.ejustech.iron.common.db.DaoFactory;
import com.ejustech.iron.dao.MUserDao;

public class Login {
	/***
	 * 用户名
	 */
	private static String userID = "";
	/***
	 * 用户密码
	 */
	private static String userPassword = "";

	/***
	 * 构造函数，并且设置了用户名和密码
	 * 
	 * @param 用户名
	 * @param 用户密码
	 */
	public Login(String userID, String userPassword) throws NamingException {
		// 设置用户名
		this.setUserID(userID);
		// 设置用户名密码
		this.setUserPassword(userPassword);
	}

	/**
	 * Login画面，对用户输入的用户名和密码做验证
	 * 
	 * @param 用户名
	 * @param 密码
	 * @return 验证OK的情况，true；验证NG的情况，false
	 * @throws Exception
	 */
	public LoginCheckResult LoginCheck() throws Exception {
		// 用户名为空
		if (IsEmptyForUserID())
			return LoginCheckResult.USER_ID_IS_EMPTY;

		// 用户名密码为空
		if (IsEmptyForUserPassword())
			return LoginCheckResult.USER_PASSWORD_IS_EMPTY;

		// 用户名和密码同时为空
		if (isEmptyForAllItems())
			return LoginCheckResult.ALL_ITEMS_IS_EMPTY;

		// 用户名不存在
		if (!HasUserID())
			return LoginCheckResult.USER_ID_NOT_FOUND;

		// 密码验证失败
		if (IsErrorForUserPassword())
			return LoginCheckResult.USER_PASSWORD_IS_ERROR;

		// 用户名密码验证成功，但是该用户没有登陆系统的权限

		return LoginCheckResult.OK;
	}

	/***
	 * 用户名是否为空
	 * 
	 * @return 用户名为空，true；不为空，false
	 */
	private boolean IsEmptyForUserID() {
		if (IsEmpty(userID) && !IsEmpty(userPassword))
			return true;
		return false;
	}

	/***
	 * 用户密码是否为空
	 * 
	 * @return 用户密码为空，true；不为空，false
	 */
	private boolean IsEmptyForUserPassword() {
		if (!IsEmpty(userID) && IsEmpty(userPassword))
			return true;
		return false;
	}

	/***
	 * 用户名和密码是否同时为空
	 * 
	 * @return 用户名和密码同时为空，true；不同时为空，或不为空，false
	 */
	private boolean isEmptyForAllItems() {
		if (IsEmpty(userID) && IsEmpty(userPassword))
			return true;
		return false;
	}

	/**
	 * 对象是否为空的判断
	 * 
	 * @param 将要进行判断的对象值
	 * @return 如果对象为null，true；如果对象的类型为String,""的情况，返回true；以外，false
	 */
	private boolean IsEmpty(Object value) {
		if (value == null)
			return true;

		if (value instanceof String) {
			if ("".equals(value)) {
				return true;
			}
		}
		return false;
	}

	/***
	 * 用户名是否存在
	 * 
	 * @return 系统中不存在输入的用户名，false；存在，true
	 * @throws Exception 
	 */
	private boolean HasUserID() throws Exception {
		MUserDao mUserDao = (MUserDao) DaoFactory.CreateMUserDao();

//		int userCounts = mUserDao.GetCountsByUserID(userID);

//		if (userCounts == 0) {
//			return false;
//		} else {
//			return true;
//		}
		boolean flag = mUserDao.verifyUserID(userID, userPassword);
		System.out.println(flag);
		return flag;
	}

	/***
	 * 用户名是否拥有权限
	 * 
	 * @return 用户名的权限可以登陆，true；不可以登录，false
	 */
	private boolean IsErrorForUserPassword() {
		return false;
	}

	/***
	 * 取得用户名
	 * 
	 * @return 用户名
	 */
	public String getUserID() {
		return userID;
	}

	/***
	 * 设置用户名
	 * 
	 * @param 用户名
	 */
	public void setUserID(String userID) {
		Login.userID = userID;
	}

	/***
	 * 取得用户密码
	 * 
	 * @return 用户密码
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/***
	 * 设置用户密码
	 * 
	 * @param 用户密码
	 */
	public void setUserPassword(String userPassword) {
		Login.userPassword = userPassword;
	}
}
