package model;

import java.time.LocalDate;

//Type your code 

public class Flight{
	private int noOfPersons;private String roomType;private int rates;private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
	private int rates2;
	private String classtype;
	private LocalDate start;
	private String triptype;
	public Flight(int noOfPersons, int rates2, String classtype, LocalDate start, LocalDate fromdate, String triptype) {
		super();
		this.noOfPersons = noOfPersons;
		this.rates2 = rates2;
		this.classtype = classtype;
		this.start = start;
		this.fromdate = fromdate;
		this.triptype = triptype;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public LocalDate getFromdate() {
		return fromdate;
	}
	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}
	public LocalDate getTodate() {
		return todate;
	}
	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	public int getRates2() {
		return rates2;
	}
	public void setRates2(int rates2) {
		this.rates2 = rates2;
	}
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public String getTriptype() {
		return triptype;
	}
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
	

}