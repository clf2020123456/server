package actions;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import service.BiotechService;
import service.FoxEngineService;
import utils.CreateId;
import utils.Utils;

import entity.Biotech;
import entity.Cunche;
import entity.Folder;
import entity.Zuche;

public class FoxAction extends BaseAction {
	private FoxEngineService foxservice;
	private Zuche zuche;
	private Cunche cunche;
	private String jsonString;
	private int id;
	private List<Cunche> list1 = new ArrayList<Cunche>();
	private List<Cunche> list1_1 = new ArrayList<Cunche>();
	private List<Cunche> list1_2 = new ArrayList<Cunche>();
	private List<Cunche> list1_3 = new ArrayList<Cunche>();
	private List<Cunche> list1_4 = new ArrayList<Cunche>();
	private List<Cunche> list1_0 = new ArrayList<Cunche>();
	private List<Zuche> list2 = new ArrayList<Zuche>();
	private List<Zuche> list2_0 = new ArrayList<Zuche>();
	private List<Zuche> list2_1 = new ArrayList<Zuche>();
	private List<Zuche> list2_2 = new ArrayList<Zuche>();
	private List<Zuche> list2_3 = new ArrayList<Zuche>();
	private float money1_1,money1_2;
	private float money2_2;
	private int userid;

	public String save1_() {
//		String realpath = ServletActionContext.getServletContext().getRealPath(
//				"/upload");
//
//		File file_ = new File(realpath);
//		if (!file_.exists()) {
//			file_.mkdirs();
//		}
//		String filename = cunche.getFileFileName();
//		String extention = Utils.getExtensionName(filename);
//		filename = CreateId.getId() + "." + extention;
		// jingdian.setImage_url(filename);

		try {
			
			try {
				cunche.setCunche_start_date(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(URLDecoder.decode(cunche.getCunche_start_date_str(), "utf-8")));
				cunche.setCunche_end_date(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(URLDecoder.decode(cunche.getCunche_end_date_str(), "utf-8")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			FileUtils.copyFile(cunche.getFile(), new File(file_, filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cunche.setCar_no(URLDecoder.decode(cunche.getCar_no(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		cunche.setImage_url("upload" + "\\" + filename);

		foxservice.save1(cunche);

		return SUCCESS;
	}
	public String save2_() {
		
		try {
			
			try {
				zuche.setZuche_start_date(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(URLDecoder.decode(zuche.getZuche_start_date_str(), "utf-8")));
				zuche.setZuche_end_date(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(URLDecoder.decode(zuche.getZuche_end_date_str(), "utf-8")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			zuche.setCar_no(URLDecoder.decode(zuche.getCar_no(), "utf-8"));
			zuche.setImage_url(URLDecoder.decode(zuche.getImage_url(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		foxservice.save2(zuche);
		
		return SUCCESS;
	}
	public String del1_() {
		
		boolean flag = foxservice.del1(cunche);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String del1() {
		
		foxservice.del1(cunche);
		return SUCCESS;
	}
	public String del2() {
		
		foxservice.del2(zuche);
		return SUCCESS;
	}
	public String del2_() {
		
		boolean flag = foxservice.del2(zuche);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String jiesuan2_() {
		
		boolean flag = foxservice.jiesuan2(zuche);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String jiesuan1_() {
		
		boolean flag = foxservice.jiesuan2(zuche);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String jiesuan1() {
		
		boolean flag = foxservice.jiesuan1(cunche);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}

	public String list1() {
		list1 = foxservice.list1_();
		for(Cunche cunche:list1){
			if(cunche.getStatus()==0){
				list1_0.add(cunche);
			}
			if(cunche.getStatus()==1){
				list1_1.add(cunche);
			}
			if(cunche.getStatus()==2){
				list1_2.add(cunche);
			}
			if(cunche.getStatus()==3){
				list1_3.add(cunche);
			}
			if(cunche.getStatus()==4){
				list1_4.add(cunche);
			}
			
			money1_1+=cunche.getMoney();
			money1_2+=cunche.getMoney2();
			
		}

		return SUCCESS;
	}
	public String list2() {
		list2 = foxservice.list2_();
		
		for(Zuche zuche:list2){
			if(zuche.getStatus()==0){
				list2_0.add(zuche);
			}
			if(zuche.getStatus()==1){
				list2_1.add(zuche);
			}
			if(zuche.getStatus()==2){
				list2_2.add(zuche);
			}
			if(zuche.getStatus()==3){
				list2_3.add(zuche);
			}
			money2_2+=zuche.getMoney();
		}
		
		return SUCCESS;
	}
	public String list1_() {
		jsonString = foxservice.list1();
		
		return SUCCESS;
	}

	
	public String list2_() {
		jsonString = foxservice.list2();
		
		return SUCCESS;
	}

	public String listbyuser1() {
		jsonString = foxservice.listbyuser1(userid);
		
		return SUCCESS;
	}
	
	public String listbyuser2() {
		jsonString = foxservice.listbyuser2(userid);
		
		return SUCCESS;
	}

	
	
	
	
	

	public String detailjson1() {
		jsonString = foxservice.load1_(id);
		return SUCCESS;
	}
	public String detailjson2() {
		jsonString = foxservice.load2_(id);
		return SUCCESS;
	}
	public FoxEngineService getFoxservice() {
		return foxservice;
	}
	public void setFoxservice(FoxEngineService foxservice) {
		this.foxservice = foxservice;
	}
	public Zuche getZuche() {
		return zuche;
	}
	public void setZuche(Zuche zuche) {
		this.zuche = zuche;
	}
	public Cunche getCunche() {
		return cunche;
	}
	public void setCunche(Cunche cunche) {
		this.cunche = cunche;
	}
	public String getJsonString() {
		return jsonString;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Cunche> getList1() {
		return list1;
	}
	public void setList1(List<Cunche> list1) {
		this.list1 = list1;
	}
	public List<Zuche> getList2() {
		return list2;
	}
	public void setList2(List<Zuche> list2) {
		this.list2 = list2;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public List<Cunche> getList1_1() {
		return list1_1;
	}
	public void setList1_1(List<Cunche> list1_1) {
		this.list1_1 = list1_1;
	}
	public List<Cunche> getList1_2() {
		return list1_2;
	}
	public void setList1_2(List<Cunche> list1_2) {
		this.list1_2 = list1_2;
	}
	public List<Cunche> getList1_3() {
		return list1_3;
	}
	public void setList1_3(List<Cunche> list1_3) {
		this.list1_3 = list1_3;
	}
	public List<Cunche> getList1_4() {
		return list1_4;
	}
	public void setList1_4(List<Cunche> list1_4) {
		this.list1_4 = list1_4;
	}
	public List<Cunche> getList1_0() {
		return list1_0;
	}
	public void setList1_0(List<Cunche> list1_0) {
		this.list1_0 = list1_0;
	}
	public float getMoney1_1() {
		return money1_1;
	}
	public void setMoney1_1(float money1_1) {
		this.money1_1 = money1_1;
	}
	public float getMoney1_2() {
		return money1_2;
	}
	public void setMoney1_2(float money1_2) {
		this.money1_2 = money1_2;
	}
	public List<Zuche> getList2_0() {
		return list2_0;
	}
	public void setList2_0(List<Zuche> list2_0) {
		this.list2_0 = list2_0;
	}
	public List<Zuche> getList2_1() {
		return list2_1;
	}
	public void setList2_1(List<Zuche> list2_1) {
		this.list2_1 = list2_1;
	}
	public List<Zuche> getList2_2() {
		return list2_2;
	}
	public void setList2_2(List<Zuche> list2_2) {
		this.list2_2 = list2_2;
	}
	public List<Zuche> getList2_3() {
		return list2_3;
	}
	public void setList2_3(List<Zuche> list2_3) {
		this.list2_3 = list2_3;
	}
	public float getMoney2_2() {
		return money2_2;
	}
	public void setMoney2_2(float money2_2) {
		this.money2_2 = money2_2;
	}
	
	
	
	
	

}
