package com.ejustech.iron.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/***
 * T_Iron_Info������ݷ��ʶ���
 *
 */
public class TIronInfoDao {
	/***
	 * ����Դ
	 */
	private DataSource dataSource;
	
	/***
	 * ���캯��
	 */
	public TIronInfoDao() throws NamingException {	
        Context ctx=null;  
        ctx = new InitialContext();  
 
        dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");  
	}
	
	//������IronInfo������ݷ��ʷ���
}
