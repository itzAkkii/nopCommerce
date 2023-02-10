package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		           features=".//src//test//resources//Features//FbLogin.feature",
		           glue="com.StepDefination",
		           dryRun=false,
		           monochrome=true,
		           plugin= {"pretty","html:test-report"}
		)
public class Runner {

}
