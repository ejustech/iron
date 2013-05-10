package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.common.Constant;
import com.ejustech.iron.dao.MUserDao;
import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.SearchFormBean;
import com.ejustech.iron.databean.form.UserManageFormBean;
import com.ejustech.iron.form.InputByNewForm;
import com.ejustech.iron.form.UserManageForm;

public class MenuAction extends EventDispatchAction {
	// 处理信息检索动作
	public ActionForward search(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			SearchFormBean searchFormBean = new SearchFormBean();
			searchFormBean.setSelInfoList("1");
			ArrayList<SearchFormBean> selList = new ArrayList<SearchFormBean>();
			selList.add(searchFormBean);
			request.setAttribute("SELLIST", selList);
			return mapping.findForward("search");
		} catch (Exception e) {
		}
		return null;
	}

	// 处理信息输入动作
	public ActionForward inputByNew(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			InputByNewForm inputByNewForm = new InputByNewForm();
			inputByNewForm.setInputByNewList(initInputByNewForm());

			request.setAttribute("inputByNewForm", inputByNewForm);

			return mapping.findForward("inputByNew");
		} catch (Exception e) {
		}
		return null;
	}

	// 处理用户管理动作
	public ActionForward userManage(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			MUserDao mUserDao = new MUserDao();
			// 取得用户列表
			ArrayList<UserManageFormBean> userList = new ArrayList<UserManageFormBean>();
			userList = (ArrayList<UserManageFormBean>) mUserDao.getUserList();
			request.setAttribute("USERLIST", userList);
			
			//设置第一个userID radio被选中
			UserManageForm userManageForm = new UserManageForm();
			userManageForm.setIndexModify(userList.get(0).getUserID());
			
//			ArrayList<SearchFormBean> selList = new ArrayList<SearchFormBean>();
//			selList.add(searchFormBean);
//			request.setAttribute("SELLIST", selList);
			
			return mapping.findForward("userManage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 处理用户注销动作
	public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			return mapping.findForward("logout");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private ArrayList<InputByNewFormBean> initInputByNewForm() {
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
			// inputByNewFormBean.setYearMonthDayJunPin1("");
			// inputByNewFormBean.setQiHaoJunPin1("");
			// inputByNewFormBean.setLuCiJunPin1("");
			// inputByNewFormBean.setGuiGeJunPin1("");
			// inputByNewFormBean.setShengChanLuHaoJunPin1("");
			// inputByNewFormBean.setFanYingQiHaoJunPin1("");
			// inputByNewFormBean.setShiYongCiShuJunPin1("");
			// inputByNewFormBean.setMgJunPin1("");
			// inputByNewFormBean.setTiCl4JunPin1("");
			// inputByNewFormBean.setMaoZhongJunPin1("");
			// inputByNewFormBean.setJingZhongJunPin1("");
			// inputByNewFormBean.setChengPinLvJunPin1("");
			// inputByNewFormBean.setYuanSuFeJunPin1("");
			// inputByNewFormBean.setYuanSuSiJunPin1("");
			// inputByNewFormBean.setYuanSuClJunPin1("");
			// inputByNewFormBean.setYuanSuCJunPin1("");
			// inputByNewFormBean.setYuanSuNJunPin1("");
			// inputByNewFormBean.setYuanSuOJunPin1("");
			// inputByNewFormBean.setYuanSuHJunPin1("");
			// inputByNewFormBean.setYuanSuMnJunPin1("");
			// inputByNewFormBean.setYuanSuHbJunPin1("");
			// inputByNewFormBean.setDengJiHanMengJunPin1("");
			// inputByNewFormBean.setKaoHeDengJiChuMengJunPin1("");
			// inputByNewFormBean.setGongYiTiaoZhengJunPin1("");
			// inputByNewFormBean.setGongYiShiYanJunPin1("");
			// inputByNewFormBean.setDiPiKgJunPin1("");
			// inputByNewFormBean.setShangMaoKgJunPin1("");
			// inputByNewFormBean.setPaBiKgJunPin1("");
			// inputByNewFormBean.setFeiDiPiKgJunPin1("");
			// inputByNewFormBean.setFeiShangMaoKgJunPin1("");
			// inputByNewFormBean.setFeiPaBiKgJunPin1("");
			// inputByNewFormBean.setFeiTaiFenKgJunPin1("");
			// inputByNewFormBean.setCiYuanKgJunPin1("");
			// inputByNewFormBean.setShouXuanFeiLiaoKgJunPin1("");
			// inputByNewFormBean.setSunHaoKgJunPin1("");
			// inputByNewFormBean.setZongPaiMeiLiangKgJunPin1("");
			// inputByNewFormBean.setChuLuZhenKongDuJunPin1("");
			// inputByNewFormBean.setYuanZuiGaoWenDuJunPin1("");
			// inputByNewFormBean.setZhengLiuGaoHengDianJunPin1("");
			// inputByNewFormBean.setZhuanZhengLiuJunPin1("");
			// inputByNewFormBean.setJiaShouCiJunPin1("");
			// inputByNewFormBean.setJiaMoCiJunPin1("");
			// inputByNewFormBean.setTongDaoJunPin1("");
			// inputByNewFormBean.setShengChanGuZhangJunPin1("");
			// inputByNewFormBean.setBeiZhuShuoMingJunPin1("");
			// inputByNewFormBean.setYearMonthDayJunPin2("");
			// inputByNewFormBean.setQiHaoJunPin2("");
			// inputByNewFormBean.setLuCiJunPin2("");
			// inputByNewFormBean.setGuiGeJunPin2("");
			// inputByNewFormBean.setShengChanLuHaoJunPin2("");
			// inputByNewFormBean.setFanYingQiHaoJunPin2("");
			// inputByNewFormBean.setShiYongCiShuJunPin2("");
			// inputByNewFormBean.setMgJunPin2("");
			// inputByNewFormBean.setTiCl4JunPin2("");
			// inputByNewFormBean.setMaoZhongJunPin2("");
			// inputByNewFormBean.setJingZhongJunPin2("");
			// inputByNewFormBean.setChengPinLvJunPin2("");
			// inputByNewFormBean.setYuanSuFeJunPin2("");
			// inputByNewFormBean.setYuanSuSiJunPin2("");
			// inputByNewFormBean.setYuanSuClJunPin2("");
			// inputByNewFormBean.setYuanSuCJunPin2("");
			// inputByNewFormBean.setYuanSuNJunPin2("");
			// inputByNewFormBean.setYuanSuOJunPin2("");
			// inputByNewFormBean.setYuanSuHJunPin2("");
			// inputByNewFormBean.setYuanSuMnJunPin2("");
			// inputByNewFormBean.setYuanSuHbJunPin2("");
			// inputByNewFormBean.setDengJiHanMengJunPin2("");
			// inputByNewFormBean.setKaoHeDengJiChuMengJunPin2("");
			// inputByNewFormBean.setGongYiTiaoZhengJunPin2("");
			// inputByNewFormBean.setGongYiShiYanJunPin2("");
			// inputByNewFormBean.setDiPiKgJunPin2("");
			// inputByNewFormBean.setShangMaoKgJunPin2("");
			// inputByNewFormBean.setPaBiKgJunPin2("");
			// inputByNewFormBean.setFeiDiPiKgJunPin2("");
			// inputByNewFormBean.setFeiShangMaoKgJunPin2("");
			// inputByNewFormBean.setFeiPaBiKgJunPin2("");
			// inputByNewFormBean.setFeiTaiFenKgJunPin2("");
			// inputByNewFormBean.setCiYuanKgJunPin2("");
			// inputByNewFormBean.setShouXuanFeiLiaoKgJunPin2("");
			// inputByNewFormBean.setSunHaoKgJunPin2("");
			// inputByNewFormBean.setZongPaiMeiLiangKgJunPin2("");
			// inputByNewFormBean.setChuLuZhenKongDuJunPin2("");
			// inputByNewFormBean.setYuanZuiGaoWenDuJunPin2("");
			// inputByNewFormBean.setZhengLiuGaoHengDianJunPin2("");
			// inputByNewFormBean.setZhuanZhengLiuJunPin2("");
			// inputByNewFormBean.setJiaShouCiJunPin2("");
			// inputByNewFormBean.setJiaMoCiJunPin2("");
			// inputByNewFormBean.setTongDaoJunPin2("");
			// inputByNewFormBean.setShengChanGuZhangJunPin2("");
			// inputByNewFormBean.setBeiZhuShuoMingJunPin2("");
			inputByNewList.add(inputByNewFormBean);
		}
		return inputByNewList;
	}
}
