package MyMaven.com.mycucumberproject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllOtherSteps extends webconnector {	
	@And("^I click the \"([^\"]*)\" Element$")
	public void i_click_the_Element(String Targetobject) throws Throwable 
	{
		super.Click(Targetobject);
	}
	
	@And("^I click \"([^\"]*)\" from \"([^\"]*)\"$")
	public void i_click_listfromListbox(String ItemNumber, String ListBoxName) throws Throwable 
	{
		super.ClickListFromListBox(ItemNumber, ListBoxName);
	}
	
	
	@And("^I Select \"([^\"]*)\" From \"([^\"]*)\"$")
	public void i_Select_from(String input, String Targetobject) throws Throwable 
	{
		
		
		//super.EnterText(Targetobject, input);
		super.SelectFromDrownDown(Targetobject, input);
		
	}
	
	
	@Then("^I validate List In \"([^\"]*)\" has text \"([^\"]*)\"$")
	public void i_validate_TextinListBox(String ListObjectName, String ListTexttoSearch) throws Throwable 
	{
		
		//super.SelectListFromListBox(ListObjectName, ListTexttoSearch);
		
		Assert.assertTrue(super.SelectListFromListBox(ListObjectName, ListTexttoSearch));
	
	}

	
	
	

	@And("^I enter \"([^\"]*)\" in \"([^\"]*)\"$")
	public void i_enter_in(String input, String Targetobject) throws Throwable 
	{
		super.EnterText(Targetobject, input);
	}
	
	
	

	@Then("^I validate \"([^\"]*)\" Page Title$")
	public void i_validate_Page_Title(String Pagetitle) throws Throwable 
	{
		Assert.assertTrue(super.ValidatePageTitle(Pagetitle));
	}

	@Then("^I validate Text \"([^\"]*)\" on \"([^\"]*)\"$")
	public void i_validate_Text(String texttovalidate, String wherethetextisobject) throws Throwable 
	{
		Assert.assertTrue(super.validateText(wherethetextisobject, texttovalidate));
	}
	
}
