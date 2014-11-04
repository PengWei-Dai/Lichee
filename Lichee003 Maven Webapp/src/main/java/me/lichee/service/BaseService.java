/**
 * 
 */
package me.lichee.service;

/**
 * @author Rain
 *
 */
public interface BaseService <T>{
	/**
	 * 查找
	 */
	
	public T getEntity(String hql , Object args);

	/*
	 * 增加
	 */
	
	
	public void addEntity(T entity);
	
	/**
	 * 删除
	 */
	
	public void deleltEntity(T entity);
	
	
	/*
	 * 更新
	 */
	public void updateEntity(T entity);
	
		
}
