package com.acti.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.acti.base.DriverScript;
import com.acti.page.HomePage;
import com.acti.page.LoginPage;
import com.acti.page.TaskPage;
import com.acti.utils.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
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
	//ITestResult,it is an interface, this interface will listen to the TC and mark the TC pass or fail(Interface listener)
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		 report.flush();//flush is added coz logger variable is added in global and which is used for logging
		 Helper.sleep();
		 closeApplication();
	}

}
