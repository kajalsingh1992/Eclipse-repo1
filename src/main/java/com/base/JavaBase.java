package com.base;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.util.PropertyReader;

public class JavaBase 
{

public static WebDriver driver;


@BeforeSuite
public static void initBrowser()
{
	String browser= PropertyReader.getConfigProperties("browser");
	
	switch(browser)
	{
	case "chrome":
	{
		driver= new ChromeDriver();
		break;
	}
	case "firefox":
	{
		driver= new FirefoxDriver();
		break;
	}
	case "InternetExplorer":
	{
		driver= new InternetExplorerDriver();
		break;
	}
	case "Edge":
	{
		driver= new EdgeDriver();
		break;
	}
	default : 
		driver= new ChromeDriver();
		break;
	}
	
	 
	
	driver.get(PropertyReader.getConfigProperties("Server_Url"));
	
	//driver.navigate().to(PropertyReader.getConfigProperties("Server_Url"));
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
}
	

	public static By getLocator(String locator)
	{
		By result= null;
		if(locator.startsWith("//"))
		{
			result=By.xpath(locator);
		}
		else if(locator.startsWith(".//"))
		{
			result=By.xpath(locator);
		}
		else if(locator.startsWith("name="))
				{
			result= By.name(locator.replace("name=", ""));
		}
		else if(locator.startsWith("css="))
		{
			result= By.cssSelector(locator.replace("css=", ""));
		}
		else if(locator.startsWith("linktext="))
		{
			result= By.linkText(locator.replace("linktext=", ""));
		}
		else if(locator.startsWith("id="))
		{
			result= By.id(locator.replace("id=", ""));
		}
		
		return result;		
	}
			
	
	
	public static void sendKeys(String locator, String value)	
	{

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		By locator2 = getLocator(locator);
		WebElement findElement = driver.findElement(locator2);
		findElement.sendKeys(value);		
	}
		
	static	public void onClick(String locator)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		WebElement webElement = myWait(locator,Duration.ofSeconds(60));
		webElement.click();
		
	}
	
	
	
	public static void onClickJavaScript(String locator)
	{
		WebElement element = driver.findElement(getLocator(locator));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
		
	
   static public WebElement myWait(String locator,Duration wait)
   {   
    WebDriverWait explicitWait= new WebDriverWait(driver, wait);
    WebElement expWaitElement = explicitWait.until(ExpectedConditions.elementToBeClickable(getLocator(locator)));
    return expWaitElement;
   }
	
   
	}
	
	
	
	
	
	
	
	

	
	
	

