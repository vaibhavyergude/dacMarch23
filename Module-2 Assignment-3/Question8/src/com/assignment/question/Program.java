package com.assignment.question;

import java.util.Scanner;

enum DayOfWeek{
	SUN(1, "Sunday"), MON(2, "Monday"), TUES(3, "Tuesday"), WED(4, "Wednesday"), THURS(5, "Thursday"), FRI(6, "Friday"), SAT(7, "Saturday");
	private int dayNumber;
	private String dayName;
	private DayOfWeek(int dayNumber, String dayName) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public String getDayName() {
		return dayName;
	}
}
public class Program {
	private static Scanner sc=new Scanner(System.in);
	private static void printDay() {
		System.out.println("Choose day : ");
		DayOfWeek d=Program.menuList();
		System.out.println(d.getDayName());
		System.out.println();
	}
	private static void getNextDay() {
		System.out.println("Choose day");
		DayOfWeek d=Program.menuList();
		int index=d.ordinal();
		DayOfWeek[] day=DayOfWeek.values();
		System.out.println(day[(index+1)%7].getDayName());
		System.out.println();
	}
	private static void getDayNumber() {
		System.out.println("Choose day");
		DayOfWeek d=Program.menuList();
		System.out.println(d.getDayNumber());
		System.out.println();
	}
	private static void getWeekendDays() {
		DayOfWeek[] d= {DayOfWeek.SUN,DayOfWeek.SAT};
		for(DayOfWeek day : d)
			System.out.print(day.getDayName() + "	");
		System.out.println();
		System.out.println();
	}
	public static DayOfWeek menuList() {
		System.out.println("1.SUN");
		System.out.println("2.MON");
		System.out.println("3.TUES");
		System.out.println("4.WED");
		System.out.println("5.THURS");
		System.out.println("6.FRI");
		System.out.println("7.SAT");
		System.out.print("Enter choice : ");
		return DayOfWeek.values()[sc.nextInt()-1];
	}
	private static int menu() {
		System.out.println("0.Exit");
		System.out.println("1.Print Day");
		System.out.println("2.Print next day");
		System.out.println("3.Print day number");
		System.out.println("4.Get weekend days");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while((choice = Program.menu()) != 0) {
			switch(choice) {
			case 1:
				Program.printDay();
				break;
			case 2:
				Program.getNextDay();
				break;
			case 3:
				Program.getDayNumber();
				break;
			case 4:
				Program.getWeekendDays();
				break;
			default: System.out.println("Invalid choice");
			}
		}	
	}	
}
