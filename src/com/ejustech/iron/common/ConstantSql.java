package com.ejustech.iron.common;

/***
 * SQL常量
 * 
 */
public class ConstantSql {
	/***
	 * 根据用户名，在M_User表中检索，查看该用户是否存在的SQL
	 */
	public static final String GET_COUNTS_BY_USER_ID = "select count(userID) as userCounts from m_user where userID = ?";
}
