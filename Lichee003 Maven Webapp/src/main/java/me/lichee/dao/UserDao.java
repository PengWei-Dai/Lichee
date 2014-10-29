package me.lichee.dao;

import java.util.List;

import me.lichee.entity.User;

public interface UserDao extends BaseDao<User>{
	
	/**
	 * 查找
	 */
	public User findUserById(int id);
	
	public List<User> findUserAll();
	
	public List<User> findUserByHql(String hql ,Object obj);
	
	/*
	 * 增加
	 */
	

	
	/**
	 * 删除
	 */
	

	
	public void deleltUserById(int id);
	
	public void deleltUserAll();
	
	//public void deleltUsers(List<User> users);
	
	public void deleltUserByHql(String hql ,Object obj);
	
	/*
	 * 更新
	 */

	
	//public void updateUserByHql(String hql);

	
}
