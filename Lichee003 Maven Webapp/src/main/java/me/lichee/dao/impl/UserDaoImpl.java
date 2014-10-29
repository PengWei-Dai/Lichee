package me.lichee.dao.impl;



import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import me.lichee.dao.UserDao;
import me.lichee.entity.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {


	private HibernateTemplate hibernateTemplate;
	
	/*
	 * 查找
	 * @see me.lichee.dao.UserDao#findUserById(int)
	 */
	public User findUserById(int id) {
		User user=(User) this.getHibernateTemplate().get(User.class, id);
		return user;
	}


	
	
	@SuppressWarnings("unchecked")
	public List<User> findUserAll() {
	
	//查找的是类 对应响应的类名
	List<User>	users=(List<User>) this.getHibernateTemplate().find("From User");
		return users;
	}



	
	@SuppressWarnings("unchecked")
	public List<User> findUserByHql(String hql, Object obj) {
		return (List<User>) this.getHibernateTemplate().find(hql, obj);
	}


	/*
	 * 添加User
	 * @see me.lichee.dao.UserDao#addUser(me.lichee.entity.User)
	 */


	/*
	 * 删除User
	 * @see me.lichee.dao.UserDao#deleltUser(me.lichee.entity.User)
	 */




	public void deleltUserById(int id) {
		this.getHibernateTemplate().delete(
				this.findUserById(id)
				);
	}



	public void deleltUserAll() {
		this.getHibernateTemplate().deleteAll(
				this.findUserAll()
				);
	}


	public void deleltUserByHql(String hql ,Object obj) {
		this.getHibernateTemplate().deleteAll(
				this.findUserByHql(hql,obj)
				);	
	}


	/*
	 * 更新User
	 * @see me.lichee.dao.UserDao#updateUser(me.lichee.entity.User)
	 */

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
