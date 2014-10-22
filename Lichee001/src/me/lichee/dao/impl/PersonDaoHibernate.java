package me.lichee.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import me.lichee.dao.PersonDao;
import me.lichee.entity.Person;

import java.util.*;

public class PersonDaoHibernate
	extends HibernateDaoSupport implements PersonDao
{
	/**
	 * 加载Person实例
	 * @param id 需要加载的Person实例的标识属性值
	 * @return 指定id对应的Person实例
	 */ 
	public Person get(Integer id)
	{
		return getHibernateTemplate()
			.get(Person.class, id); 
	}
	
	/**
	 * 保存Person实例
	 * @param person 需要保存的Person实例
	 * @return 刚刚保存的Person实例的标识属性值
	 */   
	public Integer save(Person person)
	{
		return (Integer)getHibernateTemplate()
			.save(person);
	}
	
	/**
	 * 修改Person实例
	 * @param person 需要修改的Person实例
	 */
	public void update(Person person)
	{
		getHibernateTemplate().update(person);
	}
	
	/**
	 * 删除Person实例
	 * @param id 需要删除的Person实例的标识属性值
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * 删除Person实例
	 * @param person 需要删除的Person实例
	 */
	public void delete(Person person)
	{
		getHibernateTemplate().delete(person);
	}
	
	/**
	 * 根据用户名查找Person
	 * @param name 查询的人名
	 * @return 指定用户名对应的全部Person
	 */
	@SuppressWarnings("unchecked")
	public List<Person> findByName(String name)
	{
		return (List<Person>)getHibernateTemplate()
			.find("from Person p where p.name like ?" , name);
	}
	
	/**
	 * 查询全部Person实例
	 * @return 全部Person实例
	 */
	@SuppressWarnings("unchecked")
	public List<Person> findAllPerson()
	{
		return (List<Person>)getHibernateTemplate()
			.find("from Person");
	}
}