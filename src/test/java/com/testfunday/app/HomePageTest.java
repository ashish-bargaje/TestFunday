package com.testfunday.app;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testfunday.pageobjects.LandingPage;
import com.testfunday.pageresources.Base;

public class HomePageTest extends Base {
	
	@BeforeTest
	public void start() throws IOException {
		driver = initializeDriver();
	}
	
	@Test (priority = 1)
	public void homePageNavigation() throws IOException {		
		driver.get(prop.getProperty("baseURL"));
		LandingPage lp = new LandingPage(driver);
		String contactEmail = lp.givenContactEmail();
		Assert.assertEquals(true, contactEmail.contains("info@myfunday.eu"));
		System.out.println("Contact Email : "+contactEmail);
		System.out.println("Home page title : "+driver.getTitle());				
	}
	
	@AfterTest
	public void end() {
		tearDown(driver);
	}

}
