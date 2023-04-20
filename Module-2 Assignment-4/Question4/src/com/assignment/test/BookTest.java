package com.assignment.test;

import java.util.Scanner;
import com.assignment.build.Book;
import com.assignment.build.BookSelector;
import com.assignment.build.BookType;
import com.assignment.build.FictionBook;
import com.assignment.build.NonFiction;
import com.assignment.build.ReferenceBook;

public class BookTest {
	private static Scanner sc=new Scanner(System.in);
	private Book[] b=new Book[10];
	private int index;
	
	public void addNewBook() {
		BookType choice=BookTest.bookMenu();
		if(this.index < this.b.length) {
			this.b[this.index]=BookSelector.getInstance(choice);
			BookTest.acceptRecord(this.b[this.index]);
			this.index++;
		}
		else
			System.out.println("Cannot insert more books");
	}
	
	public void printBookInfo() {
		boolean flag=false;
		for(int i=0;i<this.index;i++) {
			if(this.b[i] != null) {
				System.out.println(this.b[i]);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No books present");
	}
	
	public void printTotalPrice() {
		double price=0;
		boolean flag=false;
		for(Book b1 : b) {
			if(b1 != null) {
				price+=b1.getPrice();
				flag=true;
			}
		}
		System.out.println("Total price : "+price);
		if(flag==false)
			System.out.println("No books present");
	}
	
	private static void acceptRecord(Book book) {
		if(book != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter title : ");
			book.setTitle(sc.nextLine());
			System.out.print("Enter author : ");
			book.setAuthor(sc.nextLine());
			System.out.print("Enter publisher : ");
			book.setPublisher(sc.nextLine());
			System.out.print("Enter number of pages : ");
			book.setNumPages(sc.nextInt());
			
			if(book instanceof FictionBook) {
				FictionBook fb=(FictionBook) book;
				sc.nextLine();
				System.out.print("Enter genre (Romance/Thriller) : ");
				fb.setGenre(sc.nextLine());
			}
			else if(book instanceof ReferenceBook) {
				ReferenceBook rb=(ReferenceBook) book;
				System.out.print("Enter edition (2/5) : ");
				rb.setEdition(sc.nextInt());
			}
			else {
				NonFiction nf=(NonFiction) book;
				sc.nextLine();
				System.out.print("Enter subject (History/Biography) : ");
				nf.setSubject(sc.nextLine());
			}
			book.calculatePrice();
		}
	}
	
	private static BookType bookMenu() {
		System.out.println();
		System.out.println("0.Fiction Book");
		System.out.println("1.Reference Book");
		System.out.println("2.Non fiction Book");
		System.out.print("Enter choice : ");
		return BookType.values()[sc.nextInt()];
	}
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add a new book");
		System.out.println("2.Get Book Info");
		System.out.println("3.Get total price of books");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	
	

	

}
