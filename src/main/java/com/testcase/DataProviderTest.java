package com.testcase;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	WebDriver driver;
@DataProvider(name= "readdata")
public Object[][] readData()	
{
	Object o[][]= {{"username","Admin"},{"password","admin123"}};	
	return o;	
}
	
@Test(priority = 1, dataProvider= "readdata")
public void myTest(String name,String pass)
{
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement uname = driver.findElement(By.name("username"));
	WebElement upass = driver.findElement(By.name("password"));
	WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	
	uname.sendKeys(name);
	upass.sendKeys(pass);
	loginBtn.click();	
}
	

	
	
}
