package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.pss.entity.AirlineInfo;
import com.cts.pss.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer>{
  
}
