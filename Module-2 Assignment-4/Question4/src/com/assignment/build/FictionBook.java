package com.assignment.build;

public class FictionBook extends Book{
	private String genre;
	public FictionBook() {
		// TODO Auto-generated constructor stub
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void calculatePrice() {
		super.calculatePrice();
		if(this.genre.equals("Romance"))
			this.price=this.getPrice()*0.9;
	}
}
