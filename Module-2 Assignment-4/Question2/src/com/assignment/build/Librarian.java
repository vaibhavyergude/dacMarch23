package com.assignment.build;

public class Librarian {
	private String lname;
	private long lContactDetails;
	public Librarian() {
		this.lname="Linux";
		this.lContactDetails=4587596321L;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getlContactDetails() {
		return lContactDetails;
	}
	public void setlContactDetails(long lContactDetails) {
		this.lContactDetails = lContactDetails;
	}
}
