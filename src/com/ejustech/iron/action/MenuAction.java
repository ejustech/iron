package com.ejustech.iron.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.EventDispatchAction;

import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.databean.form.SearchFormBean;

public class MenuAction extends EventDispatchAction {
    // 处理search动作
    public ActionForward search(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
    {
        try
        {	
        	SearchFormBean searchFormBean = new SearchFormBean();
        	searchFormBean.setSelInfoList("1");
        	ArrayList<SearchFormBean> selList = new ArrayList<SearchFormBean>();
        	selList.add(searchFormBean);
        	request.setAttribute("SELLIST", selList);
			return mapping.findForward("search");
        }
        catch (Exception e)
        {
        }
        return null;
    }     
    // 处理search动作
    public ActionForward inputByNew(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
    {
        try
        {

    		ArrayList<InputByNewFormBean> inputByNewList = new ArrayList<InputByNewFormBean>();
    		
    		InputByNewFormBean inputByNewFormBean;
    		
    		for (int i = 0; i < 10; i++) {
    			inputByNewFormBean = new InputByNewFormBean();
    			inputByNewFormBean.setYear("");
    			inputByNewFormBean.setMonth("");
    			inputByNewFormBean.setDay("");
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
    			inputByNewFormBean.setYuansuMn("");
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
    			inputByNewFormBean.setYearJunPin("");
    			inputByNewFormBean.setMonthJunPin("");
    			inputByNewFormBean.setDayJunPin("");
    			inputByNewFormBean.setYearMonthDayJunPin("");
    			inputByNewFormBean.setQiHaoJunPin("");
    			inputByNewFormBean.setLuCiJunPin("");
    			inputByNewFormBean.setGuiGeJunPin("");
    			inputByNewFormBean.setShengChanLuHaoJunPin("");
    			inputByNewFormBean.setFanYingQiHaoJunPin("");
    			inputByNewFormBean.setShiYongCiShuJunPin("");
    			inputByNewFormBean.setMgJunPin("");
    			inputByNewFormBean.setTiCl4JunPin("");
    			inputByNewFormBean.setMaoZhongJunPin("");
    			inputByNewFormBean.setJingZhongJunPin("");
    			inputByNewFormBean.setChengPinLvJunPin("");
    			inputByNewFormBean.setYuanSuFeJunPin("");
    			inputByNewFormBean.setYuanSuSiJunPin("");
    			inputByNewFormBean.setYuanSuClJunPin("");
    			inputByNewFormBean.setYuanSuCJunPin("");
    			inputByNewFormBean.setYuanSuNJunPin("");
    			inputByNewFormBean.setYuanSuOJunPin("");
    			inputByNewFormBean.setYuanSuHJunPin("");
    			inputByNewFormBean.setYuansuMnJunPin("");
    			inputByNewFormBean.setYuanSuHbJunPin("");
    			inputByNewFormBean.setDengJiHanMengJunPin("");
    			inputByNewFormBean.setKaoHeDengJiChuMengJunPin("");
    			inputByNewFormBean.setGongYiTiaoZhengJunPin("");
    			inputByNewFormBean.setGongYiShiYanJunPin("");
    			inputByNewFormBean.setDiPiKgJunPin("");
    			inputByNewFormBean.setShangMaoKgJunPin("");
    			inputByNewFormBean.setPaBiKgJunPin("");
    			inputByNewFormBean.setFeiDiPiKgJunPin("");
    			inputByNewFormBean.setFeiShangMaoKgJunPin("");
    			inputByNewFormBean.setFeiPaBiKgJunPin("");
    			inputByNewFormBean.setFeiTaiFenKgJunPin("");
    			inputByNewFormBean.setCiYuanKgJunPin("");
    			inputByNewFormBean.setShouXuanFeiLiaoKgJunPin("");
    			inputByNewFormBean.setSunHaoKgJunPin("");
    			inputByNewFormBean.setZongPaiMeiLiangKgJunPin("");
    			inputByNewFormBean.setChuLuZhenKongDuJunPin("");
    			inputByNewFormBean.setYuanZuiGaoWenDuJunPin("");
    			inputByNewFormBean.setZhengLiuGaoHengDianJunPin("");
    			inputByNewFormBean.setZhuanZhengLiuJunPin("");
    			inputByNewFormBean.setJiaShouCiJunPin("");
    			inputByNewFormBean.setJiaMoCiJunPin("");
    			inputByNewFormBean.setTongDaoJunPin("");
    			inputByNewFormBean.setShengChanGuZhangJunPin("");
    			inputByNewFormBean.setBeiZhuShuoMingJunPin("");
    			inputByNewList.add(inputByNewFormBean);
    		}
    		
    		request.setAttribute("inputByNewList", inputByNewList);
    		
			return mapping.findForward("inputByNew");
        }
        catch (Exception e)
        {
        }
        return null;
    }     
}
