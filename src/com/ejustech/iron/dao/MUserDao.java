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
 * M_User������ݷ��ʶ���
 *
 */
public class MUserDao {
	/***
	 * ����Դ
	 */
	private DataSource dataSource;
	
	/***
	 * ���캯��
	 */
	public MUserDao() throws NamingException {	
        Context ctx=null;  
        ctx = new InitialContext();  
 
        dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");  
	}
	
	/***
	 * �����û�����ȡ��m_user�������ݵļ�¼��
	 * @param �û���
	 * @return �û������ڣ�1���û��������ڣ�0
	 */
	public int GetCountsByUserID(String userID) {
		Connection conn = null;
		ResultSet rs  = null;
		 
        try {  
            conn = this.dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(ConstantSql.GET_COUNTS_BY_USER_ID); 
            //SQL���У����ò�������=userID
            ps.setString(1, userID);  
            //ִ��SQL
            rs = ps.executeQuery(); 
            while (rs.next())
            {
            	try {
            		//userCounts ��Ӧ��ִ�е�SQL�У�as�ؼ��ֺ���ı���
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
	
	//������M_USER������ݷ��ʷ���
	public MUserBean GetUserInfoByUserID(String userID) {
		return new MUserBean();
	}
}
