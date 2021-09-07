package com.Episal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Episal.Genericlib.BaseTest;

public class AllForecastsPage {
  @FindBy(xpath="//input[@value=\"New Forecast\"]") private WebElement NewForecastTab;
	
     public AllForecastsPage()
     {
    	 PageFactory.initElements(BaseTest.driver, this);
     }
     
     public void clickNewForecastTab()
     {
    	 NewForecastTab.click();
     }
}
