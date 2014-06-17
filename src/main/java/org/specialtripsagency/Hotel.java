package org.specialtripsagency;

import java.io.Serializable;

public class Hotel implements Serializable {

	/**
	 * Default value generated
	 */
	private static final long serialVersionUID = 1L;
	
	private String hotelName;
	private String duration;
	private String roomType;
	private Integer roomPrice = new Integer(0);
	private String location;
	private Boolean breakfastIncluded;
	
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", duration=" + duration
				+ ", roomType=" + roomType + ", roomPrice=" + roomPrice + ", location="
				+ location + ", breakfastIncluded=" + breakfastIncluded + "]";
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Integer getPrice() {
		return roomPrice;
	}
	public void setPrice(Integer price) {
		this.roomPrice = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Boolean getBreakfastIncluded() {
		return breakfastIncluded;
	}
	public void setBreakfastIncluded(Boolean breakfastIncluded) {
		this.breakfastIncluded = breakfastIncluded;
	}

}
