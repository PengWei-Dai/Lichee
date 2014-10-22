package me.lichee.service.impl;

import me.lichee.dao.PersonDao;
import me.lichee.entity.Person;
import me.lichee.service.Service;

public class ServiceImpl
	implements Service
{
	private PersonDao personDao;
	//����ע��DAO��������setter����
	public void setPersonDao(PersonDao personDao)
	{
		this.personDao = personDao;
	}
	//ע���û�
	public boolean regist(Person person)
	{
		//����DAO����ķ�����ʵ��ҵ���߼�
		int result = personDao.save(person);
		if (result > 0)
		{
			return true;
		}
		return false;
	}
}
