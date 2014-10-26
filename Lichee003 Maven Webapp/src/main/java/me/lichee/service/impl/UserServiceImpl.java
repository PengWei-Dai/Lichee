package me.lichee.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.lichee.dao.UserDao;
import me.lichee.entity.User;
import me.lichee.service.UserService;


public class UserServiceImpl implements UserService{

	private UserDao userDaoImpl;
	


	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public UserDao getUserDao() {
		return userDaoImpl;
	}

	public void setUserDao(UserDao userDao) {
		this.userDaoImpl = userDao;
	}

	public void addUser(User u) {
		this.userDaoImpl.addUser(u);
		
	}

	public void updateUser(User u) {
		this.userDaoImpl.addUser(u);
		
	}

	public void deleteUser(int id) {
		this.userDaoImpl.deleltUser(id);
		
	}

	public void findUser(int id) {
		this.userDaoImpl.findUser(id);
		
	}

	public User getUserByUserId(int id) {
		User u=userDaoImpl.getUserByUserId(id);
		return u;
	}
	
	
}
