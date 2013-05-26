package com.ejustech.iron.business;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.ejustech.iron.common.Constant;
import com.ejustech.iron.common.IronEnum.ErrorType;
import com.ejustech.iron.common.IronEnum.UserRole;
import com.ejustech.iron.common.IronEnum.ValidateStatusInput;
import com.ejustech.iron.common.StringHelper;
import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.InputByUpdateFormBean;
import com.ejustech.iron.form.InputByUpdateForm;

public class InputByUpdateBusiness {
	public ArrayList<InputByUpdateFormBean> InitInputByUpdateForm() {
		ArrayList<InputByUpdateFormBean> inputByNewList = new ArrayList<InputByUpdateFormBean>();

		InputByUpdateFormBean inputByUpdateFormBean;

		TIronInfoDao dao = new TIronInfoDao();
		ArrayList<TIronInfoDaoBean> allInfoList = new ArrayList<TIronInfoDaoBean>();
		try {
			allInfoList = dao.GetAllIronInfo();

			for (int i = 0; i < allInfoList.size(); i++) {
				inputByUpdateFormBean = new InputByUpdateFormBean();
				inputByUpdateFormBean.setYearMonthDay(allInfoList.get(i).getYearMonthDay());
				inputByUpdateFormBean.setQiHao(allInfoList.get(i).getQiHao());
				inputByUpdateFormBean.setLuCi(allInfoList.get(i).getLuCi());
				inputByUpdateFormBean.setGuiGe(allInfoList.get(i).getGuiGe());
				inputByUpdateFormBean.setShengChanLuHao(allInfoList.get(i).getShengChanLuHao());
				inputByUpdateFormBean.setFanYingQiHao(allInfoList.get(i).getFanYingQiHao());
				inputByUpdateFormBean.setShiYongCiShu(allInfoList.get(i).getShiYongCiShu());
				inputByUpdateFormBean.setMg(allInfoList.get(i).getMg());
				inputByUpdateFormBean.setTiCl4(allInfoList.get(i).getTiCl4());
				inputByUpdateFormBean.setMaoZhong(allInfoList.get(i).getMaoZhong());
				inputByUpdateFormBean.setJingZhong(allInfoList.get(i).getJingZhong());
				inputByUpdateFormBean.setChengPinLv(allInfoList.get(i).getChengPinLv());
				inputByUpdateFormBean.setYuanSuFe(allInfoList.get(i).getYuanSuFe());
				inputByUpdateFormBean.setYuanSuSi(allInfoList.get(i).getYuanSuSi());
				inputByUpdateFormBean.setYuanSuCl(allInfoList.get(i).getYuanSuCl());
				inputByUpdateFormBean.setYuanSuC(allInfoList.get(i).getYuanSuC());
				inputByUpdateFormBean.setYuanSuN(allInfoList.get(i).getYuanSuN());
				inputByUpdateFormBean.setYuanSuO(allInfoList.get(i).getYuanSuO());
				inputByUpdateFormBean.setYuanSuH(allInfoList.get(i).getYuanSuH());
				inputByUpdateFormBean.setYuanSuMn(allInfoList.get(i).getYuanSuMn());
				inputByUpdateFormBean.setYuanSuHb(allInfoList.get(i).getYuanSuHb());
				inputByUpdateFormBean.setDengJiHanMeng(allInfoList.get(i).getDengJiHanMeng());
				inputByUpdateFormBean.setKaoHeDengJiChuMeng(allInfoList.get(i).getKaoHeDengJiChuMeng());
				inputByUpdateFormBean.setGongYiTiaoZheng(allInfoList.get(i).getGongYiTiaoZheng());
				inputByUpdateFormBean.setGongYiShiYan(allInfoList.get(i).getGongYiShiYan());
				inputByUpdateFormBean.setDiPiKg(allInfoList.get(i).getDiPiKg());
				inputByUpdateFormBean.setShangMaoKg(allInfoList.get(i).getShangMaoKg());
				inputByUpdateFormBean.setPaBiKg(allInfoList.get(i).getPaBiKg());
				inputByUpdateFormBean.setFeiDiPiKg(allInfoList.get(i).getFeiDiPiKg());
				inputByUpdateFormBean.setFeiShangMaoKg(allInfoList.get(i).getFeiShangMaoKg());
				inputByUpdateFormBean.setFeiPaBiKg(allInfoList.get(i).getFeiPaBiKg());
				inputByUpdateFormBean.setFeiTaiFenKg(allInfoList.get(i).getFeiTaiFenKg());
				inputByUpdateFormBean.setCiYuanKg(allInfoList.get(i).getCiYuanKg());
				inputByUpdateFormBean.setShouXuanFeiLiaoKg(allInfoList.get(i).getShouXuanFeiLiaoKg());
				inputByUpdateFormBean.setSunHaoKg(allInfoList.get(i).getSunHaoKg());
				inputByUpdateFormBean.setZongPaiMeiLiangKg(allInfoList.get(i).getZongPaiMeiLiangKg());
				inputByUpdateFormBean.setChuLuZhenKongDu(allInfoList.get(i).getChuLuZhenKongDu());
				inputByUpdateFormBean.setYuanZuiGaoWenDu(allInfoList.get(i).getYuanZuiGaoWenDu());
				inputByUpdateFormBean.setZhengLiuGaoHengDian(allInfoList.get(i).getZhengLiuGaoHengDian());
				inputByUpdateFormBean.setZhuanZhengLiu(allInfoList.get(i).getZhuanZhengLiu());
				inputByUpdateFormBean.setJiaShouCi(allInfoList.get(i).getJiaShouCi());
				inputByUpdateFormBean.setJiaMoCi(allInfoList.get(i).getJiaMoCi());
				inputByUpdateFormBean.setTongDao(allInfoList.get(i).getTongDao());
				inputByUpdateFormBean.setShengChanGuZhang(allInfoList.get(i).getShengChanGuZhang());
				inputByUpdateFormBean.setBeiZhuShuoMing(allInfoList.get(i).getBeiZhuShuoMing());

				inputByNewList.add(inputByUpdateFormBean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return inputByNewList;
	}

	public ValidateStatusInput check(InputByUpdateFormBean InputByUpdateFormBean, UserRole userRole) {
		ValidateStatusInput checkResult = ValidateStatusInput.OK;

		// 空值的验证
		checkResult = checkEmptyByRole(InputByUpdateFormBean, userRole);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 长度的验证
		checkResult = checkLength(InputByUpdateFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 数字格式的验证
		checkResult = checkNumberFormat(InputByUpdateFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 日期格式的验证
		checkResult = checkDateFormat(InputByUpdateFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		return ValidateStatusInput.OK;
	}

	public ArrayList<ValidateStatusInput> checkAllForSave(InputByUpdateFormBean InputByUpdateFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		ArrayList<ValidateStatusInput> checkEmptyByRole = checkEmptyByRoleAllForSave(InputByUpdateFormBean, userRole);
		ArrayList<ValidateStatusInput> checkLength = checkLengthAll(InputByUpdateFormBean);
		ArrayList<ValidateStatusInput> checkNumberFormat = checkNumberFormatAll(InputByUpdateFormBean);
		ArrayList<ValidateStatusInput> checkDateFormat = checkDateFormatAll(InputByUpdateFormBean);

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

	public ArrayList<ValidateStatusInput> checkAllForCommit(InputByUpdateFormBean InputByUpdateFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		ArrayList<ValidateStatusInput> checkEmptyByRole = checkEmptyByRoleAllForCommit(InputByUpdateFormBean, userRole);
		ArrayList<ValidateStatusInput> checkLength = checkLengthAll(InputByUpdateFormBean);
		ArrayList<ValidateStatusInput> checkNumberFormat = checkNumberFormatAll(InputByUpdateFormBean);
		ArrayList<ValidateStatusInput> checkDateFormat = checkDateFormatAll(InputByUpdateFormBean);

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

	private ValidateStatusInput checkDateFormat(InputByUpdateFormBean InputByUpdateFormBean) {
		if (!StringHelper.isDateFormat(InputByUpdateFormBean.getYearMonthDay())) {
			return ValidateStatusInput.DATE_FORMAT_YearMonthDay;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkDateFormatAll(InputByUpdateFormBean InputByUpdateFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
				&& !StringHelper.isDateFormat(InputByUpdateFormBean.getYearMonthDay())) {
			checkResult.add(ValidateStatusInput.DATE_FORMAT_YearMonthDay);
		}

		return checkResult;
	}

	private ValidateStatusInput checkEmptyByRole(InputByUpdateFormBean InputByUpdateFormBean, UserRole userRole) {
		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYearMonthDay())) {
				return ValidateStatusInput.EMPTY_YearMonthDay;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getQiHao())) {
				return ValidateStatusInput.EMPTY_QiHao;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getLuCi())) {
				return ValidateStatusInput.EMPTY_LuCi;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getGuiGe())) {
				return ValidateStatusInput.EMPTY_GuiGe;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getShengChanLuHao())) {
				return ValidateStatusInput.EMPTY_ShengChanLuHao;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getFanYingQiHao())) {
				return ValidateStatusInput.EMPTY_FanYingQiHao;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getShiYongCiShu())) {
				return ValidateStatusInput.EMPTY_ShiYongCiShu;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getMg())) {
				return ValidateStatusInput.EMPTY_Mg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getTiCl4())) {
				return ValidateStatusInput.EMPTY_TiCl4;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getMaoZhong())) {
				return ValidateStatusInput.EMPTY_MaoZhong;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJingZhong())) {
				return ValidateStatusInput.EMPTY_JingZhong;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getChengPinLv())) {
				return ValidateStatusInput.EMPTY_ChengPinLv;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuFe())) {
				return ValidateStatusInput.EMPTY_YuanSuFe;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuSi())) {
				return ValidateStatusInput.EMPTY_YuanSuSi;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuCl())) {
				return ValidateStatusInput.EMPTY_YuanSuCl;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuC())) {
				return ValidateStatusInput.EMPTY_YuanSuC;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuN())) {
				return ValidateStatusInput.EMPTY_YuanSuN;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuO())) {
				return ValidateStatusInput.EMPTY_YuanSuO;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuH())) {
				return ValidateStatusInput.EMPTY_YuanSuH;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuMn())) {
				return ValidateStatusInput.EMPTY_YuanSuMn;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuHb())) {
				return ValidateStatusInput.EMPTY_YuanSuHb;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getDengJiHanMeng())) {
				return ValidateStatusInput.EMPTY_DengJiHanMeng;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
				return ValidateStatusInput.EMPTY_KaoHeDengJiChuMeng;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getGongYiTiaoZheng())) {
				return ValidateStatusInput.EMPTY_GongYiTiaoZheng;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getGongYiShiYan())) {
				return ValidateStatusInput.EMPTY_GongYiShiYan;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getDiPiKg())) {
				return ValidateStatusInput.EMPTY_DiPiKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getShangMaoKg())) {
				return ValidateStatusInput.EMPTY_ShangMaoKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getPaBiKg())) {
				return ValidateStatusInput.EMPTY_PaBiKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiDiPiKg())) {
				return ValidateStatusInput.EMPTY_FeiDiPiKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiShangMaoKg())) {
				return ValidateStatusInput.EMPTY_FeiShangMaoKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiPaBiKg())) {
				return ValidateStatusInput.EMPTY_FeiPaBiKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiTaiFenKg())) {
				return ValidateStatusInput.EMPTY_FeiTaiFenKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getCiYuanKg())) {
				return ValidateStatusInput.EMPTY_CiYuanKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
				return ValidateStatusInput.EMPTY_ShouXuanFeiLiaoKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getSunHaoKg())) {
				return ValidateStatusInput.EMPTY_SunHaoKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getZongPaiMeiLiangKg())) {
				return ValidateStatusInput.EMPTY_ZongPaiMeiLiangKg;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getChuLuZhenKongDu())) {
				return ValidateStatusInput.EMPTY_ChuLuZhenKongDu;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanZuiGaoWenDu())) {
				return ValidateStatusInput.EMPTY_YuanZuiGaoWenDu;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getZhengLiuGaoHengDian())) {
				return ValidateStatusInput.EMPTY_ZhengLiuGaoHengDian;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getZhuanZhengLiu())) {
				return ValidateStatusInput.EMPTY_ZhuanZhengLiu;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJiaShouCi())) {
				return ValidateStatusInput.EMPTY_JiaShouCi;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJiaMoCi())) {
				return ValidateStatusInput.EMPTY_JiaMoCi;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getTongDao())) {
				return ValidateStatusInput.EMPTY_TongDao;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getShengChanGuZhang())) {
				return ValidateStatusInput.EMPTY_ShengChanGuZhang;
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getBeiZhuShuoMing())) {
				return ValidateStatusInput.EMPTY_BeiZhuShuoMing;
			}
			break;
		default:
			break;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkEmptyByRoleAllForCommit(InputByUpdateFormBean InputByUpdateFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getYearMonthDay())) {
				checkResult.add(ValidateStatusInput.EMPTY_YearMonthDay);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getQiHao())) {
				checkResult.add(ValidateStatusInput.EMPTY_QiHao);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getLuCi())) {
				checkResult.add(ValidateStatusInput.EMPTY_LuCi);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getGuiGe())) {
				checkResult.add(ValidateStatusInput.EMPTY_GuiGe);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getShengChanLuHao())) {
				checkResult.add(ValidateStatusInput.EMPTY_ShengChanLuHao);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getFanYingQiHao())) {
				checkResult.add(ValidateStatusInput.EMPTY_FanYingQiHao);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getShiYongCiShu())) {
				checkResult.add(ValidateStatusInput.EMPTY_ShiYongCiShu);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getMg())) {
				checkResult.add(ValidateStatusInput.EMPTY_Mg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getTiCl4())) {
				checkResult.add(ValidateStatusInput.EMPTY_TiCl4);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getMaoZhong())) {
				checkResult.add(ValidateStatusInput.EMPTY_MaoZhong);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJingZhong())) {
				checkResult.add(ValidateStatusInput.EMPTY_JingZhong);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getChengPinLv())) {
				checkResult.add(ValidateStatusInput.EMPTY_ChengPinLv);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuFe())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuFe);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuSi())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuSi);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuCl())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuCl);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuC())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuC);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuN())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuN);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuO())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuO);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuH())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuH);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuMn())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuMn);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuHb())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanSuHb);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getDengJiHanMeng())) {
				checkResult.add(ValidateStatusInput.EMPTY_DengJiHanMeng);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
				checkResult.add(ValidateStatusInput.EMPTY_KaoHeDengJiChuMeng);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getGongYiTiaoZheng())) {
				checkResult.add(ValidateStatusInput.EMPTY_GongYiTiaoZheng);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getGongYiShiYan())) {
				checkResult.add(ValidateStatusInput.EMPTY_GongYiShiYan);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getDiPiKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_DiPiKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getShangMaoKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_ShangMaoKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getPaBiKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_PaBiKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiDiPiKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_FeiDiPiKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiShangMaoKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_FeiShangMaoKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiPaBiKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_FeiPaBiKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiTaiFenKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_FeiTaiFenKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getCiYuanKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_CiYuanKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_ShouXuanFeiLiaoKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getSunHaoKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_SunHaoKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getZongPaiMeiLiangKg())) {
				checkResult.add(ValidateStatusInput.EMPTY_ZongPaiMeiLiangKg);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getChuLuZhenKongDu())) {
				checkResult.add(ValidateStatusInput.EMPTY_ChuLuZhenKongDu);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanZuiGaoWenDu())) {
				checkResult.add(ValidateStatusInput.EMPTY_YuanZuiGaoWenDu);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getZhengLiuGaoHengDian())) {
				checkResult.add(ValidateStatusInput.EMPTY_ZhengLiuGaoHengDian);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getZhuanZhengLiu())) {
				checkResult.add(ValidateStatusInput.EMPTY_ZhuanZhengLiu);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getJiaShouCi())) {
				checkResult.add(ValidateStatusInput.EMPTY_JiaShouCi);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getJiaMoCi())) {
				checkResult.add(ValidateStatusInput.EMPTY_JiaMoCi);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getTongDao())) {
				checkResult.add(ValidateStatusInput.EMPTY_TongDao);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getShengChanGuZhang())) {
				checkResult.add(ValidateStatusInput.EMPTY_ShengChanGuZhang);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getBeiZhuShuoMing())) {
				checkResult.add(ValidateStatusInput.EMPTY_BeiZhuShuoMing);
			}
			break;
		default:
			break;
		}
		return checkResult;
	}

	private ArrayList<ValidateStatusInput> checkEmptyByRoleAllForSave(InputByUpdateFormBean InputByUpdateFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
					&& StringHelper.isNullEmpty(InputByUpdateFormBean.getYearMonthDay())) {
				checkResult.add(ValidateStatusInput.EMPTY_YearMonthDay);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getQiHao())) {
				checkResult.add(ValidateStatusInput.EMPTY_QiHao);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(InputByUpdateFormBean.getLuCi())) {
				checkResult.add(ValidateStatusInput.EMPTY_LuCi);
			}
			if (StringHelper.isNullEmpty(InputByUpdateFormBean.getGuiGe())) {
				checkResult.add(ValidateStatusInput.EMPTY_GuiGe);
			}
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getShengChanLuHao()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShengChanLuHao);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getFanYingQiHao()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_FanYingQiHao);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getShiYongCiShu()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShiYongCiShu);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getMg())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_Mg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getTiCl4())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_TiCl4);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getMaoZhong()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_MaoZhong);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getJingZhong()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_JingZhong);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getChengPinLv()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ChengPinLv);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuFe())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuFe);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuSi())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuSi);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuCl())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuCl);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuC()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuC);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuN()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuN);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuO()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuO);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuH()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuH);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuMn())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuMn);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanSuHb())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuHb);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getDengJiHanMeng()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_DengJiHanMeng);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getKaoHeDengJiChuMeng()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_KaoHeDengJiChuMeng);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getGongYiTiaoZheng()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_GongYiTiaoZheng);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getGongYiShiYan()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_GongYiShiYan);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getDiPiKg())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_DiPiKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getShangMaoKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShangMaoKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getPaBiKg())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_PaBiKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiDiPiKg())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiDiPiKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiShangMaoKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiShangMaoKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiPaBiKg())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiPaBiKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getFeiTaiFenKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiTaiFenKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getCiYuanKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_CiYuanKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getShouXuanFeiLiaoKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShouXuanFeiLiaoKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getSunHaoKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_SunHaoKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getZongPaiMeiLiangKg()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ZongPaiMeiLiangKg);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getChuLuZhenKongDu()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ChuLuZhenKongDu);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getYuanZuiGaoWenDu()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanZuiGaoWenDu);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getZhengLiuGaoHengDian()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ZhengLiuGaoHengDian);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getZhuanZhengLiu()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ZhuanZhengLiu);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getJiaShouCi())) {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_JiaShouCi);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getJiaMoCi()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_JiaMoCi);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// && StringHelper.isNullEmpty(InputByUpdateFormBean.getTongDao()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_TongDao);
			// }
			// if (StringHelper.isNullEmpty(InputByUpdateFormBean.getJunPin())
			// &&
			// StringHelper.isNullEmpty(InputByUpdateFormBean.getShengChanGuZhang()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShengChanGuZhang);
			// }
			// if
			// (StringHelper.isNullEmpty(InputByUpdateFormBean.getBeiZhuShuoMing()))
			// {
			// checkResult.add(ValidateStatusInputByUpdate.EMPTY_BeiZhuShuoMing);
			// }
			break;
		default:
			break;
		}
		return checkResult;
	}

	private ValidateStatusInput checkLength(InputByUpdateFormBean InputByUpdateFormBean) {
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			return ValidateStatusInput.LENGTH_YearMonthDay;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			return ValidateStatusInput.LENGTH_QiHao;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			return ValidateStatusInput.LENGTH_LuCi;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			return ValidateStatusInput.LENGTH_GuiGe;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			return ValidateStatusInput.LENGTH_ShengChanLuHao;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			return ValidateStatusInput.LENGTH_FanYingQiHao;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			return ValidateStatusInput.LENGTH_ShiYongCiShu;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			return ValidateStatusInput.LENGTH_Mg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			return ValidateStatusInput.LENGTH_TiCl4;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			return ValidateStatusInput.LENGTH_MaoZhong;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			return ValidateStatusInput.LENGTH_JingZhong;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			return ValidateStatusInput.LENGTH_ChengPinLv;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			return ValidateStatusInput.LENGTH_YuanSuFe;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			return ValidateStatusInput.LENGTH_YuanSuSi;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			return ValidateStatusInput.LENGTH_YuanSuCl;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			return ValidateStatusInput.LENGTH_YuanSuC;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			return ValidateStatusInput.LENGTH_YuanSuN;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			return ValidateStatusInput.LENGTH_YuanSuO;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			return ValidateStatusInput.LENGTH_YuanSuH;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			return ValidateStatusInput.LENGTH_YuanSuMn;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			return ValidateStatusInput.LENGTH_YuanSuHb;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			return ValidateStatusInput.LENGTH_DengJiHanMeng;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			return ValidateStatusInput.LENGTH_KaoHeDengJiChuMeng;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			return ValidateStatusInput.LENGTH_GongYiTiaoZheng;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			return ValidateStatusInput.LENGTH_GongYiShiYan;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			return ValidateStatusInput.LENGTH_DiPiKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			return ValidateStatusInput.LENGTH_ShangMaoKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			return ValidateStatusInput.LENGTH_PaBiKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			return ValidateStatusInput.LENGTH_FeiDiPiKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			return ValidateStatusInput.LENGTH_FeiShangMaoKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			return ValidateStatusInput.LENGTH_FeiPaBiKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			return ValidateStatusInput.LENGTH_FeiTaiFenKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			return ValidateStatusInput.LENGTH_CiYuanKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			return ValidateStatusInput.LENGTH_ShouXuanFeiLiaoKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			return ValidateStatusInput.LENGTH_SunHaoKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			return ValidateStatusInput.LENGTH_ZongPaiMeiLiangKg;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			return ValidateStatusInput.LENGTH_ChuLuZhenKongDu;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			return ValidateStatusInput.LENGTH_YuanZuiGaoWenDu;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getZhengLiuGaoHengDian(),
				Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			return ValidateStatusInput.LENGTH_ZhengLiuGaoHengDian;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			return ValidateStatusInput.LENGTH_ZhuanZhengLiu;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			return ValidateStatusInput.LENGTH_JiaShouCi;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			return ValidateStatusInput.LENGTH_JiaMoCi;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			return ValidateStatusInput.LENGTH_TongDao;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			return ValidateStatusInput.LENGTH_ShengChanGuZhang;
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			return ValidateStatusInput.LENGTH_BeiZhuShuoMing;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkLengthAll(InputByUpdateFormBean InputByUpdateFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			checkResult.add(ValidateStatusInput.LENGTH_YearMonthDay);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_QiHao);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_LuCi);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			checkResult.add(ValidateStatusInput.LENGTH_GuiGe);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShengChanLuHao);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_FanYingQiHao);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShiYongCiShu);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			checkResult.add(ValidateStatusInput.LENGTH_Mg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			checkResult.add(ValidateStatusInput.LENGTH_TiCl4);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			checkResult.add(ValidateStatusInput.LENGTH_MaoZhong);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			checkResult.add(ValidateStatusInput.LENGTH_JingZhong);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			checkResult.add(ValidateStatusInput.LENGTH_ChengPinLv);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuFe);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuSi);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuCl);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuC);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuN);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuO);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuH);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuMn);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuHb);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			checkResult.add(ValidateStatusInput.LENGTH_DengJiHanMeng);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			checkResult.add(ValidateStatusInput.LENGTH_KaoHeDengJiChuMeng);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			checkResult.add(ValidateStatusInput.LENGTH_GongYiTiaoZheng);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			checkResult.add(ValidateStatusInput.LENGTH_GongYiShiYan);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_DiPiKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShangMaoKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_PaBiKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiDiPiKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiShangMaoKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiPaBiKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiTaiFenKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_CiYuanKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShouXuanFeiLiaoKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_SunHaoKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZongPaiMeiLiangKg);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ChuLuZhenKongDu);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanZuiGaoWenDu);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getZhengLiuGaoHengDian(),
				Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZhengLiuGaoHengDian);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZhuanZhengLiu);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_JiaShouCi);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_JiaMoCi);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			checkResult.add(ValidateStatusInput.LENGTH_TongDao);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShengChanGuZhang);
		}
		if (StringHelper.isLenGreater(InputByUpdateFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			checkResult.add(ValidateStatusInput.LENGTH_BeiZhuShuoMing);
		}

		return checkResult;
	}

	private ValidateStatusInput checkNumberFormat(InputByUpdateFormBean InputByUpdateFormBean) {
		// if (!StringHelper.isNumber(InputByUpdateFormBean.getYearMonthDay()))
		// {
		// return ValidateStatusInputByUpdate.NUMBER_FORMAT_YearMonthDay;
		// }
		if (!StringHelper.isNumber(InputByUpdateFormBean.getQiHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_QiHao;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getLuCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_LuCi;
		}
		// if (!StringHelper.isNumber(InputByUpdateFormBean.getGuiGe())) {
		// return ValidateStatusInputByUpdate.NUMBER_FORMAT_GuiGe;
		// }
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShengChanLuHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShengChanLuHao;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFanYingQiHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_FanYingQiHao;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShiYongCiShu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShiYongCiShu;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getMg())) {
			return ValidateStatusInput.NUMBER_FORMAT_Mg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getTiCl4())) {
			return ValidateStatusInput.NUMBER_FORMAT_TiCl4;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getMaoZhong())) {
			return ValidateStatusInput.NUMBER_FORMAT_MaoZhong;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getJingZhong())) {
			return ValidateStatusInput.NUMBER_FORMAT_JingZhong;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getChengPinLv())) {
			return ValidateStatusInput.NUMBER_FORMAT_ChengPinLv;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuFe())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuFe;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuSi())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuSi;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuCl())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuCl;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuC())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuC;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuN())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuN;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuO())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuO;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuH())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuH;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuMn())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuMn;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuHb())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanSuHb;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getDengJiHanMeng())) {
			return ValidateStatusInput.NUMBER_FORMAT_DengJiHanMeng;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
			return ValidateStatusInput.NUMBER_FORMAT_KaoHeDengJiChuMeng;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getGongYiTiaoZheng())) {
			return ValidateStatusInput.NUMBER_FORMAT_GongYiTiaoZheng;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getGongYiShiYan())) {
			return ValidateStatusInput.NUMBER_FORMAT_GongYiShiYan;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getDiPiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_DiPiKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShangMaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShangMaoKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getPaBiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_PaBiKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiDiPiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiDiPiKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiShangMaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiShangMaoKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiPaBiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiPaBiKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiTaiFenKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiTaiFenKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getCiYuanKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_CiYuanKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShouXuanFeiLiaoKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getSunHaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_SunHaoKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getZongPaiMeiLiangKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZongPaiMeiLiangKg;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getChuLuZhenKongDu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ChuLuZhenKongDu;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanZuiGaoWenDu())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanZuiGaoWenDu;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getZhengLiuGaoHengDian())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZhengLiuGaoHengDian;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getZhuanZhengLiu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZhuanZhengLiu;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getJiaShouCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_JiaShouCi;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getJiaMoCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_JiaMoCi;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getTongDao())) {
			return ValidateStatusInput.NUMBER_FORMAT_TongDao;
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShengChanGuZhang())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShengChanGuZhang;
		}
		// if
		// (!StringHelper.isNumber(InputByUpdateFormBean.getBeiZhuShuoMing())) {
		// return ValidateStatusInputByUpdate.NUMBER_FORMAT_BeiZhuShuoMing;
		// }
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkNumberFormatAll(InputByUpdateFormBean InputByUpdateFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		// if (!StringHelper.isNumber(InputByUpdateFormBean.getYearMonthDay()))
		// {
		// checkResult.add(ValidateStatusInputByUpdate.NUMBER_FORMAT_YearMonthDay);
		// }
		if (!StringHelper.isNumber(InputByUpdateFormBean.getQiHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_QiHao);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getLuCi())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_LuCi);
		}
		// if (!StringHelper.isNumber(InputByUpdateFormBean.getGuiGe())) {
		// checkResult.add(ValidateStatusInputByUpdate.NUMBER_FORMAT_GuiGe);
		// }
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShengChanLuHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShengChanLuHao);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFanYingQiHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FanYingQiHao);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShiYongCiShu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShiYongCiShu);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getMg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_Mg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getTiCl4())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_TiCl4);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getMaoZhong())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_MaoZhong);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getJingZhong())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JingZhong);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getChengPinLv())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ChengPinLv);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuFe())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuFe);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuSi())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuSi);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuCl())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuCl);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuC())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuC);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuN())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuN);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuO())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuO);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuH())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuH);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuMn())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuMn);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanSuHb())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuHb);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getDengJiHanMeng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_DengJiHanMeng);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_KaoHeDengJiChuMeng);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getGongYiTiaoZheng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_GongYiTiaoZheng);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getGongYiShiYan())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_GongYiShiYan);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getDiPiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_DiPiKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShangMaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShangMaoKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getPaBiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_PaBiKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiDiPiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiDiPiKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiShangMaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiShangMaoKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiPaBiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiPaBiKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getFeiTaiFenKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiTaiFenKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getCiYuanKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_CiYuanKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShouXuanFeiLiaoKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getSunHaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_SunHaoKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getZongPaiMeiLiangKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZongPaiMeiLiangKg);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getChuLuZhenKongDu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ChuLuZhenKongDu);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getYuanZuiGaoWenDu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanZuiGaoWenDu);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getZhengLiuGaoHengDian())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZhengLiuGaoHengDian);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getZhuanZhengLiu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZhuanZhengLiu);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getJiaShouCi())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JiaShouCi);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getJiaMoCi())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JiaMoCi);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getTongDao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_TongDao);
		}
		if (!StringHelper.isNumber(InputByUpdateFormBean.getShengChanGuZhang())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShengChanGuZhang);
		}
		// if
		// (!StringHelper.isNumber(InputByUpdateFormBean.getBeiZhuShuoMing())) {
		// checkResult.add(ValidateStatusInputByUpdate.NUMBER_FORMAT_BeiZhuShuoMing);
		// }
		checkResult.add(ValidateStatusInput.OK);

		return checkResult;
	}

	private TIronInfoDaoBean ConvToTIronInfoDaoBeanFromInputByUpdateFormBean(InputByUpdateFormBean formBean, int rowDataIndex) {
		TIronInfoDaoBean daoBean = new TIronInfoDaoBean();
		switch (rowDataIndex) {
		case 1:
			daoBean.setYearMonthDay(formBean.getYearMonthDay());
			daoBean.setQiHao(formBean.getQiHao());
			daoBean.setLuCi(formBean.getLuCi());
			daoBean.setGuiGe(formBean.getGuiGe());
			daoBean.setJunPin(formBean.getJunPin());
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

	private InputByUpdateFormBean getInputByUpdateFormBeanFromForm(InputByUpdateForm form, int index) {
		if (form != null) {
			return (InputByUpdateFormBean) form.getInputByUpdateList().get(index);
		}
		return null;
	}

	private void log(InputByUpdateFormBean InputByUpdateFormBean) {
		System.out.println("年月日:" + InputByUpdateFormBean.getYearMonthDay());
		System.out.println("期号:" + InputByUpdateFormBean.getQiHao());
		System.out.println("炉次:" + InputByUpdateFormBean.getLuCi());
		System.out.println("规格:" + InputByUpdateFormBean.getGuiGe());
		System.out.println("生产炉号:" + InputByUpdateFormBean.getShengChanLuHao());
		System.out.println("反应器号:" + InputByUpdateFormBean.getFanYingQiHao());

		System.out.println("年月日军品1:" + InputByUpdateFormBean.getYearMonthDayJunPin1());
		System.out.println("期号军品1:" + InputByUpdateFormBean.getQiHaoJunPin1());
		System.out.println("炉次军品1:" + InputByUpdateFormBean.getLuCi());
		System.out.println("炉次军品1:" + InputByUpdateFormBean.getLuCiJunPin1());
		System.out.println("规格军品1:" + InputByUpdateFormBean.getGuiGeJunPin1());
		System.out.println("生产炉号军品1:" + InputByUpdateFormBean.getShengChanLuHaoJunPin1());
		System.out.println("反应器号军品1:" + InputByUpdateFormBean.getFanYingQiHaoJunPin1());

		System.out.println("年月日军品2:" + InputByUpdateFormBean.getYearMonthDayJunPin2());
		System.out.println("期号军品2:" + InputByUpdateFormBean.getQiHaoJunPin2());
		System.out.println("炉次军品2:" + InputByUpdateFormBean.getLuCi());
		System.out.println("炉次军品2:" + InputByUpdateFormBean.getLuCiJunPin2());
		System.out.println("规格军品2:" + InputByUpdateFormBean.getGuiGeJunPin2());
		System.out.println("生产炉号军品2:" + InputByUpdateFormBean.getShengChanLuHaoJunPin2());
		System.out.println("反应器号军品2:" + InputByUpdateFormBean.getFanYingQiHaoJunPin2());
	}

	public Boolean Save(ActionForm form) {
		TIronInfoDao dao = new TIronInfoDao();
		try {
			if (form != null) {
				InputByUpdateForm inputByUpdateForm = (InputByUpdateForm) form;
				InputByUpdateFormBean InputByUpdateFormBean;
				TIronInfoDaoBean tIronInfoDaoBean;
				dao.Open();
				dao.BeginTrans();
				
				for (int i = 0; i < inputByUpdateForm.getInputByUpdateList().size(); i++) {
					InputByUpdateFormBean = getInputByUpdateFormBeanFromForm(inputByUpdateForm, i);
					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByUpdateFormBean(InputByUpdateFormBean, 1);
					
					dao.Update(tIronInfoDaoBean);
					
				}

				dao.UpdateJunPinNotInput();
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

	public Boolean Commit(ActionForm form) {
		TIronInfoDao dao = new TIronInfoDao();
		try {
			if (form != null) {
				InputByUpdateForm InputByUpdateForm = (InputByUpdateForm) form;
				InputByUpdateFormBean InputByUpdateFormBean;
				TIronInfoDaoBean tIronInfoDaoBean;
				dao.Open();
				dao.BeginTrans();
				// 信息输入画面，默认10条数据 循环
				String tmpLuci = "";
				String tmpYearMonthDay = "";
				for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
					// 信息输入画面Form取得FormBean
					InputByUpdateFormBean = getInputByUpdateFormBeanFromForm(InputByUpdateForm, i);
					// log(InputByUpdateFormBean);
					// 1：常规数据 2:军品1 3：军品2
					// FormBean转化成DaoBean
					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByUpdateFormBean(InputByUpdateFormBean, 1);

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
						dao.Insert(tIronInfoDaoBean);
					}
				}
				dao.UpdateJunPinNotInput();
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
}
