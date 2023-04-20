package com.assignment.third;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add item to shelf");
		System.out.println("2.Remove item from shelf");
		System.out.println("3.Display contents of all shelves");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Warehouse Inventory Management System!");
		int choice;
		Inventory i=new Inventory();
		while((choice=Program.menuList()) != 0) {
			switch(choice) {
			case 1:
				i.addShelf();
				break;
			case 2:
				i.removeShelf();
				break;
			case 3:
				i.displayContent();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}

