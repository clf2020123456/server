package service.impl;

import java.util.List;

import net.sf.json.JSONArray;

import service.UserService;


import dao.UserDAO;
import entity.Biotech;
import entity.User;


public class UserServiceImpl implements UserService {
	private UserDAO userdao;
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		User user = userdao.login(username, password);
		if(user == null){
			return null;
		}else{
			return user;
		}
	}
	@Override
	public boolean reg(User user) {
		// TODO Auto-generated method stub
		return userdao.reg(user);
	}
	public UserDAO getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userdao.list();
	}
	@Override
	public void del(User user) {
		userdao.del(user);
		
	}
	@Override
	public User load(int userid) {
		// TODO Auto-generated method stub
		return userdao.load(userid);
	}
	@Override
	public String listjson() {
		List<User> list = userdao.list();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public boolean zan(int userid) {
		// TODO Auto-generated method stub
		return userdao.zan(userid);
	}
	@Override
	public boolean checkbyusername(String username) {
		// TODO Auto-generated method stub
		return userdao.checkbyusername(username);
	}
	@Override
	public boolean zan_(int userid) {
		// TODO Auto-generated method stub
		return userdao.zan_(userid);
	}
	@Override
	public boolean checkbyphone(String phone) {
		// TODO Auto-generated method stub
		return userdao.checkbyphone(phone);
	}
	
	@Override
	public boolean chongzhi(User user) {
		// TODO Auto-generated method stub
		return userdao.chongzhi(user);
	}
	@Override
	public boolean tixian(User user) {
		// TODO Auto-generated method stub
		return userdao.ductmoney(user.getMoney(), user.getId());
	}
	@Override
	public List<User> list0() {
		// TODO Auto-generated method stub
		return userdao.list0();
	}
	@Override
	public List<User> list1() {
		// TODO Auto-generated method stub
		return userdao.list1();
	}
	@Override
	public List<User> list2() {
		// TODO Auto-generated method stub
		return userdao.list2();
	}
	@Override
	public String listjson2() {
		List<User> list = userdao.list2();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String listjson2_0() {
		// TODO Auto-generated method stub
		List<User> list = userdao.list2_0();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public boolean update_address(User user) {
		// TODO Auto-generated method stub
		return userdao.update_address(user);
	}
	@Override
	public boolean update_photo(User user) {
		// TODO Auto-generated method stub
		return userdao.update_photo(user);
	}
	@Override
	public boolean update_pwd(User user) {
		// TODO Auto-generated method stub
		return userdao.update_pwd(user);
	}
	
	
	
}
