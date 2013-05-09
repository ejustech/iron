package com.ejustech.iron.common;

import java.math.BigDecimal;
import java.math.MathContext;


/**
 * @author NZ
 * 字符串输出方法
 */
public class Output {
	/**
	 * @author NZ
	 * 截取字符串位数
	 * s:字符串
	 * length:小数点后位数(四舍五入)
	 * return四舍五入后的小数
	 */
	public static String getSubValue(String s, int length) {
		BigDecimal v;
		String obj = new String();
		if (!s.equals("")) {
			v = new BigDecimal(s).setScale(length,
					BigDecimal.ROUND_HALF_UP);//四舍五入到相应位数
			obj = String.valueOf(v);
		} else {
			obj = "";
		}
		return obj;
	}
	
//	/**
//	 * @author NZ
//	 * 小数转换百分比
//	 * s:被转换的字符串
//	 * return *100的值
//	 */
//	public static String getPercentValue(String s) {
//		BigDecimal p;
//		String obj = new String();
//		if (!s.equals("")) {
//			p = new BigDecimal(s);
//			obj = String.valueOf(p.multiply(new BigDecimal(100)));//multiply乘以100
//		} else {
//			obj = "";
//		}
//		return obj;
//	}
	
	/**
	 * @author NZ
	 * String除法得到平均值
	 * a:被除数
	 * b:除数
	 * length:小数点位数
	 * return 平均值
	 */
	public static String getAValue(String a, String b, int length) {
		BigDecimal p;
		BigDecimal aa = new BigDecimal(Double.parseDouble(a));
		BigDecimal bb = new BigDecimal(Double.parseDouble(b));
		String obj = new String();
		
		if (!a.equals("") && !b.equals("")) {
			//先除法，再截取四舍五入小数点后L位
			p = aa.divide(bb,new MathContext(10)).setScale(length, BigDecimal.ROUND_HALF_UP);
			obj = String.valueOf(p);
		} else {
			obj = "";
		}
		return obj;
	}
	
	/**
	 * @author NZ
	 * String除法得到平均值t换算kg
	 * a:被除数
	 * b:除数
	 * length:小数点位数
	 * return 平均值
	 */
	public static String getAkgValue(String a, String b, int length) {
		BigDecimal p;
		BigDecimal aa = new BigDecimal(Double.parseDouble(a));
		BigDecimal bb = new BigDecimal(Double.parseDouble(b));
		String obj = new String();
		
		if (!a.equals("") && !b.equals("")) {
			//先除法，再截取四舍五入小数点后L位
			p = aa.divide(bb,new MathContext(10)).multiply(new BigDecimal(1000)).setScale(length, BigDecimal.ROUND_HALF_UP);
			obj = String.valueOf(p);
		} else {
			obj = "";
		}
		return obj;
	}
	
	/**
	 * @author NZ
	 * String除法得到百分比
	 * a:被除数
	 * b:除数
	 * return *100的值
	 */
	public static String getPValue(String a, String b) {
		BigDecimal p;
		BigDecimal aa = new BigDecimal(Double.parseDouble(a));
		BigDecimal bb = new BigDecimal(Double.parseDouble(b));
		String obj = new String();
		
		if (!a.equals("") && !b.equals("")) {
			//先除法，得到5位有效数字，再乘100得到百分比，再截取四舍五入小数点后两位
			p = aa.divide(bb,new MathContext(5)).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
			obj = String.valueOf(p)+"%";
		} else {
			obj = "";
		}
		return obj;
	}
	
	/**
	 * @author NZ
	 * String得到百分比
	 * return *100的值
	 */
	public static String getPValue(String s) {
		BigDecimal p;
		String obj = new String();
		
		if (!s.equals("")) {
			//乘100得到百分比，再截取四舍五入小数点后两位
			p = new BigDecimal(s).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
			obj = String.valueOf(p)+"%";
		} else {
			obj = "";
		}
		return obj;
	}
	
	
	
}
