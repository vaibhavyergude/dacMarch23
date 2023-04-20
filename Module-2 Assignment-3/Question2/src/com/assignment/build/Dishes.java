package com.assignment.build;

public class Dishes {
	private int dishIndex;
	private String dishName;
	private float dishPrice;
	
	public Dishes() {
		// TODO Auto-generated constructor stub
	}
	public Dishes(String dishName, float dishPrice) {
		this.dishName = dishName;
		this.dishPrice = dishPrice;
	}
	public int getDishIndex() {
		return dishIndex;
	}
	public void setDishIndex(int dishIndex) {
		this.dishIndex = dishIndex;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public float getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-20s%-10.2f",this.dishIndex, this.dishName, this.dishPrice);
	}
}
