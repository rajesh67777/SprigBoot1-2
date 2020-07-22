package com.cts.pss.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class FlightInfo {
	
	@Id
	@GeneratedValue
	private int flightInfoid;
	
	private String flightNumber;
	
	private String flightType;
	
	private int numberofSeats;
    
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinTable(name="flights_info",joinColumns= { @JoinColumn(name="flight_infoid")},
	inverseJoinColumns= {@JoinColumn(name="airlineId")})
	private AirlineInfo airlineInfo;
	
	public FlightInfo() {
		
	}
	
	

	public FlightInfo(String flightNumber, String flightType, int numberofSeats, AirlineInfo airlineInfo) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.numberofSeats = numberofSeats;
		this.airlineInfo = airlineInfo;
	}



	public int getFlightInfoid() {
		return flightInfoid;
	}

	public void setFlightInfoid(int flightInfoid) {
		this.flightInfoid = flightInfoid;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public AirlineInfo getAirlineInfo() {
		return airlineInfo;
	}

	public void setAirlineInfo(AirlineInfo airlineInfo) {
		this.airlineInfo = airlineInfo;
	}

	@Override
	public String toString() {
		return "FlightInfo [flightInfoid=" + flightInfoid + ", flightNumber=" + flightNumber + ", flightType="
				+ flightType + ", numberofSeats=" + numberofSeats + ", airlineInfo=" + airlineInfo + "]";
	}
    
	
	
	

	
	
	

}
