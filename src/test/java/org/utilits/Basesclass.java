package org.utilits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basesclass {
	public static WebDriver d; 
	// Browser Launch
	
	public static void Browserlaunch(String s) {
	System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
			op.addArguments("--disable-notifications");
	
	d=new ChromeDriver(op);
	d.get(s);
	
   }
	 //sendkeys clicks
	  public static void fill(WebElement e,String s) {
		e.sendKeys(s);
	}
	 public static void click(WebElement e) {
	e.click();
	}
	 


}


