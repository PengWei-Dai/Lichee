package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 社团的活动实体
 * @author lenovo
 *
 */
public class TeamActivity implements Serializable {
	private int id; //活动id
	private Team team;//活动属于哪个社团
	private User user;//是那个用户发的通知
	private String title;//活动的标题
	private String content;//活动的具体内容
	private Date date;//活动的发布时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
