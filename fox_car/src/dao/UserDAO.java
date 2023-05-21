package dao;



import java.util.List;

import entity.Admin;
import entity.User;



public interface UserDAO {

	public User login(String username,String password);
	public User load(int id);
	public boolean reg(User user);
	public boolean zan(int userid);
	public boolean zan_(int userid);
	public boolean del(User user);
	public boolean checkbyusername(String username);
	public boolean checkbyphone(String phone);
	public List<User> list();
	public List<User> list0();
	public List<User> list1();
	public List<User> list2();
	public List<User> list2_0();
	
	public boolean update_carstatus_1(int userid);
	public boolean update_carstatus_0(int userid);
	public boolean update_address(User user);
	public boolean update_pwd(User user);
	public boolean update_photo(User user);
	
	public boolean ductmoney(float money,int userid);
	public boolean chongzhi(User user);
}
