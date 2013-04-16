package com.ejustech.iron.common;

public class IronEnum {
	public enum LoginCheckResult {
		OK, USER_ID_IS_EMPTY, USER_PASSWORD_IS_EMPTY, ALL_ITEMS_IS_EMPTY, USER_ID_NOT_FOUND, USER_ID_NOT_ROLE, USER_PASSWORD_IS_ERROR
	}

	public enum TableName {
		M_USER, T_IRON_INFO
	}
}