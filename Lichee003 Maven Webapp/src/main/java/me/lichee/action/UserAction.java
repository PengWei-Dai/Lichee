package me.lichee.action;


import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.server.ServletServerHttpResponse;

import me.lichee.service.impl.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

/*
 *此类用于处理关于user的所有调度操作 
 */

public class UserAction extends ActionSupport{
	//依赖UserServiceImpl的类
	UserServiceImpl userServiceImpl;
	
	//列出了User所有的属性
	private String userMail="";
	private String userName="";
	private String userPassword="";
	private String userNumbel="";
	private String userPartment="";
	private String userSchool="";
	private String userSex="";//性别
	private byte[] userHead=null;//头像
	private String userMajor="";//专业
	private String userPhone="";
	private String userLike="";
	private String userQQ="";
	private String userPower="";
	
	//user登陆
	public String LoginUser(){
		HttpSession session=ServletActionContext.getRequest().getSession();
		if(this.userServiceImpl.isExistUser(userPassword, userMail)){		
			session.setAttribute("check", userMail);
			session.setAttribute("lastTime", new Date());
			return SUCCESS;
		}	
		else {
		session.setAttribute("err", "用户名或者密码错了~");
		return INPUT;
		}
	}
	
	public void RegisterUser(){
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserNumbel() {
		return userNumbel;
	}

	public void setUserNumbel(String userNumbel) {
		this.userNumbel = userNumbel;
	}

	public String getUserPartment() {
		return userPartment;
	}

	public void setUserPartment(String userPartment) {
		this.userPartment = userPartment;
	}

	public String getUserSchool() {
		return userSchool;
	}

	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public byte[] getUserHead() {
		return userHead;
	}

	public void setUserHead(byte[] userHead) {
		this.userHead = userHead;
	}

	public String getUserMajor() {
		return userMajor;
	}

	public void setUserMajor(String userMajor) {
		this.userMajor = userMajor;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserLike() {
		return userLike;
	}

	public void setUserLike(String userLike) {
		this.userLike = userLike;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}

	public String getUserPower() {
		return userPower;
	}

	public void setUserPower(String userPower) {
		this.userPower = userPower;
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
}
