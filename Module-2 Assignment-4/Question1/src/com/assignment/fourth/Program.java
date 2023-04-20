package com.assignment.fourth;

import com.assignment.build.Hospital;

public class Program {

	public static void main(String[] args) {
		int choice;
		HospitalManagerTest h=new HospitalManagerTest();
		while((choice=HospitalManagerTest.MenuList()) != 0) {
			switch(choice) {
			case 1:
				h.addPatientRecord();
				break;
			case 2:
				h.addMedicalRecord();
				break;
			case 3:
				h.printPatientRecord();
				break;
			case 4:
				h.printMedicalRecords();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
