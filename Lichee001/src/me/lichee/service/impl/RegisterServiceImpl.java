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
	
	//依赖注入DAO组件所需的setter方法
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	
	//注册用户
	public boolean register(User user) {
		//调用DAO组件的方法来实现业务逻辑
		int id=userDao.save(user);
		if(id>0){
			return true;
		}	
		else return false;
	}

}
