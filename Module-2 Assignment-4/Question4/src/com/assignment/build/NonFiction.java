package com.assignment.build;

public class NonFiction extends Book{
	private String subject;
	public NonFiction() {
		// TODO Auto-generated constructor stub
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public void calculatePrice() {
		super.calculatePrice();
		if(this.subject.equals("History"))
			this.price=this.getPrice()*0.85;
	}
}
