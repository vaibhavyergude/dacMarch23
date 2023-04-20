package com.assignment.fourth;

public class Program {
	
	public static void main(String[] args) {
		int choice;
		EmployeeTest test=new EmployeeTest();
		while((choice=EmployeeTest.menuList()) != 0) {
			switch(choice) {
			case 1:
				test.createEmployee();
				break;
			case 2:
				test.printPayroll();
				break;
			case 3:
				test.totalPay();
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}

	

}
