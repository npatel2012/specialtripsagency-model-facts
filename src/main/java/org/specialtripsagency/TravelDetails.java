package org.specialtripsagency;

import java.io.Serializable;
import java.util.Date;

public class TravelDetails implements Serializable {

	/**
	 * Default value generated
	 */
	private static final long serialVersionUID = 1L;
	
	private String fromDestination;
	private String toDestination;
	private Date preferredDateOfDeparture;
	private Date preferredDateOfArrival;
	
	@Override
	public String toString() {
		return "TravelDetails [fromDestination=" + fromDestination
				+ ", toDestination=" + toDestination
				+ ", preferredDateOfDeparture=" + preferredDateOfDeparture
				+ ", preferredDateOfArrival=" + preferredDateOfArrival + "]";
	}
	public String getFromDestination() {
		return fromDestination;
	}
	public void setFromDestination(String fromDestination) {
		this.fromDestination = fromDestination;
	}
	public String getToDestination() {
		return toDestination;
	}
	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}
	public Date getPreferredDateOfDeparture() {
		return preferredDateOfDeparture;
	}
	public void setPreferredDateOfDeparture(Date preferredDateOfDeparture) {
		this.preferredDateOfDeparture = preferredDateOfDeparture;
	}
	public Date getPreferredDateOfArrival() {
		return preferredDateOfArrival;
	}
	public void setPreferredDateOfArrival(Date preferredDateOfArrival) {
		this.preferredDateOfArrival = preferredDateOfArrival;
	}
	
}
