package com.assignment.build;

public class Salesperson {
	private String empName;
	private int empId;
	private int[] salesFigure=new int[12];
	
	public Salesperson(String empName, int empId, int[] salesFigure) {
		this.empName = empName;
		this.empId = empId;
		this.salesFigure = salesFigure;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public int[] getSalesFigure() {
		return salesFigure;
	}
	public void setSalesFigure(int[] salesFigure) {
		this.salesFigure = salesFigure;
	}
	
}
