package com.assignment.question;

import java.util.Scanner;

import com.assignment.build.Dishes;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static void acceptInfo(Dishes d) {
		System.out.print("Enter name of the dish : ");
		sc.nextLine();
		d.setDishName(sc.nextLine());
		System.out.print("Enter price of the dish : ");
		d.setDishPrice(sc.nextFloat());
	}
	public static int menuList() {
		System.out.println("1.View menu");
		System.out.println("2.Add new dish");
		System.out.println("3.Remove dish");
		System.out.println("4.Modify price of dish");
		System.out.println("5.Exit");
		System.out.print("Enter choice : ");
		return sc.nextInt() ;
	}
	public static void main(String[] args) {
		int choice;
		Menu m=new Menu();
		while((choice=Program.menuList()) !=5) {
			switch(choice) {
			case 1:
				m.printMenu();
				break;
			case 2:
				Dishes d=new Dishes();
				Program.acceptInfo(d);
				m.addNewDish(d);
				break;
			case 3:
				System.out.print("Enter index of dish : ");
				m.removeDish(sc.nextInt());
				break;
			case 4:
				System.out.print("Enter index of dish : ");
				int index=sc.nextInt();
				System.out.print("Enter new price : ");
				float price=sc.nextFloat();
				m.modifyPrice(index,price);
				break;
			}
		}
		System.out.println("Farewell !");
	}
	

}
