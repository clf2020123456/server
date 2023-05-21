package actions;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import service.BiotechService;
import utils.CreateId;
import utils.Utils;

import entity.Biotech;
import entity.Folder;

public class BiotechAction extends BaseAction {
	private BiotechService bioservice;
	private Biotech biotech;
	private String jsonString;
	private String id,type;
	private List<Biotech> list = new ArrayList<Biotech>();
	private String keyword;
	private String author;
	private Folder folder;
	private int userid;

	public String save() {
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"/upload");

		File file_ = new File(realpath);
		if (!file_.exists()) {
			file_.mkdirs();
		}
		String filename = biotech.getFileFileName();
		String extention = Utils.getExtensionName(filename);
		filename = CreateId.getId() + "." + extention;
		// jingdian.setImage_url(filename);

		try {
			FileUtils.copyFile(biotech.getFile(), new File(file_, filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		biotech.setImage_url("upload" + "\\" + filename);
		biotech.setStatus(1);
		bioservice.save(biotech);

		return SUCCESS;
	}
	public String delfolder() {
		
		boolean flag = bioservice.delfolder(folder);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String savenews() {
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"/upload");

		File file_ = new File(realpath);
		if (!file_.exists()) {
			file_.mkdirs();
		}
		String filename = biotech.getFileFileName();
		String extention = Utils.getExtensionName(filename);
		filename = CreateId.getId() + "." + extention;
		// jingdian.setImage_url(filename);

		try {
			FileUtils.copyFile(biotech.getFile(), new File(file_, filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		biotech.setImage_url("upload" + "\\" + filename);
		biotech.setStatus(1);
		bioservice.save(biotech);

		return SUCCESS;
	}

	public String saveCarType() {
		bioservice.save(biotech);
		return SUCCESS;
	}

	public String saveproj() {

		biotech.setType("2");
		bioservice.save(biotech);
		boolean flag = bioservice.save(biotech);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}

	public String dianzan() {

		boolean flag = bioservice.dianzan(biotech);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String dianzan_() {
		
		boolean flag = bioservice.dianzan_(biotech);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}

	public String addfolder() {

		boolean flag = bioservice.addfolder(folder);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}

	public String list() {
		list = bioservice.listbiotech();

		return SUCCESS;
	}

	public String uploadarticle() {
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"/upload");

		File file_ = new File(realpath);
		if (!file_.exists()) {
			file_.mkdirs();
		}
		String filename = biotech.getFileFileName();
		String extention = Utils.getExtensionName(filename);
		filename = CreateId.getId() + "." + extention;
		// jingdian.setImage_url(filename);

		try {
			FileUtils.copyFile(biotech.getFile(), new File(file_, filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			biotech.setAuthor(URLDecoder.decode(biotech.getAuthor(), "utf-8"));
			biotech.setSender(URLDecoder.decode(biotech.getSender(), "utf-8"));
			biotech.setReceiver(URLDecoder.decode(biotech.getReceiver(), "utf-8"));
			biotech.setFrom_address(URLDecoder.decode(biotech.getFrom_address(), "utf-8"));
			biotech.setTo_address(URLDecoder.decode(biotech.getTo_address(), "utf-8"));
			biotech.setOrder_no(URLDecoder.decode(biotech.getOrder_no(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		biotech.setPubdate(new SimpleDateFormat("yyyy-MM-dd HH:mm")
				.format(new Date()));
		biotech.setImage_url("upload" + "\\" + filename);
		biotech.setStatus(0);
		boolean flag = bioservice.save(biotech);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	
	public String uploadarticle1() {
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"/upload");

		File file_ = new File(realpath);
		if (!file_.exists()) {
			file_.mkdirs();
		}
		String filename = biotech.getFileFileName();
		String extention = Utils.getExtensionName(filename);
		filename = CreateId.getId() + "." + extention;
		// jingdian.setImage_url(filename);

		try {
			FileUtils.copyFile(biotech.getFile(), new File(file_, filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			biotech.setAuthor(URLDecoder.decode(biotech.getAuthor(), "utf-8"));
			biotech.setTitle(URLDecoder.decode(biotech.getTitle(), "utf-8"));
			biotech.setCk_phone(URLDecoder.decode(biotech.getCk_phone(), "utf-8"));
			biotech.setType2(URLDecoder.decode(biotech.getType2(), "utf-8"));
			biotech.setOrder_no(URLDecoder.decode(biotech.getOrder_no(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		biotech.setPubdate(new SimpleDateFormat("yyyy-MM-dd HH:mm")
				.format(new Date()));
		biotech.setImage_url("upload" + "\\" + filename);
		biotech.setStatus(0);
		boolean flag = bioservice.save(biotech);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}

	public String add() {
		return SUCCESS;
	}

	public String addnews() {
		return SUCCESS;
	}

	public String addCarType() {
		return SUCCESS;
	}

	public String listjson() {

		jsonString = bioservice.loadAllJson();
		return SUCCESS;
	}

	public String listjsonbyuser() {
		jsonString = bioservice.loadbyauthor(author);
		return SUCCESS;
	}
	public String listjsonbyuser0() {
		jsonString = bioservice.loadbyauthor0(author);
		return SUCCESS;
	}
	public String listjsonbyuser1() {
		jsonString = bioservice.loadbyauthor1(author);
		return SUCCESS;
	}
	public String listjsonbyuser2() {
		jsonString = bioservice.loadbyauthor2(author);
		return SUCCESS;
	}
	public String listjsonbyuser3() {
		jsonString = bioservice.loadbyauthor3(author);
		return SUCCESS;
	}
	
	public String list_shenhe0() {
		jsonString = bioservice.list_shenhe0();
		return SUCCESS;
	}
	public String list_shenhe1_daifenpei() {
		jsonString = bioservice.list_shenhe1_daifenpei();
		return SUCCESS;
	}
	
	public String listbytype() {
		
		jsonString = bioservice.listbytype(type);
		return SUCCESS;
	}

	public String listjsonbyfolder() {

		jsonString = bioservice.loadbyfolder(userid);
		return SUCCESS;
	}

	public String listjson0() {
		jsonString = bioservice.loadAllJson0(keyword);

		return SUCCESS;
	}
	public String loadAllJson0_0() {
		jsonString = bioservice.loadAllJson0_0(keyword);
		
		return SUCCESS;
	}
	public String loadAllJson0_1() {
		jsonString = bioservice.loadAllJson0_1(userid);
		
		return SUCCESS;
	}
	public String loadAllJson0_2() {
		jsonString = bioservice.loadAllJson0_2(userid);
		
		return SUCCESS;
	}

	public String listjson1() {
		jsonString = bioservice.loadAllJson1();

		return SUCCESS;
	}

	public String listjson2() {
		jsonString = bioservice.loadAllJson2();

		return SUCCESS;
	}
	public String udpate_jiedan() {
		boolean flag = bioservice.udpate_jiedan(biotech.getId(),biotech.getGet_userid(),biotech.getLongitude(),biotech.getLatitude());
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
	}
	public String udpate_wancheng() {
		boolean flag = bioservice.udpate_wancheng(biotech.getId(),biotech.getGet_userid());
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
	}
	public String udpate_jiesuan() {
		boolean flag = bioservice.udpate_jiesuan(biotech.getId(),biotech.getGet_userid());
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
	}
	public String del() {
		 bioservice.del(biotech);
			jsonString="1";
		
		return SUCCESS;
	}
	public String update_status2() {
		bioservice.update_status2(biotech);
		
		return SUCCESS;
	}
	public String update_status20() {
		bioservice.update_status2(biotech);
		
		return SUCCESS;
	}
	public String update_status21() {
		bioservice.update_status2(biotech);
		
		return SUCCESS;
	}
	public String update_status22() {
		bioservice.update_status2(biotech);
		
		return SUCCESS;
	}
	public String update_status23() {
		bioservice.update_status2(biotech);
		
		return SUCCESS;
	}
	
	public String shenhe_client() {
		boolean flag =bioservice.update_status2(biotech);
		
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
	}

	public String listjson3() {
		jsonString = bioservice.loadAllJson3();

		return SUCCESS;
	}

	public String listnews() {
		list = bioservice.listnews();
		return SUCCESS;
	}

	public String listtiezi() {
		list = bioservice.listtiezi();

		return SUCCESS;
	}
	
	
	public String listtiezi_0() {
		list = bioservice.listtiezi_0();
		
		return SUCCESS;
	}
	public String listtiezi_1() {
		list = bioservice.listtiezi_1();
		
		return SUCCESS;
	}
	public String listtiezi_2() {
		list = bioservice.listtiezi_2();
		
		return SUCCESS;
	}
	public String listtiezi_3() {
		list = bioservice.listtiezi_3();
		
		return SUCCESS;
	}
	
	
	
	
	

	public String listproj() {
		list = bioservice.listproj();

		return SUCCESS;
	}

	public String listck() {
		list = bioservice.listck();

		return SUCCESS;
	}

	public String detailjson() {
		jsonString = bioservice.detailjson(id);
		return SUCCESS;
	}

	public String delete() {
		bioservice.del(biotech);
		return SUCCESS;
	}

	public String deletenews() {
		bioservice.del(biotech);
		return SUCCESS;
	}

	public String deletetiezi() {
		bioservice.del(biotech);
		return SUCCESS;
	}
	public String deletetiezi0() {
		bioservice.del(biotech);
		return SUCCESS;
	}
	public String deletetiezi1() {
		bioservice.del(biotech);
		return SUCCESS;
	}
	public String deletetiezi2() {
		bioservice.del(biotech);
		return SUCCESS;
	}
	public String deletetiezi3() {
		bioservice.del(biotech);
		return SUCCESS;
	}

	public String deleteproj() {
		bioservice.del(biotech);
		return SUCCESS;
	}

	public String deleteck() {
		bioservice.del(biotech);
		return SUCCESS;
	}

	public String shenhe() {

		bioservice.shenhe(biotech);

		return SUCCESS;
	}

	public String shenheck() {

		bioservice.shenheck(biotech);

		return SUCCESS;
	}

	public String edit() {
		biotech = bioservice.load(biotech.getId());
		return SUCCESS;
	}

	public String editnews() {
		biotech = bioservice.load(biotech.getId());
		return SUCCESS;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Biotech getXianlu() {
		return biotech;
	}

	public void setXianlu(Biotech biotech) {
		this.biotech = biotech;
	}

	public Biotech getJingdian() {
		return biotech;
	}

	public void setJingdian(Biotech jingdian) {
		this.biotech = jingdian;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Biotech> getList() {
		return list;
	}

	public void setList(List<Biotech> list) {
		this.list = list;
	}

	public BiotechService getBioservice() {
		return bioservice;
	}

	public void setBioservice(BiotechService bioservice) {
		this.bioservice = bioservice;
	}

	public Biotech getBiotech() {
		return biotech;
	}

	public void setBiotech(Biotech biotech) {
		this.biotech = biotech;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
