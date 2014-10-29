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

	private HibernateTemplate hibernateTemplate;
	


	public Team findTeamById(int id) {
		Team team=(Team)this.getHibernateTemplate().get(Team.class, id);
		return team;
	}

	@SuppressWarnings("unchecked")
	public List<Team> findTeamByHql(String hql, Object obj) {
		List<Team> teams=(List<Team>)this.getHibernateTemplate().find(hql, obj);
		return teams;
	}

	@SuppressWarnings("unchecked")
	public List<Team> findAllTeam() {
		List<Team> teams = (List<Team>)this.getHibernateTemplate().find("From Team");
		return teams;
	}




	public void updateTeamByHql(String hql, Object obj) {
		this.getHibernateTemplate().update(
				this.findTeamByHql(hql, obj)
				);		
	}



	public void deleteTeamByHql(String hql, Object obj) {
		this.getHibernateTemplate().delete(
			this.findTeamByHql(hql, obj)	
				);
	}

	public void deleteAllTeam(List<Team>  teams) {
		this.getHibernateTemplate().deleteAll(teams);
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	
	
	
}
