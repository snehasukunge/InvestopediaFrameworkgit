package com.investopedia.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.investopedia.pagelayer.Homepage;
import com.investopedia.pagelayer.Loginpage;
import com.investopedia.pagelayer.Portfoliopage;
import com.investopedia.pagelayer.Researchpage;
import com.investopedia.pagelayer.Tradepage;
import com.investopedia.testbase.Testbase;

public class ResearchTest extends Testbase {

	@Test
	public void verifyResearchTest() throws InterruptedException
	{
        String expected_result="More Info-Investopedia Stock Simulator";
		
		Homepage home_obj=new Homepage(driver);	
		Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Researchpage research_obj=new Researchpage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details entered and clicker signin buton");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnResearchLink();
		Logger.info("");
		research_obj.enterCompanyNameOption("Wip");
		Thread.sleep(1000);
		research_obj.clickOnCompanyNameLink();
		Thread.sleep(2000);
		research_obj.clickOnMoreInfoButton();
		Logger.info("enter company details");
		
		String actual_result=driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
	}
	
}
