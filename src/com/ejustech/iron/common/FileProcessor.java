package com.ejustech.iron.common;

import java.io.File;
import java.io.IOException;

/**
 * @author NZ
 * 文件与文件夹处理
 */
public class FileProcessor {
	/**
	 * 创建文件夹
	 * 
	 * @param sPath
	 *            要创建的目录或文件
	 * @return 删除成功返回 true，否则返回 false。 文件相关属性设置：显示或更改文件属性。 ATTRIB [+R | -R] [+A
	 *         | -A ] [+S | -S] [+H | -H] [[drive:] [path] filename] [/S [ /D]]
	 *         + 设置属性。 - 清除属性。 R 只读文件属性。 A 存档文件属性。 S 系统文件属性。 H 隐藏文件属性。
	 *         [drive:][path][filename] 指定要处理的文件属性。 /S 处理当前文件夹及其子文件夹中的匹配文件。 /D
	 *         也处理文件夹。
	 */
	public static boolean createForder(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		try {
			if (!file.exists()) {
				file.mkdir();
				//设置文件夹为隐藏属性
				String string = " attrib +H  " + file.getAbsolutePath();
//				Process p = Runtime.getRuntime().exec(string);
				Runtime.getRuntime().exec(string);
				flag = true;
				return flag;
			} else {
				return flag;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 根据路径删除指定的目录或文件，无论存在与否
	 * 
	 * @param sPath
	 *            要删除的目录或文件
	 * @return 删除成功返回 true，否则返回 false。
	 */
	public static boolean deleteFolder(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		// 判断目录或文件是否存在
		if (!file.exists()) { // 不存在返回 false
			return flag;
		} else {
			// 判断是否为文件
			if (file.isFile()) { // 为文件时调用删除文件方法
				return deleteFile(sPath);
			} else { // 为目录时调用删除目录方法
				return deleteDirectory(sPath);
			}
		}
	}

	/**
	 * 删除单个文件
	 * 
	 * @param sPath
	 *            被删除文件的文件名
	 * @return 单个文件删除成功返回true，否则返回false
	 */
	public static boolean deleteFile(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		// 路径为文件且不为空则进行删除
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}

	/**
	 * 删除目录（文件夹）以及目录下的文件
	 * 
	 * @param sPath
	 *            被删除目录的文件路径
	 * @return 目录删除成功返回true，否则返回false
	 */
	public static boolean deleteDirectory(String sPath) {
		// 如果sPath不以文件分隔符结尾，自动添加文件分隔符
		if (!sPath.endsWith(File.separator)) {
			sPath = sPath + File.separator;
		}
		File dirFile = new File(sPath);
		// 如果dir对应的文件不存在，或者不是一个目录，则退出
		if (!dirFile.exists() || !dirFile.isDirectory()) {
			return false;
		}
		boolean flag = true;
		// 删除文件夹下的所有文件(包括子目录)
		File[] files = dirFile.listFiles();
		for (int i = 0; i < files.length; i++) {
			// 删除子文件
			if (files[i].isFile()) {
				flag = deleteFile(files[i].getAbsolutePath());
				if (!flag)
					break;
			} // 删除子目录
			else {
				flag = deleteDirectory(files[i].getAbsolutePath());
				if (!flag)
					break;
			}
		}
		if (!flag)
			return false;
		// 删除当前目录
		if (dirFile.delete()) {
			return true;
		} else {
			return false;
		}
	}

}
