package entity;

import java.io.File;

public class Biotech {
	private int id;
	private String title;
	private String content;

	private String type;//0 租车、1 新闻、
	private String author;
	private String pubdate;

	private int status;//0发起，1，接单，2完成 3 超时，已取消,4已结算
	private String fileFileName;
	private File file;
	private String image_url;
	private int zan;
	private String ck_phone;//
	
	private String type2;//类型 :物业缴费、快递代拿、商品购买、故障报修
	private int add_userid;// 
	private int get_userid;//接单者
	private String price;//价格
	
	private String longitude;
	private String latitude;
	
	private String get_username;//接单者
	
	private int status2;//是否置顶， 0不置顶，1置顶
	
	
	private String order_no;
	private String receiver;
	private String sender;
	private String from_address;
	private String to_address;
	
	
	
	

	
	
	
	
	

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getFrom_address() {
		return from_address;
	}

	public void setFrom_address(String from_address) {
		this.from_address = from_address;
	}

	public String getTo_address() {
		return to_address;
	}

	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}

	public int getStatus2() {
		return status2;
	}

	public void setStatus2(int status2) {
		this.status2 = status2;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public int getAdd_userid() {
		return add_userid;
	}

	public void setAdd_userid(int add_userid) {
		this.add_userid = add_userid;
	}

	public int getGet_userid() {
		return get_userid;
	}

	public void setGet_userid(int get_userid) {
		this.get_userid = get_userid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getZan() {
		return zan;
	}

	public void setZan(int zan) {
		this.zan = zan;
	}

	public String getImage_url() {
		return image_url;
	}

	public String getGet_username() {
		return get_username;
	}

	public void setGet_username(String get_username) {
		this.get_username = get_username;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getType() {
		return type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getCk_phone() {
		return ck_phone;
	}

	public void setCk_phone(String ck_phone) {
		this.ck_phone = ck_phone;
	}

	public void setType(String type) {
		this.type = type;
	}

}
