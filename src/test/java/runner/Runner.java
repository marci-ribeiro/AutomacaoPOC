package runner;


import br.com.core.parallel.AbstractTestNGCucumberParallelTests;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "gherkin",
				 tags = {"@Cadastro"}, //coloque a tag que quer executar aqui
				 plugin = {"json:target/json-cucumber-reports/cukejson.json",
						   "testng:target/testng-cucumber-reports/cuketestng.xml",
						   "com.epam.reportportal.cucumber.ScenarioReporter",
						 },
				features = "feature")
public class Runner extends AbstractTestNGCucumberTests {}