package com.ejustech.iron.common;

public class IronStatus {
	public enum  LoginCheckResult {  
	    OK,
	    USER_ID_IS_EMPTY,
	    USER_PASSWORD_IS_EMPTY,
	    ALL_ITEMS_IS_EMPTY,
	    USER_ID_NOT_FOUND,
	    USER_ID_NOT_ROLE,
	    USER_PASSWORD_IS_ERROR
	}
}