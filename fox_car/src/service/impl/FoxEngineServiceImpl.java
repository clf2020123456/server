package service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.interceptor.annotations.After;

import service.CommentsService;
import service.FoxEngineService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


import dao.CommentsDAO;
import dao.FoxEngineDAO;
import dao.UserDAO;
import entity.Biotech;
import entity.Comments;
import entity.Cunche;
import entity.Message;
import entity.User;
import entity.Zuche;

public class FoxEngineServiceImpl implements FoxEngineService {
	private FoxEngineDAO foxdao;
	private UserDAO userdao;
	@Override
	public boolean save1(Cunche cunche) {
		// TODO Auto-generated method stub
		return foxdao.save1(cunche);
	}
	@Override
	public boolean del1(Cunche cunche) {
		// TODO Auto-generated method stub
		foxdao.del2byCarno(cunche.getCar_no());
		return foxdao.del1(cunche);
	}
	@Override
	public String list1() {
		// TODO Auto-generated method stub
		List<Cunche> list=foxdao.list1();
		List<Cunche> list2=new ArrayList<Cunche>();
		for(Cunche c:list){
			c.setCunche_start_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getCunche_start_date()));
			c.setCunche_end_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getCunche_end_date()));
			Date now= new Date();
			if(c.getCunche_start_date().after(now)){
				c.setStatus(0);
			}
			if(c.getCunche_start_date().before(now)&&c.getCunche_end_date().after(now)&&c.getStatus() !=2&&c.getStatus() !=2&&c.getStatus() !=3){
				c.setStatus(1);
			}
			if(now.after(c.getCunche_end_date())){
				c.setStatus(3);
			}
			list2.add(c);
		}
		
		if(list2.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list2);
			return jsonarr.toString();
		}else{
			return null;
		}
		
		
	}
	@Override
	public String listbyuser1(int user) {
		// TODO Auto-generated method stub
		List<Cunche> list=foxdao.listbyuser1(user);
		List<Cunche> list2=new ArrayList<Cunche>();
		for(Cunche c:list){
			c.setCunche_start_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getCunche_start_date()));
			c.setCunche_end_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getCunche_end_date()));
			
		Date now= new Date();
			
			if(c.getCunche_start_date().after(now)){
				c.setStatus(0);
			}
			if(c.getCunche_start_date().before(now)&&c.getCunche_end_date().after(now)&&c.getStatus() !=2&&c.getStatus() !=2&&c.getStatus() !=3){
				c.setStatus(1);
			}
			if(now.after(c.getCunche_end_date())){
				c.setStatus(3);
			}
			list2.add(c);
		}
		
		if(list2.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list2);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public boolean save2(Zuche zuche) {
		// TODO Auto-generated method stub
		Cunche cunche =new Cunche();
		cunche.setCar_no(zuche.getCar_no());
		cunche.setStatus(2);
		foxdao.update_status(cunche);
		return foxdao.save2(zuche);
	}
	@Override
	public boolean del2(Zuche zuche) {
		// TODO Auto-generated method stub
		Cunche cunche =new Cunche();
		cunche.setCar_no(zuche.getCar_no());
		cunche.setStatus(1);
		foxdao.update_status(cunche);
		return foxdao.del2(zuche);
	}
	@Override
	public String list2() {
		// TODO Auto-generated method stub
		List<Zuche> list=foxdao.list2();
		List<Zuche> list2=new ArrayList<Zuche>();
		for(Zuche c:list){
			c.setZuche_start_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getZuche_start_date()));
			c.setZuche_end_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getZuche_end_date()));
			Date now= new Date();
			
			if(c.getZuche_start_date().after(now)){
				c.setStatus(0);
			}
			if(c.getZuche_start_date().before(now)&&c.getZuche_end_date().after(now)&&c.getStatus()!=2){
				c.setStatus(1);
			}
			if(now.after(c.getZuche_end_date())){
				c.setStatus(2);
			}
			list2.add(c);
		}
		
		if(list2.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list2);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	@Override
	public String listbyuser2(int user) {
		// TODO Auto-generated method stub
		List<Zuche> list=foxdao.listbyuser2(user);
		List<Zuche> list2=new ArrayList<Zuche>();
		for(Zuche c:list){
			c.setZuche_start_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getZuche_start_date()));
			c.setZuche_end_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getZuche_end_date()));
			Date now= new Date();
			
			if(c.getZuche_start_date().after(now)){
				c.setStatus(0);
			}
			if(c.getZuche_start_date().before(now)&&c.getZuche_end_date().after(now)&&c.getStatus()!=2){
				c.setStatus(1);
			}
			if(now.after(c.getZuche_end_date())){
				c.setStatus(2);
			}
			list2.add(c);
		}
		
		if(list2.size()>0){
			JSONArray jsonarr = JSONArray.fromObject(list2);
			return jsonarr.toString();
		}else{
			return null;
		}
	}
	public FoxEngineDAO getFoxdao() {
		return foxdao;
	}
	public void setFoxdao(FoxEngineDAO foxdao) {
		this.foxdao = foxdao;
	}
	public UserDAO getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	@Override
	public List<Cunche> list1_() {
		// TODO Auto-generated method stub
		List<Cunche> list=foxdao.list1();
		List<Cunche> list2=new ArrayList<Cunche>();
		for(Cunche c:list){
			c.setCunche_start_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getCunche_start_date()));
			c.setCunche_end_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getCunche_end_date()));
			Date now= new Date();
			
			if(c.getCunche_start_date().after(now)){
				c.setStatus(0);
			}
			if(c.getCunche_start_date().before(now)&&c.getCunche_end_date().after(now)&&c.getStatus() !=2&&c.getStatus() !=3){
				c.setStatus(1);
			}
			if(now.after(c.getCunche_end_date())){
				c.setStatus(3);
			}
			
			list2.add(c);
		}
		return list2;
	}
	@Override
	public List<Zuche> list2_() {
		// TODO Auto-generated method stub
		List<Zuche> list=foxdao.list2();
		List<Zuche> list2=new ArrayList<Zuche>();
		for(Zuche c:list){
			c.setZuche_start_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getZuche_start_date()));
			c.setZuche_end_date_str(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(c.getZuche_end_date()));
			
			
			Date now= new Date();
			
			if(c.getZuche_start_date().after(now)){
				c.setStatus(0);
			}
			if(c.getZuche_start_date().before(now)&&c.getZuche_end_date().after(now)&&c.getStatus()!=2){
				c.setStatus(1);
			}
			if(now.after(c.getZuche_end_date())){
				c.setStatus(2);
			}
			
			list2.add(c);
		}
		return list2;
	}
	@Override
	public Cunche load1(int id) {
		// TODO Auto-generated method stub
		return foxdao.load1(id);
	}
	@Override
	public Zuche load2(int id) {
		// TODO Auto-generated method stub
		return foxdao.load2(id);
	}
	@Override
	public String load1_(int id) {
		// TODO Auto-generated method stub
		Cunche cunche = this.load1(id);
		if(cunche != null){
			JSONObject obj = JSONObject.fromObject(cunche);
			return obj.toString();
		}else{
			return null;
		}
	}
	@Override
	public String load2_(int id) {
		// TODO Auto-generated method stub
		Zuche zuche = this.load2(id);
		if(zuche != null){
			JSONObject obj = JSONObject.fromObject(zuche);
			return obj.toString();
		}else{
			return null;
		}
	}
	@Override
	public boolean jiesuan2(Zuche zuche) {
		// TODO Auto-generated method stub
		Zuche zuche2=foxdao.load2(zuche.getId());
		zuche2.setStatus(2);
		Cunche cunche =new Cunche();
		cunche.setCar_no(zuche2.getCar_no());
		cunche.setStatus(1);
		
		
		cunche.setMoney2(zuche2.getMoney());
		foxdao.update_status(cunche);
		foxdao.update_zuche_money(cunche);
		foxdao.update_status2(zuche2);
		userdao.ductmoney(zuche2.getMoney(), zuche2.getUserid());
		return true;
	}
	@Override
	public boolean jiesuan1(Cunche cunche) {
		// TODO Auto-generated method stub
		Cunche cunche2=foxdao.load1(cunche.getId());
		float money=cunche.getMoney();
		float money2=cunche2.getMoney2();
		
		float money3=0f;
		if(money2>=money){
			money3=money2-money;
			User user=new User();
			user.setId(cunche2.getUserid());
			user.setMoney(money3);
			userdao.chongzhi(user);
		}else{
			money3=money-money2;
			userdao.ductmoney(money3, cunche2.getUserid());
		}
		
		cunche2.setStatus(3);
		foxdao.update_status(cunche2);
		
		return true;
	}
	
	
	
	
	
	
	
	
	

}
