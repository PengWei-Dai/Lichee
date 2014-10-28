package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 社团活动实体
 * @author lenovo
 *
 */
public class TeamActivity implements Serializable {
	private int id; //主键
	private Team team;//所属社团
	private User user;//发起社团活动的用户֪
	private String title;//活动的标题
	private String content;//活动类容
	private Date date;//活动发起日期
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
