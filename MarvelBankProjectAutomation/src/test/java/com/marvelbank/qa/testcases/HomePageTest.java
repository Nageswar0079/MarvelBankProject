package com.marvelbank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.marvelbank.qa.base.TestBase;
import com.marvelbank.qa.pages.DeleteCustomerPage;
import com.marvelbank.qa.pages.HomePage;
import com.marvelbank.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp(){
	initialization();
	 loginPage=new LoginPage();
	 homePage=loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	@Test(priority=0)
	public void validateTitle() {
		Assert.assertEquals(homePage.validateHomePageTitle(),"Guru99 Bank Manager Home Page");
	}
	@Test(priority=1)
	public void validateLogo() {
		Assert.assertTrue(homePage.validateHomePageLogo());
	}
	@Test(priority=2)
	public void clickDeleteCustomerBtn() {
		deleteCustomerPage=homePage.navigateToDeleteCustomerPage();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
