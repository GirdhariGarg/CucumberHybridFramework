package com.tmb.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "",
		features = "src//test//resources//feature",
		glue = "com.tmb.stepdefinition",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json"},
		monochrome = true,
		publish=true
		
		)
public class TestRunner {
	
	

}
