package me.lichee.action;

import me.lichee.entity.Person;
import me.lichee.service.Service;

import com.opensymphony.xwork2.Action;


public class RegistAction
	implements Action
{
	//下面是用于封装用户请求参数的属性
	private Person person;
	//用于封装处理结果的属性
	private String tip;
	//系统所用的业务逻辑组件
	private Service service;
	//设置注入业务逻辑组件所必需的setter方法
	public void setService(Service service)
	{
		this.service = service;
	}

	//person属性的setter和getter方法
	public void setPerson(Person person)
	{
		this.person = person;
	}
	public Person getPerson()
	{
		return this.person;
	}

	//tip属性的setter和getter方法
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}

	//处理用户请求的execute方法
	public String execute()
		throws Exception
	{
		//调用业务逻辑组件的regist方法来处理请求
		if (service.regist(person))
		{
			setTip("哈哈，注册成功！");
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}
