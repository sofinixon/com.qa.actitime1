package com.acti.tests;

import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest
{

	//TC1 : Test create customer, for that 1st login to the Home page, go to Task list, create new customer
	
	@Test
	public void testCreateCustomer()
	{
		lp.initApplication();
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		hp.clickTask();
		tp.clickaddnewbutton();
		tp.clickcreatenewcustomer();
		tp.entercustomername("Sophia");
		tp.entercustomerdescription("Hello this is Automation");
		tp.clickcreatecustomer();
		String actual = tp.getSuccessMessage();
		System.out.println(actual);
		hp.clickLogout();
		
		
	}
	
	
}
