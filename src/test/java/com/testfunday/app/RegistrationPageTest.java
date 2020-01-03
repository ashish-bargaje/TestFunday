package com.testfunday.app;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testfunday.pageobjects.RegistrationPage;
import com.testfunday.pageresources.Base;

public class RegistrationPageTest extends Base {
	
	@BeforeTest
	public void start() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("registrationURL"));
		rp = new RegistrationPage(driver);
	}
		
	@Test (priority = 1)
	public void validateRegistrationPage() {
		Assert.assertEquals(true, (rp.tabConnectionIsDisplayed() && rp.tabCreateAnAccountIsDisplayed()));
		System.out.println("Registration page title : "+driver.getTitle());
	}
	
	@Test (priority = 2)
	public void createSuccessfulAccount() throws InterruptedException {
		rp.clickOnTabCreateAnAccount();
		Thread.sleep(1000);
		rp.enterUsername(prop.getProperty("username"));
		Thread.sleep(1000);
		rp.enterPassword(prop.getProperty("password"));
		Thread.sleep(1000);
		rp.reenterPassword(prop.getProperty("password"));
		Thread.sleep(1000);
		rp.enterEmail(prop.getProperty("emailId"));
		Thread.sleep(1000);
		rp.clickOnButtonCreateAnAccount();
		Thread.sleep(1000);
		String alertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(true, alertMessage.contains("Registration successful! Login to manage your account!"));
	}
	
	@AfterTest
	public void end() {
		tearDown(driver);
	}

}
