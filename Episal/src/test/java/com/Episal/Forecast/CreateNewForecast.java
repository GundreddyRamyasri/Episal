package com.Episal.Forecast;

import org.testng.annotations.Test;

import com.Episal.Genericlib.BaseTest;
import com.Episal.Genericlib.FileLib;
import com.Episal.Genericlib.WebDriverCommonLib;
import com.Episal.Pages.AllForecastsPage;
import com.Episal.Pages.CreateNewForecastPage;
import com.Episal.Pages.ForecastDetailsPage;
import com.Episal.Pages.HomePage;
import com.Episal.Pages.LoginPage;
import com.Episal.Pages.ViewForecastPage;

public class CreateNewForecast extends BaseTest {
@Test
		public void forecast() throws Throwable {
		//BaseTest bt=new BaseTest();
		//bt.openbrowser();
		
		LoginPage lp = new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readpropdata(PROP_PATH, "username"), flib.readpropdata(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readpropdata(PROP_PATH, "homeTitle"), "Home Page");
		
		HomePage hp = new HomePage();
		hp.clickForecastsTab();
		
	   AllForecastsPage alf = new AllForecastsPage();
	   alf.clickNewForecastTab();
	   
	  CreateNewForecastPage nf = new CreateNewForecastPage();
	  nf.ForecastInformation();
	  
	 ForecastDetailsPage fd = new ForecastDetailsPage();
	 fd.ForecastDetailsWithValidDetails(flib.readExcelData(EXCEL_PATH, "sheet1", 6, 1));
	 

	// ForecastDetailsPage fd = new ForecastDetailsPage();
	// fd.ForecastDetailsWithValidDetails(flib.readExcelData(EXCEL_PATH, "sheet1", 7, 1));
	 
	 ViewForecastPage vf = new ViewForecastPage();
	 vf.clickeditBtn();
	 
	 ForecastDetailsPage fsd = new ForecastDetailsPage();
	 fsd.ForecastDetailsWithValidDetails(flib.readExcelData(EXCEL_PATH, "sheet1", 7, 1));
	 
		
}
				

}
