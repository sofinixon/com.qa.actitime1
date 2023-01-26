package com.acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest
{

	//TC1 : Test create customer
	// Launch the browser
	// Login
	// Enter into the Home page and click on Task
	// Click on add new button
	// click on new customer
	//Enter customer Nmae
	//Enter description
	//click on create customer
	//verify Testcustomer has been created
	//Logout
	
	
	@Test(priority = 1, enabled = true)
	public void testCreateCustomer()
	{
		logger = report.createTest("Test Create Customer");
		lp.enterUsername("admin");
		logger.pass("Entered Username");
		lp.enterPassword("manager");
		logger.pass("Entered password");
		lp.clickLogin();
		logger.pass("clicked on Login button");
		hp.clickTask();
		logger.pass("clicked on Task Menu");
		tp.clickaddnewbutton();
		logger.pass("cliscked on add new button");
		tp.clickcreatenewcustomer();
		logger.pass("clicked on create new customer");
		tp.entercustomername("Sophia");
		logger.pass("Entered Customer name");
		tp.entercustomerdescription("Hello this is Automation");
		logger.pass("entered customer description");
		tp.clickcreatecustomer();
		logger.pass("click n create customer button");
		String actual = tp.getSuccessMessage();
		System.out.println(actual);
		Assert.assertTrue(actual.contains("has been created"));
		logger.pass("Verified new customer has been created");
		hp.clickLogout();
		logger.pass("clicked on logout");
			
	}
	
	@Test(priority = 2, enabled = true)
	public void testDeleteCustomer()
	{
		logger = report.createTest("Test Delete customer");
		lp.enterUsername("admin");
		logger.pass("entered username");
		lp.enterPassword("manager");
		logger.pass("entered password");
		lp.clickLogin();
		logger.pass("clicked login button");
		hp.clickTask();
		logger.pass("clicked task button");
		tp.entercustomertype("Sophia");
		logger.pass("enter customer name to search");
		tp.clicksearchedcustomer();
		logger.pass("clicked on search customer");
		tp.clickeditbutton();
		logger.pass("clicked on gear button/edit button");
		tp.clickactionbutton();
		logger.pass("clicked on actions button");
		tp.clickdeletebutton();
		logger.pass("clicked on delete button");
		tp.clickdeletebuttonperm();
		logger.pass("clicked on perm delete button");
		String actual = tp.getSuccessMessage();
		System.out.println(actual);
		Assert.assertTrue(actual.contains("has been deleted"));
		logger.pass("Verified customer has been deleted");
		hp.clickLogout();
		logger.pass("clicked logout button");
		
	}
	
	
}
