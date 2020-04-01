package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	By searchBarLocator = By.id("search");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchQuery() {
		WebElement searchBar = driver.findElement(searchBarLocator);
		searchBar.sendKeys("Suits");
		searchBar.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
