package com.assignment.main;

import com.assignment.test.PlayerTest;

public class Program {

	public static void main(String[] args) {
		int choice;
		PlayerTest test=new PlayerTest();
		while((choice = PlayerTest.menuList()) != 0) {
			switch(choice) {
			case 1:
				test.addNewPlayer();
				break;
			case 2:
				test.getPlayersScore();
				break;
			case 3:
				test.getTeamScore();
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}
}
