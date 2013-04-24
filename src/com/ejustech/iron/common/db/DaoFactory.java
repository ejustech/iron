package com.ejustech.iron.common.db;

import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.common.db.IDAO;;

public class DaoFactory {
//	public static IDAO getInstance(TableName tableName) throws NamingException {
//		switch (tableName) {
//		case M_USER:
//			return new MUserDao();
//		case T_IRON_INFO:
//			return new TIronInfoDao();
//		default:
//			break;
//		}
//		return null;
//	}
	
	public static IDAO CreateMUserDao() {
		return new MUserDao();
	}
	
	public static IDAO CreateTIronInfoDao() {
		return new TIronInfoDao();
	}
}
