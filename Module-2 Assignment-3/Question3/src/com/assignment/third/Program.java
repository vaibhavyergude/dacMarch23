package com.assignment.third;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static void acceptRecord(User u) {
		System.out.println();
		System.out.print("Enter name : ");
		sc.nextLine();
		u.setUserName(sc.nextLine());
		System.out.print("Enter emailId : ");
		u.setUserEmail(sc.nextLine());
		System.out.print("Enter contact number : ");
		u.setUserContact(sc.nextLong());
		System.out.println();
	}
	private static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.User Registration");
		System.out.println("2.Flight Availability");
		System.out.println("3.Seat Reservation");
		System.out.println("4.View Reservation");
		System.out.println("5.Cancel reservation");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Airport a=new Airport();
		User u=new User();
		int choice;
		while((choice=Program.menuList()) != 0) {
			switch(choice) {
			case 1: 
				Program.acceptRecord(u);
				break;
			case 2:
				a.flightAvailability();
				break;
			case 3:
				System.out.println();
				System.out.print("Enter flight name : ");
				sc.nextLine();
				boolean reserved=a.reserveSeat(sc.nextLine(),u);
				System.out.println(reserved ? "Seat reserved" : "Seat not available");
				System.out.println();
				break;
			case 4:
				System.out.println();
				u.viewReservation();
				break;
			case 5:
				System.out.println();
				System.out.print("Enter flight name : ");
				sc.nextLine();
				a.cancelReservation(sc.nextLine(), u);
				break;
			}
		}
	
	}
	
}
