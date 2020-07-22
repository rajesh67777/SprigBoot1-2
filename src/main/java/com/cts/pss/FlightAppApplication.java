package com.cts.pss;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.AirLineDao;
import com.cts.pss.dao.BookingRecordDao;
import com.cts.pss.dao.FlightDao;
import com.cts.pss.dao.InventoryDao;
import com.cts.pss.dao.PassengerDao;
import com.cts.pss.entity.AirlineInfo;
import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.FlightInfo;
import com.cts.pss.entity.Inventory;
import com.cts.pss.entity.Passenger;

@SpringBootApplication
public class FlightAppApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ac= SpringApplication.run(FlightAppApplication.class, args);
		
		FlightDao dao = ac.getBean(FlightDao.class);
		InventoryDao invDao = ac.getBean(InventoryDao.class);
		BookingRecordDao booDao=ac.getBean(BookingRecordDao.class);
		//AirLineDao airDao = ac.getBean(AirLineDao.class);
		
		PassengerDao dd = ac.getBean(PassengerDao.class);
		Passenger p1= new Passenger("rajesh@gmail.com","rajesh","Male","ganne",9959);
		Passenger p2= new Passenger("ramesh@gmail.com","rajesh","Male","ganne",9949);
		
		Date d1 = new Date("2020/08/21");
		Flight fl=dao.findByFlightDate("DELHI","HYDERABAD",d1);
		
//		System.out.println("--------------- write a class to book 2 passengers Delho to hyderabad and update inventory count accordingly---------");
//		System.out.println("");
//		List<Passenger>pp=dd.findAll();
//		
//		System.out.println("Before booking Passengers count :: "+pp.size());
//		System.out.println("Before booking Inventory count :: "+fl.getInventory().getCount());
//		System.out.println("");
//		BookingRecord b =new BookingRecord(LocalDate.now(),fl.getDestination(),5000,fl.getFlightDate(),fl.getFlightNumber(),fl.getFlightTime(),fl.getOrigin(),"Completed");
//		List<Passenger> ps=new ArrayList<Passenger>();
//		
//		ps.add(p1);
//		ps.add(p2);
//		b.setPassengers(ps);
//		
//		booDao.save(b);
//		
//		invDao.updateInvetoryCount(fl.getInventory().getCount()-2,fl.getInventory().getInId());
//		
//		Flight fl2=dao.findByFlightDate("DELHI","HYDERABAD",d1);
//		List<Passenger>pp2=dd.findAll();
//		System.out.println("");
//		System.out.println("After booking Passengers count :: "+pp2.size());
//		System.out.println("After booking Inventory count :: "+fl2.getInventory().getCount());
//		System.out.println("---------------------------");
//		System.out.println("");
//		
//		
//		System.out.println(fl.getFlightNumber());
//		
//		//Ass3: 1st Question
//		Date d1 = new Date("2020/08/21");
//		List<Flight>Search=dao.FindByDate("Indigo",d1);
//		System.out.println("--------------- write a class to retrive all indigo flight trips of August 21st 2020---------");
//		System.out.println("");
//		for(Flight F:Search) {
//		    System.out.println("Flight ID :: " +F.getId()+ " Flight Number :: " +F.getFlightNumber()+ 
//		    		" Flight Orgin :: "+F.getOrigin()+ " Flight Destination :: "+F.getDestination());
//		    
//		 }
//		System.out.println("");
//		System.out.println("-----------------------------------------------");
//		//Ass2: 2nd Question
//		List<Flight>f=dao.findByLocation("DELHI",d1);
//		System.out.println("--------------- write a class to find all the flight leaving from Delhi on 21st Of August 2020---------");
//		System.out.println("");
//		for(Flight F:f) {
//			 System.out.println("FlightID :: " +F.getId()+ " FlightNumber :: " +F.getFlightNumber()+ 
//					 " FlightTime :: "+F.getFlightTime()+" FlightOrgin :: "+F.getOrigin()+ " FlightDestination :: "+F.getDestination());
//		 }
//		System.out.println("");
//		System.out.println("-----------------------------------------------");
//		
		//Ass2: 3nd Question
				List<Flight>searchByLocation=dao.searchByLocation("DELHI","CHENNAI",d1);
				System.out.println("--------------- write a class to search for flight flying between Delhi to CHENNAI on 21st Of August 2020 by flight fare low to high---------");
				System.out.println("");
				
				for(Flight F:searchByLocation) {
					 System.out.println("FlightID :: " +F.getId()+ " FlightNumber :: " +F.getFlightNumber()+ 
							 " FlightTime :: "+F.getFlightTime()+" FlightOrgin :: "+F.getOrigin()+ " FlightDestination :: "+F.getDestination()+ " FlightFare :: " +F.getFare().getFare());
				 }
				System.out.println("");
				System.out.println("-----------------------------------------------");
//         
//		//Ass2: 4th question
//		List<Flight>search=dao.searchFlightWithFlightNumber("AI-840","CHENNAI","DELHI");
//		System.out.println("--------------- write a class to search for flights with combination of flight number and origin and destination---------");
//		System.out.println("");
//		for(Flight F:search) {
//		    
//			 System.out.println("FlightID :: " +F.getId()+ " FlightNumber :: " +F.getFlightNumber()+ 
//					 " FlightTime :: "+F.getFlightTime()+" FlightOrgin :: "+F.getOrigin()+ " FlightDestination :: "+F.getDestination()+ " FlightFare :: " +F.getFare().getFare());
//		 }
//		System.out.println("");
//		System.out.println("-----------------------------------------------");
//		
//		
//		 
//		//Ass2: 5th question
//		List<Flight>searchByTime=dao.searchFlightWithTime("AI-870",d1,"02:45:00");
//		System.out.println("--------------- write a class to search for flights with combination of flight number and flight date and flight time---------");
//		System.out.println("");
//		for(Flight F:searchByTime) {
//		   
//			 System.out.println("FlightID :: " +F.getId()+ " FlightNumber :: " +F.getFlightNumber()+ 
//					 " FlightTime :: "+F.getFlightTime()+" FlightOrgin :: "+F.getOrigin()+ " FlightDestination :: "+F.getDestination()+ " FlightFare :: " +F.getFare().getFare());
//		 }
//		System.out.println("");
//		System.out.println("-----------------------------------------------");
//		
//		 
//		//Ass2: 6th question
//		System.out.println("--------------- shedule 6 additional flights from pune to chennai on a 22nd august with different times on same day---------");
//		System.out.println("");
//		
////		List<Flight>allFlights=dao.findAll();
////		System.out.println("Befor Insert Flights Count :: " +allFlights.size());
////		System.out.println("");
////		AirlineInfo air=airDao.findByName("Indigo");
////		System.out.println(air);
////	    Flight f1 =new Flight("AI-100","Hyderabad","Channai","2 Hours 15 Mins",LocalDate.of(2020,8,22),LocalTime.of(2, 45),new Fare("INT",6199), new Inventory(140),new FlightInfo("AI-100","Airbus",200,air));
////	    Flight f2 =new Flight("AI-140","Delhi","Channai","3 Hours 15 Mins",LocalDate.of(2020,8,22),LocalTime.of(2, 45),new Fare("INT",9099), new Inventory(199),new FlightInfo("AI-140","Airbus",250,air));
////	    Flight f3 =new Flight("AI-160","Banglore","Channai","4 Hours 30 Mins",LocalDate.of(2020,8,22),LocalTime.of(2, 45),new Fare("INT",7199), new Inventory(188),new FlightInfo("AI-160","Airbus",280,air));
////	    Flight f4 =new Flight("AI-200","Chennai","Banglore","1 Hours 15 Mins",LocalDate.of(2020,8,22),LocalTime.of(2, 45),new Fare("INT",8199), new Inventory(176),new FlightInfo("AI-200","Airbus",290,air));
////	    Flight f5 =new Flight("AI-300","Kolkata","Hyderabad","4 Hours 15 Mins",LocalDate.of(2020,8,22),LocalTime.of(2, 45),new Fare("INT",6699), new Inventory(184),new FlightInfo("AI-300","Airbus",280,air));
////	    Flight f6 =new Flight("AI-400","Vijayawada","Channai","1 Hours 45 Mins",LocalDate.of(2020,8,22),LocalTime.of(2, 45),new Fare("INT",5199), new Inventory(130),new FlightInfo("AI-400","Airbus",300,air));
////	    dao.saveAll(Arrays.asList(f1,f2,f3,f4,f5,f6));
////	    
////	    List<Flight>allFlightsAfter=dao.findAll();
////	    System.out.println("");
////		System.out.println("After Insert  Flights Count :: " +allFlightsAfter.size());
//		
//	    
//	    System.out.println("");
//		System.out.println("-----------------------------------------------");
//		
//		
//		//Ass2: 8th question
//		System.out.println("---------------  write class to book add 4 more Flights from delhi to phone on 21st August for your Timings. Make sure you are adding 1 indigo, 1 Air Asia, 1 Vistara and 1 Air India flight---------");
//		System.out.println("");
//		
////		List<Flight>allFlights=dao.findAll();
////		System.out.println("Befor Insert Flights Count :: " +allFlights.size());
////		System.out.println("");
////		AirlineInfo air1=airDao.findByName("Indigo");
////		System.out.println(air1);
////		AirlineInfo air2=airDao.findByName("Air Asia");
////		System.out.println(air2);
////		AirlineInfo air3=airDao.findByName("Vistara");
////		System.out.println(air3);
////		AirlineInfo air4=airDao.findByName("Air India");
////		System.out.println(air4);
////	    Flight f1 =new Flight("AI-100","Hyderabad","Channai","2 Hours 15 Mins",LocalDate.of(2020,8,21),LocalTime.of(2, 45),new Fare("INT",6199), new Inventory(140),new FlightInfo("AI-100","Airbus",200,air1));
////	    Flight f2 =new Flight("AI-140","Delhi","Channai","3 Hours 15 Mins",LocalDate.of(2020,8,21),LocalTime.of(2, 45),new Fare("INT",1099), new Inventory(199),new FlightInfo("AI-140","Airbus",250,air2));
////	    Flight f3 =new Flight("AI-160","Banglore","Channai","4 Hours 30 Mins",LocalDate.of(2020,8,21),LocalTime.of(2, 45),new Fare("INT",7099), new Inventory(188),new FlightInfo("AI-160","Airbus",280,air3));
////	    Flight f4 =new Flight("AI-200","Chennai","Banglore","1 Hours 15 Mins",LocalDate.of(2020,8,21),LocalTime.of(2, 45),new Fare("INT",10199), new Inventory(176),new FlightInfo("AI-200","Airbus",290,air4));
////	
////	    dao.saveAll(Arrays.asList(f1,f2,f3,f4));
////	    
////	    List<Flight>allFlightsAfter=dao.findAll();
////	    System.out.println("");
////		System.out.println("After Insert  Flights Count :: " +allFlightsAfter.size());
//		
//		 System.out.println("");
//		System.out.println("-----------------------------------------------");
//		
//		//Ass3: 9th question
//		System.out.println("---------------  write class to Update Indigo flight which is schedule on 21st August 2020 3:15 AM from Delhi to Pune, and re-shedule it to 22nd August 2020 6:30 PM for the flight number 6E-6686---------");
//		System.out.println("");
//		
//		Flight fl=dao.findByFlightNumber("6E-6686");
//		
//		System.out.println("Before Update Flight Info");
//		
//		 System.out.println("FlightID :: " +fl.getId()+ " FlightNumber :: " +fl.getFlightNumber()+ 
//				 " FlightTime :: "+fl.getFlightTime()+" FlightOrgin :: "+fl.getOrigin()+ " FlightDestination :: "+fl.getDestination()+ " FlightFare :: " +fl.getFare().getFare());
//		 
//		 dao.UpdateFlightNumber(LocalDate.of(2020,8,22),LocalTime.of(18, 30),"6E-6686");
//		 
//		 Flight fll=dao.findByFlightNumber("6E-6686");
//		 
//		 System.out.println("After Update Flight Info");
//		 System.out.println("FlightID :: " +fll.getId()+ " FlightNumber :: " +fll.getFlightNumber()+ 
//				 " FlightTime :: "+fll.getFlightTime()+" FlightOrgin :: "+fll.getOrigin()+ " FlightDestination :: "+fll.getDestination()+ " FlightFare :: " +fll.getFare().getFare());
//		
//		System.out.println("");
//		System.out.println("-----------------------------------------------");
	}

}
