/**
 * 
 */
package me.lichee.service.impl;

import java.util.List;



import me.lichee.dao.UserDao;
import me.lichee.entity.User;

import me.lichee.service.UserService;

/**
 * @author Rain
 *
 */
public class UserServiceImpl implements UserService{

	private UserDao userDaoImpl;
	
	
	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByMail(String userMail){
		List<User> users=userDaoImpl.findUserByHql("From User u where u.mail=?",userMail);	
		if(users.size()>0){
			return users.get(0);
		}
		else return null;
	}



	public List<User> findUserByHql(String hql, Object obj) {
		List<User> users=userDaoImpl.findUserByHql(hql, obj);
		return users;
	}

	
	
}
