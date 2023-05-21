package entity;

import java.io.File;
import java.util.Date;

public class Cunche {
	private int id;
	private int userid;
	private String username;
	private Date cunche_start_date;
	private Date cunche_end_date;
	private String cunche_start_date_str;
	private String cunche_end_date_str;
	private int status;//0 待处理，1寄存中 ，2租车中  3 已取车 4已结算
	private float money;
	private float money2;//租车费
	private int days;
	
	private String fileFileName;
	private File file;
	private String image_url;
	
	private String car_no;

	private String car_pinpai;
	private String typeid;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Date getCunche_start_date() {
		return cunche_start_date;
	}
	public void setCunche_start_date(Date cunche_start_date) {
		this.cunche_start_date = cunche_start_date;
	}
	public Date getCunche_end_date() {
		return cunche_end_date;
	}
	public void setCunche_end_date(Date cunche_end_date) {
		this.cunche_end_date = cunche_end_date;
	}
	public String getCar_no() {
		return car_no;
	}
	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}
	public String getCunche_start_date_str() {
		return cunche_start_date_str;
	}
	public void setCunche_start_date_str(String cunche_start_date_str) {
		this.cunche_start_date_str = cunche_start_date_str;
	}
	public String getCunche_end_date_str() {
		return cunche_end_date_str;
	}
	public void setCunche_end_date_str(String cunche_end_date_str) {
		this.cunche_end_date_str = cunche_end_date_str;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public float getMoney2() {
		return money2;
	}
	public void setMoney2(float money2) {
		this.money2 = money2;
	}

	public String getCar_pinpai() {
		return car_pinpai;
	}

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public void setCar_pinpai(String car_pinpai) {
		this.car_pinpai = car_pinpai;
	}
}
