package com.stepdefenition;


import com.base.LibGlobal;
import com.pages.Login;
import com.pages.SearchHotelPage;
import com.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefenition extends LibGlobal{

	@Given("User is on the adactin hotel page")
	public void userIsOnTheAdactinHotelPage() {
	   systemConfig();
	   openUrl("https://adactinhotelapp.com/");
	   maxWindow();
	   
	}
	@When("User should login {string} and {string}")
	public void userShouldLoginAnd(String userName, String password) {
	Login l = new Login();
	l.login(userName, password);
	}

	@When("User should search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSearchHotelsAnd(String location, String hotels, String roomtype, String noOfRoom, String checkIndate, String checkOutdate, String adultPerRoom, String childrenPerRoom) {
		SearchHotelPage hotelPage = new SearchHotelPage();
		hotelPage.searchHotel(location, hotels, roomtype, noOfRoom, checkIndate, checkOutdate, adultPerRoom, childrenPerRoom);
	}

	@Then("User should verify {string} is present")
	public void userShouldVerifyIsPresent(String expectedValue) {
		SelectHotel a = new SelectHotel();
		a.verifySelectHotel(expectedValue);
	}
}

//Mukesh    | S        | kalpakkam | 345612349876234512 | American Express | January     |        2022 |   123 |
// Firstname | Lastname | Address   | Creditcardno       | Creditcardtype   | Expirydate1 | Expirydate2 | Cvvno |
