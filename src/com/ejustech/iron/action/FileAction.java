package com.ejustech.iron.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.actions.DispatchAction;

import com.ejustech.iron.common.FileProcessor;

/**
 * @author Administrator
 * 从服务器下载文件到本地
 */
public class FileAction extends DispatchAction {
	private static String path = "c:\\irontemp";
	public void downFile(HttpServletResponse response,String fileName) throws Exception {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		OutputStream fos = null;
		InputStream fis = null;

		// 如果是从服务器上取就用这个获得系统的绝对路径
		//String filepath = servlet.getServletContext().getRealPath("/" + path);
		String filepath = path+"\\"+fileName;
		
		File uploadFile = new File(filepath);
		fis = new FileInputStream(uploadFile);
		bis = new BufferedInputStream(fis);
		fos = response.getOutputStream();
		bos = new BufferedOutputStream(fos);
		// 弹出下载对话框
		response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(filepath, "utf-8"));
		int bytesRead = 0;
		// 用输入流进行先读，然后用输出流去写，缓冲输入输出流
		byte[] buffer = new byte[8192];
		while ((bytesRead = bis.read(buffer, 0, 8192)) != -1) {
			bos.write(buffer, 0, bytesRead);
		}
		bos.flush();
		fis.close();
		bis.close();
		fos.close();
		bos.close();
		
		FileProcessor.deleteFolder(path);

	}
}
