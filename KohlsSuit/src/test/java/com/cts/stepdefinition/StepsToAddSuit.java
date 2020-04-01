package com.cts.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cts.base.Browser;
import com.cts.pages.HomePage;
import com.cts.pages.ProductPage;
import com.cts.pages.ResultsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsToAddSuit {
	
	WebDriver driver;
	HomePage homePage;
	ResultsPage resultsPage;
	ProductPage productPage;
	
	@Given("user launches the kohls website")
	public void user_launches_the_kohls_website() {
		Browser.launch("ch");
		this.driver = Browser.driver;
	}
	
	@When("user enters the query and presses enter")
	public void user_enetrs_the_query_and_presses_enter() {
		homePage = new HomePage(driver);
		homePage.searchQuery();
	}
	
	@Then("user is taken to the results page")
	public void user_is_taken_to_the_results_page() {
		Assert.assertTrue("Search Results Appeared", driver.getTitle().contains("Search Results"));
	}
	
	@Then("user sorts the results by price")
	public void user_sorts_the_results_by_price() throws InterruptedException {
		resultsPage = new ResultsPage(driver);
		resultsPage.sortByPrice();
	}
	
	@Then("user select the first item")
	public void user_select_the_first_item() {
		resultsPage.clickOnFirstProduct();
	}
	
	@Then("user is taken to the product page")
	public void user_is_taken_to_the_product_page() {
		Assert.assertFalse("User was not taken to product page", driver.getTitle().contains("Search Results"));
	}
	
	@Then("user selects the size")
	public void user_select_the_size() {
		productPage = new ProductPage(driver);
		productPage.selectSize();
	}
	
	@Then("user clicks on Add to Cart button")
	public void user_clicks_on_Add_to_cart_button() {
		productPage.addToCart();
	}
	
	@Then("item is added to the cart")
	public void item_is_added_to_the_cart() {
		Assert.assertTrue("Product was added", productPage.isProductAdded());
	}
}
