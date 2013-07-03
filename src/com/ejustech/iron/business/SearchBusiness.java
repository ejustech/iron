package com.ejustech.iron.business;

import com.ejustech.iron.form.SearchForm;

public class SearchBusiness {
	public boolean DanLuShengChanShuJuTongJi_QiHaoIsOnly(SearchForm searchForm) {
		
		String selInfoList = searchForm.getSelInfoList();
		
		int reportFlg = Integer.parseInt(selInfoList);
		
		if (reportFlg == 6) {
			String[] qihao = searchForm.getQihao();
			if (qihao.length > 1) {
				return true;
			}
		}
		
		return false;
	}

}
	