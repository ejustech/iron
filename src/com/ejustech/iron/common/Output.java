package com.ejustech.iron.common;

import java.math.BigDecimal;


public class Output {
	/**
	 * @author Administrator
	 * 截取字符串位数
	 */
	public static String getSubValue(String s, int length) {
		BigDecimal v;
		String obj = new String();
		if (!s.equals("")) {
			v = new BigDecimal(s).setScale(length,
					BigDecimal.ROUND_HALF_UP);
			obj = String.valueOf(v);
		} else {
			obj = "";
		}
		return obj;
	}
	/**
	 * @author Administrator
	 * 小数转换百分比
	 */
	public static String getPercentValue(String s) {
		BigDecimal p;
		String obj = new String();
		if (!s.equals("")) {
			p = new BigDecimal(s);
			obj = String.valueOf(p.multiply(new BigDecimal(100)));
		} else {
			obj = "";
		}
		return obj;
	}
}
