package entity;

import java.util.Date;

public class Message {
	private int id;
	private String username;
	private Date commitdate;
	private String content;
	private String cdate;
	private int touserid;
	private int userid;

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

	public Date getCommitdate() {
		return commitdate;
	}

	public int getTouserid() {
		return touserid;
	}

	public void setTouserid(int touserid) {
		this.touserid = touserid;
	}

	public void setCommitdate(Date commitdate) {
		this.commitdate = commitdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

}
