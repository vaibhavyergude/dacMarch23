package com.assignment.third;

import java.util.Scanner;

import com.assignment.build.Salesperson;

public class Company {
	private static Scanner sc=new Scanner(System.in);
	private int index;
	private Salesperson[] arr=new Salesperson[5];

	public void addNewEmployee() {
		System.out.println();
		sc.nextLine();
		System.out.print("Enter name : ");
		String name=sc.nextLine();
		
		System.out.print("Enter ID : ");
		int ID=sc.nextInt();
		
		System.out.print("Enter sales figures for the past 12 months : ");
		int[] temp=new int[12];
		for(int i=0;i<temp.length;i++)
			temp[i]=sc.nextInt();
		
		this.arr[this.index]=new Salesperson(name, ID, temp);
		this.index++;
	}

	public void updateEmployee(int ID) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null && arr[i].getEmpId()==ID) {
				System.out.print("Enter sales figures for the past 12 months : ");
				int[] temp=new int[12];
				for(int j=0;j<temp.length;j++)
					temp[j]=sc.nextInt();
				this.arr[i].setSalesFigure(temp);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Employee not found");
		else
			System.out.println("Sales updated");
	}

	public void employeeSales(int ID) {
		boolean flag=false;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null && arr[i].getEmpId()==ID) {
				int[] temp=arr[i].getSalesFigure();
				for(int j=0; j<temp.length; j++)
					sum+=temp[j];
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Employee not found");
		else
			System.out.println("Sales : "+sum);
	}

	public void allSales() {
		System.out.println();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			if(arr[i] != null) {
				int[] temp=arr[i].getSalesFigure();
				for(int j=0; j<temp.length; j++)
					sum+=temp[j];
				flag=true;
				System.out.println("Total Sales of " + this.arr[i].getEmpName() +" : "+sum);
			}
		}
		if(flag==false)
			System.out.println("Enter employee first");
	}
}
