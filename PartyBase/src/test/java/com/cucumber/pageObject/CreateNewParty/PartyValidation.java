package com.cucumber.pageObject.CreateNewParty;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PartyValidation  {

	/*public PartyValidation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/
	
	private  WebDriver driver;
	public PartyValidation(WebDriver driver){
		
		this.driver = driver;
	 //   PageFactory.InitElements(browser, this);
			
		}
	public void verifypartyname(String arg1){
	WebElement actualvalue = AbstractPage.driver.findElement(By.xpath("//div[@fieldref = 'PartyInput.PartyName']"));
	String result = actualvalue.getText();

	Assert.assertEquals(result, arg1);
//	return new PartyValidation(driver);
	
}
}