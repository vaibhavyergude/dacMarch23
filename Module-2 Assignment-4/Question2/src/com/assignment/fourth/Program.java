package com.assignment.fourth;

public class Program {

	public static void main(String[] args) {
		int choice;
		LibraryManagement l=new LibraryManagement();
		while((choice = LibraryManagement.menuList()) != 0) {
			switch(choice) {
			case 1:
				l.addBook();
				break;
			case 2:
				l.removeBook();
				break;
			case 3:
				l.findABook();
				break;
			case 4:
				l.findTotalBooks();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
