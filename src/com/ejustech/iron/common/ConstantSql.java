package com.ejustech.iron.common;

/***
 * SQL����
 *
 */
public class ConstantSql {
	/***
	 * �����û�������M_User���м������鿴���û��Ƿ���ڵ�SQL
	 */
	 public static final String GET_COUNTS_BY_USER_ID = "select count(userID) as userCounts from m_user where userID = ?";
}
