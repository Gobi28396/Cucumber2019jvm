package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@D:\\NewSelenium42\\Cucumber\\src\\test\\resources\\failures"},glue= {"org.steps"},
dryRun=false,monochrome=true)

public class TestRerun {

}
