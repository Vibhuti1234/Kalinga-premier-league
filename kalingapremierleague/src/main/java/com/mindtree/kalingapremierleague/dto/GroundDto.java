package com.mindtree.kalingapremierleague.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class GroundDto {
	private long groundId;
	private String groundName;
    @JsonIgnore
	private TeamDto team;
	public GroundDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroundDto(long groundId, String groundName, TeamDto team) {
		super();
		this.groundId = groundId;
		this.groundName = groundName;
		this.team = team;
	}
	public long getGroundId() {
		return groundId;
	}
	public void setGroundId(long groundId) {
		this.groundId = groundId;
	}
	public String getGroundName() {
		return groundName;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public TeamDto getTeam() {
		return team;
	}
	public void setTeam(TeamDto team) {
		this.team = team;
	}
    
   
}
