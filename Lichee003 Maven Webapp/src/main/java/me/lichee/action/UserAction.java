package me.lichee.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import me.lichee.entity.User;


import me.lichee.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * Struts2基于注解的Action配置
 *  ParentPackage 继承父包
 *  Namespace命名空间
 *  Results跳转页面
 *  Action访问方法
 */   

@Controller("userAction")
public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7562095463668924329L;
	private String name;
	private String password;	
	private User user;
	@Resource
	private UserService usi;
	
	
	
	
	@Override
	public String execute() throws Exception {
		
		user=new User();	
		user.setName(name);
		user.setPassword(password);	
		usi.addUser(user);
		return SUCCESS;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUsi() {
		return usi;
	}
	public void setUsi(UserService usi) {
		this.usi = usi;
	}
	
	

	
	
	
}
