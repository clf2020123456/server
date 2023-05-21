package dao.impl;

import java.util.List;


import dao.AdminDAO;
import dao.UserDAO;
import entity.Admin;
import entity.User;

public class UserDaoImpl extends BaseDAO implements UserDAO {


	@Override
	public User login(String username, String password) {
		StringBuffer sb = new StringBuffer("FROM User WHERE username = '")
		.append(username).append("' and password = '").append(password).append("'");
		
		List<User> lst = findByHQL(sb.toString());
		if(lst.size()>0){
			return lst.get(0);
		}else{
			return null;
		}
	}
	@Override
	public boolean chongzhi(User user) {
		StringBuffer sb = new StringBuffer("update User set money=money+").append(user.getMoney()).append(" WHERE id = ");
		sb.append(user.getId());
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
			
	}

	@Override
	public boolean ductmoney(float money, int userid) {
		StringBuffer sb = new StringBuffer("update User set money=money-").append(money).append(" WHERE id = ");
		sb.append(userid);
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean reg(User user) {
		// TODO Auto-generated method stub
		return this.saveOrUpdate(user);
	}

	@Override
	public List<User> list() {
		StringBuffer sb = new StringBuffer("FROM User");
		
		List<User> lst = findByHQL(sb.toString());
		
		return lst;
	}

	@Override
	public boolean del(User user) {
		// TODO Auto-generated method stub
		return deleteById(User.class, user.getId());
	}

	@Override
	public User load(int id) {
		// TODO Auto-generated method stub
		return get(User.class, id);
	}

	@Override
	public boolean zan(int userid) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update User set zan=zan+1 where id =").append(userid);
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean checkbyusername(String username) {
	StringBuffer sb = new StringBuffer("FROM User where username ='").append(username).append("'");
		
		List<User> lst = findByHQL(sb.toString());
		
		if(lst.size()>0){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public boolean zan_(int userid) {
		StringBuffer sb = new StringBuffer("update User set zan_=zan_+1 where id =").append(userid);
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean checkbyphone(String phone) {
	StringBuffer sb = new StringBuffer("FROM User where phone ='").append(phone).append("'");
		
		List<User> lst = findByHQL(sb.toString());
		
		if(lst.size()>0){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public List<User> list0() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("FROM User");
		
		List<User> lst = findByHQL(sb.toString());
		
		return lst;
	}
	@Override
	public List<User> list1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("FROM User where status=1");
		
		List<User> lst = findByHQL(sb.toString());
		
		return lst;
	}
	@Override
	public List<User> list2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("FROM User where status=2");
		List<User> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public List<User> list2_0() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("FROM User where status=2 and car_status=0");
		List<User> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public boolean update_carstatus_1(int userid) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update User set car_status=1 WHERE id = ");
		sb.append(userid);
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean update_carstatus_0(int userid) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update User set car_status=0 WHERE id = ");
		sb.append(userid);
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean update_address(User user) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update User set address='").append(user.getAddress()).append("' WHERE id = ");
		sb.append(user.getId());
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean update_photo(User user) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update User set image_url='").append(user.getImage_url()).append("' WHERE id = ");
		sb.append(user.getId());
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean update_pwd(User user) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update User set password='").append(user.getPassword()).append("' WHERE phone = '");
		sb.append(user.getId()).append("'");
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
