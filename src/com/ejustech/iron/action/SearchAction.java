package com.ejustech.iron.action;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ejustech.iron.dao.TIronInfoDao;
import com.ejustech.iron.databean.TIronInfoBean;
import com.ejustech.iron.form.Result1Form;
import com.ejustech.iron.form.SearchForm;

/**
 * MyEclipse Struts Creation date: 04-16-2013
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/search" name="searchForm" input="/form/search.jsp"
 *                scope="request" validate="true"
 */
public class SearchAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	@SuppressWarnings("rawtypes")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			SearchForm searchForm = (SearchForm) form;// TODO Auto-generated
									// method stub
			TIronInfoDao searchDao = new TIronInfoDao();

			String riqi1 = searchForm.getRiqi1();
			String riqi2 = searchForm.getRiqi2();
			String qihao = searchForm.getQihao();
			String luci1 = searchForm.getLuci1();
			String luci2 = searchForm.getLuci2();
			String guige = searchForm.getGuige();
			String shengchanluhao = searchForm.getShengchanluhao();
			String fanyingqihao = searchForm.getFanyingqihao();
			String shiyongcishu = searchForm.getShiyongcishu();
			String ticl41 = searchForm.getTicl41();
			String ticl42 = searchForm.getTicl42();
			String chuluzhenkongdu1 = searchForm.getChuluzhenkongdupa1();
			String chuluzhenkongdu2 = searchForm.getChuluzhenkongdupa2();
			String zhuanzherngliu = searchForm.getZhuanzhengliu();
			String jiashouci = searchForm.getJiashouci();
			String jiamoci = searchForm.getJiamoci();
			String shiyanluci = searchForm.getShiyanluci();
			String gongyitiaozhengluci = searchForm.getGongyitiaozhengluci();
			String tongdao = searchForm.getTongdao();
			String shengchanguzhang = searchForm.getShengchanguzhang();
			String huishoulv1 = searchForm.getHuishoulv1();
			String huishoulv2 = searchForm.getHuishoulv2();
			String zongpaimeiliang1 = searchForm.getZongpaimeiliang1();
			String zongpaimeiliang2 = searchForm.getZongpaimeiliang2();
			String fe1 = searchForm.getFe1();
			String fe2 = searchForm.getFe2();
			String hb1 = searchForm.getHb1();
			String hb2 = searchForm.getHb2();
			String cl1 = searchForm.getCl1();
			String cl2 = searchForm.getCl2();

			@SuppressWarnings("unused")
			ArrayList allInfoList = new ArrayList();
			allInfoList = (ArrayList) searchDao.getAllInfoList(request,riqi1, riqi2,
					qihao, luci1, luci2, guige, shengchanluhao, fanyingqihao,
					shiyongcishu, ticl41, ticl42, chuluzhenkongdu1,
					chuluzhenkongdu2, zhuanzherngliu, jiashouci, jiamoci,
					shiyanluci, gongyitiaozhengluci, tongdao, shengchanguzhang,
					huishoulv1, huishoulv2, zongpaimeiliang1, zongpaimeiliang2,
					fe1, fe2, hb1, hb2, cl1, cl2);
			
			//Result1Form result1Form =(Result1Form) form;		
			Result1Form result1Form = new Result1Form();
			
			result1Form.setList(allInfoList);
			System.out.println("form list size======="+result1Form.getList().size());
			System.out.println("luci======="+result1Form.getLuci());
			
			request.setAttribute("AllINFOLIST", result1Form);
//			request.setAttribute("AllINFOLIST", allInfoList);
			
			return mapping.findForward("srch1");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapping.findForward("loginError");
		}
	}
}