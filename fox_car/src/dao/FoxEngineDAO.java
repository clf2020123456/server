package dao;


import java.util.List;

import entity.Biotech;
import entity.Comments;
import entity.Cunche;
import entity.Folder;
import entity.Zuche;





public interface FoxEngineDAO {

	public boolean save1(Cunche cunche);
	public boolean del1(Cunche cunche);
	public boolean update_status(Cunche cunche);
	public boolean update_zuche_money(Cunche cunche);
	public List<Cunche> list1();
	public List<Cunche> listbyuser1(int user);
	public Cunche load1(int id);
	//
	public boolean save2(Zuche zuche);
	public boolean del2(Zuche zuche);
	public boolean del2byCarno(String carno);
	public boolean update_status2(Zuche zuche);
	public List<Zuche> list2();
	public List<Zuche> listbyuser2(int user);
	public Zuche load2(int id);
	
}
