package com.Episal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Episal.Genericlib.BaseTest;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Forecasts']")private WebElement ForecastsTab;
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}
	
	public void clickForecastsTab()
	{
		ForecastsTab.click();
	}

}
