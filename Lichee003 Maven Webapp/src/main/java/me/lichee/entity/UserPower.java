package me.lichee.entity;

import java.io.Serializable;
/**
 * 
 * �������û�Ȩ�޵�ʵ��
 * @author lenovo
 *
 */
public class UserPower implements Serializable {
	private int id;
	private User usert;
	private int user;//���û���ע���ɾ��Ȩ��
	private int advice;//�û�����֪ͨ��Ȩ��
	private int activity;//�û����ļ�������Ȩ��
	private int index;//�û���ǰ̨������Ȩ��
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
