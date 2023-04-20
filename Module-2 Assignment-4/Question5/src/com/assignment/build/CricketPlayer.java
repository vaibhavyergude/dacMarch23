package com.assignment.build;

public class CricketPlayer extends Player{
	private int runsScored;
	private int wicketsTaken;
	public CricketPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public void play() {
		if(this.wicketsTaken > 0)
			this.score= this.runsScored + this.wicketsTaken*10;
		else
			this.score=this.runsScored;
	}
}
