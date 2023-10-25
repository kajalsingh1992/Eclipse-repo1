package com.testcase;

import org.testng.annotations.Test;

import com.pages.Leave_DashBoard_Page;

public class Leave_DashBoard_TestCase 
{

	Leave_DashBoard_Page board_Page=new Leave_DashBoard_Page();
	
	@Test(priority = 4)
	public void checkLeaveList()
	{
		board_Page.clickOnLeave();
		board_Page.selectFromDate();
		board_Page.selectToDate();
		board_Page.selectshowLeaveStatus();
		board_Page.selectLeaveType();
		board_Page.enterEmpName();
		board_Page.selectSubUnit();
		board_Page.clickOnIncludePast();
		board_Page.clickOnSearch();

		
	}
	
	
	
}
