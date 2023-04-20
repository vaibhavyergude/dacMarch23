package com.assignment.fourth;

import java.util.Scanner;

import com.assignment.build.Hospital;
import com.assignment.build.MedicalRecord;
import com.assignment.build.PatientRecord;

public class HospitalManager {	
	private Hospital h=Hospital.getInstance();
	
	public Hospital getH() {
		return h;
	}
	public void addPatientRecord(PatientRecord pr) {
		this.h.addPatientRecord(pr);
	}
	public void addMedicalRecord(String patientName, MedicalRecord m) {
		this.h.addMedicalRecord(patientName,m);
	}
	public PatientRecord getPatientRecord(String patientName) {
		return this.h.getPatientRecord(patientName);
	}
	public MedicalRecord[] getMedicalRecord(String patientName) {
		return this.h.getMedicalRecord(patientName);
	}
	private static HospitalManager reference;
	public static HospitalManager getInstance() {
		if(reference==null)
			reference=new HospitalManager();
		return reference;
	}
}
