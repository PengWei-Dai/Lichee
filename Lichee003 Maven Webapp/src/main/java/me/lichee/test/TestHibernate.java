package me.lichee.test;

import static org.junit.Assert.*;
import me.lichee.dao.UserDao;
import me.lichee.dao.impl.UserDaoImpl;
import me.lichee.entity.User;
import me.lichee.service.UserService;
import me.lichee.service.impl.UserServiceImpl;

import org.apache.struts2.convention.ClasspathConfigurationProvider;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate  {
	
	@Test
	public void TestSave(){
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	
		UserService usi=(UserService) context.getBean("userServiceImpl");
		
		User user=new User();
		user.setName("dpw");
		user.setPassword("password");
		
		usi.addUser(user);
		
	}

}