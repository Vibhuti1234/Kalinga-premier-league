package com.mindtree.kalingapremierleague.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.kalingapremierleague.entity.Team;

public class PlayerDto {
	private long playerId;
	private String playerName;
	private double playerPrice;
	@JsonIgnore
     private Team team;
	public PlayerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerDto(long playerId, String playerName, double playerPrice, Team team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerPrice = playerPrice;
		this.team = team;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public double getPlayerPrice() {
		return playerPrice;
	}
	public void setPlayerPrice(double playerPrice) {
		this.playerPrice = playerPrice;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
}
