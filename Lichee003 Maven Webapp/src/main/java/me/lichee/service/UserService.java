package me.lichee.service;

import me.lichee.entity.User;

public interface UserService {
	
	public void addUser(User u);
	
	public void updateUser(User u);
	
	public void deleteUser(int id);
	
	public void findUser(int id);
	
	public User getUserByUserId(int id);
	
	
}
