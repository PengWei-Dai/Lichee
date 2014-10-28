/**
 * 
 */
package me.lichee.service;

import static org.junit.Assert.*;
import me.lichee.dao.impl.UserDaoImpl;
import me.lichee.exception.UserLoginException;
import me.lichee.service.impl.UserLoginService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rain
 *
 */
public class TestUserService {

	@Test
	public void testIsExist() throws UserLoginException {
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserLoginService test=(UserLoginService)con.getBean("userLoginService");
		
		boolean isexis=test.isExistUser("axdmin@qq.com", "admin");
	
		System.out.println(isexis);
		
	}

}
