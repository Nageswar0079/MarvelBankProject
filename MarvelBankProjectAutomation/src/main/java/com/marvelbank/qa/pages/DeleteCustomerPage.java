package com.marvelbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvelbank.qa.base.TestBase;

public class DeleteCustomerPage extends TestBase {
	//ObjectRepository
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerIdTextBox;
	@FindBy(xpath="/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement submitBtn;
	
	//initialize the OR
	public void DeleteCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateDeleteCustomerPageTitle() {
		return driver.getTitle();
	}
	public void deleteCustomer(String CustomerId) {
		customerIdTextBox.sendKeys(CustomerId);
		submitBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
	
}

