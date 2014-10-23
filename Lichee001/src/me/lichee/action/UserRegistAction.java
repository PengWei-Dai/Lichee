/**
 * 
 */
package me.lichee.action;

import me.lichee.entity.User;
import me.lichee.service.RegisterService;

import com.opensymphony.xwork2.Action;

/**
 * @author Rain
 *
 */
public class UserRegistAction implements Action{

	
	//用于封装用户请求的参数
	private User user;
	//用于封装处理结果的属性
	private String tip;
	//系统所用的业务逻辑组件
	private RegisterService register;
	//设置注入业务逻辑组件所必需的setter方法
	public void setRegisterService(RegisterService registerService){
		this.register=register;
	}
	
	
	//User属于的getter和setter方法
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	//处理结果tip的getter和setter属性
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}



	@Override
	public String execute() throws Exception {
		//调用业务逻辑组件的regist方法来处理请求
		if(register==null){
			System.out.println("null");
		}
		
		if(register.register(user)){
			setTip("看词句到我就睡觉！");
			
			
			
			return SUCCESS;
		}
		else return ERROR;
	}
	
	
	

}
