package com.Episal.Genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts {
	
	public static WebDriver driver;
	
 @BeforeClass
	public void openbrowser() throws Throwable
	{
	FileLib flib = new FileLib();
	String browserName = flib.readpropdata(PROP_PATH, "browser");
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		 driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		 driver = new FirefoxDriver();	
	}
	else
	{
		System.out.println("Enter Proper Browser");
	}
	driver.manage().window().maximize();
	
	String testurl = flib.readpropdata(PROP_PATH, "url");
	driver.get(testurl);
	
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	wlib.verify(wlib.getPageTitle(),flib.readpropdata(PROP_PATH, "logintitles"),"Login Page");
	
	}
	
 @AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
