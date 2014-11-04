/**
 * 
 */
package me.lichee.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import me.lichee.entity.Team;
import me.lichee.service.impl.TeamServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Rain
 *
 */
public class TeamAction extends ActionSupport{
	//依赖Bean
	TeamServiceImpl teamServiceImpl;
	
	//拿到session 和 response
	HttpSession sess= ServletActionContext.getRequest().getSession(); 
	ServletResponse response= ServletActionContext.getResponse();

	//列出所有Team
	public void ListAllTeam() throws IOException{
		
		
		
	}
	
	
	
	
	
	public TeamServiceImpl getTeamServiceImpl() {
		return teamServiceImpl;
	}
	public void setTeamServiceImpl(TeamServiceImpl teamServiceImpl) {
		this.teamServiceImpl = teamServiceImpl;
	}
}
