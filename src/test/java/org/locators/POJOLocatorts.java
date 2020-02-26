package org.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilits.Basesclass;

public class POJOLocatorts extends Basesclass {
	public POJOLocatorts() {
		PageFactory.initElements(d, this);

	}

	// login in kogan
	@FindBy(xpath = "//div[text()='Login or Sign Up']")
	private WebElement logclick;

	@FindBy(xpath = "//input[@id='input-loginbox-email']")
	private WebElement user;

	@FindBy(xpath = "//input[@id='input-loginbox-password']")
	private WebElement pass;
	
	@FindBy(xpath="(//span[@class='branded-button-label'])[1]")
	private WebElement loginclick;

	public WebElement getLoginclick() {
		return loginclick;
	}

	// search a product in kogan
	@FindBy(xpath = "//input[@id='product-search-field']")
	private WebElement search;

	@FindBy(xpath = "(//div[@role='button'])")
	private WebElement popup;

	@FindBy(className = "search-nav__icon")
	private WebElement searchclick;

	// select product
	@FindBy(xpath = "//a[@itemprop='url']")
	private List<WebElement> product;

	// add to card
	@FindAll({ @FindBy(xpath = "(//span[@class='buttonText'])[2]"),
			@FindBy(xpath = "(//span[text()='Add to Cart'])[1]") })
	private WebElement atocart;

	// checkout to shopping and payment
	@FindAll({ @FindBy(xpath = "(//span[@class='buttonText'])[1]"), @FindBy(xpath = "(//span[text()='Checkout'])[1]") })
	private WebElement shopcheckout;

	// checkout to contact deteais
	@FindAll({ @FindBy(xpath = "//input[@type='text']"), @FindBy(className = "_1Jt4D"), @FindBy(name = "email"),
			@FindBy(id = "email") })
	private WebElement email;

	@FindAll({ @FindBy(xpath = "//input[@type='email']"), @FindBy(className = "_1Jt4D"), @FindBy(name = "full_name"),
			@FindBy(id = "full_name") })

	private WebElement Fullname;

	@FindAll({ @FindBy(xpath = "//input[@type='tel']"), @FindBy(className = "_1Jt4D"), @FindBy(name = "phone"),
			@FindBy(id = "phone") })
	private WebElement phnum;

	@FindAll({ @FindBy(xpath = "//span[@class='buttonText'])[3]"), @FindBy(xpath = "//span[text()='Continue']") })
	 private WebElement cotinu;
	
	
	//delivery address
	@FindAll({ @FindBy(xpath = "//input[@type='text']"), @FindBy(className = "_1Jt4D"), @FindBy(name = "company_name"),
		@FindBy(id = "company_name")})
	private WebElement comname;
	@FindAll({ @FindBy(xpath = "//input[@type='text']"), @FindBy(className = "_1Jt4D _3BAOv"), @FindBy(name = "address2"),
		@FindBy(id = "address2")})
	private WebElement stretname;
	
	@FindAll({ @FindBy(xpath = "//input[text()='A second line if you need it']"), @FindBy(className = "_3bBQ6")})
	private WebElement address2;
	
	@FindAll({ @FindBy(xpath = "//input[@type='text']"), @FindBy(className = "_1Jt4D _3BAOv"), @FindBy(name = "address_postcode"),
		@FindBy(id = "address_postcode")})
	private WebElement postcode;
	
	//payment class=""
	@FindAll({ @FindBy(xpath = "//input[@type='text']"), @FindBy(className = "_2cKAj _6RISU"), @FindBy(name = "address_postcode"),
		@FindBy(id = "address_postcode")})
	private WebElement creditcard;

	public WebElement getLogclick() {
		return logclick;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getSearchclick() {
		return searchclick;
	}

	public List<WebElement> getProduct() {
		return product;
	}

	public WebElement getAtocart() {
		return atocart;
	}

	public WebElement getShopcheckout() {
		return shopcheckout;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFullname() {
		return Fullname;
	}

	public WebElement getPhnum() {
		return phnum;
	}

	public WebElement getCotinu() {
		return cotinu;
	}

	public WebElement getComname() {
		return comname;
	}

	public WebElement getStretname() {
		return stretname;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	
	
	
	
	
	
	
	

}


