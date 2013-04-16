package com.ejustech.iron.common.db;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface IDAO {
	public int insert();

	public int delete();

	public int update();

	public int findCounts();

	public ResultSet select();

	public void setParaList(ArrayList<String> paraList);
}
