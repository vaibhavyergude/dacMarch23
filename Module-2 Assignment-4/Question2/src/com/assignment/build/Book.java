package com.assignment.build;

public class Book {
	private String bName;
	private String bAuthor;
	private int bISBN;
	private String bPublisher;
	private int numberOfBooks=1;
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbISBN() {
		return bISBN;
	}

	public void setbISBN(int bISBN) {
		this.bISBN = bISBN;
	}

	public String getbPublisher() {
		return bPublisher;
	}

	public void setbPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%-5d", this.bName, this.bAuthor, this.numberOfBooks);
	}
}
