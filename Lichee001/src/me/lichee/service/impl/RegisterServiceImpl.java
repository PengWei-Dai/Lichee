/**
 * 
 */
package me.lichee.service.impl;

import me.lichee.dao.UserDao;
import me.lichee.entity.User;
import me.lichee.service.RegisterService;

/**
 * @author Rain
 *
 */
public class RegisterServiceImpl implements RegisterService{
	private UserDao userDao;
	
	//����ע��DAO��������setter����
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	
	//ע���û�
	public boolean register(User user) {
		//����DAO����ķ�����ʵ��ҵ���߼�
		int id=userDao.save(user);
		if(id>0){
			return true;
		}	
		else return false;
	}

}
