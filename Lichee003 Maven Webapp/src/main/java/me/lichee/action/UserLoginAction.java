/**
 * 
 */
package me.lichee.action;

import me.lichee.service.impl.UserLoginService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Rain
 *
 */

public class UserLoginAction extends ActionSupport{
	private static final long serialVersionUID = 2127847425960234626L;
	private String userMail;
	private String userPassword;
	private UserLoginService userLoginService;
	
	
	
	@Override
	public String execute() throws Exception {
		if(userLoginService.isExistUser(userMail , userPassword)){
			return SUCCESS;
		}
		else return ERROR;	
	}
	
	
	

	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public UserLoginService getUserLoginService() {
		return userLoginService;
	}
	public void setUserLoginService(UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}
	
	
	
	
	
	
}
