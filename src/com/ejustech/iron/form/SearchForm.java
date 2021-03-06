package com.ejustech.iron.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 04-16-2013
 * 
 * XDoclet definition:
 * 
 * @struts.form name="searchForm"
 */
public class SearchForm extends ActionForm {
	/*
	 * Generated fields
	 */

	private static final long serialVersionUID = 1L;

	/** huishoulv1 property */
	private String huishoulv1;

	/** shengchanluhao property */
	private String shengchanluhao;

	/** huishoulv2 property */
	private String huishoulv2;

	/** zhuanzhengliu property */
	private String zhuanzhengliu;

	/** tongdao property */
//	private String tongdao;
	private String[] tongdao=new String[0];

	public String[] getTongdao() {
		return tongdao;
	}

	public void setTongdao(String[] tongdao) {
		this.tongdao = tongdao;
	}

	/** shengchanguzhang property */
	private String shengchanguzhang;

	/** riqi2 property */
	private String riqi2;

	/** riqi1 property */
	private String riqi1;

	/** shiyongcishu1 property */
	private String shiyongcishu1;
	
	public String getShiyongcishu1() {
		return shiyongcishu1;
	}

	public void setShiyongcishu1(String shiyongcishu1) {
		this.shiyongcishu1 = shiyongcishu1;
	}

	public String getShiyongcishu2() {
		return shiyongcishu2;
	}

	public void setShiyongcishu2(String shiyongcishu2) {
		this.shiyongcishu2 = shiyongcishu2;
	}

	/** shiyongcishu property */
	private String shiyongcishu2;

	/** hb2 property */
	private String hb2;

	/** jiashouci property */
	private String jiashouci;

	/** ticl41 property */
	private String ticl41;

	/** ticl42 property */
	private String ticl42;

	/** fe1 property */
	private String fe1;

	/** fe2 property */
	private String fe2;

	/** hb1 property */
	private String hb1;

	/** qihao property */
	private String[] qihao=new String[0];


	/** fanyingqihao property */
	private String fanyingqihao;

	/** luci1 property */
	private String luci1;

	/** luci2 property */
	private String luci2;

	/** zongpaimeiliang1 property */
	private String zongpaimeiliang1;

	/** chuluzhenkongdupa1 property */
	private String chuluzhenkongdupa1;

	/** chuluzhenkongdupa2 property */
	private String chuluzhenkongdupa2;

	/** jiamoci property */
	private String jiamoci;

	/** shiyanluci property */
	private String shiyanluci;

	/** zongpaimeiliang2 property */
	private String zongpaimeiliang2;

	/** guige property */
	private String guige;

	/** gongyitiaozhengluci property */
	private String gongyitiaozhengluci;

	/** cl1 property */
	private String cl1;

	/** cl2 property */
	private String cl2;

	private String selInfoList;
	
	private String backToMenu;
	/*
	 * Generated Methods
	 */

	public String getBackToMenu() {
		return backToMenu;
	}

	public void setBackToMenu(String backToMenu) {
		this.backToMenu = backToMenu;
	}

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the huishoulv1.
	 * 
	 * @return String
	 */
	public String getHuishoulv1() {
		return huishoulv1;
	}

	/**
	 * Set the huishoulv1.
	 * 
	 * @param huishoulv1
	 *            The huishoulv1 to set
	 */
	public void setHuishoulv1(String huishoulv1) {
		this.huishoulv1 = huishoulv1;
	}

	/**
	 * Returns the shengchanluhao.
	 * 
	 * @return String
	 */
	public String getShengchanluhao() {
		return shengchanluhao;
	}

	/**
	 * Set the shengchanluhao.
	 * 
	 * @param shengchanluhao
	 *            The shengchanluhao to set
	 */
	public void setShengchanluhao(String shengchanluhao) {
		this.shengchanluhao = shengchanluhao;
	}

	/**
	 * Returns the huishoulv2.
	 * 
	 * @return String
	 */
	public String getHuishoulv2() {
		return huishoulv2;
	}

	/**
	 * Set the huishoulv2.
	 * 
	 * @param huishoulv2
	 *            The huishoulv2 to set
	 */
	public void setHuishoulv2(String huishoulv2) {
		this.huishoulv2 = huishoulv2;
	}

	/**
	 * Returns the zhuanzhengliu.
	 * 
	 * @return String
	 */
	public String getZhuanzhengliu() {
		return zhuanzhengliu;
	}

	/**
	 * Set the zhuanzhengliu.
	 * 
	 * @param zhuanzhengliu
	 *            The zhuanzhengliu to set
	 */
	public void setZhuanzhengliu(String zhuanzhengliu) {
		this.zhuanzhengliu = zhuanzhengliu;
	}

	/**
	 * Returns the tongdao.
	 * 
	 * @return String
	 */
//	public String getTongdao() {
//		return tongdao;
//	}

	/**
	 * Set the tongdao.
	 * 
	 * @param tongdao
	 *            The tongdao to set
	 */
//	public void setTongdao(String tongdao) {
//		this.tongdao = tongdao;
//	}

	/**
	 * Returns the shengchanguzhang.
	 * 
	 * @return String
	 */
	public String getShengchanguzhang() {
		return shengchanguzhang;
	}

	/**
	 * Set the shengchanguzhang.
	 * 
	 * @param shengchanguzhang
	 *            The shengchanguzhang to set
	 */
	public void setShengchanguzhang(String shengchanguzhang) {
		this.shengchanguzhang = shengchanguzhang;
	}

	/**
	 * Returns the riqi2.
	 * 
	 * @return String
	 */
	public String getRiqi2() {
		return riqi2;
	}

	/**
	 * Set the riqi2.
	 * 
	 * @param riqi2
	 *            The riqi2 to set
	 */
	public void setRiqi2(String riqi2) {
		this.riqi2 = riqi2;
	}

	/**
	 * Returns the riqi1.
	 * 
	 * @return String
	 */
	public String getRiqi1() {
		return riqi1;
	}

	/**
	 * Set the riqi1.
	 * 
	 * @param riqi1
	 *            The riqi1 to set
	 */
	public void setRiqi1(String riqi1) {
		this.riqi1 = riqi1;
	}

	/**
	 * Returns the hb2.
	 * 
	 * @return String
	 */
	public String getHb2() {
		return hb2;
	}

	/**
	 * Set the hb2.
	 * 
	 * @param hb2
	 *            The hb2 to set
	 */
	public void setHb2(String hb2) {
		this.hb2 = hb2;
	}

	/**
	 * Returns the jiashouci.
	 * 
	 * @return String
	 */
	public String getJiashouci() {
		return jiashouci;
	}

	/**
	 * Set the jiashouci.
	 * 
	 * @param jiashouci
	 *            The jiashouci to set
	 */
	public void setJiashouci(String jiashouci) {
		this.jiashouci = jiashouci;
	}

	/**
	 * Returns the ticl4.
	 * 
	 * @return String
	 */
	public String getTicl41() {
		return ticl41;
	}

	/**
	 * Set the ticl4.
	 * 
	 * @param ticl4
	 *            The ticl4 to set
	 */
	public void setTicl41(String ticl41) {
		this.ticl41 = ticl41;
	}

	/**
	 * Returns the ticl4.
	 * 
	 * @return String
	 */
	public String getTicl42() {
		return ticl42;
	}

	/**
	 * Set the ticl4.
	 * 
	 * @param ticl4
	 *            The ticl4 to set
	 */
	public void setTicl42(String ticl42) {
		this.ticl42 = ticl42;
	}

	/**
	 * Returns the fe1.
	 * 
	 * @return String
	 */
	public String getFe1() {
		return fe1;
	}

	/**
	 * Set the fe1.
	 * 
	 * @param fe1
	 *            The fe1 to set
	 */
	public void setFe1(String fe1) {
		this.fe1 = fe1;
	}

	/**
	 * Returns the fe2.
	 * 
	 * @return String
	 */
	public String getFe2() {
		return fe2;
	}

	/**
	 * Set the fe2.
	 * 
	 * @param fe2
	 *            The fe2 to set
	 */
	public void setFe2(String fe2) {
		this.fe2 = fe2;
	}

	/**
	 * Returns the hb1.
	 * 
	 * @return String
	 */
	public String getHb1() {
		return hb1;
	}

	/**
	 * Set the hb1.
	 * 
	 * @param hb1
	 *            The hb1 to set
	 */
	public void setHb1(String hb1) {
		this.hb1 = hb1;
	}

	/**
	 * Returns the qihao.
	 * 
	 * @return String
	 */
//	public String getQihao() {
//		return qihao;
//	}
//
//	/**
//	 * Set the qihao.
//	 * 
//	 * @param qihao
//	 *            The qihao to set
//	 */
//	public void setQihao(String qihao) {
//		this.qihao = qihao;
//	}
	public void setQihao(String[] qihao){   this.qihao=qihao; }

    public String[] getQihao(){ return qihao; }


	/**
	 * Returns the fanyingqihao.
	 * 
	 * @return String
	 */
	public String getFanyingqihao() {
		return fanyingqihao;
	}

	/**
	 * Set the fanyingqihao.
	 * 
	 * @param fanyingqihao
	 *            The fanyingqihao to set
	 */
	public void setFanyingqihao(String fanyingqihao) {
		this.fanyingqihao = fanyingqihao;
	}

	/**
	 * Returns the luci1.
	 * 
	 * @return String
	 */
	public String getLuci1() {
		return luci1;
	}

	/**
	 * Set the luci1.
	 * 
	 * @param luci1
	 *            The luci1 to set
	 */
	public void setLuci1(String luci1) {
		this.luci1 = luci1;
	}

	/**
	 * Returns the luci2.
	 * 
	 * @return String
	 */
	public String getLuci2() {
		return luci2;
	}

	/**
	 * Set the luci2.
	 * 
	 * @param luci2
	 *            The luci2 to set
	 */
	public void setLuci2(String luci2) {
		this.luci2 = luci2;
	}

	/**
	 * Returns the zongpaimeiliang1.
	 * 
	 * @return String
	 */
	public String getZongpaimeiliang1() {
		return zongpaimeiliang1;
	}

	/**
	 * Set the zongpaimeiliang1.
	 * 
	 * @param zongpaimeiliang1
	 *            The zongpaimeiliang1 to set
	 */
	public void setZongpaimeiliang1(String zongpaimeiliang1) {
		this.zongpaimeiliang1 = zongpaimeiliang1;
	}

	/**
	 * Returns the chuluzhenkongdupa1.
	 * 
	 * @return String
	 */
	public String getChuluzhenkongdupa1() {
		return chuluzhenkongdupa1;
	}

	/**
	 * Set the chuluzhenkongdupa1.
	 * 
	 * @param chuluzhenkongdupa1
	 *            The chuluzhenkongdupa1 to set
	 */
	public void setChuluzhenkongdupa1(String chuluzhenkongdupa1) {
		this.chuluzhenkongdupa1 = chuluzhenkongdupa1;
	}

	/**
	 * Returns the chuluzhenkongdupa2.
	 * 
	 * @return String
	 */
	public String getChuluzhenkongdupa2() {
		return chuluzhenkongdupa2;
	}

	/**
	 * Set the chuluzhenkongdupa2.
	 * 
	 * @param chuluzhenkongdupa2
	 *            The chuluzhenkongdupa2 to set
	 */
	public void setChuluzhenkongdupa2(String chuluzhenkongdupa2) {
		this.chuluzhenkongdupa2 = chuluzhenkongdupa2;
	}

	/**
	 * Returns the jiamoci.
	 * 
	 * @return String
	 */
	public String getJiamoci() {
		return jiamoci;
	}

	/**
	 * Set the jiamoci.
	 * 
	 * @param jiamoci
	 *            The jiamoci to set
	 */
	public void setJiamoci(String jiamoci) {
		this.jiamoci = jiamoci;
	}

	/**
	 * Returns the shiyanluci.
	 * 
	 * @return String
	 */
	public String getShiyanluci() {
		return shiyanluci;
	}

	/**
	 * Set the shiyanluci.
	 * 
	 * @param shiyanluci
	 *            The shiyanluci to set
	 */
	public void setShiyanluci(String shiyanluci) {
		this.shiyanluci = shiyanluci;
	}

	/**
	 * Returns the zongpaimeiliang2.
	 * 
	 * @return String
	 */
	public String getZongpaimeiliang2() {
		return zongpaimeiliang2;
	}

	/**
	 * Set the zongpaimeiliang2.
	 * 
	 * @param zongpaimeiliang2
	 *            The zongpaimeiliang2 to set
	 */
	public void setZongpaimeiliang2(String zongpaimeiliang2) {
		this.zongpaimeiliang2 = zongpaimeiliang2;
	}

	/**
	 * Returns the guige.
	 * 
	 * @return String
	 */
	public String getGuige() {
		return guige;
	}

	/**
	 * Set the guige.
	 * 
	 * @param guige
	 *            The guige to set
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}

	/**
	 * Returns the gongyitiaozhengluci.
	 * 
	 * @return String
	 */
	public String getGongyitiaozhengluci() {
		return gongyitiaozhengluci;
	}

	/**
	 * Set the gongyitiaozhengluci.
	 * 
	 * @param gongyitiaozhengluci
	 *            The gongyitiaozhengluci to set
	 */
	public void setGongyitiaozhengluci(String gongyitiaozhengluci) {
		this.gongyitiaozhengluci = gongyitiaozhengluci;
	}

	/**
	 * Returns the cl1.
	 * 
	 * @return String
	 */
	public String getCl1() {
		return cl1;
	}

	/**
	 * Set the cl1.
	 * 
	 * @param cl1
	 *            The cl1 to set
	 */
	public void setCl1(String cl1) {
		this.cl1 = cl1;
	}

	/**
	 * Returns the cl2.
	 * 
	 * @return String
	 */
	public String getCl2() {
		return cl2;
	}

	/**
	 * Set the cl2.
	 * 
	 * @param cl2
	 *            The cl2 to set
	 */
	public void setCl2(String cl2) {
		this.cl2 = cl2;
	}

	public String getSelInfoList() {
		return selInfoList;
	}

	public void setSelInfoList(String selInfoList) {
		this.selInfoList = selInfoList;
	}
}