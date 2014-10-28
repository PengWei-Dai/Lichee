package me.lichee.entity;

import java.io.Serializable;
/**
 * 
 * 用户
 * @author lenovo
 *
 */
public class User implements Serializable {
	private int id;//主键
	private String name;//名字
	private String number;//学号
	private String password;//密码
	private String school;
	private String partment;//学院
	private int sex;//性别
	private String mail;
	private byte[] head;//头像
	//private Team team;//所属社团
	private String major;//专业
	private String phone;
	private String like;
	private String qq;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getPartment() {
		return partment;
	}
	public void setPartment(String partment) {
		this.partment = partment;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public byte[] getHead() {
		return head;
	}
	public void setHead(byte[] head) {
		this.head = head;
	}
//	public Team getTeam() {
//		return team;
//	}
//	public void setTeam(Team team) {
//		this.team = team;
//	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	
	
}
