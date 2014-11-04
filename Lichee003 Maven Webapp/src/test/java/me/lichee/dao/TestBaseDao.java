package me.lichee.dao;

import static org.junit.Assert.*;

import java.util.Date;

import me.lichee.dao.impl.BaseDaoImpl;
import me.lichee.entity.Team;
import me.lichee.service.impl.TeamServiceImpl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBaseDao {


	private ApplicationContext app;
	private BaseDaoImpl t;
	
	@Before
	public void getDao() {
		// 这个要根据需要进行修改，在classes路径中去寻找配置文件。
		 app = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 t = (BaseDaoImpl) app.getBean("baseDaoImpl");

		 
	}
	
	@Test
	public void test() {
		Team team = new Team();
		team.setName("30777");
		team.setDate(new Date());
		team.setClassify("技术类");
		team.setInfo("xxxx");
		
		t.saveEntity(team);

	}

}
