/**
 * 
 */
package me.lichee.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import me.lichee.dao.BaseDao;

/**
 * @author Rain
 * @param <T>
 * 此类是使用Hibernate来进行封装，主要实现BASEDAO 的CURD的操作
 */
public class BaseDaoImpl<T> implements BaseDao<T>{
	
	HibernateTemplate hibernateTemplate;
	

	//通过参数找到一个entity 
	public T findEntity(String hql, Object args) {
		//这里查询出来的是一个List类型,需要进行判断
		List<T> entitys=(List<T>)this.getHibernateTemplate().find(hql, args);
		if(entitys.size() > 0){
			return entitys.get(0);   //如果只有一个那么返回这一个entity   
		}
		
		else return null;	
	}

	public void saveEntity(T entity) {
		System.out.println("daoceng");
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
