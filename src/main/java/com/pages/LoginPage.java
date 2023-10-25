package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.base.JavaBase;
import com.util.PropertyReader;
public class LoginPage extends JavaBase
{
	public static final String USER_NAME= "name=username";
	public static final String PASS_WORD= "name=password";
	public static final String LOGIN_BUTTON= "//*[@id='app']//button";
	public static final String TITLE_LOGIN= "//*[@id='app']//div[2]/h5";
	 
		
	public void enterName()
	{
		JavaBase.sendKeys(USER_NAME, PropertyReader.getConfigProperties("User_Name"));
	}
	
	public void enterPassword()
	{
		JavaBase.sendKeys(PASS_WORD,PropertyReader.getConfigProperties("Pass_Word"));
	}
	public void clickonLoginButton()
	{
		JavaBase.onClick(LOGIN_BUTTON);
	}	
	
	
	public void getANDVerifyLableName()
	{
		   SoftAssert  Assert1 = new SoftAssert();
		   WebElement webTitle = driver.findElement(By.xpath(TITLE_LOGIN));
	   	   String getTtle=webTitle.getText(); 
	   	   Assert1.assertEquals("Login",getTtle);
	   	   Assert1.assertAll(); 	  
	}	
	
	 	
	
	
}
