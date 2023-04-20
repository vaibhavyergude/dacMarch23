package com.assignment.build;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MedicalRecord {
	private Date d=new Date();
	private String doctorName;
	private String diagnosis;
	private String treatment;

	public MedicalRecord() {
		this.d=new Date();
	}
	
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		String str=new SimpleDateFormat("dd/MM/yyyy").format(d);
		return "Date : "+str+"	Doctors name : "+this.doctorName+"	Diagonis : "+this.diagnosis+"	treatment : "+this.treatment;	
	}
}
