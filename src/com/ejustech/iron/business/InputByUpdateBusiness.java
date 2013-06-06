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
				inputByUpdateFormBean.setJunPin(allInfoList.get(i).getJunPin());
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
	
	public ValidateStatusInput check(InputByUpdateFormBean inputByUpdateFormBean, UserRole userRole) {
		ValidateStatusInput checkResult = ValidateStatusInput.OK;

		// 空值的验证
		checkResult = checkEmptyByRole(inputByUpdateFormBean, userRole);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 长度的验证
		checkResult = checkLength(inputByUpdateFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 数字格式的验证
		checkResult = checkNumberFormat(inputByUpdateFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		// 日期格式的验证
		checkResult = checkDateFormat(inputByUpdateFormBean);
		if (checkResult != ValidateStatusInput.OK) {
			return checkResult;
		}

		return ValidateStatusInput.OK;
	}

	public ArrayList<ValidateStatusInput> checkAllForSave(InputByUpdateFormBean inputByUpdateFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		ArrayList<ValidateStatusInput> checkEmptyByRole = checkEmptyByRoleAllForSave(inputByUpdateFormBean, userRole);
		ArrayList<ValidateStatusInput> checkLength = checkLengthAll(inputByUpdateFormBean);
		ArrayList<ValidateStatusInput> checkNumberFormat = checkNumberFormatAll(inputByUpdateFormBean);
		ArrayList<ValidateStatusInput> checkDateFormat = checkDateFormatAll(inputByUpdateFormBean);

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
	
//	public ArrayList<ValidateStatusInput> checkAllForCommit(InputByUpdateFormBean inputByUpdateFormBean, UserRole userRole) {
//		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();
//
//		ArrayList<ValidateStatusInput> checkEmptyByRole = checkEmptyByRoleAllForCommit(inputByUpdateFormBean, userRole);
//		ArrayList<ValidateStatusInput> checkLength = checkLengthAll(inputByUpdateFormBean);
//		ArrayList<ValidateStatusInput> checkNumberFormat = checkNumberFormatAll(inputByUpdateFormBean);
//		ArrayList<ValidateStatusInput> checkDateFormat = checkDateFormatAll(inputByUpdateFormBean);
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

	private ValidateStatusInput checkDateFormat(InputByUpdateFormBean inputByUpdateFormBean) {
		if (!StringHelper.isDateFormat(inputByUpdateFormBean.getYearMonthDay())) {
			return ValidateStatusInput.DATE_FORMAT_YearMonthDay;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkDateFormatAll(InputByUpdateFormBean inputByUpdateFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && !StringHelper.isDateFormat(inputByUpdateFormBean.getYearMonthDay())) {
			checkResult.add(ValidateStatusInput.DATE_FORMAT_YearMonthDay);
		}

		return checkResult;
	}

	private ValidateStatusInput checkEmptyByRole(InputByUpdateFormBean inputByUpdateFormBean, UserRole userRole) {
		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYearMonthDay())) {
				return ValidateStatusInput.EMPTY_YearMonthDay;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getQiHao())) {
				return ValidateStatusInput.EMPTY_QiHao;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getLuCi())) {
				return ValidateStatusInput.EMPTY_LuCi;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getGuiGe())) {
				return ValidateStatusInput.EMPTY_GuiGe;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getShengChanLuHao())) {
				return ValidateStatusInput.EMPTY_ShengChanLuHao;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getFanYingQiHao())) {
				return ValidateStatusInput.EMPTY_FanYingQiHao;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getShiYongCiShu())) {
				return ValidateStatusInput.EMPTY_ShiYongCiShu;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getMg())) {
				return ValidateStatusInput.EMPTY_Mg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getTiCl4())) {
				return ValidateStatusInput.EMPTY_TiCl4;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getMaoZhong())) {
				return ValidateStatusInput.EMPTY_MaoZhong;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJingZhong())) {
				return ValidateStatusInput.EMPTY_JingZhong;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getChengPinLv())) {
				return ValidateStatusInput.EMPTY_ChengPinLv;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuFe())) {
				return ValidateStatusInput.EMPTY_YuanSuFe;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuSi())) {
				return ValidateStatusInput.EMPTY_YuanSuSi;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuCl())) {
				return ValidateStatusInput.EMPTY_YuanSuCl;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuC())) {
				return ValidateStatusInput.EMPTY_YuanSuC;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuN())) {
				return ValidateStatusInput.EMPTY_YuanSuN;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuO())) {
				return ValidateStatusInput.EMPTY_YuanSuO;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuH())) {
				return ValidateStatusInput.EMPTY_YuanSuH;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuMn())) {
				return ValidateStatusInput.EMPTY_YuanSuMn;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuHb())) {
				return ValidateStatusInput.EMPTY_YuanSuHb;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getDengJiHanMeng())) {
				return ValidateStatusInput.EMPTY_DengJiHanMeng;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
				return ValidateStatusInput.EMPTY_KaoHeDengJiChuMeng;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getGongYiTiaoZheng())) {
				return ValidateStatusInput.EMPTY_GongYiTiaoZheng;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getGongYiShiYan())) {
				return ValidateStatusInput.EMPTY_GongYiShiYan;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getDiPiKg())) {
				return ValidateStatusInput.EMPTY_DiPiKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getShangMaoKg())) {
				return ValidateStatusInput.EMPTY_ShangMaoKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getPaBiKg())) {
				return ValidateStatusInput.EMPTY_PaBiKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiDiPiKg())) {
				return ValidateStatusInput.EMPTY_FeiDiPiKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiShangMaoKg())) {
				return ValidateStatusInput.EMPTY_FeiShangMaoKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiPaBiKg())) {
				return ValidateStatusInput.EMPTY_FeiPaBiKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiTaiFenKg())) {
				return ValidateStatusInput.EMPTY_FeiTaiFenKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getCiYuanKg())) {
				return ValidateStatusInput.EMPTY_CiYuanKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
				return ValidateStatusInput.EMPTY_ShouXuanFeiLiaoKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getSunHaoKg())) {
				return ValidateStatusInput.EMPTY_SunHaoKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getZongPaiMeiLiangKg())) {
				return ValidateStatusInput.EMPTY_ZongPaiMeiLiangKg;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getChuLuZhenKongDu())) {
				return ValidateStatusInput.EMPTY_ChuLuZhenKongDu;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanZuiGaoWenDu())) {
				return ValidateStatusInput.EMPTY_YuanZuiGaoWenDu;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getZhengLiuGaoHengDian())) {
				return ValidateStatusInput.EMPTY_ZhengLiuGaoHengDian;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getZhuanZhengLiu())) {
				return ValidateStatusInput.EMPTY_ZhuanZhengLiu;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJiaShouCi())) {
				return ValidateStatusInput.EMPTY_JiaShouCi;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJiaMoCi())) {
				return ValidateStatusInput.EMPTY_JiaMoCi;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getTongDao())) {
				return ValidateStatusInput.EMPTY_TongDao;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getShengChanGuZhang())) {
				return ValidateStatusInput.EMPTY_ShengChanGuZhang;
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getBeiZhuShuoMing())) {
				return ValidateStatusInput.EMPTY_BeiZhuShuoMing;
			}
			break;
		default:
			break;
		}
		return ValidateStatusInput.OK;
	}

//	private ArrayList<ValidateStatusInput> checkEmptyByRoleAllForCommit(InputByUpdateFormBean inputByUpdateFormBean, UserRole userRole) {
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
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getYearMonthDay())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YearMonthDay);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getQiHao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_QiHao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getLuCi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_LuCi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getGuiGe())) {
//				checkResult.add(ValidateStatusInput.EMPTY_GuiGe);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShengChanLuHao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShengChanLuHao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFanYingQiHao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FanYingQiHao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShiYongCiShu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShiYongCiShu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getMg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_Mg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getTiCl4())) {
//				checkResult.add(ValidateStatusInput.EMPTY_TiCl4);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getMaoZhong())) {
//				checkResult.add(ValidateStatusInput.EMPTY_MaoZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJingZhong())) {
//				checkResult.add(ValidateStatusInput.EMPTY_JingZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getChengPinLv())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ChengPinLv);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuFe())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuFe);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuSi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuSi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuCl())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuCl);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuC())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuC);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuN())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuN);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuO())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuO);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuH())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuH);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuMn())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuMn);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuHb())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanSuHb);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getDengJiHanMeng())) {
//				checkResult.add(ValidateStatusInput.EMPTY_DengJiHanMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
//				checkResult.add(ValidateStatusInput.EMPTY_KaoHeDengJiChuMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getGongYiTiaoZheng())) {
//				checkResult.add(ValidateStatusInput.EMPTY_GongYiTiaoZheng);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getGongYiShiYan())) {
//				checkResult.add(ValidateStatusInput.EMPTY_GongYiShiYan);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getDiPiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_DiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShangMaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getPaBiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_PaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiDiPiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiDiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiShangMaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiPaBiKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiPaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiTaiFenKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_FeiTaiFenKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getCiYuanKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_CiYuanKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShouXuanFeiLiaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getSunHaoKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_SunHaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getZongPaiMeiLiangKg())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ZongPaiMeiLiangKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getChuLuZhenKongDu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ChuLuZhenKongDu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanZuiGaoWenDu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_YuanZuiGaoWenDu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getZhengLiuGaoHengDian())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ZhengLiuGaoHengDian);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getZhuanZhengLiu())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ZhuanZhengLiu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getJiaShouCi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_JiaShouCi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getJiaMoCi())) {
//				checkResult.add(ValidateStatusInput.EMPTY_JiaMoCi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getTongDao())) {
//				checkResult.add(ValidateStatusInput.EMPTY_TongDao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShengChanGuZhang())) {
//				checkResult.add(ValidateStatusInput.EMPTY_ShengChanGuZhang);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getBeiZhuShuoMing())) {
//				checkResult.add(ValidateStatusInput.EMPTY_BeiZhuShuoMing);
//			}
//			break;
//		default:
//			break;
//		}
//		return checkResult;
//	}

	private ArrayList<ValidateStatusInput> checkEmptyByRoleAllForSave(InputByUpdateFormBean inputByUpdateFormBean, UserRole userRole) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		switch (userRole) {
		case R0:

			break;
		case R1:

			break;
		case R2:

			break;
		case R3:
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getYearMonthDay())) {
				checkResult.add(ValidateStatusInput.EMPTY_YearMonthDay);
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getQiHao())) {
				checkResult.add(ValidateStatusInput.EMPTY_QiHao);
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getLuCi())) {
				checkResult.add(ValidateStatusInput.EMPTY_LuCi);
			}
			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getGuiGe())) {
				checkResult.add(ValidateStatusInput.EMPTY_GuiGe);
			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShengChanLuHao())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShengChanLuHao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFanYingQiHao())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_FanYingQiHao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShiYongCiShu())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShiYongCiShu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getMg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_Mg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getTiCl4())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_TiCl4);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getMaoZhong())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_MaoZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJingZhong())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_JingZhong);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getChengPinLv())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ChengPinLv);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuFe())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuFe);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuSi())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuSi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuCl())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuCl);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuC())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuC);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuN())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuN);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuO())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuO);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuH())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuH);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuMn())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuMn);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanSuHb())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanSuHb);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getDengJiHanMeng())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_DengJiHanMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_KaoHeDengJiChuMeng);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getGongYiTiaoZheng())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_GongYiTiaoZheng);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getGongYiShiYan())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_GongYiShiYan);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getDiPiKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_DiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShangMaoKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getPaBiKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_PaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiDiPiKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiDiPiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiShangMaoKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiShangMaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiPaBiKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiPaBiKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getFeiTaiFenKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_FeiTaiFenKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getCiYuanKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_CiYuanKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShouXuanFeiLiaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getSunHaoKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_SunHaoKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getZongPaiMeiLiangKg())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ZongPaiMeiLiangKg);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getChuLuZhenKongDu())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ChuLuZhenKongDu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getYuanZuiGaoWenDu())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_YuanZuiGaoWenDu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getZhengLiuGaoHengDian())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ZhengLiuGaoHengDian);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getZhuanZhengLiu())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ZhuanZhengLiu);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getJiaShouCi())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_JiaShouCi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getJiaMoCi())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_JiaMoCi);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getTongDao())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_TongDao);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getJunPin()) && StringHelper.isNullEmpty(inputByUpdateFormBean.getShengChanGuZhang())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_ShengChanGuZhang);
//			}
//			if (StringHelper.isNullEmpty(inputByUpdateFormBean.getBeiZhuShuoMing())) {
//				checkResult.add(ValidateStatusInputByUpdate.EMPTY_BeiZhuShuoMing);
//			}
			break;
		default:
			break;
		}
		return checkResult;
	}
	
	private ValidateStatusInput checkLength(InputByUpdateFormBean inputByUpdateFormBean) {
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			return ValidateStatusInput.LENGTH_YearMonthDay;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			return ValidateStatusInput.LENGTH_QiHao;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			return ValidateStatusInput.LENGTH_LuCi;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			return ValidateStatusInput.LENGTH_GuiGe;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			return ValidateStatusInput.LENGTH_ShengChanLuHao;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			return ValidateStatusInput.LENGTH_FanYingQiHao;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			return ValidateStatusInput.LENGTH_ShiYongCiShu;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			return ValidateStatusInput.LENGTH_Mg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			return ValidateStatusInput.LENGTH_TiCl4;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			return ValidateStatusInput.LENGTH_MaoZhong;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			return ValidateStatusInput.LENGTH_JingZhong;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			return ValidateStatusInput.LENGTH_ChengPinLv;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			return ValidateStatusInput.LENGTH_YuanSuFe;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			return ValidateStatusInput.LENGTH_YuanSuSi;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			return ValidateStatusInput.LENGTH_YuanSuCl;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			return ValidateStatusInput.LENGTH_YuanSuC;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			return ValidateStatusInput.LENGTH_YuanSuN;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			return ValidateStatusInput.LENGTH_YuanSuO;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			return ValidateStatusInput.LENGTH_YuanSuH;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			return ValidateStatusInput.LENGTH_YuanSuMn;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			return ValidateStatusInput.LENGTH_YuanSuHb;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			return ValidateStatusInput.LENGTH_DengJiHanMeng;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			return ValidateStatusInput.LENGTH_KaoHeDengJiChuMeng;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			return ValidateStatusInput.LENGTH_GongYiTiaoZheng;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			return ValidateStatusInput.LENGTH_GongYiShiYan;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			return ValidateStatusInput.LENGTH_DiPiKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			return ValidateStatusInput.LENGTH_ShangMaoKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			return ValidateStatusInput.LENGTH_PaBiKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			return ValidateStatusInput.LENGTH_FeiDiPiKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			return ValidateStatusInput.LENGTH_FeiShangMaoKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			return ValidateStatusInput.LENGTH_FeiPaBiKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			return ValidateStatusInput.LENGTH_FeiTaiFenKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			return ValidateStatusInput.LENGTH_CiYuanKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			return ValidateStatusInput.LENGTH_ShouXuanFeiLiaoKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			return ValidateStatusInput.LENGTH_SunHaoKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			return ValidateStatusInput.LENGTH_ZongPaiMeiLiangKg;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			return ValidateStatusInput.LENGTH_ChuLuZhenKongDu;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			return ValidateStatusInput.LENGTH_YuanZuiGaoWenDu;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getZhengLiuGaoHengDian(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			return ValidateStatusInput.LENGTH_ZhengLiuGaoHengDian;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			return ValidateStatusInput.LENGTH_ZhuanZhengLiu;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			return ValidateStatusInput.LENGTH_JiaShouCi;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			return ValidateStatusInput.LENGTH_JiaMoCi;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			return ValidateStatusInput.LENGTH_TongDao;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			return ValidateStatusInput.LENGTH_ShengChanGuZhang;
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			return ValidateStatusInput.LENGTH_BeiZhuShuoMing;
		}
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkLengthAll(InputByUpdateFormBean inputByUpdateFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();

		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYearMonthDay(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YearMonthDay)) {
			checkResult.add(ValidateStatusInput.LENGTH_YearMonthDay);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_QiHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_QiHao);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getLuCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_LuCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_LuCi);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getGuiGe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GuiGe)) {
			checkResult.add(ValidateStatusInput.LENGTH_GuiGe);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShengChanLuHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanLuHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShengChanLuHao);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFanYingQiHao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FanYingQiHao)) {
			checkResult.add(ValidateStatusInput.LENGTH_FanYingQiHao);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShiYongCiShu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShiYongCiShu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShiYongCiShu);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getMg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_Mg)) {
			checkResult.add(ValidateStatusInput.LENGTH_Mg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getTiCl4(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TiCl4)) {
			checkResult.add(ValidateStatusInput.LENGTH_TiCl4);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getMaoZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_MaoZhong)) {
			checkResult.add(ValidateStatusInput.LENGTH_MaoZhong);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getJingZhong(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JingZhong)) {
			checkResult.add(ValidateStatusInput.LENGTH_JingZhong);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getChengPinLv(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChengPinLv)) {
			checkResult.add(ValidateStatusInput.LENGTH_ChengPinLv);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuFe(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuFe)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuFe);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuSi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuSi)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuSi);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuCl(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuCl)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuCl);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuC(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuC)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuC);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuN(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuN)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuN);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuO(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuO)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuO);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuH(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuH)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuH);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuMn(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuMn)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuMn);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanSuHb(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanSuHb)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanSuHb);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getDengJiHanMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DengJiHanMeng)) {
			checkResult.add(ValidateStatusInput.LENGTH_DengJiHanMeng);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getKaoHeDengJiChuMeng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_KaoHeDengJiChuMeng)) {
			checkResult.add(ValidateStatusInput.LENGTH_KaoHeDengJiChuMeng);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getGongYiTiaoZheng(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiTiaoZheng)) {
			checkResult.add(ValidateStatusInput.LENGTH_GongYiTiaoZheng);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getGongYiShiYan(), Constant.LENGTH_INPUT_BY_NEW_CHECK_GongYiShiYan)) {
			checkResult.add(ValidateStatusInput.LENGTH_GongYiShiYan);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_DiPiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_DiPiKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShangMaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShangMaoKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_PaBiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_PaBiKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiDiPiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiDiPiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiDiPiKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiShangMaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiShangMaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiShangMaoKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiPaBiKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiPaBiKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiPaBiKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getFeiTaiFenKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_FeiTaiFenKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_FeiTaiFenKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getCiYuanKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_CiYuanKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_CiYuanKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShouXuanFeiLiaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShouXuanFeiLiaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShouXuanFeiLiaoKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getSunHaoKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_SunHaoKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_SunHaoKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getZongPaiMeiLiangKg(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZongPaiMeiLiangKg)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZongPaiMeiLiangKg);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getChuLuZhenKongDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ChuLuZhenKongDu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ChuLuZhenKongDu);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getYuanZuiGaoWenDu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_YuanZuiGaoWenDu)) {
			checkResult.add(ValidateStatusInput.LENGTH_YuanZuiGaoWenDu);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getZhengLiuGaoHengDian(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhengLiuGaoHengDian)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZhengLiuGaoHengDian);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getZhuanZhengLiu(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ZhuanZhengLiu)) {
			checkResult.add(ValidateStatusInput.LENGTH_ZhuanZhengLiu);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getJiaShouCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaShouCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_JiaShouCi);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getJiaMoCi(), Constant.LENGTH_INPUT_BY_NEW_CHECK_JiaMoCi)) {
			checkResult.add(ValidateStatusInput.LENGTH_JiaMoCi);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getTongDao(), Constant.LENGTH_INPUT_BY_NEW_CHECK_TongDao)) {
			checkResult.add(ValidateStatusInput.LENGTH_TongDao);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getShengChanGuZhang(), Constant.LENGTH_INPUT_BY_NEW_CHECK_ShengChanGuZhang)) {
			checkResult.add(ValidateStatusInput.LENGTH_ShengChanGuZhang);
		}
		if (StringHelper.isLenGreater(inputByUpdateFormBean.getBeiZhuShuoMing(), Constant.LENGTH_INPUT_BY_NEW_CHECK_BeiZhuShuoMing)) {
			checkResult.add(ValidateStatusInput.LENGTH_BeiZhuShuoMing);
		}

		return checkResult;
	}

	private ValidateStatusInput checkNumberFormat(InputByUpdateFormBean inputByUpdateFormBean) {
		// if (!StringHelper.isNumber(inputByUpdateFormBean.getYearMonthDay())) {
		// return ValidateStatusInputByUpdate.NUMBER_FORMAT_YearMonthDay;
		// }
		if (!StringHelper.isNumber(inputByUpdateFormBean.getQiHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_QiHao;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getLuCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_LuCi;
		}
		// if (!StringHelper.isNumber(inputByUpdateFormBean.getGuiGe())) {
		// return ValidateStatusInputByUpdate.NUMBER_FORMAT_GuiGe;
		// }
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShengChanLuHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShengChanLuHao;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFanYingQiHao())) {
			return ValidateStatusInput.NUMBER_FORMAT_FanYingQiHao;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShiYongCiShu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShiYongCiShu;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getMg())) {
			return ValidateStatusInput.NUMBER_FORMAT_Mg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getTiCl4())) {
			return ValidateStatusInput.NUMBER_FORMAT_TiCl4;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getMaoZhong())) {
			return ValidateStatusInput.NUMBER_FORMAT_MaoZhong;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getJingZhong())) {
			return ValidateStatusInput.NUMBER_FORMAT_JingZhong;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getChengPinLv())) {
			return ValidateStatusInput.NUMBER_FORMAT_ChengPinLv;
		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuFe())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuFe;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuSi())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuSi;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuCl())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuCl;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuC())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuC;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuN())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuN;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuO())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuO;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuH())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuH;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuMn())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuMn;
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuHb())) {
//			return ValidateStatusInput.NUMBER_FORMAT_YuanSuHb;
//		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getDengJiHanMeng())) {
			return ValidateStatusInput.NUMBER_FORMAT_DengJiHanMeng;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
			return ValidateStatusInput.NUMBER_FORMAT_KaoHeDengJiChuMeng;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getGongYiTiaoZheng())) {
			return ValidateStatusInput.NUMBER_FORMAT_GongYiTiaoZheng;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getGongYiShiYan())) {
			return ValidateStatusInput.NUMBER_FORMAT_GongYiShiYan;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getDiPiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_DiPiKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShangMaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShangMaoKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getPaBiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_PaBiKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiDiPiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiDiPiKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiShangMaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiShangMaoKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiPaBiKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiPaBiKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiTaiFenKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_FeiTaiFenKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getCiYuanKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_CiYuanKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShouXuanFeiLiaoKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getSunHaoKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_SunHaoKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getZongPaiMeiLiangKg())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZongPaiMeiLiangKg;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getChuLuZhenKongDu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ChuLuZhenKongDu;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanZuiGaoWenDu())) {
			return ValidateStatusInput.NUMBER_FORMAT_YuanZuiGaoWenDu;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getZhengLiuGaoHengDian())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZhengLiuGaoHengDian;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getZhuanZhengLiu())) {
			return ValidateStatusInput.NUMBER_FORMAT_ZhuanZhengLiu;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getJiaShouCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_JiaShouCi;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getJiaMoCi())) {
			return ValidateStatusInput.NUMBER_FORMAT_JiaMoCi;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getTongDao())) {
			return ValidateStatusInput.NUMBER_FORMAT_TongDao;
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShengChanGuZhang())) {
			return ValidateStatusInput.NUMBER_FORMAT_ShengChanGuZhang;
		}
		// if (!StringHelper.isNumber(inputByUpdateFormBean.getBeiZhuShuoMing())) {
		// return ValidateStatusInputByUpdate.NUMBER_FORMAT_BeiZhuShuoMing;
		// }
		return ValidateStatusInput.OK;
	}

	private ArrayList<ValidateStatusInput> checkNumberFormatAll(InputByUpdateFormBean inputByUpdateFormBean) {
		ArrayList<ValidateStatusInput> checkResult = new ArrayList<ValidateStatusInput>();
		
		// if (!StringHelper.isNumber(inputByUpdateFormBean.getYearMonthDay())) {
		// checkResult.add(ValidateStatusInputByUpdate.NUMBER_FORMAT_YearMonthDay);
		// }
		if (!StringHelper.isNumber(inputByUpdateFormBean.getQiHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_QiHao);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getLuCi())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_LuCi);
		}
		// if (!StringHelper.isNumber(inputByUpdateFormBean.getGuiGe())) {
		// checkResult.add(ValidateStatusInputByUpdate.NUMBER_FORMAT_GuiGe);
		// }
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShengChanLuHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShengChanLuHao);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFanYingQiHao())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FanYingQiHao);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShiYongCiShu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShiYongCiShu);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getMg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_Mg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getTiCl4())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_TiCl4);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getMaoZhong())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_MaoZhong);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getJingZhong())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JingZhong);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getChengPinLv())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ChengPinLv);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuFe())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuFe);
		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuSi())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuSi);
//		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuCl())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuCl);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuC())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuC);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuN())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuN);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuO())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuO);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuH())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuH);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuMn())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuMn);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanSuHb())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanSuHb);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getDengJiHanMeng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_DengJiHanMeng);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getKaoHeDengJiChuMeng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_KaoHeDengJiChuMeng);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getGongYiTiaoZheng())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_GongYiTiaoZheng);
		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getGongYiShiYan())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_GongYiShiYan);
//		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getDiPiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_DiPiKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShangMaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShangMaoKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getPaBiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_PaBiKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiDiPiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiDiPiKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiShangMaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiShangMaoKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiPaBiKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiPaBiKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getFeiTaiFenKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_FeiTaiFenKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getCiYuanKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_CiYuanKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShouXuanFeiLiaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShouXuanFeiLiaoKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getSunHaoKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_SunHaoKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getZongPaiMeiLiangKg())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZongPaiMeiLiangKg);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getChuLuZhenKongDu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ChuLuZhenKongDu);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getYuanZuiGaoWenDu())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_YuanZuiGaoWenDu);
		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getZhengLiuGaoHengDian())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZhengLiuGaoHengDian);
		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getZhuanZhengLiu())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ZhuanZhengLiu);
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getJiaShouCi())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JiaShouCi);
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getJiaMoCi())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_JiaMoCi);
//		}
//		if (!StringHelper.isNumber(inputByUpdateFormBean.getTongDao())) {
//			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_TongDao);
//		}
		if (!StringHelper.isNumber(inputByUpdateFormBean.getShengChanGuZhang())) {
			checkResult.add(ValidateStatusInput.NUMBER_FORMAT_ShengChanGuZhang);
		}
		// if (!StringHelper.isNumber(inputByUpdateFormBean.getBeiZhuShuoMing())) {
		// checkResult.add(ValidateStatusInputByUpdate.NUMBER_FORMAT_BeiZhuShuoMing);
		// }
		checkResult.add(ValidateStatusInput.OK);
		
		return checkResult;
	}

	private TIronInfoDaoBean ConvToTIronInfoDaoBeanFromInputByUpdateFormBean(InputByUpdateFormBean formBean, int rowDataIndex) {
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

	private InputByUpdateFormBean getInputByUpdateFormBeanFromForm(InputByUpdateForm form, int index) {
		if (form != null) {
			return (InputByUpdateFormBean) form.getInputByUpdateList().get(index);
		}
		return null;
	}

	private void log(InputByUpdateFormBean inputByUpdateFormBean) {
		System.out.println("年月日:" + inputByUpdateFormBean.getYearMonthDay());
		System.out.println("期号:" + inputByUpdateFormBean.getQiHao());
		System.out.println("炉次:" + inputByUpdateFormBean.getLuCi());
		System.out.println("规格:" + inputByUpdateFormBean.getGuiGe());
		System.out.println("生产炉号:" + inputByUpdateFormBean.getShengChanLuHao());
		System.out.println("反应器号:" + inputByUpdateFormBean.getFanYingQiHao());

		System.out.println("年月日军品1:" + inputByUpdateFormBean.getYearMonthDayJunPin1());
		System.out.println("期号军品1:" + inputByUpdateFormBean.getQiHaoJunPin1());
		System.out.println("炉次军品1:" + inputByUpdateFormBean.getLuCi());
		System.out.println("炉次军品1:" + inputByUpdateFormBean.getLuCiJunPin1());
		System.out.println("规格军品1:" + inputByUpdateFormBean.getGuiGeJunPin1());
		System.out.println("生产炉号军品1:" + inputByUpdateFormBean.getShengChanLuHaoJunPin1());
		System.out.println("反应器号军品1:" + inputByUpdateFormBean.getFanYingQiHaoJunPin1());

		System.out.println("年月日军品2:" + inputByUpdateFormBean.getYearMonthDayJunPin2());
		System.out.println("期号军品2:" + inputByUpdateFormBean.getQiHaoJunPin2());
		System.out.println("炉次军品2:" + inputByUpdateFormBean.getLuCi());
		System.out.println("炉次军品2:" + inputByUpdateFormBean.getLuCiJunPin2());
		System.out.println("规格军品2:" + inputByUpdateFormBean.getGuiGeJunPin2());
		System.out.println("生产炉号军品2:" + inputByUpdateFormBean.getShengChanLuHaoJunPin2());
		System.out.println("反应器号军品2:" + inputByUpdateFormBean.getFanYingQiHaoJunPin2());
	}

public Boolean Save(ActionForm form) throws Exception {
		TIronInfoDao dao = new TIronInfoDao();
		try {
			if (form != null) {
				InputByUpdateForm inputByUpdateForm = (InputByUpdateForm) form;
				InputByUpdateFormBean InputByUpdateFormBean;
				TIronInfoDaoBean tIronInfoDaoBean;
				dao.Open();
				dao.BeginTrans();
				
				String yearMonthDay = "";
				for (int i = 0; i < inputByUpdateForm.getInputByUpdateList().size(); i++) {
					InputByUpdateFormBean = getInputByUpdateFormBeanFromForm(inputByUpdateForm, i);
					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByUpdateFormBean(InputByUpdateFormBean, 1);
					
					if (tIronInfoDaoBean.getYearMonthDay() == null || "".equals(tIronInfoDaoBean.getYearMonthDay())) {
						tIronInfoDaoBean.setYearMonthDay(yearMonthDay);
					}
					else
					{
						yearMonthDay = tIronInfoDaoBean.getYearMonthDay();
					}
					
					if (dao.QueryCountByLuci(tIronInfoDaoBean.getLuCi())) {
						throw new Exception("已存在相同的炉次：" + tIronInfoDaoBean.getLuCi() +"，请确认修改后重新保存。");
					}
					
					dao.Update(tIronInfoDaoBean);
					
				}

				dao.UpdateJunPinNotInput();
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
		}
	}

//	public Boolean Commit(ActionForm form) {
//		TIronInfoDao dao = new TIronInfoDao();
//		try {
//			if (form != null) {
//				InputByUpdateForm InputByUpdateForm = (InputByUpdateForm) form;
//				InputByUpdateFormBean InputByUpdateFormBean;
//				TIronInfoDaoBean tIronInfoDaoBean;
//				dao.Open();
//				dao.BeginTrans();
//				// 信息输入画面，默认10条数据 循环
//				String tmpLuci = "";
//				String tmpYearMonthDay = "";
//				for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
//					// 信息输入画面Form取得FormBean
//					InputByUpdateFormBean = getInputByUpdateFormBeanFromForm(InputByUpdateForm, i);
//					// log(InputByUpdateFormBean);
//					// 1：常规数据 2:军品1 3：军品2
//					// FormBean转化成DaoBean
//					tIronInfoDaoBean = ConvToTIronInfoDaoBeanFromInputByUpdateFormBean(InputByUpdateFormBean, 1);
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
	
	public ArrayList<InputByUpdateFormBean> initInputByUpdateForm() {
		ArrayList<InputByUpdateFormBean> inputByUpdateList = new ArrayList<InputByUpdateFormBean>();

		InputByUpdateFormBean inputByUpdateFormBean;

		for (int i = 0; i < Constant.INPUT_BY_NEW_ROWS; i++) {
			inputByUpdateFormBean = new InputByUpdateFormBean();
			inputByUpdateFormBean.setYearMonthDay("");
			inputByUpdateFormBean.setQiHao("");
			inputByUpdateFormBean.setLuCi("");
			inputByUpdateFormBean.setGuiGe("");
			inputByUpdateFormBean.setShengChanLuHao("");
			inputByUpdateFormBean.setFanYingQiHao("");
			inputByUpdateFormBean.setShiYongCiShu("");
			inputByUpdateFormBean.setMg("");
			inputByUpdateFormBean.setTiCl4("");
			inputByUpdateFormBean.setMaoZhong("");
			inputByUpdateFormBean.setJingZhong("");
			inputByUpdateFormBean.setChengPinLv("");
			inputByUpdateFormBean.setYuanSuFe("");
			inputByUpdateFormBean.setYuanSuSi("");
			inputByUpdateFormBean.setYuanSuCl("");
			inputByUpdateFormBean.setYuanSuC("");
			inputByUpdateFormBean.setYuanSuN("");
			inputByUpdateFormBean.setYuanSuO("");
			inputByUpdateFormBean.setYuanSuH("");
			inputByUpdateFormBean.setYuanSuMn("");
			inputByUpdateFormBean.setYuanSuHb("");
			inputByUpdateFormBean.setDengJiHanMeng("");
			inputByUpdateFormBean.setKaoHeDengJiChuMeng("");
			inputByUpdateFormBean.setGongYiTiaoZheng("");
			inputByUpdateFormBean.setGongYiShiYan("");
			inputByUpdateFormBean.setDiPiKg("");
			inputByUpdateFormBean.setShangMaoKg("");
			inputByUpdateFormBean.setPaBiKg("");
			inputByUpdateFormBean.setFeiDiPiKg("");
			inputByUpdateFormBean.setFeiShangMaoKg("");
			inputByUpdateFormBean.setFeiPaBiKg("");
			inputByUpdateFormBean.setFeiTaiFenKg("");
			inputByUpdateFormBean.setCiYuanKg("");
			inputByUpdateFormBean.setShouXuanFeiLiaoKg("");
			inputByUpdateFormBean.setSunHaoKg("");
			inputByUpdateFormBean.setZongPaiMeiLiangKg("");
			inputByUpdateFormBean.setChuLuZhenKongDu("");
			inputByUpdateFormBean.setYuanZuiGaoWenDu("");
			inputByUpdateFormBean.setZhengLiuGaoHengDian("");
			inputByUpdateFormBean.setZhuanZhengLiu("");
			inputByUpdateFormBean.setJiaShouCi("");
			inputByUpdateFormBean.setJiaMoCi("");
			inputByUpdateFormBean.setTongDao("");
			inputByUpdateFormBean.setShengChanGuZhang("");
			inputByUpdateFormBean.setBeiZhuShuoMing("");
			inputByUpdateList.add(inputByUpdateFormBean);
		}
		return inputByUpdateList;
	}
	
}
