/**
 * 
 */
package me.lichee.service.impl;


import me.lichee.dao.impl.BaseDaoImpl;
import me.lichee.service.BaseService;

/**
 * @author Rain
 *	该类实现BaseService的所有方法
 */
public class BaseServiceImpl<T> implements BaseService<T>  {
	
	//BaseDAOImpl依赖 baseDaoImpl 的注入
	BaseDaoImpl<T> baseDaoImpl;

	public T getEntity(String hql, Object args) {
		T entity= this.getBaseDaoImpl().findEntity(hql, args);
		if(entity != null){    //此处因可能返回为空值所以需要判断
			return entity;
		}
		else return null;
	}

	public void addEntity(T entity) {
		System.out.println("daoci");
		System.out.println(entity);
		this.getBaseDaoImpl().saveEntity(entity);
	
	}

	public void deleltEntity(T entity) {
		this.getBaseDaoImpl().deleltEntity(entity);
		
	}

	public void updateEntity(T entity) {
		this.getBaseDaoImpl().updateEntity(entity);
		
	}
	

	public BaseDaoImpl<T> getBaseDaoImpl() {
		return baseDaoImpl;
	}

	public void setBaseDaoImpl(BaseDaoImpl<T> baseDaoImpl) {
		this.baseDaoImpl = baseDaoImpl;
	}

	

}
