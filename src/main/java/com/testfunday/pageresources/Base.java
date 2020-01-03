package com.testfunday.pageresources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.testfunday.pageobjects.LandingPage;
import com.testfunday.pageobjects.RegistrationPage;

public class Base {	
	public WebDriver driver;
	public Properties prop;
	public LandingPage lp;
	public RegistrationPage rp;
	
	
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".//resources//data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browserName");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>(); 
			Map<String, Object> langs = new HashMap<String, Object>(); 
			langs.put("fr", "en");
			prefs.put("translate", "{'enabled' : true}");
			prefs.put("translate_whitelists", langs);
			options.setExperimentalOption("prefs", prefs);			
			ChromeDriver driver = new ChromeDriver(options);
			this.driver = driver;
		}
		else if (browserName.equals("firefox")) {
			
		}
		else if (browserName.equals("IE")) {
			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void tearDown(WebDriver driver) {
		driver.quit();
	}

}
