package com.testfunday.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	private WebDriver driver;
	private WebElement element;
	private String getContactEmail;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By contactEmail = By.xpath("//div[@class='contact d-flex']//font[contains(text(),'@')]");
	
	public WebElement getContactEmail() {
		element = driver.findElement(contactEmail);
		return element;
	}

	public String givenContactEmail() {
		return getContactEmail().getText();
	}
}
