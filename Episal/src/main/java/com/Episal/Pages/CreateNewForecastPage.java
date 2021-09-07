package com.Episal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Episal.Genericlib.BaseTest;
import com.Episal.Genericlib.WebDriverCommonLib;

public class CreateNewForecastPage {
	@FindBy(xpath="//select[@id='forecastYear']") private WebElement yearTab;
	@FindBy(xpath="//select[@id='forecastQuarter']") private WebElement quarterTab;
	@FindBy(xpath="//input[@value='Next']") private WebElement nextBtn;
	
	
	public CreateNewForecastPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void ForecastInformation()
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
				//wlib.selectOption("2008", yearTab);
				//wlib.selectOption("2009", yearTab);
				wlib.selectOption("2010", yearTab);
				//wlib.selectOption("Q4", quarterTab);
				//wlib.selectOption("Q4", quarterTab);
				//wlib.selectOption("Q1", quarterTab);
				wlib.selectOption("Q2", quarterTab);
				nextBtn.click();
	}

}
