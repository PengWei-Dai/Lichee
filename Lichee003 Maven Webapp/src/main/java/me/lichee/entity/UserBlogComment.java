package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 博客的评论
 * @author lenovo
 *
 */
public class UserBlogComment implements Serializable {
	private int id;
	private User user;
	private UserBlog blog;
	private String content;
	private Date date;
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
	public UserBlog getBlog() {
		return blog;
	}
	public void setBlog(UserBlog blog) {
		this.blog = blog;
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
