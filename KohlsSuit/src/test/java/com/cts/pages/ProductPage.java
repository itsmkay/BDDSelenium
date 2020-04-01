package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
		
	WebDriver driver;
	By addToCartButtonLocator = By.id("addtobagID");
	By sizeSelectorLocator = By.id("size-dropdown");
	By cartIconLocator = By.xpath("//*[@class='number-items boss-number-items']");
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectSize() {
		Select sizeSelector = new Select(driver.findElement(sizeSelectorLocator));
		sizeSelector.selectByIndex(3);
	}
	
	public void addToCart() {
		driver.findElement(addToCartButtonLocator).click();
	}
	
	public boolean isProductAdded() {
		String cartCount = driver.findElement(cartIconLocator).getText().toString();
		if(cartCount.equals("1"))
			return true;
		else
			return false;
	}

}
