package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * ���ŵĻʵ��
 * @author lenovo
 *
 */
public class TeamActivity implements Serializable {
	private int id; //�id
	private Team team;//������ĸ�����
	private User user;//���Ǹ��û�����֪ͨ
	private String title;//��ı���
	private String content;//��ľ�������
	private Date date;//��ķ���ʱ��
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
