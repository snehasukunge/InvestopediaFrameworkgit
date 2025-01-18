package com.investopedia.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Researchpage {

	public Researchpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//---obj---//
	
    private @FindBy(xpath="//input[contains(@id,'input')]")
	WebElement company_name_option;
	
    private @FindBy(xpath="(//div[contains(@id,'list-item')])[1]")
	WebElement company_name_link;
	
	
    private @FindBy(xpath="(//button[@this-value='WIP'])[2]")
    WebElement more_info_button;
	
   
	
	
	//---action method----//
	
	public void enterCompanyNameOption(String company_name)
	{
		company_name_option.sendKeys(company_name);
	}
	
	public void clickOnCompanyNameLink()
	{
		company_name_link.click();
	}
	
	public void clickOnMoreInfoButton()
	{
		more_info_button.click();
	}
	
}