package com.assignment.build;

public class FullTimeEmployee extends Employee {
	private double bonus;

	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double salary) {
		this.bonus = salary*0.1;
	}
	public void calculatePay() {
		this.eSalary= this.eSalary + this.bonus;
	}
}
