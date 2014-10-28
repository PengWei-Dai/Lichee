/**
 * 
 */
package me.lichee.service;

import java.util.List;

import me.lichee.entity.User;

/**
 * @author Rain
 *
 */
public interface UserService {
	
	/*
	 * 添加User
	 */
	public void addUser(User user);
	
	/*
	 * 查找User
	 */
	public User findUser(User user);
	
	public List<User> findUserByHql(String hql , Object obj);
	
	
}
