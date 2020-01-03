package com.testfunday.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	public WebDriver driver;
	public WebElement element;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By tabConnection = By.xpath("//input[@class='sign-in']/following::font[1]");
	By tabCreateAnAccount = By.xpath("//input[@class='sign-in']/following::font[3]");
	By textboxUsername = By.id("rusername");
	By textboxPassword = By.id("rpassword");
	By textboxConfirmPassword = By.id("rrpassword");
	By textboxEmail = By.id("remail");
	By buttonRegister = By.id("register");
	
	
	public WebElement getTabConnection() {
		element = driver.findElement(tabConnection);
		return element;
	}
	
	public WebElement getTabCreateAnAccount() {
		element = driver.findElement(tabCreateAnAccount);
		return element;
	}
	
	public WebElement getTextboxUsername() {
		element = driver.findElement(textboxUsername);
		return element;
	}
	
	public WebElement getTextboxPassword() {
		element = driver.findElement(textboxPassword);
		return element;
	}
	
	public WebElement getTextboxConfirmPassword() {
		element = driver.findElement(textboxConfirmPassword);
		return element;
	}
	
	public WebElement getTextboxEmail() {
		element = driver.findElement(textboxEmail);
		return element;
	}
	
	public WebElement getButtonRegister() {
		element = driver.findElement(buttonRegister);
		return element;
	}

	public void clickOnTabConnection() {
		getTabConnection().click();
	}
	
	public void clickOnTabCreateAnAccount() {
		getTabCreateAnAccount().click();
	}
	
	public void enterUsername(String username) {
		getTextboxUsername().clear();
		getTextboxUsername().sendKeys(username);
	}
	
	public void enterPassword(String password) {
		getTextboxPassword().clear();
		getTextboxPassword().sendKeys(password);
	}
	
	public void reenterPassword(String password) {
		getTextboxConfirmPassword().clear();
		getTextboxConfirmPassword().sendKeys(password);
	}
	
	public void enterEmail(String emailId) {
		getTextboxEmail().clear();
		getTextboxEmail().sendKeys(emailId);
	}
	
	public void clickOnButtonCreateAnAccount() throws InterruptedException {
		getButtonRegister().click();
	}
	
	public boolean usernameFieldIsDisplayed() {
		return getTextboxUsername().isDisplayed();
	}
	
	public boolean usernameFieldIsEnabled() {
		return getTextboxUsername().isEnabled();
	}
	
	public boolean passwordFieldIsDisplayed() {
		return getTextboxPassword().isDisplayed();
	}
	
	public boolean passwordFieldIsEnabled() {
		return getTextboxPassword().isEnabled();
	}
	
	public boolean confirmPasswordFieldIsDisplayed() {
		return getTextboxConfirmPassword().isDisplayed();
	}
	
	public boolean confirmPasswordFieldIsEnabled() {
		return getTextboxConfirmPassword().isEnabled();
	}
	
	public boolean emailFieldIsDisplayed() {
		return getTextboxEmail().isDisplayed();
	}
	
	public boolean emailFieldIsEnabled() {
		return getTextboxEmail().isEnabled();
	}
	
	public boolean buttonCreateAnAccountIsDisplayed() {
		return getButtonRegister().isDisplayed();
	}
	
	public boolean buttonCreateAnAccountIsEnabled() {
		return getButtonRegister().isEnabled();
	}
	
	public boolean tabConnectionIsDisplayed() {
		return getTabConnection().isDisplayed();
	}
	
	public boolean tabConnectionIsEnabled() {
		return getTabConnection().isEnabled();
	}
	
	public boolean tabCreateAnAccountIsDisplayed() {
		return getTabCreateAnAccount().isDisplayed();
	}
	
	public boolean tabCreateAnAccountIsEnabledd() {
		return getTabCreateAnAccount().isEnabled();
	}
	
	
}
