package com.assignment.test;

import java.util.Scanner;
import com.assignment.build.Player;
import com.assignment.build.PlayerSelector;
import com.assignment.build.PlayerType;
import com.assignment.build.FootballPlayer;
import com.assignment.build.CricketPlayer;

public class PlayerTest {
	private static Scanner sc=new Scanner(System.in);
	private Player[] p=new Player[10];
	private int index;
	
	public void addNewPlayer() {
		PlayerType choice=PlayerTest.playerMenu();
		if(this.index < this.p.length) {
			this.p[this.index]=PlayerSelector.getInstance(choice);
			PlayerTest.acceptRecord(this.p[this.index]);
			this.index++;
		}
		else
			System.out.println("Cannot contain more players");
	}
	
	public void getPlayersScore() {
		boolean flag=false;
		for(int i=0;i<this.index;i++) {
			if(this.p[i] != null) {
				System.out.println(this.p[i]);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No players played");
	}
	
	public void getTeamScore() {
		boolean flag=false;
		int scoreFootball=0;
		int scoreCricket=0;
		for(int i=0;i<this.index;i++) {
			if(this.p[i] != null) {
				flag=true;
				if( this.p[i] instanceof FootballPlayer )
					scoreFootball += this.p[i].getScore();
				else
					scoreCricket += this.p[i].getScore();
			}
		}
		if(flag==false)
			System.out.println("No players played");
		else {
			System.out.println();
			System.out.println("Football team scores : "+scoreFootball);
			System.out.println("Cricket team scores : "+scoreCricket);
		}
	}
	
	private static void acceptRecord(Player player) {
		if(player != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter name : ");
			player.setName(sc.nextLine());
			System.out.print("Enter age : ");
			player.setAge(sc.nextInt());
			System.out.print("Enter team : ");
			player.setTeam(sc.nextLine());
			
			if(player instanceof FootballPlayer) {
				FootballPlayer fp=(FootballPlayer) player;
				sc.nextLine();
				System.out.print("Enter goals scored : ");
				fp.setGoalsScored(sc.nextInt());
				System.out.print("Enter assists : ");
				fp.setAssists(sc.nextInt());
			}
			else {
				CricketPlayer cp=(CricketPlayer) player;
				sc.nextLine();
				System.out.print("Enter runs scored : ");
				cp.setRunsScored(sc.nextInt());
				System.out.print("Enter wickets taken : ");
				cp.setWicketsTaken(sc.nextInt());
			}
			player.play();
		}
	}
	
	private static PlayerType playerMenu() {
		System.out.println();
		System.out.println("0.Cricket Player");
		System.out.println("1.Football Player");
		System.out.print("Enter choice : ");
		return PlayerType.values()[sc.nextInt()];
	}
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add a new player");
		System.out.println("2.Get player scores");
		System.out.println("3.Get team scores");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	

	
	

	

}
