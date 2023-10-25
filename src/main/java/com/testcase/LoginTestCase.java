package com.testcase;

import org.testng.annotations.Test;

import com.base.JavaBase;
import com.pages.LoginPage;
import com.util.PropertyReader;

public class LoginTestCase extends JavaBase 
{
	LoginPage op = new LoginPage();

	@Test(priority = 1,enabled = false)
	public void verifyLable() {
		op.getANDVerifyLableName();
	}

	@Test(priority = 2,enabled = false)
	public void login() 
	{
		op.enterName();
		op.enterPassword();
		op.clickonLoginButton();

	}

	
	 
}
