package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue ="StepDef", dryRun =false ,monochrome=true, plugin = {"pretty","json:target/cucumber.json","html:target/index.html"})
public class TestRunner {

}
