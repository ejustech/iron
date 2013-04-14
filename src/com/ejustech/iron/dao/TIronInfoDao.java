package com.ejustech.iron.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/***
 * T_Iron_Info表的数据访问对象
 *
 */
public class TIronInfoDao {
	/***
	 * 数据源
	 */
	private DataSource dataSource;
	
	/***
	 * 构造函数
	 */
	public TIronInfoDao() throws NamingException {	
        Context ctx=null;  
        ctx = new InitialContext();  
 
        dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");  
	}
	
	//其他对IronInfo表的数据访问方法
}
