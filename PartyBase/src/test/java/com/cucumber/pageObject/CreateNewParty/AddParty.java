package com.cucumber.pageObject.CreateNewParty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddParty  {

	/*public AddParty(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}*/
    private  WebDriver driver;

public AddParty(WebDriver driver){
		
	this.driver = driver;
 //   PageFactory.InitElements(browser, this);
		
	}
	
	public void clickaddparty() {
		AbstractPage.driver.findElement(By.xpath("//a[@name='addParty']")).click();
		//return new AddParty(AbstractPage.driver);
	}

	public void selectorganization() {
		WebElement organization = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyInput.PartyTypeCode']"));
		organization.sendKeys("Organization");
		organization.sendKeys(Keys.ENTER);
		//return new AddParty(AbstractPage.driver);
	}

	public void addpartyname(String arg1, String arg2) {
		AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyInput.PartyName']")).sendKeys(arg1);
		AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyInput.PartyCorrespondenceName']")).sendKeys(arg2);
		//return new AddParty(AbstractPage.driver);
	}

	public void addaddress(String arg1, String arg2, String arg3) {
		AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationAddressLine1']")).sendKeys(arg1);
		AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationCity']")).sendKeys(arg2);

		WebElement state = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationStateDropDown']"));
		state.sendKeys("MO");
		state.sendKeys(Keys.ENTER);

		AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationPostalCode']")).sendKeys(arg3);
		//return new AddParty(AbstractPage.driver);
	}

	public void clickdone() {
		AbstractPage.driver.findElement(By.xpath("//span[text()='Done']")).click();
	//	return new PartyValidation(AbstractPage.driver);

	}
}
