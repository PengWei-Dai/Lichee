package me.lichee.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import me.lichee.dao.PersonDao;
import me.lichee.entity.Person;

import java.util.*;

public class PersonDaoHibernate
	extends HibernateDaoSupport implements PersonDao
{
	/**
	 * ����Personʵ��
	 * @param id ��Ҫ���ص�Personʵ���ı�ʶ����ֵ
	 * @return ָ��id��Ӧ��Personʵ��
	 */ 
	public Person get(Integer id)
	{
		return getHibernateTemplate()
			.get(Person.class, id); 
	}
	
	/**
	 * ����Personʵ��
	 * @param person ��Ҫ�����Personʵ��
	 * @return �ոձ����Personʵ���ı�ʶ����ֵ
	 */   
	public Integer save(Person person)
	{
		return (Integer)getHibernateTemplate()
			.save(person);
	}
	
	/**
	 * �޸�Personʵ��
	 * @param person ��Ҫ�޸ĵ�Personʵ��
	 */
	public void update(Person person)
	{
		getHibernateTemplate().update(person);
	}
	
	/**
	 * ɾ��Personʵ��
	 * @param id ��Ҫɾ����Personʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * ɾ��Personʵ��
	 * @param person ��Ҫɾ����Personʵ��
	 */
	public void delete(Person person)
	{
		getHibernateTemplate().delete(person);
	}
	
	/**
	 * �����û�������Person
	 * @param name ��ѯ������
	 * @return ָ���û�����Ӧ��ȫ��Person
	 */
	@SuppressWarnings("unchecked")
	public List<Person> findByName(String name)
	{
		return (List<Person>)getHibernateTemplate()
			.find("from Person p where p.name like ?" , name);
	}
	
	/**
	 * ��ѯȫ��Personʵ��
	 * @return ȫ��Personʵ��
	 */
	@SuppressWarnings("unchecked")
	public List<Person> findAllPerson()
	{
		return (List<Person>)getHibernateTemplate()
			.find("from Person");
	}
}