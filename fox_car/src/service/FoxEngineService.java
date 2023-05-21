package service;

import java.util.List;

import entity.Comments;
import entity.Cunche;
import entity.Message;
import entity.Zuche;




public interface FoxEngineService {
	public boolean save1(Cunche cunche);
	public boolean del1(Cunche cunche);
	public String list1();
	public List<Cunche> list1_();
	public String listbyuser1(int user);
	public Cunche load1(int id);
	public String load1_(int id);
	public boolean jiesuan1(Cunche cunche);
	//
	public boolean save2(Zuche zuche);
	public boolean jiesuan2(Zuche zuche);
	public boolean del2(Zuche zuche);
	public String list2();
	public List<Zuche> list2_();
	public String listbyuser2(int user);
	public Zuche load2(int id);
	public String load2_(int id);
	

}
