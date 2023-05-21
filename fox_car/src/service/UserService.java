package service;

import java.util.List;

import entity.User;


public interface UserService {
	public User login(String username,String password);
	public boolean reg(User user);
	public boolean update_pwd(User user);
	public List<User> list();
	public void del(User user); 
	public User load(int userid);
	public String listjson();
	public boolean zan(int userid);
	public boolean zan_(int userid);
	public boolean checkbyusername(String username) ;
	public boolean checkbyphone(String phone) ;
	public boolean chongzhi(User user);
	public boolean tixian(User user);
	public boolean update_address(User user);
	public boolean update_photo(User user);
	public List<User> list0();
	public List<User> list1();
	public List<User> list2();
	public String listjson2();
	public String listjson2_0();
	
}
