/**
 * 
 */
package me.lichee.service.impl;





import me.lichee.entity.User;
import me.lichee.exception.UserLoginException;


/**
 * @author Rain
 *
 */
public class UserLoginService {
	private UserServiceImpl userServiceImpl;
	

	
	public boolean isExistUser(String userMail , String userPassword) throws UserLoginException{
		//此处为实验打印
		System.out.println(userMail);
		System.out.println(userPassword);
		
		User user=getUserServiceImpl().findUserByMail(userMail);
		
		if(user != null ){
			if(user.getPassword().equals(userPassword)){
				return true;
			}
			else new UserLoginException("密码错误！") ;
			return false;
		}
		else new UserLoginException("该用户不存在！");	
		return false;
	}



	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}



	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
}
