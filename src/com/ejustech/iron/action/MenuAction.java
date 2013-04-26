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
    private ArrayList<InputByNewFormBean> initInputByNewForm()
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
            inputByNewFormBean.setYearJunPin2("");

            inputByNewFormBean.setMonthJunPin2("");

            inputByNewFormBean.setDayJunPin2("");

            inputByNewFormBean.setYearMonthDayJunPin2("");

            inputByNewFormBean.setQiHaoJunPin2("");

            inputByNewFormBean.setLuCiJunPin2("");

            inputByNewFormBean.setGuiGeJunPin2("");

            inputByNewFormBean.setShengChanLuHaoJunPin2("");

            inputByNewFormBean.setFanYingQiHaoJunPin2("");

            inputByNewFormBean.setShiYongCiShuJunPin2("");

            inputByNewFormBean.setMgJunPin2("");

            inputByNewFormBean.setTiCl4JunPin2("");

            inputByNewFormBean.setMaoZhongJunPin2("");

            inputByNewFormBean.setJingZhongJunPin2("");

            inputByNewFormBean.setChengPinLvJunPin2("");

            inputByNewFormBean.setYuanSuFeJunPin2("");

            inputByNewFormBean.setYuanSuSiJunPin2("");

            inputByNewFormBean.setYuanSuClJunPin2("");

            inputByNewFormBean.setYuanSuCJunPin2("");

            inputByNewFormBean.setYuanSuNJunPin2("");

            inputByNewFormBean.setYuanSuOJunPin2("");

            inputByNewFormBean.setYuanSuHJunPin2("");

            inputByNewFormBean.setYuansuMnJunPin2("");

            inputByNewFormBean.setYuanSuHbJunPin2("");

            inputByNewFormBean.setDengJiHanMengJunPin2("");

            inputByNewFormBean.setKaoHeDengJiChuMengJunPin2("");

            inputByNewFormBean.setGongYiTiaoZhengJunPin2("");

            inputByNewFormBean.setGongYiShiYanJunPin2("");

            inputByNewFormBean.setDiPiKgJunPin2("");

            inputByNewFormBean.setShangMaoKgJunPin2("");

            inputByNewFormBean.setPaBiKgJunPin2("");

            inputByNewFormBean.setFeiDiPiKgJunPin2("");

            inputByNewFormBean.setFeiShangMaoKgJunPin2("");

            inputByNewFormBean.setFeiPaBiKgJunPin2("");

            inputByNewFormBean.setFeiTaiFenKgJunPin2("");

            inputByNewFormBean.setCiYuanKgJunPin2("");

            inputByNewFormBean.setShouXuanFeiLiaoKgJunPin2("");

            inputByNewFormBean.setSunHaoKgJunPin2("");

            inputByNewFormBean.setZongPaiMeiLiangKgJunPin2("");

            inputByNewFormBean.setChuLuZhenKongDuJunPin2("");

            inputByNewFormBean.setYuanZuiGaoWenDuJunPin2("");

            inputByNewFormBean.setZhengLiuGaoHengDianJunPin2("");

            inputByNewFormBean.setZhuanZhengLiuJunPin2("");

            inputByNewFormBean.setJiaShouCiJunPin2("");

            inputByNewFormBean.setJiaMoCiJunPin2("");

            inputByNewFormBean.setTongDaoJunPin2("");

            inputByNewFormBean.setShengChanGuZhangJunPin2("");

            inputByNewFormBean.setBeiZhuShuoMingJunPin2("");

            inputByNewList.add(inputByNewFormBean);
        }
        
        return inputByNewList;

    }     
    // 处理search动作
    public ActionForward inputByNew(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            request.setAttribute("inputByNewList", initInputByNewForm());
            
            return mapping.findForward("inputByNew");
        }
        catch (Exception e)
        {
        }
        return null;
    }     
}
