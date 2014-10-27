package me.lichee.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 部门实体类
 * @author lenovo
 *
 */
public class Team implements Serializable {
	private int id; //部门的id
	private String name;//部门的名字
	private String info;//部门的简介
	private Date date;//部门创建的时间
	private int usercount;//部门的人数
	private String classify;//部门的分类
	private Set<User> users = new HashSet<User>();
	
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public int getUsercount() {
		return usercount;
	}
	public void setUsercount(int usercount) {
		this.usercount = usercount;
	}
	
	
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
}
