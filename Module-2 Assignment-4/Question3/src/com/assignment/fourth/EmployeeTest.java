package com.assignment.fourth;

import java.util.Scanner;

import com.assignment.build.Employee;
import com.assignment.build.EmployeeFactory;
import com.assignment.build.EmployeeType;
import com.assignment.build.FullTimeEmployee;
import com.assignment.build.PartTimeEmployee;

public class EmployeeTest {
	private static Scanner sc=new Scanner(System.in);
	private int index;
	private Employee[] emp=new Employee[5];
	
	public void createEmployee() {
		EmployeeType choice=EmployeeTest.employeeMenu();
		if(this.index < this.emp.length) {
			this.emp[this.index] = EmployeeFactory.getInstance(choice);
			EmployeeTest.acceptRecord(this.emp[this.index]);
			this.index++;			
		}
		else
			System.out.println("No vacancy");
	}
	private static void acceptRecord(Employee employee) {
		if(employee != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter name : ");
			employee.seteName(sc.nextLine());
			System.out.print("Enter empID : ");
			employee.seteID(sc.nextInt());
			
			if(employee instanceof FullTimeEmployee) {
				FullTimeEmployee fte=(FullTimeEmployee) employee;
				System.out.print("Enter salary : ");
				double salary=sc.nextDouble();
				employee.seteSalary(salary);
				fte.setBonus(salary);
			}
			else {
				PartTimeEmployee pte=(PartTimeEmployee) employee;
				System.out.print("Enter hours worked : ");
				pte.setHoursWorked(sc.nextInt());
				System.out.print("Enter hourly rate : ");
				pte.setHourlyRate(sc.nextDouble());
			}
			employee.calculatePay();
		}	
	}
	
	public void printPayroll() {
		boolean flag=false;
		for(int i=0;i<this.index;i++) {
			if(this.emp[i] != null) {
				System.out.println(this.emp[i]);
				flag=true;
			}	
		}
		if(flag==false)
			System.out.println("NO employees present");
	}
	
	public void totalPay() {
		boolean flag=false;
		double payRoll=0;
		for(Employee e : emp) {
			if(e != null) {
				payRoll += e.geteSalary();
				flag=true;
			}
		}
		System.out.println("Total pay : "+payRoll);
		if(flag==false)
			System.out.println("No employees present");
	}
	
	private static EmployeeType employeeMenu() {
		System.out.println();
		System.out.println("0.Full time employee");
		System.out.println("1.Part time employee");
		System.out.print("Enter choice : ");
		return EmployeeType.values()[sc.nextInt()];
	}
	
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add new Employee");
		System.out.println("2.Print pay roll");
		System.out.println("3.Total pay roll");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	
	

	
}
