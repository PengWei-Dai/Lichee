package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * �����ǻظ����Ե�ʵ����
 * 
 * @author lenovo
 *
 */
public class TeamReply implements Serializable {
	private int id;
	private User user;
	private Team team;
	private String content;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
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
