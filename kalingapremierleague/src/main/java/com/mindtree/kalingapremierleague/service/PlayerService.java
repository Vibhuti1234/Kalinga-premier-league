package com.mindtree.kalingapremierleague.service;

import com.mindtree.kalingapremierleague.dto.PlayerDto;
import com.mindtree.kalingapremierleague.exception.KalingapremierleagueApplicationException;

public interface PlayerService {

	PlayerDto addPlayer(PlayerDto playerDto);

	String assignTeamToGround(int groundId, int teamId) throws KalingapremierleagueApplicationException;

}
