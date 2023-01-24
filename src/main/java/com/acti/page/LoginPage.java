package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

/*
 * Script : LoginPage
 * Description : Login Page Elements and Methods
 * Developed by : Sophia
 * Verified by and Date : Shantosh 1/2/23
 */

//we need the driver reference, so we need to connect to the base class, use extends here
public class LoginPage extends DriverScript
{
	//**********************************Page Elements******************************************
	//instead of driver.findelement use FindBy
     @FindBy(id="username") WebElement textboxusername;
     @FindBy(name="pwd") WebElement textboxpassword;
     @FindBy(xpath="//div[text()='Login ']") WebElement Loginbutton;
     @FindBy(className="atLogoImg") WebElement imgActiLogo;

//*************************************Page Initialization*******************************************
//create constructor
public LoginPage()
{
	PageFactory.initElements(driver, this);
	// to ensure that the web elements are initialized before any relevant actions are performed. 
}

//***************************Page Methods or Actions*************************************************************
//create methods for each webelement, this is mandatory

public void enterUsername(String username)
{
	textboxusername.sendKeys(username);
}

public void enterPassword(String password)
{
	textboxpassword.sendKeys(password);
}

public void clickLogin()
{
	Loginbutton.click();
}

public boolean verifyActilogo()
{
	return imgActiLogo.isDisplayed();
}

public String getLoginPageTitle()
{
	return driver.getTitle();

}

}
