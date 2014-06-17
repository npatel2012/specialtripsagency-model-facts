package org.specialtripsagency;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flight implements Serializable {

	/**
	 * Generated default value
	 */
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	private String company;
	private int planeId;
	private Integer ratePerPerson = new Integer(0);
	private String startCity;
	private String targetCity;
	private Date travelDate;
	private Date returnDate;
	private Integer priceDiscount = new Integer(0);
	
	@Override
	public String toString() {
		return "Flight [company=" + company 
				+ ", planeId=" + planeId 
				+ ", ratePerPerson=" + this.ratePerPerson
				+ ", startCity=" + startCity 
				+ ", targetCity=" + targetCity
				+ ", travelDate=" + travelDate
				+ ", returnDate=" + returnDate
				+ ", dateFormat=" + dateFormat
				+ ", priceDiscount=" + priceDiscount
				+ "]";
	}
	
	public Integer getPriceDiscount() {
		return priceDiscount;
	}

	public void setPriceDiscount(Integer priceDiscount) {
		this.priceDiscount = priceDiscount;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPlaneId() {
		return planeId;
	}
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	public Integer getRatePerPerson() {
		return this.ratePerPerson;
	}
	public void setRatePerPerson(Integer ratePerPerson) {
		this.ratePerPerson = ratePerPerson;
	}
	public String getStartCity() {
		return startCity;
	}
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	public String getTargetCity() {
		return targetCity;
	}
	public void setTargetCity(String targetCity) {
		this.targetCity = targetCity;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

}
