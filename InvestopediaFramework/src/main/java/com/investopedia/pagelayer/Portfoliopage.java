package com.investopedia.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portfoliopage {

	public Portfoliopage(WebDriver d)
	{
		PageFactory.initElements(d,this);
	}
	
	//--obj repo---//
	
	
	
	private @FindBy(xpath="//a[@id='v-step-trade-nav']")
	WebElement trade_link;
	

	private @FindBy(xpath="//a[@id='v-step-research-nav']")
	WebElement research_link;
	
	
	
	//----action method---//
	
	
	
	public void clickOnTradeLink()
	{
		trade_link.click();
	}
	

	public void clickOnResearchLink()
	{
		research_link.click();
	}
	
}
