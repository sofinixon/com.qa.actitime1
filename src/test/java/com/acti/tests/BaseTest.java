package com.acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.base.DriverScript;
import com.acti.page.HomePage;
import com.acti.page.LoginPage;
import com.acti.page.TaskPage;

public class BaseTest extends DriverScript
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TaskPage tp = new TaskPage();
	
	@BeforeMethod
	public void Setup()
	{
		initApplication();
	    lp = new LoginPage();
	    hp = new HomePage();
	    tp = new TaskPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		 closeApplication();
	}

}
