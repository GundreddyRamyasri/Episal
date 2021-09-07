package com.Episal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Episal.Genericlib.BaseTest;

public class ViewForecastPage {
	@FindBy(xpath="//input[@value='Edit']") private WebElement editBtn;

	public ViewForecastPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickeditBtn() {
		editBtn.click();
	}
}
