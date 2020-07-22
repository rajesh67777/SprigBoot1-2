package com.cts.pss.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cts.pss.entity.Inventory;
import com.cts.pss.entity.Passenger;

@Transactional
public interface InventoryDao extends JpaRepository<Inventory, Integer>{
	
	@Modifying
	@Query(value = "update Inventory f set f.count = ?1 where f.inv_id=?2",nativeQuery = true)
	void updateInvetoryCount(int count, int id);
}

