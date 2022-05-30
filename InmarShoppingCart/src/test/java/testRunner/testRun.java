package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\DELL\\eclipse-workspace\\InmarShoppingCart\\Features\\Login.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		tags={"@sample"}
)
public class testRun {

}
