package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.LibGlobal;


public class SearchHotelPage extends LibGlobal {

	@FindBy(id="location")
	private WebElement locations;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childrenPerRoom;
	
	@FindBy(id="Submit")
	private WebElement searchBtn;

	public WebElement getLocations() {
		return locations;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void searchHotel(String location, String hotels, String roomtype, String noOfRoom, String checkIndate, String checkOutdate, String adultPerRoom,  String childrenPerRoom) {

		selectOptionByText(getLocations(), location);
		selectOptionByText(getHotels(), hotels);
		selectOptionByText(getRoomType(), roomtype);
		selectOptionByText(getNoOfRooms(), noOfRoom);
		selectOptionByText(getCheckInDate(), checkIndate);
		selectOptionByText(getCheckOutDate(), checkOutdate);
		selectOptionByText(getAdultPerRoom(), adultPerRoom);
		selectOptionByText(getChildrenPerRoom(), childrenPerRoom);
		click(getSearchBtn());
		
	}
	
}
