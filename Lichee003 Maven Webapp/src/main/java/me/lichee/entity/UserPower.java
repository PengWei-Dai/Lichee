package me.lichee.entity;

import java.io.Serializable;
/**
 * 
 * 本类是用户权限的实体
 * @author lenovo
 *
 */
public class UserPower implements Serializable {
	private int id;
	private User usert;
	private int user;//对用户的注册和删除权限
	private int advice;//用户发表通知的权限
	private int activity;//用户对文件操作的权限
	private int index;//用户对前台操作的权限
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUsert() {
		return usert;
	}
	public void setUsert(User usert) {
		this.usert = usert;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getAdvice() {
		return advice;
	}
	public void setAdvice(int advice) {
		this.advice = advice;
	}
	public int getActivity() {
		return activity;
	}
	public void setActivity(int activity) {
		this.activity = activity;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
