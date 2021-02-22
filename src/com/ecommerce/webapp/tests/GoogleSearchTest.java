package com.ecommerce.webapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. formulate test domain URL
		final String siteURL = "https://www.google.com/";
		final String driverPath ="/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-02-22-2021/driver/geckodriver";
		
		// 2. set selenium properties
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		// 3. Instantiating selenium web driver
		WebDriver driver =  new FirefoxDriver();
		
		
		// 3.1 Launch browser
		driver.get(siteURL);
		
		// 4. Perform Test
		String expectedTitle  = "Google";
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Documentations");
		searchBox.submit();
		
		
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		Thread.sleep(3000);
		// close driver
		driver.close();
	}

}
