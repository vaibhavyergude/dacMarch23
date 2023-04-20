package com.assignment.build;

public class ReferenceBook extends Book{
	private int edition;
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public void calculatePrice() {
		super.calculatePrice();
		if(this.edition < 5)
			this.price=this.getPrice()*0.8;	
	}
}
