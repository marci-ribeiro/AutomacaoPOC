package gherkin.hook;

import br.com.core.integration.OpenStf;
import br.com.core.report.ExtentReports;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends ExtentReports {

    OpenStf openStf = new OpenStf();

    @Before
    public void init(Scenario scenario) {
        testScenario.set(scenario);
    }

    @After
    public void cleanUp() {
    }
}










