package com.assignment.build;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public void calculatePay() {
		if(this.hoursWorked>40)
			this.eSalary=this.hoursWorked*this.hourlyRate*1.2;
		else
			this.eSalary=this.hoursWorked*this.hourlyRate;
	}
}
