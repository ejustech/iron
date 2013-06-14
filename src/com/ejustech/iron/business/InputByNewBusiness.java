package com.ejustech.iron.business;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;
import org.apache.struts.chain.commands.servlet.ValidateActionForm;

import com.ejustech.iron.common.Constant;
import com.ejustech.iron.common.IronEnum.ErrorType;
import com.ejustech.iron.common.IronEnum.UserRole;
import com.ejustech.iron.common.IronEnum.ValidateStatusInput;
import com.ejustech.iron.common.StringHelper;
import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.form.InputByNewForm;

public class InputByNewBusiness {
	public ValidateStatusInput check(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		ValidateStatusInput checkResult = ValidateStatusInput.OK;

		// 空值的验证
		checkResult = checkEmptyByRole(inputByNewFormBean, userRole);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 长度的验证
		checkResult = checkLength(inputByNewFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 数字格式的验证
		checkResult = checkNumberFormat(inputByNewFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 日期格式的验证
		checkResult = checkDateFormat(inputByNewFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		return ValidateStatusInput.OK;
	}

	public ArrayList<ValidateStatusInput> checkAllForSave(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		ArrayList<ValidateStatusInput> checkEmptyByRole = checkEmptyByRoleAllForSave(inputByNewFormBean, userRole);
		ArrayList<ValidateStatusInput> checkLength = checkLengthAll(inputByNewFormBean);
		ArrayList<ValidateStatusInput> checkNumberFormat = checkNumberFormatAll(inputByNewFormBean);
		ArrayList<ValidateStatusInput> checkDateFormat = checkDateFormatAll(inputByNewFormBean);

		// 输入项目空值的验证
		if (checkEmptyByRole.size() != 0) {
			checkResult.addAll(checkEmptyByRole);
		}

		// 输入项目长度的验证
		if (checkLength.size() != 0) {
			checkResult.addAll(checkLength);
		}

		// 输入项目数字格式的验证
		if (checkNumberFormat.size() != 0) {
			checkResult.addAll(checkNumberFormat);
		}

		// 输入项目日期格式的验证
		if (checkDateFormat.size() != 0) {
			checkResult.addAll(checkDateFormat);
		}
		return checkResult;
	}
	
//	public ArrayList<ValidateStatusInput> checkAllForCommit(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
//		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();
//
//		ArrayList<ValidateStatusInput> checkEmptyByRole = checkEmptyByRoleAllForCommit(inputByNewFormBean, userRole);
//		ArrayList<ValidateStatusInput> checkLength = checkLengthAll(inputByNewFormBean);
//		ArrayList<ValidateStatusInput> checkNumberFormat = checkNumberFormatAll(inputByNewFormBean);
//		ArrayList<ValidateStatusInput> checkDateFormat = checkDateFormatAll(inputByNewFormBean);
//
//		// 输入项目空值的验证
//		if (checkEmptyByRole.size() != 0) {
//			checkResult.addAll(checkEmptyByRole);
//		}
//
//		// 输入项目长度的验证
//		if (checkLength.size() != 0) {
//			checkResult.addAll(checkLength);
//		}
//
//		// 输入项目数字格式的验证
//		if (checkNumberFormat.size() != 0) {
//			checkResult.addAll(checkNumberFormat);
//		}
//
//		// 输入项目日期格式的验证
//		if (checkDateFormat.size() != 0) {
//			checkResult.addAll(checkDateFormat);
//		}
//		return checkResult;
//	}

	private ValidateStatusInput checkDateFormat(InputByNewFormBean inputByNewFormBean) {
		if (!StringHelper.isDateFormat(inputByNewFormBean.getYearMonthDay())) {
			return ValidateStatusInput.DATE_FORMAT_YearMonthDay;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkDateFormatAll(InputByNewFormBean inputByNewFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && !StringHelper.isDateFormat(inputByNewFormBean.getYearMonthDay())) {
			checkResult.add(ValidateStatusInput.DATE_FORMAT_YearMonthDay);
		}

		return checkResult;
	}

	private ValidateStatusInput checkEmptyByRole(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYearMonthDay())) {
				return ValidateStatusInput.EMPTY_YearMonthDay;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getQiHao())) {
				return ValidateStatusInput.EMPTY_QiHao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getLuCi())) {
				return ValidateStatusInput.EMPTY_LuCi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGuiGe())) {
				return ValidateStatusInput.EMPTY_GuiGe;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShengChanLuHao())) {
				return ValidateStatusInput.EMPTY_ShengChanLuHao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFanYingQiHao())) {
				return ValidateStatusInput.EMPTY_FanYingQiHao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShiYongCiShu())) {
				return ValidateStatusInput.EMPTY_ShiYongCiShu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getMg())) {
				return ValidateStatusInput.EMPTY_Mg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getTiCl4())) {
				return ValidateStatusInput.EMPTY_TiCl4;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getMaoZhong())) {
				return ValidateStatusInput.EMPTY_MaoZhong;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJingZhong())) {
				return ValidateStatusInput.EMPTY_JingZhong;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getChengPinLv())) {
				return ValidateStatusInput.EMPTY_ChengPinLv;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuFe())) {
				return ValidateStatusInput.EMPTY_YuanSuFe;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuSi())) {
				return ValidateStatusInput.EMPTY_YuanSuSi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuCl())) {
				return ValidateStatusInput.EMPTY_YuanSuCl;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuC())) {
				return ValidateStatusInput.EMPTY_YuanSuC;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuN())) {
				return ValidateStatusInput.EMPTY_YuanSuN;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuO())) {
				return ValidateStatusInput.EMPTY_YuanSuO;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuH())) {
				return ValidateStatusInput.EMPTY_YuanSuH;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuMn())) {
				return ValidateStatusInput.EMPTY_YuanSuMn;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuHb())) {
				return ValidateStatusInput.EMPTY_YuanSuHb;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getDengJiHanMeng())) {
				return ValidateStatusInput.EMPTY_DengJiHanMeng;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
				return ValidateStatusInput.EMPTY_KaoHeDengJiChuMeng;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGongYiTiaoZheng())) {
				return ValidateStatusInput.EMPTY_GongYiTiaoZheng;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGongYiShiYan())) {
				return ValidateStatusInput.EMPTY_GongYiShiYan;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getDiPiKg())) {
				return ValidateStatusInput.EMPTY_DiPiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShangMaoKg())) {
				return ValidateStatusInput.EMPTY_ShangMaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getPaBiKg())) {
				return ValidateStatusInput.EMPTY_PaBiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiDiPiKg())) {
				return ValidateStatusInput.EMPTY_FeiDiPiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiShangMaoKg())) {
				return ValidateStatusInput.EMPTY_FeiShangMaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiPaBiKg())) {
				return ValidateStatusInput.EMPTY_FeiPaBiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiTaiFenKg())) {
				return ValidateStatusInput.EMPTY_FeiTaiFenKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getCiYuanKg())) {
				return ValidateStatusInput.EMPTY_CiYuanKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
				return ValidateStatusInput.EMPTY_ShouXuanFeiLiaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getSunHaoKg())) {
				return ValidateStatusInput.EMPTY_SunHaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZongPaiMeiLiangKg())) {
				return ValidateStatusInput.EMPTY_ZongPaiMeiLiangKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getChuLuZhenKongDu())) {
				return ValidateStatusInput.EMPTY_ChuLuZhenKongDu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanZuiGaoWenDu())) {
				return ValidateStatusInput.EMPTY_YuanZuiGaoWenDu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZhengLiuGaoHengDian())) {
				return ValidateStatusInput.EMPTY_ZhengLiuGaoHengDian;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZhuanZhengLiu())) {
				return ValidateStatusInput.EMPTY_ZhuanZhengLiu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJiaShouCi())) {
				return ValidateStatusInput.EMPTY_JiaShouCi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJiaMoCi())) {
				return ValidateStatusInput.EMPTY_JiaMoCi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getTongDao())) {
				return ValidateStatusInput.EMPTY_TongDao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShengChanGuZhang())) {
				return ValidateStatusInput.EMPTY_ShengChanGuZhang;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getBeiZhuShuoMing())) {
				return ValidateStatusInput.EMPTY_BeiZhuShuoMing;
			}
			break;
		default:
			break;
		}
		return ValidateStatusInput.OK;
	}

//	private ArrayList<ValidateStatusInput> checkEmptyByRoleAllForCommit(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
//		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();
//
//		switch (userRole) {
//		case R0:
//
//			break;
//		case R1:
//
//			break;
//		case R2:
//
//			break;
//		case R3:
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getYearMonthDay())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YearMonthDay);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getQiHao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_QiHao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getLuCi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_LuCi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getGuiGe())) {
//				checkResult.add(ValidateStatusInput.EMPTY_GuiGe);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShengChanLuHao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShengChanLuHao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFanYingQiHao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FanYingQiHao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShiYongCiShu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShiYongCiShu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getMg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_Mg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getTiCl4())) {
//				checkResult.add(ValidateStatusInput.EMPTY_TiCl4);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getMaoZhong())) {
//				checkResult.add(ValidateStatusInput.EMPTY_MaoZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJingZhong())) {
//				checkResult.add(ValidateStatusInput.EMPTY_JingZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getChengPinLv())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ChengPinLv);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuFe())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuFe);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuSi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuSi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuCl())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuCl);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuC())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuC);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuN())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuN);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuO())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuO);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuH())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuH);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuMn())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuMn);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuHb())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuHb);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getDengJiHanMeng())) {
//				checkResult.add(ValidateStatusInput.EMPTY_DengJiHanMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
//				checkResult.add(ValidateStatusInput.EMPTY_KaoHeDengJiChuMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getGongYiTiaoZheng())) {
//				checkResult.add(ValidateStatusInput.EMPTY_GongYiTiaoZheng);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getGongYiShiYan())) {
//				checkResult.add(ValidateStatusInput.EMPTY_GongYiShiYan);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getDiPiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_DiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShangMaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getPaBiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_PaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiDiPiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiDiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiShangMaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiPaBiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiPaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiTaiFenKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiTaiFenKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getCiYuanKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_CiYuanKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShouXuanFeiLiaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getSunHaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_SunHaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getZongPaiMeiLiangKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ZongPaiMeiLiangKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getChuLuZhenKongDu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ChuLuZhenKongDu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getYuanZuiGaoWenDu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanZuiGaoWenDu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getZhengLiuGaoHengDian())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ZhengLiuGaoHengDian);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getZhuanZhengLiu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ZhuanZhengLiu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getJiaShouCi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_JiaShouCi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getJiaMoCi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_JiaMoCi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getTongDao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_TongDao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShengChanGuZhang())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShengChanGuZhang);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getBeiZhuShuoMing())) {
//				checkResult.add(ValidateStatusInput.EMPTY_BeiZhuShuoMing);
//			}
//			break;
//		default:
//			break;
//		}
//		return checkResult;
//	}

	private ArrayList<ValidateStatusInput> checkEmptyByRoleAllForSave(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getYearMonthDay())) {
				checkResult.add(ValidateStatusInput.EMPTY_YearMonthDay);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getQiHao())) {
				checkResult.add(ValidateStatusInput.EMPTY_QiHao);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getLuCi())) {
				checkResult.add(ValidateStatusInput.EMPTY_LuCi);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGuiGe())) {
				checkResult.add(ValidateStatusInput.EMPTY_GuiGe);
			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShengChanLuHao())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ShengChanLuHao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFanYingQiHao())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_FanYingQiHao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShiYongCiShu())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ShiYongCiShu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getMg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_Mg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getTiCl4())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_TiCl4);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getMaoZhong())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_MaoZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJingZhong())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_JingZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getChengPinLv())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ChengPinLv);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuFe())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuFe);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuSi())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuSi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuCl())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuCl);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuC())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuC);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuN())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuN);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuO())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuO);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuH())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuH);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuMn())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuMn);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuHb())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuHb);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getDengJiHanMeng())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_DengJiHanMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_KaoHeDengJiChuMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getGongYiTiaoZheng())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_GongYiTiaoZheng);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getGongYiShiYan())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_GongYiShiYan);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getDiPiKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_DiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShangMaoKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getPaBiKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_PaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiDiPiKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiDiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiShangMaoKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiPaBiKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiPaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getFeiTaiFenKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiTaiFenKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getCiYuanKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_CiYuanKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ShouXuanFeiLiaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getSunHaoKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_SunHaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getZongPaiMeiLiangKg())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ZongPaiMeiLiangKg);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getChuLuZhenKongDu())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ChuLuZhenKongDu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getYuanZuiGaoWenDu())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanZuiGaoWenDu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getZhengLiuGaoHengDian())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ZhengLiuGaoHengDian);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getZhuanZhengLiu())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ZhuanZhengLiu);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getJiaShouCi())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_JiaShouCi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getJiaMoCi())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_JiaMoCi);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getTongDao())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_TongDao);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByNewFormBean.getShengChanGuZhang())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_ShengChanGuZhang);
//			}
//			if (StringHelper.isNullEmpty(inputByNewFormBean.getBeiZhuShuoMing())) {
//				checkResult.add(ValidateStatusInputByNew.EMPTY_BeiZhuShuoMing);
//			}
			break;
		default:
			break;
		}
		return checkResult;
	}
	
	private ValidateStatusInput checkLength(InputByNewFormBean inputByNewFormBean) {
		if (StringHelper.isLenGreater(inputByNewFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			return ValidateStatusInput.LENGTH_YearMonthDay;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			return ValidateStatusInput.LENGTH_QiHao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			return ValidateStatusInput.LENGTH_LuCi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			return ValidateStatusInput.LENGTH_GuiGe;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			return ValidateStatusInput.LENGTH_ShengChanLuHao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			return ValidateStatusInput.LENGTH_FanYingQiHao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			return ValidateStatusInput.LENGTH_ShiYongCiShu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			return ValidateStatusInput.LENGTH_Mg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			return ValidateStatusInput.LENGTH_TiCl4;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			return ValidateStatusInput.LENGTH_MaoZhong;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			return ValidateStatusInput.LENGTH_JingZhong;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			return ValidateStatusInput.LENGTH_ChengPinLv;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			return ValidateStatusInput.LENGTH_YuanSuFe;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			return ValidateStatusInput.LENGTH_YuanSuSi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			return ValidateStatusInput.LENGTH_YuanSuCl;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			return ValidateStatusInput.LENGTH_YuanSuC;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			return ValidateStatusInput.LENGTH_YuanSuN;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			return ValidateStatusInput.LENGTH_YuanSuO;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			return ValidateStatusInput.LENGTH_YuanSuH;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			return ValidateStatusInput.LENGTH_YuanSuMn;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			return ValidateStatusInput.LENGTH_YuanSuHb;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			return ValidateStatusInput.LENGTH_DengJiHanMeng;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			return ValidateStatusInput.LENGTH_KaoHeDengJiChuMeng;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			return ValidateStatusInput.LENGTH_GongYiTiaoZheng;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			return ValidateStatusInput.LENGTH_GongYiShiYan;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			return ValidateStatusInput.LENGTH_DiPiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			return ValidateStatusInput.LENGTH_ShangMaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			return ValidateStatusInput.LENGTH_PaBiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			return ValidateStatusInput.LENGTH_FeiDiPiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			return ValidateStatusInput.LENGTH_FeiShangMaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			return ValidateStatusInput.LENGTH_FeiPaBiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			return ValidateStatusInput.LENGTH_FeiTaiFenKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			return ValidateStatusInput.LENGTH_CiYuanKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			return ValidateStatusInput.LENGTH_ShouXuanFeiLiaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			return ValidateStatusInput.LENGTH_SunHaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			return ValidateStatusInput.LENGTH_ZongPaiMeiLiangKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			return ValidateStatusInput.LENGTH_ChuLuZhenKongDu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			return ValidateStatusInput.LENGTH_YuanZuiGaoWenDu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhengLiuGaoHengDian(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			return ValidateStatusInput.LENGTH_ZhengLiuGaoHengDian;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			return ValidateStatusInput.LENGTH_ZhuanZhengLiu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			return ValidateStatusInput.LENGTH_JiaShouCi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			return ValidateStatusInput.LENGTH_JiaMoCi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			return ValidateStatusInput.LENGTH_TongDao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			return ValidateStatusInput.LENGTH_ShengChanGuZhang;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			return ValidateStatusInput.LENGTH_BeiZhuShuoMing;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkLengthAll(InputByNewFormBean inputByNewFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		if (StringHelper.isLenGreater(inputByNewFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			checkResult.add(ValidateStatusInput.LENGTH_YearMonthDay);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_QiHao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_LuCi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			checkResult.add(ValidateStatusInput.LENGTH_GuiGe);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShengChanLuHao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_FanYingQiHao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShiYongCiShu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			checkResult.add(ValidateStatusInput.LENGTH_Mg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			checkResult.add(ValidateStatusInput.LENGTH_TiCl4);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			checkResult.add(ValidateStatusInput.LENGTH_MaoZhong);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			checkResult.add(ValidateStatusInput.LENGTH_JingZhong);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			checkResult.add(ValidateStatusInput.LENGTH_ChengPinLv);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuFe);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuSi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuCl);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuC);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuN);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuO);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuH);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuMn);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuHb);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			checkResult.add(ValidateStatusInput.LENGTH_DengJiHanMeng);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			checkResult.add(ValidateStatusInput.LENGTH_KaoHeDengJiChuMeng);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			checkResult.add(ValidateStatusInput.LENGTH_GongYiTiaoZheng);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			checkResult.add(ValidateStatusInput.LENGTH_GongYiShiYan);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_DiPiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShangMaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_PaBiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiDiPiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiShangMaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiPaBiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiTaiFenKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_CiYuanKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShouXuanFeiLiaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_SunHaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZongPaiMeiLiangKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ChuLuZhenKongDu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanZuiGaoWenDu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhengLiuGaoHengDian(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZhengLiuGaoHengDian);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZhuanZhengLiu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_JiaShouCi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_JiaMoCi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			checkResult.add(ValidateStatusInput.LENGTH_TongDao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShengChanGuZhang);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			checkResult.add(ValidateStatusInput.LENGTH_BeiZhuShuoMing);
		}

		return checkResult;
	}

	private ValidateStatusInput checkNumberFormat(InputByNewFormBean inputByNewFormBean) {
		// if (!StringHelper.isNumber(inputByNewFormBean.getYearMonthDay())) {
		// return ValidateStatusInputByNew.NUMBER_FORMAT_YearMonthDay;
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getQiHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_QiHao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getLuCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_LuCi;
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getGuiGe())) {
		// return ValidateStatusInputByNew.NUMBER_FORMAT_GuiGe;
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanLuHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShengChanLuHao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFanYingQiHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_FanYingQiHao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShiYongCiShu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShiYongCiShu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMg())) {
			return ValidateStatusInput.NUMBER_FORMAT_Mg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTiCl4())) {
			return ValidateStatusInput.NUMBER_FORMAT_TiCl4;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMaoZhong())) {
			return ValidateStatusInput.NUMBER_FORMAT_MaoZhong;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJingZhong())) {
			return ValidateStatusInput.NUMBER_FORMAT_JingZhong;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChengPinLv())) {
			return ValidateStatusInput.NUMBER_FORMAT_ChengPinLv;
		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuFe())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuFe;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuSi())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuSi;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuCl())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuCl;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuC())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuC;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuN())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuN;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuO())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuO;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuH())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuH;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuMn())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuMn;
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuHb())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuHb;
//		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDengJiHanMeng())) {
			return ValidateStatusInput.NUMBER_FORMAT_DengJiHanMeng;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
			return ValidateStatusInput.NUMBER_FORMAT_KaoHeDengJiChuMeng;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiTiaoZheng())) {
			return ValidateStatusInput.NUMBER_FORMAT_GongYiTiaoZheng;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiShiYan())) {
			return ValidateStatusInput.NUMBER_FORMAT_GongYiShiYan;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDiPiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_DiPiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShangMaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShangMaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getPaBiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_PaBiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiDiPiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiDiPiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiShangMaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiShangMaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiPaBiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiPaBiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiTaiFenKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiTaiFenKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getCiYuanKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_CiYuanKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShouXuanFeiLiaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getSunHaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_SunHaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZongPaiMeiLiangKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZongPaiMeiLiangKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChuLuZhenKongDu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ChuLuZhenKongDu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanZuiGaoWenDu())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanZuiGaoWenDu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhengLiuGaoHengDian())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZhengLiuGaoHengDian;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhuanZhengLiu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZhuanZhengLiu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJiaShouCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_JiaShouCi;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJiaMoCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_JiaMoCi;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTongDao())) {
			return ValidateStatusInput.NUMBER_FORMAT_TongDao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanGuZhang())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShengChanGuZhang;
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getBeiZhuShuoMing())) {
		// return ValidateStatusInputByNew.NUMBER_FORMAT_BeiZhuShuoMing;
		// }
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkNumberFormatAll(InputByNewFormBean inputByNewFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();
		
		// if (!StringHelper.isNumber(inputByNewFormBean.getYearMonthDay())) {
		// checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YearMonthDay);
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getQiHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_QiHao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getLuCi())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_LuCi);
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getGuiGe())) {
		// checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_GuiGe);
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanLuHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShengChanLuHao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFanYingQiHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FanYingQiHao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShiYongCiShu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShiYongCiShu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_Mg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTiCl4())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_TiCl4);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMaoZhong())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_MaoZhong);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJingZhong())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JingZhong);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChengPinLv())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ChengPinLv);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuFe())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuFe);
		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuSi())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuSi);
//		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuCl())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuCl);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuC())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuC);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuN())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuN);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuO())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuO);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuH())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuH);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuMn())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuMn);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuHb())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuHb);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDengJiHanMeng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_DengJiHanMeng);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_KaoHeDengJiChuMeng);
		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiTiaoZheng())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_GongYiTiaoZheng);
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiShiYan())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_GongYiShiYan);
//		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDiPiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_DiPiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShangMaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShangMaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getPaBiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_PaBiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiDiPiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiDiPiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiShangMaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiShangMaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiPaBiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiPaBiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiTaiFenKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiTaiFenKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getCiYuanKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_CiYuanKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShouXuanFeiLiaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getSunHaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_SunHaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZongPaiMeiLiangKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZongPaiMeiLiangKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChuLuZhenKongDu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ChuLuZhenKongDu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanZuiGaoWenDu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanZuiGaoWenDu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhengLiuGaoHengDian())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZhengLiuGaoHengDian);
		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getZhuanZhengLiu())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZhuanZhengLiu);
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getJiaShouCi())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JiaShouCi);
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getJiaMoCi())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JiaMoCi);
//		}
//		if (!StringHelper.isNumber(inputByNewFormBean.getTongDao())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_TongDao);
//		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanGuZhang())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShengChanGuZhang);
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getBeiZhuShuoMing())) {
		// checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_BeiZhuShuoMing);
		// }
		checkResult.add(ValidateStatusInput.OK);
		
		return checkResult;
	}

	private TIronInfoDaoBean ConvToTIronInfoDaoBeanFromInputByNewFormBean(InputByNewFormBean formBean, int rowDataIndex) {
		TIronInfoDaoBean daoBean = new TIronInfoDaoBean();
		switch (rowDataIndex) {
        case 1:
            daoBean.setYearMonthDay(StringHelper.ISO8859Convert2UTF8(formBean.getYearMonthDay()));
            daoBean.setQiHao(StringHelper.ISO8859Convert2UTF8(formBean.getQiHao()));
            daoBean.setLuCi(StringHelper.ISO8859Convert2UTF8(formBean.getLuCi()));
            daoBean.setGuiGe(StringHelper.ISO8859Convert2UTF8(formBean.getGuiGe()));
            daoBean.setJunPin(StringHelper.ISO8859Convert2UTF8(formBean.getJunPin()));
            daoBean.setShengChanLuHao(StringHelper.ISO8859Convert2UTF8(formBean.getShengChanLuHao()));
            daoBean.setFanYingQiHao(StringHelper.ISO8859Convert2UTF8(formBean.getFanYingQiHao()));
            daoBean.setShiYongCiShu(StringHelper.ISO8859Convert2UTF8(formBean.getShiYongCiShu()));
            daoBean.setMg(StringHelper.ISO8859Convert2UTF8(formBean.getMg()));
            daoBean.setTiCl4(StringHelper.ISO8859Convert2UTF8(formBean.getTiCl4()));
            daoBean.setMaoZhong(StringHelper.ISO8859Convert2UTF8(formBean.getMaoZhong()));
            daoBean.setJingZhong(StringHelper.ISO8859Convert2UTF8(formBean.getJingZhong()));
            daoBean.setChengPinLv(StringHelper.ISO8859Convert2UTF8(formBean.getChengPinLv()));
            daoBean.setYuanSuFe(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuFe()));
            daoBean.setYuanSuSi(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuSi()));
            daoBean.setYuanSuCl(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuCl()));
            daoBean.setYuanSuC(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuC()));
            daoBean.setYuanSuN(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuN()));
            daoBean.setYuanSuO(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuO()));
            daoBean.setYuanSuH(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuH()));
            daoBean.setYuanSuMn(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuMn()));
            daoBean.setYuanSuHb(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuHb()));
            daoBean.setDengJiHanMeng(StringHelper.ISO8859Convert2UTF8(formBean.getDengJiHanMeng()));
            daoBean.setKaoHeDengJiChuMeng(StringHelper.ISO8859Convert2UTF8(formBean.getKaoHeDengJiChuMeng()));
            daoBean.setGongYiTiaoZheng(StringHelper.ISO8859Convert2UTF8(formBean.getGongYiTiaoZheng()));
            daoBean.setGongYiShiYan(StringHelper.ISO8859Convert2UTF8(formBean.getGongYiShiYan()));
            daoBean.setDiPiKg(StringHelper.ISO8859Convert2UTF8(formBean.getDiPiKg()));
            daoBean.setShangMaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getShangMaoKg()));
            daoBean.setPaBiKg(StringHelper.ISO8859Convert2UTF8(formBean.getPaBiKg()));
            daoBean.setFeiDiPiKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiDiPiKg()));
            daoBean.setFeiShangMaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiShangMaoKg()));
            daoBean.setFeiPaBiKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiPaBiKg()));
            daoBean.setFeiTaiFenKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiTaiFenKg()));
            daoBean.setCiYuanKg(StringHelper.ISO8859Convert2UTF8(formBean.getCiYuanKg()));
            daoBean.setShouXuanFeiLiaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getShouXuanFeiLiaoKg()));
            daoBean.setSunHaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getSunHaoKg()));
            daoBean.setZongPaiMeiLiangKg(StringHelper.ISO8859Convert2UTF8(formBean.getZongPaiMeiLiangKg()));
            daoBean.setChuLuZhenKongDu(StringHelper.ISO8859Convert2UTF8(formBean.getChuLuZhenKongDu()));
            daoBean.setYuanZuiGaoWenDu(StringHelper.ISO8859Convert2UTF8(formBean.getYuanZuiGaoWenDu()));
            daoBean.setZhengLiuGaoHengDian(StringHelper.ISO8859Convert2UTF8(formBean.getZhengLiuGaoHengDian()));
            daoBean.setZhuanZhengLiu(StringHelper.ISO8859Convert2UTF8(formBean.getZhuanZhengLiu()));
            daoBean.setJiaShouCi(StringHelper.ISO8859Convert2UTF8(formBean.getJiaShouCi()));
            daoBean.setJiaMoCi(StringHelper.ISO8859Convert2UTF8(formBean.getJiaMoCi()));
            daoBean.setTongDao(StringHelper.ISO8859Convert2UTF8(formBean.getTongDao()));
            daoBean.setShengChanGuZhang(StringHelper.ISO8859Convert2UTF8(formBean.getShengChanGuZhang()));
            daoBean.setBeiZhuShuoMing(StringHelper.ISO8859Convert2UTF8(formBean.getBeiZhuShuoMing()));
            break;
        case 2:
            daoBean.setYearMonthDay(StringHelper.ISO8859Convert2UTF8(formBean.getYearMonthDayJunPin1()));
            daoBean.setQiHao(StringHelper.ISO8859Convert2UTF8(formBean.getQiHaoJunPin1()));
            daoBean.setLuCi(StringHelper.ISO8859Convert2UTF8(formBean.getLuCiJunPin1()));
            daoBean.setGuiGe(StringHelper.ISO8859Convert2UTF8(formBean.getGuiGeJunPin1()));
            daoBean.setShengChanLuHao(StringHelper.ISO8859Convert2UTF8(formBean.getShengChanLuHaoJunPin1()));
            daoBean.setFanYingQiHao(StringHelper.ISO8859Convert2UTF8(formBean.getFanYingQiHaoJunPin1()));
            daoBean.setShiYongCiShu(StringHelper.ISO8859Convert2UTF8(formBean.getShiYongCiShuJunPin1()));
            daoBean.setMg(StringHelper.ISO8859Convert2UTF8(formBean.getMgJunPin1()));
            daoBean.setTiCl4(StringHelper.ISO8859Convert2UTF8(formBean.getTiCl4JunPin1()));
            daoBean.setMaoZhong(StringHelper.ISO8859Convert2UTF8(formBean.getMaoZhongJunPin1()));
            daoBean.setJingZhong(StringHelper.ISO8859Convert2UTF8(formBean.getJingZhongJunPin1()));
            daoBean.setChengPinLv(StringHelper.ISO8859Convert2UTF8(formBean.getChengPinLvJunPin1()));
            daoBean.setYuanSuFe(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuFeJunPin1()));
            daoBean.setYuanSuSi(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuSiJunPin1()));
            daoBean.setYuanSuCl(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuClJunPin1()));
            daoBean.setYuanSuC(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuCJunPin1()));
            daoBean.setYuanSuN(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuNJunPin1()));
            daoBean.setYuanSuO(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuOJunPin1()));
            daoBean.setYuanSuH(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuHJunPin1()));
            daoBean.setYuanSuMn(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuMnJunPin1()));
            daoBean.setYuanSuHb(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuHbJunPin1()));
            daoBean.setDengJiHanMeng(StringHelper.ISO8859Convert2UTF8(formBean.getDengJiHanMengJunPin1()));
            daoBean.setKaoHeDengJiChuMeng(StringHelper.ISO8859Convert2UTF8(formBean.getKaoHeDengJiChuMengJunPin1()));
            daoBean.setGongYiTiaoZheng(StringHelper.ISO8859Convert2UTF8(formBean.getGongYiTiaoZhengJunPin1()));
            daoBean.setGongYiShiYan(StringHelper.ISO8859Convert2UTF8(formBean.getGongYiShiYanJunPin1()));
            daoBean.setDiPiKg(StringHelper.ISO8859Convert2UTF8(formBean.getDiPiKgJunPin1()));
            daoBean.setShangMaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getShangMaoKgJunPin1()));
            daoBean.setPaBiKg(StringHelper.ISO8859Convert2UTF8(formBean.getPaBiKgJunPin1()));
            daoBean.setFeiDiPiKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiDiPiKgJunPin1()));
            daoBean.setFeiShangMaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiShangMaoKgJunPin1()));
            daoBean.setFeiPaBiKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiPaBiKgJunPin1()));
            daoBean.setFeiTaiFenKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiTaiFenKgJunPin1()));
            daoBean.setCiYuanKg(StringHelper.ISO8859Convert2UTF8(formBean.getCiYuanKgJunPin1()));
            daoBean.setShouXuanFeiLiaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getShouXuanFeiLiaoKgJunPin1()));
            daoBean.setSunHaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getSunHaoKgJunPin1()));
            daoBean.setZongPaiMeiLiangKg(StringHelper.ISO8859Convert2UTF8(formBean.getZongPaiMeiLiangKgJunPin1()));
            daoBean.setChuLuZhenKongDu(StringHelper.ISO8859Convert2UTF8(formBean.getChuLuZhenKongDuJunPin1()));
            daoBean.setYuanZuiGaoWenDu(StringHelper.ISO8859Convert2UTF8(formBean.getYuanZuiGaoWenDuJunPin1()));
            daoBean.setZhengLiuGaoHengDian(StringHelper.ISO8859Convert2UTF8(formBean.getZhengLiuGaoHengDianJunPin1()));
            daoBean.setZhuanZhengLiu(StringHelper.ISO8859Convert2UTF8(formBean.getZhuanZhengLiuJunPin1()));
            daoBean.setJiaShouCi(StringHelper.ISO8859Convert2UTF8(formBean.getJiaShouCiJunPin1()));
            daoBean.setJiaMoCi(StringHelper.ISO8859Convert2UTF8(formBean.getJiaMoCiJunPin1()));
            daoBean.setTongDao(StringHelper.ISO8859Convert2UTF8(formBean.getTongDaoJunPin1()));
            daoBean.setShengChanGuZhang(StringHelper.ISO8859Convert2UTF8(formBean.getShengChanGuZhangJunPin1()));
            daoBean.setBeiZhuShuoMing(StringHelper.ISO8859Convert2UTF8(formBean.getBeiZhuShuoMingJunPin1()));
            break;
        case 3:
            daoBean.setYearMonthDay(StringHelper.ISO8859Convert2UTF8(formBean.getYearMonthDayJunPin2()));
            daoBean.setQiHao(StringHelper.ISO8859Convert2UTF8(formBean.getQiHaoJunPin2()));
            daoBean.setLuCi(StringHelper.ISO8859Convert2UTF8(formBean.getLuCiJunPin2()));
            daoBean.setGuiGe(StringHelper.ISO8859Convert2UTF8(formBean.getGuiGeJunPin2()));
            daoBean.setShengChanLuHao(StringHelper.ISO8859Convert2UTF8(formBean.getShengChanLuHaoJunPin2()));
            daoBean.setFanYingQiHao(StringHelper.ISO8859Convert2UTF8(formBean.getFanYingQiHaoJunPin2()));
            daoBean.setShiYongCiShu(StringHelper.ISO8859Convert2UTF8(formBean.getShiYongCiShuJunPin2()));
            daoBean.setMg(StringHelper.ISO8859Convert2UTF8(formBean.getMgJunPin2()));
            daoBean.setTiCl4(StringHelper.ISO8859Convert2UTF8(formBean.getTiCl4JunPin2()));
            daoBean.setMaoZhong(StringHelper.ISO8859Convert2UTF8(formBean.getMaoZhongJunPin2()));
            daoBean.setJingZhong(StringHelper.ISO8859Convert2UTF8(formBean.getJingZhongJunPin2()));
            daoBean.setChengPinLv(StringHelper.ISO8859Convert2UTF8(formBean.getChengPinLvJunPin2()));
            daoBean.setYuanSuFe(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuFeJunPin2()));
            daoBean.setYuanSuSi(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuSiJunPin2()));
            daoBean.setYuanSuCl(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuClJunPin2()));
            daoBean.setYuanSuC(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuCJunPin2()));
            daoBean.setYuanSuN(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuNJunPin2()));
            daoBean.setYuanSuO(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuOJunPin2()));
            daoBean.setYuanSuH(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuHJunPin2()));
            daoBean.setYuanSuMn(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuMnJunPin2()));
            daoBean.setYuanSuHb(StringHelper.ISO8859Convert2UTF8(formBean.getYuanSuHbJunPin2()));
            daoBean.setDengJiHanMeng(StringHelper.ISO8859Convert2UTF8(formBean.getDengJiHanMengJunPin2()));
            daoBean.setKaoHeDengJiChuMeng(StringHelper.ISO8859Convert2UTF8(formBean.getKaoHeDengJiChuMengJunPin2()));
            daoBean.setGongYiTiaoZheng(StringHelper.ISO8859Convert2UTF8(formBean.getGongYiTiaoZhengJunPin2()));
            daoBean.setGongYiShiYan(StringHelper.ISO8859Convert2UTF8(formBean.getGongYiShiYanJunPin2()));
            daoBean.setDiPiKg(StringHelper.ISO8859Convert2UTF8(formBean.getDiPiKgJunPin2()));
            daoBean.setShangMaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getShangMaoKgJunPin2()));
            daoBean.setPaBiKg(StringHelper.ISO8859Convert2UTF8(formBean.getPaBiKgJunPin2()));
            daoBean.setFeiDiPiKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiDiPiKgJunPin2()));
            daoBean.setFeiShangMaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiShangMaoKgJunPin2()));
            daoBean.setFeiPaBiKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiPaBiKgJunPin2()));
            daoBean.setFeiTaiFenKg(StringHelper.ISO8859Convert2UTF8(formBean.getFeiTaiFenKgJunPin2()));
            daoBean.setCiYuanKg(StringHelper.ISO8859Convert2UTF8(formBean.getCiYuanKgJunPin2()));
            daoBean.setShouXuanFeiLiaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getShouXuanFeiLiaoKgJunPin2()));
            daoBean.setSunHaoKg(StringHelper.ISO8859Convert2UTF8(formBean.getSunHaoKgJunPin2()));
            daoBean.setZongPaiMeiLiangKg(StringHelper.ISO8859Convert2UTF8(formBean.getZongPaiMeiLiangKgJunPin2()));
            daoBean.setChuLuZhenKongDu(StringHelper.ISO8859Convert2UTF8(formBean.getChuLuZhenKongDuJunPin2()));
            daoBean.setYuanZuiGaoWenDu(StringHelper.ISO8859Convert2UTF8(formBean.getYuanZuiGaoWenDuJunPin2()));
            daoBean.setZhengLiuGaoHengDian(StringHelper.ISO8859Convert2UTF8(formBean.getZhengLiuGaoHengDianJunPin2()));
            daoBean.setZhuanZhengLiu(StringHelper.ISO8859Convert2UTF8(formBean.getZhuanZhengLiuJunPin2()));
            daoBean.setJiaShouCi(StringHelper.ISO8859Convert2UTF8(formBean.getJiaShouCiJunPin2()));
            daoBean.setJiaMoCi(StringHelper.ISO8859Convert2UTF8(formBean.getJiaMoCiJunPin2()));
            daoBean.setTongDao(StringHelper.ISO8859Convert2UTF8(formBean.getTongDaoJunPin2()));
            daoBean.setShengChanGuZhang(StringHelper.ISO8859Convert2UTF8(formBean.getShengChanGuZhangJunPin2()));
            daoBean.setBeiZhuShuoMing(StringHelper.ISO8859Convert2UTF8(formBean.getBeiZhuShuoMingJunPin2()));
            break;
        default:
            break;
		}
		return daoBean;
	}

	private InputByNewFormBean getInputByNewFormBeanFromForm(InputByNewForm form, int index) {
		if (form != null) {
			return (InputByNewFormBean) form.getInputByNewList().get(index);
		}
		return null;
	}

	private void log(InputByNewFormBean inputByNewFormBean) {
		System.out.println("年月日:" + inputByNewFormBean.getYearMonthDay());
		System.out.println("期号:" + inputByNewFormBean.getQiHao());
		System.out.println("炉次:" + inputByNewFormBean.getLuCi());
		System.out.println("规格:" + inputByNewFormBean.getGuiGe());
		System.out.println("生产炉号:" + inputByNewFormBean.getShengChanLuHao());
		System.out.println("反应器号:" + inputByNewFormBean.getFanYingQiHao());

		System.out.println("年月日军品1:" + inputByNewFormBean.getYearMonthDayJunPin1());
		System.out.println("期号军品1:" + inputByNewFormBean.getQiHaoJunPin1());
		System.out.println("炉次军品1:" + inputByNewFormBean.getLuCi());
		System.out.println("炉次军品1:" + inputByNewFormBean.getLuCiJunPin1());
		System.out.println("规格军品1:" + inputByNewFormBean.getGuiGeJunPin1());
		System.out.println("生产炉号军品1:" + inputByNewFormBean.getShengChanLuHaoJunPin1());
		System.out.println("反应器号军品1:" + inputByNewFormBean.getFanYingQiHaoJunPin1());

		System.out.println("年月日军品2:" + inputByNewFormBean.getYearMonthDayJunPin2());
		System.out.println("期号军品2:" + inputByNewFormBean.getQiHaoJunPin2());
		System.out.println("炉次军品2:" + inputByNewFormBean.getLuCi());
		System.out.println("炉次军品2:" + inputByNewFormBean.getLuCiJunPin2());
		System.out.println("规格军品2:" + inputByNewFormBean.getGuiGeJunPin2());
		System.out.println("生产炉号军品2:" + inputByNewFormBean.getShengChanLuHaoJunPin2());
		System.out.println("反应器号军品2:" + inputByNewFormBean.getFanYingQiHaoJunPin2());
	}

	public Boolean Save(ActionForm form) throws Exception {
		TIronInfoDao dao = new TIronInfoDao();
		try {
			if (form != null) {
				InputByNewForm inputByNewForm = (InputByNewForm) form;
				InputByNewFormBean inputByNewFormBean;
				TIronInfoDaoBean tIronInfoDaoBean;
				dao.Open();
				dao.BeginTrans();
				// 信息输入画面，默认10条数据 循环
				String tmpLuci = "";
				String tmpYearMonthDay = "";
				for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
					// 信息输入画面Form取得FormBean
					inputByNewFormBean = getInputByNewFormBeanFromForm(inputByNewForm, i);
					//log(inputByNewFormBean);
					// 1：常规数据 2:军品1 3：军品2
					// FormBean转化成DaoBean				
					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByNewFormBean(inputByNewFormBean, 1);
					
					if (i % 3 == 0) {
						tmpLuci = tIronInfoDaoBean.getLuCi();
					} else {
						tIronInfoDaoBean.setLuCi(tmpLuci);
					}
					
					if (i % 3 == 0) {
						tmpYearMonthDay = tIronInfoDaoBean.getYearMonthDay();
					} else {
						tIronInfoDaoBean.setYearMonthDay(tmpYearMonthDay);
					}
					
					if (null != tIronInfoDaoBean.getLuCi() && !"".equals(tIronInfoDaoBean.getLuCi()) && null != tIronInfoDaoBean.getGuiGe()
							&& !"".equals(tIronInfoDaoBean.getGuiGe())) {
						// 炉次和规格都不为空时，登陆。
						
//						if (dao.QueryCountByLuci(tIronInfoDaoBean.getLuCi())) {
//							throw new Exception("已存在相同的炉次：" + tIronInfoDaoBean.getLuCi() +"，请确认修改后重新保存。");
//						}
						
						dao.Insert(tIronInfoDaoBean);
					}
				}
				dao.UpdateJunPinNotInput();
				dao.UpdateYue();
				dao.UpdateFlag();
				dao.Commit();
				dao.Close();
			}

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			dao.Rollback();
			dao.Close();
			throw e;
			//return false;
		}
	}
//
//	public Boolean Commit(ActionForm form) {
//		TIronInfoDao dao = new TIronInfoDao();
//		try {
//			if (form != null) {
//				InputByNewForm inputByNewForm = (InputByNewForm) form;
//				InputByNewFormBean inputByNewFormBean;
//				TIronInfoDaoBean tIronInfoDaoBean;
//				dao.Open();
//				dao.BeginTrans();
//				// 信息输入画面，默认10条数据 循环
//				String tmpLuci = "";
//				String tmpYearMonthDay = "";
//				for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
//					// 信息输入画面Form取得FormBean
//					inputByNewFormBean = getInputByNewFormBeanFromForm(inputByNewForm, i);
//					//log(inputByNewFormBean);
//					// 1：常规数据 2:军品1 3：军品2
//					// FormBean转化成DaoBean				
//					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByNewFormBean(inputByNewFormBean, 1);
//					
//					if (i % 3 == 0) {
//						tmpLuci = tIronInfoDaoBean.getLuCi();
//					} else {
//						tIronInfoDaoBean.setLuCi(tmpLuci);
//					}
//					
//					if (i % 3 == 0) {
//						tmpYearMonthDay = tIronInfoDaoBean.getYearMonthDay();
//					} else {
//						tIronInfoDaoBean.setYearMonthDay(tmpYearMonthDay);
//					}
//					
//					if (null != tIronInfoDaoBean.getLuCi() && !"".equals(tIronInfoDaoBean.getLuCi()) && null != tIronInfoDaoBean.getGuiGe()
//							&& !"".equals(tIronInfoDaoBean.getGuiGe())) {
//						// 炉次和规格都不为空时，登陆。
//						dao.Insert(tIronInfoDaoBean);
//					}
//				}
//				dao.UpdateJunPinNotInput();
//				dao.UpdateYue();
//				dao.Commit();
//				dao.Close();
//			}
//
//			return true;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			dao.Rollback();
//			dao.Close();
//			return false;
//		}
//	}
	
	public ErrorType getErrorType(ValidateStatusInput errorStatus) {
		switch (errorStatus) {
		case EMPTY_YearMonthDay:
			return ErrorType.EMPTY;
		case EMPTY_QiHao:
			return ErrorType.EMPTY;
		case EMPTY_LuCi:
			return ErrorType.EMPTY;
		case EMPTY_JunPinFlg:
			return ErrorType.EMPTY;
		case EMPTY_GuiGe:
			return ErrorType.EMPTY;
		case EMPTY_ShengChanLuHao:
			return ErrorType.EMPTY;
		case EMPTY_FanYingQiHao:
			return ErrorType.EMPTY;
		case EMPTY_ShiYongCiShu:
			return ErrorType.EMPTY;
		case EMPTY_Mg:
			return ErrorType.EMPTY;
		case EMPTY_TiCl4:
			return ErrorType.EMPTY;
		case EMPTY_MaoZhong:
			return ErrorType.EMPTY;
		case EMPTY_JingZhong:
			return ErrorType.EMPTY;
		case EMPTY_ChengPinLv:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuFe:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuSi:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuCl:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuC:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuN:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuO:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuH:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuMn:
			return ErrorType.EMPTY;
		case EMPTY_YuanSuHb:
			return ErrorType.EMPTY;
		case EMPTY_DengJiHanMeng:
			return ErrorType.EMPTY;
		case EMPTY_KaoHeDengJiChuMeng:
			return ErrorType.EMPTY;
		case EMPTY_GongYiTiaoZheng:
			return ErrorType.EMPTY;
		case EMPTY_GongYiShiYan:
			return ErrorType.EMPTY;
		case EMPTY_DiPiKg:
			return ErrorType.EMPTY;
		case EMPTY_ShangMaoKg:
			return ErrorType.EMPTY;
		case EMPTY_PaBiKg:
			return ErrorType.EMPTY;
		case EMPTY_FeiDiPiKg:
			return ErrorType.EMPTY;
		case EMPTY_FeiShangMaoKg:
			return ErrorType.EMPTY;
		case EMPTY_FeiPaBiKg:
			return ErrorType.EMPTY;
		case EMPTY_FeiTaiFenKg:
			return ErrorType.EMPTY;
		case EMPTY_CiYuanKg:
			return ErrorType.EMPTY;
		case EMPTY_ShouXuanFeiLiaoKg:
			return ErrorType.EMPTY;
		case EMPTY_SunHaoKg:
			return ErrorType.EMPTY;
		case EMPTY_ZongPaiMeiLiangKg:
			return ErrorType.EMPTY;
		case EMPTY_ChuLuZhenKongDu:
			return ErrorType.EMPTY;
		case EMPTY_YuanZuiGaoWenDu:
			return ErrorType.EMPTY;
		case EMPTY_ZhengLiuGaoHengDian:
			return ErrorType.EMPTY;
		case EMPTY_ZhuanZhengLiu:
			return ErrorType.EMPTY;
		case EMPTY_JiaShouCi:
			return ErrorType.EMPTY;
		case EMPTY_JiaMoCi:
			return ErrorType.EMPTY;
		case EMPTY_TongDao:
			return ErrorType.EMPTY;
		case EMPTY_ShengChanGuZhang:
			return ErrorType.EMPTY;
		case EMPTY_BeiZhuShuoMing:
			return ErrorType.EMPTY;
		case LENGTH_YearMonthDay:
			return ErrorType.LENGTH;
		case LENGTH_QiHao:
			return ErrorType.LENGTH;
		case LENGTH_LuCi:
			return ErrorType.LENGTH;
		case LENGTH_JunPinFlg:
			return ErrorType.LENGTH;
		case LENGTH_GuiGe:
			return ErrorType.LENGTH;
		case LENGTH_ShengChanLuHao:
			return ErrorType.LENGTH;
		case LENGTH_FanYingQiHao:
			return ErrorType.LENGTH;
		case LENGTH_ShiYongCiShu:
			return ErrorType.LENGTH;
		case LENGTH_Mg:
			return ErrorType.LENGTH;
		case LENGTH_TiCl4:
			return ErrorType.LENGTH;
		case LENGTH_MaoZhong:
			return ErrorType.LENGTH;
		case LENGTH_JingZhong:
			return ErrorType.LENGTH;
		case LENGTH_ChengPinLv:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuFe:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuSi:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuCl:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuC:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuN:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuO:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuH:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuMn:
			return ErrorType.LENGTH;
		case LENGTH_YuanSuHb:
			return ErrorType.LENGTH;
		case LENGTH_DengJiHanMeng:
			return ErrorType.LENGTH;
		case LENGTH_KaoHeDengJiChuMeng:
			return ErrorType.LENGTH;
		case LENGTH_GongYiTiaoZheng:
			return ErrorType.LENGTH;
		case LENGTH_GongYiShiYan:
			return ErrorType.LENGTH;
		case LENGTH_DiPiKg:
			return ErrorType.LENGTH;
		case LENGTH_ShangMaoKg:
			return ErrorType.LENGTH;
		case LENGTH_PaBiKg:
			return ErrorType.LENGTH;
		case LENGTH_FeiDiPiKg:
			return ErrorType.LENGTH;
		case LENGTH_FeiShangMaoKg:
			return ErrorType.LENGTH;
		case LENGTH_FeiPaBiKg:
			return ErrorType.LENGTH;
		case LENGTH_FeiTaiFenKg:
			return ErrorType.LENGTH;
		case LENGTH_CiYuanKg:
			return ErrorType.LENGTH;
		case LENGTH_ShouXuanFeiLiaoKg:
			return ErrorType.LENGTH;
		case LENGTH_SunHaoKg:
			return ErrorType.LENGTH;
		case LENGTH_ZongPaiMeiLiangKg:
			return ErrorType.LENGTH;
		case LENGTH_ChuLuZhenKongDu:
			return ErrorType.LENGTH;
		case LENGTH_YuanZuiGaoWenDu:
			return ErrorType.LENGTH;
		case LENGTH_ZhengLiuGaoHengDian:
			return ErrorType.LENGTH;
		case LENGTH_ZhuanZhengLiu:
			return ErrorType.LENGTH;
		case LENGTH_JiaShouCi:
			return ErrorType.LENGTH;
		case LENGTH_JiaMoCi:
			return ErrorType.LENGTH;
		case LENGTH_TongDao:
			return ErrorType.LENGTH;
		case LENGTH_ShengChanGuZhang:
			return ErrorType.LENGTH;
		case LENGTH_BeiZhuShuoMing:
			return ErrorType.LENGTH;
		case NUMBER_FORMAT_YearMonthDay:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_QiHao:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_LuCi:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_JunPinFlg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_GuiGe:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ShengChanLuHao:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_FanYingQiHao:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ShiYongCiShu:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_Mg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_TiCl4:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_MaoZhong:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_JingZhong:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ChengPinLv:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuFe:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuSi:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuCl:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuC:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuN:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuO:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuH:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuMn:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanSuHb:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_DengJiHanMeng:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_KaoHeDengJiChuMeng:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_GongYiTiaoZheng:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_GongYiShiYan:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_DiPiKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ShangMaoKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_PaBiKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_FeiDiPiKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_FeiShangMaoKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_FeiPaBiKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_FeiTaiFenKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_CiYuanKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ShouXuanFeiLiaoKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_SunHaoKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ZongPaiMeiLiangKg:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ChuLuZhenKongDu:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_YuanZuiGaoWenDu:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ZhengLiuGaoHengDian:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ZhuanZhengLiu:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_JiaShouCi:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_JiaMoCi:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_TongDao:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_ShengChanGuZhang:
			return ErrorType.NUMBER_FORMAT;
		case NUMBER_FORMAT_BeiZhuShuoMing:
			return ErrorType.NUMBER_FORMAT;
		case DATE_FORMAT_YearMonthDay:
			return ErrorType.DATE_FORMAT;
		default:
			break;
		}
		return ErrorType.OTHER;
	}

	public String getItemNameByErrorStatus(ValidateStatusInput errorStatus) {
		switch (errorStatus) {
		case EMPTY_YearMonthDay:
			return Constant.ITEM_YearMonthDay;
		case EMPTY_QiHao:
			return Constant.ITEM_QiHao;
		case EMPTY_LuCi:
			return Constant.ITEM_LuCi;
		case EMPTY_JunPinFlg:
			return Constant.ITEM_JunPinFlg;
		case EMPTY_GuiGe:
			return Constant.ITEM_GuiGe;
		case EMPTY_ShengChanLuHao:
			return Constant.ITEM_ShengChanLuHao;
		case EMPTY_FanYingQiHao:
			return Constant.ITEM_FanYingQiHao;
		case EMPTY_ShiYongCiShu:
			return Constant.ITEM_ShiYongCiShu;
		case EMPTY_Mg:
			return Constant.ITEM_Mg;
		case EMPTY_TiCl4:
			return Constant.ITEM_TiCl4;
		case EMPTY_MaoZhong:
			return Constant.ITEM_MaoZhong;
		case EMPTY_JingZhong:
			return Constant.ITEM_JingZhong;
		case EMPTY_ChengPinLv:
			return Constant.ITEM_ChengPinLv;
		case EMPTY_YuanSuFe:
			return Constant.ITEM_YuanSuFe;
		case EMPTY_YuanSuSi:
			return Constant.ITEM_YuanSuSi;
		case EMPTY_YuanSuCl:
			return Constant.ITEM_YuanSuCl;
		case EMPTY_YuanSuC:
			return Constant.ITEM_YuanSuC;
		case EMPTY_YuanSuN:
			return Constant.ITEM_YuanSuN;
		case EMPTY_YuanSuO:
			return Constant.ITEM_YuanSuO;
		case EMPTY_YuanSuH:
			return Constant.ITEM_YuanSuH;
		case EMPTY_YuanSuMn:
			return Constant.ITEM_YuanSuMn;
		case EMPTY_YuanSuHb:
			return Constant.ITEM_YuanSuHb;
		case EMPTY_DengJiHanMeng:
			return Constant.ITEM_DengJiHanMeng;
		case EMPTY_KaoHeDengJiChuMeng:
			return Constant.ITEM_KaoHeDengJiChuMeng;
		case EMPTY_GongYiTiaoZheng:
			return Constant.ITEM_GongYiTiaoZheng;
		case EMPTY_GongYiShiYan:
			return Constant.ITEM_GongYiShiYan;
		case EMPTY_DiPiKg:
			return Constant.ITEM_DiPiKg;
		case EMPTY_ShangMaoKg:
			return Constant.ITEM_ShangMaoKg;
		case EMPTY_PaBiKg:
			return Constant.ITEM_PaBiKg;
		case EMPTY_FeiDiPiKg:
			return Constant.ITEM_FeiDiPiKg;
		case EMPTY_FeiShangMaoKg:
			return Constant.ITEM_FeiShangMaoKg;
		case EMPTY_FeiPaBiKg:
			return Constant.ITEM_FeiPaBiKg;
		case EMPTY_FeiTaiFenKg:
			return Constant.ITEM_FeiTaiFenKg;
		case EMPTY_CiYuanKg:
			return Constant.ITEM_CiYuanKg;
		case EMPTY_ShouXuanFeiLiaoKg:
			return Constant.ITEM_ShouXuanFeiLiaoKg;
		case EMPTY_SunHaoKg:
			return Constant.ITEM_SunHaoKg;
		case EMPTY_ZongPaiMeiLiangKg:
			return Constant.ITEM_ZongPaiMeiLiangKg;
		case EMPTY_ChuLuZhenKongDu:
			return Constant.ITEM_ChuLuZhenKongDu;
		case EMPTY_YuanZuiGaoWenDu:
			return Constant.ITEM_YuanZuiGaoWenDu;
		case EMPTY_ZhengLiuGaoHengDian:
			return Constant.ITEM_ZhengLiuGaoHengDian;
		case EMPTY_ZhuanZhengLiu:
			return Constant.ITEM_ZhuanZhengLiu;
		case EMPTY_JiaShouCi:
			return Constant.ITEM_JiaShouCi;
		case EMPTY_JiaMoCi:
			return Constant.ITEM_JiaMoCi;
		case EMPTY_TongDao:
			return Constant.ITEM_TongDao;
		case EMPTY_ShengChanGuZhang:
			return Constant.ITEM_ShengChanGuZhang;
		case EMPTY_BeiZhuShuoMing:
			return Constant.ITEM_BeiZhuShuoMing;
		case LENGTH_YearMonthDay:
			return Constant.ITEM_YearMonthDay;
		case LENGTH_QiHao:
			return Constant.ITEM_QiHao;
		case LENGTH_LuCi:
			return Constant.ITEM_LuCi;
		case LENGTH_JunPinFlg:
			return Constant.ITEM_JunPinFlg;
		case LENGTH_GuiGe:
			return Constant.ITEM_GuiGe;
		case LENGTH_ShengChanLuHao:
			return Constant.ITEM_ShengChanLuHao;
		case LENGTH_FanYingQiHao:
			return Constant.ITEM_FanYingQiHao;
		case LENGTH_ShiYongCiShu:
			return Constant.ITEM_ShiYongCiShu;
		case LENGTH_Mg:
			return Constant.ITEM_Mg;
		case LENGTH_TiCl4:
			return Constant.ITEM_TiCl4;
		case LENGTH_MaoZhong:
			return Constant.ITEM_MaoZhong;
		case LENGTH_JingZhong:
			return Constant.ITEM_JingZhong;
		case LENGTH_ChengPinLv:
			return Constant.ITEM_ChengPinLv;
		case LENGTH_YuanSuFe:
			return Constant.ITEM_YuanSuFe;
		case LENGTH_YuanSuSi:
			return Constant.ITEM_YuanSuSi;
		case LENGTH_YuanSuCl:
			return Constant.ITEM_YuanSuCl;
		case LENGTH_YuanSuC:
			return Constant.ITEM_YuanSuC;
		case LENGTH_YuanSuN:
			return Constant.ITEM_YuanSuN;
		case LENGTH_YuanSuO:
			return Constant.ITEM_YuanSuO;
		case LENGTH_YuanSuH:
			return Constant.ITEM_YuanSuH;
		case LENGTH_YuanSuMn:
			return Constant.ITEM_YuanSuMn;
		case LENGTH_YuanSuHb:
			return Constant.ITEM_YuanSuHb;
		case LENGTH_DengJiHanMeng:
			return Constant.ITEM_DengJiHanMeng;
		case LENGTH_KaoHeDengJiChuMeng:
			return Constant.ITEM_KaoHeDengJiChuMeng;
		case LENGTH_GongYiTiaoZheng:
			return Constant.ITEM_GongYiTiaoZheng;
		case LENGTH_GongYiShiYan:
			return Constant.ITEM_GongYiShiYan;
		case LENGTH_DiPiKg:
			return Constant.ITEM_DiPiKg;
		case LENGTH_ShangMaoKg:
			return Constant.ITEM_ShangMaoKg;
		case LENGTH_PaBiKg:
			return Constant.ITEM_PaBiKg;
		case LENGTH_FeiDiPiKg:
			return Constant.ITEM_FeiDiPiKg;
		case LENGTH_FeiShangMaoKg:
			return Constant.ITEM_FeiShangMaoKg;
		case LENGTH_FeiPaBiKg:
			return Constant.ITEM_FeiPaBiKg;
		case LENGTH_FeiTaiFenKg:
			return Constant.ITEM_FeiTaiFenKg;
		case LENGTH_CiYuanKg:
			return Constant.ITEM_CiYuanKg;
		case LENGTH_ShouXuanFeiLiaoKg:
			return Constant.ITEM_ShouXuanFeiLiaoKg;
		case LENGTH_SunHaoKg:
			return Constant.ITEM_SunHaoKg;
		case LENGTH_ZongPaiMeiLiangKg:
			return Constant.ITEM_ZongPaiMeiLiangKg;
		case LENGTH_ChuLuZhenKongDu:
			return Constant.ITEM_ChuLuZhenKongDu;
		case LENGTH_YuanZuiGaoWenDu:
			return Constant.ITEM_YuanZuiGaoWenDu;
		case LENGTH_ZhengLiuGaoHengDian:
			return Constant.ITEM_ZhengLiuGaoHengDian;
		case LENGTH_ZhuanZhengLiu:
			return Constant.ITEM_ZhuanZhengLiu;
		case LENGTH_JiaShouCi:
			return Constant.ITEM_JiaShouCi;
		case LENGTH_JiaMoCi:
			return Constant.ITEM_JiaMoCi;
		case LENGTH_TongDao:
			return Constant.ITEM_TongDao;
		case LENGTH_ShengChanGuZhang:
			return Constant.ITEM_ShengChanGuZhang;
		case LENGTH_BeiZhuShuoMing:
			return Constant.ITEM_BeiZhuShuoMing;
		case NUMBER_FORMAT_YearMonthDay:
			return Constant.ITEM_YearMonthDay;
		case NUMBER_FORMAT_QiHao:
			return Constant.ITEM_QiHao;
		case NUMBER_FORMAT_LuCi:
			return Constant.ITEM_LuCi;
		case NUMBER_FORMAT_JunPinFlg:
			return Constant.ITEM_JunPinFlg;
		case NUMBER_FORMAT_GuiGe:
			return Constant.ITEM_GuiGe;
		case NUMBER_FORMAT_ShengChanLuHao:
			return Constant.ITEM_ShengChanLuHao;
		case NUMBER_FORMAT_FanYingQiHao:
			return Constant.ITEM_FanYingQiHao;
		case NUMBER_FORMAT_ShiYongCiShu:
			return Constant.ITEM_ShiYongCiShu;
		case NUMBER_FORMAT_Mg:
			return Constant.ITEM_Mg;
		case NUMBER_FORMAT_TiCl4:
			return Constant.ITEM_TiCl4;
		case NUMBER_FORMAT_MaoZhong:
			return Constant.ITEM_MaoZhong;
		case NUMBER_FORMAT_JingZhong:
			return Constant.ITEM_JingZhong;
		case NUMBER_FORMAT_ChengPinLv:
			return Constant.ITEM_ChengPinLv;
		case NUMBER_FORMAT_YuanSuFe:
			return Constant.ITEM_YuanSuFe;
		case NUMBER_FORMAT_YuanSuSi:
			return Constant.ITEM_YuanSuSi;
		case NUMBER_FORMAT_YuanSuCl:
			return Constant.ITEM_YuanSuCl;
		case NUMBER_FORMAT_YuanSuC:
			return Constant.ITEM_YuanSuC;
		case NUMBER_FORMAT_YuanSuN:
			return Constant.ITEM_YuanSuN;
		case NUMBER_FORMAT_YuanSuO:
			return Constant.ITEM_YuanSuO;
		case NUMBER_FORMAT_YuanSuH:
			return Constant.ITEM_YuanSuH;
		case NUMBER_FORMAT_YuanSuMn:
			return Constant.ITEM_YuanSuMn;
		case NUMBER_FORMAT_YuanSuHb:
			return Constant.ITEM_YuanSuHb;
		case NUMBER_FORMAT_DengJiHanMeng:
			return Constant.ITEM_DengJiHanMeng;
		case NUMBER_FORMAT_KaoHeDengJiChuMeng:
			return Constant.ITEM_KaoHeDengJiChuMeng;
		case NUMBER_FORMAT_GongYiTiaoZheng:
			return Constant.ITEM_GongYiTiaoZheng;
		case NUMBER_FORMAT_GongYiShiYan:
			return Constant.ITEM_GongYiShiYan;
		case NUMBER_FORMAT_DiPiKg:
			return Constant.ITEM_DiPiKg;
		case NUMBER_FORMAT_ShangMaoKg:
			return Constant.ITEM_ShangMaoKg;
		case NUMBER_FORMAT_PaBiKg:
			return Constant.ITEM_PaBiKg;
		case NUMBER_FORMAT_FeiDiPiKg:
			return Constant.ITEM_FeiDiPiKg;
		case NUMBER_FORMAT_FeiShangMaoKg:
			return Constant.ITEM_FeiShangMaoKg;
		case NUMBER_FORMAT_FeiPaBiKg:
			return Constant.ITEM_FeiPaBiKg;
		case NUMBER_FORMAT_FeiTaiFenKg:
			return Constant.ITEM_FeiTaiFenKg;
		case NUMBER_FORMAT_CiYuanKg:
			return Constant.ITEM_CiYuanKg;
		case NUMBER_FORMAT_ShouXuanFeiLiaoKg:
			return Constant.ITEM_ShouXuanFeiLiaoKg;
		case NUMBER_FORMAT_SunHaoKg:
			return Constant.ITEM_SunHaoKg;
		case NUMBER_FORMAT_ZongPaiMeiLiangKg:
			return Constant.ITEM_ZongPaiMeiLiangKg;
		case NUMBER_FORMAT_ChuLuZhenKongDu:
			return Constant.ITEM_ChuLuZhenKongDu;
		case NUMBER_FORMAT_YuanZuiGaoWenDu:
			return Constant.ITEM_YuanZuiGaoWenDu;
		case NUMBER_FORMAT_ZhengLiuGaoHengDian:
			return Constant.ITEM_ZhengLiuGaoHengDian;
		case NUMBER_FORMAT_ZhuanZhengLiu:
			return Constant.ITEM_ZhuanZhengLiu;
		case NUMBER_FORMAT_JiaShouCi:
			return Constant.ITEM_JiaShouCi;
		case NUMBER_FORMAT_JiaMoCi:
			return Constant.ITEM_JiaMoCi;
		case NUMBER_FORMAT_TongDao:
			return Constant.ITEM_TongDao;
		case NUMBER_FORMAT_ShengChanGuZhang:
			return Constant.ITEM_ShengChanGuZhang;
		case NUMBER_FORMAT_BeiZhuShuoMing:
			return Constant.ITEM_BeiZhuShuoMing;
		case DATE_FORMAT_YearMonthDay:
			return Constant.ITEM_YearMonthDay;		
		default:
			break;
		}
		return "";
	}
	
	public ArrayList<InputByNewFormBean> initInputByNewForm() {
		ArrayList<InputByNewFormBean> inputByNewList = new ArrayList<InputByNewFormBean>();

		InputByNewFormBean inputByNewFormBean;

		for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
			inputByNewFormBean = new InputByNewFormBean();
			inputByNewFormBean.setYearMonthDay("");
			inputByNewFormBean.setQiHao("");
			inputByNewFormBean.setLuCi("");
			inputByNewFormBean.setGuiGe("");
			inputByNewFormBean.setShengChanLuHao("");
			inputByNewFormBean.setFanYingQiHao("");
			inputByNewFormBean.setShiYongCiShu("");
			inputByNewFormBean.setMg("");
			inputByNewFormBean.setTiCl4("");
			inputByNewFormBean.setMaoZhong("");
			inputByNewFormBean.setJingZhong("");
			inputByNewFormBean.setChengPinLv("");
			inputByNewFormBean.setYuanSuFe("");
			inputByNewFormBean.setYuanSuSi("");
			inputByNewFormBean.setYuanSuCl("");
			inputByNewFormBean.setYuanSuC("");
			inputByNewFormBean.setYuanSuN("");
			inputByNewFormBean.setYuanSuO("");
			inputByNewFormBean.setYuanSuH("");
			inputByNewFormBean.setYuanSuMn("");
			inputByNewFormBean.setYuanSuHb("");
			inputByNewFormBean.setDengJiHanMeng("");
			inputByNewFormBean.setKaoHeDengJiChuMeng("");
			inputByNewFormBean.setGongYiTiaoZheng("");
			inputByNewFormBean.setGongYiShiYan("");
			inputByNewFormBean.setDiPiKg("");
			inputByNewFormBean.setShangMaoKg("");
			inputByNewFormBean.setPaBiKg("");
			inputByNewFormBean.setFeiDiPiKg("");
			inputByNewFormBean.setFeiShangMaoKg("");
			inputByNewFormBean.setFeiPaBiKg("");
			inputByNewFormBean.setFeiTaiFenKg("");
			inputByNewFormBean.setCiYuanKg("");
			inputByNewFormBean.setShouXuanFeiLiaoKg("");
			inputByNewFormBean.setSunHaoKg("");
			inputByNewFormBean.setZongPaiMeiLiangKg("");
			inputByNewFormBean.setChuLuZhenKongDu("");
			inputByNewFormBean.setYuanZuiGaoWenDu("");
			inputByNewFormBean.setZhengLiuGaoHengDian("");
			inputByNewFormBean.setZhuanZhengLiu("");
			inputByNewFormBean.setJiaShouCi("");
			inputByNewFormBean.setJiaMoCi("");
			inputByNewFormBean.setTongDao("");
			inputByNewFormBean.setShengChanGuZhang("");
			inputByNewFormBean.setBeiZhuShuoMing("");
			inputByNewList.add(inputByNewFormBean);
		}
		return inputByNewList;
	}
	
}
