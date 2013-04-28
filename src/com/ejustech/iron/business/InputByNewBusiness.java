package com.ejustech.iron.business;

import org.apache.struts.action.ActionForm;

import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.InputByNewFormBean;
import com.ejustech.iron.form.InputByNewForm;

public class InputByNewBusiness {
	public InputByNewFormBean getInputByNewFormBeanFromForm(ActionForm form,
			int index) {
		if (form != null) {
			InputByNewForm inputByNewForm = (InputByNewForm) form;
			return (InputByNewFormBean) inputByNewForm.getInputByNewList().get(
					index);
		}
		return null;
	}

	public TIronInfoDaoBean ConvToTIronInfoDaoBeanFromInputByNewFormBean(
			InputByNewFormBean formBean, int rowDataIndex) {
		TIronInfoDaoBean daoBean = new TIronInfoDaoBean();
		switch (rowDataIndex) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;	
		default:
			break;
		}
		return daoBean;
	}
}
