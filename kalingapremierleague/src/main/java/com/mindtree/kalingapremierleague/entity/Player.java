package com.mindtree.kalingapremierleague.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long playerId;
	private String playerName;
	private double playerPrice;
	@ManyToOne
	@JoinColumn(name="Team_Id")
     private Team team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(long playerId, String playerName, double playerPrice, Team team) {
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
