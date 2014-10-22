package me.lichee.dao;


import java.util.List;

import me.lichee.entity.Person;

public interface PersonDao 
{
	/**
	 * ����Personʵ��
	 * @param id ��Ҫ���ص�Personʵ��������ֵ
	 * @return ���ؼ��ص�Personʵ��
	 */ 
	Person get(Integer id);
	 
	/**
	 * ����Personʵ��
	 * @param person ��Ҫ�����Personʵ��
	 * @return �ոձ����Personʵ���ı�ʶ����ֵ
	 */	
	Integer save(Person person);
	
	/**
	 * �޸�Personʵ��
	 * @param person ��Ҫ�޸ĵ�Personʵ��
	 */
	void update(Person person);
	
	/**
	 * ɾ��Personʵ��
	 * @param id ��Ҫɾ����Personʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	
	/**
	 * ɾ��Personʵ��
	 * @param person ��Ҫɾ����Personʵ��
	 */
	void delete(Person person);
	
	/**
	 * �����û�������Person
	 * @param name ��ѯ������
	 * @return ָ���û�����Ӧ��ȫ��Person
	 */
	List<Person> findByName(String name);
	
	/**
	 * ��ѯȫ��Personʵ��
	 * @return ȫ��Personʵ��
	 */
	public List<Person> findAllPerson();
}