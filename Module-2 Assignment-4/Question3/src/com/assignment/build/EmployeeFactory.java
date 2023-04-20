package com.assignment.build;

public class EmployeeFactory {
	private EmployeeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static Employee getInstance(EmployeeType choice) {
		switch(choice) {
		case FULL_TIME : return new FullTimeEmployee();
		case PART_TIME : return new PartTimeEmployee();
		}
		return null;
	}
	
}
