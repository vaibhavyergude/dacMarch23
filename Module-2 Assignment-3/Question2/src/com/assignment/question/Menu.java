package com.assignment.question;

import com.assignment.build.Dishes;

public class Menu {
	private int index;
	private Dishes[] dish;
	public Menu() {
		dish=new Dishes[10];
	}
	public void addNewDish(Dishes d) {
		if(this.index < this.dish.length) {
			this.dish[index]=d;
			this.dish[index].setDishIndex(index+1);
			index++;
			this.printMenu();
		}
		else System.out.println("Menu is full");
	}
	 public void removeDish(int index) {
		for(int i=0;i<this.dish.length;i++) {
			if(this.dish[index-1] != null && this.dish[index-1].getDishIndex()==index) {
				this.dish[index-1]=null;
			}
		}
		this.printMenu();
	}
	public void modifyPrice(int index, float price) {
		for(int i=0;i<this.dish.length;i++) {
			if(this.dish[index-1] != null && this.dish[index-1].getDishIndex()==index) {
				this.dish[index-1].setDishPrice(price);
			}
		}
		this.printMenu();
	}
	public void printMenu() {
		boolean flag=false;
		for(Dishes d: this.dish) {
			if(d !=null) {
				System.out.println(d);
				flag=true;
			}
		}
		if(flag==false) System.out.println("Menu is empty");
	}		
}
