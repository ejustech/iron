package com.ejustech.iron.databean;

/***
 * M_USER表的数据对象
 */
public class MUserBean {
	/***
	 * 用户名
	 */
	private static String userID = "";
	/***
	 * 用户密码
	 */
	private static String userPassword = "";
	
	/***
	 * 取得用户名
	 * @return 用户名
	 */
	public static String getUserID() {
		return userID;
	}
	/***
	 * 设置用户名
	 * @param 用户名
	 */
	public static void setUserID(String userID) {
		MUserBean.userID = userID;
	}
	/***
	 * 取得用户密码
	 * @return 用户密码
	 */
	public static String getUserPassword() {
		return userPassword;
	}
	/***
	 * 设置用户密码
	 * @param 用户密码
	 */
	public static void setUserPassword(String userPassword) {
		MUserBean.userPassword = userPassword;
	}
}
