package service;

import java.util.List;

import entity.Biotech;
import entity.Folder;






public interface BiotechService {
	
	public boolean addfolder(Folder folder);
	public boolean save(Biotech biotech);

	public boolean saveCarType(Biotech biotech);
	public boolean shenhe(Biotech biotech);
	public boolean shenheck(Biotech biotech);
	public void del(Biotech biotech);
	public String list();
	public List<Biotech> listbiotech();
	public List<Biotech> listnews();
	public List<Biotech> listtiezi();
	public List<Biotech> listproj();
	public List<Biotech> listck();
	public boolean delfolder(Folder folder);
	public boolean update_status2(Biotech biotech);
	
	public String detail(int id);
	public Biotech load(int id);
	public List<Biotech> search(String name);
	public String loadAllJson();
	public String loadbyfolder(int userid);
	
	
	public String loadbyauthor(String author);
	public String loadbyauthor0(String author);
	public String loadbyauthor1(String author);
	public String loadbyauthor2(String author);
	public String loadbyauthor3(String author);
	
	
	
	public List<Biotech> listtiezi_0();
	public List<Biotech> listtiezi_1();
	public List<Biotech> listtiezi_2();
	public List<Biotech> listtiezi_3();
	
	
	
	
	
	public String listbytype(String type);
	public String loadAllJson0(String keyword);
	public String loadAllJson0_0(String keyword);
	public String loadAllJson0_1(int get_userid);
	public String loadAllJson0_2(int get_userid);
	public String loadAllJson1();
	public String loadAllJson2();
	public String loadAllJson3();
	
	public String list_shenhe0();
	public String list_shenhe1_daifenpei();
	
	
	public String detailjson(String id);;
	public boolean udpate_jiedan(int id, int get_userid, String longitude,
			String latitude);
	public boolean udpate_wancheng(int id, int get_userid);
	public boolean udpate_jiesuan(int id, int get_userid);
	
	public boolean dianzan(Biotech biotech);
	public boolean dianzan_(Biotech biotech);
	

}
