/**
 * 
 */
package me.lichee.dao;

import java.util.List;

import me.lichee.entity.User;

/**
 * @author Rain
 * function������������ɾ��
 */
public interface UserDao {

	/**
	 * ʵ����User
	 * @param id��Ҫ���ص�ʵ������
	 * @return ���ؼ��ص�User��ʵ��
	 */
	User get(Integer id);
	
	/**
	 * ����User
	 * @param user��Ҫ������û�
	 * @return id �ոձ����user��id
	 */
	Integer save(User user);
	
	/**
	 * ����User
	 * @param name�����û�������User
	 * @return user ����ȫ��ʵ��
	 */
	public List<User> findByName(String name);
	
	/**
	 * ��ѯ���е�User
	 * @param null 
	 * @return �������е�user
	 */
	public List<User> findAllUser();
	
	/**
	 * ɾ��user
	 * @param name �����û���ɾ��user
	 * @return  ɾ��ָ����user
	 */
	void delelt(String name);
	
	/**
	 * ɾ��user
	 * @param id ����idɾ��user
	 * @return  ɾ��ָ����user
	 */
	void delelt(Integer id);
	
	/**
	 * ����user��Ϣ
	 * @param user ��Ҫ���µ�user
	 * @return boolean ����ָ����user
	 */
	void update(User user);
	
}
