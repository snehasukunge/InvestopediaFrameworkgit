package com.investopedia.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registerpage {

	private WebDriver driver;
	public Registerpage(WebDriver d)
	{
		driver=d;
	}
	
	//---obj repo--//
	
	private By email_address_textbox=By.xpath("//input[@id='email']");
	private By username_textbox=By.xpath("//input[@id='username']");
	private By password_textbox=By.xpath("//input[@id='password']");
	private By confirm_password_textbox=By.xpath("//input[@id='password-confirm']");
	private By register_button=By.xpath("//input[@id='register']");
	private By get_text=By.xpath("//span[text()='Email already exists.']");
	
	
	//---action method---//
	
	public void enterEmailAddress(String email_address)
	{
		driver.findElement(email_address_textbox).sendKeys(email_address);
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(username_textbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_textbox).sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirm_password)
	{
		driver.findElement(confirm_password_textbox).sendKeys(confirm_password);
	}
	
	public void clickOnRegisterButton()
	{
		driver.findElement(register_button).click();
	}
	
	public String getTextMethod()
	{
		String text=driver.findElement(get_text).getText();
		return text;
	}
}
