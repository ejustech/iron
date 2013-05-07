package com.ejustech.iron.common;

import java.util.ArrayList;
import java.util.HashMap;

import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.Result3FormBean;
import com.ejustech.iron.databean.form.Result5FormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.Result7FormBean;

/**
 * @author Administrator 
 * 横向合并list
 */
public class Utility {

	// result2 list 合并
	public static ArrayList<Result2FormBean> getList2ByHashMap(ArrayList<Result2FormBean> list1, ArrayList<Result2FormBean> list2, int listIndex) {

		ArrayList<Result2FormBean> result = new ArrayList<Result2FormBean>();

		HashMap<String, Result2FormBean> h1 = new HashMap<String, Result2FormBean>();
		// 把list1放在hashmap1里
		for (int i = 0; i < list1.size(); i++) {
			h1.put(list1.get(i).getQihao(), list1.get(i));
		}
		// 按照期号1-4逐一填值，如果不存在，放进空
		if (!h1.containsKey("1")) {
			h1.put("1", new Result2FormBean());
		}

		if (!h1.containsKey("2")) {
			h1.put("2", new Result2FormBean());
		}

		if (!h1.containsKey("3")) {
			h1.put("3", new Result2FormBean());
		}

		if (!h1.containsKey("4")) {
			h1.put("4", new Result2FormBean());
		}

		HashMap<String, Result2FormBean> h2 = new HashMap<String, Result2FormBean>();
		// 把list2放在hashmap2里
		for (int i = 0; i < list2.size(); i++) {
			h2.put(list2.get(i).getQihao(), list2.get(i));
		}

		if (!h2.containsKey("1")) {
			h2.put("1", new Result2FormBean());
		}

		if (!h2.containsKey("2")) {
			h2.put("2", new Result2FormBean());
		}

		if (!h2.containsKey("3")) {
			h2.put("3", new Result2FormBean());
		}

		if (!h2.containsKey("4")) {
			h2.put("4", new Result2FormBean());
		}

		Result2FormBean resultBean = new Result2FormBean();
		// 按照期号1-4逐一循环添加list,list2到list1里按照行数先传到form里，返回最终list结果集
		for (int i = 0; i < h1.size(); i++) {
			switch (listIndex) {
			case 2:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				// h2->bean
				resultBean.setZonglushu(h2.get(String.valueOf(i + 1)).getZonglushu());
				break;
			case 3:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				// h2->bean
				resultBean.setFe(h2.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h2.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h2.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h2.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h2.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h2.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h2.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h2.get(String.valueOf(i + 1)).getZongjingzhong());
				if (h2.get(String.valueOf(i + 1)).getZongmaozhong() != null)
					resultBean.setJunmaozhong(Output.getAValue(h2.get(String.valueOf(i + 1)).getZongmaozhong(), h1.get(String.valueOf(i + 1))
							.getZonglushu(), 0));
				if (h2.get(String.valueOf(i + 1)).getMgzongliang() != null)
					resultBean.setJunmgdanhao(Output.getAkgValue(h2.get(String.valueOf(i + 1)).getMgzongliang(), h2.get(String.valueOf(i + 1))
							.getZongmaozhong(), 3));
				if (h2.get(String.valueOf(i + 1)).getZongjingzhong() != null)
					resultBean.setJunjingzhong(Output.getAValue(h2.get(String.valueOf(i + 1)).getZongjingzhong(), h1.get(String.valueOf(i + 1))
							.getZonglushu(), 0));
				if (h2.get(String.valueOf(i + 1)).getTicl4zongliang() != null)
					resultBean.setTicl4danhao(Output.getAkgValue(h2.get(String.valueOf(i + 1)).getTicl4zongliang(), h2.get(String.valueOf(i + 1))
							.getZongmaozhong(), 2));
				break;
			case 4:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				// h2->bean
				resultBean.setJ0Aji(h2.get(String.valueOf(i + 1)).getJ0Aji());
				if (h2.get(String.valueOf(i + 1)).getJ0Aji() != null)
					resultBean
							.setJ0Ajilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0Aji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 5:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				// h2->bean
				resultBean.setJ0ji(h2.get(String.valueOf(i + 1)).getJ0ji());
				if (h2.get(String.valueOf(i + 1)).getJ0ji() != null)
					resultBean.setJ0jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 6:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				// h2->bean
				resultBean.setJ1ji(h2.get(String.valueOf(i + 1)).getJ1ji());
				if (h2.get(String.valueOf(i + 1)).getJ1ji() != null)
					resultBean.setJ1jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ1ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 7:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				// h2->bean
				resultBean.setJ2ji(h2.get(String.valueOf(i + 1)).getJ2ji());
				break;
			case 8:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				// h2->bean
				resultBean.setJ3ji(h2.get(String.valueOf(i + 1)).getJ3ji());
				break;
			case 9:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				// h2->bean
				resultBean.setJ4ji(h2.get(String.valueOf(i + 1)).getJ4ji());
				break;
			case 10:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				resultBean.setJ4ji(h1.get(String.valueOf(i + 1)).getJ4ji());
				// h2->bean
				resultBean.setJ5ji(h2.get(String.valueOf(i + 1)).getJ5ji());
				break;
			case 11:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				resultBean.setJ4ji(h1.get(String.valueOf(i + 1)).getJ4ji());
				resultBean.setJ5ji(h1.get(String.valueOf(i + 1)).getJ5ji());
				// h2->bean
				resultBean.setJ2jijiyixia(h2.get(String.valueOf(i + 1)).getJ2jijiyixia());
				if (h2.get(String.valueOf(i + 1)).getJ2jijiyixia() != null)
					resultBean.setJ2jijiyixialv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ2jijiyixia(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 12:
				resultBean = new Result2FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				resultBean.setJ4ji(h1.get(String.valueOf(i + 1)).getJ4ji());
				resultBean.setJ5ji(h1.get(String.valueOf(i + 1)).getJ5ji());
				resultBean.setJ2jijiyixia(h1.get(String.valueOf(i + 1)).getJ2jijiyixia());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				// h2->bean
				resultBean.setJ0jiyishang(h2.get(String.valueOf(i + 1)).getJ0jiyishang());
				if (h2.get(String.valueOf(i + 1)).getJ0jiyishang() != null)
					resultBean.setJ0jiyishanglv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0jiyishang(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			default:
				break;
			}

			result.add(resultBean);
		}

		return result;
	}

	// result3 list 合并
	public static ArrayList<Result3FormBean> getList3ByHashMap(ArrayList<Result3FormBean> list1, ArrayList<Result3FormBean> list2, int listIndex) {

		ArrayList<Result3FormBean> result = new ArrayList<Result3FormBean>();

		HashMap<String, Result3FormBean> h1 = new HashMap<String, Result3FormBean>();
		// 把list1放在hashmap1里
		for (int i = 0; i < list1.size(); i++) {
			h1.put(list1.get(i).getQihao(), list1.get(i));
		}
		// 按照期号1-4逐一填值，如果不存在，放进空
		if (!h1.containsKey("1")) {
			h1.put("1", new Result3FormBean());
		}

		if (!h1.containsKey("2")) {
			h1.put("2", new Result3FormBean());
		}

		if (!h1.containsKey("3")) {
			h1.put("3", new Result3FormBean());
		}

		if (!h1.containsKey("4")) {
			h1.put("4", new Result3FormBean());
		}

		HashMap<String, Result3FormBean> h2 = new HashMap<String, Result3FormBean>();
		// 把list2放在hashmap2里
		for (int i = 0; i < list2.size(); i++) {
			h2.put(list2.get(i).getQihao(), list2.get(i));
		}

		if (!h2.containsKey("1")) {
			h2.put("1", new Result3FormBean());
		}

		if (!h2.containsKey("2")) {
			h2.put("2", new Result3FormBean());
		}

		if (!h2.containsKey("3")) {
			h2.put("3", new Result3FormBean());
		}

		if (!h2.containsKey("4")) {
			h2.put("4", new Result3FormBean());
		}

		Result3FormBean resultBean = new Result3FormBean();
		// 按照期号1-4逐一循环添加list,list2到list1里按照行数先传到form里，返回最终list结果集
		for (int i = 0; i < h1.size(); i++) {
			switch (listIndex) {
			case 2:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				// h2->bean
				resultBean.setZonglushu(h2.get(String.valueOf(i + 1)).getZonglushu());

				break;
			case 3:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				// h2->bean
				resultBean.setFe(h2.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h2.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h2.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h2.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h2.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h2.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h2.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h2.get(String.valueOf(i + 1)).getZongjingzhong());
				if (h2.get(String.valueOf(i + 1)).getZongmaozhong() != null)
					resultBean.setJunmaozhong(Output.getAValue(h2.get(String.valueOf(i + 1)).getZongmaozhong(), h1.get(String.valueOf(i + 1))
							.getZonglushu(), 0));
				if (h2.get(String.valueOf(i + 1)).getMgzongliang() != null)
					resultBean.setJunmgdanhao(Output.getAkgValue(h2.get(String.valueOf(i + 1)).getMgzongliang(), h2.get(String.valueOf(i + 1))
							.getZongmaozhong(), 3));
				if (h2.get(String.valueOf(i + 1)).getZongjingzhong() != null)
					resultBean.setJunjingzhong(Output.getAValue(h2.get(String.valueOf(i + 1)).getZongjingzhong(), h1.get(String.valueOf(i + 1))
							.getZonglushu(), 0));
				if (h2.get(String.valueOf(i + 1)).getTicl4zongliang() != null)
					resultBean.setTicl4danhao(Output.getAkgValue(h2.get(String.valueOf(i + 1)).getTicl4zongliang(), h2.get(String.valueOf(i + 1))
							.getZongmaozhong(), 2));
				break;
			case 4:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				// h2->bean
				resultBean.setJ0Aji(h2.get(String.valueOf(i + 1)).getJ0Aji());
				if (h2.get(String.valueOf(i + 1)).getJ0Aji() != null)
					resultBean
							.setJ0Ajilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0Aji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 5:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				// h2->bean
				resultBean.setJ0ji(h2.get(String.valueOf(i + 1)).getJ0ji());
				if (h2.get(String.valueOf(i + 1)).getJ0ji() != null)
					resultBean.setJ0jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 6:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				// h2->bean
				resultBean.setJ1ji(h2.get(String.valueOf(i + 1)).getJ1ji());
				if (h2.get(String.valueOf(i + 1)).getJ1ji() != null)
					resultBean.setJ1jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ1ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 7:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				// h2->bean
				resultBean.setJ2ji(h2.get(String.valueOf(i + 1)).getJ2ji());
				break;
			case 8:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				// h2->bean
				resultBean.setJ3ji(h2.get(String.valueOf(i + 1)).getJ3ji());
				break;
			case 9:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				// h2->bean
				resultBean.setJ4ji(h2.get(String.valueOf(i + 1)).getJ4ji());
				break;
			case 10:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				resultBean.setJ4ji(h1.get(String.valueOf(i + 1)).getJ4ji());
				// h2->bean
				resultBean.setJ5ji(h2.get(String.valueOf(i + 1)).getJ5ji());
				break;
			case 11:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				resultBean.setJ4ji(h1.get(String.valueOf(i + 1)).getJ4ji());
				resultBean.setJ5ji(h1.get(String.valueOf(i + 1)).getJ5ji());
				// h2->bean
				resultBean.setJ2jijiyixia(h2.get(String.valueOf(i + 1)).getJ2jijiyixia());
				if (h2.get(String.valueOf(i + 1)).getJ2jijiyixia() != null)
					resultBean.setJ2jijiyixialv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ2jijiyixia(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 12:
				resultBean = new Result3FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZonglushu(h1.get(String.valueOf(i + 1)).getZonglushu());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setHb(h1.get(String.valueOf(i + 1)).getHb());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setJunhuishoulv(h1.get(String.valueOf(i + 1)).getJunhuishoulv());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJunmaozhong(h1.get(String.valueOf(i + 1)).getJunmaozhong());
				resultBean.setJunmgdanhao(h1.get(String.valueOf(i + 1)).getJunmgdanhao());
				resultBean.setJunjingzhong(h1.get(String.valueOf(i + 1)).getJunjingzhong());
				resultBean.setTicl4danhao(h1.get(String.valueOf(i + 1)).getTicl4danhao());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2ji(h1.get(String.valueOf(i + 1)).getJ2ji());
				resultBean.setJ3ji(h1.get(String.valueOf(i + 1)).getJ3ji());
				resultBean.setJ4ji(h1.get(String.valueOf(i + 1)).getJ4ji());
				resultBean.setJ5ji(h1.get(String.valueOf(i + 1)).getJ5ji());
				resultBean.setJ2jijiyixia(h1.get(String.valueOf(i + 1)).getJ2jijiyixia());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				// h2->bean
				resultBean.setJ0jiyishang(h2.get(String.valueOf(i + 1)).getJ0jiyishang());
				if (h2.get(String.valueOf(i + 1)).getJ0jiyishang() != null)
					resultBean.setJ0jiyishanglv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0jiyishang(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			default:
				break;
			}

			result.add(resultBean);
		}

		return result;
	}

	// result5 list 合并
	public static ArrayList<Result5FormBean> getList5ByHashMap(ArrayList<Result5FormBean> list1, ArrayList<Result5FormBean> list2, int listIndex) {

		ArrayList<Result5FormBean> result = new ArrayList<Result5FormBean>();

		HashMap<String, Result5FormBean> h1 = new HashMap<String, Result5FormBean>();
		// 把list1放在hashmap1里
		for (int i = 0; i < list1.size(); i++) {
			h1.put(list1.get(i).getQihao(), list1.get(i));
		}
		// 按照期号1-4逐一填值，如果不存在，放进空
		if (!h1.containsKey("1")) {
			h1.put("1", new Result5FormBean());
		}

		if (!h1.containsKey("2")) {
			h1.put("2", new Result5FormBean());
		}

		if (!h1.containsKey("3")) {
			h1.put("3", new Result5FormBean());
		}

		if (!h1.containsKey("4")) {
			h1.put("4", new Result5FormBean());
		}

		HashMap<String, Result5FormBean> h2 = new HashMap<String, Result5FormBean>();
		// 把list2放在hashmap2里
		for (int i = 0; i < list2.size(); i++) {
			h2.put(list2.get(i).getQihao(), list2.get(i));
		}

		if (!h2.containsKey("1")) {
			h2.put("1", new Result5FormBean());
		}

		if (!h2.containsKey("2")) {
			h2.put("2", new Result5FormBean());
		}

		if (!h2.containsKey("3")) {
			h2.put("3", new Result5FormBean());
		}

		if (!h2.containsKey("4")) {
			h2.put("4", new Result5FormBean());
		}

		Result5FormBean resultBean = new Result5FormBean();
		// 按照期号1-4逐一循环添加list,list2到list1里按照行数先传到form里，返回最终list结果集
		for (int i = 0; i < h1.size(); i++) {
			switch (listIndex) {
			case 2:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				// h2->bean
				resultBean.setZongmaozhong(h2.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h2.get(String.valueOf(i + 1)).getZongjingzhong());
				break;
			case 3:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				// h2->bean
				if (h2.get(String.valueOf(i + 1)).getJ2jijiyixia() != null)
					resultBean.setJ2jijiyixialv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ2jijiyixia(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 4:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				// h2->bean
				resultBean.setFe008(h2.get(String.valueOf(i + 1)).getFe008());
				if (h2.get(String.valueOf(i + 1)).getFe008() != null)
					resultBean.setFe008bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getFe008(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 5:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				// h2->bean
				resultBean.setFe005(h2.get(String.valueOf(i + 1)).getFe005());
				if (h2.get(String.valueOf(i + 1)).getFe005() != null)
					resultBean.setFe005bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getFe005(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 6:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				resultBean.setFe005(h1.get(String.valueOf(i + 1)).getFe005());
				resultBean.setFe005bili(h1.get(String.valueOf(i + 1)).getFe005bili());
				// h2->bean
				resultBean.setCl008(h2.get(String.valueOf(i + 1)).getCl008());
				if (h2.get(String.valueOf(i + 1)).getCl008() != null)
					resultBean.setCl008bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getCl008(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 7:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				resultBean.setFe005(h1.get(String.valueOf(i + 1)).getFe005());
				resultBean.setFe005bili(h1.get(String.valueOf(i + 1)).getFe005bili());
				resultBean.setCl008(h1.get(String.valueOf(i + 1)).getCl008());
				resultBean.setCl008bili(h1.get(String.valueOf(i + 1)).getCl008bili());
				// h2->bean
				resultBean.setCl006(h2.get(String.valueOf(i + 1)).getCl006());
				if (h2.get(String.valueOf(i + 1)).getCl006() != null)
					resultBean.setCl006bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getCl006(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 8:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				resultBean.setFe005(h1.get(String.valueOf(i + 1)).getFe005());
				resultBean.setFe005bili(h1.get(String.valueOf(i + 1)).getFe005bili());
				resultBean.setCl008(h1.get(String.valueOf(i + 1)).getCl008());
				resultBean.setCl008bili(h1.get(String.valueOf(i + 1)).getCl008bili());
				resultBean.setCl006(h1.get(String.valueOf(i + 1)).getCl006());
				resultBean.setCl006bili(h1.get(String.valueOf(i + 1)).getCl006bili());
				// h2->bean
				resultBean.setO008(h2.get(String.valueOf(i + 1)).getO008());
				if (h2.get(String.valueOf(i + 1)).getO008() != null)
					resultBean
							.setO008bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getO008(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 9:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				resultBean.setFe005(h1.get(String.valueOf(i + 1)).getFe005());
				resultBean.setFe005bili(h1.get(String.valueOf(i + 1)).getFe005bili());
				resultBean.setCl008(h1.get(String.valueOf(i + 1)).getCl008());
				resultBean.setCl008bili(h1.get(String.valueOf(i + 1)).getCl008bili());
				resultBean.setCl006(h1.get(String.valueOf(i + 1)).getCl006());
				resultBean.setCl006bili(h1.get(String.valueOf(i + 1)).getCl006bili());
				resultBean.setO008(h1.get(String.valueOf(i + 1)).getO008());
				resultBean.setO008bili(h1.get(String.valueOf(i + 1)).getO008bili());
				// h2->bean
				resultBean.setO005(h2.get(String.valueOf(i + 1)).getO005());
				if (h2.get(String.valueOf(i + 1)).getO005() != null)
					resultBean
							.setO005bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getO005(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 10:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				resultBean.setFe005(h1.get(String.valueOf(i + 1)).getFe005());
				resultBean.setFe005bili(h1.get(String.valueOf(i + 1)).getFe005bili());
				resultBean.setCl008(h1.get(String.valueOf(i + 1)).getCl008());
				resultBean.setCl008bili(h1.get(String.valueOf(i + 1)).getCl008bili());
				resultBean.setCl006(h1.get(String.valueOf(i + 1)).getCl006());
				resultBean.setCl006bili(h1.get(String.valueOf(i + 1)).getCl006bili());
				resultBean.setO008(h1.get(String.valueOf(i + 1)).getO008());
				resultBean.setO008bili(h1.get(String.valueOf(i + 1)).getO008bili());
				resultBean.setO005(h1.get(String.valueOf(i + 1)).getO005());
				resultBean.setO005bili(h1.get(String.valueOf(i + 1)).getO005bili());
				// h2->bean
				resultBean.setN001(h2.get(String.valueOf(i + 1)).getN001());
				if (h2.get(String.valueOf(i + 1)).getN001() != null)
					resultBean
							.setN001bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getN001(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 11:
				resultBean = new Result5FormBean();
				// h1->bean
				resultBean.setQihao(h1.get(String.valueOf(i + 1)).getQihao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				resultBean.setFe008(h1.get(String.valueOf(i + 1)).getFe008());
				resultBean.setFe008bili(h1.get(String.valueOf(i + 1)).getFe008bili());
				resultBean.setFe005(h1.get(String.valueOf(i + 1)).getFe005());
				resultBean.setFe005bili(h1.get(String.valueOf(i + 1)).getFe005bili());
				resultBean.setCl008(h1.get(String.valueOf(i + 1)).getCl008());
				resultBean.setCl008bili(h1.get(String.valueOf(i + 1)).getCl008bili());
				resultBean.setCl006(h1.get(String.valueOf(i + 1)).getCl006());
				resultBean.setCl006bili(h1.get(String.valueOf(i + 1)).getCl006bili());
				resultBean.setO008(h1.get(String.valueOf(i + 1)).getO008());
				resultBean.setO008bili(h1.get(String.valueOf(i + 1)).getO008bili());
				resultBean.setO005(h1.get(String.valueOf(i + 1)).getO005());
				resultBean.setO005bili(h1.get(String.valueOf(i + 1)).getO005bili());
				resultBean.setN001(h1.get(String.valueOf(i + 1)).getN001());
				resultBean.setN001bili(h1.get(String.valueOf(i + 1)).getN001bili());
				// h2->bean
				resultBean.setFecl008(h2.get(String.valueOf(i + 1)).getFecl008());
				if (h2.get(String.valueOf(i + 1)).getFecl008() != null)
					resultBean.setFecl008bili(Output.getPValue(h2.get(String.valueOf(i + 1)).getFecl008(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			default:
				break;
			}

			result.add(resultBean);
		}

		return result;
	}

	// result6 list 合并
	public static ArrayList<Result6FormBean> getList6ByHashMap(ArrayList<Result6FormBean> list1, ArrayList<Result6FormBean> list2, int listIndex) {

		ArrayList<Result6FormBean> result = new ArrayList<Result6FormBean>();

		HashMap<String, Result6FormBean> h1 = new HashMap<String, Result6FormBean>();
		// 把list1放在hashmap1里
		for (int i = 0; i < list1.size(); i++) {
			h1.put(list1.get(i).getShengchanluhao(), list1.get(i));
		}
		// 按照生产炉号1-16逐一填值，如果不存在，放进空
		if (!h1.containsKey("1")) {
			h1.put("1", new Result6FormBean());
		}

		if (!h1.containsKey("2")) {
			h1.put("2", new Result6FormBean());
		}

		if (!h1.containsKey("3")) {
			h1.put("3", new Result6FormBean());
		}

		if (!h1.containsKey("4")) {
			h1.put("4", new Result6FormBean());
		}

		if (!h1.containsKey("5")) {
			h1.put("5", new Result6FormBean());
		}

		if (!h1.containsKey("6")) {
			h1.put("6", new Result6FormBean());
		}

		if (!h1.containsKey("7")) {
			h1.put("7", new Result6FormBean());
		}

		if (!h1.containsKey("8")) {
			h1.put("8", new Result6FormBean());
		}

		if (!h1.containsKey("9")) {
			h1.put("9", new Result6FormBean());
		}

		if (!h1.containsKey("10")) {
			h1.put("10", new Result6FormBean());
		}

		if (!h1.containsKey("11")) {
			h1.put("11", new Result6FormBean());
		}

		if (!h1.containsKey("12")) {
			h1.put("12", new Result6FormBean());
		}

		if (!h1.containsKey("13")) {
			h1.put("13", new Result6FormBean());
		}

		if (!h1.containsKey("14")) {
			h1.put("14", new Result6FormBean());
		}

		if (!h1.containsKey("15")) {
			h1.put("15", new Result6FormBean());
		}

		if (!h1.containsKey("16")) {
			h1.put("16", new Result6FormBean());
		}

		HashMap<String, Result6FormBean> h2 = new HashMap<String, Result6FormBean>();
		// 把list2放在hashmap2里
		for (int i = 0; i < list2.size(); i++) {
			h2.put(list2.get(i).getShengchanluhao(), list2.get(i));
		}

		if (!h2.containsKey("1")) {
			h2.put("1", new Result6FormBean());
		}

		if (!h2.containsKey("2")) {
			h2.put("2", new Result6FormBean());
		}

		if (!h2.containsKey("3")) {
			h2.put("3", new Result6FormBean());
		}

		if (!h2.containsKey("4")) {
			h2.put("4", new Result6FormBean());
		}

		if (!h2.containsKey("5")) {
			h2.put("5", new Result6FormBean());
		}

		if (!h2.containsKey("6")) {
			h2.put("6", new Result6FormBean());
		}

		if (!h2.containsKey("7")) {
			h2.put("7", new Result6FormBean());
		}

		if (!h2.containsKey("8")) {
			h2.put("8", new Result6FormBean());
		}

		if (!h2.containsKey("9")) {
			h2.put("9", new Result6FormBean());
		}

		if (!h2.containsKey("10")) {
			h2.put("10", new Result6FormBean());
		}

		if (!h2.containsKey("11")) {
			h2.put("11", new Result6FormBean());
		}

		if (!h2.containsKey("12")) {
			h2.put("12", new Result6FormBean());
		}

		if (!h2.containsKey("13")) {
			h2.put("13", new Result6FormBean());
		}

		if (!h2.containsKey("14")) {
			h2.put("14", new Result6FormBean());
		}

		if (!h2.containsKey("15")) {
			h2.put("15", new Result6FormBean());
		}

		if (!h2.containsKey("16")) {
			h2.put("16", new Result6FormBean());
		}

		Result6FormBean resultBean = new Result6FormBean();
		// 按照期号1-16逐一循环添加list,list2到list1里按照行数先传到form里，返回最终list结果集
		for (int i = 0; i < h1.size(); i++) {
			switch (listIndex) {
			case 1:
				resultBean = new Result6FormBean();
				// h1->bean
				resultBean.setShengchanluhao(h1.get(String.valueOf(i + 1)).getShengchanluhao());
				// h2->bean
				resultBean.setZongmaozhong(h2.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h2.get(String.valueOf(i + 1)).getZongjingzhong());
				if (h2.get(String.valueOf(i + 1)).getChengpinlv() != null)
					resultBean.setChengpinlv(Output.getPValue(h2.get(String.valueOf(i + 1)).getChengpinlv()));
				if (h2.get(String.valueOf(i + 1)).getMgdanhao() != null)
					resultBean.setMgdanhao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getMgdanhao(), 3));
				if (h2.get(String.valueOf(i + 1)).getFe() != null)
					resultBean.setFe(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFe(), 4));
				if (h2.get(String.valueOf(i + 1)).getCl() != null)
					resultBean.setCl(Output.getSubValue(h2.get(String.valueOf(i + 1)).getCl(), 4));
				if (h2.get(String.valueOf(i + 1)).getN() != null)
					resultBean.setN(Output.getSubValue(h2.get(String.valueOf(i + 1)).getN(), 4));
				if (h2.get(String.valueOf(i + 1)).getO() != null)
					resultBean.setO(Output.getSubValue(h2.get(String.valueOf(i + 1)).getO(), 4));
				break;
			case 2:
				resultBean = new Result6FormBean();
				// h1->bean
				resultBean.setShengchanluhao(h1.get(String.valueOf(i + 1)).getShengchanluhao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				// h2->bean
				resultBean.setJ0Aji(h2.get(String.valueOf(i + 1)).getJ0Aji());
				if (h2.get(String.valueOf(i + 1)).getJ0Aji() != null)
					resultBean
							.setJ0Ajilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0Aji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 3:
				resultBean = new Result6FormBean();
				// h1->bean
				resultBean.setShengchanluhao(h1.get(String.valueOf(i + 1)).getShengchanluhao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				// h2->bean
				resultBean.setJ0ji(h2.get(String.valueOf(i + 1)).getJ0ji());
				if (h2.get(String.valueOf(i + 1)).getJ0ji() != null)
					resultBean.setJ0jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 4:
				resultBean = new Result6FormBean();
				// h1->bean
				resultBean.setShengchanluhao(h1.get(String.valueOf(i + 1)).getShengchanluhao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				// h2->bean
				resultBean.setJ1ji(h2.get(String.valueOf(i + 1)).getJ1ji());
				if (h2.get(String.valueOf(i + 1)).getJ1ji() != null)
					resultBean.setJ1jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ1ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 5:
				resultBean = new Result6FormBean();
				// h1->bean
				resultBean.setShengchanluhao(h1.get(String.valueOf(i + 1)).getShengchanluhao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				// h2->bean
				resultBean.setJ2jijiyixia(h2.get(String.valueOf(i + 1)).getJ2jijiyixia());
				if (h2.get(String.valueOf(i + 1)).getJ2jijiyixia() != null)
					resultBean.setJ2jijiyixialv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ2jijiyixia(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 6:
				resultBean = new Result6FormBean();
				// h1->bean
				resultBean.setShengchanluhao(h1.get(String.valueOf(i + 1)).getShengchanluhao());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2jijiyixia(h1.get(String.valueOf(i + 1)).getJ2jijiyixia());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				// h2->bean
				resultBean.setZonglucishu(h2.get(String.valueOf(i + 1)).getZonglucishu());
				if (h2.get(String.valueOf(i + 1)).getDipi() != null)
					resultBean.setDipi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getDipi(), 0));
				if (h2.get(String.valueOf(i + 1)).getShangmao() != null)
					resultBean.setShangmao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getShangmao(), 0));
				if (h2.get(String.valueOf(i + 1)).getPabi() != null)
					resultBean.setPabi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getPabi(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeidipi() != null)
					resultBean.setFeidipi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeidipi(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeishangmao() != null)
					resultBean.setFeishangmao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeishangmao(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeipabi() != null)
					resultBean.setFeipabi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeipabi(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeitaifen() != null)
					resultBean.setFeitaifen(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeitaifen(), 1));
				if (h2.get(String.valueOf(i + 1)).getCixuanfeiliao() != null)
					resultBean.setCixuanfeiliao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getCixuanfeiliao(), 1));
				if (h2.get(String.valueOf(i + 1)).getShouxuanfeiliao() != null)
					resultBean.setShouxuanfeiliao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getShouxuanfeiliao(), 1));
				if (h2.get(String.valueOf(i + 1)).getSunhao() != null)
					resultBean.setSunhao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getSunhao(), 1));
				break;
			default:
				break;
			}

			result.add(resultBean);
		}

		return result;
	}
	
	// result7 list合并
	public static ArrayList<Result7FormBean> getList7ByHashMap(ArrayList<Result7FormBean> list1, ArrayList<Result7FormBean> list2, int listIndex) {

		ArrayList<Result7FormBean> result = new ArrayList<Result7FormBean>();

		HashMap<String, Result7FormBean> h1 = new HashMap<String, Result7FormBean>();
		// 把 list1放在hashmap1 里
		for (int i = 0; i < list1.size(); i++) {
			h1.put(list1.get(i).getYue(), list1.get(i));
		}
		// 按照生产炉号1-12逐一填值，如果不存在，放进空
		if (!h1.containsKey("1")) {
			h1.put("1", new Result7FormBean());
		}

		if (!h1.containsKey("2")) {
			h1.put("2", new Result7FormBean());
		}

		if (!h1.containsKey("3")) {
			h1.put("3", new Result7FormBean());
		}

		if (!h1.containsKey("4")) {
			h1.put("4", new Result7FormBean());
		}

		if (!h1.containsKey("5")) {
			h1.put("5", new Result7FormBean());
		}

		if (!h1.containsKey("6")) {
			h1.put("6", new Result7FormBean());
		}

		if (!h1.containsKey("7")) {
			h1.put("7", new Result7FormBean());
		}

		if (!h1.containsKey("8")) {
			h1.put("8", new Result7FormBean());
		}

		if (!h1.containsKey("9")) {
			h1.put("9", new Result7FormBean());
		}

		if (!h1.containsKey("10")) {
			h1.put("10", new Result7FormBean());
		}

		if (!h1.containsKey("11")) {
			h1.put("11", new Result7FormBean());
		}

		if (!h1.containsKey("12")) {
			h1.put("12", new Result7FormBean());
		}

		HashMap<String, Result7FormBean> h2 = new HashMap<String, Result7FormBean>();
		// 把list2放在hashmap2 里
		for (int i = 0; i < list2.size(); i++) {
			h2.put(list2.get(i).getYue(), list2.get(i));
		}

		if (!h2.containsKey("1")) {
			h2.put("1", new Result7FormBean());
		}

		if (!h2.containsKey("2")) {
			h2.put("2", new Result7FormBean());
		}

		if (!h2.containsKey("3")) {
			h2.put("3", new Result7FormBean());
		}

		if (!h2.containsKey("4")) {
			h2.put("4", new Result7FormBean());
		}

		if (!h2.containsKey("5")) {
			h2.put("5", new Result7FormBean());
		}

		if (!h2.containsKey("6")) {
			h2.put("6", new Result7FormBean());
		}

		if (!h2.containsKey("7")) {
			h2.put("7", new Result7FormBean());
		}

		if (!h2.containsKey("8")) {
			h2.put("8", new Result7FormBean());
		}

		if (!h2.containsKey("9")) {
			h2.put("9", new Result7FormBean());
		}

		if (!h2.containsKey("10")) {
			h2.put("10", new Result7FormBean());
		}

		if (!h2.containsKey("11")) {
			h2.put("11", new Result7FormBean());
		}

		if (!h2.containsKey("12")) {
			h2.put("12", new Result7FormBean());
		}

		Result7FormBean resultBean = new Result7FormBean();
		// 按照期号1-12逐一循环添加list,list2到list1里按照行数先传到form里，返回最终list结果集
		for (int i = 0; i < h1.size(); i++) {
			switch (listIndex) {
			case 1:
				resultBean = new Result7FormBean();
				// h1->bean
				resultBean.setYue(h1.get(String.valueOf(i + 1)).getYue());
				// h2->bean
				resultBean.setZongmaozhong(h2.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h2.get(String.valueOf(i + 1)).getZongjingzhong());
				if (h2.get(String.valueOf(i + 1)).getChengpinlv() != null)
					resultBean.setChengpinlv(Output.getPValue(h2.get(String.valueOf(i + 1)).getChengpinlv()));
				if (h2.get(String.valueOf(i + 1)).getMgdanhao() != null)
					resultBean.setMgdanhao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getMgdanhao(), 3));
				if (h2.get(String.valueOf(i + 1)).getFe() != null)
					resultBean.setFe(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFe(), 4));
				if (h2.get(String.valueOf(i + 1)).getCl() != null)
					resultBean.setCl(Output.getSubValue(h2.get(String.valueOf(i + 1)).getCl(), 4));
				if (h2.get(String.valueOf(i + 1)).getN() != null)
					resultBean.setN(Output.getSubValue(h2.get(String.valueOf(i + 1)).getN(), 4));
				if (h2.get(String.valueOf(i + 1)).getO() != null)
					resultBean.setO(Output.getSubValue(h2.get(String.valueOf(i + 1)).getO(), 4));
				break;
			case 2:
				resultBean = new Result7FormBean();
				// h1->bean
				resultBean.setYue(h1.get(String.valueOf(i + 1)).getYue());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				// h2->bean
				resultBean.setJ0Aji(h2.get(String.valueOf(i + 1)).getJ0Aji());
				if (h2.get(String.valueOf(i + 1)).getJ0Aji() != null)
					resultBean
							.setJ0Ajilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0Aji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 3:
				resultBean = new Result7FormBean();
				// h1->bean
				resultBean.setYue(h1.get(String.valueOf(i + 1)).getYue());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				// h2->bean
				resultBean.setJ0ji(h2.get(String.valueOf(i + 1)).getJ0ji());
				if (h2.get(String.valueOf(i + 1)).getJ0ji() != null)
					resultBean.setJ0jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ0ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 4:
				resultBean = new Result7FormBean();
				// h1->bean
				resultBean.setYue(h1.get(String.valueOf(i + 1)).getYue());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				// h2->bean
				resultBean.setJ1ji(h2.get(String.valueOf(i + 1)).getJ1ji());
				if (h2.get(String.valueOf(i + 1)).getJ1ji() != null)
					resultBean.setJ1jilv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ1ji(), h1.get(String.valueOf(i + 1)).getZongmaozhong()));
				break;
			case 5:
				resultBean = new Result7FormBean();
				// h1->bean
				resultBean.setYue(h1.get(String.valueOf(i + 1)).getYue());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				// h2->bean
				resultBean.setJ2jijiyixia(h2.get(String.valueOf(i + 1)).getJ2jijiyixia());
				if (h2.get(String.valueOf(i + 1)).getJ2jijiyixia() != null)
					resultBean.setJ2jijiyixialv(Output.getPValue(h2.get(String.valueOf(i + 1)).getJ2jijiyixia(), h1.get(String.valueOf(i + 1))
							.getZongmaozhong()));
				break;
			case 6:
				resultBean = new Result7FormBean();
				// h1->bean
				resultBean.setYue(h1.get(String.valueOf(i + 1)).getYue());
				resultBean.setZongmaozhong(h1.get(String.valueOf(i + 1)).getZongmaozhong());
				resultBean.setZongjingzhong(h1.get(String.valueOf(i + 1)).getZongjingzhong());
				resultBean.setChengpinlv(h1.get(String.valueOf(i + 1)).getChengpinlv());
				resultBean.setMgdanhao(h1.get(String.valueOf(i + 1)).getMgdanhao());
				resultBean.setFe(h1.get(String.valueOf(i + 1)).getFe());
				resultBean.setCl(h1.get(String.valueOf(i + 1)).getCl());
				resultBean.setN(h1.get(String.valueOf(i + 1)).getN());
				resultBean.setO(h1.get(String.valueOf(i + 1)).getO());
				resultBean.setJ0Aji(h1.get(String.valueOf(i + 1)).getJ0Aji());
				resultBean.setJ0Ajilv(h1.get(String.valueOf(i + 1)).getJ0Ajilv());
				resultBean.setJ0ji(h1.get(String.valueOf(i + 1)).getJ0ji());
				resultBean.setJ0jilv(h1.get(String.valueOf(i + 1)).getJ0jilv());
				resultBean.setJ1ji(h1.get(String.valueOf(i + 1)).getJ1ji());
				resultBean.setJ1jilv(h1.get(String.valueOf(i + 1)).getJ1jilv());
				resultBean.setJ2jijiyixia(h1.get(String.valueOf(i + 1)).getJ2jijiyixia());
				resultBean.setJ2jijiyixialv(h1.get(String.valueOf(i + 1)).getJ2jijiyixialv());
				// h2->bean
				resultBean.setZonglucishu(h2.get(String.valueOf(i + 1)).getZonglucishu());
				if (h2.get(String.valueOf(i + 1)).getDipi() != null)
					resultBean.setDipi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getDipi(), 0));
				if (h2.get(String.valueOf(i + 1)).getShangmao() != null)
					resultBean.setShangmao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getShangmao(), 0));
				if (h2.get(String.valueOf(i + 1)).getPabi() != null)
					resultBean.setPabi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getPabi(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeidipi() != null)
					resultBean.setFeidipi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeidipi(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeishangmao() != null)
					resultBean.setFeishangmao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeishangmao(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeipabi() != null)
					resultBean.setFeipabi(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeipabi(), 0));
				if (h2.get(String.valueOf(i + 1)).getFeitaifen() != null)
					resultBean.setFeitaifen(Output.getSubValue(h2.get(String.valueOf(i + 1)).getFeitaifen(), 1));
				if (h2.get(String.valueOf(i + 1)).getCixuanfeiliao() != null)
					resultBean.setCixuanfeiliao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getCixuanfeiliao(), 1));
				if (h2.get(String.valueOf(i + 1)).getShouxuanfeiliao() != null)
					resultBean.setShouxuanfeiliao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getShouxuanfeiliao(), 1));
				if (h2.get(String.valueOf(i + 1)).getSunhao() != null)
					resultBean.setSunhao(Output.getSubValue(h2.get(String.valueOf(i + 1)).getSunhao(), 1));
				break;
			default:
				break;
			}

			result.add(resultBean);
		}

		return result;
	}

}
