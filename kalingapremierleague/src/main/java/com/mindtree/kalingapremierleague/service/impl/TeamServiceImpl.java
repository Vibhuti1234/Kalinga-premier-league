package com.mindtree.kalingapremierleague.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingapremierleague.dto.TeamDto;
import com.mindtree.kalingapremierleague.entity.Player;
import com.mindtree.kalingapremierleague.entity.Team;
import com.mindtree.kalingapremierleague.exception.BudgetLimitExceedException;
import com.mindtree.kalingapremierleague.exception.KalingapremierleagueApplicationException;
import com.mindtree.kalingapremierleague.exception.NoSuchPlayerException;
import com.mindtree.kalingapremierleague.exception.NoSuchTeamException;
import com.mindtree.kalingapremierleague.repository.GroundRepository;
import com.mindtree.kalingapremierleague.repository.PlayerRepository;
import com.mindtree.kalingapremierleague.repository.TeamRepository;
import com.mindtree.kalingapremierleague.service.TeamService;
@Service
public class TeamServiceImpl implements  TeamService {
@Autowired
GroundRepository groundRepository;
@Autowired
PlayerRepository playerRepository;
@Autowired
TeamRepository teamRepository;
ModelMapper modelMapper=new ModelMapper();
@Override
public TeamDto addTeam(TeamDto team) {
	// TODO Auto-generated method stub
	Team teamEntity=convertDtoToEntity(team);
	teamEntity.setBudgetRemaining(team.getTotalBudget());
	teamRepository.save(teamEntity);
	return team;
}
private Team convertDtoToEntity(TeamDto team) {
	// TODO Auto-generated method stub
	return modelMapper.map(team,Team.class);
}
@Override
public String assignPlayerToTeam(int teamId, int playerId) throws KalingapremierleagueApplicationException {
	// TODO Auto-generated method stub
	Team team=teamRepository.findAll().stream().filter(i->i.getTeamId()==teamId).findAny().orElseThrow(()->new NoSuchTeamException("Team Not found"));
	Player player =playerRepository.findAll().stream().filter(i->i.getPlayerId()==playerId).findAny().orElseThrow(()->new NoSuchPlayerException("Player Not Found"));
	if(player.getPlayerPrice()<=team.getTotalBudget() && player.getPlayerPrice()<=team.getBudgetRemaining())
	{
		team.getPlayers().add(player);
	}
	else {
		throw new BudgetLimitExceedException("Above The Budget");
	}
	team.setPlayerCount(team.getPlayerCount()+1);
	team.setBudgetSpent(team.getBudgetSpent()+player.getPlayerPrice());
	team.setBudgetRemaining(team.getBudgetRemaining()-player.getPlayerPrice());
	player.setTeam(team);
	
	teamRepository.save(team);
	return "assigned";
}
}
