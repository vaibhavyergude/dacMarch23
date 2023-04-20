package com.assignment.build;

public class Flight {
	private String flightName;
	private int totalCapacity;
	private int availability;
	public Flight(String name, int capacity) {
		this.flightName=name;
		this.totalCapacity=capacity;
		this.availability=capacity;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public String getFlightName() {
		return flightName;
	}
	public int getTotalCapacity() {
		return totalCapacity;
	}
	public String toString() {
		return String.format("%-20s%-10d", this.flightName, this.availability);
	}
}
