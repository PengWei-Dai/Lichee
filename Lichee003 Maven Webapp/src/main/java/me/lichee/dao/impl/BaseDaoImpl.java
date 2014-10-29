/**
 * 
 */
package me.lichee.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import me.lichee.dao.BaseDao;

/**
 * @author Rain
 * @param <T>
 *
 */
public class BaseDaoImpl<T> implements BaseDao<T>{

	HibernateTemplate hibernateTemplate;
	
	
	@SuppressWarnings("unchecked")
	public T findEntity(T entity) {
		return (T)this.getHibernateTemplate().save(entity);
	}

	public void saveEntity(T entity) {
		this.getHibernateTemplate().save(entity);
		
	}

	public void deleltEntity(T entity) {
		this.getHibernateTemplate().delete(entity);
		
	}

	public void updateEntity(T entity) {
		this.getHibernateTemplate().update(entity);
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
