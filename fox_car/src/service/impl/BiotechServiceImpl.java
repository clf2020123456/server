package service.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import service.BiotechService;


import dao.BiotechDAO;
import dao.UserDAO;
import entity.Biotech;
import entity.Folder;
import entity.User;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



public class BiotechServiceImpl implements BiotechService {
	private BiotechDAO biotechdao;
	private UserDAO userdao;

	@Override
	public String detail(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Biotech biotech) {
		// TODO Auto-generated method stub
		biotech.setPubdate(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
		return biotechdao.save(biotech);
	}

	@Override
	public boolean saveCarType(Biotech biotech) {

		return false;
	}


	@Override
	public List<Biotech> search(String name) {
		// TODO Auto-generated method stub
		return biotechdao.list(name);
	}

	@Override
	public Biotech load(int goodsId) {
		// TODO Auto-generated method stub
		return biotechdao.load(goodsId);
	}

	@Override
	public void del(Biotech jingdian) {
		// TODO Auto-generated method stub
		biotechdao.del(jingdian);
	}

	@Override
	public String loadAllJson() {
		List<Biotech> list = biotechdao.list(null);
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public String detailjson(String id) {
		// TODO Auto-generated method stub
		Integer goodid= Integer.parseInt(id);
		Biotech good = this.load(goodid);
		if(good != null){
			JSONObject obj = JSONObject.fromObject(good);
			return obj.toString();
		}else{
			return null;
		}
		
	}




	@Override
	public List<Biotech> listbiotech() {
		// TODO Auto-generated method stub
		return biotechdao.listall(null);
	}

	public BiotechDAO getBiotechdao() {
		return biotechdao;
	}

	public void setBiotechdao(BiotechDAO biotechdao) {
		this.biotechdao = biotechdao;
	}




	@Override
	public boolean shenhe(Biotech biotech) {
		// TODO Auto-generated method stub
		return biotechdao.shenhe(biotech);
	}

	@Override
	public boolean dianzan(Biotech biotech) {
		// TODO Auto-generated method stub
		biotech = biotechdao.load(biotech.getId());
		int get_id=biotech.getGet_userid();
		if(get_id >0){
				userdao.zan(get_id);
		}
		return biotechdao.dianzan(biotech);
	}

	@Override
	public String loadbyauthor(String author) {
		List<Biotech> list = biotechdao.listbyauthor(author);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48){
				list2.add(b);
			}else{
				b.setStatus(4);
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String loadbyauthor0(String author) {
		List<Biotech> list = biotechdao.listbyauthor0(author);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48){
				list2.add(b);
			}else{
				b.setStatus(4);
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String loadbyauthor1(String author) {
		List<Biotech> list = biotechdao.listbyauthor1(author);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48){
				list2.add(b);
			}else{
				b.setStatus(4);
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String loadbyauthor2(String author) {
		List<Biotech> list = biotechdao.listbyauthor2(author);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48){
				list2.add(b);
			}else{
				b.setStatus(4);
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String loadbyauthor3(String author) {
		List<Biotech> list = biotechdao.listbyauthor3(author);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48){
				list2.add(b);
			}else{
				b.setStatus(4);
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public boolean addfolder(Folder folder) {
		// TODO Auto-generated method stub
		return biotechdao.addfolder(folder);
	}

	@Override
	public String loadbyfolder(int userid) {
		List<Biotech> list = biotechdao.selectfolderids(userid);
		List<Biotech> list2=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48 || b.getStatus()==2||b.getStatus()==3){
				list2.add(b);
			}else{
				b.setStatus(4);
				list2.add(b);
			}
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list2);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public String loadAllJson0(String keyword) {
		List<Biotech> list = biotechdao.listtiezi(keyword);
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public String loadAllJson1() {
		List<Biotech> list = biotechdao.listnews();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String loadAllJson2() {
		List<Biotech> list = biotechdao.listproj();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String loadAllJson3() {
		List<Biotech> list = biotechdao.listck();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public List<Biotech> listnews() {
		List<Biotech> list = biotechdao.listnews();
		return list;
	}

	@Override
	public List<Biotech> listtiezi() {
		List<Biotech> list = biotechdao.listtiezi(null);
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		return list3;
	}
	@Override
	public List<Biotech> listproj() {
		List<Biotech> list = biotechdao.listproj();
		return list;
	}

	@Override
	public List<Biotech> listck() {
		List<Biotech> list = biotechdao.listck();
		return list;
	}

	@Override
	public boolean shenheck(Biotech biotech) {
		// TODO Auto-generated method stub
		return biotechdao.shenheck(biotech);
	}

	@Override
	public String loadAllJson0_0(String keyword) {
		List<Biotech> list = biotechdao.listtiezi0(keyword);
		List<Biotech> list2=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48 || b.getStatus()==2||b.getStatus()==3){
				list2.add(b);
			}
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list2);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	
	public int gethours(String from,String to){
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//如2016-08-10 20:40  
		long from_ = 0;
		long to_ = 0;
		try {
			from_ = simpleFormat.parse(from).getTime();
			 to_ = simpleFormat.parse(to).getTime();  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		int hours = (int) ((to_ - from_)/(1000 * 60 * 60)); 
		return hours;
		
	}

	@Override
	public boolean udpate_jiedan(int id, int get_userid, String longitude,
			String latitude) {
		// TODO Auto-generated method stub
		userdao.update_carstatus_1(get_userid);
		return biotechdao.udpate_jiedan(id, get_userid,longitude,latitude);
	}

	@Override
	public String loadAllJson0_1(int get_userid) {
		List<Biotech> list = biotechdao.listtiezi1(get_userid);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48 || b.getStatus()==2||b.getStatus()==3){
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public boolean udpate_wancheng(int id, int get_userid) {
		// TODO Auto-generated method stub
		return biotechdao.udpate_wancheng(id, get_userid);
	}

	@Override
	public String loadAllJson0_2(int get_userid) {
		List<Biotech> list = biotechdao.listtiezi2(get_userid);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48 || b.getStatus()==2||b.getStatus()==3){
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		
		userdao.update_carstatus_0(get_userid);
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	public UserDAO getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	@Override
	public boolean delfolder(Folder folder) {
		// TODO Auto-generated method stub
		return biotechdao.delfolder(folder);
	}

	@Override
	public boolean dianzan_(Biotech biotech) {
		biotech = biotechdao.load(biotech.getId());
		int get_id=biotech.getGet_userid();
		if(get_id >0){
				userdao.zan_(get_id);
		}
		return biotechdao.dianzan(biotech);
	}

	@Override
	public String listbytype(String type) {
		List<Biotech> list = biotechdao.listbytype(type);
		List<Biotech> list2=new ArrayList<Biotech>();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int hours =gethours(b.getPubdate(), new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
			if(hours <48 || b.getStatus()==2||b.getStatus()==3){
				list2.add(b);
			}
		}
		for(Biotech b:list2){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list3);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public boolean udpate_jiesuan(int id, int get_userid) {
		// TODO Auto-generated method stub
		Biotech biotech = biotechdao.load(id);
		int add_user =biotech.getAdd_userid();
		int get_user =biotech.getGet_userid();
		User user_add=new User();
		user_add.setId(add_user);
		User user_get=new User();
		user_get.setId(get_user);
		
		userdao.update_carstatus_0(get_user);
	
//		float money=Float.parseFloat(biotech.getPrice());
//		user_get.setMoney(money);
//		userdao.chongzhi(user_get);
//		
//		
//		userdao.ductmoney(money, add_user);
		return biotechdao.udpate_jiesuan(id, get_userid);
	}

	@Override
	public boolean update_status2(Biotech biotech) {
		// TODO Auto-generated method stub
		return biotechdao.update_status2(biotech);
	}

	@Override
	public String list_shenhe0() {
		// TODO Auto-generated method stub
		List<Biotech> list = biotechdao.list_shenhe0();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public String list_shenhe1_daifenpei() {
		// TODO Auto-generated method stub
		List<Biotech> list = biotechdao.list_shenhe1_daifenpei();
		if(list.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return null;
		}
	}

	@Override
	public List<Biotech> listtiezi_0() {
		// TODO Auto-generated method stub
		List<Biotech> list = biotechdao.listtiezi_0();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		return list3;
	}

	@Override
	public List<Biotech> listtiezi_1() {
		// TODO Auto-generated method stub
		List<Biotech> list = biotechdao.listtiezi_1();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		return list3;
	}

	@Override
	public List<Biotech> listtiezi_2() {
		// TODO Auto-generated method stub
		List<Biotech> list = biotechdao.listtiezi_2();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		return list3;
	}

	@Override
	public List<Biotech> listtiezi_3() {
		// TODO Auto-generated method stub
		List<Biotech> list = biotechdao.listtiezi_3();
		List<Biotech> list3=new ArrayList<Biotech>();
		for(Biotech b:list){
			int getuserid=b.getGet_userid();
			if(getuserid>0){
				User user =userdao.load(getuserid);
				if(user !=null){
					b.setGet_username(user.getName());
					b.setPrice(user.getAddress());
				}
			}
			list3.add(b);
		}
		return list3;
	}

}
