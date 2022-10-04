package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions (
		
		features =".//FeatureFile/BuyAndCellStocks.feature",
		glue = "StepDefination",
		dryRun = true,
		monochrome = true,
		plugin = {"pretty","html:target/reports1.html"}
		
		)


public class TestRunnerClass

{

}
