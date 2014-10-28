package me.lichee.entity;

import java.io.Serializable;
/**
 * 
 * 社团的积分
 * @author lenovo
 *
 */
public class TeamPoints implements Serializable {
	private int id;
	private Team team;
	private int number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
