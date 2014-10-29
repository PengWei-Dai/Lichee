package me.lichee.dao;

import static org.junit.Assert.*;

import java.util.List;

import me.lichee.dao.impl.UserDaoImpl;
import me.lichee.entity.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
	

	
	@Test
	public void testAdd() {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userdao=(UserDao)con.getBean("userDaoImpl");
		User user=new User();
		user.setName("admin");
		user.setPassword("admin");
		user.setNumber("12101010703");
		user.setPartment("JIKE");
		user.setSex(0);
		user.setMail("admin@qq.com");
		user.setSchool("suse");
		userdao.saveEntity(user);
	}
	
	
	
	@Test
	public void TestFindById(){
		@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userdao=(UserDaoImpl)con.getBean("userDaoImpl");
		User u=userdao.findUserById(4);
		System.out.println(u.getNumber());
	}
	
	@Test
	public void TestFindAll(){
		@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userdao=(UserDaoImpl)con.getBean("userDaoImpl");
		List<User> users=userdao.findUserAll();
		
		System.out.println(users.size());
		
	}
	
	
	@Test
	public void TestDeletById(){
		@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userdao=(UserDaoImpl)con.getBean("userDaoImpl");
		
		userdao.deleltUserById(5);
		
	}
	
	
	@Test
	public void TestUpdate(){
		@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userdao=(UserDaoImpl)con.getBean("userDaoImpl");
		
		User u=userdao.findUserById(1);
		u.setName("dpw");
		
		userdao.updateEntity(u);
		
		
	}
	
	
	@Test
	public void TestFindByHql(){
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userdao=(UserDaoImpl)con.getBean("userDaoImpl");
		
		List <User> user =userdao.findUserByHql("From User u where u.mail=?", "1039895299@qq.com");
		System.out.println(user.size());
	}
	

}
