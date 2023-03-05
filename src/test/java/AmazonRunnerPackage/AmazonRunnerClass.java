package AmazonRunnerPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/resource/java/AmazonFeature"},
plugin= {"json:target/cucumber.json"},
glue="AmazonStepDefiPackage",tags= {"@AmazonSearch"})



public class AmazonRunnerClass extends  AbstractTestNGCucumberTests{

}
