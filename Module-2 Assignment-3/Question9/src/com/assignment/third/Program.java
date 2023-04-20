package com.assignment.third;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static OrderSummary[] os=new OrderSummary[10];
	private static int index;
	private static void takeOrder() {
		Program.dishMenu();
		System.out.print("enter the dish number you wish to order : ");
		Dish d=Dish.values()[sc.nextInt()-1];
		System.out.print("enter the quantity you wish to order : ");
		int quantity=sc.nextInt();
		
		if(quantity > 0) {
			System.out.println("Total cost : "+(quantity*d.getPrice()));
			Program.Summary(d,quantity,(quantity*d.getPrice()));
		}
		else
			System.out.println("Invalid quantity entered. Please try again");
	}
	
	private static void Summary(Dish d, int quantity, int totalCost) {
		os[index]=new OrderSummary(d, quantity, totalCost);
		index++;
	}
	
	private static void printSummary() {
		System.out.println();
		System.out.println("Order summary");
		for(int i=0;i<index;i++)
			System.out.println(os[i]);
	}
	
	private static void dishMenu() {
		System.out.println();
		System.out.println("1.Dish1 - $10");
		System.out.println("2.Dish2 - $15");
		System.out.println("3.Dish3 - $20");
		System.out.println("4.Dish4 - $5");
	}
	
	public static void main(String[] args) {
		do {
			Program.takeOrder();
			System.out.println();
			System.out.print("Would you like to place another order? (Y/N) : ");
			sc.nextLine();
		}while(sc.nextLine().equals("Y"));
		Program.printSummary();
	}
}
