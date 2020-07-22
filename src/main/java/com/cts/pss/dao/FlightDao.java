package com.cts.pss.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cts.pss.entity.AirlineInfo;
import com.cts.pss.entity.Flight;

@Transactional
public interface FlightDao extends JpaRepository<Flight, Integer>{
	
    @Query(value = "select * From Flight f where f.flight_infoid in (select flight_infoid from flights_info where airline_id in (select airline_id from airline_info where name_of_airline=?1)) and Date(f.flight_date)=?2",nativeQuery = true)
    List<Flight> FindByDate( String airlineName, Date d1);
	
	@Query(value = "select * From Flight f where f.origin =?1 and Date (f.flight_date)=?2",nativeQuery = true)
	List<Flight> findByLocation(String origin, Date date);
	
	@Query(value = "select * From Flight f join Fare fa on f.fare_id = fa.fare_id where f.origin =?1 and f.destination=?2 and Date (f.flight_date)=?3 ORDER BY fa.fare",nativeQuery = true)
	List<Flight> searchByLocation(String origin,String destination, Date date);
	
	@Query(value = "select * From Flight f where f.flight_number=?1 and f.destination=?2 and f.origin =?3",nativeQuery = true)
	List<Flight> searchFlightWithFlightNumber(String FlightNumber,String destination,String origin);
	

	@Query(value = "select * From Flight f where f.flight_number=?1 and Date (f.flight_date)=?2 and Time (f.flight_time) =?3",nativeQuery = true)
	List<Flight> 	searchFlightWithTime(String FlightNumber,Date date ,String time);
	
	@Query(value = "select * From Flight f where f.flight_number=?1",nativeQuery = true)
	Flight findByFlightNumber(String FlightNumber);
	
	@Modifying
	@Query(value = "update Flight f set f.flight_date = ?1, f.flight_time=?2 where f.flight_number=?3",nativeQuery = true)
	void UpdateFlightNumber(LocalDate date, LocalTime time, String name);
    
	@Query(value = "select * From Flight f where f.origin=?1 and f.destination=?2 and Date (f.flight_date) =?3",nativeQuery = true)
	Flight findByFlightDate(String origin,String destination,Date date);
}
