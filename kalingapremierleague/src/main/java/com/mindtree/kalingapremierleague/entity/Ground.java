package com.mindtree.kalingapremierleague.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.serviceloader.ServiceFactoryBean;

@Entity
public class Ground {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long groundId;
	@Column(unique=true)
	private String groundName;
	@OneToOne(mappedBy="ground",cascade=CascadeType.ALL)
	private Team team;
	public Ground() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ground(long groundId, String groundName, Team team) {
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
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	

}
