package com.mindtree.kalingapremierleague.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingapremierleague.entity.Ground;
import com.mindtree.kalingapremierleague.repository.GroundRepository;
import com.mindtree.kalingapremierleague.repository.PlayerRepository;
import com.mindtree.kalingapremierleague.repository.TeamRepository;
import com.mindtree.kalingapremierleague.service.GroundService;

@Service
public class GroundServiceImpl implements GroundService {
	@Autowired
	GroundRepository groundRepository;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	TeamRepository teamRepository;
	@Override
	public Ground addGround(Ground ground) {
		// TODO Auto-generated method stub	
		groundRepository.save(ground);
		return ground;
	}
}
