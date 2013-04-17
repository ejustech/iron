package com.ejustech.iron.common.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



public interface IDAO {
	public void Open();

	public void Close();

	public void BeginTrans();

	public void Commit();

	public void Rollback();

	public void Close(PreparedStatement ps);

	public void Close(ResultSet rs);
}
