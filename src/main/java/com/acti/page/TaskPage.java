package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskPage extends DriverScript
{
 
	//**********************************Page Elements******************************************
	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement buttonaddnew;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement itemcreatenewcustomer;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]") WebElement textboxCustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement textareaCustomerDescription;
	@FindBy(xpath = "//div[text()='Create Customer']") WebElement buttoncreatecustomer;
	@FindBy(xpath = "//span[@class='innerHtml']") WebElement msgSuccess;
	
	
	//*************************************Page Initialization*******************************************
	//create constructor
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//***************************Page Methods or Actions*************************************************************
	//create methods for each webelement, this is mandatory
	
	public void clickaddnewbutton()
	{
		buttonaddnew.click();
	}
	
	public void clickcreatenewcustomer()
	{
		itemcreatenewcustomer.click();
	}
	
	public void entercustomername(String custname)
	{
		textboxCustomerName.sendKeys(custname);
	}
	
	public void entercustomerdescription(String custdesc )
	{
		textareaCustomerDescription.sendKeys(custdesc);
	}
	
	public void clickcreatecustomer()
	{
		buttoncreatecustomer.click();
	}
	
	public String getSuccessMessage()
	{
		return msgSuccess.getText();
	}
}
