package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * �����ǿ��ڵ�ʵ��
 * @author lenovo
 *
 */
public class UserCheck implements Serializable {
	private int id;
	private User user;
	private Date begin;
	private Date finish;
	private String mac;//���ڻ�����mac��ַ
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
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getFinish() {
		return finish;
	}
	public void setFinish(Date finish) {
		this.finish = finish;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	
}
