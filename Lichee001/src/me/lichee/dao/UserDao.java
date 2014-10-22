/**
 * 
 */
package me.lichee.dao;

import java.util.List;

import me.lichee.entity.User;

/**
 * @author Rain
 * function：基础的增插删改
 */
public interface UserDao {

	/**
	 * 实例化User
	 * @param id需要加载的实例主键
	 * @return 返回加载的User的实例
	 */
	User get(Integer id);
	
	/**
	 * 保存User
	 * @param user需要保存的用户
	 * @return id 刚刚保存的user的id
	 */
	Integer save(User user);
	
	/**
	 * 查找User
	 * @param name根据用户名查找User
	 * @return user 返回全部实例
	 */
	public List<User> findByName(String name);
	
	/**
	 * 查询所有的User
	 * @param null 
	 * @return 返回所有的user
	 */
	public List<User> findAllUser();
	
	/**
	 * 删除user
	 * @param name 根据用户名删除user
	 * @return  删除指定的user
	 */
	void delelt(String name);
	
	/**
	 * 删除user
	 * @param id 根据id删除user
	 * @return  删除指定的user
	 */
	void delelt(Integer id);
	
	/**
	 * 更新user信息
	 * @param user 需要更新的user
	 * @return boolean 更新指定的user
	 */
	void update(User user);
	
}
