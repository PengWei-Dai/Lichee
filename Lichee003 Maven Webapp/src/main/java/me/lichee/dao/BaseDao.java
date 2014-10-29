package me.lichee.dao;



public interface BaseDao<T> {
	/**
	 * 查找
	 */
	
	public T findEntity(T entity);

	/*
	 * 增加
	 */
	
	
	public void saveEntity(T entity);
	
	/**
	 * 删除
	 */
	
	public void deleltEntity(T entity);
	
	
	/*
	 * 更新
	 */
	public void updateEntity(T entity);
	

}
