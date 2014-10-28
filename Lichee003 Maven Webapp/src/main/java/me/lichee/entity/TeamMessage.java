package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 社团通知
 * @author lenovo
 *
 */
public class TeamMessage implements Serializable {
	private int id;
	private Team team;
	private String ip;//发出通知的用户id
	private Date date;//发出时间
	private String content;//通知类容
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
