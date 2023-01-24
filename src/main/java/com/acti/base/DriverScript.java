package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*
 * Script : DriverScript
 * Description : This class file is used to load the properties file and initialize the browser and application
 * Developed by : Sophia
 * Verified by and Date : Shantosh 1/2/23
 */

public class DriverScript 
{
	//create driver instance
	public static WebDriver driver;
	
	Properties prop;
	
	//create constructor, we are loading the config file in advance
	public DriverScript()
	{
		try
		{
			//add external properties, do 3 steps
			File file = new File("./atconfig/config.properties");
			FileInputStream fis = new FileInputStream(file);
		    prop = new Properties();// Properties prop, should make this as global variable and remove ppties,otherwise null point exception occurs
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Unable to load properties file:" + e.getMessage());
			e.printStackTrace();//helps the programmer to understand where the actual problem occurred
			//It helps to trace the exception.
			
		}
	}
	
	
	//creating method for Setup
	 //@Test
	public void initApplication()
	{
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))//it will take either uppercase or lowercase
		{
			System.setProperty("webdriver.chrome.driver", "./atbrowser/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./atbrowser/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./atbrowser/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser name provided is unsupported please check the config file for details");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//fixes certain problems, like loading or formatting issues on sites.
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);// set the time for the entire page load prior to throwing an exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		getAppUrl();//call getAppUrl() here
	}
	
	//creating method for url
	public void getAppUrl()
	{
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	//creating method to close application
	public void closeApplication()
	{
		driver.close();
	}

}
