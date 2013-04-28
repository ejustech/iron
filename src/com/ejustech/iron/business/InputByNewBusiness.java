package com.ejustech.iron.business;

import java.text.DecimalFormat;

import org.apache.struts.action.ActionForm;

import com.ejustech.iron.common.Constant;
import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.form.InputByNewForm;

public class InputByNewBusiness {
	public Boolean Save(ActionForm form) {
		
		if (form != null) {
			TIronInfoDao dao = new TIronInfoDao();
			InputByNewForm inputByNewForm = (InputByNewForm) form;
			InputByNewFormBean inputByNewFormBean;
			TIronInfoDaoBean tIronInfoDaoBean;
			for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
				inputByNewFormBean = getInputByNewFormBeanFromForm(inputByNewForm, i);
				
				for (int j = 0; j < 3; j++) {
					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByNewFormBean(inputByNewFormBean, j+1);
					dao.Insert(tIronInfoDaoBean);
				}
			}
		}

		return null;
	}

	private InputByNewFormBean getInputByNewFormBeanFromForm(InputByNewForm form, int index) {
		if (form != null) {
			return (InputByNewFormBean) form.getInputByNewList().get(index);
		}
		return null;
	}

	private TIronInfoDaoBean ConvToTIronInfoDaoBeanFromInputByNewFormBean(InputByNewFormBean formBean, int rowDataIndex) {
		TIronInfoDaoBean daoBean = new TIronInfoDaoBean();
		switch (rowDataIndex) {
		case 1:
			daoBean.setYear(formBean.getYear());
			daoBean.setMonth(formBean.getMonth());
			daoBean.setDay(formBean.getDay());
			daoBean.setYearMonthDay(formBean.getYearMonthDay());
			daoBean.setQiHao(formBean.getQiHao());
			daoBean.setLuCi(formBean.getLuCi());
			daoBean.setGuiGe(formBean.getGuiGe());
			daoBean.setShengChanLuHao(formBean.getShengChanLuHao());
			daoBean.setFanYingQiHao(formBean.getFanYingQiHao());
			daoBean.setShiYongCiShu(formBean.getShiYongCiShu());
			daoBean.setMg(formBean.getMg());
			daoBean.setTiCl4(formBean.getTiCl4());
			daoBean.setMaoZhong(formBean.getMaoZhong());
			daoBean.setJingZhong(formBean.getJingZhong());
			daoBean.setChengPinLv(formBean.getChengPinLv());
			daoBean.setYuanSuFe(formBean.getYuanSuFe());
			daoBean.setYuanSuSi(formBean.getYuanSuSi());
			daoBean.setYuanSuCl(formBean.getYuanSuCl());
			daoBean.setYuanSuC(formBean.getYuanSuC());
			daoBean.setYuanSuN(formBean.getYuanSuN());
			daoBean.setYuanSuO(formBean.getYuanSuO());
			daoBean.setYuanSuH(formBean.getYuanSuH());
			daoBean.setYuanSuMn(formBean.getYuanSuMn());
			daoBean.setYuanSuHb(formBean.getYuanSuHb());
			daoBean.setDengJiHanMeng(formBean.getDengJiHanMeng());
			daoBean.setKaoHeDengJiChuMeng(formBean.getKaoHeDengJiChuMeng());
			daoBean.setGongYiTiaoZheng(formBean.getGongYiTiaoZheng());
			daoBean.setGongYiShiYan(formBean.getGongYiShiYan());
			daoBean.setDiPiKg(formBean.getDiPiKg());
			daoBean.setShangMaoKg(formBean.getShangMaoKg());
			daoBean.setPaBiKg(formBean.getPaBiKg());
			daoBean.setFeiDiPiKg(formBean.getFeiDiPiKg());
			daoBean.setFeiShangMaoKg(formBean.getFeiShangMaoKg());
			daoBean.setFeiPaBiKg(formBean.getFeiPaBiKg());
			daoBean.setFeiTaiFenKg(formBean.getFeiTaiFenKg());
			daoBean.setCiYuanKg(formBean.getCiYuanKg());
			daoBean.setShouXuanFeiLiaoKg(formBean.getShouXuanFeiLiaoKg());
			daoBean.setSunHaoKg(formBean.getSunHaoKg());
			daoBean.setZongPaiMeiLiangKg(formBean.getZongPaiMeiLiangKg());
			daoBean.setChuLuZhenKongDu(formBean.getChuLuZhenKongDu());
			daoBean.setYuanZuiGaoWenDu(formBean.getYuanZuiGaoWenDu());
			daoBean.setZhengLiuGaoHengDian(formBean.getZhengLiuGaoHengDian());
			daoBean.setZhuanZhengLiu(formBean.getZhuanZhengLiu());
			daoBean.setJiaShouCi(formBean.getJiaShouCi());
			daoBean.setJiaMoCi(formBean.getJiaMoCi());
			daoBean.setTongDao(formBean.getTongDao());
			daoBean.setShengChanGuZhang(formBean.getShengChanGuZhang());
			daoBean.setBeiZhuShuoMing(formBean.getBeiZhuShuoMing());
			break;
		case 2:
			daoBean.setYear(formBean.getYearJunPin1());
			daoBean.setMonth(formBean.getMonthJunPin1());
			daoBean.setDay(formBean.getDayJunPin1());
			daoBean.setYearMonthDay(formBean.getYearMonthDayJunPin1());
			daoBean.setQiHao(formBean.getQiHaoJunPin1());
			daoBean.setLuCi(formBean.getLuCiJunPin1());
			daoBean.setGuiGe(formBean.getGuiGeJunPin1());
			daoBean.setShengChanLuHao(formBean.getShengChanLuHaoJunPin1());
			daoBean.setFanYingQiHao(formBean.getFanYingQiHaoJunPin1());
			daoBean.setShiYongCiShu(formBean.getShiYongCiShuJunPin1());
			daoBean.setMg(formBean.getMgJunPin1());
			daoBean.setTiCl4(formBean.getTiCl4JunPin1());
			daoBean.setMaoZhong(formBean.getMaoZhongJunPin1());
			daoBean.setJingZhong(formBean.getJingZhongJunPin1());
			daoBean.setChengPinLv(formBean.getChengPinLvJunPin1());
			daoBean.setYuanSuFe(formBean.getYuanSuFeJunPin1());
			daoBean.setYuanSuSi(formBean.getYuanSuSiJunPin1());
			daoBean.setYuanSuCl(formBean.getYuanSuClJunPin1());
			daoBean.setYuanSuC(formBean.getYuanSuCJunPin1());
			daoBean.setYuanSuN(formBean.getYuanSuNJunPin1());
			daoBean.setYuanSuO(formBean.getYuanSuOJunPin1());
			daoBean.setYuanSuH(formBean.getYuanSuHJunPin1());
			daoBean.setYuanSuMn(formBean.getYuanSuMnJunPin1());
			daoBean.setYuanSuHb(formBean.getYuanSuHbJunPin1());
			daoBean.setDengJiHanMeng(formBean.getDengJiHanMengJunPin1());
			daoBean.setKaoHeDengJiChuMeng(formBean.getKaoHeDengJiChuMengJunPin1());
			daoBean.setGongYiTiaoZheng(formBean.getGongYiTiaoZhengJunPin1());
			daoBean.setGongYiShiYan(formBean.getGongYiShiYanJunPin1());
			daoBean.setDiPiKg(formBean.getDiPiKgJunPin1());
			daoBean.setShangMaoKg(formBean.getShangMaoKgJunPin1());
			daoBean.setPaBiKg(formBean.getPaBiKgJunPin1());
			daoBean.setFeiDiPiKg(formBean.getFeiDiPiKgJunPin1());
			daoBean.setFeiShangMaoKg(formBean.getFeiShangMaoKgJunPin1());
			daoBean.setFeiPaBiKg(formBean.getFeiPaBiKgJunPin1());
			daoBean.setFeiTaiFenKg(formBean.getFeiTaiFenKgJunPin1());
			daoBean.setCiYuanKg(formBean.getCiYuanKgJunPin1());
			daoBean.setShouXuanFeiLiaoKg(formBean.getShouXuanFeiLiaoKgJunPin1());
			daoBean.setSunHaoKg(formBean.getSunHaoKgJunPin1());
			daoBean.setZongPaiMeiLiangKg(formBean.getZongPaiMeiLiangKgJunPin1());
			daoBean.setChuLuZhenKongDu(formBean.getChuLuZhenKongDuJunPin1());
			daoBean.setYuanZuiGaoWenDu(formBean.getYuanZuiGaoWenDuJunPin1());
			daoBean.setZhengLiuGaoHengDian(formBean.getZhengLiuGaoHengDianJunPin1());
			daoBean.setZhuanZhengLiu(formBean.getZhuanZhengLiuJunPin1());
			daoBean.setJiaShouCi(formBean.getJiaShouCiJunPin1());
			daoBean.setJiaMoCi(formBean.getJiaMoCiJunPin1());
			daoBean.setTongDao(formBean.getTongDaoJunPin1());
			daoBean.setShengChanGuZhang(formBean.getShengChanGuZhangJunPin1());
			daoBean.setBeiZhuShuoMing(formBean.getBeiZhuShuoMingJunPin1());
			break;
		case 3:
			daoBean.setYear(formBean.getYearJunPin2());
			daoBean.setMonth(formBean.getMonthJunPin2());
			daoBean.setDay(formBean.getDayJunPin2());
			daoBean.setYearMonthDay(formBean.getYearMonthDayJunPin2());
			daoBean.setQiHao(formBean.getQiHaoJunPin2());
			daoBean.setLuCi(formBean.getLuCiJunPin2());
			daoBean.setGuiGe(formBean.getGuiGeJunPin2());
			daoBean.setShengChanLuHao(formBean.getShengChanLuHaoJunPin2());
			daoBean.setFanYingQiHao(formBean.getFanYingQiHaoJunPin2());
			daoBean.setShiYongCiShu(formBean.getShiYongCiShuJunPin2());
			daoBean.setMg(formBean.getMgJunPin2());
			daoBean.setTiCl4(formBean.getTiCl4JunPin2());
			daoBean.setMaoZhong(formBean.getMaoZhongJunPin2());
			daoBean.setJingZhong(formBean.getJingZhongJunPin2());
			daoBean.setChengPinLv(formBean.getChengPinLvJunPin2());
			daoBean.setYuanSuFe(formBean.getYuanSuFeJunPin2());
			daoBean.setYuanSuSi(formBean.getYuanSuSiJunPin2());
			daoBean.setYuanSuCl(formBean.getYuanSuClJunPin2());
			daoBean.setYuanSuC(formBean.getYuanSuCJunPin2());
			daoBean.setYuanSuN(formBean.getYuanSuNJunPin2());
			daoBean.setYuanSuO(formBean.getYuanSuOJunPin2());
			daoBean.setYuanSuH(formBean.getYuanSuHJunPin2());
			daoBean.setYuanSuMn(formBean.getYuanSuMnJunPin2());
			daoBean.setYuanSuHb(formBean.getYuanSuHbJunPin2());
			daoBean.setDengJiHanMeng(formBean.getDengJiHanMengJunPin2());
			daoBean.setKaoHeDengJiChuMeng(formBean.getKaoHeDengJiChuMengJunPin2());
			daoBean.setGongYiTiaoZheng(formBean.getGongYiTiaoZhengJunPin2());
			daoBean.setGongYiShiYan(formBean.getGongYiShiYanJunPin2());
			daoBean.setDiPiKg(formBean.getDiPiKgJunPin2());
			daoBean.setShangMaoKg(formBean.getShangMaoKgJunPin2());
			daoBean.setPaBiKg(formBean.getPaBiKgJunPin2());
			daoBean.setFeiDiPiKg(formBean.getFeiDiPiKgJunPin2());
			daoBean.setFeiShangMaoKg(formBean.getFeiShangMaoKgJunPin2());
			daoBean.setFeiPaBiKg(formBean.getFeiPaBiKgJunPin2());
			daoBean.setFeiTaiFenKg(formBean.getFeiTaiFenKgJunPin2());
			daoBean.setCiYuanKg(formBean.getCiYuanKgJunPin2());
			daoBean.setShouXuanFeiLiaoKg(formBean.getShouXuanFeiLiaoKgJunPin2());
			daoBean.setSunHaoKg(formBean.getSunHaoKgJunPin2());
			daoBean.setZongPaiMeiLiangKg(formBean.getZongPaiMeiLiangKgJunPin2());
			daoBean.setChuLuZhenKongDu(formBean.getChuLuZhenKongDuJunPin2());
			daoBean.setYuanZuiGaoWenDu(formBean.getYuanZuiGaoWenDuJunPin2());
			daoBean.setZhengLiuGaoHengDian(formBean.getZhengLiuGaoHengDianJunPin2());
			daoBean.setZhuanZhengLiu(formBean.getZhuanZhengLiuJunPin2());
			daoBean.setJiaShouCi(formBean.getJiaShouCiJunPin2());
			daoBean.setJiaMoCi(formBean.getJiaMoCiJunPin2());
			daoBean.setTongDao(formBean.getTongDaoJunPin2());
			daoBean.setShengChanGuZhang(formBean.getShengChanGuZhangJunPin2());
			daoBean.setBeiZhuShuoMing(formBean.getBeiZhuShuoMingJunPin2());
			break;
		default:
			break;
		}
		return daoBean;
	}
}
