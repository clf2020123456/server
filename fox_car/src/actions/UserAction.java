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

import service.UserService;
import utils.CreateId;
import utils.Utils;

import net.sf.json.JSONObject;


import entity.User;

public class UserAction extends BaseAction {
	private UserService userservice;
	private User user;
	private String jsonString;
	private boolean flag;
	private String message;
	private List<User> lst = new ArrayList<User>();
	public String chongzhi_in() {
		user = userservice.load(user.getId());
		return SUCCESS;
		
	}
	public String chongzhi_in1() {
		user = userservice.load(user.getId());
		return SUCCESS;
		
	}
	public String chongzhi_in2() {
		user = userservice.load(user.getId());
		return SUCCESS;
		
	}
	public String chongzhi() {
		userservice.chongzhi(user);
		return SUCCESS;
	}
	public String chongzhi1() {
		userservice.chongzhi(user);
		return SUCCESS;
	}
	public String chongzhi2() {
		userservice.chongzhi(user);
		return SUCCESS;
	}
	public String tixian() {
		boolean flag=userservice.tixian(user);
		
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
		
	}
	public String update_pwd() {
		boolean flag2=userservice.checkbyphone(user.getPhone());
		if(!flag2){
			jsonString="2";
		}else{
			boolean flag=userservice.update_pwd(user);
			
			if(flag){
				jsonString="1";
			}else{
				jsonString="0";
			}
		}
	
		
		return SUCCESS;
		
	}
	public String chongzhi_() {
		boolean flag=userservice.chongzhi(user);
		
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
		
	}
	public String update_address() {
		boolean flag=userservice.update_address(user);
		
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
		
	}
	public String login() {

		user = userservice.login(user.getUsername(), user.getPassword());

		JSONObject jo = JSONObject.fromObject(user);

		jsonString = jo.toString();

		return SUCCESS;

	}

	public String reg() {
		
		boolean flag2= userservice.checkbyusername(user.getUsername());
		
		if(flag2){
			jsonString="2";
		}else{
			
			boolean flag3=userservice.checkbyphone(user.getPhone());
			if(flag3){
				jsonString="3";
			}else{
				flag = userservice.reg(user);

				if (flag) {
					jsonString = "1";
				} else {
					jsonString = "0";
				}
			}
		
		}

		

		return SUCCESS;

	}
	public String modify() {
		    if(user.getId()>0){
		    	try {
					user.setImage_url(URLDecoder.decode(user.getImage_url(), "utf-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
			flag = userservice.reg(user);
			
			if (flag) {
				jsonString = "1";
			} else {
				jsonString = "0";
			}
		
		
		
		return SUCCESS;
		
	}
	
	public String uploadphoto() {
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"/upload");

		File file_ = new File(realpath);
		if (!file_.exists()) {
			file_.mkdirs();
		}
		String filename = user.getFileFileName();
		String extention = Utils.getExtensionName(filename);
		filename = CreateId.getId() + "." + extention;
		// jingdian.setImage_url(filename);

		try {
			FileUtils.copyFile(user.getFile(), new File(file_, filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.setImage_url("upload" + "\\\\" + filename);
		boolean flag = userservice.update_photo(user);
		if (flag) {
			jsonString = "1";
		} else {
			jsonString = "0";
		}
		return SUCCESS;
	}
	public String listjson() {
		jsonString = userservice.listjson();
		return SUCCESS;
	}
	public String listjson2() {
		jsonString = userservice.listjson2();
		return SUCCESS;
	}
	public String listjson2_0() {
		jsonString = userservice.listjson2_0();
		return SUCCESS;
	}
	public String load() {
		
		user = userservice.load(user.getId());
		
		JSONObject jo = JSONObject.fromObject(user);
		
		jsonString = jo.toString();
		
		return SUCCESS;
		
	}
	public String list() {
		
		lst =userservice.list();
		
		return SUCCESS;
		
	}
	public String list0() {
		
		lst =userservice.list0();
		
		return SUCCESS;
		
	}
	public String list1() {
		
		lst =userservice.list1();
		
		return SUCCESS;
		
	}
	public String list2() {
		
		lst =userservice.list2();
		
		return SUCCESS;
		
	}
	public String delete() {
		
		userservice.del(user);
		return SUCCESS;
		
		
	}
	public String delete1() {
		
		userservice.del(user);
		return SUCCESS;
		
		
	}
	public String delete2() {
		
		userservice.del(user);
		return SUCCESS;
		
		
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getLst() {
		return lst;
	}

	public void setLst(List<User> lst) {
		this.lst = lst;
	}
	

}
