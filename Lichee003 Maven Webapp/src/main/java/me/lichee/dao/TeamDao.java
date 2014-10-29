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
public interface TeamDao {
	
	/*
	 * find
	 */
	public Team findTeam(Team team);
	
	public Team findTeamById(int id);
	
	public List<Team> findTeamByHql(String hql , Object obj);
	
	public List<Team> findAllTeam();
	
	/*
	 * save
	 */
	
	public void saveTeam(Team team);
	
	/*
	 * update
	 */
	public void updateTeam(Team team);
	
	public void updateTeamByHql(String hql , Object obj);
	
	/*
	 * delete
	 */
	public void deleteTeam(Team team);
	
	public void deleteTeamByHql(String hql ,Object obj);
	
	public void deleteAllTeam(List<Team> teams );
	
}
