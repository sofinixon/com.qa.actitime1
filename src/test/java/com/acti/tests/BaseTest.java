package com.acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.acti.base.DriverScript;
import com.acti.page.HomePage;
import com.acti.page.LoginPage;
import com.acti.page.TaskPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript
{
	LoginPage lp;
	HomePage hp;
	TaskPage tp;
	protected static ExtentReports report;
	protected static ExtentTest logger;
	
	
	
	@BeforeSuite
	public void setupReport()
	{
		//create 2 objects here
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./atreports/autoindex.html");//any name can be given for autoindex
		report = new ExtentReports();
		report.attachReporter(extent);
	}
	


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
		 report.flush();//flush is added coz logger variable is added in global and which is used for logging
		 closeApplication();
	}

}
