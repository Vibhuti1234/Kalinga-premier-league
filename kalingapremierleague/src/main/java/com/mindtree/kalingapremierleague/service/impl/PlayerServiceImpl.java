package com.mindtree.kalingapremierleague.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingapremierleague.dto.PlayerDto;
import com.mindtree.kalingapremierleague.entity.Ground;
import com.mindtree.kalingapremierleague.entity.Player;
import com.mindtree.kalingapremierleague.entity.Team;
import com.mindtree.kalingapremierleague.exception.KalingapremierleagueApplicationException;
import com.mindtree.kalingapremierleague.exception.NoSuchGroundException;
import com.mindtree.kalingapremierleague.exception.NoSuchTeamException;
import com.mindtree.kalingapremierleague.repository.GroundRepository;
import com.mindtree.kalingapremierleague.repository.PlayerRepository;
import com.mindtree.kalingapremierleague.repository.TeamRepository;
import com.mindtree.kalingapremierleague.service.PlayerService;
@Service
public class PlayerServiceImpl  implements PlayerService{
	@Autowired
	GroundRepository groundRepository;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	TeamRepository teamRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public PlayerDto addPlayer(PlayerDto playerDto) {
		// TODO Auto-generated method stub
		Player player=convertDtoToEntity(playerDto);
		playerRepository.save(player);
		return playerDto;
	}
	private Player convertDtoToEntity(PlayerDto playerDto) {
		// TODO Auto-generated method stub
		return modelMapper.map(playerDto, Player.class);
	}
	@Override
	public String assignTeamToGround(int groundId, int teamId) throws KalingapremierleagueApplicationException {
		// TODO Auto-generated method stub
		
		Ground ground=groundRepository.findAll().stream().filter(i->i.getGroundId()==groundId).findAny().orElseThrow(()->new NoSuchGroundException("GroundNotFound"));
		Team team=teamRepository.findAll().stream().filter(i->i.getTeamId()==teamId).findAny().orElseThrow(()->new NoSuchTeamException("Team Not Found"));
	    team.setGround(ground);
	   // ground.setTeam(team);
	    //groundRepository.save(ground);
	    teamRepository.save(team);
		return "Assigned Successfully";
		
	}
}
