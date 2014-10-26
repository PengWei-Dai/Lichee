package me.lichee.dao;

import me.lichee.entity.User;

public interface UserDao {
	
	public void addUser(User u);
	
	public void updateUser(User u);
	
	public void deleltUser(int id);
	
	public void findUser(int id);
	
	public User getUserByUserId(int userId);
	
}
