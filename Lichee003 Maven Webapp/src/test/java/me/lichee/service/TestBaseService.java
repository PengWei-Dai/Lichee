package me.lichee.service;

import static org.junit.Assert.*;
import me.lichee.dao.impl.UserDaoImpl;
import me.lichee.entity.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBaseService {

	private ApplicationContext app;
	private BaseService t;
	@Before
	public void getDao() {
		// 这个要根据需要进行修改，在classes路径中去寻找配置文件。
		 app = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 t = (BaseService) app.getBean("baseServiceImpl");	 
	}
	
	
	@Test
	public void testAdd() {
		User user=new User();
		user.setName("adm21in22");
		user.setPassword("adm123in11");
		user.setNumber("12101010706");
		user.setPower("系统管理员");
		user.setPartment("JIKE");
		user.setSex("nan");
		user.setMail("2233@qq.com");
		user.setSchool("suse");
		
		t.addEntity(user);
	}

}
