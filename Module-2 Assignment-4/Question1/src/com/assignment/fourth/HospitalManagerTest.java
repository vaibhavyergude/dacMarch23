package com.assignment.fourth;

import java.util.Scanner;

import com.assignment.build.MedicalRecord;
import com.assignment.build.Patient;
import com.assignment.build.PatientRecord;

public class HospitalManagerTest {
	private static Scanner sc=new Scanner(System.in);
	private HospitalManager m=HospitalManager.getInstance();
	public void addPatientRecord() {
		Patient p=new Patient();
		HospitalManagerTest.acceptRecord(p);
		
		MedicalRecord m=new MedicalRecord();
		HospitalManagerTest.acceptRecord(m);
		
		PatientRecord pr=new PatientRecord();
		pr.setP(p);
		pr.addMedicalRecord(m);
		this.m.addPatientRecord(pr);
	}
	
	public void addMedicalRecord() {
		System.out.println();
		sc.nextLine();
		System.out.print("Enter patient name : ");
		String patientName=sc.nextLine();
		
		MedicalRecord m=new MedicalRecord();
		HospitalManagerTest.acceptRecord(m);
		this.m.addMedicalRecord(patientName,m);	
	}
	
	public void printPatientRecord() {
		System.out.println();
		sc.nextLine();
		System.out.print("Enter patient name : ");
		String patientName=sc.nextLine();
		
		PatientRecord pr=this.m.getPatientRecord(patientName);
		if(pr !=null ) {
			System.out.println(pr.getP());
			MedicalRecord[] mr=pr.getArr();
			for(MedicalRecord i : mr) {
				if(i!=null)
					System.out.println(i);
			}
		}
		else
			System.out.println("No such patient");
	}
	public void printMedicalRecords() {
		System.out.println();
		sc.nextLine();
		System.out.print("Enter patient name : ");
		String patientName=sc.nextLine();
		
		MedicalRecord[] mr=this.m.getMedicalRecord(patientName);
		if(mr!=null) {
			for(MedicalRecord i : mr) {
				if(i !=null )
					System.out.println(i);
			}
		}
		else
			System.out.println("No such patient");
	}
	private static void acceptRecord(Patient p) {
		System.out.println();
		sc.nextLine();
		System.out.print("Enter patient name : ");
		p.setpName(sc.nextLine());
		System.out.print("Enter patient's age : ");
		p.setpAge(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter gender (Male/Female): ");
		p.setpGender(sc.nextLine());
		System.out.print("Enter address : ");
		p.setpAddress(sc.nextLine());
	}
	
	private static void acceptRecord(MedicalRecord m) {
		System.out.println();
		System.out.print("Enter doctor's name : ");
		m.setDoctorName(sc.nextLine());
		System.out.print("Enter diagnosis : ");
		m.setDiagnosis(sc.nextLine());
		System.out.print("Enter treatment : ");
		m.setTreatment(sc.nextLine());
	}
	public static int MenuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add patient record");
		System.out.println("2.Add medical record");
		System.out.println("3.Print patient record");
		System.out.println("4.Print patient medical records");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
}
