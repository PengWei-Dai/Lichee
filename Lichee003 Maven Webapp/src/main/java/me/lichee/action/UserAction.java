package me.lichee.action;

import me.lichee.entity.User;
import me.lichee.service.UserService;


import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")

public class UserAction extends ActionSupport{
	
	private String name;
	private String password;
	private User user;
	

	private UserService userServiceImpl;
	
	



	public UserService getUserServiceImpl() {
		return userServiceImpl;
	}



	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}



	public String addUser(){
		user=new User();
		user.setName(name);
		user.setPassword(password);
		userServiceImpl.addUser(user);
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




	
}
