package com.acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Script : Login Page Test cases
 * Description : Login Page Testcase
 * Developed by : Sophia
 * Verified by and Date : Shantosh 1/23/23
 */


public class LoginPageTests extends BaseTest
{
	

	//TC1:Test the Loginpage Title
	//T execute the TC in order we have to give the priority
	// enabled = false : means this case will not run
	
  @Test(priority = 1, enabled = true)
   public void testLoginPageTitle()
   {
	 logger = report.createTest("Test Login page Title");
	 String title = lp.getLoginPageTitle();
	 logger.pass("Lauched and closed the browser");
	 System.out.println(title);
	 //add assertion to find whether the Title has Login or not
	 Assert.assertTrue(title.contains("Login"));
	 logger.pass("Verified login page title successfully");
	 
   }

    //TC2: Test the Actitime logo
  
  @Test(priority = 2, enabled = true)
   public void testActiLogodisplayed()
   {
	   logger = report.createTest("Test Acti Time Logo");
	   boolean flag = lp.verifyActilogo();
	   logger.pass("Lauched and closed the browser");
	   System.out.println(flag);
	   Assert.assertTrue(flag);
	   logger.pass("Verified Actitime Logo");
	  
   }
  
//TC3: Test the Login function/button
  
  @Test(priority = 3, enabled = true)
  public void testLoginFunction()
  {
	 logger = report.createTest("Test Login Function");
	 lp.enterUsername("admin");
	 logger.pass("entered username");
	 lp.enterPassword("manager");
	 logger.pass("entered password");
	 lp.clickLogin();
	 logger.pass("clicked login button");
	 String actual = "John Doe";
	 String expected = hp.getUserLoggedIn();
	 System.out.println(expected);
	 Assert.assertEquals(actual, expected);
	 logger.pass("verified user logged in");
	 hp.clickLogout();
	 logger.pass("clicked logged out button");
	 
  }
}
