package com.assignment.third;

public class User {
	private String[] reservation=new String[10];
	private int index;
	private String userName;
	private String userEmail;
	private long userContact;
	
	public User() {

	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	
	}
	public void setReservation(String flightName) {
		if(this.index < reservation.length) {
			reservation[this.index]=flightName;
			this.index++;
		}
	}
	public void viewReservation() {
		for(int i=0;i<index;i++)
			System.out.println(reservation[i]);
		System.out.println();
	}
	public void removeReservation(String flightName) {
		for(int i=0;i<this.index;i++) {
			if(reservation[i].equals(flightName)) 
				reservation[i]=" ";
		}
		System.out.println();
		
	}
	
}
