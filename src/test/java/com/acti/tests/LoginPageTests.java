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
	 String title = lp.getLoginPageTitle();
	 System.out.println(title);
	 //add assertion to find whether the Title has Login or not
	 Assert.assertTrue(title.contains("Login"));
	 
   }

    //TC2: Test the Actitime logo
  
  @Test(priority = 2, enabled = true)
   public void testActiLogodisplayed()
   {
	   boolean flag = lp.verifyActilogo();
	   System.out.println(flag);
	   Assert.assertTrue(flag);
	  
   }
  
//TC3: Test the Login function/button
  
  @Test(priority = 3, enabled = true)
  public void testLoginFunction()
  {
	 
	 lp.enterUsername("admin");
	 lp.enterPassword("manager");
	 lp.clickLogin();
	 String actual = "John Doe";
	 String expected = hp.getUserLoggedIn();
	 System.out.println(expected);
	 Assert.assertEquals(actual, expected);
	 hp.clickLogout();
	 
  }
}
