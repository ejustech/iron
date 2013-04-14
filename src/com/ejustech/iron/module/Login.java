package com.ejustech.iron.module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.naming.NamingException;

import com.ejustech.iron.common.IronStatus.LoginCheckResult;
import com.ejustech.iron.dao.MUserDao;

public class Login {
	/***
	 * �û���
	 */
	private static String userID = "";
	/***
	 * �û�����
	 */
	private static String userPassword = "";
	
	/***
	 * ���캯���������������û���������
	 * @param �û���
	 * @param �û�����
	 */
	public Login(String userID, String userPassword) throws NamingException {
		//�����û���
		this.setUserID(userID);
		//�����û�������
		this.setUserPassword(userPassword);
	}
	
	/**
	 * Login���棬���û�������û�������������֤
	 * @param �û���
	 * @param ����
	 * @return ��֤OK�������true����֤NG�������false
	 * @throws Exception
	 */
	public LoginCheckResult LoginCheck() throws Exception {
		//�û���Ϊ��
		if (IsEmptyForUserID()) return LoginCheckResult.USER_ID_IS_EMPTY;
		
		//�û�������Ϊ��
		if (IsEmptyForUserPassword()) return LoginCheckResult.USER_PASSWORD_IS_EMPTY;
		
		//�û���������ͬʱΪ��
		if (isEmptyForAllItems()) return LoginCheckResult.ALL_ITEMS_IS_EMPTY;
		
		//�û���������
		if (!HasUserID()) return LoginCheckResult.USER_ID_NOT_FOUND;
		
		//������֤ʧ��
		if (IsErrorForUserPassword()) return LoginCheckResult.USER_PASSWORD_IS_ERROR;
		
		//�û���������֤�ɹ������Ǹ��û�û�е�½ϵͳ��Ȩ��
		
		return LoginCheckResult.OK;
	}
	
	/***
	 * �û����Ƿ�Ϊ��
	 * @return �û���Ϊ�գ�true����Ϊ�գ�false
	 */
	private boolean IsEmptyForUserID() {
		if (IsEmpty(userID) && !IsEmpty(userPassword)) return true;
		return false;
	}
	
	/***
	 * �û������Ƿ�Ϊ��
	 * @return �û�����Ϊ�գ�true����Ϊ�գ�false
	 */
	private boolean IsEmptyForUserPassword() {
		if (!IsEmpty(userID) && IsEmpty(userPassword)) return true;
		return false;
	}
	
	/***
	 * �û����������Ƿ�ͬʱΪ��
	 * @return �û���������ͬʱΪ�գ�true����ͬʱΪ�գ���Ϊ�գ�false
	 */
	private boolean isEmptyForAllItems() {
		if (IsEmpty(userID) && IsEmpty(userPassword)) return true;
		return false;
	}
	/**
	 * �����Ƿ�Ϊ�յ��ж�
	 * @param ��Ҫ�����жϵĶ���ֵ
	 * @return �������Ϊnull��true��������������ΪString,""�����������true�����⣬false
	 */
	private boolean IsEmpty(Object value) {
		if (value== null) return true;
		
		if (value instanceof String) {
			if ("".equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	/***
	 * �û����Ƿ����
	 * @return ϵͳ�в�����������û�����false�����ڣ�true
	 */
	private boolean HasUserID() {
		try {
			MUserDao mUserDao = new MUserDao();
			int userCounts = mUserDao.GetCountsByUserID(userID);
			
			if (userCounts == 0) {
				return false;
			} else {
				return true;
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/***
	 * �û����Ƿ�ӵ��Ȩ��
	 * @return �û�����Ȩ�޿��Ե�½��true�������Ե�¼��false
	 */
	private boolean IsErrorForUserPassword() {
		return false;
	}

	/***
	 * ȡ���û���
	 * @return �û���
	 */
	public String getUserID() {
		return userID;
	}

	/***
	 * �����û���
	 * @param �û���
	 */
	public void setUserID(String userID) {
		Login.userID = userID;
	}

	/***
	 * ȡ���û�����
	 * @return �û�����
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/***
	 * �����û�����
	 * @param �û�����
	 */
	public void setUserPassword(String userPassword) {
		Login.userPassword = userPassword;
	}
}
