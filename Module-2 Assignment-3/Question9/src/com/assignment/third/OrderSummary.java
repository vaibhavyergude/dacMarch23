package com.assignment.third;

public class OrderSummary {
	private Dish d;
	private int quantity;
	private int cost;
	public OrderSummary(Dish d, int quantity, int cost) {
		this.d = d;
		this.quantity = quantity;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return String.format("%-10s%-5d%-5d", this.d, this.quantity, this.cost);
	}
}
