package me.lichee.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.lichee.dao.UserDao;
import me.lichee.entity.User;
import me.lichee.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	


	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User u) {
		this.userDao.addUser(u);
		
	}

	public void updateUser(User u) {
		this.userDao.addUser(u);
		
	}

	public void deleteUser(int id) {
		this.userDao.deleltUser(id);
		
	}

	public void findUser(int id) {
		this.userDao.findUser(id);
		
	}

	public User getUserByUserId(int id) {
		User u=userDao.getUserByUserId(id);
		return u;
	}
	
	
}
