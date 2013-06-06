package com.ejustech.iron.common;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

	/** 匹配日期格式 */
	private static final String REGX_DATE_FORMAT = "((^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(10|12|0?[13578])([-\\/\\._])(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(11|0?[469])([-\\/\\._])(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(0?2)([-\\/\\._])(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([3579][26]00)([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)$))";
	/** 匹配浮点数 */
	private static final String REGX_DECIMAL = "^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$";
	/** 匹配整数 */
	private static final String REGX_INTEGER = "^-?[1-9]\\d*$";
	/** 匹配负浮点数 */
	private static final String REGX_NEGATIVE_DECIMAL = "^-([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*)$";
	/** 匹配负整数 */
	private static final String REGX_NEGATIVE_INTEGER = "^-[1-9]\\d*$";
	/** 匹配非负浮点数（正浮点数 + 0） */
	private static final String REGX_NOT_NEGATIVE_DECIMAL = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0$";
	/** 匹配非负整数（正整数 + 0） */
	private static final String REGX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";
	/** 匹配非正浮点数（负浮点数 + 0） */
	private static final String REGX_NOT_POSITIVE_DECIMAL = "^(-([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*))|0?\\.0+|0$";
	/** 匹配非正整数（负整数 + 0） */
	private static final String REGX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";
	/** 匹配正浮点数 */
	private static final String REGX_POSITIVE_DECIMAL = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";
	/** 匹配正整数 */
	private static final String REGX_POSITIVE_INTEGER = "^[1-9]\\d*$";
	/** 匹配数字 可以为负数，可以是小数 */
	private static final String REGX_NUMBER = "-?[0-9]*.?[0-9]*";

	public static String ISO8859Convert2UTF8(String value)
	{
		try {
			return new String(value.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public static String UTF8Convert2ISO8859(String value)
	{
		//DB中直接保存UTF-8
//		try {
//			return new String(value.getBytes("UTF-8"), "ISO-8859-1");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return value;
	}
	
	/** 匹配日期格式 */
	public static Boolean isDateFormat(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_DATE_FORMAT);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配数字，可以是负数，可以是小数 */
	public static Boolean isNumber(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NUMBER);
		Matcher m = p.matcher(value);
		return m.matches();
	}
	
	/** 匹配浮点数 */
	public static Boolean isDecimal(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_DECIMAL);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配整数 */
	public static Boolean isInteger(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_INTEGER);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 字符串长度比较 等于 */
	public static Boolean isLenEqual(String value, int len) {
		return null2Empty(value).length() == len;
	}

	/** 字符串长度比较 大于 */
	public static Boolean isLenGreater(String value, int len) {
		if (null2Empty(value).length() > len) {
			return true;
		}
		return false;
	}

	/** 字符串长度比较 大于等于 */
	public static Boolean isLenGreaterOrEqual(String value, int len) {
		if (null2Empty(value).length() >= len) {
			return true;
		}
		return false;
	}

	/** 字符串长度比较 小于 */
	public static Boolean isLenLess(String value, int len) {
		if (null2Empty(value).length() < len) {
			return true;
		}
		return false;
	}

	/** 字符串长度比较 小于等于 */
	public static Boolean isLenLessOrEqual(String value, int len) {
		if (null2Empty(value).length() <= len) {
			return true;
		}
		return false;
	}

	/** 字符串长度比较 不等于 */
	public static Boolean isLenNotEqual(String value, int len) {
		return null2Empty(value).length() != len;
	}

	/** 匹配负浮点数 */
	public static Boolean isNegativeDecimal(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NEGATIVE_DECIMAL);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配负整数 */
	public static Boolean isNegativeInteger(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NEGATIVE_INTEGER);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配非负浮点数（正浮点数 + 0） */
	public static Boolean isNotNegativeDecimal(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NOT_NEGATIVE_DECIMAL);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配非负整数（正整数 + 0） */
	public static Boolean isNotNegativeInteger(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NOT_NEGATIVE_INTEGER);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配非正浮点数（负浮点数 + 0） */
	public static Boolean isNotPositiveDecimal(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NOT_POSITIVE_DECIMAL);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配非正整数（负整数 + 0） */
	public static Boolean isNotPositiveInteger(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_NOT_POSITIVE_INTEGER);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** null或""验证 */
	public static Boolean isNullEmpty(String value) {
		if (value == null || "".equals(value)) {
			return true;
		}
		return false;
	}

	/** 匹配正浮点数 */
	public static Boolean isPositiveDecimal(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_POSITIVE_DECIMAL);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** 匹配正整数 */
	public static Boolean isPositiveInteger(String value) {
		if ("".equals(value)) return true;
		Pattern p = Pattern.compile(REGX_POSITIVE_INTEGER);
		Matcher m = p.matcher(value);
		return m.matches();
	}

	/** null to "" */
	public static String null2Empty(String value) {
		if (value == null) {
			return "";
		}
		return value;
	}

	/**
	 * 根据指定的格式化字符串，进行字符串的转换
	 * 
	 * @param 转换前的字符串
	 * @param 格式化字符串
	 * @return 转换后的字符串， 转换失败的情况，“”返回
	 */
	public String convert(String value, String format) {
		// 空值Check
		if (value == null || format == null) {
			return "";
		}

		int srcIndex = 0;
		String dest = "";

		// 根据格式化字符串的格式，进行变换
		for (int formatIndex = 0; formatIndex < format.length(); ++formatIndex) {
			if (value.length() <= srcIndex) {
				return "";
			}

			if (format.charAt(formatIndex) == '#') {
				dest += value.charAt(srcIndex++);
			} else {
				if (format.charAt(formatIndex) == value.charAt(srcIndex)) {
					++srcIndex;
				}
				dest += format.charAt(formatIndex);
			}
		}

		if (value.length() != srcIndex) {
			return "";
		}

		return dest;
	}
}
