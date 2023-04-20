package com.assignment.build;

public class Hospital {
	private PatientRecord[] arr=new PatientRecord[10];
	private int index;
	
	public void addPatientRecord(PatientRecord pr) {
		this.arr[this.index]= pr;
		this.index++;
	}
	public void addMedicalRecord(String patientName, MedicalRecord m) {
		boolean flag=false;
		for(int i=0;i<this.index;i++) {
			if(this.arr[i] != null && this.arr[i].getP() !=null) {
				if(this.arr[i].getP().getpName().equals(patientName)) {
					this.arr[i].addMedicalRecord(m);
					flag=true;
				}
			}
		}
		if(flag==false)
			System.out.println("No such patient");
	}
	public PatientRecord getPatientRecord(String patientName) {
		for(int i=0;i<this.index;i++) {
			if(this.arr[i] !=null && this.arr[i].getP() !=null) {
				if(this.arr[i].getP().getpName().equals(patientName))
					return this.arr[i];
			}
		}
		return null;
	}
	public MedicalRecord[] getMedicalRecord(String patientName) {
		for(int i=0;i<this.index;i++) {
			if(this.arr[i] !=null && this.arr[i].getP()!=null) {
				if(this.arr[i].getP().getpName().equals(patientName))
					return this.arr[i].getArr();
			}
		}
		return null;
	}
	private static Hospital reference;
	public static Hospital getInstance() {
		if(reference==null)
			reference=new Hospital();
		return reference;
	}
	public int getIndex() {
		return index;
	}
	public PatientRecord[] getArr() {
		return arr;
	}
}