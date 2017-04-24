package MyMaven.com.mycucumberproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webconnector {
	
	public static WebDriver driver;
	
	public webconnector()
	{
		
	}

	
	
	public String GetObjectLocator(String objname)
	{
		
		String Locator="";
		
		try {
			File file = new File(System.getProperty("user.dir")+"//src//main//java//MyMaven//com//mycucumberproject//repo.properties"); //Object Of file class also loading the entire file into this object 
			FileInputStream fileInput = new FileInputStream(file);
		
			Properties properties = new Properties();
			properties.load(fileInput);
		
			fileInput.close(); //close because we already load the entire information into our property object 

			
			//System.out.println(properties.getProperty(objname));
			
			if(objname.equals(""))
			{
				System.out.println("Hey You forgot to input Object Name in Feature FIle .....!!!");
			}
			else
			{
				Locator = properties.getProperty(objname);
			}
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return Locator;
	}
	
	public void startDriver(String bname)
	{
		if(bname=="chrome")
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
			driver = new ChromeDriver();
		}
		else if(bname=="mozilla")
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//chromedriver");
			driver = new FirefoxDriver();
		}
		
	}
	
	public void Navigateto(String URL)
	{
		String locator = GetObjectLocator(URL);  // we are searching locatore from our prop repofile using this GetObjectLocator
		driver.get(locator);
		
	}
	
	public void Click(String targetObject)
	{
		
		String locator = GetObjectLocator(targetObject);  // we are searching locatore from our prop repofile using this GetObjectLocator

		hardwait(3000);

		if(!locator.equals("")) // If Locator is not equal to Empty ==Reverse 
		{
			if(driver.findElement(By.xpath(locator)).isDisplayed())
			{
				driver.findElement(By.xpath(locator)).click();
				hardwait(3000);
				System.out.println("Click Performed . Passed ");
			}
			else 
			{
				System.out.println("Object Not displayed ....");
			}
		}
		else 
		{
			System.out.println("Xpath emplty or No locator Found in repository ... ");
		}
	}

	public void EnterText(String targetObject, String input)
	{
		
		
		String locator = GetObjectLocator(targetObject);  // we are searching locatore from our prop repofile using this GetObjectLocator

		if(!locator.equals(""))
		{
			if(driver.findElement(By.xpath(locator)).isDisplayed())
			{
				if(input.equals(""))
				{
					System.out.println("No Imput to Write into the Target Object ");
				}
				else 
				{
					driver.findElement(By.xpath(locator)).sendKeys(input);;
					hardwait(1000);
					System.out.println("Input Written On Object  . Passed ");
				}
			}
			else 
			{
				System.out.println("Object Not displayed ....");
			}
		}
	}
	
	public boolean ValidatePageTitle(String PageTitle)
	{
		boolean returnType = false;
		
		if(driver.getTitle().equals(PageTitle))
		{
			System.out.println("we are in right page ...");
			returnType = true;
		}
		else 
		{
			System.out.println("we are not in right page ");
			returnType = false;

		}
		
		return returnType;
		
	}

	
	public boolean validateText(String targetObject, String input)
	{
		boolean returnType = false;
	
		String locator = GetObjectLocator(targetObject);  // we are searching locatore from our prop repofile using this GetObjectLocator

		if(!locator.equals(""))
		{
			String ActualResult = driver.findElement(By.xpath(locator)).getText();
			
			if(ActualResult.equals(input) || ActualResult.contains(input))
			{
				System.out.println("Validate text mtched or passed ");
				returnType = true;
			}
			else
			{
				System.out.println("validate text not matched FAiled ");
				returnType = false;

			}
		}
		
		return returnType;
		
	}
	
	public void SelectFromDrownDown( String DropdownObject, String valuetoselect)
	{
		String locator = GetObjectLocator(DropdownObject);  // we are searching locatore from our prop repofile using this GetObjectLocator
		Select select = new Select(driver.findElement(By.xpath(locator)));
		//select.deselectAll();
		select.selectByVisibleText(valuetoselect);
	}
	
	public boolean SelectListFromListBox( String ListBox, String TextTocompare)
	{

		boolean rtype = false;
		
		String locator = GetObjectLocator(ListBox);  // we are searching locatore from our prop repofile using this GetObjectLocator

		List<WebElement> allLinks = driver.findElements(By.xpath(locator));
		System.out.println(allLinks.size());
		
		int passCount=0;
		
		for(int i=0; i < allLinks.size(); i++)
		{
			System.out.println(allLinks.get(i).getText());
			if(allLinks.get(i).getText().contains(TextTocompare))
			{
				passCount = passCount +1;
			}
			
			if(passCount==3)
			{
				rtype = true;
				break;
			}
			
			if(i>5 && passCount < 3 )
			{
				rtype = false;
				break;
			}
			
		}
		
		return rtype;
	}
	
	
	
	public void ClickListFromListBox( String itemName, String ListBoxName)
	{
		String locator = GetObjectLocator(ListBoxName);  // we are searching locatore from our prop repofile using this GetObjectLocator
		int itemNumber = Integer.parseInt(itemName.split(":")[1].trim());
		WebElement elementtoClick = driver.findElement(By.xpath(locator+"["+itemNumber+"]/div/div[2]/div/div/a/img"));
		elementtoClick.click();
	}
	
	
	
	
	
	
	//=========Generic Function 
	
	public void hardwait(int WaitTime)
	{
		try {
			Thread.sleep(WaitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
