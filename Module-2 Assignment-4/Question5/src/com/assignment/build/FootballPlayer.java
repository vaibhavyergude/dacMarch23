package com.assignment.build;

public class FootballPlayer extends Player{
	private int goalsScored;
	private int assists;
	public FootballPlayer() {
		// TODO Auto-generated constructor stub
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	@Override
	public void play() {
		if(this.assists > 0)
			this.score = this.goalsScored + this.assists*5;
		else
			this.score = this.goalsScored;
	}
}
