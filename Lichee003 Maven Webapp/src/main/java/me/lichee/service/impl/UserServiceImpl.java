/**
 * 
 */
package me.lichee.service.impl;

import java.util.List;






import me.lichee.dao.UserDao;
import me.lichee.dao.impl.UserDaoImpl;
import me.lichee.entity.User;
import me.lichee.service.UserService;

/**
 * @author Rain
 *User的Service继承了通用的一些方法，并实现一些比较独特的方法
 *所有关于User的处理均在此类进行处理
 */
public class UserServiceImpl{
	//userService依赖userDaoImpl；
	UserDaoImpl userDaoImpl;
	
	//登陆时判断是否存在该用户 , 我们使用邮箱作为登陆账号
	public boolean isExistUser(String password , String mail){
		User user=this.getUserDaoImpl().findEntity("From User user where user.mail = ?", mail);
		if(user == null){    //不存在该用户
			return false;
		}
		else {
			return true;    //存在该用户
		}	
	}
	
	//添加用户
	public void addUser(User u){
		this.getUserDaoImpl().saveEntity(u);
	}
	

	public UserDaoImpl getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	
	
	
}
