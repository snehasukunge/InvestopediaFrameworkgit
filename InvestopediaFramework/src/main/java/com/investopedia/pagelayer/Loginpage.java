package com.investopedia.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	private WebDriver driver;
    public Loginpage(WebDriver d)
     {
	   driver=d;
     }
 
 //---obj repo---//
 
    private By email_address_textbox=By.xpath("//input[@id='username']");
    private By password_textbox=By.xpath("//input[@id='password']");
    private By sign_in_button=By.xpath("//input[@id='login']");
    private By get_text=By.xpath("//span[text()='Invalid username or password.']");
    
 //---action method---//
 
    public void enterEmailAddress(String email_address)
     {
	   driver.findElement(email_address_textbox).sendKeys(email_address);
     }
    
    public void enterPassword(String password)
    {
	   driver.findElement(password_textbox).sendKeys(password);
    }
    
    public void clickOnSignInButton()
    {
	   driver.findElement(sign_in_button).click();
    }
    
    
    public String getTextMethod()
    {
       String text= driver.findElement(get_text).getText();
       return text;
    }
    
}
