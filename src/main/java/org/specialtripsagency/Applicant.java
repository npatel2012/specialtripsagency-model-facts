package org.specialtripsagency;

import java.io.Serializable;

public class Applicant implements Serializable {

	/**
	 * Default value added
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String emailAddress;
	private Integer numberOfTravelers = new Integer(0);
	private String otherDetails;
	
	@Override
	public String toString() {
		return "Applicant [name=" + name + ", emailAddress=" + emailAddress
				+ ", numberOfTravelers=" + numberOfTravelers
				+ ", otherDetails=" + otherDetails + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public Integer getNumberOfTravelers() {
		return numberOfTravelers;
	}

	public void setNumberOfTravelers(Integer numberOfTravelers) {
		this.numberOfTravelers = numberOfTravelers;
	}

}
