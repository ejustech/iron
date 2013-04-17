package com.ejustech.iron.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ejustech.iron.common.ConstantSql;
import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.MUserBean;

/***
 * M_User表的数据访问对象
 * 
 */
public class MUserDao extends BaseDao {
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
			super.Open();
			ps = super.Conn().prepareStatement(
					ConstantSql.GET_COUNTS_BY_USER_ID);

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
		super.Close(rs);
		super.Close(ps);
		super.Close();
		return result;
	}

	// 其他对M_USER表的数据访问方法
	public MUserBean GetUserInfoByUserID(String userID) {
		return new MUserBean();
	}
}
