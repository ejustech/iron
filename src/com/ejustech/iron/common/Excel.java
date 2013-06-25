package com.ejustech.iron.common;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import com.ejustech.iron.databean.form.Result1FormBean;
import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.Result3FormBean;
import com.ejustech.iron.databean.form.Result4FormBean;
import com.ejustech.iron.databean.form.Result5FormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.Result7FormBean;

/**
 * @author Administrator
 * 导出Excel用
 */
public class Excel{
	//导出文件临时存放文件夹
	private static String path = "c:\\irontemp";
	
	// 导出result1 全部数据输出表
	public static void exportResult1Excel(ArrayList<Result1FormBean> list, String fileName, String riqi) {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);
			String lableName = "全部数据输出表";
	
			if (riqi != null) {
				lableName = lableName + " " + riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 44, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "日期", format1);
			Label label2 = new Label(1, 1, "期号", format1);
			Label label3 = new Label(2, 1, "炉次", format1); // 炉次   + 军品
			Label label4 = new Label(3, 1, "规格", format1);
			Label label5 = new Label(4, 1, "生产炉号", format1);
			Label label6 = new Label(5, 1, "反应器号", format1);
			Label label7 = new Label(6, 1, "使用次数", format1);
			Label label8 = new Label(7, 1, "Mg(t)", format1);
			Label label9 = new Label(8, 1, "TiCl4", format1);
			Label label10 = new Label(9, 1, "毛重", format1);
			Label label11 = new Label(10, 1, "净重", format1);
			Label label12 = new Label(11, 1, "成品率", format1);
			Label label13 = new Label(12, 1, "Fe", format1);
			Label label14 = new Label(13, 1, "Si", format1);
			Label label15 = new Label(14, 1, "Cl", format1);
			Label label16 = new Label(15, 1, "C", format1);
			Label label17 = new Label(16, 1, "N", format1);
			Label label18 = new Label(17, 1, "O", format1);
			Label label19 = new Label(18, 1, "H", format1);
			Label label20 = new Label(19, 1, "Mn", format1);
			Label label21 = new Label(20, 1, "HB", format1);
			Label label22 = new Label(21, 1, "等级(含锰)", format1);
			Label label23 = new Label(22, 1, "考核等级(除锰)", format1);
			Label label24 = new Label(23, 1, "工艺调整", format1);
			Label label25 = new Label(24, 1, "工艺试验", format1);
			Label label26 = new Label(25, 1, "底皮Kg", format1);
			Label label27 = new Label(26, 1, "上帽Kg", format1);
			Label label28 = new Label(27, 1, "爬壁Kg", format1);
			Label label29 = new Label(28, 1, "废底皮Kg", format1);
			Label label30 = new Label(29, 1, "废上帽Kg", format1);
			Label label31 = new Label(30, 1, "废爬壁Kg", format1);
			Label label32 = new Label(31, 1, "废钛粉Kg", format1);
			Label label33 = new Label(32, 1, "磁选Kg", format1);
			Label label34 = new Label(33, 1, "手选废料Kg", format1);
			Label label35 = new Label(34, 1, "损耗Kg", format1);
			Label label36 = new Label(35, 1, "总排镁量Kg", format1);
			Label label37 = new Label(36, 1, "出炉真空度Pa", format1);
			Label label38 = new Label(37, 1, "还原最高温度℃", format1);
			Label label39 = new Label(38, 1, "蒸馏高恒A点最高℃", format1);
			Label label40 = new Label(39, 1, "转蒸馏", format1);
			Label label41 = new Label(40, 1, "加首次", format1);
			Label label42 = new Label(41, 1, "加末次", format1);
			Label label43 = new Label(42, 1, "通道", format1);
			Label label44 = new Label(43, 1, "生产故障", format1);
			Label label45 = new Label(44, 1, "备注说明", format1);

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
			sheet.addCell(label29);
			sheet.addCell(label30);
			sheet.addCell(label31);
			sheet.addCell(label32);
			sheet.addCell(label33);
			sheet.addCell(label34);
			sheet.addCell(label35);
			sheet.addCell(label36);
			sheet.addCell(label37);
			sheet.addCell(label38);
			sheet.addCell(label39);
			sheet.addCell(label40);
			sheet.addCell(label41);
			sheet.addCell(label42);
			sheet.addCell(label43);
			sheet.addCell(label44);
			sheet.addCell(label45);

			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					Label l1 = new Label(0, i + 2, list.get(i).getRiqi());    // 日期
					Label l2 = new Label(1, i + 2, list.get(i).getQihao());   // 期号
					// 炉次 + 军品
					Label l3;
					if (!list.get(i).getJunpin().equals("")) {
						l3 = new Label(2, i + 2, list.get(i).getLuci() + list.get(i).getJunpin());   // 炉次   + 军品
					} else {
						l3 = new Label(2, i + 2, list.get(i).getLuci());   // 炉次 
					}
					Label l4 = new Label(3, i + 2, list.get(i).getGuige());            // 规格
					Label l5 = new Label(4, i + 2, list.get(i).getShengchanluhao());   // 生产炉号
					Label l6 = new Label(5, i + 2, list.get(i).getFanyingqihao());     // 反应器号
					Label l7 = new Label(6, i + 2, list.get(i).getShiyongcishu());     // 使用次数
					Label l8 = new Label(7, i + 2, list.get(i).getMg());     // Mg(t)
					Label l9 = new Label(8, i + 2, list.get(i).getTicl());   // TiCl4
					Label l10 = new Label(9, i + 2, list.get(i).getMaozhong());      // 毛重
					Label l11 = new Label(10, i + 2, list.get(i).getJingzhong());    // 净重
					Label l12 = new Label(11, i + 2, list.get(i).getChengpinlv());   // 成品率
					Label l13 = new Label(12, i + 2, list.get(i).getFe());   // Fe
					Label l14 = new Label(13, i + 2, list.get(i).getSi());   // Si
					Label l15 = new Label(14, i + 2, list.get(i).getCl());   // Cl
					Label l16 = new Label(15, i + 2, list.get(i).getC());    // C
					Label l17 = new Label(16, i + 2, list.get(i).getN());    // N
					Label l18 = new Label(17, i + 2, list.get(i).getO());    // O
					Label l19 = new Label(18, i + 2, list.get(i).getH());    // H
					Label l20 = new Label(19, i + 2, list.get(i).getMn());   // Mn
					Label l21 = new Label(20, i + 2, list.get(i).getHb());   // HB
					Label l22 = new Label(21, i + 2, list.get(i).getDengji_hanmeng());         // 等级(含锰)
					Label l23 = new Label(22, i + 2, list.get(i).getKaohedengji_chumeng());    // 考核等级(除锰)
					Label l24 = new Label(23, i + 2, list.get(i).getGongyitiaozheng());        // 工艺调整
					Label l25 = new Label(24, i + 2, list.get(i).getGongyishiyan());           // 工艺试验
					Label l26 = new Label(25, i + 2, list.get(i).getDipi());        // 底皮Kg
					Label l27 = new Label(26, i + 2, list.get(i).getShangmao());    // 上帽Kg
					Label l28 = new Label(27, i + 2, list.get(i).getPabi());        // 爬壁Kg
					Label l29 = new Label(28, i + 2, list.get(i).getFeidipi());     // 废底皮Kg
					Label l30 = new Label(29, i + 2, list.get(i).getFeishangmao());    // 废上帽Kg
					Label l31 = new Label(30, i + 2, list.get(i).getFeipabi());        // 废爬壁Kg
					Label l32 = new Label(31, i + 2, list.get(i).getFeitaifen());      // 废钛粉Kg
					Label l33 = new Label(32, i + 2, list.get(i).getCixuan());         // 磁选Kg
					Label l34 = new Label(33, i + 2, list.get(i).getShouxuanfeiliao());    // 手选废料Kg
					Label l35 = new Label(34, i + 2, list.get(i).getSunhao());             // 损耗Kg
					Label l36 = new Label(35, i + 2, list.get(i).getZongpaimeiliang());    // 总排镁量Kg
					Label l37 = new Label(36, i + 2, list.get(i).getChuluzhenkongdu());    // 出炉真空度Pa
					Label l38 = new Label(37, i + 2, list.get(i).getHuanyuanzuigaowendu());    // 还原最高温度℃
					Label l39 = new Label(38, i + 2, list.get(i).getZhengliugaoheng());    // 蒸馏高恒A点最高℃
					Label l40 = new Label(39, i + 2, list.get(i).getZhuanzhengliu());      // 转蒸馏
					Label l41 = new Label(40, i + 2, list.get(i).getJiashouci());    // 加首次
					Label l42 = new Label(41, i + 2, list.get(i).getJiamoci());      // 加末次
					Label l43 = new Label(42, i + 2, list.get(i).getTongdao());      // 通道
					Label l44 = new Label(43, i + 2, list.get(i).getShengchanguzhang());   // 生产故障
					Label l45 = new Label(44, i + 2, list.get(i).getBeizhushuoming());     // 备注说明
					
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
					sheet.addCell(l29);
					sheet.addCell(l30);
					sheet.addCell(l31);
					sheet.addCell(l32);
					sheet.addCell(l33);
					sheet.addCell(l34);
					sheet.addCell(l35);
					sheet.addCell(l36);
					sheet.addCell(l37);
					sheet.addCell(l38);
					sheet.addCell(l39);
					sheet.addCell(l40);
					sheet.addCell(l41);
					sheet.addCell(l42);
					sheet.addCell(l43);
					sheet.addCell(l44);
					sheet.addCell(l45);
				}
			}
			book.write();
			book.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 导出result2 月生产数据统计表-含锰
	public static void exportResult2Excel(ArrayList<Result2FormBean> list, String fileName, String riqi) {
		// TODO Auto-generated method stub
		try {
						
			FileProcessor.createForder(path);
			
			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);
			String lableName = "生产数据统计表-含锰（毛重）";
//			if(riqi != null){
			if(riqi != null){	
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);
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
			Label label19 = new Label(18, 1, "0级以上率", format1);
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
					Label l19 = new Label(18, i + 2, list.get(i).getJ0jiyishanglv());
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

	public static void exportResult21Excel(ArrayList<Result2FormBean> list, String fileName, String riqi) {
		// TODO Auto-generated method stub
		try {
						
			FileProcessor.createForder(path);
			
			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);
			String lableName = "生产数据统计表-含锰（产量）";
//			if(riqi != null){
			if(riqi != null){	
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 26, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "期号", format1);
			Label label2 = new Label(1, 1, "Fe", format1);
			Label label3 = new Label(2, 1, "Cl", format1);
			Label label4 = new Label(3, 1, "N", format1);
			Label label5 = new Label(4, 1, "O", format1);
			Label label6 = new Label(5, 1, "HB", format1);
			Label label7 = new Label(6, 1, "产量kg", format1);
			Label label8 = new Label(7, 1, "总炉次数", format1);
			Label label9 = new Label(8, 1, "均产量kg", format1);
			Label label10 = new Label(9, 1, "Mg单耗", format1);
			Label label11 = new Label(10, 1, "TiCl4单耗", format1);
			Label label12 = new Label(11, 1, "生产成品率", format1);
			Label label13 = new Label(12, 1, "总净重量kg", format1);
			Label label14 = new Label(13, 1, "均净重kg", format1);
			Label label15 = new Label(14, 1, "0A级", format1);
			Label label16 = new Label(15, 1, "0A级率", format1);
			Label label17 = new Label(16, 1, "0级", format1);
			Label label18 = new Label(17, 1, "0级率", format1);
			Label label19 = new Label(18, 1, "0级以上率", format1);
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
					Label l19 = new Label(18, i + 2, list.get(i).getJ0jiyishanglv());
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
	public static void exportResult3Excel(ArrayList<Result3FormBean> list, String fileName, String riqi) throws Exception {
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			String lableName = "生产数据统计表-除锰（毛重）";
			if(riqi != null){
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);
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
			Label label19 = new Label(18, 1, "0级以上率", format1);
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
					Label l19 = new Label(18, i + 2, list.get(i).getJ0jiyishanglv());
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
	
	public static void exportResult31Excel(ArrayList<Result3FormBean> list, String fileName, String riqi) throws Exception {
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			String lableName = "生产数据统计表-除锰（产量）";
			if(riqi != null){
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);
			// 合并单元格
			sheet.mergeCells(0, 0, 26, 0);

			// 添加表头, 第一个参数是列，第二个是行
			Label label1 = new Label(0, 1, "期号", format1);
			Label label2 = new Label(1, 1, "Fe", format1);
			Label label3 = new Label(2, 1, "Cl", format1);
			Label label4 = new Label(3, 1, "N", format1);
			Label label5 = new Label(4, 1, "O", format1);
			Label label6 = new Label(5, 1, "HB", format1);
			Label label7 = new Label(6, 1, "产量kg", format1);
			Label label8 = new Label(7, 1, "总炉次数", format1);
			Label label9 = new Label(8, 1, "均产量kg", format1);
			Label label10 = new Label(9, 1, "Mg单耗", format1);
			Label label11 = new Label(10, 1, "TiCl4单耗", format1);
			Label label12 = new Label(11, 1, "生产成品率", format1);
			Label label13 = new Label(12, 1, "总净重量kg", format1);
			Label label14 = new Label(13, 1, "均净重kg", format1);
			Label label15 = new Label(14, 1, "0A级", format1);
			Label label16 = new Label(15, 1, "0A级率", format1);
			Label label17 = new Label(16, 1, "0级", format1);
			Label label18 = new Label(17, 1, "0级率", format1);
			Label label19 = new Label(18, 1, "0级以上率", format1);
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
					Label l19 = new Label(18, i + 2, list.get(i).getJ0jiyishanglv());
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
	public static void exportResult4Excel(ArrayList<Result4FormBean> list, String fileName, String riqi) throws Exception {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			String lableName = "等外钛统计表";
			if(riqi != null){
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);
			
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
	public static void exportResult5Excel(ArrayList<Result5FormBean> list, String fileName, String riqi) throws Exception {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			String lableName = "指标统计表";
			if(riqi != null){
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);

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
					Label l19 = new Label(18, i + 3, list.get(i).getN001bili());
					Label l20 = new Label(19, i + 3, list.get(i).getFecl008bili());

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
	public static void exportResult6Excel(ArrayList<Result6FormBean> list, String fileName, String riqi) throws Exception {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			String lableName = "单炉生产数据统计表";
			if(riqi != null){
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);

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
	public static void exportResult7Excel(ArrayList<Result7FormBean> list, String fileName, String riqi) throws Exception {
		// TODO Auto-generated method stub
		try {

			FileProcessor.createForder(path);

			WritableWorkbook book = Workbook.createWorkbook(new File(path + "\\" + fileName));

			WritableSheet sheet = book.createSheet("sheet1", 0);

			WritableFont fontTitle = new WritableFont(WritableFont.TIMES, 14, WritableFont.BOLD);
			WritableCellFormat formatTitle = new WritableCellFormat(fontTitle);

			WritableFont font1 = new WritableFont(WritableFont.TIMES, 11, WritableFont.BOLD);
			WritableCellFormat format1 = new WritableCellFormat(font1);

			String lableName = "还渗炉次生产数据汇总表";
			if(riqi != null){
				lableName = lableName + " " +  riqi;
			}
			Label labelTitle = new Label(0, 0, lableName, formatTitle);

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
