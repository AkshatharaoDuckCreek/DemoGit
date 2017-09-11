package com.cucumber.pageObject.CreateNewParty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchandValidate {

	private  WebDriver driver;
	public SearchandValidate(WebDriver driver){
		
		this.driver = driver;
	 //   PageFactory.InitElements(browser, this);
			
		}
	
	public void clicksearchparty() {
		AbstractPage.driver.findElement(By.xpath("//a[@name='searchParty']")).click();
		//return new AddParty(AbstractPage.driver);
	

	}
	public void adddetails(String name, String state){
		WebElement enterorg = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='SD_PartyInput.PartyTypeCode']"));
		enterorg.sendKeys("Organization");
		enterorg.sendKeys(Keys.ENTER);
		WebElement enternameaddress = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='SearchRequestWorkingData.searchType']"));
		enternameaddress.sendKeys("Name and Address");
		enternameaddress.sendKeys(Keys.ENTER);
		WebElement addname = AbstractPage.driver.findElement(By.xpath("//input[@fieldref = 'SD_PartyInput.PartyName']"));
		addname.sendKeys(name);
		WebElement addstate = AbstractPage.driver.findElement(By.xpath("//input[@fieldref = 'SD_LocationInput.LocationStateCode']"));
		addstate.sendKeys(state);
		WebElement searchbutton = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'1B2_1_1_anchorId')]"));
		searchbutton.click();
		
	}
	
	public void clickselect(String orgname){
		String name = "//div[text()='"+orgname+"']/following::a[text()='Select'][1]" ; 		
		AbstractPage.driver.findElement(By.xpath(name)).click();

	}
}
