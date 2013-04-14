package com.ejustech.iron.common.db;

import java.sql.*;

public class DBConn {
	String sDBDriver = "org.gjt.mm.mysql.Driver";
	String sConnStr = "jdbc:mysql://127.0.0.1:3306/test?user=root&password=xiaotu&useUnicode=true&characterEncoding=ISO-8859-1";
	Connection conn = null;
	ResultSet rs = null;

	public DBConn() {
		try {
			Class.forName(sDBDriver);
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("Jdbc_conn():" + e.getMessage());
		}
	}

	public void Close() throws Exception {
		try {
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
		} catch (SQLException ex) {
			System.out.println("closeConn: " + ex);
		}
	}

	public void executeUpdate(String sql) throws Exception {
		try {
			conn = DriverManager.getConnection(sConnStr);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			conn.close();
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("sql.executeUpdate:" + ex.getMessage());
		}
	}

	public ResultSet executeQuery(String sql) throws Exception {
		rs = null;
		try {
			sql = new String(sql.getBytes("ISO-8859-1"));
			conn = DriverManager.getConnection(sConnStr);
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException ex) {
			System.out.println("sql.executeQuery:" + ex.getMessage());
		}
		return rs;
	}
}
