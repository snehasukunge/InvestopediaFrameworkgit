package com.investopedia.testlayer;

import org.testng.Assert;


import org.testng.annotations.Test;
import com.investopedia.pagelayer.Homepage;
import com.investopedia.pagelayer.Loginpage;
import com.investopedia.pagelayer.Portfoliopage;
import com.investopedia.pagelayer.Tradepage;
import com.investopedia.testbase.Testbase;
//import com.investopedia.utilities.ExcelUtils;

public class LoginTest extends Testbase {

/*	@Test
	public void verifyLoginTestWithValidDetails() throws InterruptedException
	{
		
		String expected_result="Portfolio - Investopedia Stock Simulator";     //when testcase previous show then thread use n pass test
		Homepage home_obj=new Homepage(driver);
		home_obj.clickOnLoginLink();
		Logger.info("object creation");
		
		
		String sheetname="Login Data";int row=1;int cell=1;
		
		Loginpage login_obj=new Loginpage(driver);
		login_obj.enterEmailAddress(ExcelUtils.readData1(sheetname,row,cell++));
		login_obj.enterPassword(ExcelUtils.readData1(sheetname,row,cell++));
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details entered and clicker signin button");
		
		Thread.sleep(5000);
		String actual_result=driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
	}
 */
	@Test
	public void verifyLoginWithInvalidDetails() throws InterruptedException
	{
		String expected_result="Invalid username or password.";
		                                                     //Simulator - Investopedia Stock Simulator
		Homepage home_obj=new Homepage(driver);
		home_obj.clickOnLoginLink();
		Logger.info("object creation");
		
		Loginpage login_obj=new Loginpage(driver);
		login_obj.enterEmailAddress("sneha@gmail.com");
		login_obj.enterPassword("Sneha");
		Thread.sleep(3000);
		login_obj.clickOnSignInButton();
		Logger.info("details entered and clicker signin button");
		
		Thread.sleep(5000);
		String actual_result=login_obj.getTextMethod();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
		
	}
	
	@Test
	public void verifyLoginWithCorrectEmailIdAndInvalidPassword() throws InterruptedException
	{
		String expected_result="Invalid username or password.";
        //Simulator - Investopedia Stock Simulator
        Homepage home_obj=new Homepage(driver);
        home_obj.clickOnLoginLink();
        Logger.info("object creation");
        
        Loginpage login_obj=new Loginpage(driver);
        login_obj.enterEmailAddress("snehasukunge@gmail.com");
        login_obj.enterPassword("Sneha");
        Thread.sleep(3000);
        login_obj.clickOnSignInButton();
        Logger.info("details entered and clicker signin button");
        
        Thread.sleep(5000);
        String actual_result=login_obj.getTextMethod();
        System.out.println(actual_result);

        Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
		
	}
	
	
	@Test
	public void verifyLoginWithEmptyDetails() throws InterruptedException
	{
		String expected_result="Invalid username or password.";
        //Simulator - Investopedia Stock Simulator
        Homepage home_obj=new Homepage(driver);
        home_obj.clickOnLoginLink();
        Logger.info("object creation");
        
        Loginpage login_obj=new Loginpage(driver);
        login_obj.enterEmailAddress("");
        login_obj.enterPassword("");
        Thread.sleep(3000);
        login_obj.clickOnSignInButton();
        Logger.info("details entered and clicker signin button");
        
        Thread.sleep(5000);
        String actual_result=login_obj.getTextMethod();
        System.out.println(actual_result);

        Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
		
	}
	
	@Test
	public void verifyLoginWithOnlyEmailId() throws InterruptedException
	{
		String expected_result="Invalid username or password.";
        //Simulator - Investopedia Stock Simulator
        Homepage home_obj=new Homepage(driver);
        home_obj.clickOnLoginLink();
        Logger.info("object creation");
        
        Loginpage login_obj=new Loginpage(driver);
        login_obj.enterEmailAddress("snehasukunge@gamil.com");
        login_obj.enterPassword("");
        Thread.sleep(3000);
        login_obj.clickOnSignInButton();
        Logger.info("details entered and clicker signin button");
        
        Thread.sleep(5000);
        String actual_result=login_obj.getTextMethod();
        System.out.println(actual_result);

        Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
		
	}
	
	@Test
	public void verifyLoginWithOnlyPassword() throws InterruptedException
	{
		String expected_result="Invalid username or password.";
        //Simulator - Investopedia Stock Simulator
        Homepage home_obj=new Homepage(driver);
        home_obj.clickOnLoginLink();
        Logger.info("object creation");
        
        Loginpage login_obj=new Loginpage(driver);
        login_obj.enterEmailAddress("");
        login_obj.enterPassword("Sneha@123");
        Thread.sleep(3000);
        login_obj.clickOnSignInButton();
        Logger.info("details entered and clicker signin button");
        
        Thread.sleep(5000);
        String actual_result=login_obj.getTextMethod();
        System.out.println(actual_result);

        Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
		
	}
	
	@Test
	public void verifyLoginWithInvalidEmailIdAndvalidPassword() throws InterruptedException
	{
		String expected_result="Invalid username or password.";
        //Simulator - Investopedia Stock Simulator
        Homepage home_obj=new Homepage(driver);
        home_obj.clickOnLoginLink();
        Logger.info("object creation");
        
        Loginpage login_obj=new Loginpage(driver);
        login_obj.enterEmailAddress("sukunge@gmail.com");
        login_obj.enterPassword("Sneha@123");
        Thread.sleep(3000);
        login_obj.clickOnSignInButton();
        Logger.info("details entered and clicker signin button");
        
        Thread.sleep(5000);
        String actual_result=login_obj.getTextMethod();
        System.out.println(actual_result);

        Assert.assertEquals(actual_result, expected_result);
		Logger.info("comparing results");
	}
}
