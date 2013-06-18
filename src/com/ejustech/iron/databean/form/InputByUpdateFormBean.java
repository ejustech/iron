package com.ejustech.iron.databean.form;

import com.ejustech.iron.common.StringHelper;

public class InputByUpdateFormBean {
	/** 备注说明 */
	private String beiZhuShuoMing;
	
	/** 备注说明 */
	private String beiZhuShuoMingJunPin1;

	/** 备注说明 */
	private String beiZhuShuoMingJunPin2;

	/** 成品率 */
	private String chengPinLv;
	/** 成品率 */
	private String chengPinLvJunPin1;

	/** 成品率 */
	private String chengPinLvJunPin2;

	/** 出炉真空度Pa */
	private String chuLuZhenKongDu;

	/** 出炉真空度Pa */
	private String chuLuZhenKongDuJunPin1;

	/** 出炉真空度Pa */
	private String chuLuZhenKongDuJunPin2;

	/** 磁选Kg */
	private String ciYuanKg;

	/** 磁选Kg */
	private String ciYuanKgJunPin1;

	/** 磁选Kg */
	private String ciYuanKgJunPin2;

	/** 等级(含锰) */
	private String dengJiHanMeng;

	/** 等级JunPin1(含锰) */
	private String dengJiHanMengJunPin1;

	/** 等级JunPin2(含锰) */
	private String dengJiHanMengJunPin2;

	/** 底皮Kg */
	private String diPiKg;

	/** 底皮Kg */
	private String diPiKgJunPin1;

	/** 底皮Kg */
	private String diPiKgJunPin2;

	/** 反应器号 */
	private String fanYingQiHao;

	/** 反应器号 */
	private String fanYingQiHaoJunPin1;

	/** 反应器号 */
	private String fanYingQiHaoJunPin2;

	/** 废底皮Kg */
	private String feiDiPiKg;

	/** 废底皮Kg */
	private String feiDiPiKgJunPin1;

	/** 废底皮Kg */
	private String feiDiPiKgJunPin2;

	/** 废爬壁Kg */
	private String feiPaBiKg;

	/** 废爬壁Kg */
	private String feiPaBiKgJunPin1;

	/** 废爬壁Kg */
	private String feiPaBiKgJunPin2;

	/** 废上帽Kg */
	private String feiShangMaoKg;

	/** 废上帽Kg */
	private String feiShangMaoKgJunPin1;

	/** 废上帽Kg */
	private String feiShangMaoKgJunPin2;

	/** 废钛粉Kg */
	private String feiTaiFenKg;

	/** 废钛粉Kg */
	private String feiTaiFenKgJunPin1;

	/** 废钛粉Kg */
	private String feiTaiFenKgJunPin2;

	/** 工艺试验 */
	private String gongYiShiYan;

	/** 工艺试验 */
	private String gongYiShiYanJunPin1;

	/** 工艺试验 */
	private String gongYiShiYanJunPin2;

	/** 工艺调整 */
	private String gongYiTiaoZheng;

	/** 工艺调整 */
	private String gongYiTiaoZhengJunPin1;

	/** 工艺调整 */
	private String gongYiTiaoZhengJunPin2;

	/** 规格 */
	private String guiGe;

	/** 规格 */
	private String guiGeJunPin1;

	/** 规格 */
	private String guiGeJunPin2;

	private String id;

	/** 加末次 */
	private String jiaMoCi;

	/** 加末次 */
	private String jiaMoCiJunPin1;

	/** 加末次 */
	private String jiaMoCiJunPin2;

	/** 加首次 */
	private String jiaShouCi;

	/** 加首次 */
	private String jiaShouCiJunPin1;

	/** 加首次 */
	private String jiaShouCiJunPin2;

	/** 净重 */
	private String jingZhong;

	/** 净重 */
	private String jingZhongJunPin1;

	/** 净重 */
	private String jingZhongJunPin2;

	/** 军品 */
	private String junPin;

	/** 考核等级(除锰) */
	private String kaoHeDengJiChuMeng;

	/** 考核等级JunPin1(除锰) */
	private String kaoHeDengJiChuMengJunPin1;

	/** 考核等级JunPin2(除锰) */
	private String kaoHeDengJiChuMengJunPin2;

	/** 炉次 */
	private String luCi;

	/** 炉次 */
	private String luCiJunPin1;

	/** 炉次 */
	private String luCiJunPin2;

	/** 毛重 */
	private String maoZhong;

	/** 毛重 */
	private String maoZhongJunPin1;

	/** 毛重 */
	private String maoZhongJunPin2;

	/** Mg（t） */
	private String mg;

	/** Mg（t） */
	private String mgJunPin1;

	/** Mg（t） */
	private String mgJunPin2;

	/** 爬壁Kg */
	private String paBiKg;

	/** 爬壁Kg */
	private String paBiKgJunPin1;

	/** 爬壁Kg */
	private String paBiKgJunPin2;

	/** 期号 */
	private String qiHao;

	/** 期号 */
	private String qiHaoJunPin1;

	/** 期号 */
	private String qiHaoJunPin2;

	/** 输入或更新数据的用户权限 */
	private String roleRank;

	/** 上帽Kg */
	private String shangMaoKg;

	/** 上帽Kg */
	private String shangMaoKgJunPin1;

	/** 上帽Kg */
	private String shangMaoKgJunPin2;

	/** 生产故障 */
	private String shengChanGuZhang;

	/** 生产故障 */
	private String shengChanGuZhangJunPin1;

	/** 生产故障 */
	private String shengChanGuZhangJunPin2;

	/** 生产炉号 */
	private String shengChanLuHao;

	/** 生产炉号 */
	private String shengChanLuHaoJunPin1;

	/** 生产炉号 */
	private String shengChanLuHaoJunPin2;

	/** 使用次数 */
	private String shiYongCiShu;

	/** 使用次数 */
	private String shiYongCiShuJunPin1;

	/** 使用次数 */
	private String shiYongCiShuJunPin2;

	/** 手选废料Kg */
	private String shouXuanFeiLiaoKg;

	/** 手选废料Kg */
	private String shouXuanFeiLiaoKgJunPin1;

	/** 手选废料Kg */
	private String shouXuanFeiLiaoKgJunPin2;

	/** 损耗Kg */
	private String sunHaoKg;

	/** 损耗Kg */
	private String sunHaoKgJunPin1;

	/** 损耗Kg */
	private String sunHaoKgJunPin2;

	/** TiCl4 */
	private String tiCl4;

	/** TiCl4 */
	private String tiCl4JunPin1;

	/** TiCl4 */
	private String tiCl4JunPin2;

	/** 通道 */
	private String tongDao;

	/** 通道 */
	private String tongDaoJunPin1;

	/** 通道 */
	private String tongDaoJunPin2;

	/** 输入或更新完毕标志 */
	private String updateFlg;

	/** 年月日 */
	private String yearMonthDay;

	/** 年月日 */
	private String yearMonthDayJunPin1;

	/** 年月日 */
	private String yearMonthDayJunPin2;

	/** 元素C */
	private String yuanSuC;

	/** 元素C */
	private String yuanSuCJunPin1;

	/** 元素C */
	private String yuanSuCJunPin2;

	/** 元素Cl */
	private String yuanSuCl;

	/** 元素Cl */
	private String yuanSuClJunPin1;

	/** 元素Cl */
	private String yuanSuClJunPin2;

	/** 元素Fe */
	private String yuanSuFe;

	/** 元素Fe */
	private String yuanSuFeJunPin1;

	/** 元素Fe */
	private String yuanSuFeJunPin2;

	/** 元素H */
	private String yuanSuH;

	/** 元素HB */
	private String yuanSuHb;

	/** 元素HB */
	private String yuanSuHbJunPin1;

	/** 元素HB */
	private String yuanSuHbJunPin2;

	/** 元素H */
	private String yuanSuHJunPin1;

	/** 元素H */
	private String yuanSuHJunPin2;

	/** 元素Mn */
	private String yuanSuMn;

	/** 元素Mn */
	private String yuanSuMnJunPin1;

	/** 元素Mn */
	private String yuanSuMnJunPin2;

	/** 元素N */
	private String yuanSuN;

	/** 元素N */
	private String yuanSuNJunPin1;

	/** 元素N */
	private String yuanSuNJunPin2;

	/** 元素O */
	private String yuanSuO;

	/** 元素O */
	private String yuanSuOJunPin1;

	/** 元素O */
	private String yuanSuOJunPin2;

	/** 元素Si */
	private String yuanSuSi;

	/** 元素Si */
	private String yuanSuSiJunPin1;

	/** 元素Si */
	private String yuanSuSiJunPin2;

	/** 还原最高温度℃ */
	private String yuanZuiGaoWenDu;

	/** 还原最高温度℃ */
	private String yuanZuiGaoWenDuJunPin1;

	/** 还原最高温度℃ */
	private String yuanZuiGaoWenDuJunPin2;

	/** 蒸馏高恒A点最高℃ */
	private String zhengLiuGaoHengDian;

	/** 蒸馏高恒A点最高℃ */
	private String zhengLiuGaoHengDianJunPin1;

	/** 蒸馏高恒A点最高℃ */
	private String zhengLiuGaoHengDianJunPin2;

	/** 转蒸馏 */
	private String zhuanZhengLiu;

	/** 转蒸馏 */
	private String zhuanZhengLiuJunPin1;

	/** 转蒸馏 */
	private String zhuanZhengLiuJunPin2;

	/** 总排镁量Kg */
	private String zongPaiMeiLiangKg;

	/** 总排镁量Kg */
	private String zongPaiMeiLiangKgJunPin1;

	/** 总排镁量Kg */
	private String zongPaiMeiLiangKgJunPin2;

	/**
	 * @return 备注说明
	 */
	public String getBeiZhuShuoMing() {
		return StringHelper.null2Empty(beiZhuShuoMing);
	}

	/**
	 * @return 备注说明
	 */
	public String getBeiZhuShuoMingJunPin1() {
		return StringHelper.null2Empty(beiZhuShuoMingJunPin1);
	}
	
	/**
	 * @return 备注说明
	 */
	public String getBeiZhuShuoMingJunPin2() {
		return StringHelper.null2Empty(beiZhuShuoMingJunPin2);
	}
	
	/**
	 * @return 成品率
	 */
	public String getChengPinLv() {
		return StringHelper.null2Empty(chengPinLv);
	}

	/**
	 * @return 成品率
	 */
	public String getChengPinLvJunPin1() {
		return StringHelper.null2Empty(chengPinLvJunPin1);
	}

	/**
	 * @return 成品率
	 */
	public String getChengPinLvJunPin2() {
		return StringHelper.null2Empty(chengPinLvJunPin2);
	}

	/**
	 * @return the 出炉真空度Pa
	 */
	public String getChuLuZhenKongDu() {
		return StringHelper.null2Empty(chuLuZhenKongDu);
	}

	/**
	 * @return the 出炉真空度Pa
	 */
	public String getChuLuZhenKongDuJunPin1() {
		return StringHelper.null2Empty(chuLuZhenKongDuJunPin1);
	}

	/**
	 * @return the 出炉真空度Pa
	 */
	public String getChuLuZhenKongDuJunPin2() {
		return StringHelper.null2Empty(chuLuZhenKongDuJunPin2);
	}

	/**
	 * @return 磁选Kg
	 */
	public String getCiYuanKg() {
		return StringHelper.null2Empty(ciYuanKg);
	}

	/**
	 * @return 磁选Kg
	 */
	public String getCiYuanKgJunPin1() {
		return StringHelper.null2Empty(ciYuanKgJunPin1);
	}

	/**
	 * @return 磁选Kg
	 */
	public String getCiYuanKgJunPin2() {
		return StringHelper.null2Empty(ciYuanKgJunPin2);
	}

	/**
	 * @return 等级(含锰)
	 */
	public String getDengJiHanMeng() {
		return StringHelper.null2Empty(dengJiHanMeng);
	}

	/**
	 * @return 等级JunPin1(含锰)
	 */
	public String getDengJiHanMengJunPin1() {
		return StringHelper.null2Empty(dengJiHanMengJunPin1);
	}

	/**
	 * @return 等级JunPin2(含锰)
	 */
	public String getDengJiHanMengJunPin2() {
		return StringHelper.null2Empty(dengJiHanMengJunPin2);
	}

	/**
	 * @return 底皮Kg
	 */
	public String getDiPiKg() {
		return StringHelper.null2Empty(diPiKg);
	}

	/**
	 * @return 底皮Kg
	 */
	public String getDiPiKgJunPin1() {
		return StringHelper.null2Empty(diPiKgJunPin1);
	}

	/**
	 * @return 底皮Kg
	 */
	public String getDiPiKgJunPin2() {
		return StringHelper.null2Empty(diPiKgJunPin2);
	}

	/**
	 * @return 反应器号
	 */
	public String getFanYingQiHao() {
		return StringHelper.null2Empty(fanYingQiHao);
	}

	/**
	 * @return 反应器号
	 */
	public String getFanYingQiHaoJunPin1() {
		return StringHelper.null2Empty(fanYingQiHaoJunPin1);
	}

	/**
	 * @return 反应器号
	 */
	public String getFanYingQiHaoJunPin2() {
		return StringHelper.null2Empty(fanYingQiHaoJunPin2);
	}

	/**
	 * @return 废底皮Kg
	 */
	public String getFeiDiPiKg() {
		return StringHelper.null2Empty(feiDiPiKg);
	}

	/**
	 * @return 废底皮Kg
	 */
	public String getFeiDiPiKgJunPin1() {
		return StringHelper.null2Empty(feiDiPiKgJunPin1);
	}

	/**
	 * @return 废底皮Kg
	 */
	public String getFeiDiPiKgJunPin2() {
		return StringHelper.null2Empty(feiDiPiKgJunPin2);
	}

	/**
	 * @return 废爬壁Kg
	 */
	public String getFeiPaBiKg() {
		return StringHelper.null2Empty(feiPaBiKg);
	}

	/**
	 * @return 废爬壁Kg
	 */
	public String getFeiPaBiKgJunPin1() {
		return StringHelper.null2Empty(feiPaBiKgJunPin1);
	}

	/**
	 * @return 废爬壁Kg
	 */
	public String getFeiPaBiKgJunPin2() {
		return StringHelper.null2Empty(feiPaBiKgJunPin2);
	}

	/**
	 * @return 废上帽Kg
	 */
	public String getFeiShangMaoKg() {
		return StringHelper.null2Empty(feiShangMaoKg);
	}

	/**
	 * @return 废上帽Kg
	 */
	public String getFeiShangMaoKgJunPin1() {
		return StringHelper.null2Empty(feiShangMaoKgJunPin1);
	}

	/**
	 * @return 废上帽Kg
	 */
	public String getFeiShangMaoKgJunPin2() {
		return StringHelper.null2Empty(feiShangMaoKgJunPin2);
	}

	/**
	 * @return 废钛粉Kg
	 */
	public String getFeiTaiFenKg() {
		return StringHelper.null2Empty(feiTaiFenKg);
	}

	/**
	 * @return 废钛粉Kg
	 */
	public String getFeiTaiFenKgJunPin1() {
		return StringHelper.null2Empty(feiTaiFenKgJunPin1);
	}

	/**
	 * @return 废钛粉Kg
	 */
	public String getFeiTaiFenKgJunPin2() {
		return StringHelper.null2Empty(feiTaiFenKgJunPin2);
	}

	/**
	 * @return 工艺试验
	 */
	public String getGongYiShiYan() {
		return StringHelper.null2Empty(gongYiShiYan);
	}

	/**
	 * @return 工艺试验
	 */
	public String getGongYiShiYanJunPin1() {
		return StringHelper.null2Empty(gongYiShiYanJunPin1);
	}

	/**
	 * @return 工艺试验
	 */
	public String getGongYiShiYanJunPin2() {
		return StringHelper.null2Empty(gongYiShiYanJunPin2);
	}

	/**
	 * @return 工艺调整
	 */
	public String getGongYiTiaoZheng() {
		return StringHelper.null2Empty(gongYiTiaoZheng);
	}

	/**
	 * @return 工艺调整
	 */
	public String getGongYiTiaoZhengJunPin1() {
		return StringHelper.null2Empty(gongYiTiaoZhengJunPin1);
	}

	/**
	 * @return 工艺调整
	 */
	public String getGongYiTiaoZhengJunPin2() {
		return StringHelper.null2Empty(gongYiTiaoZhengJunPin2);
	}

	/**
	 * @return 规格
	 */
	public String getGuiGe() {
		return StringHelper.null2Empty(guiGe);
	}

	/**
	 * @return 规格
	 */
	public String getGuiGeJunPin1() {
		return StringHelper.null2Empty(guiGeJunPin1);
	}

	/**
	 * @return 规格
	 */
	public String getGuiGeJunPin2() {
		return StringHelper.null2Empty(guiGeJunPin2);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return 加末次
	 */
	public String getJiaMoCi() {
		return StringHelper.null2Empty(jiaMoCi);
	}

	/**
	 * @return 加末次
	 */
	public String getJiaMoCiJunPin1() {
		return StringHelper.null2Empty(jiaMoCiJunPin1);
	}

	/**
	 * @return 加末次
	 */
	public String getJiaMoCiJunPin2() {
		return StringHelper.null2Empty(jiaMoCiJunPin2);
	}

	/**
	 * @return 加首次
	 */
	public String getJiaShouCi() {
		return StringHelper.null2Empty(jiaShouCi);
	}

	/**
	 * @return 加首次
	 */
	public String getJiaShouCiJunPin1() {
		return StringHelper.null2Empty(jiaShouCiJunPin1);
	}

	/**
	 * @return 加首次
	 */
	public String getJiaShouCiJunPin2() {
		return StringHelper.null2Empty(jiaShouCiJunPin2);
	}

	/**
	 * @return 净重
	 */
	public String getJingZhong() {
		return StringHelper.null2Empty(jingZhong);
	}

	/**
	 * @return 净重
	 */
	public String getJingZhongJunPin1() {
		return StringHelper.null2Empty(jingZhongJunPin1);
	}

	/**
	 * @return 净重
	 */
	public String getJingZhongJunPin2() {
		return StringHelper.null2Empty(jingZhongJunPin2);
	}

	/**
	 * @return the junPin
	 */
	public String getJunPin() {
		return StringHelper.null2Empty(junPin);
	}

	/**
	 * @return 考核等级(除锰)
	 */
	public String getKaoHeDengJiChuMeng() {
		return StringHelper.null2Empty(kaoHeDengJiChuMeng);
	}

	/**
	 * @return 考核等级(除锰)
	 */
	public String getKaoHeDengJiChuMengJunPin1() {
		return StringHelper.null2Empty(kaoHeDengJiChuMengJunPin1);
	}

	/**
	 * @return 考核等级(除锰)
	 */
	public String getKaoHeDengJiChuMengJunPin2() {
		return StringHelper.null2Empty(kaoHeDengJiChuMengJunPin2);
	}

	/**
	 * @return 炉次
	 */
	public String getLuCi() {
		return StringHelper.null2Empty(luCi);
	}

	/**
	 * @return 炉次
	 */
	public String getLuCiJunPin1() {
		return StringHelper.null2Empty(luCiJunPin1);
	}

	/**
	 * @return 炉次
	 */
	public String getLuCiJunPin2() {
		return StringHelper.null2Empty(luCiJunPin2);
	}

	/**
	 * @return 毛重
	 */
	public String getMaoZhong() {
		return StringHelper.null2Empty(maoZhong);
	}

	/**
	 * @return 毛重
	 */
	public String getMaoZhongJunPin1() {
		return StringHelper.null2Empty(maoZhongJunPin1);
	}

	/**
	 * @return 毛重
	 */
	public String getMaoZhongJunPin2() {
		return StringHelper.null2Empty(maoZhongJunPin2);
	}

	/**
	 * @return Mg（t）
	 */
	public String getMg() {
		return StringHelper.null2Empty(mg);
	}

	/**
	 * @return Mg（t）
	 */
	public String getMgJunPin1() {
		return StringHelper.null2Empty(mgJunPin1);
	}

	/**
	 * @return Mg（t）
	 */
	public String getMgJunPin2() {
		return StringHelper.null2Empty(mgJunPin2);
	}

	/**
	 * @return 爬壁Kg
	 */
	public String getPaBiKg() {
		return StringHelper.null2Empty(paBiKg);
	}

	/**
	 * @return 爬壁Kg
	 */
	public String getPaBiKgJunPin1() {
		return StringHelper.null2Empty(paBiKgJunPin1);
	}

	/**
	 * @return 爬壁Kg
	 */
	public String getPaBiKgJunPin2() {
		return StringHelper.null2Empty(paBiKgJunPin2);
	}

	/**
	 * @return 期号
	 */
	public String getQiHao() {
		return StringHelper.null2Empty(qiHao);
	}

	/**
	 * @return 期号
	 */
	public String getQiHaoJunPin1() {
		return StringHelper.null2Empty(qiHaoJunPin1);
	}

	/**
	 * @return 期号
	 */
	public String getQiHaoJunPin2() {
		return StringHelper.null2Empty(qiHaoJunPin2);
	}

	/**
	 * @return 上帽Kg
	 */
	public String getShangMaoKg() {
		return StringHelper.null2Empty(shangMaoKg);
	}

	/**
	 * @return 上帽Kg
	 */
	public String getShangMaoKgJunPin1() {
		return StringHelper.null2Empty(shangMaoKgJunPin1);
	}

	/**
	 * @return 上帽Kg
	 */
	public String getShangMaoKgJunPin2() {
		return StringHelper.null2Empty(shangMaoKgJunPin2);
	}

	/**
	 * @return 生产故障
	 */
	public String getShengChanGuZhang() {
		return StringHelper.null2Empty(shengChanGuZhang);
	}

	/**
	 * @return 生产故障
	 */
	public String getShengChanGuZhangJunPin1() {
		return StringHelper.null2Empty(shengChanGuZhangJunPin1);
	}

	/**
	 * @return 生产故障
	 */
	public String getShengChanGuZhangJunPin2() {
		return StringHelper.null2Empty(shengChanGuZhangJunPin2);
	}

	/**
	 * @return 生产炉号
	 */
	public String getShengChanLuHao() {
		return StringHelper.null2Empty(shengChanLuHao);
	}

	/**
	 * @return 生产炉号
	 */
	public String getShengChanLuHaoJunPin1() {
		return StringHelper.null2Empty(shengChanLuHaoJunPin1);
	}

	/**
	 * @return 生产炉号
	 */
	public String getShengChanLuHaoJunPin2() {
		return StringHelper.null2Empty(shengChanLuHaoJunPin2);
	}

	/**
	 * @return 使用次数
	 */
	public String getShiYongCiShu() {
		return StringHelper.null2Empty(shiYongCiShu);
	}

	/**
	 * @return 使用次数
	 */
	public String getShiYongCiShuJunPin1() {
		return StringHelper.null2Empty(shiYongCiShuJunPin1);
	}

	/**
	 * @return 使用次数
	 */
	public String getShiYongCiShuJunPin2() {
		return StringHelper.null2Empty(shiYongCiShuJunPin2);
	}

	/**
	 * @return 手选废料Kg
	 */
	public String getShouXuanFeiLiaoKg() {
		return StringHelper.null2Empty(shouXuanFeiLiaoKg);
	}

	/**
	 * @return 手选废料Kg
	 */
	public String getShouXuanFeiLiaoKgJunPin1() {
		return StringHelper.null2Empty(shouXuanFeiLiaoKgJunPin1);
	}

	/**
	 * @return 手选废料Kg
	 */
	public String getShouXuanFeiLiaoKgJunPin2() {
		return StringHelper.null2Empty(shouXuanFeiLiaoKgJunPin2);
	}

	/**
	 * @return 损耗Kg
	 */
	public String getSunHaoKg() {
		return StringHelper.null2Empty(sunHaoKg);
	}

	/**
	 * @return 损耗Kg
	 */
	public String getSunHaoKgJunPin1() {
		return StringHelper.null2Empty(sunHaoKgJunPin1);
	}

	/**
	 * @return 损耗Kg
	 */
	public String getSunHaoKgJunPin2() {
		return StringHelper.null2Empty(sunHaoKgJunPin2);
	}

	/**
	 * @return TiCl4
	 */
	public String getTiCl4() {
		return StringHelper.null2Empty(tiCl4);
	}

	/**
	 * @return TiCl4
	 */
	public String getTiCl4JunPin1() {
		return StringHelper.null2Empty(tiCl4JunPin1);
	}

	/**
	 * @return TiCl4
	 */
	public String getTiCl4JunPin2() {
		return StringHelper.null2Empty(tiCl4JunPin2);
	}

	/**
	 * @return 通道
	 */
	public String getTongDao() {
		return StringHelper.null2Empty(tongDao);
	}

	/**
	 * @return 通道
	 */
	public String getTongDaoJunPin1() {
		return StringHelper.null2Empty(tongDaoJunPin1);
	}

	/**
	 * @return 通道
	 */
	public String getTongDaoJunPin2() {
		return StringHelper.null2Empty(tongDaoJunPin2);
	}

	/**
	 * @return 年月日
	 */
	public String getYearMonthDay() {
		return StringHelper.null2Empty(yearMonthDay);
	}

	/**
	 * @return 年月日
	 */
	public String getYearMonthDayJunPin1() {
		return StringHelper.null2Empty(yearMonthDayJunPin1);
	}

	/**
	 * @return 年月日
	 */
	public String getYearMonthDayJunPin2() {
		return StringHelper.null2Empty(yearMonthDayJunPin2);
	}

	/**
	 * @return 元素C
	 */
	public String getYuanSuC() {
		return StringHelper.null2Empty(yuanSuC);
	}

	/**
	 * @return 元素C
	 */
	public String getYuanSuCJunPin1() {
		return StringHelper.null2Empty(yuanSuCJunPin1);
	}

	/**
	 * @return 元素C
	 */
	public String getYuanSuCJunPin2() {
		return StringHelper.null2Empty(yuanSuCJunPin2);
	}

	/**
	 * @return 元素Cl
	 */
	public String getYuanSuCl() {
		return StringHelper.null2Empty(yuanSuCl);
	}

	/**
	 * @return 元素Cl
	 */
	public String getYuanSuClJunPin1() {
		return StringHelper.null2Empty(yuanSuClJunPin1);
	}

	/**
	 * @return 元素Cl
	 */
	public String getYuanSuClJunPin2() {
		return StringHelper.null2Empty(yuanSuClJunPin2);
	}

	/**
	 * @return 元素Fe
	 */
	public String getYuanSuFe() {
		return StringHelper.null2Empty(yuanSuFe);
	}

	/**
	 * @return 元素Fe
	 */
	public String getYuanSuFeJunPin1() {
		return StringHelper.null2Empty(yuanSuFeJunPin1);
	}

	/**
	 * @return 元素Fe
	 */
	public String getYuanSuFeJunPin2() {
		return StringHelper.null2Empty(yuanSuFeJunPin2);
	}

	/**
	 * @return 元素H
	 */
	public String getYuanSuH() {
		return StringHelper.null2Empty(yuanSuH);
	}

	/**
	 * @return 元素HB
	 */
	public String getYuanSuHb() {
		return StringHelper.null2Empty(yuanSuHb);
	}

	/**
	 * @return 元素HB
	 */
	public String getYuanSuHbJunPin1() {
		return StringHelper.null2Empty(yuanSuHbJunPin1);
	}

	/**
	 * @return 元素HB
	 */
	public String getYuanSuHbJunPin2() {
		return StringHelper.null2Empty(yuanSuHbJunPin2);
	}

	/**
	 * @return 元素H
	 */
	public String getYuanSuHJunPin1() {
		return StringHelper.null2Empty(yuanSuHJunPin1);
	}

	/**
	 * @return 元素H
	 */
	public String getYuanSuHJunPin2() {
		return StringHelper.null2Empty(yuanSuHJunPin2);
	}

	/**
	 * @return 元素Mn
	 */
	public String getYuanSuMn() {
		return StringHelper.null2Empty(yuanSuMn);
	}

	/**
	 * @return 元素Mn
	 */
	public String getYuanSuMnJunPin1() {
		return StringHelper.null2Empty(yuanSuMnJunPin1);
	}

	/**
	 * @return 元素Mn
	 */
	public String getYuanSuMnJunPin2() {
		return StringHelper.null2Empty(yuanSuMnJunPin2);
	}

	/**
	 * @return 元素N
	 */
	public String getYuanSuN() {
		return StringHelper.null2Empty(yuanSuN);
	}

	/**
	 * @return 元素N
	 */
	public String getYuanSuNJunPin1() {
		return StringHelper.null2Empty(yuanSuNJunPin1);
	}

	/**
	 * @return 元素N
	 */
	public String getYuanSuNJunPin2() {
		return StringHelper.null2Empty(yuanSuNJunPin2);
	}

	/**
	 * @return 元素O
	 */
	public String getYuanSuO() {
		return StringHelper.null2Empty(yuanSuO);
	}

	/**
	 * @return 元素O
	 */
	public String getYuanSuOJunPin1() {
		return StringHelper.null2Empty(yuanSuOJunPin1);
	}

	/**
	 * @return 元素O
	 */
	public String getYuanSuOJunPin2() {
		return StringHelper.null2Empty(yuanSuOJunPin2);
	}

	/**
	 * @return 元素Si
	 */
	public String getYuanSuSi() {
		return StringHelper.null2Empty(yuanSuSi);
	}

	/**
	 * @return 元素Si
	 */
	public String getYuanSuSiJunPin1() {
		return StringHelper.null2Empty(yuanSuSiJunPin1);
	}

	/**
	 * @return 元素Si
	 */
	public String getYuanSuSiJunPin2() {
		return StringHelper.null2Empty(yuanSuSiJunPin2);
	}

	/**
	 * @return 还原最高温度℃
	 */
	public String getYuanZuiGaoWenDu() {
		return StringHelper.null2Empty(yuanZuiGaoWenDu);
	}

	/**
	 * @return 还原最高温度℃
	 */
	public String getYuanZuiGaoWenDuJunPin1() {
		return StringHelper.null2Empty(yuanZuiGaoWenDuJunPin1);
	}

	/**
	 * @return 还原最高温度℃
	 */
	public String getYuanZuiGaoWenDuJunPin2() {
		return StringHelper.null2Empty(yuanZuiGaoWenDuJunPin2);
	}

	/**
	 * @return 蒸馏高恒A点最高℃
	 */
	public String getZhengLiuGaoHengDian() {
		return StringHelper.null2Empty(zhengLiuGaoHengDian);
	}

	/**
	 * @return 蒸馏高恒A点最高℃
	 */
	public String getZhengLiuGaoHengDianJunPin1() {
		return StringHelper.null2Empty(zhengLiuGaoHengDianJunPin1);
	}

	/**
	 * @return 蒸馏高恒A点最高℃
	 */
	public String getZhengLiuGaoHengDianJunPin2() {
		return StringHelper.null2Empty(zhengLiuGaoHengDianJunPin2);
	}

	/**
	 * @return 转蒸馏
	 */
	public String getZhuanZhengLiu() {
		return StringHelper.null2Empty(zhuanZhengLiu);
	}

	/**
	 * @return 转蒸馏
	 */
	public String getZhuanZhengLiuJunPin1() {
		return StringHelper.null2Empty(zhuanZhengLiuJunPin1);
	}

	/**
	 * @return 转蒸馏
	 */
	public String getZhuanZhengLiuJunPin2() {
		return StringHelper.null2Empty(zhuanZhengLiuJunPin2);
	}

	/**
	 * @return 总排镁量Kg
	 */
	public String getZongPaiMeiLiangKg() {
		return StringHelper.null2Empty(zongPaiMeiLiangKg);
	}

	/**
	 * @return 总排镁量Kg
	 */
	public String getZongPaiMeiLiangKgJunPin1() {
		return StringHelper.null2Empty(zongPaiMeiLiangKgJunPin1);
	}

	/**
	 * @return 总排镁量Kg
	 */
	public String getZongPaiMeiLiangKgJunPin2() {
		return StringHelper.null2Empty(zongPaiMeiLiangKgJunPin2);
	}

	/**
	 * @param 备注说明
	 */
	public void setBeiZhuShuoMing(String beiZhuShuoMing) {
		this.beiZhuShuoMing = beiZhuShuoMing;
	}

	/**
	 * @param 备注说明
	 */
	public void setBeiZhuShuoMingJunPin1(String beiZhuShuoMing) {
		this.beiZhuShuoMing = beiZhuShuoMingJunPin1;
	}

	/**
	 * @param 备注说明
	 */
	public void setBeiZhuShuoMingJunPin2(String beiZhuShuoMing) {
		this.beiZhuShuoMing = beiZhuShuoMingJunPin2;
	}

	/**
	 * @param 成品率
	 */
	public void setChengPinLv(String chengPinLv) {
		this.chengPinLv = chengPinLv;
	}

	/**
	 * @param 成品率
	 */
	public void setChengPinLvJunPin1(String chengPinLv) {
		this.chengPinLv = chengPinLvJunPin1;
	}

	/**
	 * @param 成品率
	 */
	public void setChengPinLvJunPin2(String chengPinLv) {
		this.chengPinLv = chengPinLvJunPin2;
	}

	/**
	 * @param 出炉真空度Pa
	 */
	public void setChuLuZhenKongDu(String chuLuZhenKongDu) {
		this.chuLuZhenKongDu = chuLuZhenKongDu;
	}

	/**
	 * @param 出炉真空度Pa
	 */
	public void setChuLuZhenKongDuJunPin1(String chuLuZhenKongDu) {
		this.chuLuZhenKongDu = chuLuZhenKongDuJunPin1;
	}

	/**
	 * @param 出炉真空度Pa
	 */
	public void setChuLuZhenKongDuJunPin2(String chuLuZhenKongDu) {
		this.chuLuZhenKongDu = chuLuZhenKongDuJunPin2;
	}

	/**
	 * @param 磁选Kg
	 */
	public void setCiYuanKg(String ciYuanKg) {
		this.ciYuanKg = ciYuanKg;
	}

	/**
	 * @param 磁选Kg
	 */
	public void setCiYuanKgJunPin1(String ciYuanKg) {
		this.ciYuanKg = ciYuanKgJunPin1;
	}

	/**
	 * @param 磁选Kg
	 */
	public void setCiYuanKgJunPin2(String ciYuanKg) {
		this.ciYuanKg = ciYuanKgJunPin2;
	}

	/**
	 * @param 等级
	 *            (含锰)
	 */
	public void setDengJiHanMeng(String dengJiHanMeng) {
		this.dengJiHanMeng = dengJiHanMeng;
	}

	/**
	 * @param 等级
	 *            JunPin1(含锰)
	 */
	public void setDengJiHanMengJunPin1(String dengJiHanMeng) {
		this.dengJiHanMeng = dengJiHanMengJunPin1;
	}

	/**
	 * @param 等级
	 *            JunPin2(含锰)
	 */
	public void setDengJiHanMengJunPin2(String dengJiHanMeng) {
		this.dengJiHanMeng = dengJiHanMengJunPin2;
	}

	/**
	 * @param 底皮Kg
	 */
	public void setDiPiKg(String diPiKg) {
		this.diPiKg = diPiKg;
	}

	/**
	 * @param 底皮Kg
	 */
	public void setDiPiKgJunPin1(String diPiKg) {
		this.diPiKg = diPiKgJunPin1;
	}

	/**
	 * @param 底皮Kg
	 */
	public void setDiPiKgJunPin2(String diPiKg) {
		this.diPiKg = diPiKgJunPin2;
	}

	/**
	 * @param 反应器号
	 */
	public void setFanYingQiHao(String fanYingQiHao) {
		this.fanYingQiHao = fanYingQiHao;
	}

	/**
	 * @param 反应器号
	 */
	public void setFanYingQiHaoJunPin1(String fanYingQiHao) {
		this.fanYingQiHao = fanYingQiHaoJunPin1;
	}

	/**
	 * @param 反应器号
	 */
	public void setFanYingQiHaoJunPin2(String fanYingQiHao) {
		this.fanYingQiHao = fanYingQiHaoJunPin2;
	}

	/**
	 * @param 废底皮Kg
	 */
	public void setFeiDiPiKg(String feiDiPiKg) {
		this.feiDiPiKg = feiDiPiKg;
	}

	/**
	 * @param 废底皮Kg
	 */
	public void setFeiDiPiKgJunPin1(String feiDiPiKg) {
		this.feiDiPiKg = feiDiPiKgJunPin1;
	}

	/**
	 * @param 废底皮Kg
	 */
	public void setFeiDiPiKgJunPin2(String feiDiPiKg) {
		this.feiDiPiKg = feiDiPiKgJunPin2;
	}

	/**
	 * @param 废爬壁Kg
	 */
	public void setFeiPaBiKg(String feiPaBiKg) {
		this.feiPaBiKg = feiPaBiKg;
	}

	/**
	 * @param 废爬壁Kg
	 */
	public void setFeiPaBiKgJunPin1(String feiPaBiKg) {
		this.feiPaBiKg = feiPaBiKgJunPin1;
	}

	/**
	 * @param 废爬壁Kg
	 */
	public void setFeiPaBiKgJunPin2(String feiPaBiKg) {
		this.feiPaBiKg = feiPaBiKgJunPin2;
	}

	/**
	 * @param 废上帽Kg
	 */
	public void setFeiShangMaoKg(String feiShangMaoKg) {
		this.feiShangMaoKg = feiShangMaoKg;
	}

	/**
	 * @param 废上帽Kg
	 */
	public void setFeiShangMaoKgJunPin1(String feiShangMaoKg) {
		this.feiShangMaoKg = feiShangMaoKgJunPin1;
	}

	/**
	 * @param 废上帽Kg
	 */
	public void setFeiShangMaoKgJunPin2(String feiShangMaoKg) {
		this.feiShangMaoKg = feiShangMaoKgJunPin2;
	}

	/**
	 * @param 废钛粉Kg
	 */
	public void setFeiTaiFenKg(String feiTaiFenKg) {
		this.feiTaiFenKg = feiTaiFenKg;
	}

	/**
	 * @param 废钛粉Kg
	 */
	public void setFeiTaiFenKgJunPin1(String feiTaiFenKg) {
		this.feiTaiFenKg = feiTaiFenKgJunPin1;
	}

	/**
	 * @param 废钛粉Kg
	 */
	public void setFeiTaiFenKgJunPin2(String feiTaiFenKg) {
		this.feiTaiFenKg = feiTaiFenKgJunPin2;
	}

	/**
	 * @param 工艺试验
	 */
	public void setGongYiShiYan(String gongYiShiYan) {
		this.gongYiShiYan = gongYiShiYan;
	}

	/**
	 * @param 工艺试验
	 */
	public void setGongYiShiYanJunPin1(String gongYiShiYan) {
		this.gongYiShiYan = gongYiShiYanJunPin1;
	}

	/**
	 * @param 工艺试验
	 */
	public void setGongYiShiYanJunPin2(String gongYiShiYan) {
		this.gongYiShiYan = gongYiShiYanJunPin2;
	}

	/**
	 * @param 工艺调整
	 */
	public void setGongYiTiaoZheng(String gongYiTiaoZheng) {
		this.gongYiTiaoZheng = gongYiTiaoZheng;
	}

	/**
	 * @param 工艺调整
	 */
	public void setGongYiTiaoZhengJunPin1(String gongYiTiaoZheng) {
		this.gongYiTiaoZheng = gongYiTiaoZhengJunPin1;
	}

	/**
	 * @param 工艺调整
	 */
	public void setGongYiTiaoZhengJunPin2(String gongYiTiaoZheng) {
		this.gongYiTiaoZheng = gongYiTiaoZhengJunPin2;
	}

	/**
	 * @param 规格
	 */
	public void setGuiGe(String guiGe) {
		this.guiGe = guiGe;
	}

	/**
	 * @param 规格
	 */
	public void setGuiGeJunPin1(String guiGe) {
		this.guiGe = guiGeJunPin1;
	}

	/**
	 * @param 规格
	 */
	public void setGuiGeJunPin2(String guiGe) {
		this.guiGe = guiGeJunPin2;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param 加末次
	 */
	public void setJiaMoCi(String jiaMoCi) {
		this.jiaMoCi = jiaMoCi;
	}

	/**
	 * @param 加末次
	 */
	public void setJiaMoCiJunPin1(String jiaMoCi) {
		this.jiaMoCi = jiaMoCiJunPin1;
	}

	/**
	 * @param 加末次
	 */
	public void setJiaMoCiJunPin2(String jiaMoCi) {
		this.jiaMoCi = jiaMoCiJunPin2;
	}

	/**
	 * @param 加首次
	 */
	public void setJiaShouCi(String jiaShouCi) {
		this.jiaShouCi = jiaShouCi;
	}

	/**
	 * @param 加首次
	 */
	public void setJiaShouCiJunPin1(String jiaShouCi) {
		this.jiaShouCi = jiaShouCiJunPin1;
	}

	/**
	 * @param 加首次
	 */
	public void setJiaShouCiJunPin2(String jiaShouCi) {
		this.jiaShouCi = jiaShouCiJunPin2;
	}

	/**
	 * @param 净重
	 */
	public void setJingZhong(String jingZhong) {
		this.jingZhong = jingZhong;
	}

	/**
	 * @param 净重
	 */
	public void setJingZhongJunPin1(String jingZhong) {
		this.jingZhong = jingZhongJunPin1;
	}

	/**
	 * @param 净重
	 */
	public void setJingZhongJunPin2(String jingZhong) {
		this.jingZhong = jingZhongJunPin2;
	}

	/**
	 * @param junPin the junPin to set
	 */
	public void setJunPin(String junPin) {
		this.junPin = junPin;
	}

	/**
	 * @param 考核等级
	 *            (除锰)
	 * 
	 */
	public void setKaoHeDengJiChuMeng(String kaoHeDengJiChuMeng) {
		this.kaoHeDengJiChuMeng = kaoHeDengJiChuMeng;
	}

	/**
	 * @param 考核等级
	 *            (除锰)
	 * 
	 */
	public void setKaoHeDengJiChuMengJunPin1(String kaoHeDengJiChuMeng) {
		this.kaoHeDengJiChuMeng = kaoHeDengJiChuMengJunPin1;
	}

	/**
	 * @param 考核等级
	 *            (除锰)
	 * 
	 */
	public void setKaoHeDengJiChuMengJunPin2(String kaoHeDengJiChuMeng) {
		this.kaoHeDengJiChuMeng = kaoHeDengJiChuMengJunPin2;
	}

	/**
	 * @param 炉次
	 */
	public void setLuCi(String luCi) {
		this.luCi = luCi;
	}

	/**
	 * @param 炉次
	 */
	public void setLuCiJunPin1(String luCi) {
		this.luCi = luCiJunPin1;
	}

	/**
	 * @param 炉次
	 */
	public void setLuCiJunPin2(String luCi) {
		this.luCi = luCiJunPin2;
	}

	/**
	 * @param 毛重
	 */
	public void setMaoZhong(String maoZhong) {
		this.maoZhong = maoZhong;
	}

	/**
	 * @param 毛重
	 */
	public void setMaoZhongJunPin1(String maoZhong) {
		this.maoZhong = maoZhongJunPin1;
	}

	/**
	 * @param 毛重
	 */
	public void setMaoZhongJunPin2(String maoZhong) {
		this.maoZhong = maoZhongJunPin2;
	}

	/**
	 * @param Mg
	 *            （t）
	 * 
	 */
	public void setMg(String mg) {
		this.mg = mg;
	}

	/**
	 * @param Mg
	 *            （t）
	 * 
	 */
	public void setMgJunPin1(String mg) {
		this.mg = mgJunPin1;
	}

	/**
	 * @param Mg
	 *            （t）
	 * 
	 */
	public void setMgJunPin2(String mg) {
		this.mg = mgJunPin2;
	}

	/**
	 * @param 爬壁Kg
	 */
	public void setPaBiKg(String paBiKg) {
		this.paBiKg = paBiKg;
	}

	/**
	 * @param 爬壁Kg
	 */
	public void setPaBiKgJunPin1(String paBiKg) {
		this.paBiKg = paBiKgJunPin1;
	}

	/**
	 * @param 爬壁Kg
	 */
	public void setPaBiKgJunPin2(String paBiKg) {
		this.paBiKg = paBiKgJunPin2;
	}

	/**
	 * @param 期号
	 */
	public void setQiHao(String qiHao) {
		this.qiHao = qiHao;
	}

	/**
	 * @param 期号
	 */
	public void setQiHaoJunPin1(String qiHao) {
		this.qiHao = qiHaoJunPin1;
	}

	/**
	 * @param 期号
	 */
	public void setQiHaoJunPin2(String qiHao) {
		this.qiHao = qiHaoJunPin2;
	}

	/**
	 * @param 上帽Kg
	 */
	public void setShangMaoKg(String shangMaoKg) {
		this.shangMaoKg = shangMaoKg;
	}

	/**
	 * @param 上帽Kg
	 */
	public void setShangMaoKgJunPin1(String shangMaoKg) {
		this.shangMaoKg = shangMaoKgJunPin1;
	}

	/**
	 * @param 上帽Kg
	 */
	public void setShangMaoKgJunPin2(String shangMaoKg) {
		this.shangMaoKg = shangMaoKgJunPin2;
	}

	/**
	 * @param 生产故障
	 */
	public void setShengChanGuZhang(String shengChanGuZhang) {
		this.shengChanGuZhang = shengChanGuZhang;
	}

	/**
	 * @param 生产故障
	 */
	public void setShengChanGuZhangJunPin1(String shengChanGuZhang) {
		this.shengChanGuZhang = shengChanGuZhangJunPin1;
	}

	/**
	 * @param 生产故障
	 */
	public void setShengChanGuZhangJunPin2(String shengChanGuZhang) {
		this.shengChanGuZhang = shengChanGuZhangJunPin2;
	}

	/**
	 * @param 生产炉号
	 */
	public void setShengChanLuHao(String shengChanLuHao) {
		this.shengChanLuHao = shengChanLuHao;
	}

	/**
	 * @param 生产炉号
	 */
	public void setShengChanLuHaoJunPin1(String shengChanLuHao) {
		this.shengChanLuHao = shengChanLuHaoJunPin1;
	}

	/**
	 * @param 生产炉号
	 */
	public void setShengChanLuHaoJunPin2(String shengChanLuHao) {
		this.shengChanLuHao = shengChanLuHaoJunPin2;
	}

	/**
	 * @param 使用次数
	 */
	public void setShiYongCiShu(String shiYongCiShu) {
		this.shiYongCiShu = shiYongCiShu;
	}

	/**
	 * @param 使用次数
	 */
	public void setShiYongCiShuJunPin1(String shiYongCiShu) {
		this.shiYongCiShu = shiYongCiShuJunPin1;
	}

	/**
	 * @param 使用次数
	 */
	public void setShiYongCiShuJunPin2(String shiYongCiShu) {
		this.shiYongCiShu = shiYongCiShuJunPin2;
	}

	/**
	 * @param 手选废料Kg
	 */
	public void setShouXuanFeiLiaoKg(String shouXuanFeiLiaoKg) {
		this.shouXuanFeiLiaoKg = shouXuanFeiLiaoKg;
	}

	/**
	 * @param 手选废料Kg
	 */
	public void setShouXuanFeiLiaoKgJunPin1(String shouXuanFeiLiaoKg) {
		this.shouXuanFeiLiaoKg = shouXuanFeiLiaoKgJunPin1;
	}

	/**
	 * @param 手选废料Kg
	 */
	public void setShouXuanFeiLiaoKgJunPin2(String shouXuanFeiLiaoKg) {
		this.shouXuanFeiLiaoKg = shouXuanFeiLiaoKgJunPin2;
	}

	/**
	 * @param 损耗Kg
	 */
	public void setSunHaoKg(String sunHaoKg) {
		this.sunHaoKg = sunHaoKg;
	}

	/**
	 * @param 损耗Kg
	 */
	public void setSunHaoKgJunPin1(String sunHaoKg) {
		this.sunHaoKg = sunHaoKgJunPin1;
	}

	/**
	 * @param 损耗Kg
	 */
	public void setSunHaoKgJunPin2(String sunHaoKg) {
		this.sunHaoKg = sunHaoKgJunPin2;
	}

	/**
	 * @param TiCl4
	 */
	public void setTiCl4(String tiCl4) {
		this.tiCl4 = tiCl4;
	}

	/**
	 * @param TiCl4
	 */
	public void setTiCl4JunPin1(String tiCl4) {
		this.tiCl4 = tiCl4JunPin1;
	}

	/**
	 * @param TiCl4
	 */
	public void setTiCl4JunPin2(String tiCl4) {
		this.tiCl4 = tiCl4JunPin2;
	}

	/**
	 * @param 通道
	 */
	public void setTongDao(String tongDao) {
		this.tongDao = tongDao;
	}

	/**
	 * @param 通道
	 */
	public void setTongDaoJunPin1(String tongDao) {
		this.tongDao = tongDaoJunPin1;
	}

	/**
	 * @param 通道
	 */
	public void setTongDaoJunPin2(String tongDao) {
		this.tongDao = tongDaoJunPin2;
	}

	/**
	 * @param 年月日
	 */
	public void setYearMonthDay(String yearMonthDay) {
		this.yearMonthDay = yearMonthDay;
	}

	/**
	 * @param 年月日
	 */
	public void setYearMonthDayJunPin1(String yearMonthDay) {
		this.yearMonthDay = yearMonthDayJunPin1;
	}

	/**
	 * @param 年月日
	 */
	public void setYearMonthDayJunPin2(String yearMonthDay) {
		this.yearMonthDay = yearMonthDayJunPin2;
	}

	/**
	 * @param 元素C
	 */
	public void setYuanSuC(String yuanSuC) {
		this.yuanSuC = yuanSuC;
	}

	/**
	 * @param 元素C
	 */
	public void setYuanSuCJunPin1(String yuanSuC) {
		this.yuanSuC = yuanSuCJunPin1;
	}

	/**
	 * @param 元素C
	 */
	public void setYuanSuCJunPin2(String yuanSuC) {
		this.yuanSuC = yuanSuCJunPin2;
	}

	/**
	 * @param 元素Cl
	 */
	public void setYuanSuCl(String yuanSuCl) {
		this.yuanSuCl = yuanSuCl;
	}

	/**
	 * @param 元素Cl
	 */
	public void setYuanSuClJunPin1(String yuanSuCl) {
		this.yuanSuCl = yuanSuClJunPin1;
	}

	/**
	 * @param 元素Cl
	 */
	public void setYuanSuClJunPin2(String yuanSuCl) {
		this.yuanSuCl = yuanSuClJunPin2;
	}

	/**
	 * @param 元素Fe
	 */
	public void setYuanSuFe(String yuanSuFe) {
		this.yuanSuFe = yuanSuFe;
	}

	/**
	 * @param 元素Fe
	 */
	public void setYuanSuFeJunPin1(String yuanSuFe) {
		this.yuanSuFe = yuanSuFeJunPin1;
	}

	/**
	 * @param 元素Fe
	 */
	public void setYuanSuFeJunPin2(String yuanSuFe) {
		this.yuanSuFe = yuanSuFeJunPin2;
	}

	/**
	 * @param 元素H
	 */
	public void setYuanSuH(String yuanSuH) {
		this.yuanSuH = yuanSuH;
	}

	/**
	 * @param 元素HB
	 */
	public void setYuanSuHb(String yuanSuHb) {
		this.yuanSuHb = yuanSuHb;
	}

	/**
	 * @param 元素HB
	 */
	public void setYuanSuHbJunPin1(String yuanSuHb) {
		this.yuanSuHb = yuanSuHbJunPin1;
	}

	/**
	 * @param 元素HB
	 */
	public void setYuanSuHbJunPin2(String yuanSuHb) {
		this.yuanSuHb = yuanSuHbJunPin2;
	}

	/**
	 * @param 元素H
	 */
	public void setYuanSuHJunPin1(String yuanSuH) {
		this.yuanSuH = yuanSuHJunPin1;
	}

	/**
	 * @param 元素H
	 */
	public void setYuanSuHJunPin2(String yuanSuH) {
		this.yuanSuH = yuanSuHJunPin2;
	}

	/**
	 * @param 元素Mn
	 */
	public void setYuanSuMn(String yuansuMn) {
		this.yuanSuMn = yuansuMn;
	}

	/**
	 * @param 元素Mn
	 */
	public void setYuanSuMnJunPin1(String yuansuMn) {
		this.yuanSuMn = yuanSuMnJunPin1;
	}

	/**
	 * @param 元素Mn
	 */
	public void setYuanSuMnJunPin2(String yuansuMn) {
		this.yuanSuMn = yuanSuMnJunPin2;
	}

	/**
	 * @param 元素N
	 */
	public void setYuanSuN(String yuanSuN) {
		this.yuanSuN = yuanSuN;
	}

	/**
	 * @param 元素N
	 */
	public void setYuanSuNJunPin1(String yuanSuN) {
		this.yuanSuN = yuanSuNJunPin1;
	}

	/**
	 * @param 元素N
	 */
	public void setYuanSuNJunPin2(String yuanSuN) {
		this.yuanSuN = yuanSuNJunPin2;
	}

	/**
	 * @param 元素O
	 */
	public void setYuanSuO(String yuanSuO) {
		this.yuanSuO = yuanSuO;
	}

	/**
	 * @param 元素O
	 */
	public void setYuanSuOJunPin1(String yuanSuO) {
		this.yuanSuO = yuanSuOJunPin1;
	}

	/**
	 * @param 元素O
	 */
	public void setYuanSuOJunPin2(String yuanSuO) {
		this.yuanSuO = yuanSuOJunPin2;
	}

	/**
	 * @param 元素Si
	 */
	public void setYuanSuSi(String yuanSuSi) {
		this.yuanSuSi = yuanSuSi;
	}

	/**
	 * @param 元素Si
	 */
	public void setYuanSuSiJunPin1(String yuanSuSi) {
		this.yuanSuSi = yuanSuSiJunPin1;
	}

	/**
	 * @param 元素Si
	 */
	public void setYuanSuSiJunPin2(String yuanSuSi) {
		this.yuanSuSi = yuanSuSiJunPin2;
	}

	/**
	 * @param 还原最高温度
	 *            ℃
	 */
	public void setYuanZuiGaoWenDu(String yuanZuiGaoWenDu) {
		this.yuanZuiGaoWenDu = yuanZuiGaoWenDu;
	}

	/**
	 * @param 还原最高温度
	 *            ℃
	 */
	public void setYuanZuiGaoWenDuJunPin1(String yuanZuiGaoWenDu) {
		this.yuanZuiGaoWenDu = yuanZuiGaoWenDuJunPin1;
	}

	/**
	 * @param 还原最高温度
	 *            ℃
	 */
	public void setYuanZuiGaoWenDuJunPin2(String yuanZuiGaoWenDu) {
		this.yuanZuiGaoWenDu = yuanZuiGaoWenDuJunPin2;
	}

	/**
	 * @param 蒸馏高恒A点最高
	 *            ℃
	 */
	public void setZhengLiuGaoHengDian(String zhengLiuGaoHengDian) {
		this.zhengLiuGaoHengDian = zhengLiuGaoHengDian;
	}

	/**
	 * @param 蒸馏高恒A点最高
	 *            ℃
	 */
	public void setZhengLiuGaoHengDianJunPin1(String zhengLiuGaoHengDian) {
		this.zhengLiuGaoHengDian = zhengLiuGaoHengDianJunPin1;
	}

	/**
	 * @param 蒸馏高恒A点最高
	 *            ℃
	 */
	public void setZhengLiuGaoHengDianJunPin2(String zhengLiuGaoHengDian) {
		this.zhengLiuGaoHengDian = zhengLiuGaoHengDianJunPin2;
	}

	/**
	 * @param 转蒸馏
	 */
	public void setZhuanZhengLiu(String zhuanZhengLiu) {
		this.zhuanZhengLiu = zhuanZhengLiu;
	}

	/**
	 * @param 转蒸馏
	 */
	public void setZhuanZhengLiuJunPin1(String zhuanZhengLiu) {
		this.zhuanZhengLiu = zhuanZhengLiuJunPin1;
	}

	/**
	 * @param 转蒸馏
	 */
	public void setZhuanZhengLiuJunPin2(String zhuanZhengLiu) {
		this.zhuanZhengLiu = zhuanZhengLiuJunPin2;
	}

	/**
	 * @param 总排镁量Kg
	 */
	public void setZongPaiMeiLiangKg(String zongPaiMeiLiangKg) {
		this.zongPaiMeiLiangKg = zongPaiMeiLiangKg;
	}

	/**
	 * @param 总排镁量Kg
	 */
	public void setZongPaiMeiLiangKgJunPin1(String zongPaiMeiLiangKg) {
		this.zongPaiMeiLiangKg = zongPaiMeiLiangKgJunPin1;
	}

	/**
	 * @param 总排镁量Kg
	 */
	public void setZongPaiMeiLiangKgJunPin2(String zongPaiMeiLiangKg) {
		this.zongPaiMeiLiangKg = zongPaiMeiLiangKgJunPin2;
	}
}
