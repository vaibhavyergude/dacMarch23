package com.assignment.build;

public class PlayerSelector {
	private PlayerSelector() {
		// TODO Auto-generated constructor stub
	}

	public static Player getInstance(PlayerType choice) {
		switch(choice) {
		case CRICKET_PLAYER : return new CricketPlayer();
		case FOOTBALL_PLAYER : return new FootballPlayer();
		}
		return null;
	}
	
}
