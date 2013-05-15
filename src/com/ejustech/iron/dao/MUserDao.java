package com.ejustech.iron.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ejustech.iron.common.ConstantSql;
import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.dao.MUserDaoBean;
import com.ejustech.iron.databean.form.UserManageFormBean;

/***
 * M_User表的数据访问对象
 * 
 */
public class MUserDao extends BaseDao {

	/***
	 * 根据用户名&密码验证登陆
	 * 
	 * @param 用户名
	 * @return 用户名存在，1；用户名不存在，0
	 * @throws Exception
	 */
	public boolean verifyUserID(String userID, String password, HttpServletRequest request) throws Exception {
		boolean flag = false;

		// 密码解密
		// PasswordSecurity passwordSecurity = new PasswordSecurity();
		// LoginFormBean loginFormBean;

		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append("SELECT ");
		sqlBuffer.append("userID, ");
		sqlBuffer.append("password, ");
		sqlBuffer.append("authority ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("m_user ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("userID = ");
		sqlBuffer.append("'" + userID + "' ");
		sqlBuffer.append("AND ");
		sqlBuffer.append("password = ");
		sqlBuffer.append("'" + password + "'");

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				// loginFormBean = new LoginFormBean();

				// 解密数据库中密码
				// byte[] decontent =
				// passwordSecurity.Decryptor(resultSet.getString("password").getBytes());
				// System.out.println("解密后:" + new String(decontent));
				// loginFormBean.setUserID(resultSet.getString("userID"));
				// loginFormBean.setPassword(resultSet.getString("password"));
				// loginFormBean.setAuthority(resultSet.getString("authority"));
				String authority = resultSet.getString("authority");
				HttpSession session = request.getSession();
				session.setAttribute("USERNAME", userID);
				//放置权限用于判断是否为管理员
//				if(authority.equals("0")){
				session.setAttribute("AUTHORITY", authority);
//				}else{
//					request.setAttribute("AUTHORITY", "");
//				}
				// 验证密码是否与输入的匹配
				// if(password.equals(new String(decontent))){
				if (password.equals(resultSet.getString("password"))) {
					flag = true;
					System.out.println("Login Success!");
					break;
				}
			}

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
		return flag;
	}

	/***
	 * 根据用户名，取得m_user表中数据的记录数
	 * 
	 * @param 用户名
	 * @return 用户名存在，1；用户名不存在，0
	 */
	public int GetCountsByUserID(String userID) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Open();
			ps = Conn().prepareStatement(ConstantSql.GET_COUNTS_BY_USER_ID);

			// // 设置参数List
			// ArrayList<String> paraList = new ArrayList<String>();
			// paraList.add(userID);
			//
			// for (int i = 0; i < paraList.size(); i++) {
			// ps.setString(i + 1, paraList.get(i));
			// }

			ps.setString(1, userID);

			// 执行SQL
			rs = ps.executeQuery();
			while (rs.next()) {
				// userCounts 对应所执行的SQL中，as关键字后面的别名
				result = Integer.parseInt(rs.getString("userCounts"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		Close(rs);
		Close(ps);
		Close();
		return result;
	}

	// 其他对M_USER表的数据访问方法
	public MUserDaoBean GetUserInfoByUserID(String userID) {
		return new MUserDaoBean();
	}

	// 显示查询用户列表
	public ArrayList<UserManageFormBean> getUserList() throws Exception {

		ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();

		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append("SELECT ");
		sqlBuffer.append("* ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("m_user ");
		sqlBuffer.append("ORDER BY userID");

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				UserManageFormBean userManageFormBean = new UserManageFormBean();
				userManageFormBean.setIndex(String.valueOf(resultSet.getRow()));
				userManageFormBean.setUserID(resultSet.getString("userID"));
				// userManageFormBean.setPassword(resultSet.getString("password"));
				if(resultSet.getString("authority").equals("0")){
					userManageFormBean.setAuthority("管理员");
				}else if (resultSet.getString("authority").equals("1")){
					userManageFormBean.setAuthority("普通用户1");
				}else if (resultSet.getString("authority").equals("2")){
					userManageFormBean.setAuthority("普通用户2");
				}				
				userManageFormBean.setTel(resultSet.getString("tel"));
				userManageFormBean.setEmail(resultSet.getString("email"));
				userList.add(userManageFormBean);
			}
			return userList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	// 删除用户
	public void delUserList(String userID) throws Exception {

		StringBuffer sqlBuffer = new StringBuffer();
		int rs = 0;

		sqlBuffer.append("DELETE ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("m_user ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("userID ");
		sqlBuffer.append("in ");
		sqlBuffer.append("(");
		sqlBuffer.append(userID);
		sqlBuffer.append(") ");

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);

		// ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			rs = statement.executeUpdate(sql);

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	// 添加用户
	public boolean addUser(String userID, String password, String authority, String tel, String email) throws Exception {

		// 密码加密
		// PasswordSecurity passwordSecurity = new PasswordSecurity();
		// byte[] encontent = passwordSecurity.Encrytor(password);
		// byte[] decontent = passwordSecurity.Decryptor(encontent);
		// System.out.println("明文是:" + password);
		// System.out.println("加密后:" + new String(encontent));
		// System.out.println("解密后:" + new String(decontent));
		boolean flag = false;
		StringBuffer sqlBuffers = new StringBuffer();
		StringBuffer sqlBuffer = new StringBuffer();
		int rs = 0;

		// 检索要添加的用户是否存在
		sqlBuffers.append("SELECT ");
		sqlBuffers.append("userID, ");
		sqlBuffers.append("password, ");
		sqlBuffers.append("authority ");
		sqlBuffers.append("FROM ");
		sqlBuffers.append("m_user ");
		sqlBuffers.append("WHERE ");
		sqlBuffers.append("userID = ");
		sqlBuffers.append("'" + userID + "'");

		sqlBuffer.append("INSERT INTO m_user(");
		sqlBuffer.append("userID, ");
		sqlBuffer.append("password, ");
		sqlBuffer.append("authority, ");
		sqlBuffer.append("tel, ");
		sqlBuffer.append("email ");
		sqlBuffer.append(") VALUES(");
		sqlBuffer.append("'" + userID + "',");
		sqlBuffer.append("'" + password + "',");
		sqlBuffer.append("'" + authority + "',");
		sqlBuffer.append("'" + tel + "',");
		sqlBuffer.append("'" + email + "'");
		sqlBuffer.append(")");

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);
		String sqls = sqlBuffers.toString();
		System.out.println("sqls=" + sqls);

		Statement statement = null;
		ResultSet resultSet = null;
		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqls);
			// 如果用户存在，返回false
			if (resultSet.next()) {
				flag = false;
			} else {
				rs = statement.executeUpdate(sql);
				flag = true;
			}
		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
		return flag;
	}

	// 更新用户
	public void updateUser(String userID, String password, String authority, String tel, String email) throws Exception {

		// 密码加密
		// PasswordSecurity passwordSecurity = new PasswordSecurity();
		// byte[] encontent = passwordSecurity.Encrytor(password);
		// byte[] decontent = passwordSecurity.Decryptor(encontent);
		// System.out.println("明文是:" + password);
		// System.out.println("加密后:" + new String(encontent));
		// System.out.println("解密后:" + new String(decontent));
		StringBuffer sqlBuffer = new StringBuffer();
		int rs = 0;

		sqlBuffer.append("UPDATE m_user SET ");
		sqlBuffer.append("userID = '");
		sqlBuffer.append(userID);
		sqlBuffer.append("',");
		sqlBuffer.append("password = '");
		sqlBuffer.append(password);
		sqlBuffer.append("',");
		sqlBuffer.append("authority = '");
		sqlBuffer.append(authority);
		sqlBuffer.append("',");
		sqlBuffer.append("tel = '");
		sqlBuffer.append(tel);
		sqlBuffer.append("',");
		sqlBuffer.append("email = '");
		sqlBuffer.append(email);
		sqlBuffer.append("' ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("userID = '");
		sqlBuffer.append(userID);
		sqlBuffer.append("'");

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);

		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			rs = statement.executeUpdate(sql);

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	// 传递要修改的用户信息到更新页面
	public ArrayList<UserManageFormBean> sendUserList(String userID) throws Exception {

		ArrayList<UserManageFormBean> sendUserList = new ArrayList<UserManageFormBean>();

		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append("SELECT ");
		sqlBuffer.append("* ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("m_user ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("userID = '");
		sqlBuffer.append(userID);
		sqlBuffer.append("'");

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				UserManageFormBean userManageFormBean = new UserManageFormBean();
				userManageFormBean.setUserID(resultSet.getString("userID"));
				userManageFormBean.setPassword(resultSet.getString("password"));
				userManageFormBean.setAuthority(resultSet.getString("authority"));
				userManageFormBean.setTel(resultSet.getString("tel"));
				userManageFormBean.setEmail(resultSet.getString("email"));
				sendUserList.add(userManageFormBean);
			}
			return sendUserList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

}
