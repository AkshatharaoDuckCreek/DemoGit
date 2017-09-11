package com.cucumber.pageObject.CreateNewParty;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import com.thoughtworks.selenium.Wait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateParty {

	private WebDriver driver;

	WebDriverWait wait = new WebDriverWait(AbstractPage.driver, 500);

	public UpdateParty(WebDriver driver) {

		this.driver = driver;
		// PageFactory.InitElements(browser, this);

	}

	public void clickAnElementByxpath(String xpath) {

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			AbstractPage.driver.findElement(By.xpath(xpath)).click();
		} catch (StaleElementReferenceException ex) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			AbstractPage.driver.findElement(By.xpath(xpath)).click();

		}
	}

	public void clickupdateparty() throws Throwable {

		WebElement workwithaddress = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'3F_2_1_anchorId')]"));
		workwithaddress.click();
		WebElement clickcorrect = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'2_1_1_anchorId')]"));
		clickcorrect.click();
	}

	public void updateaddress() throws Throwable {

		WebElement addresses = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='LocationInput.LocationCounty']"));
		addresses.sendKeys("Polk");
		addresses.sendKeys(Keys.ENTER);
		WebElement clicksave = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'B_1_1_anchorId')]"));
		clicksave.click();
		WebElement clickreturntodetails = AbstractPage.driver
				.findElement(By.xpath("//a[contains(@id,'A_1_1_anchorId')]"));
		clickreturntodetails.click();
		// a[contains(@id,'B_1_1_anchorId')]

	}

	public void updatedemography() throws Exception {

		WebElement clickdemo = AbstractPage.driver.findElement(By.xpath("//div[contains(@id,'2_1_toggleHeader')][2]"));
		clickdemo.click();
		WebElement workwithdemo = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'A_2_1_anchorId')]"));
		workwithdemo.click();
		WebElement preferredlang = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyInput.PartyPreferredLanguageCode']"));
		preferredlang.clear();
		preferredlang.sendKeys("English");
		preferredlang.sendKeys(Keys.ENTER);
		WebElement businessType = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyExtendedData.BusinessType']"));
		businessType.clear();
		businessType.sendKeys("Association");
		businessType.sendKeys(Keys.ENTER);
		WebElement typeofbusiness = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyInput.PartySubTypeCode']"));
		typeofbusiness.clear();
		typeofbusiness.sendKeys("Attorney");
		typeofbusiness.sendKeys(Keys.ENTER);
		WebElement fedtaxID = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyInput.PartyTaxId']"));
		fedtaxID.clear();
		fedtaxID.sendKeys("123456789");
		WebElement clicksave = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'59A_1_1_anchorId')]"));
		clicksave.click();
		Thread.sleep(10000);
		clickAnElementByxpath("//a[contains(@id,'1_1_anchorId')]");
	}

	public void verifydemography(String lang, String btype, String tbus, String fedtax) {
		WebElement clickdemo = AbstractPage.driver.findElement(By.xpath("//div[contains(@id,'2_1_toggleHeader')][2]"));
		clickdemo.click();
		WebElement language = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyInput.PartyPreferredLanguageCode']"));
		String preflang = language.getText();
		Assert.assertEquals(preflang, lang);

		WebElement businesstype = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyExtendedData.BusinessType']"));
		String bustype = businesstype.getText();
		Assert.assertEquals(bustype, btype);

		WebElement typeofbus = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyInput.PartySubTypeCode']"));
		String typeofb = typeofbus.getText();
		Assert.assertEquals(typeofb, tbus);

		WebElement federal = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='PartyInput.PartyTaxId']"));
		String fedid = federal.getText();
		Assert.assertEquals(fedid, fedtax);

	}

	public void addothername(String orgname, String nametype) throws Exception {
		WebElement clickdemo = AbstractPage.driver.findElement(By.xpath("//div[contains(@id,'2_1_toggleHeader')][2]"));
		clickdemo.click();
		WebElement workwithothernames = AbstractPage.driver
				.findElement(By.xpath("//a[contains(@id,'49D_2_1_anchorId')]"));
		workwithothernames.click();
		WebElement addname = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'59E_1_1_anchorId')]"));
		addname.click();
		WebElement enterorgname = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyOtherNameInput.OtherNamePartyName']"));
		enterorgname.sendKeys(orgname);
		WebElement entertypeofname = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyOtherNameInput.OtherNameTypeCode']"));
		entertypeofname.sendKeys(nametype);
		entertypeofname.sendKeys(Keys.ENTER);
		WebElement clicksave = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'BA_1_1_anchorId')]"));
		clicksave.click();
		Thread.sleep(5000);

	}

	public void verifyothername(String addedname, String typeofname) {
		WebElement verifyname = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyOtherNameInput.OtherNamePartyName']"));
		String name = verifyname.getText();
		Assert.assertEquals(name, addedname);

		WebElement verifytype = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyOtherNameInput.OtherNameTypeCode']"));
		String type = verifytype.getText();
		Assert.assertEquals(type, typeofname);

	}
	
	public void addlicense(String licensetype, String licensenum) throws Exception{
		
		WebElement clickLicense = AbstractPage.driver
				.findElement(By.xpath("//div[contains(@id,'2_1_toggleHeader')][3]"));
		clickLicense.click();

		WebElement workwithlicense = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'B8_2_1_anchorId')]"));
		workwithlicense.click();

		WebElement addlicense = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'EB_1_1_anchorId')]"));
		addlicense.click();

		WebElement addlicensetype = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyLicenseInput.LicenseTypeCode']"));
		addlicensetype.sendKeys(licensetype);
	addlicensetype.sendKeys(Keys.ENTER);

		WebElement addlicnumber = AbstractPage.driver
				.findElement(By.xpath("//input[@fieldref='PartyLicenseInput.LicenseNumber']"));
		addlicnumber.sendKeys(licensenum);

		WebElement save = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'FB_1_1_anchorId')]"));
		save.click();
		Thread.sleep(5000) ; 

	}
	
	public void verifylicense(String lictype, String licsnumb){
		WebElement verifylicType = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyLicenseInput.LicenseTypeCode']"));
		String verifylicensetype = verifylicType.getText();
		Assert.assertEquals(verifylicensetype, lictype);

		WebElement verifylicnumb = AbstractPage.driver
				.findElement(By.xpath("//div[@fieldref='PartyLicenseInput.LicenseNumber']"));
		String verlicnumber = verifylicnumb.getText();
		Assert.assertEquals(verlicnumber, licsnumb);

	}
	
	public void addmembership(String MembershipType , String MembershipID) throws Exception{
		WebElement clickmembership = AbstractPage.driver
				.findElement(By.xpath("//div[contains(@id,'2_1_toggleHeader')][3]"));
		clickmembership.click();
		
		WebElement workwithmember = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'C0_2_1_anchorId')]")); 
		workwithmember.click();
		
		WebElement addmember = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'D8_1_1_anchorId')]")); 
		addmember.click();
		
		WebElement membershiptype = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyReferenceInput.ReferenceTypeCode']")) ;
		membershiptype.sendKeys(MembershipType);
		membershiptype.sendKeys(Keys.ENTER);
		
		WebElement membershipID = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyReferenceInput.Reference']")) ;
		membershipID.sendKeys(MembershipID);
		
		WebElement save = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'DF_1_1_anchorId')]")); 
		save.click() ; 
		Thread.sleep(5000) ; 
		
	}
	
	public void verifymembership(String MembershipType, String MembershipID){
		
		
		  WebElement verifymembershiptype = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='PartyReferenceInput.ReferenceTypeCode']")) ; 
		  String membershiptype = verifymembershiptype.getText() ; 
		  Assert.assertEquals(membershiptype, MembershipType);
		  
		  WebElement verifymembershipID = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='PartyReferenceInput.Reference']")) ; 
		  String membershipID = verifymembershipID.getText() ; 
		
		  
		  Assert.assertEquals(membershipID,MembershipID);
	}
	
public void addphnum(String PhoneNum) throws Exception{
		
		WebElement clickphones = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'44D_2_1_anchorId')]")) ; 
		clickphones.click(); 
		WebElement addaphone =  AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'F7_1_1_anchorId')]")) ; 
		addaphone.click();
		WebElement addtype = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyPhoneInput.PhoneTypeCode']")) ; 
		addtype.sendKeys("Business");
		addtype.sendKeys(Keys.ENTER);
		WebElement addphnum = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyPhoneInput.PhoneNumber']")); 
		addphnum.sendKeys(PhoneNum);
		WebElement save = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'7_1_1_anchorId')]")) ; 
		save.click();
	//	WebElement returntopeople = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'F8_1_1_anchorId')]")) ; 
		//returntopeople.click(); 
		clickAnElementByxpath("//a[contains(@id,'1_1_anchorId')]");
		Thread.sleep(5000);
		
	} 
	
	public void addemail(String email){
		
		WebElement clickemail =  AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'59_2_1_anchorId')]")) ; 
	//WebElement clickemail =  AbstractPage.driver.findElement(By.partialLinkText("email"));
		clickemail.click();
		WebElement clickaddanemail = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'55_1_1_anchorId')]")) ; 
		clickaddanemail.click();
		WebElement emailtypecode = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyEmailInput.EmailTypeCode']")) ; 
		emailtypecode.sendKeys("Business");
		emailtypecode.sendKeys(Keys.ENTER);
		WebElement enteremailadd = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='PartyEmailInput.EmailAddress']")) ; 
		enteremailadd.sendKeys(email);
		WebElement saveemail = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'1_1_1_anchorId')]")) ;
		saveemail.click();
		//WebElement returntopeoplefromemail = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'F8_1_1_anchorId')]")) ; 
		clickAnElementByxpath("//a[contains(@id,'1_1_anchorId')]");
		
	}
	
	public void verifyphnum(String phnum){
		
		WebElement verifyph = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='PartyPhoneInput.PhoneNumber']")) ; 
		String updatedph = verifyph.getText() ; 
		Assert.assertEquals(phnum, updatedph);
	}
	
	public void verifyemail(String email){
		
		
		WebElement verifyemail = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='PartyEmailInput.EmailAddress']")) ; 
		String updatedemail = verifyemail.getText() ; 
		Assert.assertEquals(email, updatedemail);
	}
	public void addlocation(String address, String city, String state, String zipcode){
		WebElement clicklocation = AbstractPage.driver.findElement(By.xpath("//div[contains(@id,'45C_2_1_toggleHeaderInner')]")) ; 
		clicklocation.click();
		WebElement clickworkwithlocation = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'68_2_1_anchorId')]")) ; 
		clickworkwithlocation.click();
		WebElement clickaddloc = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'EF_1_1_anchorId')]")) ; 
		clickaddloc.click();
		WebElement inputaddress = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationAddressLine1']"));
		inputaddress.sendKeys(address);
		WebElement inputcity = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationCity']"));
		inputcity.sendKeys(city);
		WebElement inputstate = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationStateDropDown']"));
		inputstate.sendKeys(state);
		inputstate.sendKeys(Keys.ENTER);
		WebElement inputzipcode = AbstractPage.driver.findElement(By.xpath("//input[@fieldref='LocationInput.LocationPostalCode']"));
		inputzipcode.sendKeys(zipcode);
		WebElement clicksave = AbstractPage.driver.findElement(By.xpath("//a[contains(@id,'30_1_1_anchorId')]")) ; 
		clicksave.click();
	}
	
	public void verifyaddedlocation(String address){
		WebElement verifyaddress = AbstractPage.driver.findElement(By.xpath("//div[@fieldref='AllLocationInvolvements.DisplayLocationInTableView']"));
		String actualaddress =  verifyaddress.getText() ; 
		//Assert.IsTrue(actualaddress.contains(address));

		Assert.assertTrue(actualaddress.contains(address));
	}
	
}
