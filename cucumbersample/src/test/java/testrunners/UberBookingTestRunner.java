package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(value = Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/app.Feature"},
		glue = {"src/test/java/stepdefinitions"}
		)

public class UberBookingTestRunner {

}
