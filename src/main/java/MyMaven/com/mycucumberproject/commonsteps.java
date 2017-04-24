package MyMaven.com.mycucumberproject;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class commonsteps extends webconnector {
	
	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String Url) throws Throwable 
	{
		super.startDriver("chrome");
		super.Navigateto(Url);
		
	}

}
