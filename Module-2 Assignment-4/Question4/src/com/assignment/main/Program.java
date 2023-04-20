package com.assignment.main;

import com.assignment.test.BookTest;

public class Program {

	public static void main(String[] args) {
		int choice;
		BookTest test=new BookTest();
		while((choice = BookTest.menuList()) != 0) {
			switch(choice) {
			case 1:
				test.addNewBook();
				break;
			case 2:
				test.printBookInfo();
				break;
			case 3:
				test.printTotalPrice();
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}
}
