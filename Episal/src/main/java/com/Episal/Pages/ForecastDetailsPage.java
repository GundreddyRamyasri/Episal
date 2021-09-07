package com.Episal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Episal.Genericlib.BaseTest;

public class ForecastDetailsPage {

	@FindBy(xpath="//input[@name='forecastQuota1']") private WebElement quotaTab;
	@FindBy(xpath="//input[@value='Save']") private WebElement saveBtn;
	
	public ForecastDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void ForecastDetailsWithValidDetails(String quota) 
	{
		quotaTab.sendKeys(quota);
		saveBtn.click();
	}
	
	


}
