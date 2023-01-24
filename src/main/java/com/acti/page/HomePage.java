package com.acti.page;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Script : Home Page
 * Description : Home Page Elements and Methods
 * Developed by : Sophia
 * Verified by and Date : Shantosh 1/23/23
 */

public class HomePage extends DriverScript
{

	//**********************************Page Elements******************************************
	//instead of driver.findelement use FindBy
	@FindBy(xpath ="//a[@class = 'userProfileLink username '] ") WebElement textUserLoggedIn;
	@FindBy(id="logoutLink") WebElement linkLogout;
	
	//*************************************Page Initialization*******************************************
	//create constructor
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//***************************Page Methods or Actions*************************************************************
	//create methods for each webelement, this is mandatory
	
	public String getUserLoggedIn()
	{
		return textUserLoggedIn.getText();
	}
	
	public void clickLogout()
	{
	    linkLogout.click();
	}
	
	
}
