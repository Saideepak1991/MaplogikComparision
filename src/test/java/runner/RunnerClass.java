package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SAI PAVEEN\\eclipse-workspace\\CucumberMaplogikProject\\src\\test\\java\\featurefile\\featurecomparision.feature", glue = {
		"stepDefinition","hooks" },
				plugin= {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)

public class RunnerClass {

}
