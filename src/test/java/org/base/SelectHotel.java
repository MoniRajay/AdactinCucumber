package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{
	
	public SelectHotel() {
		PageFactory.initElements( driver, this);	
	}
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noRoom;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(id="radiobutton_1"), @FindBy(id="radiobutton_2")})
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement cont;
	

	public WebElement getCont() {
		return cont;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getNoRoom() {
		return noRoom;
	}

	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
		
	public WebElement getRoomType() {
		return roomType;
	}
	
	

}
