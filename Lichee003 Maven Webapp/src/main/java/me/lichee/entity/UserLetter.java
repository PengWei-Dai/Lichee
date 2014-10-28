package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 用户间的私信
 * @author lenovo
 *
 */
public class UserLetter implements Serializable {
	private int id;
	private User user1;//发送用户
	private User user2;//接收用户
	private String content;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	public User getUser2() {
		return user2;
	}
	public void setUser2(User user2) {
		this.user2 = user2;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
