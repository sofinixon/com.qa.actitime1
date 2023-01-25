package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Helper;

public class TaskPage extends DriverScript
{
 
	//**********************************Page Elements******************************************
	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement buttonaddnew;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement itemcreatenewcustomer;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]") WebElement textboxCustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement textareaCustomerDescription;
	@FindBy(xpath = "//div[text()='Create Customer']") WebElement buttoncreatecustomer;
	@FindBy(xpath = "//span[@class='innerHtml']") WebElement msgSuccess;
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxstarttyping;
	@FindBy(xpath = "//span[@class='highlightToken']") WebElement searchedCustomer;
	@FindBy(xpath = "(//div[@class='editButton'])[18]") WebElement buttonEdit;
	@FindBy(xpath = "(//div[@class='action'])[1]") WebElement buttonAction;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']")
	WebElement buttonDelete;
	@FindBy(xpath = "(//span[@class='submitTitle buttonTitle'])[1]") WebElement buttondeletepermantely;
	
	
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
	
	public void entercustomertype(String customername)
	{
		textboxstarttyping.sendKeys(customername);
	}
	
	public void clicksearchedcustomer()
	{
		searchedCustomer.click();
	}
	
	public void clickeditbutton()
	{
		buttonEdit.click();
		Helper.sleep();
	}
	
	public void clickactionbutton()
	{
		buttonAction.click();
		Helper.sleep();
	}
	
	public void clickdeletebutton()
	{
		buttonDelete.click();
	}
	
	public void clickdeletebuttonperm()
	{
		buttondeletepermantely.click();
		Helper.sleep();
	}
}
