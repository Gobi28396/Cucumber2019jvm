package org.test;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.steps.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.steps"},
dryRun=false,monochrome=true,tags= {" @sanity"},plugin={"html:D:\\NewSelenium42\\Cucumber\\Reports",
		"json:D:\\NewSelenium42\\Cucumber\\Reports\\outputt.json",
		"rerun:D:\\NewSelenium42\\Cucumber\\src\\test\\resources\\failures\\failiure.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class Testrun {
	@AfterClass
	public static void jvmre() {
		Report.reports("D:\\NewSelenium42\\Cucumber\\Reports\\outputt.json");
	}

	@BeforeClass
	public static void extendRe() {

	
String rep = System.getProperty("user.dir")+ "D:\\NewSelenium42\\Cucumber\\Reports\\Extends";
System.setProperty("Screenshot.dir", rep +"/Screenshots");
System.setProperty("extend.reporter.Spark.Start", "true");
System.setProperty("extend.report.Spark.out",rep);
	}

}
