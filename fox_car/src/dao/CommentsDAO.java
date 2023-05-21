package dao;


import java.util.List;

import entity.Comments;
import entity.Message;



public interface CommentsDAO {

	public boolean save(Comments comments);
	public boolean del(Comments comments);
	public List<Comments> list();
	public List<Comments> listbyluxian(int luxian_id);
//----------------------------------------------------------
	public boolean save(Message message);
	public List<Message> listbyuserid(int touserid);
	public List<Message> listmsg();
	public boolean del(Message message);
}
