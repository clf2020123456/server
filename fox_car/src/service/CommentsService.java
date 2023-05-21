package service;

import java.util.List;

import entity.Comments;
import entity.Message;




public interface CommentsService {
	
	public boolean save(Comments comments);
	public boolean del(Comments comments);
	public List<Comments> list();

	public String listbyluxian(int luxianid);
	//----------------------------------------
	//----------------------------------------------------------
	public boolean save(Message message);
	public String listbyuserid(int touserid);
	public List<Message> listmsg();
	public boolean del(Message message);
	

}
