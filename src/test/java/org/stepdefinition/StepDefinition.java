package org.stepdefinition;

import org.base.BaseClass;
import org.base.FillDetails;
import org.base.SelectHotel;
import org.base.AllPages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("open adactin application")
	public void open_adactin_application() {
	    browserLaunch("https://adactinhotelapp.com/");
	}
	
	@When("enter {string} and {string} and login to the website")
	public void enter_and_and_login_to_the_website(String string, String string2) {
	  
	    AllPages a = new AllPages();
	    sendData(a.getUserName(), string);
	    sendData(a.getPassWord(), string2);
	    a.getLogin().click();
	}
	@And("book the room {string}  {string} {string} {string} {string}")
	public void book_the_room(String string, String string2, String string3, String string4, String string5) {
		SelectHotel b = new SelectHotel();
		selectLocHot(b.getLocation(), string);
		selectLocHot(b.getHotels(), string2);
		selectLocHot(b.getRoomType(), string3);
	    selectLocHot(b.getNoRoom(), string4);
	    selectLocHot(b.getAdult(), string5);
	    b.getSubmit().click();
	    
	    b.getRadiobtn().click();
	    b.getCont().click();
	    
	}
	
	@And("room booked with id {string} {string} {string} {string} {string} {string} {string} {string}")
	public void room_booked_with_id(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	    FillDetails c = new FillDetails();
	   sendData(c.getFirstname(), string);
	   sendData(c.getLastname(), string2);
	   sendData(c.getAddress(), string3);
	   sendData(c.getCcNum(), string4);
	   selectLocHot(c.getCcType(), string5);
	   selectLocHot(c.getExpMonth(), string6);
	   selectLocHot(c.getExpYear(), string7);
	   sendData(c.getCvv(), string8);   
	   
	   c.getBook().click();
	   Thread.sleep(6000);
	   
	   AllPages d = new AllPages();
	   d.getList().click();
	   
	}

	@Then("display order id")
	public void display_order_id() {
	   orderId();
	}



}
