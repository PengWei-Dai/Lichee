package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * �������û��Ĳ���ʵ��
 * @author lenovo
 *
 */
public class UserBlog implements Serializable {
	private int id;
	private User user;
	private String title;
	private String content;
	private Date date;
	private int count;//�����
	private String classify;
	private int good;//�����Ƿ�Ӿ�
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	
	
}
