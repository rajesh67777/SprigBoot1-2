package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue
	private int invId;
	private int count;

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(int count) {
		super();
		this.count = count;
	}

	public int getInId() {
		return invId;
	}

	public void setInId(int inId) {
		this.invId = inId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Inventory [invId=" + invId + ", count=" + count + "]";
	}

	

	
}
