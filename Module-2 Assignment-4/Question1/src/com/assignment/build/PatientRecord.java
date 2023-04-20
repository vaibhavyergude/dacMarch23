package com.assignment.build;

import java.util.Scanner;

public class PatientRecord {
	private Patient p;
	private MedicalRecord[] arr=new MedicalRecord[5];
	private int index;
	public Patient getP() {
		return p;
	}
	public void setP(Patient p) {
		this.p = p;
	}
	public MedicalRecord[] getArr() {
		return arr;
	}
	public void setArr(MedicalRecord[] arr) {
		this.arr = arr;
	}
	public void addMedicalRecord(MedicalRecord m) {
		this.arr[this.index]=m;
		this.index++;
	}
}
