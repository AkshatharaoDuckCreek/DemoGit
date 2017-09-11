package com.cucumber.pageObject.CreateNewParty;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickLastAccess {

	
	
	private WebDriver driver;

	WebDriverWait wait = new WebDriverWait(AbstractPage.driver, 500);

	public ClickLastAccess(WebDriver driver) {

		this.driver = driver;
		// PageFactory.InitElements(browser, this);

	}
	
	public void selectcreatedparty(String orgname){
		
		WebElement createdparty = AbstractPage.driver.findElement(By.linkText(orgname));
		createdparty.click();
		
	}

	public void verifyselectedparty(String orgname){
		
		WebElement verifyparty = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='PartyInput.PartyName']"));
		String partyname = verifyparty.getText();

		Assert.assertEquals(orgname, partyname);

		
	}
	
}
