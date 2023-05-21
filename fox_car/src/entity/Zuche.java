package entity;

import java.io.File;
import java.util.Date;

public class Zuche {
	private int id;
	private int userid;
	private String username;
	private Date zuche_start_date;
	private Date zuche_end_date;
	private String zuche_start_date_str;
	private String zuche_end_date_str;
	private int status;//0 待处理，1租车中 ，2 已还车，
	private float money;
	private String fileFileName;
	private File file;
	private String image_url;
	private int days;
	
	private String car_no;
	private String car_pinpai;

	private String yajing;
	private String baoxian;
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
	public Date getZuche_start_date() {
		return zuche_start_date;
	}
	public void setZuche_start_date(Date zuche_start_date) {
		this.zuche_start_date = zuche_start_date;
	}
	public Date getZuche_end_date() {
		return zuche_end_date;
	}
	public void setZuche_end_date(Date zuche_end_date) {
		this.zuche_end_date = zuche_end_date;
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
	public String getZuche_start_date_str() {
		return zuche_start_date_str;
	}
	public void setZuche_start_date_str(String zuche_start_date_str) {
		this.zuche_start_date_str = zuche_start_date_str;
	}
	public String getZuche_end_date_str() {
		return zuche_end_date_str;
	}
	public void setZuche_end_date_str(String zuche_end_date_str) {
		this.zuche_end_date_str = zuche_end_date_str;
	}
	public String getCar_no() {
		return car_no;
	}
	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}

	public String getCar_pinpai() {
		return car_pinpai;
	}

	public void setCar_pinpai(String car_pinpai) {
		this.car_pinpai = car_pinpai;
	}

	public String getYajing() {
		return yajing;
	}

	public void setYajing(String yajing) {
		this.yajing = yajing;
	}

	public String getBaoxian() {
		return baoxian;
	}

	public void setBaoxian(String baoxian) {
		this.baoxian = baoxian;
	}
}
