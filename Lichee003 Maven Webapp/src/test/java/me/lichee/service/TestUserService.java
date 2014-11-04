/**
 * 
 */
package me.lichee.service;








import me.lichee.entity.User;

import me.lichee.service.impl.UserServiceImpl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rain
 *
 */
public class TestUserService {

	private ApplicationContext app;
	private UserServiceImpl t;
	@Before
	public void getDao() {
		// 这个要根据需要进行修改，在classes路径中去寻找配置文件。
		 app = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 t = (UserServiceImpl) app.getBean("userServiceImpl");	 
	}
	
	@Test
	public void TestAdd(){
		
		User user=new User();
		user.setName("admin23");
		user.setPassword("admin23");
		user.setNumber("12101010706");
		user.setPower("系统管理员");
		user.setPartment("JIKE");
		user.setSex("nan");
		user.setMail("23dd@qq.com");
		user.setSchool("suse");
		
		t.addUser(user);
		
		
	}

	
	@Test
	public void TestIsExsit(){
		
		System.out.println(t.isExistUser("admin11" , "222@qq.com"));
		
	}

}
