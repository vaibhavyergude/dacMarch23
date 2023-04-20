package com.assignment.third;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static int[][] getArray() {
		System.out.println();
		System.out.print("Enter row of matrix : ");
		int row=sc.nextInt();
		System.out.print("Enter col of matrix : ");
		int col=sc.nextInt();
		return new int[row][col];
	}
	private static void acceptRecord(int[][] arr) {
		System.out.print("Enter elements : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				arr[i][j]=sc.nextInt();
		}
	}
	private static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Addition of matrices");
		System.out.println("2.Subtraction of matrices");
		System.out.println("3.Multiplication of matrices");
		System.out.println("4.Transpose of matrix");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		
		Operations op=new Operations();
		while((choice=Program.menuList()) !=0) {
			switch(choice) {
			case 1:
				int[][] arr1=Program.getArray();
				Program.acceptRecord(arr1);
				int[][] arr2=Program.getArray();
				Program.acceptRecord(arr2);
				op.addMatrix(arr1,arr2);
				break;
			case 2:
				int[][] arr3=Program.getArray();
				Program.acceptRecord(arr3);
				int[][] arr4=Program.getArray();
				Program.acceptRecord(arr4);
				op.subtractMatrix(arr3,arr4);
				break;
			case 3:
				int[][] arr5=Program.getArray();
				Program.acceptRecord(arr5);
				int[][] arr6=Program.getArray();
				Program.acceptRecord(arr6);
				op.multiplyMatrix(arr5,arr6);
				break;
			case 4:
				int[][] arr7=Program.getArray();
				Program.acceptRecord(arr7);
				op.transposeMatrix(arr7);
				break;
			}
		}
	}
	
	

	

}
