package com.assignment.build;

public class Library {
	private Librarian l=new Librarian();
	private int index;
	private Book[] b=new Book[10];
	
	public void addNewBook(Book book) {
		this.b[this.index]=book;
		this.index++;
	}
	
	public void addBook(String bookName) {
		for(int i=0;i<this.index;i++) {
			if(this.b[i] !=null && this.b[i].getbName().equals(bookName))
				this.b[i].setNumberOfBooks(b[i].getNumberOfBooks() + 1);
		}	
	}
	
	public void removeBook(String bookName) {
		for(int i=0;i<this.index;i++) {
			if(this.b[i] != null && this.b[i].getbName().equals(bookName)) {
				this.b[i].setNumberOfBooks(this.b[i].getNumberOfBooks()-1);
				if(this.b[i].getNumberOfBooks()==0) 
					this.b[i]=null;
			}
		}
	}
	
	public Book findBook(String bookName) {
		for(int i=0;i<this.index;i++) {
			if(this.b[i] != null && this.b[i].getbName().equals(bookName))
				return b[i];			
		}
		return null;
	}
	
	public int findTotalBooks(String bookName) {
		for(int i=0;i<this.index;i++) {
			if(this.b[i] != null && this.b[i].getbName().equals(bookName))
				return this.b[i].getNumberOfBooks();
		}
		return 0;
	}
	
	public Librarian getL() {
		return l;
	}

	public void setL(Librarian l) {
		this.l = l;
	}

	public Book[] getB() {
		return b;
	}

	public void setB(Book[] b) {
		this.b = b;
	}

	private static Library reference;
	public static Library getInstance() {
		if(reference==null)
			reference=new Library();
		return reference;
	}
}
