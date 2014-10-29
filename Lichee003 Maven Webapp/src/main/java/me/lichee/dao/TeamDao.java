/**
 * 
 */
package me.lichee.dao;

import java.util.List;

import me.lichee.entity.Team;

/**
 * @author Rain
 * Team's CUDR
 */
public interface TeamDao extends BaseDao<Team>{
	
	/*
	 * find
	 */

	
	public Team findTeamById(int id);
	
	public List<Team> findTeamByHql(String hql , Object obj);
	
	public List<Team> findAllTeam();
	
	/*
	 * save
	 */
	

	
	/*
	 * update
	 */

	
	public void updateTeamByHql(String hql , Object obj);
	
	/*
	 * delete
	 */

	
	public void deleteTeamByHql(String hql ,Object obj);
	
	public void deleteAllTeam(List<Team> teams );
	
}
