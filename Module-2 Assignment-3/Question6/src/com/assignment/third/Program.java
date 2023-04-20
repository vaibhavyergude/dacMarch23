package com.assignment.third;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add new employee");
		System.out.println("2.Update sales for existing employee");
		System.out.println("3.View total sales for a salesperson");
		System.out.println("4.View total sales for all salesperson");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		Company c=new Company();
		while((choice=Program.menuList()) !=0) {
			switch(choice) {
			case 1:
				c.addNewEmployee();
				break;
			case 2:
				System.out.println();
				System.out.print("Enter ID : ");
				c.updateEmployee(sc.nextInt());
				break;
			case 3:
				System.out.println();
				System.out.print("Enter ID : ");
				c.employeeSales(sc.nextInt());
				break;
			case 4:
				c.allSales();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

	

}
