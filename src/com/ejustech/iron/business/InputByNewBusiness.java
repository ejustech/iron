package com.ejustech.iron.business;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;
import org.apache.struts.chain.commands.servlet.ValidateActionForm;

import com.ejustech.iron.common.Constant;
import com.ejustech.iron.common.IronEnum.ErrorType;
import com.ejustech.iron.common.IronEnum.UserRole;
import com.ejustech.iron.common.IronEnum.ValidateStatusInputByNew;
import com.ejustech.iron.common.StringHelper;
import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.form.InputByNewForm;

public class InputByNewBusiness {
	public ValidateStatusInputByNew check(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		ValidateStatusInputByNew checkResult = ValidateStatusInputByNew.OK;

		// 空值的验证
		checkResult = checkEmptyByRole(inputByNewFormBean, userRole);
		if (checkResult != ValidateStatusInputByNew.OK) {
			return checkResult;
		}

		// 长度的验证
		checkResult = checkLength(inputByNewFormBean);
		if (checkResult != ValidateStatusInputByNew.OK) {
			return checkResult;
		}

		// 数字格式的验证
		checkResult = checkNumberFormat(inputByNewFormBean);
		if (checkResult != ValidateStatusInputByNew.OK) {
			return checkResult;
		}

		// 日期格式的验证
		checkResult = checkDateFormat(inputByNewFormBean);
		if (checkResult != ValidateStatusInputByNew.OK) {
			return checkResult;
		}

		return ValidateStatusInputByNew.OK;
	}

	public ArrayList<ValidateStatusInputByNew> checkAll(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInputByNew> checkResult = new ArrayList<ValidateStatusInputByNew>();

		ArrayList<ValidateStatusInputByNew> checkEmptyByRole = checkEmptyByRoleAll(inputByNewFormBean, userRole);
		ArrayList<ValidateStatusInputByNew> checkLength = checkLengthAll(inputByNewFormBean);
		ArrayList<ValidateStatusInputByNew> checkNumberFormat = checkNumberFormatAll(inputByNewFormBean);
		ArrayList<ValidateStatusInputByNew> checkDateFormat = checkDateFormatAll(inputByNewFormBean);

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

	private ValidateStatusInputByNew checkDateFormat(InputByNewFormBean inputByNewFormBean) {
		if (!StringHelper.isDateFormat(inputByNewFormBean.getYearMonthDay())) {
			return ValidateStatusInputByNew.DATE_FORMAT_YearMonthDay;
		}
		return ValidateStatusInputByNew.OK;
	}

	private ArrayList<ValidateStatusInputByNew> checkDateFormatAll(InputByNewFormBean inputByNewFormBean) {
		ArrayList<ValidateStatusInputByNew> checkResult = new ArrayList<ValidateStatusInputByNew>();

		if (!StringHelper.isDateFormat(inputByNewFormBean.getYearMonthDay())) {
			checkResult.add(ValidateStatusInputByNew.DATE_FORMAT_YearMonthDay);
		}

		return checkResult;
	}

	private ValidateStatusInputByNew checkEmptyByRole(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYearMonthDay())) {
				return ValidateStatusInputByNew.EMPTY_YearMonthDay;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getQiHao())) {
				return ValidateStatusInputByNew.EMPTY_QiHao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getLuCi())) {
				return ValidateStatusInputByNew.EMPTY_LuCi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGuiGe())) {
				return ValidateStatusInputByNew.EMPTY_GuiGe;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShengChanLuHao())) {
				return ValidateStatusInputByNew.EMPTY_ShengChanLuHao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFanYingQiHao())) {
				return ValidateStatusInputByNew.EMPTY_FanYingQiHao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShiYongCiShu())) {
				return ValidateStatusInputByNew.EMPTY_ShiYongCiShu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getMg())) {
				return ValidateStatusInputByNew.EMPTY_Mg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getTiCl4())) {
				return ValidateStatusInputByNew.EMPTY_TiCl4;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getMaoZhong())) {
				return ValidateStatusInputByNew.EMPTY_MaoZhong;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJingZhong())) {
				return ValidateStatusInputByNew.EMPTY_JingZhong;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getChengPinLv())) {
				return ValidateStatusInputByNew.EMPTY_ChengPinLv;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuFe())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuFe;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuSi())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuSi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuCl())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuCl;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuC())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuC;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuN())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuN;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuO())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuO;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuH())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuH;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuMn())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuMn;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuHb())) {
				return ValidateStatusInputByNew.EMPTY_YuanSuHb;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getDengJiHanMeng())) {
				return ValidateStatusInputByNew.EMPTY_DengJiHanMeng;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
				return ValidateStatusInputByNew.EMPTY_KaoHeDengJiChuMeng;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGongYiTiaoZheng())) {
				return ValidateStatusInputByNew.EMPTY_GongYiTiaoZheng;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGongYiShiYan())) {
				return ValidateStatusInputByNew.EMPTY_GongYiShiYan;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getDiPiKg())) {
				return ValidateStatusInputByNew.EMPTY_DiPiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShangMaoKg())) {
				return ValidateStatusInputByNew.EMPTY_ShangMaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getPaBiKg())) {
				return ValidateStatusInputByNew.EMPTY_PaBiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiDiPiKg())) {
				return ValidateStatusInputByNew.EMPTY_FeiDiPiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiShangMaoKg())) {
				return ValidateStatusInputByNew.EMPTY_FeiShangMaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiPaBiKg())) {
				return ValidateStatusInputByNew.EMPTY_FeiPaBiKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiTaiFenKg())) {
				return ValidateStatusInputByNew.EMPTY_FeiTaiFenKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getCiYuanKg())) {
				return ValidateStatusInputByNew.EMPTY_CiYuanKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
				return ValidateStatusInputByNew.EMPTY_ShouXuanFeiLiaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getSunHaoKg())) {
				return ValidateStatusInputByNew.EMPTY_SunHaoKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZongPaiMeiLiangKg())) {
				return ValidateStatusInputByNew.EMPTY_ZongPaiMeiLiangKg;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getChuLuZhenKongDu())) {
				return ValidateStatusInputByNew.EMPTY_ChuLuZhenKongDu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanZuiGaoWenDu())) {
				return ValidateStatusInputByNew.EMPTY_YuanZuiGaoWenDu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZhengLiuGaoHengDian())) {
				return ValidateStatusInputByNew.EMPTY_ZhengLiuGaoHengDian;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZhuanZhengLiu())) {
				return ValidateStatusInputByNew.EMPTY_ZhuanZhengLiu;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJiaShouCi())) {
				return ValidateStatusInputByNew.EMPTY_JiaShouCi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJiaMoCi())) {
				return ValidateStatusInputByNew.EMPTY_JiaMoCi;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getTongDao())) {
				return ValidateStatusInputByNew.EMPTY_TongDao;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShengChanGuZhang())) {
				return ValidateStatusInputByNew.EMPTY_ShengChanGuZhang;
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getBeiZhuShuoMing())) {
				return ValidateStatusInputByNew.EMPTY_BeiZhuShuoMing;
			}
			break;
		default:
			break;
		}
		return ValidateStatusInputByNew.OK;
	}

	private ArrayList<ValidateStatusInputByNew> checkEmptyByRoleAll(InputByNewFormBean inputByNewFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInputByNew> checkResult = new ArrayList<ValidateStatusInputByNew>();

		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYearMonthDay())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YearMonthDay);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getQiHao())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_QiHao);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getLuCi())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_LuCi);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGuiGe())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_GuiGe);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShengChanLuHao())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ShengChanLuHao);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFanYingQiHao())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_FanYingQiHao);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShiYongCiShu())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ShiYongCiShu);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getMg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_Mg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getTiCl4())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_TiCl4);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getMaoZhong())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_MaoZhong);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJingZhong())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_JingZhong);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getChengPinLv())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ChengPinLv);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuFe())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuFe);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuSi())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuSi);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuCl())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuCl);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuC())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuC);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuN())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuN);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuO())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuO);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuH())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuH);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuMn())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuMn);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanSuHb())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanSuHb);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getDengJiHanMeng())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_DengJiHanMeng);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_KaoHeDengJiChuMeng);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGongYiTiaoZheng())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_GongYiTiaoZheng);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getGongYiShiYan())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_GongYiShiYan);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getDiPiKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_DiPiKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShangMaoKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ShangMaoKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getPaBiKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_PaBiKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiDiPiKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiDiPiKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiShangMaoKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiShangMaoKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiPaBiKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiPaBiKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getFeiTaiFenKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_FeiTaiFenKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getCiYuanKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_CiYuanKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ShouXuanFeiLiaoKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getSunHaoKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_SunHaoKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZongPaiMeiLiangKg())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ZongPaiMeiLiangKg);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getChuLuZhenKongDu())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ChuLuZhenKongDu);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getYuanZuiGaoWenDu())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_YuanZuiGaoWenDu);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZhengLiuGaoHengDian())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ZhengLiuGaoHengDian);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getZhuanZhengLiu())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ZhuanZhengLiu);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJiaShouCi())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_JiaShouCi);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getJiaMoCi())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_JiaMoCi);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getTongDao())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_TongDao);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getShengChanGuZhang())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_ShengChanGuZhang);
			}
			if (StringHelper.isNullEmpty(inputByNewFormBean.getBeiZhuShuoMing())) {
				checkResult.add(ValidateStatusInputByNew.EMPTY_BeiZhuShuoMing);
			}
			break;
		default:
			break;
		}
		return checkResult;
	}

	private ValidateStatusInputByNew checkLength(InputByNewFormBean inputByNewFormBean) {
		if (StringHelper.isLenGreater(inputByNewFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			return ValidateStatusInputByNew.LENGTH_YearMonthDay;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			return ValidateStatusInputByNew.LENGTH_QiHao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			return ValidateStatusInputByNew.LENGTH_LuCi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			return ValidateStatusInputByNew.LENGTH_GuiGe;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			return ValidateStatusInputByNew.LENGTH_ShengChanLuHao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			return ValidateStatusInputByNew.LENGTH_FanYingQiHao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			return ValidateStatusInputByNew.LENGTH_ShiYongCiShu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			return ValidateStatusInputByNew.LENGTH_Mg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			return ValidateStatusInputByNew.LENGTH_TiCl4;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			return ValidateStatusInputByNew.LENGTH_MaoZhong;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			return ValidateStatusInputByNew.LENGTH_JingZhong;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			return ValidateStatusInputByNew.LENGTH_ChengPinLv;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuFe;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuSi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuCl;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuC;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuN;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuO;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuH;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuMn;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			return ValidateStatusInputByNew.LENGTH_YuanSuHb;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			return ValidateStatusInputByNew.LENGTH_DengJiHanMeng;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			return ValidateStatusInputByNew.LENGTH_KaoHeDengJiChuMeng;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			return ValidateStatusInputByNew.LENGTH_GongYiTiaoZheng;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			return ValidateStatusInputByNew.LENGTH_GongYiShiYan;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			return ValidateStatusInputByNew.LENGTH_DiPiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			return ValidateStatusInputByNew.LENGTH_ShangMaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			return ValidateStatusInputByNew.LENGTH_PaBiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			return ValidateStatusInputByNew.LENGTH_FeiDiPiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			return ValidateStatusInputByNew.LENGTH_FeiShangMaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			return ValidateStatusInputByNew.LENGTH_FeiPaBiKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			return ValidateStatusInputByNew.LENGTH_FeiTaiFenKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			return ValidateStatusInputByNew.LENGTH_CiYuanKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			return ValidateStatusInputByNew.LENGTH_ShouXuanFeiLiaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			return ValidateStatusInputByNew.LENGTH_SunHaoKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			return ValidateStatusInputByNew.LENGTH_ZongPaiMeiLiangKg;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			return ValidateStatusInputByNew.LENGTH_ChuLuZhenKongDu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			return ValidateStatusInputByNew.LENGTH_YuanZuiGaoWenDu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhengLiuGaoHengDian(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			return ValidateStatusInputByNew.LENGTH_ZhengLiuGaoHengDian;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			return ValidateStatusInputByNew.LENGTH_ZhuanZhengLiu;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			return ValidateStatusInputByNew.LENGTH_JiaShouCi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			return ValidateStatusInputByNew.LENGTH_JiaMoCi;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			return ValidateStatusInputByNew.LENGTH_TongDao;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			return ValidateStatusInputByNew.LENGTH_ShengChanGuZhang;
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			return ValidateStatusInputByNew.LENGTH_BeiZhuShuoMing;
		}
		return ValidateStatusInputByNew.OK;
	}

	private ArrayList<ValidateStatusInputByNew> checkLengthAll(InputByNewFormBean inputByNewFormBean) {
		ArrayList<ValidateStatusInputByNew> checkResult = new ArrayList<ValidateStatusInputByNew>();

		if (StringHelper.isLenGreater(inputByNewFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YearMonthDay);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_QiHao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_LuCi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_GuiGe);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ShengChanLuHao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_FanYingQiHao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ShiYongCiShu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_Mg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_TiCl4);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_MaoZhong);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_JingZhong);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ChengPinLv);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuFe);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuSi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuCl);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuC);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuN);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuO);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuH);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuMn);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanSuHb);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_DengJiHanMeng);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_KaoHeDengJiChuMeng);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_GongYiTiaoZheng);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_GongYiShiYan);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_DiPiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ShangMaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_PaBiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_FeiDiPiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_FeiShangMaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_FeiPaBiKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_FeiTaiFenKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_CiYuanKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ShouXuanFeiLiaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_SunHaoKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ZongPaiMeiLiangKg);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ChuLuZhenKongDu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_YuanZuiGaoWenDu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhengLiuGaoHengDian(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ZhengLiuGaoHengDian);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ZhuanZhengLiu);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_JiaShouCi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_JiaMoCi);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_TongDao);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_ShengChanGuZhang);
		}
		if (StringHelper.isLenGreater(inputByNewFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			checkResult.add(ValidateStatusInputByNew.LENGTH_BeiZhuShuoMing);
		}

		return checkResult;
	}

	private ValidateStatusInputByNew checkNumberFormat(InputByNewFormBean inputByNewFormBean) {
		// if (!StringHelper.isNumber(inputByNewFormBean.getYearMonthDay())) {
		// return ValidateStatusInputByNew.NUMBER_FORMAT_YearMonthDay;
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getQiHao())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_QiHao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getLuCi())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_LuCi;
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getGuiGe())) {
		// return ValidateStatusInputByNew.NUMBER_FORMAT_GuiGe;
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanLuHao())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ShengChanLuHao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFanYingQiHao())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_FanYingQiHao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShiYongCiShu())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ShiYongCiShu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_Mg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTiCl4())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_TiCl4;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMaoZhong())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_MaoZhong;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJingZhong())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_JingZhong;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChengPinLv())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ChengPinLv;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuFe())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuFe;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuSi())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuSi;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuCl())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuCl;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuC())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuC;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuN())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuN;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuO())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuO;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuH())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuH;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuMn())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuMn;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuHb())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuHb;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDengJiHanMeng())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_DengJiHanMeng;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_KaoHeDengJiChuMeng;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiTiaoZheng())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_GongYiTiaoZheng;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiShiYan())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_GongYiShiYan;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDiPiKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_DiPiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShangMaoKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ShangMaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getPaBiKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_PaBiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiDiPiKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_FeiDiPiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiShangMaoKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_FeiShangMaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiPaBiKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_FeiPaBiKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiTaiFenKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_FeiTaiFenKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getCiYuanKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_CiYuanKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ShouXuanFeiLiaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getSunHaoKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_SunHaoKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZongPaiMeiLiangKg())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ZongPaiMeiLiangKg;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChuLuZhenKongDu())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ChuLuZhenKongDu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanZuiGaoWenDu())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_YuanZuiGaoWenDu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhengLiuGaoHengDian())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ZhengLiuGaoHengDian;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhuanZhengLiu())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ZhuanZhengLiu;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJiaShouCi())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_JiaShouCi;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJiaMoCi())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_JiaMoCi;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTongDao())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_TongDao;
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanGuZhang())) {
			return ValidateStatusInputByNew.NUMBER_FORMAT_ShengChanGuZhang;
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getBeiZhuShuoMing())) {
		// return ValidateStatusInputByNew.NUMBER_FORMAT_BeiZhuShuoMing;
		// }
		return ValidateStatusInputByNew.OK;
	}

	private ArrayList<ValidateStatusInputByNew> checkNumberFormatAll(InputByNewFormBean inputByNewFormBean) {
		ArrayList<ValidateStatusInputByNew> checkResult = new ArrayList<ValidateStatusInputByNew>();
		
		// if (!StringHelper.isNumber(inputByNewFormBean.getYearMonthDay())) {
		// checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YearMonthDay);
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getQiHao())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_QiHao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getLuCi())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_LuCi);
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getGuiGe())) {
		// checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_GuiGe);
		// }
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanLuHao())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ShengChanLuHao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFanYingQiHao())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_FanYingQiHao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShiYongCiShu())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ShiYongCiShu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_Mg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTiCl4())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_TiCl4);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getMaoZhong())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_MaoZhong);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJingZhong())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_JingZhong);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChengPinLv())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ChengPinLv);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuFe())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuFe);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuSi())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuSi);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuCl())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuCl);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuC())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuC);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuN())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuN);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuO())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuO);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuH())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuH);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuMn())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuMn);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanSuHb())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanSuHb);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDengJiHanMeng())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_DengJiHanMeng);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getKaoHeDengJiChuMeng())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_KaoHeDengJiChuMeng);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiTiaoZheng())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_GongYiTiaoZheng);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getGongYiShiYan())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_GongYiShiYan);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getDiPiKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_DiPiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShangMaoKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ShangMaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getPaBiKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_PaBiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiDiPiKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_FeiDiPiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiShangMaoKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_FeiShangMaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiPaBiKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_FeiPaBiKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getFeiTaiFenKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_FeiTaiFenKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getCiYuanKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_CiYuanKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShouXuanFeiLiaoKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ShouXuanFeiLiaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getSunHaoKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_SunHaoKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZongPaiMeiLiangKg())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ZongPaiMeiLiangKg);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getChuLuZhenKongDu())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ChuLuZhenKongDu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getYuanZuiGaoWenDu())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_YuanZuiGaoWenDu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhengLiuGaoHengDian())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ZhengLiuGaoHengDian);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getZhuanZhengLiu())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ZhuanZhengLiu);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJiaShouCi())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_JiaShouCi);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getJiaMoCi())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_JiaMoCi);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getTongDao())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_TongDao);
		}
		if (!StringHelper.isNumber(inputByNewFormBean.getShengChanGuZhang())) {
			checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_ShengChanGuZhang);
		}
		// if (!StringHelper.isNumber(inputByNewFormBean.getBeiZhuShuoMing())) {
		// checkResult.add(ValidateStatusInputByNew.NUMBER_FORMAT_BeiZhuShuoMing);
		// }
		checkResult.add(ValidateStatusInputByNew.OK);
		
		return checkResult;
	}

	private TIronInfoDaoBean ConvToTIronInfoDaoBeanFromInputByNewFormBean(InputByNewFormBean formBean, int rowDataIndex) {
		TIronInfoDaoBean daoBean = new TIronInfoDaoBean();
		switch (rowDataIndex) {
		case 1:
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

	public Boolean Save(ActionForm form) {
		TIronInfoDao dao = new TIronInfoDao();
		;
		try {
			if (form != null) {
				InputByNewForm inputByNewForm = (InputByNewForm) form;
				InputByNewFormBean inputByNewFormBean;
				TIronInfoDaoBean tIronInfoDaoBean;
				dao.Open();
				dao.BeginTrans();
				// 信息输入画面，默认10条数据 循环
				for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
					// 信息输入画面Form取得FormBean
					inputByNewFormBean = getInputByNewFormBeanFromForm(inputByNewForm, i);
					log(inputByNewFormBean);
					// 1：常规数据 2:军品1 3：军品2
					// FormBean转化成DaoBean
					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByNewFormBean(inputByNewFormBean, 1);
					if (null != tIronInfoDaoBean.getLuCi() && !"".equals(tIronInfoDaoBean.getLuCi()) && null != tIronInfoDaoBean.getGuiGe()
							&& !"".equals(tIronInfoDaoBean.getGuiGe())) {
						// 炉次和规格都不为空时，登陆。
						dao.Insert(tIronInfoDaoBean);
					}
				}
				dao.Commit();
				dao.Close();
			}

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			dao.Rollback();
			dao.Close();
			return false;
		}
	}

	public ErrorType getErrorType(ValidateStatusInputByNew errorStatus) {
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

	public String getItemNameByErrorStatus(ValidateStatusInputByNew errorStatus) {
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
}
