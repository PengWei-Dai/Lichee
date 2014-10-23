/**
 * 
 */
package me.lichee.dao.impl;

import java.util.List;

import me.lichee.dao.UserDao;
import me.lichee.entity.Person;
import me.lichee.entity.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
/**
 * @author Rain
 *  µœ÷UserDao
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{


	public User get(Integer id) {
		return getHibernateTemplate().get(User.class,id);
	}


	public Integer save(User user) {
		return (Integer) getHibernateTemplate().save(user);
	}

	
	@SuppressWarnings("unchecked")
	public List<User> findByName(String name) {
		return getHibernateTemplate().find("find User u where u.name like ?" , name);
	}


	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		return getHibernateTemplate().find("find User");
	}

	
	public void delelt(String name) {
		getHibernateTemplate().delete(name);
	}
	
	public void delelt(Integer id){
		getHibernateTemplate().delete(id);
	}

	
	 public void update(User user) {
		 getHibernateTemplate().update(user);	
	}

}
