package com.assignment.third;

import java.util.Scanner;

public class Theatre {
	private static Scanner sc=new Scanner(System.in);
	private static int seatsSold=0;
	private int uniqueNumber=45896;
	private int price=100;
	private static int revenue=0;
	private boolean[][] arr=new boolean[5][5];
	
	public static int getSeatsSold() {
		return seatsSold;
	}

	public static int getRevenue() {
		return revenue;
	}
	public void displaySeats() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==false)
					System.out.print("["+i+"]["+j+"]=A"+"	");	
				else
					System.out.print("["+i+"]["+j+"]=N"+"	");
			}
			System.out.println();
		}
	}
	
	public void reserveSeats() {
		System.out.println();
		System.out.print("No of Seats : ");
		int n=sc.nextInt();
		while(n>0) {
			boolean flag=this.bookTicket();
			if(flag==true)
				n--;
		}
		System.out.println("Reservation number : "+this.uniqueNumber);
		System.out.println();
		this.uniqueNumber+=3;
	}

	private boolean bookTicket() {
		System.out.println();
		System.out.print("Enter row : ");
		int i=sc.nextInt();
		System.out.print("Enter column : ");
		int j=sc.nextInt();
		if(i>=0 && i<this.arr.length && j>=0 && j<this.arr[0].length) {
			if(this.arr[i][j]==false) {
				this.arr[i][j]=true;
				Theatre.seatsSold++;
				Theatre.revenue+=this.price;
				return true;
			}
			else {
				System.out.println("Seat not available");
				return false;
			}	
		}
		else {
			System.out.println("Invalid input");
			return false;
		}	
	}

	public void availableSeats() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==false)
					System.out.print("["+i+"]["+j+"]" + "	");
				else
					System.out.print("[ ][ ]" + "	");
			}
			System.out.println();
		}
		
	}
	public void ticketSales() {
		System.out.println("Number of seats sold : "+Theatre.getSeatsSold());
		System.out.println("Revenue generated : "+ Theatre.getRevenue());
	}
}
