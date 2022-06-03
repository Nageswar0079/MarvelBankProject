package com.marvelbank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		prop=new Properties();
		
		try {
			FileInputStream in  = new FileInputStream("C:\\Users\\Pavilion\\eclipse-workspace\\MarvelBankProjectAutomation\\src\\main\\java\\com\\marvelbank\\qa\\config\\config.properties");
			prop.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
					
	}
	public static void initialization() {
		String browserName=prop.getProperty("Browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "c:\\SeleniumDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "c:\\SeleniumDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
		else {
			System.out.println("None of the browsers Identified");
			}
		
	driver.manage().window().maximize();
	driver.get(prop.getProperty("Url"));
	}
}
	


