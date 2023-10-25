package com.testcase;

import org.testng.annotations.Test;

import com.base.JavaBase;
import com.pages.LoginPage;
import com.pages.PIM_Dashboard_Page;
import com.util.PropertyReader;

public class PIM_Dashboard_TestCase extends JavaBase 
{
	PIM_Dashboard_Page op = new PIM_Dashboard_Page();
 
	@Test(priority = 3)
	public void addEmployee() {
		op.clickOnPIM();
		op.clickOnAddButton();
		op.enterFirstName();
		op.enterMiddleName();
		op.enterLastName();
		op.clickOnToggleButton();
		op.enterEmployeeUserName();
		op.clickOnDisableButton();
		op.enterPassword();
		op.enterConfirmPassword();
		op.selectSaveButton();
	}
}
