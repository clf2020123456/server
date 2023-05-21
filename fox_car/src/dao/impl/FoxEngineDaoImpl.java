package dao.impl;

import java.util.List;


import dao.CommentsDAO;
import dao.FoxEngineDAO;
import entity.*;

public class FoxEngineDaoImpl extends BaseDAO implements FoxEngineDAO {

	@Override
	public boolean save1(Cunche cunche) {
		// TODO Auto-generated method stub
		return saveOrUpdate(cunche);
	}

	@Override
	public boolean del1(Cunche cunche) {
		// TODO Auto-generated method stub
		return deleteById(Cunche.class, cunche.getId());
	}

	@Override
	public List<Cunche> list1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Cunche ");

		List<Cunche> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Cunche> listbyuser1(int user) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Cunche where userid =").append(user);

		List<Cunche> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean save2(Zuche zuche) {
		String hql2 = "FROM Cunche where car_no='"+zuche.getCar_no()+"'";
		List<Cunche> cunches = findByHQL(hql2);
		for (Cunche cunch : cunches) {
			if(cunch!=null){
				zuche.setCar_pinpai(cunch.getCar_pinpai());
			}
		}
		// TODO Auto-generated method stub
		return saveOrUpdate(zuche);
	}

	@Override
	public boolean del2(Zuche zuche) {
		// TODO Auto-generated method stub
		return deleteById(Zuche.class, zuche.getId());
	}

	@Override
	public List<Zuche> list2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Zuche ");

		List<Zuche> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Zuche> listbyuser2(int user) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Zuche where userid =").append(user);

		List<Zuche> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public Cunche load1(int id) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("FROM Cunche WHERE id = ")
		.append(id);
		List<Cunche> lst = findByHQL(sb.toString());
		if (lst.size() > 0) {
			return lst.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Zuche load2(int id) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("FROM Zuche WHERE id = ")
		.append(id);
		List<Zuche> lst = findByHQL(sb.toString());
		if (lst.size() > 0) {
			return lst.get(0);
		} else {
			return null;
		}
	}

	@Override
	public boolean update_status(Cunche cunche) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update Cunche set status=").append(cunche.getStatus()).append(" WHERE car_no = '")
		.append(cunche.getCar_no()).append("'");
		
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean update_status2(Zuche zuche) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update Zuche set status=").append(zuche.getStatus()).append(" WHERE id = ")
		.append(zuche.getId()).append("");
		
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean update_zuche_money(Cunche cunche) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("update Cunche set money2=money2+").append(cunche.getMoney2()).append(" WHERE car_no = '")
		.append(cunche.getCar_no()).append("'");
		
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean del2byCarno(String carno) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("delete from Zuche   WHERE car_no = '")
		.append(carno).append("' and status<2");
		
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}


}
