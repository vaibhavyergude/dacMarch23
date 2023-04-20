package com.assignment.third;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);
	public static void acceptRecord(int[] arr) {
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
	}
	public static void displayRecord(int[] arr) {
		for(int element : arr) System.out.print(element + " ");
		System.out.println();
	}
	public static void arraySum(int[] arr) {
		System.out.println("Sum of array : "+ Program.calcSum(arr));
	}
	public static int calcSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void arrayAverage(int[] arr) {
		System.out.println("Average of array : "+ (Program.calcSum(arr)/arr.length));
	}
	public static void largestElement(int[] arr) {
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > largest) largest=arr[i];
		}
		System.out.println("Largest element : "+ largest);
	}
	public static void smallestElement(int[] arr) {
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < smallest) smallest=arr[i];
		}
		System.out.println("Largest element : "+ smallest);
	}
	public static void arraySort(int[] arr) {
		Arrays.sort(arr);
		System.out.print("Sorted array : ");
		for(int i:arr) System.out.print(i + " ");
	}
	public static void main(String[] args) {
		System.out.print("Enter no of elements : ");
		int[] arr=new int[sc.nextInt()];
		Program.acceptRecord(arr);
		Program.displayRecord(arr);
		Program.arraySum(arr);
		Program.arrayAverage(arr);
		Program.largestElement(arr);
		Program.smallestElement(arr);
		Program.arraySort(arr);
	}

}
