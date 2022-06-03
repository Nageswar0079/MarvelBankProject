package com.marvelbank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.marvelbank.qa.base.TestBase;
import com.marvelbank.qa.pages.HomePage;
import com.marvelbank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	@Test(priority=0)
	public void validateTitle() {
		Assert.assertEquals(loginPage.validateLoginPagetitle(), "Guru99 Bank HomePage");
	}
	@Test(priority=1)
		public void validateLogo() {
			Assert.assertTrue(loginPage.validateLoginPageLogo());
		}
	@Test(priority=2)
	public void loginToApp(){
		homePage=loginPage.login(prop.getProperty("Username"),prop.getProperty("Password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
