package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void sendData(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void selectLocHot(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}
	
	public static void print(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	public static void orderId() {
		List<WebElement> orderlist = driver.findElements(By.xpath("//input[contains(@id,'order')]"));
		int size = orderlist.size();
		System.out.println("Total Booked: " + (size-1) +"");
		System.out.println("All Order id: ");		
		for (WebElement l : orderlist) {
			String id = l.getAttribute("value");
			System.out.println(id);
		}
		
	}
	
	
}
