package com.ejustech.iron.common;

import java.io.File;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.Result3FormBean;
import com.ejustech.iron.databean.form.Result4FormBean;
import com.ejustech.iron.databean.form.Result5FormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.Result7FormBean;

public class Excel {

	private static String path = "c:\\irontemp";
	

	// 导出result2 月生产数据统计表-含锰
	public static void exportResult2Excel(ArrayList<Result2FormBean> list, String fileName) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);
			
			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			Label labelTitle = new Label(0, 0, "月生产数据统计表-含锰", formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 26, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "期号", format1);
			Label label2 = new Label(1, 1, "Fe", format1);
			Label label3 = new Label(2, 1, "Cl", format1);
			Label label4 = new Label(3, 1, "N", format1);
			Label label5 = new Label(4, 1, "O", format1);
			Label label6 = new Label(5, 1, "HB", format1);
			Label label7 = new Label(6, 1, "总毛重量kg", format1);
			Label label8 = new Label(7, 1, "总炉次数", format1);
			Label label9 = new Label(8, 1, "均毛重kg", format1);
			Label label10 = new Label(9, 1, "Mg单耗", format1);
			Label label11 = new Label(10, 1, "TiCl4单耗", format1);
			Label label12 = new Label(11, 1, "成品率", format1);
			Label label13 = new Label(12, 1, "总净重量kg", format1);
			Label label14 = new Label(13, 1, "均净重kg", format1);
			Label label15 = new Label(14, 1, "0A级", format1);
			Label label16 = new Label(15, 1, "0A级率", format1);
			Label label17 = new Label(16, 1, "0级", format1);
			Label label18 = new Label(17, 1, "0级率", format1);
			Label label19 = new Label(18, 1, "0级以上", format1);
			Label label20 = new Label(19, 1, "1级", format1);
			Label label21 = new Label(20, 1, "1级率", format1);
			Label label22 = new Label(21, 1, "2级", format1);
			Label label23 = new Label(22, 1, "3级", format1);
			Label label24 = new Label(23, 1, "4级", format1);
			Label label25 = new Label(24, 1, "5级", format1);
			Label label26 = new Label(25, 1, "2级及以下", format1);
			Label label27 = new Label(26, 1, "2级及以下率", format1);

			// 添加到sheet1中
			sheet.addCell(labelTitle);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			sheet.addCell(label5);
			sheet.addCell(label6);
			sheet.addCell(label7);
			sheet.addCell(label8);
			sheet.addCell(label9);
			sheet.addCell(label10);
			sheet.addCell(label11);
			sheet.addCell(label12);
			sheet.addCell(label13);
			sheet.addCell(label14);
			sheet.addCell(label15);
			sheet.addCell(label16);
			sheet.addCell(label17);
			sheet.addCell(label18);
			sheet.addCell(label19);
			sheet.addCell(label20);
			sheet.addCell(label21);
			sheet.addCell(label22);
			sheet.addCell(label23);
			sheet.addCell(label24);
			sheet.addCell(label25);
			sheet.addCell(label26);
			sheet.addCell(label27);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 2, list.get(i).getQihao());
					Label l2 = new Label(1, i + 2, list.get(i).getFe());
					Label l3 = new Label(2, i + 2, list.get(i).getCl());
					Label l4 = new Label(3, i + 2, list.get(i).getN());
					Label l5 = new Label(4, i + 2, list.get(i).getO());
					Label l6 = new Label(5, i + 2, list.get(i).getHb());
					Label l7 = new Label(6, i + 2, list.get(i).getZongmaozhong());
					Label l8 = new Label(7, i + 2, list.get(i).getZonglushu());
					Label l9 = new Label(8, i + 2, list.get(i).getJunmaozhong());
					Label l10 = new Label(9, i + 2, list.get(i).getJunmgdanhao());
					Label l11 = new Label(10, i + 2, list.get(i).getTicl4danhao());
					Label l12 = new Label(11, i + 2, list.get(i).getJunhuishoulv());
					Label l13 = new Label(12, i + 2, list.get(i).getZongjingzhong());
					Label l14 = new Label(13, i + 2, list.get(i).getJunjingzhong());
					Label l15 = new Label(14, i + 2, list.get(i).getJ0Aji());
					Label l16 = new Label(15, i + 2, list.get(i).getJ0Ajilv());
					Label l17 = new Label(16, i + 2, list.get(i).getJ0ji());
					Label l18 = new Label(17, i + 2, list.get(i).getJ0jilv());
					Label l19 = new Label(18, i + 2, list.get(i).getJ0jiyishang());
					Label l20 = new Label(19, i + 2, list.get(i).getJ1ji());
					Label l21 = new Label(20, i + 2, list.get(i).getJ1jilv());
					Label l22 = new Label(21, i + 2, list.get(i).getJ2ji());
					Label l23 = new Label(22, i + 2, list.get(i).getJ3ji());
					Label l24 = new Label(23, i + 2, list.get(i).getJ4ji());
					Label l25 = new Label(24, i + 2, list.get(i).getJ5ji());
					Label l26 = new Label(25, i + 2, list.get(i).getJ2jijiyixia());
					Label l27 = new Label(26, i + 2, list.get(i).getJ2jijiyixialv());

					sheet.addCell(l1);
					sheet.addCell(l2);
					sheet.addCell(l3);
					sheet.addCell(l4);
					sheet.addCell(l5);
					sheet.addCell(l6);
					sheet.addCell(l7);
					sheet.addCell(l8);
					sheet.addCell(l9);
					sheet.addCell(l10);
					sheet.addCell(l11);
					sheet.addCell(l12);
					sheet.addCell(l13);
					sheet.addCell(l14);
					sheet.addCell(l15);
					sheet.addCell(l16);
					sheet.addCell(l17);
					sheet.addCell(l18);
					sheet.addCell(l19);
					sheet.addCell(l20);
					sheet.addCell(l21);
					sheet.addCell(l22);
					sheet.addCell(l23);
					sheet.addCell(l24);
					sheet.addCell(l25);
					sheet.addCell(l26);
					sheet.addCell(l27);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 导出result3 月生产数据统计表-除锰
	public static void exportResult3Excel(ArrayList<Result3FormBean> list, String fileName) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			Label labelTitle = new Label(0, 0, "月生产数据统计表-除锰", formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 26, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "期号", format1);
			Label label2 = new Label(1, 1, "Fe", format1);
			Label label3 = new Label(2, 1, "Cl", format1);
			Label label4 = new Label(3, 1, "N", format1);
			Label label5 = new Label(4, 1, "O", format1);
			Label label6 = new Label(5, 1, "HB", format1);
			Label label7 = new Label(6, 1, "总毛重量kg", format1);
			Label label8 = new Label(7, 1, "总炉次数", format1);
			Label label9 = new Label(8, 1, "均毛重kg", format1);
			Label label10 = new Label(9, 1, "Mg单耗", format1);
			Label label11 = new Label(10, 1, "TiCl4单耗", format1);
			Label label12 = new Label(11, 1, "成品率", format1);
			Label label13 = new Label(12, 1, "总净重量kg", format1);
			Label label14 = new Label(13, 1, "均净重kg", format1);
			Label label15 = new Label(14, 1, "0A级", format1);
			Label label16 = new Label(15, 1, "0A级率", format1);
			Label label17 = new Label(16, 1, "0级", format1);
			Label label18 = new Label(17, 1, "0级率", format1);
			Label label19 = new Label(18, 1, "0级以上", format1);
			Label label20 = new Label(19, 1, "1级", format1);
			Label label21 = new Label(20, 1, "1级率", format1);
			Label label22 = new Label(21, 1, "2级", format1);
			Label label23 = new Label(22, 1, "3级", format1);
			Label label24 = new Label(23, 1, "4级", format1);
			Label label25 = new Label(24, 1, "5级", format1);
			Label label26 = new Label(25, 1, "2级及以下", format1);
			Label label27 = new Label(26, 1, "2级及以下率", format1);

			// 添加到sheet1中
			sheet.addCell(labelTitle);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			sheet.addCell(label5);
			sheet.addCell(label6);
			sheet.addCell(label7);
			sheet.addCell(label8);
			sheet.addCell(label9);
			sheet.addCell(label10);
			sheet.addCell(label11);
			sheet.addCell(label12);
			sheet.addCell(label13);
			sheet.addCell(label14);
			sheet.addCell(label15);
			sheet.addCell(label16);
			sheet.addCell(label17);
			sheet.addCell(label18);
			sheet.addCell(label19);
			sheet.addCell(label20);
			sheet.addCell(label21);
			sheet.addCell(label22);
			sheet.addCell(label23);
			sheet.addCell(label24);
			sheet.addCell(label25);
			sheet.addCell(label26);
			sheet.addCell(label27);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 2, list.get(i).getQihao());
					Label l2 = new Label(1, i + 2, list.get(i).getFe());
					Label l3 = new Label(2, i + 2, list.get(i).getCl());
					Label l4 = new Label(3, i + 2, list.get(i).getN());
					Label l5 = new Label(4, i + 2, list.get(i).getO());
					Label l6 = new Label(5, i + 2, list.get(i).getHb());
					Label l7 = new Label(6, i + 2, list.get(i).getZongmaozhong());
					Label l8 = new Label(7, i + 2, list.get(i).getZonglushu());
					Label l9 = new Label(8, i + 2, list.get(i).getJunmaozhong());
					Label l10 = new Label(9, i + 2, list.get(i).getJunmgdanhao());
					Label l11 = new Label(10, i + 2, list.get(i).getTicl4danhao());
					Label l12 = new Label(11, i + 2, list.get(i).getJunhuishoulv());
					Label l13 = new Label(12, i + 2, list.get(i).getZongjingzhong());
					Label l14 = new Label(13, i + 2, list.get(i).getJunjingzhong());
					Label l15 = new Label(14, i + 2, list.get(i).getJ0Aji());
					Label l16 = new Label(15, i + 2, list.get(i).getJ0Ajilv());
					Label l17 = new Label(16, i + 2, list.get(i).getJ0ji());
					Label l18 = new Label(17, i + 2, list.get(i).getJ0jilv());
					Label l19 = new Label(18, i + 2, list.get(i).getJ0jiyishang());
					Label l20 = new Label(19, i + 2, list.get(i).getJ1ji());
					Label l21 = new Label(20, i + 2, list.get(i).getJ1jilv());
					Label l22 = new Label(21, i + 2, list.get(i).getJ2ji());
					Label l23 = new Label(22, i + 2, list.get(i).getJ3ji());
					Label l24 = new Label(23, i + 2, list.get(i).getJ4ji());
					Label l25 = new Label(24, i + 2, list.get(i).getJ5ji());
					Label l26 = new Label(25, i + 2, list.get(i).getJ2jijiyixia());
					Label l27 = new Label(26, i + 2, list.get(i).getJ2jijiyixialv());

					sheet.addCell(l1);
					sheet.addCell(l2);
					sheet.addCell(l3);
					sheet.addCell(l4);
					sheet.addCell(l5);
					sheet.addCell(l6);
					sheet.addCell(l7);
					sheet.addCell(l8);
					sheet.addCell(l9);
					sheet.addCell(l10);
					sheet.addCell(l11);
					sheet.addCell(l12);
					sheet.addCell(l13);
					sheet.addCell(l14);
					sheet.addCell(l15);
					sheet.addCell(l16);
					sheet.addCell(l17);
					sheet.addCell(l18);
					sheet.addCell(l19);
					sheet.addCell(l20);
					sheet.addCell(l21);
					sheet.addCell(l22);
					sheet.addCell(l23);
					sheet.addCell(l24);
					sheet.addCell(l25);
					sheet.addCell(l26);
					sheet.addCell(l27);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 导出result4 月等外钛统计表
	public static void exportResult4Excel(ArrayList<Result4FormBean> list, String fileName) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			Label labelTitle = new Label(0, 0, "月等外钛统计表", formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 17, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "期号", format1);
			Label label2 = new Label(1, 1, "总炉次数", format1);
			Label label3 = new Label(2, 1, "均毛重量kg", format1);
			Label label4 = new Label(3, 1, "均净重量kg", format1);
			Label label5 = new Label(4, 1, "成品率", format1);
			Label label6 = new Label(5, 1, "底皮kg", format1);
			Label label7 = new Label(6, 1, "上帽kg", format1);
			Label label8 = new Label(7, 1, "爬壁kg", format1);
			Label label9 = new Label(8, 1, "废底皮kg", format1);
			Label label10 = new Label(9, 1, "废底皮比例", format1);
			Label label11 = new Label(10, 1, "废上帽kg", format1);
			Label label12 = new Label(11, 1, "废上帽比例", format1);
			Label label13 = new Label(12, 1, "废爬壁kg", format1);
			Label label14 = new Label(13, 1, "废爬壁比例", format1);
			Label label15 = new Label(14, 1, "废钛粉kg", format1);
			Label label16 = new Label(15, 1, "磁选kg", format1);
			Label label17 = new Label(16, 1, "手选废料kg", format1);
			Label label18 = new Label(17, 1, "损耗kg", format1);

			// 添加到sheet1中
			sheet.addCell(labelTitle);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			sheet.addCell(label5);
			sheet.addCell(label6);
			sheet.addCell(label7);
			sheet.addCell(label8);
			sheet.addCell(label9);
			sheet.addCell(label10);
			sheet.addCell(label11);
			sheet.addCell(label12);
			sheet.addCell(label13);
			sheet.addCell(label14);
			sheet.addCell(label15);
			sheet.addCell(label16);
			sheet.addCell(label17);
			sheet.addCell(label18);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 2, list.get(i).getQihao());
					Label l2 = new Label(1, i + 2, list.get(i).getZonglushu());
					Label l3 = new Label(2, i + 2, list.get(i).getJunmaozhong());
					Label l4 = new Label(3, i + 2, list.get(i).getJunjingzhong());
					Label l5 = new Label(4, i + 2, list.get(i).getJunhuishoulv());
					Label l6 = new Label(5, i + 2, list.get(i).getDipi());
					Label l7 = new Label(6, i + 2, list.get(i).getShangmao());
					Label l8 = new Label(7, i + 2, list.get(i).getPabi());
					Label l9 = new Label(8, i + 2, list.get(i).getFeidipi());
					Label l10 = new Label(9, i + 2, list.get(i).getFeidipibili());
					Label l11 = new Label(10, i + 2, list.get(i).getFeishangmao());
					Label l12 = new Label(11, i + 2, list.get(i).getFeishangmaobili());
					Label l13 = new Label(12, i + 2, list.get(i).getFeipabi());
					Label l14 = new Label(13, i + 2, list.get(i).getFeipabibili());
					Label l15 = new Label(14, i + 2, list.get(i).getShaixuanfeiliao());
					Label l16 = new Label(15, i + 2, list.get(i).getCixuanfeiliao());
					Label l17 = new Label(16, i + 2, list.get(i).getShouxuanfeiliao());
					Label l18 = new Label(17, i + 2, list.get(i).getSunhao());

					sheet.addCell(l1);
					sheet.addCell(l2);
					sheet.addCell(l3);
					sheet.addCell(l4);
					sheet.addCell(l5);
					sheet.addCell(l6);
					sheet.addCell(l7);
					sheet.addCell(l8);
					sheet.addCell(l9);
					sheet.addCell(l10);
					sheet.addCell(l11);
					sheet.addCell(l12);
					sheet.addCell(l13);
					sheet.addCell(l14);
					sheet.addCell(l15);
					sheet.addCell(l16);
					sheet.addCell(l17);
					sheet.addCell(l18);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 导出result5 月指标统计表
	public static void exportResult5Excel(ArrayList<Result5FormBean> list, String fileName) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			Label labelTitle = new Label(0, 0, "月指标统计表", formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 19, 0);

			Label labelV = new Label(0, 1, "各指标数值", format1);
			Label labelP = new Label(12, 1, "所占比例", format1);
			// 合并单元格
			sheet.mergeCells(0, 1, 11, 1);
			sheet.mergeCells(12, 1, 19, 1);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 2, "期号", format1);
			Label label2 = new Label(1, 2, "总毛重量kg", format1);
			Label label3 = new Label(2, 2, "总净重量kg", format1);
			Label label4 = new Label(3, 2, "2级及以下率", format1);
			Label label5 = new Label(4, 2, "Fe>0.08", format1);
			Label label6 = new Label(5, 2, "Fe>0.05", format1);
			Label label7 = new Label(6, 2, "Cl>0.08", format1);
			Label label8 = new Label(7, 2, "Cl>0.06", format1);
			Label label9 = new Label(8, 2, "O>0.08", format1);
			Label label10 = new Label(9, 2, "O>0.05", format1);
			Label label11 = new Label(10, 2, "N>0.01", format1);
			Label label12 = new Label(11, 2, "Fe>0.08,Cl>0.08", format1);
			Label label13 = new Label(12, 2, "Fe>0.08", format1);
			Label label14 = new Label(13, 2, "Fe>0.05", format1);
			Label label15 = new Label(14, 2, "Cl>0.08", format1);
			Label label16 = new Label(15, 2, "Cl>0.06", format1);
			Label label17 = new Label(16, 2, "O>0.08", format1);
			Label label18 = new Label(17, 2, "O>0.05", format1);
			Label label19 = new Label(18, 2, "N>0.01", format1);
			Label label20 = new Label(19, 2, "Fe>0.08,Cl>0.08", format1);

			// 添加到sheet1中
			sheet.addCell(labelTitle);
			sheet.addCell(labelV);
			sheet.addCell(labelP);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			sheet.addCell(label5);
			sheet.addCell(label6);
			sheet.addCell(label7);
			sheet.addCell(label8);
			sheet.addCell(label9);
			sheet.addCell(label10);
			sheet.addCell(label11);
			sheet.addCell(label12);
			sheet.addCell(label13);
			sheet.addCell(label14);
			sheet.addCell(label15);
			sheet.addCell(label16);
			sheet.addCell(label17);
			sheet.addCell(label18);
			sheet.addCell(label19);
			sheet.addCell(label20);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 3, list.get(i).getQihao());
					Label l2 = new Label(1, i + 3, list.get(i).getZongmaozhong());
					Label l3 = new Label(2, i + 3, list.get(i).getZongjingzhong());
					Label l4 = new Label(3, i + 3, list.get(i).getJ2jijiyixialv());
					Label l5 = new Label(4, i + 3, list.get(i).getFe008());
					Label l6 = new Label(5, i + 3, list.get(i).getFe005());
					Label l7 = new Label(6, i + 3, list.get(i).getCl008());
					Label l8 = new Label(7, i + 3, list.get(i).getCl006());
					Label l9 = new Label(8, i + 3, list.get(i).getO008());
					Label l10 = new Label(9, i + 3, list.get(i).getO005());
					Label l11 = new Label(10, i + 3, list.get(i).getN001());
					Label l12 = new Label(11, i + 3, list.get(i).getFecl008());
					Label l13 = new Label(12, i + 3, list.get(i).getFe008bili());
					Label l14 = new Label(13, i + 3, list.get(i).getFe005bili());
					Label l15 = new Label(14, i + 3, list.get(i).getCl008bili());
					Label l16 = new Label(15, i + 3, list.get(i).getCl006bili());
					Label l17 = new Label(16, i + 3, list.get(i).getO008bili());
					Label l18 = new Label(17, i + 3, list.get(i).getO005bili());
					Label l19 = new Label(17, i + 3, list.get(i).getN001bili());
					Label l20 = new Label(17, i + 3, list.get(i).getFecl008bili());

					sheet.addCell(l1);
					sheet.addCell(l2);
					sheet.addCell(l3);
					sheet.addCell(l4);
					sheet.addCell(l5);
					sheet.addCell(l6);
					sheet.addCell(l7);
					sheet.addCell(l8);
					sheet.addCell(l9);
					sheet.addCell(l10);
					sheet.addCell(l11);
					sheet.addCell(l12);
					sheet.addCell(l13);
					sheet.addCell(l14);
					sheet.addCell(l15);
					sheet.addCell(l16);
					sheet.addCell(l17);
					sheet.addCell(l18);
					sheet.addCell(l19);
					sheet.addCell(l20);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 导出result6 单炉生产数据统计表
	public static void exportResult6Excel(ArrayList<Result6FormBean> list, String fileName) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			Label labelTitle = new Label(0, 0, "单炉生产数据统计表", formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 27, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "生产炉号", format1);
			Label label2 = new Label(1, 1, "总炉次数", format1);
			Label label3 = new Label(2, 1, "总毛重量kg", format1);
			Label label4 = new Label(3, 1, "总净重量kg", format1);
			Label label5 = new Label(4, 1, "成品率", format1);
			Label label6 = new Label(5, 1, "Mg单耗", format1);
			Label label7 = new Label(6, 1, "Fe", format1);
			Label label8 = new Label(7, 1, "Cl", format1);
			Label label9 = new Label(8, 1, "N", format1);
			Label label10 = new Label(9, 1, "O", format1);
			Label label11 = new Label(10, 1, "0A级", format1);
			Label label12 = new Label(11, 1, "0级", format1);
			Label label13 = new Label(12, 1, "1级", format1);
			Label label14 = new Label(13, 1, "2级及以下", format1);
			Label label15 = new Label(14, 1, "0A级率", format1);
			Label label16 = new Label(15, 1, "0级率", format1);
			Label label17 = new Label(16, 1, "1级率", format1);
			Label label18 = new Label(17, 1, "2级及以下率", format1);
			Label label19 = new Label(18, 1, "底皮kg", format1);
			Label label20 = new Label(19, 1, "上帽kg", format1);
			Label label21 = new Label(20, 1, "爬壁kg", format1);
			Label label22 = new Label(21, 1, "废底皮kg", format1);
			Label label23 = new Label(22, 1, "废上帽kg", format1);
			Label label24 = new Label(23, 1, "废爬壁kg", format1);
			Label label25 = new Label(24, 1, "废钛粉kg", format1);
			Label label26 = new Label(25, 1, "磁选废料kg", format1);
			Label label27 = new Label(26, 1, "手选废料kg", format1);
			Label label28 = new Label(27, 1, "损耗kg", format1);

			// 添加到sheet1中
			sheet.addCell(labelTitle);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			sheet.addCell(label5);
			sheet.addCell(label6);
			sheet.addCell(label7);
			sheet.addCell(label8);
			sheet.addCell(label9);
			sheet.addCell(label10);
			sheet.addCell(label11);
			sheet.addCell(label12);
			sheet.addCell(label13);
			sheet.addCell(label14);
			sheet.addCell(label15);
			sheet.addCell(label16);
			sheet.addCell(label17);
			sheet.addCell(label18);
			sheet.addCell(label19);
			sheet.addCell(label20);
			sheet.addCell(label21);
			sheet.addCell(label22);
			sheet.addCell(label23);
			sheet.addCell(label24);
			sheet.addCell(label25);
			sheet.addCell(label26);
			sheet.addCell(label27);
			sheet.addCell(label28);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 2, list.get(i).getShengchanluhao());
					Label l2 = new Label(1, i + 2, list.get(i).getZonglucishu());
					Label l3 = new Label(2, i + 2, list.get(i).getZongmaozhong());
					Label l4 = new Label(3, i + 2, list.get(i).getZongjingzhong());
					Label l5 = new Label(4, i + 2, list.get(i).getChengpinlv());
					Label l6 = new Label(5, i + 2, list.get(i).getMgdanhao());
					Label l7 = new Label(6, i + 2, list.get(i).getFe());
					Label l8 = new Label(7, i + 2, list.get(i).getCl());
					Label l9 = new Label(8, i + 2, list.get(i).getN());
					Label l10 = new Label(9, i + 2, list.get(i).getO());
					Label l11 = new Label(10, i + 2, list.get(i).getJ0Aji());
					Label l12 = new Label(11, i + 2, list.get(i).getJ0ji());
					Label l13 = new Label(12, i + 2, list.get(i).getJ1ji());
					Label l14 = new Label(13, i + 2, list.get(i).getJ2jijiyixia());
					Label l15 = new Label(14, i + 2, list.get(i).getJ0Ajilv());
					Label l16 = new Label(15, i + 2, list.get(i).getJ0jilv());
					Label l17 = new Label(16, i + 2, list.get(i).getJ1jilv());
					Label l18 = new Label(17, i + 2, list.get(i).getJ2jijiyixialv());
					Label l19 = new Label(18, i + 2, list.get(i).getDipi());
					Label l20 = new Label(19, i + 2, list.get(i).getShangmao());
					Label l21 = new Label(20, i + 2, list.get(i).getPabi());
					Label l22 = new Label(21, i + 2, list.get(i).getFeidipi());
					Label l23 = new Label(22, i + 2, list.get(i).getFeishangmao());
					Label l24 = new Label(23, i + 2, list.get(i).getFeipabi());
					Label l25 = new Label(24, i + 2, list.get(i).getFeitaifen());
					Label l26 = new Label(25, i + 2, list.get(i).getCixuanfeiliao());
					Label l27 = new Label(26, i + 2, list.get(i).getShouxuanfeiliao());
					Label l28 = new Label(27, i + 2, list.get(i).getSunhao());

					sheet.addCell(l1);
					sheet.addCell(l2);
					sheet.addCell(l3);
					sheet.addCell(l4);
					sheet.addCell(l5);
					sheet.addCell(l6);
					sheet.addCell(l7);
					sheet.addCell(l8);
					sheet.addCell(l9);
					sheet.addCell(l10);
					sheet.addCell(l11);
					sheet.addCell(l12);
					sheet.addCell(l13);
					sheet.addCell(l14);
					sheet.addCell(l15);
					sheet.addCell(l16);
					sheet.addCell(l17);
					sheet.addCell(l18);
					sheet.addCell(l19);
					sheet.addCell(l20);
					sheet.addCell(l21);
					sheet.addCell(l22);
					sheet.addCell(l23);
					sheet.addCell(l24);
					sheet.addCell(l25);
					sheet.addCell(l26);
					sheet.addCell(l27);
					sheet.addCell(l28);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 导出result7 月还渗炉次生产数据汇总表
	public static void exportResult7Excel(ArrayList<Result7FormBean> list, String fileName) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			Label labelTitle = new Label(0, 0, "月还渗炉次生产数据汇总表", formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 27, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "月份", format1);
			Label label2 = new Label(1, 1, "总炉次数", format1);
			Label label3 = new Label(2, 1, "总毛重量kg", format1);
			Label label4 = new Label(3, 1, "总净重量kg", format1);
			Label label5 = new Label(4, 1, "成品率", format1);
			Label label6 = new Label(5, 1, "Mg单耗", format1);
			Label label7 = new Label(6, 1, "Fe", format1);
			Label label8 = new Label(7, 1, "Cl", format1);
			Label label9 = new Label(8, 1, "N", format1);
			Label label10 = new Label(9, 1, "O", format1);
			Label label11 = new Label(10, 1, "0A级", format1);
			Label label12 = new Label(11, 1, "0级", format1);
			Label label13 = new Label(12, 1, "1级", format1);
			Label label14 = new Label(13, 1, "2级及以下", format1);
			Label label15 = new Label(14, 1, "0A级率", format1);
			Label label16 = new Label(15, 1, "0级率", format1);
			Label label17 = new Label(16, 1, "1级率", format1);
			Label label18 = new Label(17, 1, "2级及以下率", format1);
			Label label19 = new Label(18, 1, "底皮kg", format1);
			Label label20 = new Label(19, 1, "上帽kg", format1);
			Label label21 = new Label(20, 1, "爬壁kg", format1);
			Label label22 = new Label(21, 1, "废底皮kg", format1);
			Label label23 = new Label(22, 1, "废上帽kg", format1);
			Label label24 = new Label(23, 1, "废爬壁kg", format1);
			Label label25 = new Label(24, 1, "废钛粉kg", format1);
			Label label26 = new Label(25, 1, "磁选废料kg", format1);
			Label label27 = new Label(26, 1, "手选废料kg", format1);
			Label label28 = new Label(27, 1, "损耗kg", format1);

			// 添加到sheet1中
			sheet.addCell(labelTitle);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			sheet.addCell(label5);
			sheet.addCell(label6);
			sheet.addCell(label7);
			sheet.addCell(label8);
			sheet.addCell(label9);
			sheet.addCell(label10);
			sheet.addCell(label11);
			sheet.addCell(label12);
			sheet.addCell(label13);
			sheet.addCell(label14);
			sheet.addCell(label15);
			sheet.addCell(label16);
			sheet.addCell(label17);
			sheet.addCell(label18);
			sheet.addCell(label19);
			sheet.addCell(label20);
			sheet.addCell(label21);
			sheet.addCell(label22);
			sheet.addCell(label23);
			sheet.addCell(label24);
			sheet.addCell(label25);
			sheet.addCell(label26);
			sheet.addCell(label27);
			sheet.addCell(label28);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 2, list.get(i).getYue());
					Label l2 = new Label(1, i + 2, list.get(i).getZonglucishu());
					Label l3 = new Label(2, i + 2, list.get(i).getZongmaozhong());
					Label l4 = new Label(3, i + 2, list.get(i).getZongjingzhong());
					Label l5 = new Label(4, i + 2, list.get(i).getChengpinlv());
					Label l6 = new Label(5, i + 2, list.get(i).getMgdanhao());
					Label l7 = new Label(6, i + 2, list.get(i).getFe());
					Label l8 = new Label(7, i + 2, list.get(i).getCl());
					Label l9 = new Label(8, i + 2, list.get(i).getN());
					Label l10 = new Label(9, i + 2, list.get(i).getO());
					Label l11 = new Label(10, i + 2, list.get(i).getJ0Aji());
					Label l12 = new Label(11, i + 2, list.get(i).getJ0ji());
					Label l13 = new Label(12, i + 2, list.get(i).getJ1ji());
					Label l14 = new Label(13, i + 2, list.get(i).getJ2jijiyixia());
					Label l15 = new Label(14, i + 2, list.get(i).getJ0Ajilv());
					Label l16 = new Label(15, i + 2, list.get(i).getJ0jilv());
					Label l17 = new Label(16, i + 2, list.get(i).getJ1jilv());
					Label l18 = new Label(17, i + 2, list.get(i).getJ2jijiyixialv());
					Label l19 = new Label(18, i + 2, list.get(i).getDipi());
					Label l20 = new Label(19, i + 2, list.get(i).getShangmao());
					Label l21 = new Label(20, i + 2, list.get(i).getPabi());
					Label l22 = new Label(21, i + 2, list.get(i).getFeidipi());
					Label l23 = new Label(22, i + 2, list.get(i).getFeishangmao());
					Label l24 = new Label(23, i + 2, list.get(i).getFeipabi());
					Label l25 = new Label(24, i + 2, list.get(i).getFeitaifen());
					Label l26 = new Label(25, i + 2, list.get(i).getCixuanfeiliao());
					Label l27 = new Label(26, i + 2, list.get(i).getShouxuanfeiliao());
					Label l28 = new Label(27, i + 2, list.get(i).getSunhao());

					sheet.addCell(l1);
					sheet.addCell(l2);
					sheet.addCell(l3);
					sheet.addCell(l4);
					sheet.addCell(l5);
					sheet.addCell(l6);
					sheet.addCell(l7);
					sheet.addCell(l8);
					sheet.addCell(l9);
					sheet.addCell(l10);
					sheet.addCell(l11);
					sheet.addCell(l12);
					sheet.addCell(l13);
					sheet.addCell(l14);
					sheet.addCell(l15);
					sheet.addCell(l16);
					sheet.addCell(l17);
					sheet.addCell(l18);
					sheet.addCell(l19);
					sheet.addCell(l20);
					sheet.addCell(l21);
					sheet.addCell(l22);
					sheet.addCell(l23);
					sheet.addCell(l24);
					sheet.addCell(l25);
					sheet.addCell(l26);
					sheet.addCell(l27);
					sheet.addCell(l28);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
