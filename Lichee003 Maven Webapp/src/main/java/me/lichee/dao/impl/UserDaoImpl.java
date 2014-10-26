package me.lichee.dao.impl;



import org.springframework.orm.hibernate3.HibernateTemplate;


import me.lichee.dao.UserDao;
import me.lichee.entity.User;

public class UserDaoImpl implements UserDao {


	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void addUser(User u) {
		this.getHibernateTemplate().save(u);

	}

	public void updateUser(User u) {
		getHibernateTemplate().update(u);

	}

	public void deleltUser(int id) {

		getHibernateTemplate().delete(getUserByUserId(id));

	}

	public void findUser(int id) {
		getHibernateTemplate().find("from User");

	}

	public User getUserByUserId(int userId) {
		User user = (User) getHibernateTemplate().get(User.class, userId);
		return user;
	}

}
