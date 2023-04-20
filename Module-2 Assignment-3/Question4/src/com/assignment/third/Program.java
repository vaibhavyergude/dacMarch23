package com.assignment.third;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static int menuListCustomer() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Display seats");
		System.out.println("2.Reserve Seats");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	private static int menuListStaff() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Available seats");
		System.out.println("2.Ticket Sales");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	private static int menu() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1. Customer");
		System.out.println("2. Staff");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}	
	public static void main(String[] args) {
		int choice1;
		Theatre t=new Theatre();
		while((choice1=Program.menu()) != 0) {
			int choice;
			if(choice1==1) {
				while((choice=Program.menuListCustomer()) != 0) {
					switch(choice) {
					case 1:
						t.displaySeats();
						break;
					case 2:
						t.reserveSeats();
						break;
					default: 
						System.out.println("Invalid choice");
					}
				}
			}
			else {
				while((choice=Program.menuListStaff()) != 0) {
					switch(choice) {
					case 1:
						t.availableSeats();
						break;
					case 2:
						t.ticketSales();
						break;
					default: 
						System.out.println("Invalid choice");
					}
				}
			}
		}
		
	}
	
}

