package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 用户私有的图片
 * @author lenovo
 *
 */
public class UserImage implements Serializable {
	private int id;
	private User user;
	private Date date;//上传日期
	private String res;//图片地址
	private String name;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
