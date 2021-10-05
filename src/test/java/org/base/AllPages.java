package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPages extends BaseClass {
	
	public AllPages() {
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(id="username")
	private WebElement name;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="my_itinerary")
	private WebElement list;

	public WebElement getList() {
		return list;
	}

	public WebElement getUserName() {
		return name;
	}

	public WebElement getPassWord() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	

}
