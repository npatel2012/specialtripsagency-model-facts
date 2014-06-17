package org.specialtripsagency;

import java.io.Serializable;

public class BookingObject implements Serializable {
	
	/**
	 * Added a default serial version ID
	 */
	private static final long serialVersionUID = 1L;
	
	private Applicant applicant = new Applicant();
	private TravelDetails travelDetails = new TravelDetails();
	private Flight availableFlights = new Flight();
	private Hotel availableHotels = new Hotel();
	private Integer totalPrice = new Integer(0);
	private Integer additionalPriceDiscount = new Integer(0);
	private Long bookingId = 0L;

	@Override
	public String toString() {
//		StringBuilder sBuilder = new StringBuilder();
//		
//		if (this.applicant != null) {
//			sBuilder.append(this.applicant.toString());
//		} else {
//			sBuilder.append("\nApplicant = null");
//		}
//		
//		if (this.travelDetails != null) {
//			sBuilder.append(this.travelDetails.toString());
//		} else {
//			sBuilder.append("\nTravelDetails = null");
//		}
//		
//		sBuilder.append("\n\t TravelDetails");
		
		
		return "BookingObject [applicant=" + applicant + ", travelDetails="
				+ travelDetails + ", listOfAvailableFlights="
				+ availableFlights + ", listOfAvailableHotels="
				+ availableHotels + ", totalPrice=" + totalPrice
				+ ", bookingId=" + bookingId + "]"
				+ ", additionalPriceDiscount=" + additionalPriceDiscount + "]";
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public TravelDetails getTravelDetails() {
		return travelDetails;
	}
	public void setTravelDetails(TravelDetails travelDetails) {
		this.travelDetails = travelDetails;
	}
	public Flight getAvailableFlights() {
		return availableFlights;
	}
	public void setAvailableFlights(Flight availableFlights) {
		this.availableFlights = availableFlights;
	}
	public Hotel getAvailableHotels() {
		return availableHotels;
	}
	public void setAvailableHotels(Hotel availableHotels) {
		this.availableHotels = availableHotels;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getAdditionalPriceDiscount() {
		return additionalPriceDiscount;
	}
	public void setAdditionalPriceDiscount(Integer additionalPriceDiscount) {
		this.additionalPriceDiscount = additionalPriceDiscount;
	}	
}
