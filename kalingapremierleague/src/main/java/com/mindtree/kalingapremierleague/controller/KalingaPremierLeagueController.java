package com.mindtree.kalingapremierleague.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kalingapremierleague.dto.PlayerDto;
import com.mindtree.kalingapremierleague.dto.ResponseDto;
import com.mindtree.kalingapremierleague.dto.TeamDto;
import com.mindtree.kalingapremierleague.entity.Ground;
import com.mindtree.kalingapremierleague.entity.Team;
import com.mindtree.kalingapremierleague.exception.KalingapremierleagueApplicationException;
import com.mindtree.kalingapremierleague.service.GroundService;
import com.mindtree.kalingapremierleague.service.PlayerService;
import com.mindtree.kalingapremierleague.service.TeamService;

@RestController
public class KalingaPremierLeagueController {
@Autowired
GroundService groundService;
@Autowired
PlayerService playerService;
@Autowired
TeamService teamService;
/*@PostMapping(value = "/add-customer/{policyId}")
public ResponseEntity<ResponseDto> addCustomer(@RequestBody CustomerDto customers,@PathVariable int policyId) throws ServiceException {
	
//	Customer customerDto=insuranceService.addCustomers(customers,policyId);
	//System.out.println(customerDto);
	ResponseDto response=new ResponseDto(insuranceService.addCustomers(customers,policyId), null, "Customer Onboarded", true);
	return ResponseEntity.status(HttpStatus.OK).body(response);
	//return null;
	
}*/
@PostMapping(value="/addGround")
public ResponseEntity<ResponseDto<Ground>> addGround(@RequestBody Ground ground)
{
	ResponseDto<Ground> response=new ResponseDto<Ground>(groundService.addGround(ground), null,"Ground Added Successfull", true);
	return ResponseEntity.status(HttpStatus.OK).body(response);

}
@PostMapping(value="/addTeam")
public ResponseEntity<ResponseDto<TeamDto>> addTeam(@RequestBody TeamDto team)
{
	ResponseDto<TeamDto> response =new ResponseDto<TeamDto>(teamService.addTeam(team),null,"Team Added Succesfully",true);
	return ResponseEntity.status(HttpStatus.OK).body(response);
}
@PostMapping(value="/addPlayer")
public ResponseEntity<ResponseDto<PlayerDto>> addPlayer(@RequestBody PlayerDto playerDto)
{
	ResponseDto<PlayerDto> response=new ResponseDto<PlayerDto>(playerService.addPlayer(playerDto), null,"Player Added Successfully", true);
	return ResponseEntity.status(HttpStatus.OK).body(response);
 
}
@PostMapping(value="/assignTeamToGround/{groundId}/{teamId}")
public ResponseEntity<ResponseDto<String>> assignTeamToGround(@PathVariable int groundId,@PathVariable int teamId) throws KalingapremierleagueApplicationException
{
	ResponseDto<String> response=new ResponseDto<String>(playerService.assignTeamToGround(groundId,teamId), null," Successfull", true);
	return ResponseEntity.status(HttpStatus.OK).body(response);
 
}
@PostMapping(value="/assignPlayerToTeam/{teamId}/{playerId}")

public ResponseEntity<ResponseDto<String>> assignPlayerToTeam(@PathVariable int teamId,@PathVariable int playerId) throws KalingapremierleagueApplicationException
{ResponseDto<String> response=new ResponseDto<String>(teamService.assignPlayerToTeam(teamId,playerId), null,"Successfully Assigned",true);
 return ResponseEntity.status(HttpStatus.OK).body(response);
	
}


}
