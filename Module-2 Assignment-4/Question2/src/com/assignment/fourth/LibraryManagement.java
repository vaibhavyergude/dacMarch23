package com.assignment.fourth;

import java.util.Scanner;
import com.assignment.build.Book;
import com.assignment.build.Library;

public class LibraryManagement {
	private static Scanner sc=new Scanner(System.in);
	private Library l=Library.getInstance();
	
	public void addBook() {
		sc.nextLine();
		System.out.println();
		System.out.print("Enter book name : ");
		String bookName=sc.nextLine();
		boolean flag=false;
		if( this.l != null && this.l.getB() != null ) {
			for(int i=0;i<this.l.getB().length;i++) {
				if(this.l.getB()[i] != null && this.l.getB()[i].getbName().equals(bookName)) {
					l.addBook(bookName);
					flag=true;
				}
			}
		}
		if(flag==false) {
			Book b=new Book();
			LibraryManagement.acceptRecord(b, bookName);
			
			l.addNewBook(b);
		}		
	}
	
	public void removeBook() {
		sc.nextLine();
		System.out.println();
		System.out.print("Enter book name : ");
		String bookName=sc.nextLine();
		
		l.removeBook(bookName);		
	}
	
	public void findABook() {
		sc.nextLine();
		System.out.println();
		System.out.print("Enter bookName : ");
		String bookName=sc.nextLine();
		
		Book b=l.findBook(bookName);
		if(b != null)
			System.out.println(b);
		else
			System.out.println("Book not present");
	}
	
	public void findTotalBooks() {
		sc.nextLine();
		System.out.println();
		System.out.print("Enter book name : ");
		String bookName=sc.nextLine();
		
		int bookNumber=l.findTotalBooks(bookName);
		if(bookNumber != 0)
			System.out.println("Number of books : "+bookNumber);
		else
			System.out.println("Book not present");
	}
	
	private static void acceptRecord(Book b, String bookName) {
		b.setbName(bookName);
		System.out.print("Enter author name : ");
		b.setbAuthor(sc.nextLine());
		System.out.print("Enter ISBN : ");
		b.setbISBN(sc.nextInt());
		System.out.print("Enter publisher : ");
		sc.nextLine();
		b.setbPublisher(sc.nextLine());
	}
	
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add a book");
		System.out.println("2.Remove a book");
		System.out.println("3.Find a book");
		System.out.println("4.Find total number of books");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}	
}
