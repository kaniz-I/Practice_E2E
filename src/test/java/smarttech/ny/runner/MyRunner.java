package smarttech.ny.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//plugin = {""},// plugin is nothing but generate the report
		features = {".//Pauto.feature/"}, // feature is nothing but location of features file
		glue  = {"smarttech.ny.StepDef"} // glue is nothing but location of stepdefination
		)
public class MyRunner extends AbstractTestNGCucumberTests {

}
