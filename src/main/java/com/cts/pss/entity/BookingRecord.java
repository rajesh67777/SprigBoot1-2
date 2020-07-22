package com.cts.pss.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="booking_record")
public class BookingRecord {
	
	@Id
	@GeneratedValue
	private int bookingId;
	
	private LocalDate bookingDate;
	
	private String destination;
	
	private double fare;
	
	private LocalDate flightDate;
	
	private String flightNumber;
	
	private LocalTime flightTime;
	
	private String Origin;
	
	private String status;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
	@JoinTable(name="booking_details",joinColumns= { @JoinColumn(name="booking_id")},
	inverseJoinColumns= {@JoinColumn(name="passenger_id")})
	@JoinColumn(name="passenger_id")
	private List<Passenger> passengers=new ArrayList<>();
	
	public BookingRecord() {
		
	}

	public BookingRecord(LocalDate bookingDate, String destination, double fare, LocalDate flightDate, String flightNumber,
			LocalTime flightTime, String origin, String status) {
		super();
		this.bookingDate = bookingDate;
		this.destination = destination;
		this.fare = fare;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		Origin = origin;
		this.status = status;
		
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passenger) {
		this.passengers = passenger;
	}

	
	
   
    
	
}
