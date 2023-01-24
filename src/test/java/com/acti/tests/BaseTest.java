package com.acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.base.DriverScript;
import com.acti.page.HomePage;
import com.acti.page.LoginPage;

public class BaseTest extends DriverScript
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	
	@BeforeMethod
	public void Setup()
	{
		initApplication();
	    lp = new LoginPage();
	    hp = new HomePage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		 closeApplication();
	}

}
