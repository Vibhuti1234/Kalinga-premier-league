package com.mindtree.kalingapremierleague.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long teamId;
	@Column(unique=true)
	private String teamName;
	@Column( nullable=true)
	private int playerCount;
	private double totalBudget;
	@Column(nullable=true)
	private double budgetRemaining;
	@Column(nullable=true)
	private double budgetSpent;
	@OneToOne 
    //@JoinColumn(name="Ground_Id")
	private Ground ground;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="team")
	private List<Player> players=new ArrayList<Player>();
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Team(long teamId, String teamName, int playerCount, double totalBudget, double budgetRemaining,
			double budgetSpent, Ground ground, List<Player> players) {
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
	public Ground getGround() {
		return ground;
	}
	public void setGround(Ground ground) {
		this.ground = ground;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	

}
