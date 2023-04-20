package com.assignment.build;

public class Employee {
	private String eName;
	private int eID;
	protected double eSalary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public void calculatePay() {
		
	}
	@Override
	public String toString() {
		return "Name : "+this.geteName()+"	ID : "+this.geteID()+"	Pay : "+this.geteSalary();
	}
}
