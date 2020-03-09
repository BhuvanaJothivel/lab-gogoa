package services;
import model.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Type your code
public class FareCalculator extends Booking{
//	public static void main(String[] args) {
//		
//	}
	
	public double book(Hotel hotel) {
		LocalDate from = hotel.getFrom();
		LocalDate to = hotel.getTo();
		int noOfPersons =hotel.getNoOfPersons();
		if(noOfPersons == 3) {
			hotel.setClassType("double");
			hotel.setClassType("single");
		}
		long days = ChronoUnit.DAYS.between(from,to); 
		int rates = hotel.getRates();
		
		
	return (days*rates);
}
	public double book(Bus bus) {
//		LocalDate from = bus.getDate();
//		LocalDate to = bus.getTo();
		int noOfPersons =bus.getNoOfPersons();
		int rate = bus.getRates();
//		long days = ChronoUnit.DAYS.between(from,to); 
		
		
	return (noOfPersons*rate);
}
	public double book(Flight flight) {
		LocalDate from = flight.getFromdate();
		LocalDate to = flight.getTodate();
		String type = flight.getTriptype();
//		long days = ChronoUnit.DAYS.between(from,to);
		int rates = flight.getRates();
		int noOfPersons=flight.getNoOfPersons();
//		if(type == "round") {
//			if(days > 0) {
//				double x = days*rates;
//				return (x);
//			}
//		}
//			double x = days*rates;
//			return (x);

				if(type == "round-trip" && to.isAfter(from)) {
					return (noOfPersons*rates);
				}
				else {
					return (noOfPersons*rates);
				}
			
			
}
	public double book(Train train) {
		int noOfPersons =train.getNoOfPersons();
		int rate = train.getRates();
		return (noOfPersons*rate);
	}
	}