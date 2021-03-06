package com.ecommerce.webapp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {

		// 1. formulate test domain URL
		final String siteURL = "https://www.amazon.in/";
		final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-02-22-2021/driver/geckodriver";

		// 2. set selenium properties
		System.setProperty("webdriver.gecko.driver", driverPath);

		// 3. Instantiating selenium web driver
		WebDriver driver = new FirefoxDriver();

		// 3.1 Launch browser
		driver.get(siteURL);
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}

		driver.close();
	}

}
