package com.assignment.third;

public enum Dish {
	DISH1(10),DISH2(15),DISH3(20),DISH4(5);
	private int price;
	private Dish(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
}
