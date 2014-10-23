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

	
	//���ڷ�װ�û�����Ĳ���
	private User user;
	//���ڷ�װ������������
	private String tip;
	//ϵͳ���õ�ҵ���߼����
	private RegisterService register;
	//����ע��ҵ���߼�����������setter����
	public void setRegisterService(RegisterService registerService){
		this.register=register;
	}
	
	
	//User���ڵ�getter��setter����
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	//������tip��getter��setter����
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}



	@Override
	public String execute() throws Exception {
		//����ҵ���߼������regist��������������
		if(register==null){
			System.out.println("null");
		}
		
		if(register.register(user)){
			setTip("���ʾ䵽�Ҿ�˯����");
			
			
			
			return SUCCESS;
		}
		else return ERROR;
	}
	
	
	

}
