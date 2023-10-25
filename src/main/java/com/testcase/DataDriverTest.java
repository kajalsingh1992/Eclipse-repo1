package com.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.JavaBase; 
import com.util.ReadExcelFile;
public class DataDriverTest extends JavaBase
{
	
	@DataProvider(name = "read")
	public Object[][] readDataExcel()
	{
		
ReadExcelFile configuration = new ReadExcelFile(System.getProperty("user.dir")+
		"//src//main//java//com//properties//mydata.xlsx");
		int rows = configuration.getRowCount(0);
		Object[][]signin_credentials = new Object[rows][2];

		for(int i=0;i<rows;i++)
		{
		signin_credentials[i][0] = configuration.getData(0, i, 0);
		signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;

		
	}	

	
	@Test(dataProvider = "read")
	public void myTest(String name,String pass)
	{
		WebElement uname = driver.findElement(By.name("username"));
		WebElement upass = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		uname.sendKeys(name);
		upass.sendKeys(pass);
		loginBtn.click();	
	}
}
