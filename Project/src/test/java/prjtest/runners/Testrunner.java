package prjtest.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Testrunner {
	@CucumberOptions(features= {"C:/Users/ashle/eclipse-workspace/Project/Features/AllFooterlink.feature"},
            glue= {"prjtest.stepdefinations"},
            plugin= {"pretty","html:target/cucumber-reports/cucumberreport.html"},
            tags="@alllinks",
            monochrome=true

)

public class Infynirunner extends AbstractTestNGCucumberTests{

}
}
