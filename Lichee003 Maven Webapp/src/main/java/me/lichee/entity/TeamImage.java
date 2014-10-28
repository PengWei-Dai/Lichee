package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 团队图片
 * @author lenovo
 *
 */
public class TeamImage implements Serializable {
	private int id;
	private Team team;
	private String res;//图片的路径地址
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
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
