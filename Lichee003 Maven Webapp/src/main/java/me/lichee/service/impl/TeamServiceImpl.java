/**
 * 
 */
package me.lichee.service.impl;
import java.util.List;

import me.lichee.dao.impl.TeamDaoImpl;
import me.lichee.entity.Team;
import me.lichee.service.TeamService;

/**
 * @author Rain	
 *Team的Service继承了通用的一些方法，并实现一些比较独特的方法
 */
public class TeamServiceImpl extends BaseServiceImpl<Team> implements TeamService{
	//依赖类
	TeamDaoImpl teamDaoImpl;
	

	
	public List<Team> getAllTeams(){
		List<Team> teams=this.getTeamDaoImpl().findAllTeam();
		if(teams.size() > 0){
			return teams;
		}
		else return null;
	}
	
	
	
	
	
	
	
	public TeamDaoImpl getTeamDaoImpl() {
		return teamDaoImpl;
	}

	public void setTeamDaoImpl(TeamDaoImpl teamDaoImpl) {
		this.teamDaoImpl = teamDaoImpl;
	}
	
	


}
