package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * ������������
 * @author lenovo
 *
 */
public class TeamMessage implements Serializable {
	private int id;
	private Team team;
	private String ip;//�����û���ip
	private Date date;//���Ե�ʱ��
	private String content;//���Ե�����
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
