package me.lichee.entity;

import java.io.Serializable;
/**
 * 
 * 用户的权限
 * @author lenovo
 *
 */
public class UserPower implements Serializable {
	private int id;
	private User usert;
	private int user;//创建用户
	private int advice;//管理通知
	private int activity;//管理活动
	private int index;//管理主页
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
