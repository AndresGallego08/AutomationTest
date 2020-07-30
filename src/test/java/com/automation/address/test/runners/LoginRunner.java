package com.automation.address.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/com/automation/address/test/features/login.feature",
		glue = "com.automation.address.test.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class LoginRunner {

}
