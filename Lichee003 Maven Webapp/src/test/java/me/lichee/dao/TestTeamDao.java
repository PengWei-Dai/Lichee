/**
 * 
 */
package me.lichee.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import me.lichee.dao.impl.TeamDaoImpl;
import me.lichee.entity.Team;
import me.lichee.entity.User;
import me.lichee.service.impl.TeamServiceImpl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rain
 * 
 */
public class TestTeamDao {
	
	private ApplicationContext app;
	private TeamDaoImpl t;
	
	@Before
	public void getDao() {
		// 这个要根据需要进行修改，在classes路径中去寻找配置文件。
		 app = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 t = (TeamDaoImpl)app.getBean("teamDaoImpl");

	}

	@Test
	public void testSaveDao() {
		Team team = new Team();
		team.setName("304");
		team.setDate(new Date());
		team.setClassify("技术类");
		team.setInfo("xxxx");
		
		t.saveEntity(team);

	}

	@Test
	public void testFind(){
		
		Team team =t.findEntity("From Team t  where t.name = ?", "304" );
		System.out.println(team.getId());
	}
	
	
	@Test
	public void testFindAll(){
		
		List<Team> teams = t.findAllTeam();
		System.out.println(teams.get(1).getName());
	}

}
