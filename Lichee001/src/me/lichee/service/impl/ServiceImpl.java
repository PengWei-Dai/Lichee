package me.lichee.service.impl;

import me.lichee.dao.PersonDao;
import me.lichee.entity.Person;
import me.lichee.service.Service;

public class ServiceImpl
	implements Service
{
	private PersonDao personDao;
	//依赖注入DAO组件所需的setter方法
	public void setPersonDao(PersonDao personDao)
	{
		this.personDao = personDao;
	}
	//注册用户
	public boolean regist(Person person)
	{
		//调用DAO组件的方法来实现业务逻辑
		int result = personDao.save(person);
		if (result > 0)
		{
			return true;
		}
		return false;
	}
}
