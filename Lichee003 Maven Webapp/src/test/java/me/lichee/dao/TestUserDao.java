package me.lichee.dao;






import me.lichee.dao.impl.UserDaoImpl;
import me.lichee.entity.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
	
	private ApplicationContext app;
	private UserDaoImpl t;
	@Before
	public void getDao() {
		// 这个要根据需要进行修改，在classes路径中去寻找配置文件。
		 app = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 t = (UserDaoImpl) app.getBean("userDaoImpl");	 
	}
	
	@Test
	public void testAdd() {
	
		User user=new User();
		user.setName("admin31");
		user.setPassword("admin131");
		user.setNumber("12101010706");
		user.setPower("系统管理员");
		user.setPartment("JIKE");
		user.setSex("nan");
		user.setMail("1331@qq.com");
		user.setSchool("suse");
		
		t.saveEntity(user);
		
		
	}
	
	
	
	

}
