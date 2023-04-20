package com.assignment.build;

public class Shelf {
	private int shelfNumber;
	private String shelfContent;
	public Shelf(int shelfNumber, String shelfContent) {
		this.shelfNumber = shelfNumber;
		this.shelfContent = shelfContent;
	}
	public int getShelfNumber() {
		return shelfNumber;
	}
	public void setShelfNumber(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	public String getShelfContent() {
		return shelfContent;
	}
	public void setShelfContent(String shelfContent) {
		this.shelfContent = shelfContent;
	}
}
