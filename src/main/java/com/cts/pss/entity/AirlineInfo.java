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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
public class AirlineInfo {
	
	@Id
	@GeneratedValue
	private int airlineId;
	
	
	private String airlineLogo;
	
	private String nameOfAirline;
	
	


	public AirlineInfo() {
		
	}
    
	
	public AirlineInfo(int airlineId, String airlineLogo, String nameOfAirline) {
		super();
		this.airlineId = airlineId;
		this.airlineLogo = airlineLogo;
		this.nameOfAirline = nameOfAirline;
	}


	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}

	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}

	public String getNameOfAirline() {
		return nameOfAirline;
	}

	public void setNameOfAirline(String nameOfAirline) {
		this.nameOfAirline = nameOfAirline;
	}

	

	@Override
	public String toString() {
		return "AirlineInfo [airlineId=" + airlineId + ", airlineLogo=" + airlineLogo + ", nameOfAirline="
				+ nameOfAirline + "]";
	}

    

	

}
