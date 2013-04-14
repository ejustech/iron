package com.ejustech.iron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.ejustech.iron.common.ConstantSql;
import com.ejustech.iron.databean.MUserBean;

/***
 * M_User表的数据访问对象
 *
 */
public class MUserDao {
	/***
	 * 数据源
	 */
	private DataSource dataSource;
	
	/***
	 * 构造函数
	 */
	public MUserDao() throws NamingException {	
        Context ctx=null;  
        ctx = new InitialContext();  
 
        dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");  
	}
	
	/***
	 * 根据用户名，取得m_user表中数据的记录数
	 * @param 用户名
	 * @return 用户名存在，1；用户名不存在，0
	 */
	public int GetCountsByUserID(String userID) {
		Connection conn = null;
		ResultSet rs  = null;
		 
        try {  
            conn = this.dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(ConstantSql.GET_COUNTS_BY_USER_ID); 
            //SQL文中，设置参数，？=userID
            ps.setString(1, userID);  
            //执行SQL
            rs = ps.executeQuery(); 
            while (rs.next())
            {
            	try {
            		//userCounts 对应所执行的SQL中，as关键字后面的别名
					return Integer.parseInt(rs.getString("userCounts"));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return 0;
				}
            }
        } catch (Exception e) {  
            e.printStackTrace();  
        }
		return 0;
	}
	
	//其他对M_USER表的数据访问方法
	public MUserBean GetUserInfoByUserID(String userID) {
		return new MUserBean();
	}
}
