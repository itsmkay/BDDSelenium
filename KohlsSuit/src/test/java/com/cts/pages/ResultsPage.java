package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {

	WebDriver driver;
	By sortByLocator = By.className("sbSelector");
	By sortByFocusedLocator = By.xpath("//*[@class='sbSelector sbFocus']");
	By priceHghToLowItemLocator = By.xpath("//*[@rel='Price High-Low']");
	By productImageLocator = By.xpath("//*[@class='prod_img_block']");
	
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sortByPrice() throws InterruptedException {
		driver.findElement(sortByLocator).click();
		driver.findElement(sortByFocusedLocator).click();
		driver.findElement(priceHghToLowItemLocator).click();
		Thread.sleep(3000L);
	}
	
	public void clickOnFirstProduct() {
		driver.findElements(productImageLocator).get(0).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
