package MyMaven.com.mycucumberproject;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


//@CucumberOptions (features = "src/test/java/features/")
//@CucumberOptions (features = "src/")
//@CucumberOptions (tags = {"~@AmazonSearchListAndGoToDetailsPage, ~@PositiveLogin"})
//@CucumberOptions( plugin = {"pretty","html:target/html/automation"},
//features = {"Feature"},
//glue={},
//tags={"@AmazonSearchListAndGoToDetailsPage","@PositiveLogin"}
//)


@CucumberOptions(
		features = "src/", 
		tags= "@AmazonSearchListAndGoToDetailsPage"

		)

/*
@CucumberOptions(features = { "src/*.feature" }, glue = "", plugin = {
        "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json", "rerun:target/rerun.txt",
        "junit:target/junit-report.xml", "testng:target/testng-output.xml" }, monochrome = true, tags = {"~@AmazonSearchListAndGoToDetailsPage"})
*/





//@CucumberOptions(tags = {"~@one, ~@two"})
public class RunFeatures {
}