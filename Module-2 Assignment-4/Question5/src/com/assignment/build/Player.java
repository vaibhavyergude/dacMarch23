package com.assignment.build;

public class Player {
	private String name;
	private int age;
	private String team;
	protected int score;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void play() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Name : "+this.name+"		Scores : "+this.score;
	}
}
