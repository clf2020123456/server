package dao.impl;

import java.util.List;

import dao.BiotechDAO;
import entity.Biotech;
import entity.Folder;

public class BiotechDaoimpl extends BaseDAO implements BiotechDAO {

	@Override
	public boolean save(Biotech biotech) {
		// TODO Auto-generated method stub
		return saveOrUpdate(biotech);
	}

	@Override
	public boolean del(Biotech biotech) {
		this.delete(biotech);
		return true;
	}

	@Override
	public Biotech load(int id) {
		StringBuffer sb = new StringBuffer("FROM Biotech WHERE id = ")
				.append(id);

		List<Biotech> lst = findByHQL(sb.toString());
		if (lst.size() > 0) {
			return lst.get(0);
		} else {
			return null;
		}
	}

	@Override
	public boolean update(Biotech biotech) {
		// TODO Auto-generated method stub
		return saveOrUpdate(biotech);
	}

	@Override
	public List<Biotech> list(String name) {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE status = 1");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> list0(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech where  type = '").append("")
				.append("' and author ='").append(author).append("'");
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> list1(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech where  type = '").append("")
				.append("' and author ='").append(author).append("'");
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean shenhe(Biotech biotech) {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set status = 1  where id = ")
				.append(biotech.getId());

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Biotech> listall(String name) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech ");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean dianzan(Biotech biotech) {
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set zan =zan + 1  where id = ")
				.append(biotech.getId());

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
//
	@Override
	public List<Biotech> listbyauthor(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and  author = '")
				.append(author).append("'");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public List<Biotech> listbyauthor0(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='物业缴费' and  author = '")
		.append(author).append("' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public List<Biotech> listbyauthor1(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='快递代拿' and  author = '")
		.append(author).append("' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public List<Biotech> listbyauthor2(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='商品购买' and  author = '")
		.append(author).append("' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public List<Biotech> listbyauthor3(String author) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='故障报修' and  author = '")
		.append(author).append("' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean addfolder(Folder folder) {
		// TODO Auto-generated method stub
		return saveOrUpdate(folder);
	}

	@Override
	public List<Biotech> selectfolderids(int userid) {
		StringBuffer sb;
		sb = new StringBuffer(
				"FROM Biotech WHERE id in (select distinct(duanziid) FROM Folder WHERE userid = ")
				.append(userid).append(")");

		List<Biotech> lst = findByHQL(sb.toString());

		return lst;
	}

	@Override
	public List<Biotech> listnews() {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type = '").append(1).append(
				"'");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> listtiezi(String keyword) {
		StringBuffer sb;
		if (keyword != null) {
			sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
					.append("' and title like '%").append(keyword).append("%'");
		} else {
			sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
					.append("'");
		}

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> listproj() {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type = '").append(2).append(
				"'");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> listck() {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type = '").append(3).append(
				"'");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean shenheck(Biotech biotech) {
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set ck_status = 1  where id = ")
				.append(biotech.getId());

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Biotech> listtiezi0(String keyword) {
		StringBuffer sb;
		if (keyword != null) {
			sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
					.append("' and title like '%").append(keyword)
					.append("%' and status =0  order by status2 desc");
		} else {
			sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
					.append("' and status =0   order by status2 desc");
		}

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean udpate_jiedan(int id, int get_userid, String longitude,
			String latitude) {
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set status = 1 ,get_userid=")
				.append(get_userid).append(",longitude='").append(longitude)
				.append("',latitude='").append(latitude)
				.append("' where id = ").append(id);

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Biotech> listtiezi1(int get_userid) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
				.append("' and get_userid=").append(get_userid);

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean udpate_wancheng(int id, int get_userid) {
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set status = 2 where id = ").append(id);

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Biotech> listtiezi2(int get_userid) {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
				.append("' and status =4 and (get_userid=").append(get_userid)
				.append(" or add_userid=").append(get_userid).append(")");

		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}
	@Override
	public boolean delfolder(Folder folder) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer("delete from Folder where duanziid=").append(folder.getDuanziid()).append(" and userid=").append(folder.getUserid());
		try {
			this.executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
//
	@Override
	public List<Biotech> listbytype(String type) {
		StringBuffer sb;
			sb = new StringBuffer("FROM Biotech WHERE type = '").append(0)
					.append("' and status<=2 and status2=1 and type2='").append(type).append("' order by status");

		List<Biotech> lst = findByHQL(sb.toString());
		
		return lst;
	}

	@Override
	public boolean udpate_jiesuan(int id, int get_userid) {
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set status = 4 where id = ").append(id);

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean update_status2(Biotech biotech) {
		StringBuffer sb;
		sb = new StringBuffer("update Biotech set status2 = ").append(biotech.getStatus2()).append(" where id = ").append(biotech.getId());

		try {
			executeHql(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Biotech> list_shenhe0() {
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE status2=0 and type='0'");

	List<Biotech> lst = findByHQL(sb.toString());
	
	return lst;
	}

	@Override
	public List<Biotech> list_shenhe1_daifenpei() {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE status2=1 and get_userid=0");

		List<Biotech> lst = findByHQL(sb.toString());
		
		return lst;
	}

	@Override
	public List<Biotech> listtiezi_0() {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='物业缴费' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> listtiezi_1() {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='快递代拿' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> listtiezi_2() {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='商品购买' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Biotech> listtiezi_3() {
		// TODO Auto-generated method stub
		StringBuffer sb;
		sb = new StringBuffer("FROM Biotech WHERE type='0' and type2='故障报修' order by id desc");
		
		List<Biotech> lst = findByHQL(sb.toString());
		return lst;
	}

}
