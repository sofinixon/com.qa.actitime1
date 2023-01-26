package com.acti.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.acti.base.DriverScript;

public class Helper extends DriverScript
{
	//create a method to capture the screenshot when the testcase is fail:
	
	public static String captureScreenshot(WebDriver driver) throws IOException
	{
		//TakeScreenshot is a Interface and we are typecasting to the webdriver and calling a method called as getscreenshot as
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //need to give the path for the screen shot and append with screen.png
		 String screenpath = "C:/Users/sofin/git/com.qa.actitime1/atreports/screenshots/screen_"+System.currentTimeMillis()+".png";
		 FileHandler.copy(src, new File(screenpath));
		 return screenpath;
	}

	
	
	public static void sleep()
   {
	   try
	   {
		   Thread.sleep(2000);
	   }
	   catch (Exception e) 
	   {
		  e.printStackTrace();
		}
   }
}
