/**
 * 
 */
package me.lichee.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import me.lichee.dao.TeamDao;
import me.lichee.entity.Team;

/**
 * @author Rain
 * Team's Dao Implements
 */
public class TeamDaoImpl extends BaseDaoImpl<Team> implements TeamDao{
	HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public List<Team> findAllTeam(){
		return (List<Team> )this.getHibernateTemplate().find("From Team ");
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
}
