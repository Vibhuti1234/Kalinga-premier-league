package com.mindtree.kalingapremierleague.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TeamDto {
	private long teamId;
	private String teamName;
	private int playerCount;
	private double totalBudget;
	private double budgetRemaining;
	private double budgetSpent;
	@JsonIgnore
	private GroundDto ground;
	@JsonIgnore
	private List<PlayerDto> players=new ArrayList<PlayerDto>();
	public TeamDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamDto(long teamId, String teamName, int playerCount, double totalBudget, double budgetRemaining,
			double budgetSpent, GroundDto ground, List<PlayerDto> players) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.playerCount = playerCount;
		this.totalBudget = totalBudget;
		this.budgetRemaining = budgetRemaining;
		this.budgetSpent = budgetSpent;
		this.ground = ground;
		this.players = players;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getPlayerCount() {
		return playerCount;
	}
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	public double getTotalBudget() {
		return totalBudget;
	}
	public void setTotalBudget(double totalBudget) {
		this.totalBudget = totalBudget;
	}
	public double getBudgetRemaining() {
		return budgetRemaining;
	}
	public void setBudgetRemaining(double budgetRemaining) {
		this.budgetRemaining = budgetRemaining;
	}
	public double getBudgetSpent() {
		return budgetSpent;
	}
	public void setBudgetSpent(double budgetSpent) {
		this.budgetSpent = budgetSpent;
	}
	public GroundDto getGround() {
		return ground;
	}
	public void setGround(GroundDto ground) {
		this.ground = ground;
	}
	public List<PlayerDto> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerDto> players) {
		this.players = players;
	}
	
}
