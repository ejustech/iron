package com.ejustech.iron.databean;

/***
 * M_USER������ݶ���
 */
public class MUserBean {
	/***
	 * �û���
	 */
	private static String userID = "";
	/***
	 * �û�����
	 */
	private static String userPassword = "";
	
	/***
	 * ȡ���û���
	 * @return �û���
	 */
	public static String getUserID() {
		return userID;
	}
	/***
	 * �����û���
	 * @param �û���
	 */
	public static void setUserID(String userID) {
		MUserBean.userID = userID;
	}
	/***
	 * ȡ���û�����
	 * @return �û�����
	 */
	public static String getUserPassword() {
		return userPassword;
	}
	/***
	 * �����û�����
	 * @param �û�����
	 */
	public static void setUserPassword(String userPassword) {
		MUserBean.userPassword = userPassword;
	}
}
