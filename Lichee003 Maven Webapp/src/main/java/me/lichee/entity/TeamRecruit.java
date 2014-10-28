package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 社团招新信息
 * @author lenovo
 *
 */
public class TeamRecruit implements Serializable {
	private int id;
	private Team team;
	private String content;
	private String title;
	private Date date;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
