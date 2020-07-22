package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Inventory;

public interface BookingRecordDao extends JpaRepository<BookingRecord, Integer>{
	

}
