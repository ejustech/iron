package com.ejustech.iron.common.db;

import javax.naming.NamingException;

import com.ejustech.iron.common.IronEnum.TableName;
import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.dao.TIronInfoDao;

public class DaoFactory {
	public static IDAO getInstance(TableName tableName) throws NamingException {
		switch (tableName) {
		case M_USER:
			return new MUserDao();
		case T_IRON_INFO:
			return new TIronInfoDao();
		default:
			break;
		}
		return null;
	}
}
