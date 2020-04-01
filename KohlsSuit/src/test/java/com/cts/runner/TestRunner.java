package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".\\src\\main\\resources\\Features"},
		glue = {"com.cts.stepdefinition"},
		plugin = {"html:reports/","pretty"}
)

public class TestRunner {

}
