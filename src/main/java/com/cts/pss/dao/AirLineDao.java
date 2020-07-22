package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.pss.entity.AirlineInfo;


public interface AirLineDao extends JpaRepository<AirlineInfo, Integer>{
    @Query(value = "select * From airline_info f where f.name_of_airline=?1",nativeQuery = true)
	AirlineInfo findByName(String name);
}
