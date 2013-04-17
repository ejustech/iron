package com.ejustech.iron.common.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	private DataSource _dataSource;

	/***
	 * DB连接
	 */
	private Connection _conn = null;
	
	/***
	 * SQL执行参数
	 */
	private ArrayList<String> _paraList = null;
	
	/***
	 * 取得SQL执行的参数
	 * @return SQL执行的参数
	 */
	protected ArrayList<String> getParaList() {
		return _paraList;
	}

	/***
	 * 设置SQL执行的参数
	 * @param SQL执行的参数
	 */
	protected void setParaList(ArrayList<String> paraList) {
		this._paraList = paraList;
	}
	
	/***
	 * 取得DB连接
	 * 
	 * @return DB连接
	 */
	protected Connection Conn() {
		return _conn;
	}

	/***
	 * 打开DB连接
	 */
	public void Open() {
		try {
			Context ctx = null;
			ctx = new InitialContext();

			_dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
			_conn = this._dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * 关闭DB连接
	 */
	public void Close() {
		if (_conn != null) {
			try {
				_conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			_conn = null;
		}
	}

	/***
	 * 开启事务
	 */
	public void BeginTrans() {
		// TODO Auto-generated method stub
		try {
			if (_conn != null && _conn.getAutoCommit()) {
				_conn.setAutoCommit(false);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * 提交
	 */
	public void Commit() {
		// TODO Auto-generated method stub
		if (_conn != null) {
			try {
				_conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/***
	 * 回滚
	 */
	public void Rollback() {
		// TODO Auto-generated method stub
		if (_conn != null) {
			try {
				_conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/***
	 * 关闭Statement
	 */
	public void Close(PreparedStatement ps) {
		// TODO Auto-generated method stub
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/***
	 * 关闭ResultSet
	 */
	public void Close(ResultSet rs) {
		// TODO Auto-generated method stub
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
