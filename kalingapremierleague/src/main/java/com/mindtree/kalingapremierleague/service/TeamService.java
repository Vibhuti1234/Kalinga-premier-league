package com.mindtree.kalingapremierleague.service;

import com.mindtree.kalingapremierleague.dto.TeamDto;
import com.mindtree.kalingapremierleague.entity.Team;
import com.mindtree.kalingapremierleague.exception.KalingapremierleagueApplicationException;

public interface TeamService 
{
	TeamDto addTeam(TeamDto team);

	String assignPlayerToTeam(int teamId, int playerId) throws KalingapremierleagueApplicationException;

}
