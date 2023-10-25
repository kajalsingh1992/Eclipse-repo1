package com.pages;

import com.base.JavaBase;
import com.util.PropertyReader;

public class PIM_Dashboard_Page extends JavaBase {

	public static final String SELECT_PIM = "//*[@id='app']/div[1]//aside//ul/li[2]//span";
	public static final String CLICK_ADD = "//*[@id='app']/div[1]//div[2]/div/div[2]//button";
	public static final String FIRST_NAME = "name=firstName";
	public static final String MIDDLE_NAME = "name=middleName";
	public static final String LAST_NAME = "name=lastName";
	public static final String SAVE_BUTTON = "//*[@id='app']//div//button[2]";
	public static final String TOGGLE_BUTTON = "//input[@type='checkbox']";
	public static final String EMPLOYEE_USER_NAME = "//*[@id='app']//div[3]//div/div[2]/input";
	public static final String DISABLE = "//*[text()='Disabled']";
	public static final String EMP_PASSWORD = "//*[@id='app']//div[4]//input";
	public static final String CONFIRM_PASSWORD = "//*[@id='app']//div[4]//div[2]//div[2]/input";

	public void clickOnPIM() {

		JavaBase.onClick(SELECT_PIM);
	}

	public void clickOnAddButton() {
		JavaBase.onClick(CLICK_ADD);
	}

	public void enterFirstName() {
		JavaBase.sendKeys(FIRST_NAME, PropertyReader.getDataProperties("Firstname"));
	}

	public void enterMiddleName() {
		JavaBase.sendKeys(MIDDLE_NAME, PropertyReader.getDataProperties("MiddleName"));
	}

	public void enterLastName() {
		JavaBase.sendKeys(LAST_NAME, PropertyReader.getDataProperties("LastName"));

	}

	public void clickOnToggleButton() {
		JavaBase.onClickJavaScript(TOGGLE_BUTTON);
	}

	public void enterEmployeeUserName() {
		JavaBase.sendKeys(EMPLOYEE_USER_NAME, PropertyReader.getDataProperties("EmployeeUserName"));
	}

	public void clickOnDisableButton() {
		JavaBase.onClick(DISABLE);
	}

	public void enterPassword() {
		JavaBase.sendKeys(EMP_PASSWORD, PropertyReader.getDataProperties("EmployeePassWord"));
	}

	public void enterConfirmPassword() {
		JavaBase.sendKeys(CONFIRM_PASSWORD, PropertyReader.getDataProperties("ConfirmPassWord"));
	}

	public void selectSaveButton() {
		JavaBase.onClick(SAVE_BUTTON);

	}

}
