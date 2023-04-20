package com.assignment.third;

import java.util.Scanner;

import com.assignment.build.Shelf;

public class Inventory {
	private static Scanner sc=new Scanner(System.in);
	private Shelf[] arr=new Shelf[10];

	public void addShelf() {
		System.out.println();
		sc.nextLine();
		System.out.print("Please enter the name of the item : ");
		String str=sc.nextLine();
		System.out.print("Please enter the shelf number (1-10) : ");
		int number=sc.nextInt();
		if(number>0 && number<=10)
			arr[number-1]=new Shelf(number,str); 
		else 
			System.out.println("Invalid shelf number");
		System.out.println("Item"+ str +" added to shelf "+ number);
	}

	public void removeShelf() {
		System.out.println();
		System.out.print("Please enter the shelf number (1-10) : ");
		int number=sc.nextInt();
		if(arr[number-1] !=null) {
			arr[number-1]=null;
			System.out.println("Item removed from shelf "+ number);
		}
		else
			System.out.println("No item present");
	}

	public void displayContent() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null)
				System.out.println("Shelf "+arr[i].getShelfNumber()+" : "+ arr[i].getShelfContent());
			else
				System.out.println("Shelf "+(i+1)+" : [Empty]");
		}
	}
	
}
