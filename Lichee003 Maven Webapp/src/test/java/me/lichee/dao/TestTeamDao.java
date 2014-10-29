/**
 * 
 */
package me.lichee.dao;

import static org.junit.Assert.*;
import me.lichee.entity.Team;
import me.lichee.entity.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rain
 *
 */
public class TestTeamDao {

	@SuppressWarnings("unused")
	@Test
	public void testSaveDao() {
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeamDao test =(TeamDao)con.getBean("teamDaoImpl");
		
		Team suse=new Team();
		suse.setName("suse2");
		test.saveTeam(suse);
		
		

	}

}
