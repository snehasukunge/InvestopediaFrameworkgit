package com.investopedia.testlayer;

import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.investopedia.pagelayer.Homepage;
import com.investopedia.pagelayer.Registerpage;
import com.investopedia.testbase.Testbase;
//import com.investopedia.utilities.ExcelUtils;

public class RegisterTest extends Testbase {

/*	@Test
	public void verifyRegisterTestWithValidDetails() throws InterruptedException
	{
		String expected_result="Register for Simulator | Investopedia";       //Email verification | Investopedia showing Register for Simulator | Investopedia
		
		Homepage home_obj=new Homepage(driver);
		Registerpage register_obj=new Registerpage(driver);
		Logger.info("object creation");
		ExcelUtils data=new ExcelUtils();
		
		String sheetname="Register Data";int row = 1;int cell = 1;
		
		home_obj.clickOnGetStartedLink();
		register_obj.enterEmailAddress(data.readData(sheetname,row,cell++));
		register_obj.enterUsername(data.readData(sheetname,row,cell++));
		register_obj.enterPassword(data.readData(sheetname,row,cell++));
		register_obj.enterConfirmPassword(data.readData(sheetname,row,cell++));
		Thread.sleep(3000);
		register_obj.clickOnRegisterButton();
		Logger.info("enter info details");
		
		String actual_result=driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result,expected_result);           //failtestcase 
		Logger.info("comparing results");
	}
	
*/	

	@Test
	public void verifyRegisterTestWithInValidDetails() throws InterruptedException
	{
		String expected_result="Email already exists.";       //showing Register for Simulator | Investopedia
		
		Homepage home_obj=new Homepage(driver);
		Registerpage register_obj=new Registerpage(driver);
		Logger.info("object creation");
		
		home_obj.clickOnGetStartedLink();
		register_obj.enterEmailAddress("sneha98@gmail.com");
		register_obj.enterUsername("sukunge_sss");
		register_obj.enterPassword("Admin@1112");
		register_obj.enterConfirmPassword("Admin@1112");
		Thread.sleep(3000);
		register_obj.clickOnRegisterButton();
		Logger.info("enter info details");
		

		String actual_result=driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result,expected_result);           //failtestcase 
		Logger.info("comparing results");
	}
}
	/*
	@Test(dataProvider = "Register_Data")
	public void verifyRegisterTestWithDataParameter(String email,String username,String password,String confirm_password) throws InterruptedException
	{
        String expected_result="Register for Simulator | Investopedia";
		
		Homepage home_obj=new Homepage(driver);
		Registerpage register_obj=new Registerpage(driver);
//		Logger.info("object creation");
			
		home_obj.clickOnGetStartedLink();
		register_obj.enterEmailAddress(email);
		register_obj.enterUsername(username);
		register_obj.enterPassword(password);
		register_obj.enterConfirmPassword(confirm_password);
		Thread.sleep(3000);
		register_obj.clickOnRegisterButton();
	//	Logger.info("enter info details");
		

		String actual_result=driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result,expected_result);           //failtestcase 
	//	Logger.info("comparing results");
	}


@DataProvider(name="Register_Data")

public String [][] getData()
{
	ExcelUtils data=new ExcelUtils();
	int row_count=11;
	int cell_count=4;
	
	String FrameworktestData[][]=new String[row_count-1][cell_count-1];
	
for(int i=1;i<row_count;i++)
{
	for(int j=0;j<cell_count;j++)
	{
		FrameworktestData[i-1][j]= data.readData("Register Data", i, j);
	}
}
	return FrameworktestData;
}

@Test(dataProvider="Register_Data")
public void test(String username,String email,String password,String confirm_password)
{
	System.out.println("username:-"+username);
	System.out.println("email:-"+email);
	System.out.println("password:-"+password);
	System.out.println("confirm_password:-"+confirm_password);
	
}
}




@DataProvider(name = "Register_Data")
public String[][] getData()
{
	ExcelUtils data = new ExcelUtils();
	
	int row_count = 11;
	int cell_count = 4;
	
	String testdata[][] = new String[row_count-1][cell_count-1];
	
	for(int i=1;i<row_count;i++)
	{
		for(int j=0;j<cell_count;j++)
		{
			testdata[i-1][j]= data.readData("RegisterData", i, j);
		}
	}	
	return testdata;
}

@Test(dataProvider = "Register_Data")
public void test(String email, String uname, String pass, String cpass)
{
	System.out.println("Email :- "+email);
	System.out.println("username :- "+uname);
	System.out.println(pass);
	System.out.println(cpass);
	
}
*/