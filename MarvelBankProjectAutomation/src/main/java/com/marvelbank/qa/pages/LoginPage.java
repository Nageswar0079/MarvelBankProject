package com.marvelbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvelbank.qa.base.TestBase;

public class LoginPage extends TestBase {
	//ObjectRepostory
	@FindBy(xpath="//input[@name='uid']")
	WebElement UserId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement Logo;
	
	//Inititializing the Page Factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//ActionsMethod
	public String validateLoginPagetitle () {
		return driver.getTitle();
	}
	public boolean validateLoginPageLogo() {
		return Logo.isDisplayed();
	}
	public HomePage login(String un,String pwd) {
		UserId.sendKeys(un);
		Password.sendKeys(pwd);
		Loginbtn.click();
		return new HomePage();
	}
}
