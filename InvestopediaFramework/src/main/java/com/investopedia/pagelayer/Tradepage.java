package com.investopedia.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tradepage {
	
    private WebDriver driver;
	public Tradepage(WebDriver d)
	{
		driver=d;
	}
	
	//--obj repo--//
	
	private By company_name_textbox= By.xpath("(//input[contains(@id,'input')])[1]");
    
	private By company_option_link=By.xpath("(//div[contains(@id,'list-item')])[1]");
    
	private By action_option= By.xpath("(//input[contains(@id,'input')])[2]");
   
	private By buy_link = By.xpath("(//div[text()='Buy'])[2]");
	
	private By sell_link = By.xpath("//div[text()='Sell']");
	
	private By short_link=By.xpath("//div[text()='Short']");
	
	private By buy_to_cover_link=By.xpath("(//div[text()='Buy To Cover'])[1]");
	
	private By quantity_textbox= By.xpath("(//input[contains(@id,'input')])[3]");
	
	private By order_type_option=By.xpath("(//input[contains(@id,'input')])[4]");
	
	private By market_link=By.xpath("(//div[text()='Market'])[2]");
	
	private By limit_link=By.xpath("(//div[text()='Limit'])[1]");
	
	private By stop_limit_link=By.xpath("(//div[text()='Stop Limit'])[1]");
	
	private By trailimg_stop_link=By.xpath("(//div[text()='Trailing Stop'])[1]");
	
	private By parameter_option=By.xpath("(//input[contains(@id,'input')])[6]");
	
	private By parameter_link=By.xpath("(//div[contains(text(),'$')])[2]");
	
	private By price_textbox=By.xpath("(//input[contains(@id,'input')])[5]");
	
	private By duration_option=By.xpath("(//input[contains(@id,'input')])[5]");
	
	private By day_only_link=By.xpath("(//div[(text()='Day Only')])[2]");
		
	private By preview_order_button = By.xpath("//span[contains(text(),'Preview Order')]");
	
	private By submit_order_button = By.xpath("//span[contains(text(),'Submit Order')]");
	
	private By confirm_message_text=By.xpath("//p[@data-cy='confirmation-message']");
	
	
	//--action method--//
	
	
	
	public void enterCompanyName(String company_name)
	{
	  driver.findElement(company_name_textbox).sendKeys(company_name);
	}
	
	public void clickOnCompanyOPtionLink()
	{
		driver.findElement(company_option_link).click();
	}
		
	public void clickActionOption()
	{
		driver.findElement(action_option).click();
	}	
	
	public void clickOnBuyLink()
	{
		 driver.findElement(buy_link).click();
	}
	
	public void clickOnSellLink()
	{
		 driver.findElement(sell_link).click();
	}
		
	public void clickOnShortLink()
	{
		 driver.findElement(short_link).click();
	}
	
	public void clickOnBuyToCoverLink()
	{
		 driver.findElement(buy_to_cover_link).click();
	}
	
	public void enterQuantity(String quantity)
	{
		driver.findElement(quantity_textbox).sendKeys(quantity);
	}
	
	public void clickOnOrderTypeOption()
	{
		driver.findElement(order_type_option).click();	
	}
		
	public void clickOnMarketLink()
	{
		driver.findElement(market_link).click();			
	}

	public void clickOnLimitLink()
	{
		driver.findElement(limit_link).click();			
	}
	
	public void clickOnStopLimitLink()
	{
		driver.findElement(stop_limit_link).click();			
	}
	
	public void clickOnTrailingStopLink()
	{	
		driver.findElement(trailimg_stop_link).click();		
	}
	
	public void clickOnparameterOption()
	{
		driver.findElement(parameter_option).click();
	}
	
	public void clickOnparameterLink()
	{
		driver.findElement(parameter_link).click();
	}
	
	
	public void enterPrice(String number)
	{
		driver.findElement(price_textbox).sendKeys(number);			
	}
	
	public void clickOnDurationOption()
	{
		driver.findElement(duration_option).click();
	}
	
	public void clickOnDayOnlylink()
	{
		driver.findElement(day_only_link).click();
	}
	
	
	public void clickOnPreviewOrderButton()
	{
		driver.findElement(preview_order_button).click();
	}
	
	public void clickOnSubmitOrderButton()
	{
		driver.findElement(submit_order_button).click();
	}
	
	public String getTradeConfirmationMassageText()
	{
	    String text=driver.findElement(confirm_message_text).getText();
	    return text;
	}

}
