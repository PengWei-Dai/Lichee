package me.lichee.dao.impl;



import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import me.lichee.dao.UserDao;
import me.lichee.entity.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	
	
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
