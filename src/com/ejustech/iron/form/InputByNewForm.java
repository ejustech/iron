/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.ejustech.iron.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ejustech.iron.business.InputByNewBusiness;
import com.ejustech.iron.common.AutoArrayList;
import com.ejustech.iron.common.StringHelper;
import com.ejustech.iron.common.IronEnum.ErrorType;
import com.ejustech.iron.common.IronEnum.UserRole;
import com.ejustech.iron.common.IronEnum.ValidateStatusInputByNew;
import com.ejustech.iron.databean.form.InputByNewFormBean;

public class InputByNewForm extends ActionForm {
	private List inputByNewList = new AutoArrayList(InputByNewFormBean.class);

	public List getInputByNewList() {
		return inputByNewList;
	}

	public void setInputByNewList(List inputByNewList) {
		this.inputByNewList = inputByNewList;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		InputByNewBusiness business = new InputByNewBusiness();
		InputByNewFormBean checkBean = new InputByNewFormBean();
		ArrayList<ValidateStatusInputByNew> checkResultList = new ArrayList<ValidateStatusInputByNew>();

		ActionErrors error = new ActionErrors();
//		 error.add("errors", new ActionMessage("jsp.inputByNew.test.error"));
		// error.add("errors", new
		// ActionMessage("jsp.inputByNew.Empty.YearMonthDay"));
		// error.add("errors", new ActionMessage("jsp.inputByNew.Empty.QiHao"));
		// error.add("errors", new ActionMessage("jsp.inputByNew.Empty.LuCi"));
		// error.add("errors", new ActionMessage("jsp.inputByNew.Empty.GuiGe"));
		// error.add("errors", new
		// ActionMessage("jsp.inputByNew.Format.YearMonthDay"));
		// error.add("error01", new
		// ActionMessage("jsp.inputByNew.Length.QiHao"));
		ValidateStatusInputByNew checkResult;

		for (int rowIndex = 0; rowIndex < inputByNewList.size(); rowIndex++) {
			checkBean = (InputByNewFormBean) inputByNewList.get(rowIndex);
			
			if (StringHelper.isNullEmpty(checkBean.getLuCi()) && StringHelper.isNullEmpty(checkBean.getGuiGe())) continue;
			
			checkResultList.addAll(business.checkAll(checkBean, UserRole.R3));

			for (int i = 0; i < checkResultList.size(); i++) {
				checkResult = checkResultList.get(i);

				if (checkResult != ValidateStatusInputByNew.OK) {

					ErrorType errorType = business.getErrorType(checkResult);

					if (errorType == ErrorType.EMPTY) {
						error.add("errors", new ActionMessage("error.inputByNew.Empty", business.getItemNameByErrorStatus(checkResult),
								rowIndex + 1));
					} else if (errorType == ErrorType.LENGTH) {
						error.add("errors", new ActionMessage("error.inputByNew.Length", business.getItemNameByErrorStatus(checkResult),
								rowIndex + 1));
					} else if (errorType == ErrorType.NUMBER_FORMAT) {
						// TODO
						error.add("errors",
								new ActionMessage("error.inputByNew.NumberFormat", business.getItemNameByErrorStatus(checkResult),
										rowIndex + 1, 20));
					} else if (errorType == ErrorType.DATE_FORMAT) {
						error.add("errors", new ActionMessage("error.inputByNew.DateFormat", business.getItemNameByErrorStatus(checkResult),
								rowIndex + 1));
					}
				}
			}
		}

		return error;
	}
}