package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private int passengerId;
	
	private String emailAddress;
	
	private String firstName;
	
	private String gender;
	
	private String lastName;
	
	private long mobileNumber;

	public Passenger() {
		
	}
	
	public Passenger(String emailAddress, String firstName, String gender, String lastName, long mobileNumber) {
		super();
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", emailAddress=" + emailAddress + ", firstName=" + firstName
				+ ", gender=" + gender + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
    
	
}
