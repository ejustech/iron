package com.ejustech.iron.common.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BaseDao implements IDAO {
	/***
	 * 数据源
	 */
	private DataSource dataSource;

	/***
	 * DB连接
	 */
	private Connection conn = null;

	/***
	 * SQL执行时的参数
	 */
	private ArrayList<String> paraList = new ArrayList<String>();

	/***
	 * 取得SQL执行时的参数
	 * @return SQL执行时的参数
	 */
	protected ArrayList<String> getParaList() {
		return paraList;
	}

	/***
	 * 构造函数
	 */
	public BaseDao() {

	}

	/***
	 * 取得DB连接
	 * @return DB连接
	 */
	protected Connection getConn() {
		return conn;
	}

	/***
	 * 打开DB连接
	 */
	protected void Open() {
		try {
			Context ctx = null;
			ctx = new InitialContext();

			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
			conn = this.dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * 关闭DB连接
	 */
	protected void Close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findCounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParaList(ArrayList<String> paraList) {
		// TODO Auto-generated method stub
		this.paraList = paraList;
	}
}
