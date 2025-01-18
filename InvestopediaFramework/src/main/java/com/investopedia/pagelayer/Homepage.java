package com.investopedia.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	private WebDriver driver;
	public Homepage(WebDriver d)
	{
		driver=d;
	}
	
	//----obj repo---//
	
	private By get_started_link=By.xpath("(//span[contains(text(),'GET STARTED')])[1]");
	private By login_link=By.xpath("//span[contains(text(),'LOG IN')]");
	
	//----action method----//
	public void clickOnGetStartedLink()
	{
	  driver.findElement(get_started_link).click();
	}
	
	public void clickOnLoginLink()
	{
	  driver.findElement(login_link).click();
	}
	
}
