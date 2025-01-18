package com.investopedia.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.investopedia.pagelayer.Homepage;
import com.investopedia.pagelayer.Loginpage;
import com.investopedia.pagelayer.Portfoliopage;
import com.investopedia.pagelayer.Tradepage;
import com.investopedia.testbase.Testbase;

public class TradeTest extends Testbase {


    @Test
	public void verifyBuyTradetest() throws InterruptedException
	{
		String expected_result="Buy Market order for WIT received.";
		
		Homepage home_obj=new Homepage(driver);	
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Loginpage login_obj=new Loginpage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		
		trade_obj.enterCompanyName("wipro");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(2000);
		trade_obj.clickActionOption();
		Thread.sleep(1000);
		trade_obj.clickOnBuyLink();
		trade_obj.enterQuantity("5");
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
}
 
    @Test
    public void verifySellTradeTest() throws InterruptedException
    {
    	String expected_result="Sell Market order for WIT received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		
		trade_obj.enterCompanyName("WIT");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		trade_obj.clickOnSellLink();
		trade_obj.enterQuantity("4");
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");

    }
   
    @Test
    public void verifyShortTradeTest() throws InterruptedException
    {
    	String expected_result="Short Market order for TXNM received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		
		trade_obj.enterCompanyName("TXNM");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		trade_obj.clickOnShortLink();
		trade_obj.enterQuantity("5");
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");

    }
  
    @Test
    public void verifyBuyToCoverTradeTest() throws InterruptedException
    {
    	String expected_result="Buy To Cover Market order for TSL received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		
		trade_obj.enterCompanyName("TSL");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(1000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.clickOnBuyToCoverLink();
		trade_obj.enterQuantity("5");
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }

    @Test
    public void verifyMarketTradeTest() throws InterruptedException
    {
    	String expected_result="Buy Market order for TXT received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		
		trade_obj.enterCompanyName("TXT");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(1000);
//	    trade_obj.clickOnBuyLink();
		trade_obj.enterQuantity("5");
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnMarketLink();
		Thread.sleep(2000);
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnDayOnlylink();
		Thread.sleep(1000);
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
    
  
    @Test
    public void verifyLimitTradeTest() throws InterruptedException
    {
    	String expected_result="Buy Limit order for NVD received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		trade_obj.enterCompanyName("NVD");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.enterQuantity("10");
		
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnLimitLink();
		trade_obj.enterPrice("1000");
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
    
  @Test
    public void verifySellLimitTradeTest() throws InterruptedException
    {
    	String expected_result="Sell Limit order for NVDA received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		trade_obj.enterCompanyName("NVDA");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.clickOnSellLink();
		trade_obj.enterQuantity("5");
		
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnLimitLink();
		trade_obj.enterPrice("10000");
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
      
    
  @Test
    public void verifyShortLimitTradeTest() throws InterruptedException
    {
    	String expected_result="Short Limit order for WMT received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		trade_obj.enterCompanyName("WMT");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.clickOnShortLink();
		trade_obj.enterQuantity("5");
		
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnLimitLink();
		trade_obj.enterPrice("1000");
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
    
    
    @Test
    public void verifyBuyStopLimitTradeTest() throws InterruptedException
    {
    	String expected_result="Buy Stop Limit order for GOOGL received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		trade_obj.enterCompanyName("GOOGL");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.enterQuantity("2");
		
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnStopLimitLink();
		trade_obj.enterPrice("10000");
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
    
    
    @Test
    public void verifyBuyToCoverStopLimitTradeTest() throws InterruptedException
    {
    	String expected_result="Buy To Cover Stop Limit order for GOOGL received.";
    	Homepage home_obj=new Homepage(driver);	
    	Loginpage login_obj=new Loginpage(driver);
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		trade_obj.enterCompanyName("GOOGL");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.clickOnBuyToCoverLink();
		trade_obj.enterQuantity("2");
		
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnStopLimitLink();
		trade_obj.enterPrice("10000");
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
  
	  @Test
	    public void verifyShortStopLimitTradeTest() throws InterruptedException
	    {
	    	String expected_result="Short Stop Limit order for TSL received.";
	    	Homepage home_obj=new Homepage(driver);	
	    	Loginpage login_obj=new Loginpage(driver);
			Portfoliopage portfolio_obj=new Portfoliopage(driver);
			Tradepage trade_obj=new Tradepage(driver);
			Logger.info("object creation");
			
			home_obj.clickOnLoginLink();
			
			login_obj.enterEmailAddress("snehasukunge@gmail.com");
			login_obj.enterPassword("Sneha@123");
			Thread.sleep(3000);
			login_obj.clickOnSignInButton();
			Logger.info("details enter and clicker signin button");
			
			Thread.sleep(5000);
			portfolio_obj.clickOnTradeLink();
			Thread.sleep(3000);
			trade_obj.enterCompanyName("TSL");
		    Thread.sleep(2000);
			trade_obj.clickOnCompanyOPtionLink();
			Thread.sleep(3000);
			trade_obj.clickActionOption();
			Thread.sleep(2000);
			trade_obj.clickOnShortLink();
			trade_obj.enterQuantity("7");
			
			trade_obj.clickOnOrderTypeOption();
			trade_obj.clickOnStopLimitLink();
			trade_obj.enterPrice("1000");
			trade_obj.clickOnDurationOption();
			trade_obj.clickOnPreviewOrderButton();
			Thread.sleep(3000);
			trade_obj.clickOnSubmitOrderButton();
			Logger.info("cliker trade link and all details entered and clicker submit button");
			
			String actual_result=trade_obj.getTradeConfirmationMassageText();
			System.out.println(actual_result);
			
			Assert.assertEquals(expected_result,actual_result);
			Logger.info("comparing results");
			
	    }
	    
	
    @Test
    public void verifyTrailingStopTradeTest() throws InterruptedException
    {
    	String expected_result="Buy To Cover order for IBM received.";
    	Homepage home_obj=new Homepage(driver);	
		Portfoliopage portfolio_obj=new Portfoliopage(driver);
		Tradepage trade_obj=new Tradepage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnLoginLink();
		Loginpage login_obj=new Loginpage(driver);
		login_obj.enterEmailAddress("snehasukunge@gmail.com");
		login_obj.enterPassword("Sneha@123");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details enter and clicker signin button");
		
		Thread.sleep(5000);
		portfolio_obj.clickOnTradeLink();
		Thread.sleep(3000);
		trade_obj.enterCompanyName("IBM");
	    Thread.sleep(2000);
		trade_obj.clickOnCompanyOPtionLink();
		Thread.sleep(3000);
		trade_obj.clickActionOption();
		Thread.sleep(2000);
		trade_obj.clickOnBuyToCoverLink();
		trade_obj.enterQuantity("2");
		
		trade_obj.clickOnOrderTypeOption();
		trade_obj.clickOnTrailingStopLink();
		trade_obj.clickOnparameterOption();
		Thread.sleep(1000);
		trade_obj.clickOnparameterLink();
		trade_obj.enterPrice("2");
		trade_obj.clickOnDurationOption();
		trade_obj.clickOnPreviewOrderButton();
		Thread.sleep(3000);
		trade_obj.clickOnSubmitOrderButton();
		Logger.info("cliker trade link and all details entered and clicker submit button");
		
		String actual_result=trade_obj.getTradeConfirmationMassageText();
		System.out.println(actual_result);
		
		Assert.assertEquals(expected_result,actual_result);
		Logger.info("comparing results");
		
    }
   
}