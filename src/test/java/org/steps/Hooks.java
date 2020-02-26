package org.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilits.Basesclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Basesclass {
	@Before
	public void beforeExecution() {
		System.out.println("browser going to launch");
		
		
		Browserlaunch("https://www.kogan.com/au");
		
	}
//	@Before("@sanity")
//	public void beforeExecution1() {
//		d.manage().window().maximize();
//	}
//
//	@After("@smoke")
//	private void afterExecution() {
//	System.out.println("done it");
//	}
	@After
	public void afterExecution1(Scenario s) {
		if (s.isFailed()) {
			
			
			
			
			TakesScreenshot tk=(TakesScreenshot)d;
			byte[] g = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(g,"image/png");
		}
		
		
		
		
		System.out.println("browser closed");
	
	}
	}

