package com.marvelbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvelbank.qa.base.TestBase;

public class HomePage extends TestBase {
	//ObjectRepository
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomerBtn;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	//Initializing the object repository
	public void Homepage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions Method
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	public boolean validateHomePageLogo() {
		return logo.isDisplayed();
	}
	public  DeleteCustomerPage navigateToDeleteCustomerPage() {
		deleteCustomerBtn.click();
		return new DeleteCustomerPage();
	}

	
	
}
