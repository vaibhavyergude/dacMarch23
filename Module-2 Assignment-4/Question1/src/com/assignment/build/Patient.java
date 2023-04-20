package com.assignment.build;

public class Patient {
	private String pName;
	private int pAge;
	private String pGender;
	private String pAddress;
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	@Override
	public String toString() {
		return "Patient Name : "+this.pName+"	Patient Age : "+this.pAge+" 	Patient Gender : "+this.pGender+"	Patient Address : "+this.pGender; 
	}
}
