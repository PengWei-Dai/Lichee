package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 本类是用户的博客实例
 * @author lenovo
 *
 */
public class UserBlog implements Serializable {
	private int id;
	private User user;
	private String title;
	private String content;
	private Date date;
	private int count;//点击量
	private String classify;
	private int good;//博客是否加精
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
