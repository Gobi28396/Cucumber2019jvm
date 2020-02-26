package org.steps;

import java.util.List;

import org.locators.POJOLocatorts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefine extends POJOLocatorts  {
	public static WebDriver d;
	
	@Given("user in kogan home page")
	public void user_in_kogan_home_page() {

	}

	@Then("user clicks search button")
	public void user_clicks_search_button() throws InterruptedException {
		POJOLocatorts p = new POJOLocatorts();
		click(p.getPopup());
		
		for (int j = 1; j <p.getProduct().size(); j++) {
		
		click(p.getProduct().get(j));
		d.navigate().back();
		}
		


	}
	@When("user enters {string}")
	public void user_enters(String string) {
		POJOLocatorts p = new POJOLocatorts();
		click(p.getPopup());
		fill(p.getSearch(), string);
		click(p.getSearchclick());
		
	}

	@When("user enters usename and password")
	public void user_enters_usename_and_password() {
		POJOLocatorts p = new POJOLocatorts();
		click(p.getLogclick());
		fill(p.getUser(), "gobinath");
		fill(p.getPass(), "9876543987654");
	
	
	
	}

	@Then("user click login button")
	public void user_click_login_button() {
		POJOLocatorts p = new POJOLocatorts();
		click(p.getLoginclick());

	
	
	}

	@When("user enters productname and click search")
	public void user_enters_productname_and_click_search() throws InterruptedException {
		POJOLocatorts p = new POJOLocatorts();
		Thread.sleep(1000);	
		click(p.getPopup());
		fill(p.getSearch(), "nikon");
		click(p.getSearchclick());


	}

	@When("user select a product and click add to cart")
	public void user_select_a_product_and_click_add_to_cart() throws InterruptedException {

		POJOLocatorts p = new POJOLocatorts();
		Thread.sleep(1000);
		click(p.getPopup());
		click(p.getProduct().get(4));
		
		click(p.getAtocart());
	
	
	}

	@Then("user click checkout for payment")
	public void user_click_checkout_for_payment() throws InterruptedException{


		POJOLocatorts p = new POJOLocatorts();
		Thread.sleep(2000);
		WebElement k = d.findElement(By.xpath("//span[@class='_1VGeu']"));
		k.click();
Thread.sleep(2000);


click(p.getShopcheckout());
fill(p.getEmail(), "octals");
fill(p.getFullname(), "kavin");
fill(p.getPhnum(), "0987654321");
click(p.getCotinu());


	}
	@When("user search and select the product for paymentkout")
	public void user_search_and_select_the_product_for_paymentkout() throws InterruptedException {
		POJOLocatorts p = new POJOLocatorts();
		Thread.sleep(1000);	
		click(p.getPopup());
		fill(p.getSearch(), "nikon");
		click(p.getSearchclick());
		Thread.sleep(1000);
		click(p.getPopup());
		click(p.getProduct().get(4));
		
		click(p.getAtocart());
		Thread.sleep(2000);
		WebElement k = d.findElement(By.xpath("//span[@class='_1VGeu']"));
		k.click();
Thread.sleep(2000);


click(p.getShopcheckout());
	
	
	}

	@Then("user Enter the details")
	public void user_Enter_the_details() {
		POJOLocatorts p = new POJOLocatorts();
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].setAttribute('value','octals technologies')", p.getEmail());
		j.executeScript("arguments[0].setAttribute('value','kavinkumar')", p.getFullname());
		j.executeScript("arguments[0].setAttribute('value','987654321')", p.getPhnum());
		j.executeScript("arguments[0].click", p.getCotinu());
	}

	
	
	
	
	
}

