package com.assignment.third;

import java.util.Scanner;

import com.assignment.build.Flight;

public class Airport {
	private static Scanner sc=new Scanner(System.in);
	
	private Flight[] arr=new Flight[] {
			new Flight("Air India", 15),
			new Flight("Air BNB", 10),
			new Flight("Vistara", 20),
			new Flight("Indigo", 25),
			new Flight("Singapore Airlines", 5)
	};

	public void flightAvailability() {
		System.out.println();
		for(Flight f: this.arr) 
			System.out.println(f);
		System.out.println();
	}

	public boolean reserveSeat(String flightName, User u) {
		for(Flight f : arr) {
			if(f.getFlightName().equals(flightName) && f.getAvailability()>0) {
				f.setAvailability(f.getAvailability()-1);
				u.setReservation(f.getFlightName());
				return true;
			}
		}
		return false;
	}

	public void cancelReservation(String flightName, User u) {
		for(Flight f:arr) {
			if(f.getFlightName().equals(flightName) && f.getAvailability()<f.getTotalCapacity()) {
				f.setAvailability(f.getAvailability()+1);
				u.removeReservation(f.getFlightName());
			}
		}
		
	}
}
