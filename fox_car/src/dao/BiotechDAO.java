package dao;


import java.util.List;

import entity.Biotech;
import entity.Folder;





public interface BiotechDAO {

	public boolean addfolder(Folder folder);
	public boolean delfolder(Folder folder);
	public boolean save(Biotech biotech);
	public boolean del(Biotech biotech);
	public boolean shenhe(Biotech biotech);
	public boolean shenheck(Biotech biotech);
	public boolean update_status2(Biotech biotech);
	public boolean dianzan(Biotech biotech);
	public Biotech load(int id);
	public boolean update(Biotech biotech);
	public List<Biotech> list(String name);
	public List<Biotech> listnews();
	public List<Biotech> listtiezi(String keyword);
	
	public List<Biotech> listbytype(String type);
	
	
	public List<Biotech> listtiezi0(String keyword);
	public List<Biotech> listtiezi1(int get_userid);
	public List<Biotech> listtiezi2(int get_userid);
	public List<Biotech> listproj();
	public List<Biotech> listck();
	public List<Biotech> selectfolderids(int userid);
	
	public List<Biotech> listbyauthor(String author);
	public List<Biotech> listbyauthor0(String author);
	public List<Biotech> listbyauthor1(String author);
	public List<Biotech> listbyauthor2(String author);
	public List<Biotech> listbyauthor3(String author);
	
	public List<Biotech> listtiezi_0();
	public List<Biotech> listtiezi_1();
	public List<Biotech> listtiezi_2();
	public List<Biotech> listtiezi_3();
	
	
	
	
	
	public List<Biotech> listall(String name);
	public List<Biotech> list0(String author);
	public List<Biotech> list1(String author);
	public boolean udpate_jiedan(int id,int get_userid,String longitude,String latitude);
	public boolean udpate_wancheng(int id,int get_userid);
	public boolean udpate_jiesuan(int id,int get_userid);
	
	public List<Biotech> list_shenhe0();
	public List<Biotech> list_shenhe1_daifenpei();
	
	
	
}
