/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.ejustech.iron.databean.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionFormBean;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 04-19-2013
 * 
 * XDoclet definition:
 * 
 * @struts.form name="inputByNewForm"
 */
public class InputByNewFormBean extends ActionFormBean{
	/*
	 * Generated fields
	 */

	/** gongYiShiYanJunPin property */
	private String gongYiShiYanJunPin;

	/** chuLuZhenKongDu property */
	private String chuLuZhenKongDu;

	/** zongPaiMeiLiangKgJunPin property */
	private String zongPaiMeiLiangKgJunPin;

	/** maoZhong property */
	private String maoZhong;

	/** shengChanGuZhang property */
	private String shengChanGuZhang;

	/** shengChanGuZhangJunPin property */
	private String shengChanGuZhangJunPin;

	/** diPiKg property */
	private String diPiKg;

	/** luCi property */
	private String luCi;

	/** ciYuanKgJunPin property */
	private String ciYuanKgJunPin;

	/** yuansuMn property */
	private String yuansuMn;

	/** beiZhuShuoMingJunPin property */
	private String beiZhuShuoMingJunPin;

	/** yuanSuSiJunPin property */
	private String yuanSuSiJunPin;

	/** chengPinLvJunPin property */
	private String chengPinLvJunPin;

	/** feiPaBiKg property */
	private String feiPaBiKg;

	/** feiShangMaoKgJunPin property */
	private String feiShangMaoKgJunPin;

	/** yuanSuO property */
	private String yuanSuO;

	/** yuanSuFeJunPin property */
	private String yuanSuFeJunPin;

	/** yuanSuN property */
	private String yuanSuN;

	/** jingZhong property */
	private String jingZhong;

	/** diPiKgJunPin property */
	private String diPiKgJunPin;

	/** year property */
	private String year;

	/** dengJiHanMeng property */
	private String dengJiHanMeng;

	/** shangMaoKg property */
	private String shangMaoKg;

	/** shengChanLuHao property */
	private String shengChanLuHao;

	/** jiaShouCi property */
	private String jiaShouCi;

	/** feiDiPiKgJunPin property */
	private String feiDiPiKgJunPin;

	/** zhuanZhengLiu property */
	private String zhuanZhengLiu;

	/** paBiKgJunPin property */
	private String paBiKgJunPin;

	/** zongPaiMeiLiangKg property */
	private String zongPaiMeiLiangKg;

	/** dengJiHanMengJunPin property */
	private String dengJiHanMengJunPin;

	/** zhuanZhengLiuJunPin property */
	private String zhuanZhengLiuJunPin;

	/** gongYiTiaoZhengJunPin property */
	private String gongYiTiaoZhengJunPin;

	/** yuanSuSi property */
	private String yuanSuSi;

	/** yuanZuiGaoWenDu property */
	private String yuanZuiGaoWenDu;

	/** yuanSuH property */
	private String yuanSuH;

	/** sunHaoKgJunPin property */
	private String sunHaoKgJunPin;

	/** yuanSuC property */
	private String yuanSuC;

	/** yuanSuFe property */
	private String yuanSuFe;

	/** jiaMoCi property */
	private String jiaMoCi;

	/** shouXuanFeiLiaoKgJunPin property */
	private String shouXuanFeiLiaoKgJunPin;

	/** sunHaoKg property */
	private String sunHaoKg;

	/** maoZhongJunPin property */
	private String maoZhongJunPin;

	/** feiTaiFenKg property */
	private String feiTaiFenKg;

	/** jiaShouCiJunPin property */
	private String jiaShouCiJunPin;

	/** zhengLiuGaoHengDianJunPin property */
	private String zhengLiuGaoHengDianJunPin;

	/** qiHao property */
	private String qiHao;

	/** yuanSuOJunPin property */
	private String yuanSuOJunPin;

	/** yuanSuNJunPin property */
	private String yuanSuNJunPin;

	/** month property */
	private String month;

	/** beiZhuShuoMing property */
	private String beiZhuShuoMing;

	/** shangMaoKgJunPin property */
	private String shangMaoKgJunPin;

	/** day property */
	private String day;

	/** luCiJunPin property */
	private String luCiJunPin;

	/** chengPinLv property */
	private String chengPinLv;

	/** dayJunPin property */
	private String dayJunPin;

	/** gongYiTiaoZheng property */
	private String gongYiTiaoZheng;

	/** feiTaiFenKgJunPin property */
	private String feiTaiFenKgJunPin;

	/** zhengLiuGaoHengDian property */
	private String zhengLiuGaoHengDian;

	/** fanYingQiHao property */
	private String fanYingQiHao;

	/** guiGe property */
	private String guiGe;

	/** yearMonthDayJunPin property */
	private String yearMonthDayJunPin;

	/** paBiKg property */
	private String paBiKg;

	/** shiYongCiShuJunPin property */
	private String shiYongCiShuJunPin;

	/** guiGeJunPin property */
	private String guiGeJunPin;

	/** yuanSuClJunPin property */
	private String yuanSuClJunPin;

	/** yearMonthDay property */
	private String yearMonthDay;

	/** ciYuanKg property */
	private String ciYuanKg;

	/** kaoHeDengJiChuMeng property */
	private String kaoHeDengJiChuMeng;

	/** tongDaoJunPin property */
	private String tongDaoJunPin;

	/** shengChanLuHaoJunPin property */
	private String shengChanLuHaoJunPin;

	/** yuanSuCJunPin property */
	private String yuanSuCJunPin;

	/** mg property */
	private String mg;

	/** tiCl4 property */
	private String tiCl4;

	/** fanYingQiHaoJunPin property */
	private String fanYingQiHaoJunPin;

	/** qiHaoJunPin property */
	private String qiHaoJunPin;

	/** yuanSuCl property */
	private String yuanSuCl;

	/** kaoHeDengJiChuMengJunPin property */
	private String kaoHeDengJiChuMengJunPin;

	/** tiCl4JunPin property */
	private String tiCl4JunPin;

	/** jingZhongJunPin property */
	private String jingZhongJunPin;

	/** yuanSuHb property */
	private String yuanSuHb;

	/** shiYongCiShu property */
	private String shiYongCiShu;

	/** feiPaBiKgJunPin property */
	private String feiPaBiKgJunPin;

	/** yuansuMnJunPin property */
	private String yuansuMnJunPin;

	/** yearJunPin property */
	private String yearJunPin;

	/** jiaMoCiJunPin property */
	private String jiaMoCiJunPin;

	/** gongYiShiYan property */
	private String gongYiShiYan;

	/** yuanSuHJunPin property */
	private String yuanSuHJunPin;

	/** tongDao property */
	private String tongDao;

	/** yuanSuHbJunPin property */
	private String yuanSuHbJunPin;

	/** shouXuanFeiLiaoKg property */
	private String shouXuanFeiLiaoKg;

	/** monthJunPin property */
	private String monthJunPin;

	/** feiShangMaoKg property */
	private String feiShangMaoKg;

	/** yuanZuiGaoWenDuJunPin property */
	private String yuanZuiGaoWenDuJunPin;

	/** feiDiPiKg property */
	private String feiDiPiKg;

	/** chuLuZhenKongDuJunPin property */
	private String chuLuZhenKongDuJunPin;

	/** mgJunPin property */
	private String mgJunPin;

	private String gongYiShiYanJunPin2;

	private String zongPaiMeiLiangKgJunPin2;

	private String shengChanGuZhangJunPin2;

	private String ciYuanKgJunPin2;

	private String beiZhuShuoMingJunPin2;

	private String yuanSuSiJunPin2;

	private String chengPinLvJunPin2;

	private String feiShangMaoKgJunPin2;

	private String yuanSuFeJunPin2;

	private String diPiKgJunPin2;

	private String feiDiPiKgJunPin2;

	private String paBiKgJunPin2;

	private String dengJiHanMengJunPin2;

	private String zhuanZhengLiuJunPin2;

	private String gongYiTiaoZhengJunPin2;

	private String sunHaoKgJunPin2;

	private String shouXuanFeiLiaoKgJunPin2;

	private String maoZhongJunPin2;

	private String jiaShouCiJunPin2;

	private String zhengLiuGaoHengDianJunPin2;

	private String yuanSuOJunPin2;

	private String yuanSuNJunPin2;

	private String shangMaoKgJunPin2;

	private String luCiJunPin2;

	private String dayJunPin2;

	private String feiTaiFenKgJunPin2;

	private String yearMonthDayJunPin2;

	private String shiYongCiShuJunPin2;

	private String guiGeJunPin2;

	private String yuanSuClJunPin2;

	private String tongDaoJunPin2;

	private String shengChanLuHaoJunPin2;

	private String yuanSuCJunPin2;

	private String fanYingQiHaoJunPin2;

	private String qiHaoJunPin2;

	private String kaoHeDengJiChuMengJunPin2;

	private String tiCl4JunPin2;

	private String jingZhongJunPin2;

	private String feiPaBiKgJunPin2;

	private String yuansuMnJunPin2;

	private String yearJunPin2;

	private String jiaMoCiJunPin2;

	private String yuanSuHJunPin2;

	private String yuanSuHbJunPin2;

	private String monthJunPin2;

	private String yuanZuiGaoWenDuJunPin2;

	private String chuLuZhenKongDuJunPin2;

	private String mgJunPin2;

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGongYiShiYanJunPin() {
		return gongYiShiYanJunPin;
	}

	public void setGongYiShiYanJunPin(String gongYiShiYanJunPin) {
		this.gongYiShiYanJunPin = gongYiShiYanJunPin;
	}

	public String getChuLuZhenKongDu() {
		return chuLuZhenKongDu;
	}

	public void setChuLuZhenKongDu(String chuLuZhenKongDu) {
		this.chuLuZhenKongDu = chuLuZhenKongDu;
	}

	public String getZongPaiMeiLiangKgJunPin() {
		return zongPaiMeiLiangKgJunPin;
	}

	public void setZongPaiMeiLiangKgJunPin(String zongPaiMeiLiangKgJunPin) {
		this.zongPaiMeiLiangKgJunPin = zongPaiMeiLiangKgJunPin;
	}

	public String getMaoZhong() {
		return maoZhong;
	}

	public void setMaoZhong(String maoZhong) {
		this.maoZhong = maoZhong;
	}

	public String getShengChanGuZhang() {
		return shengChanGuZhang;
	}

	public void setShengChanGuZhang(String shengChanGuZhang) {
		this.shengChanGuZhang = shengChanGuZhang;
	}

	public String getShengChanGuZhangJunPin() {
		return shengChanGuZhangJunPin;
	}

	public void setShengChanGuZhangJunPin(String shengChanGuZhangJunPin) {
		this.shengChanGuZhangJunPin = shengChanGuZhangJunPin;
	}

	public String getDiPiKg() {
		return diPiKg;
	}

	public void setDiPiKg(String diPiKg) {
		this.diPiKg = diPiKg;
	}

	public String getLuCi() {
		return luCi;
	}

	public void setLuCi(String luCi) {
		this.luCi = luCi;
	}

	public String getCiYuanKgJunPin() {
		return ciYuanKgJunPin;
	}

	public void setCiYuanKgJunPin(String ciYuanKgJunPin) {
		this.ciYuanKgJunPin = ciYuanKgJunPin;
	}

	public String getYuansuMn() {
		return yuansuMn;
	}

	public void setYuansuMn(String yuansuMn) {
		this.yuansuMn = yuansuMn;
	}

	public String getBeiZhuShuoMingJunPin() {
		return beiZhuShuoMingJunPin;
	}

	public void setBeiZhuShuoMingJunPin(String beiZhuShuoMingJunPin) {
		this.beiZhuShuoMingJunPin = beiZhuShuoMingJunPin;
	}

	public String getYuanSuSiJunPin() {
		return yuanSuSiJunPin;
	}

	public void setYuanSuSiJunPin(String yuanSuSiJunPin) {
		this.yuanSuSiJunPin = yuanSuSiJunPin;
	}

	public String getChengPinLvJunPin() {
		return chengPinLvJunPin;
	}

	public void setChengPinLvJunPin(String chengPinLvJunPin) {
		this.chengPinLvJunPin = chengPinLvJunPin;
	}

	public String getFeiPaBiKg() {
		return feiPaBiKg;
	}

	public void setFeiPaBiKg(String feiPaBiKg) {
		this.feiPaBiKg = feiPaBiKg;
	}

	public String getFeiShangMaoKgJunPin() {
		return feiShangMaoKgJunPin;
	}

	public void setFeiShangMaoKgJunPin(String feiShangMaoKgJunPin) {
		this.feiShangMaoKgJunPin = feiShangMaoKgJunPin;
	}

	public String getYuanSuO() {
		return yuanSuO;
	}

	public void setYuanSuO(String yuanSuO) {
		this.yuanSuO = yuanSuO;
	}

	public String getYuanSuFeJunPin() {
		return yuanSuFeJunPin;
	}

	public void setYuanSuFeJunPin(String yuanSuFeJunPin) {
		this.yuanSuFeJunPin = yuanSuFeJunPin;
	}

	public String getYuanSuN() {
		return yuanSuN;
	}

	public void setYuanSuN(String yuanSuN) {
		this.yuanSuN = yuanSuN;
	}

	public String getJingZhong() {
		return jingZhong;
	}

	public void setJingZhong(String jingZhong) {
		this.jingZhong = jingZhong;
	}

	public String getDiPiKgJunPin() {
		return diPiKgJunPin;
	}

	public void setDiPiKgJunPin(String diPiKgJunPin) {
		this.diPiKgJunPin = diPiKgJunPin;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDengJiHanMeng() {
		return dengJiHanMeng;
	}

	public void setDengJiHanMeng(String dengJiHanMeng) {
		this.dengJiHanMeng = dengJiHanMeng;
	}

	public String getShangMaoKg() {
		return shangMaoKg;
	}

	public void setShangMaoKg(String shangMaoKg) {
		this.shangMaoKg = shangMaoKg;
	}

	public String getShengChanLuHao() {
		return shengChanLuHao;
	}

	public void setShengChanLuHao(String shengChanLuHao) {
		this.shengChanLuHao = shengChanLuHao;
	}

	public String getJiaShouCi() {
		return jiaShouCi;
	}

	public void setJiaShouCi(String jiaShouCi) {
		this.jiaShouCi = jiaShouCi;
	}

	public String getFeiDiPiKgJunPin() {
		return feiDiPiKgJunPin;
	}

	public void setFeiDiPiKgJunPin(String feiDiPiKgJunPin) {
		this.feiDiPiKgJunPin = feiDiPiKgJunPin;
	}

	public String getZhuanZhengLiu() {
		return zhuanZhengLiu;
	}

	public void setZhuanZhengLiu(String zhuanZhengLiu) {
		this.zhuanZhengLiu = zhuanZhengLiu;
	}

	public String getPaBiKgJunPin() {
		return paBiKgJunPin;
	}

	public void setPaBiKgJunPin(String paBiKgJunPin) {
		this.paBiKgJunPin = paBiKgJunPin;
	}

	public String getZongPaiMeiLiangKg() {
		return zongPaiMeiLiangKg;
	}

	public void setZongPaiMeiLiangKg(String zongPaiMeiLiangKg) {
		this.zongPaiMeiLiangKg = zongPaiMeiLiangKg;
	}

	public String getDengJiHanMengJunPin() {
		return dengJiHanMengJunPin;
	}

	public void setDengJiHanMengJunPin(String dengJiHanMengJunPin) {
		this.dengJiHanMengJunPin = dengJiHanMengJunPin;
	}

	public String getZhuanZhengLiuJunPin() {
		return zhuanZhengLiuJunPin;
	}

	public void setZhuanZhengLiuJunPin(String zhuanZhengLiuJunPin) {
		this.zhuanZhengLiuJunPin = zhuanZhengLiuJunPin;
	}

	public String getGongYiTiaoZhengJunPin() {
		return gongYiTiaoZhengJunPin;
	}

	public void setGongYiTiaoZhengJunPin(String gongYiTiaoZhengJunPin) {
		this.gongYiTiaoZhengJunPin = gongYiTiaoZhengJunPin;
	}

	public String getYuanSuSi() {
		return yuanSuSi;
	}

	public void setYuanSuSi(String yuanSuSi) {
		this.yuanSuSi = yuanSuSi;
	}

	public String getYuanZuiGaoWenDu() {
		return yuanZuiGaoWenDu;
	}

	public void setYuanZuiGaoWenDu(String yuanZuiGaoWenDu) {
		this.yuanZuiGaoWenDu = yuanZuiGaoWenDu;
	}

	public String getYuanSuH() {
		return yuanSuH;
	}

	public void setYuanSuH(String yuanSuH) {
		this.yuanSuH = yuanSuH;
	}

	public String getSunHaoKgJunPin() {
		return sunHaoKgJunPin;
	}

	public void setSunHaoKgJunPin(String sunHaoKgJunPin) {
		this.sunHaoKgJunPin = sunHaoKgJunPin;
	}

	public String getYuanSuC() {
		return yuanSuC;
	}

	public void setYuanSuC(String yuanSuC) {
		this.yuanSuC = yuanSuC;
	}

	public String getYuanSuFe() {
		return yuanSuFe;
	}

	public void setYuanSuFe(String yuanSuFe) {
		this.yuanSuFe = yuanSuFe;
	}

	public String getJiaMoCi() {
		return jiaMoCi;
	}

	public void setJiaMoCi(String jiaMoCi) {
		this.jiaMoCi = jiaMoCi;
	}

	public String getShouXuanFeiLiaoKgJunPin() {
		return shouXuanFeiLiaoKgJunPin;
	}

	public void setShouXuanFeiLiaoKgJunPin(String shouXuanFeiLiaoKgJunPin) {
		this.shouXuanFeiLiaoKgJunPin = shouXuanFeiLiaoKgJunPin;
	}

	public String getSunHaoKg() {
		return sunHaoKg;
	}

	public void setSunHaoKg(String sunHaoKg) {
		this.sunHaoKg = sunHaoKg;
	}

	public String getMaoZhongJunPin() {
		return maoZhongJunPin;
	}

	public void setMaoZhongJunPin(String maoZhongJunPin) {
		this.maoZhongJunPin = maoZhongJunPin;
	}

	public String getFeiTaiFenKg() {
		return feiTaiFenKg;
	}

	public void setFeiTaiFenKg(String feiTaiFenKg) {
		this.feiTaiFenKg = feiTaiFenKg;
	}

	public String getJiaShouCiJunPin() {
		return jiaShouCiJunPin;
	}

	public void setJiaShouCiJunPin(String jiaShouCiJunPin) {
		this.jiaShouCiJunPin = jiaShouCiJunPin;
	}

	public String getZhengLiuGaoHengDianJunPin() {
		return zhengLiuGaoHengDianJunPin;
	}

	public void setZhengLiuGaoHengDianJunPin(String zhengLiuGaoHengDianJunPin) {
		this.zhengLiuGaoHengDianJunPin = zhengLiuGaoHengDianJunPin;
	}

	public String getQiHao() {
		return qiHao;
	}

	public void setQiHao(String qiHao) {
		this.qiHao = qiHao;
	}

	public String getYuanSuOJunPin() {
		return yuanSuOJunPin;
	}

	public void setYuanSuOJunPin(String yuanSuOJunPin) {
		this.yuanSuOJunPin = yuanSuOJunPin;
	}

	public String getYuanSuNJunPin() {
		return yuanSuNJunPin;
	}

	public void setYuanSuNJunPin(String yuanSuNJunPin) {
		this.yuanSuNJunPin = yuanSuNJunPin;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getBeiZhuShuoMing() {
		return beiZhuShuoMing;
	}

	public void setBeiZhuShuoMing(String beiZhuShuoMing) {
		this.beiZhuShuoMing = beiZhuShuoMing;
	}

	public String getShangMaoKgJunPin() {
		return shangMaoKgJunPin;
	}

	public void setShangMaoKgJunPin(String shangMaoKgJunPin) {
		this.shangMaoKgJunPin = shangMaoKgJunPin;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getLuCiJunPin() {
		return luCiJunPin;
	}

	public void setLuCiJunPin(String luCiJunPin) {
		this.luCiJunPin = luCiJunPin;
	}

	public String getChengPinLv() {
		return chengPinLv;
	}

	public void setChengPinLv(String chengPinLv) {
		this.chengPinLv = chengPinLv;
	}

	public String getDayJunPin() {
		return dayJunPin;
	}

	public void setDayJunPin(String dayJunPin) {
		this.dayJunPin = dayJunPin;
	}

	public String getGongYiTiaoZheng() {
		return gongYiTiaoZheng;
	}

	public void setGongYiTiaoZheng(String gongYiTiaoZheng) {
		this.gongYiTiaoZheng = gongYiTiaoZheng;
	}

	public String getFeiTaiFenKgJunPin() {
		return feiTaiFenKgJunPin;
	}

	public void setFeiTaiFenKgJunPin(String feiTaiFenKgJunPin) {
		this.feiTaiFenKgJunPin = feiTaiFenKgJunPin;
	}

	public String getZhengLiuGaoHengDian() {
		return zhengLiuGaoHengDian;
	}

	public void setZhengLiuGaoHengDian(String zhengLiuGaoHengDian) {
		this.zhengLiuGaoHengDian = zhengLiuGaoHengDian;
	}

	public String getFanYingQiHao() {
		return fanYingQiHao;
	}

	public void setFanYingQiHao(String fanYingQiHao) {
		this.fanYingQiHao = fanYingQiHao;
	}

	public String getGuiGe() {
		return guiGe;
	}

	public void setGuiGe(String guiGe) {
		this.guiGe = guiGe;
	}

	public String getYearMonthDayJunPin() {
		return yearMonthDayJunPin;
	}

	public void setYearMonthDayJunPin(String yearMonthDayJunPin) {
		this.yearMonthDayJunPin = yearMonthDayJunPin;
	}

	public String getPaBiKg() {
		return paBiKg;
	}

	public void setPaBiKg(String paBiKg) {
		this.paBiKg = paBiKg;
	}

	public String getShiYongCiShuJunPin() {
		return shiYongCiShuJunPin;
	}

	public void setShiYongCiShuJunPin(String shiYongCiShuJunPin) {
		this.shiYongCiShuJunPin = shiYongCiShuJunPin;
	}

	public String getGuiGeJunPin() {
		return guiGeJunPin;
	}

	public void setGuiGeJunPin(String guiGeJunPin) {
		this.guiGeJunPin = guiGeJunPin;
	}

	public String getYuanSuClJunPin() {
		return yuanSuClJunPin;
	}

	public void setYuanSuClJunPin(String yuanSuClJunPin) {
		this.yuanSuClJunPin = yuanSuClJunPin;
	}

	public String getYearMonthDay() {
		return yearMonthDay;
	}

	public void setYearMonthDay(String yearMonthDay) {
		this.yearMonthDay = yearMonthDay;
	}

	public String getCiYuanKg() {
		return ciYuanKg;
	}

	public void setCiYuanKg(String ciYuanKg) {
		this.ciYuanKg = ciYuanKg;
	}

	public String getKaoHeDengJiChuMeng() {
		return kaoHeDengJiChuMeng;
	}

	public void setKaoHeDengJiChuMeng(String kaoHeDengJiChuMeng) {
		this.kaoHeDengJiChuMeng = kaoHeDengJiChuMeng;
	}

	public String getTongDaoJunPin() {
		return tongDaoJunPin;
	}

	public void setTongDaoJunPin(String tongDaoJunPin) {
		this.tongDaoJunPin = tongDaoJunPin;
	}

	public String getShengChanLuHaoJunPin() {
		return shengChanLuHaoJunPin;
	}

	public void setShengChanLuHaoJunPin(String shengChanLuHaoJunPin) {
		this.shengChanLuHaoJunPin = shengChanLuHaoJunPin;
	}

	public String getYuanSuCJunPin() {
		return yuanSuCJunPin;
	}

	public void setYuanSuCJunPin(String yuanSuCJunPin) {
		this.yuanSuCJunPin = yuanSuCJunPin;
	}

	public String getMg() {
		return mg;
	}

	public void setMg(String mg) {
		this.mg = mg;
	}

	public String getTiCl4() {
		return tiCl4;
	}

	public void setTiCl4(String tiCl4) {
		this.tiCl4 = tiCl4;
	}

	public String getFanYingQiHaoJunPin() {
		return fanYingQiHaoJunPin;
	}

	public void setFanYingQiHaoJunPin(String fanYingQiHaoJunPin) {
		this.fanYingQiHaoJunPin = fanYingQiHaoJunPin;
	}

	public String getQiHaoJunPin() {
		return qiHaoJunPin;
	}

	public void setQiHaoJunPin(String qiHaoJunPin) {
		this.qiHaoJunPin = qiHaoJunPin;
	}

	public String getYuanSuCl() {
		return yuanSuCl;
	}

	public void setYuanSuCl(String yuanSuCl) {
		this.yuanSuCl = yuanSuCl;
	}

	public String getKaoHeDengJiChuMengJunPin() {
		return kaoHeDengJiChuMengJunPin;
	}

	public void setKaoHeDengJiChuMengJunPin(String kaoHeDengJiChuMengJunPin) {
		this.kaoHeDengJiChuMengJunPin = kaoHeDengJiChuMengJunPin;
	}

	public String getTiCl4JunPin() {
		return tiCl4JunPin;
	}

	public void setTiCl4JunPin(String tiCl4JunPin) {
		this.tiCl4JunPin = tiCl4JunPin;
	}

	public String getJingZhongJunPin() {
		return jingZhongJunPin;
	}

	public void setJingZhongJunPin(String jingZhongJunPin) {
		this.jingZhongJunPin = jingZhongJunPin;
	}

	public String getYuanSuHb() {
		return yuanSuHb;
	}

	public void setYuanSuHb(String yuanSuHb) {
		this.yuanSuHb = yuanSuHb;
	}

	public String getShiYongCiShu() {
		return shiYongCiShu;
	}

	public void setShiYongCiShu(String shiYongCiShu) {
		this.shiYongCiShu = shiYongCiShu;
	}

	public String getFeiPaBiKgJunPin() {
		return feiPaBiKgJunPin;
	}

	public void setFeiPaBiKgJunPin(String feiPaBiKgJunPin) {
		this.feiPaBiKgJunPin = feiPaBiKgJunPin;
	}

	public String getYuansuMnJunPin() {
		return yuansuMnJunPin;
	}

	public void setYuansuMnJunPin(String yuansuMnJunPin) {
		this.yuansuMnJunPin = yuansuMnJunPin;
	}

	public String getYearJunPin() {
		return yearJunPin;
	}

	public void setYearJunPin(String yearJunPin) {
		this.yearJunPin = yearJunPin;
	}

	public String getJiaMoCiJunPin() {
		return jiaMoCiJunPin;
	}

	public void setJiaMoCiJunPin(String jiaMoCiJunPin) {
		this.jiaMoCiJunPin = jiaMoCiJunPin;
	}

	public String getGongYiShiYan() {
		return gongYiShiYan;
	}

	public void setGongYiShiYan(String gongYiShiYan) {
		this.gongYiShiYan = gongYiShiYan;
	}

	public String getYuanSuHJunPin() {
		return yuanSuHJunPin;
	}

	public void setYuanSuHJunPin(String yuanSuHJunPin) {
		this.yuanSuHJunPin = yuanSuHJunPin;
	}

	public String getTongDao() {
		return tongDao;
	}

	public void setTongDao(String tongDao) {
		this.tongDao = tongDao;
	}

	public String getYuanSuHbJunPin() {
		return yuanSuHbJunPin;
	}

	public void setYuanSuHbJunPin(String yuanSuHbJunPin) {
		this.yuanSuHbJunPin = yuanSuHbJunPin;
	}

	public String getShouXuanFeiLiaoKg() {
		return shouXuanFeiLiaoKg;
	}

	public void setShouXuanFeiLiaoKg(String shouXuanFeiLiaoKg) {
		this.shouXuanFeiLiaoKg = shouXuanFeiLiaoKg;
	}

	public String getMonthJunPin() {
		return monthJunPin;
	}

	public void setMonthJunPin(String monthJunPin) {
		this.monthJunPin = monthJunPin;
	}

	public String getFeiShangMaoKg() {
		return feiShangMaoKg;
	}

	public void setFeiShangMaoKg(String feiShangMaoKg) {
		this.feiShangMaoKg = feiShangMaoKg;
	}

	public String getYuanZuiGaoWenDuJunPin() {
		return yuanZuiGaoWenDuJunPin;
	}

	public void setYuanZuiGaoWenDuJunPin(String yuanZuiGaoWenDuJunPin) {
		this.yuanZuiGaoWenDuJunPin = yuanZuiGaoWenDuJunPin;
	}

	public String getFeiDiPiKg() {
		return feiDiPiKg;
	}

	public void setFeiDiPiKg(String feiDiPiKg) {
		this.feiDiPiKg = feiDiPiKg;
	}

	public String getChuLuZhenKongDuJunPin() {
		return chuLuZhenKongDuJunPin;
	}

	public void setChuLuZhenKongDuJunPin(String chuLuZhenKongDuJunPin) {
		this.chuLuZhenKongDuJunPin = chuLuZhenKongDuJunPin;
	}

	public String getMgJunPin() {
		return mgJunPin;
	}

	public void setMgJunPin(String mgJunPin) {
		this.mgJunPin = mgJunPin;
	}

	public String getGongYiShiYanJunPin2() {
		return gongYiShiYanJunPin2;
	}

	public void setGongYiShiYanJunPin2(String gongYiShiYanJunPin2) {
		this.gongYiShiYanJunPin2 = gongYiShiYanJunPin2;
	}

	public String getZongPaiMeiLiangKgJunPin2() {
		return zongPaiMeiLiangKgJunPin2;
	}

	public void setZongPaiMeiLiangKgJunPin2(String zongPaiMeiLiangKgJunPin2) {
		this.zongPaiMeiLiangKgJunPin2 = zongPaiMeiLiangKgJunPin2;
	}

	public String getShengChanGuZhangJunPin2() {
		return shengChanGuZhangJunPin2;
	}

	public void setShengChanGuZhangJunPin2(String shengChanGuZhangJunPin2) {
		this.shengChanGuZhangJunPin2 = shengChanGuZhangJunPin2;
	}

	public String getCiYuanKgJunPin2() {
		return ciYuanKgJunPin2;
	}

	public void setCiYuanKgJunPin2(String ciYuanKgJunPin2) {
		this.ciYuanKgJunPin2 = ciYuanKgJunPin2;
	}

	public String getBeiZhuShuoMingJunPin2() {
		return beiZhuShuoMingJunPin2;
	}

	public void setBeiZhuShuoMingJunPin2(String beiZhuShuoMingJunPin2) {
		this.beiZhuShuoMingJunPin2 = beiZhuShuoMingJunPin2;
	}

	public String getYuanSuSiJunPin2() {
		return yuanSuSiJunPin2;
	}

	public void setYuanSuSiJunPin2(String yuanSuSiJunPin2) {
		this.yuanSuSiJunPin2 = yuanSuSiJunPin2;
	}

	public String getChengPinLvJunPin2() {
		return chengPinLvJunPin2;
	}

	public void setChengPinLvJunPin2(String chengPinLvJunPin2) {
		this.chengPinLvJunPin2 = chengPinLvJunPin2;
	}

	public String getFeiShangMaoKgJunPin2() {
		return feiShangMaoKgJunPin2;
	}

	public void setFeiShangMaoKgJunPin2(String feiShangMaoKgJunPin2) {
		this.feiShangMaoKgJunPin2 = feiShangMaoKgJunPin2;
	}

	public String getYuanSuFeJunPin2() {
		return yuanSuFeJunPin2;
	}

	public void setYuanSuFeJunPin2(String yuanSuFeJunPin2) {
		this.yuanSuFeJunPin2 = yuanSuFeJunPin2;
	}

	public String getDiPiKgJunPin2() {
		return diPiKgJunPin2;
	}

	public void setDiPiKgJunPin2(String diPiKgJunPin2) {
		this.diPiKgJunPin2 = diPiKgJunPin2;
	}

	public String getFeiDiPiKgJunPin2() {
		return feiDiPiKgJunPin2;
	}

	public void setFeiDiPiKgJunPin2(String feiDiPiKgJunPin2) {
		this.feiDiPiKgJunPin2 = feiDiPiKgJunPin2;
	}

	public String getPaBiKgJunPin2() {
		return paBiKgJunPin2;
	}

	public void setPaBiKgJunPin2(String paBiKgJunPin2) {
		this.paBiKgJunPin2 = paBiKgJunPin2;
	}

	public String getDengJiHanMengJunPin2() {
		return dengJiHanMengJunPin2;
	}

	public void setDengJiHanMengJunPin2(String dengJiHanMengJunPin2) {
		this.dengJiHanMengJunPin2 = dengJiHanMengJunPin2;
	}

	public String getZhuanZhengLiuJunPin2() {
		return zhuanZhengLiuJunPin2;
	}

	public void setZhuanZhengLiuJunPin2(String zhuanZhengLiuJunPin2) {
		this.zhuanZhengLiuJunPin2 = zhuanZhengLiuJunPin2;
	}

	public String getGongYiTiaoZhengJunPin2() {
		return gongYiTiaoZhengJunPin2;
	}

	public void setGongYiTiaoZhengJunPin2(String gongYiTiaoZhengJunPin2) {
		this.gongYiTiaoZhengJunPin2 = gongYiTiaoZhengJunPin2;
	}

	public String getSunHaoKgJunPin2() {
		return sunHaoKgJunPin2;
	}

	public void setSunHaoKgJunPin2(String sunHaoKgJunPin2) {
		this.sunHaoKgJunPin2 = sunHaoKgJunPin2;
	}

	public String getShouXuanFeiLiaoKgJunPin2() {
		return shouXuanFeiLiaoKgJunPin2;
	}

	public void setShouXuanFeiLiaoKgJunPin2(String shouXuanFeiLiaoKgJunPin2) {
		this.shouXuanFeiLiaoKgJunPin2 = shouXuanFeiLiaoKgJunPin2;
	}

	public String getMaoZhongJunPin2() {
		return maoZhongJunPin2;
	}

	public void setMaoZhongJunPin2(String maoZhongJunPin2) {
		this.maoZhongJunPin2 = maoZhongJunPin2;
	}

	public String getJiaShouCiJunPin2() {
		return jiaShouCiJunPin2;
	}

	public void setJiaShouCiJunPin2(String jiaShouCiJunPin2) {
		this.jiaShouCiJunPin2 = jiaShouCiJunPin2;
	}

	public String getZhengLiuGaoHengDianJunPin2() {
		return zhengLiuGaoHengDianJunPin2;
	}

	public void setZhengLiuGaoHengDianJunPin2(String zhengLiuGaoHengDianJunPin2) {
		this.zhengLiuGaoHengDianJunPin2 = zhengLiuGaoHengDianJunPin2;
	}

	public String getYuanSuOJunPin2() {
		return yuanSuOJunPin2;
	}

	public void setYuanSuOJunPin2(String yuanSuOJunPin2) {
		this.yuanSuOJunPin2 = yuanSuOJunPin2;
	}

	public String getYuanSuNJunPin2() {
		return yuanSuNJunPin2;
	}

	public void setYuanSuNJunPin2(String yuanSuNJunPin2) {
		this.yuanSuNJunPin2 = yuanSuNJunPin2;
	}

	public String getShangMaoKgJunPin2() {
		return shangMaoKgJunPin2;
	}

	public void setShangMaoKgJunPin2(String shangMaoKgJunPin2) {
		this.shangMaoKgJunPin2 = shangMaoKgJunPin2;
	}

	public String getLuCiJunPin2() {
		return luCiJunPin2;
	}

	public void setLuCiJunPin2(String luCiJunPin2) {
		this.luCiJunPin2 = luCiJunPin2;
	}

	public String getDayJunPin2() {
		return dayJunPin2;
	}

	public void setDayJunPin2(String dayJunPin2) {
		this.dayJunPin2 = dayJunPin2;
	}

	public String getFeiTaiFenKgJunPin2() {
		return feiTaiFenKgJunPin2;
	}

	public void setFeiTaiFenKgJunPin2(String feiTaiFenKgJunPin2) {
		this.feiTaiFenKgJunPin2 = feiTaiFenKgJunPin2;
	}

	public String getYearMonthDayJunPin2() {
		return yearMonthDayJunPin2;
	}

	public void setYearMonthDayJunPin2(String yearMonthDayJunPin2) {
		this.yearMonthDayJunPin2 = yearMonthDayJunPin2;
	}

	public String getShiYongCiShuJunPin2() {
		return shiYongCiShuJunPin2;
	}

	public void setShiYongCiShuJunPin2(String shiYongCiShuJunPin2) {
		this.shiYongCiShuJunPin2 = shiYongCiShuJunPin2;
	}

	public String getGuiGeJunPin2() {
		return guiGeJunPin2;
	}

	public void setGuiGeJunPin2(String guiGeJunPin2) {
		this.guiGeJunPin2 = guiGeJunPin2;
	}

	public String getYuanSuClJunPin2() {
		return yuanSuClJunPin2;
	}

	public void setYuanSuClJunPin2(String yuanSuClJunPin2) {
		this.yuanSuClJunPin2 = yuanSuClJunPin2;
	}

	public String getTongDaoJunPin2() {
		return tongDaoJunPin2;
	}

	public void setTongDaoJunPin2(String tongDaoJunPin2) {
		this.tongDaoJunPin2 = tongDaoJunPin2;
	}

	public String getShengChanLuHaoJunPin2() {
		return shengChanLuHaoJunPin2;
	}

	public void setShengChanLuHaoJunPin2(String shengChanLuHaoJunPin2) {
		this.shengChanLuHaoJunPin2 = shengChanLuHaoJunPin2;
	}

	public String getYuanSuCJunPin2() {
		return yuanSuCJunPin2;
	}

	public void setYuanSuCJunPin2(String yuanSuCJunPin2) {
		this.yuanSuCJunPin2 = yuanSuCJunPin2;
	}

	public String getFanYingQiHaoJunPin2() {
		return fanYingQiHaoJunPin2;
	}

	public void setFanYingQiHaoJunPin2(String fanYingQiHaoJunPin2) {
		this.fanYingQiHaoJunPin2 = fanYingQiHaoJunPin2;
	}

	public String getQiHaoJunPin2() {
		return qiHaoJunPin2;
	}

	public void setQiHaoJunPin2(String qiHaoJunPin2) {
		this.qiHaoJunPin2 = qiHaoJunPin2;
	}

	public String getKaoHeDengJiChuMengJunPin2() {
		return kaoHeDengJiChuMengJunPin2;
	}

	public void setKaoHeDengJiChuMengJunPin2(String kaoHeDengJiChuMengJunPin2) {
		this.kaoHeDengJiChuMengJunPin2 = kaoHeDengJiChuMengJunPin2;
	}

	public String getTiCl4JunPin2() {
		return tiCl4JunPin2;
	}

	public void setTiCl4JunPin2(String tiCl4JunPin2) {
		this.tiCl4JunPin2 = tiCl4JunPin2;
	}

	public String getJingZhongJunPin2() {
		return jingZhongJunPin2;
	}

	public void setJingZhongJunPin2(String jingZhongJunPin2) {
		this.jingZhongJunPin2 = jingZhongJunPin2;
	}

	public String getFeiPaBiKgJunPin2() {
		return feiPaBiKgJunPin2;
	}

	public void setFeiPaBiKgJunPin2(String feiPaBiKgJunPin2) {
		this.feiPaBiKgJunPin2 = feiPaBiKgJunPin2;
	}

	public String getYuansuMnJunPin2() {
		return yuansuMnJunPin2;
	}

	public void setYuansuMnJunPin2(String yuansuMnJunPin2) {
		this.yuansuMnJunPin2 = yuansuMnJunPin2;
	}

	public String getYearJunPin2() {
		return yearJunPin2;
	}

	public void setYearJunPin2(String yearJunPin2) {
		this.yearJunPin2 = yearJunPin2;
	}

	public String getJiaMoCiJunPin2() {
		return jiaMoCiJunPin2;
	}

	public void setJiaMoCiJunPin2(String jiaMoCiJunPin2) {
		this.jiaMoCiJunPin2 = jiaMoCiJunPin2;
	}

	public String getYuanSuHJunPin2() {
		return yuanSuHJunPin2;
	}

	public void setYuanSuHJunPin2(String yuanSuHJunPin2) {
		this.yuanSuHJunPin2 = yuanSuHJunPin2;
	}

	public String getYuanSuHbJunPin2() {
		return yuanSuHbJunPin2;
	}

	public void setYuanSuHbJunPin2(String yuanSuHbJunPin2) {
		this.yuanSuHbJunPin2 = yuanSuHbJunPin2;
	}

	public String getMonthJunPin2() {
		return monthJunPin2;
	}

	public void setMonthJunPin2(String monthJunPin2) {
		this.monthJunPin2 = monthJunPin2;
	}

	public String getYuanZuiGaoWenDuJunPin2() {
		return yuanZuiGaoWenDuJunPin2;
	}

	public void setYuanZuiGaoWenDuJunPin2(String yuanZuiGaoWenDuJunPin2) {
		this.yuanZuiGaoWenDuJunPin2 = yuanZuiGaoWenDuJunPin2;
	}

	public String getChuLuZhenKongDuJunPin2() {
		return chuLuZhenKongDuJunPin2;
	}

	public void setChuLuZhenKongDuJunPin2(String chuLuZhenKongDuJunPin2) {
		this.chuLuZhenKongDuJunPin2 = chuLuZhenKongDuJunPin2;
	}

	public String getMgJunPin2() {
		return mgJunPin2;
	}

	public void setMgJunPin2(String mgJunPin2) {
		this.mgJunPin2 = mgJunPin2;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}
}