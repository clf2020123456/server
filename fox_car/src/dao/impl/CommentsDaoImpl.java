package dao.impl;

import java.util.List;


import dao.CommentsDAO;
import entity.Comments;
import entity.Message;

public class CommentsDaoImpl extends BaseDAO implements CommentsDAO {

	@Override
	public boolean save(Comments comments) {
		return saveOrUpdate(comments);
	}

	@Override
	public boolean del(Comments comments) {
		// TODO Auto-generated method stub
		return deleteById(Comments.class, comments.getId());
	}

	@Override
	public List<Comments> list() {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Comments ");

		List<Comments> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Comments> listbyluxian(int luxian_id) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Comments where luxianid =").append(luxian_id);

		List<Comments> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean save(Message message) {
		// TODO Auto-generated method stub
		return saveOrUpdate(message);
	}

	@Override
	public List<Message> listbyuserid(int touserid) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Message where userid =").append(touserid).append(" order by commitdate desc");

		List<Message> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Message> listmsg() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Message  order by commitdate desc");

		List<Message> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public boolean del(Message message) {
		// TODO Auto-generated method stub
		return deleteById(Message.class, message.getId());
	}

}
