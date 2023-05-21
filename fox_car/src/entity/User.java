package entity;

import java.io.File;

public class User {
	private int id;
	private String username;
	private String password;
	private String qqnum;//车牌号、经营牌照
	private String phone;//电话
	private String name;//姓名
	private String address;//地址
	private int zan;
	private int zan_;
	private float money;//余额
	
	private int status;//0 存车 1 车商 2 租车
	
	private int car_status;//期限
	
	
	private String idenno;
	
	
	private String fileFileName;
	private File file;
	private String image_url;

	private String carType;

	private String sex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQqnum() {
		return qqnum;
	}

	public void setQqnum(String qqnum) {
		this.qqnum = qqnum;
	}

	public int getZan() {
		return zan;
	}

	public void setZan(int zan) {
		this.zan = zan;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZan_() {
		return zan_;
	}

	public void setZan_(int zan_) {
		this.zan_ = zan_;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCar_status() {
		return car_status;
	}

	public void setCar_status(int car_status) {
		this.car_status = car_status;
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

	public String getIdenno() {
		return idenno;
	}

	public void setIdenno(String idenno) {
		this.idenno = idenno;
	}


	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
