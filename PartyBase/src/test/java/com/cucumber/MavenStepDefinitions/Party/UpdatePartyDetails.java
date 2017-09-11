package com.cucumber.MavenStepDefinitions.Party;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import com.cucumber.pageObject.CreateNewParty.AbstractPage;
import com.cucumber.pageObject.CreateNewParty.SearchandValidate;
import com.cucumber.pageObject.CreateNewParty.UpdateParty;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdatePartyDetails {

	UpdateParty update = new UpdateParty(AbstractPage.driver);

	@When("^The user update the address of the party$")
	public void the_user_update_the_address_of_the_party() throws Throwable {
		update.clickupdateparty();

	}

	@Then("^The address of the party should be updated successfully$")
	public void the_address_of_the_party_should_be_updated_successfully() throws Throwable {
		update.updateaddress();

	}

	@When("^The user update the demographics of the party$")
	public void the_user_update_the_demographics_of_the_party() throws Throwable {
		update.updatedemography();
	}

	@Then("^The demographics of the party should be updated successfully \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void the_demographics_of_the_party_should_be_updated_successfully(String lang, String btype, String tbus,
			String fedtax) throws Throwable {

		update.verifydemography(lang, btype, tbus, fedtax);

	}

	@When("^The user update the \"([^\"]*)\" and \"([^\"]*)\" of the party$")
	public void the_user_update_the_and_of_the_party(String orgname, String nametype) throws Throwable {

		update.addothername(orgname, nametype);
	}

	@Then("^The othername of the party should be updated successfully \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_othername_of_the_party_should_be_updated_successfully(String addedname, String typeofname)
			throws Throwable {
		update.verifyothername(addedname, typeofname);

	}

	@When("^the username update the license \"([^\"]*)\" \"([^\"]*)\"of the party$")
	public void the_username_update_the_license_of_the_party(String licensetype, String licensenum) throws Throwable {
		update.addlicense(licensetype, licensenum);
	}

	@Then("^the license must get updated sucessfully \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_license_must_get_updated_sucessfully(String lictype, String licsnumb) throws Throwable {

		update.verifylicense(lictype, licsnumb);
	}

	@When("^the username update the membership \"([^\"]*)\" \"([^\"]*)\"of the party$")
	public void the_username_update_the_membership_of_the_party(String MembershipType, String MembershipID)
			throws Throwable {
		update.addmembership(MembershipType, MembershipID);

	}

	@Then("^the membership must get updated sucessfully \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_membership_must_get_updated_sucessfully(String MembershipType, String MembershipID)
			throws Throwable {
		update.verifymembership(MembershipType, MembershipID);
	}

	/*
	 * @When("^the username update the relationship \"([^\"]*)\" of the party$")
	 * public void the_username_update_the_relationship_of_the_party(String
	 * RelationshipTypeCode) throws Throwable {
	 * 
	 * WebElement clickonrelationships =
	 * AbstractPage.driver.findElement(By.xpath(
	 * "//div[contains(@id,'2_1_toggleHeader')][4]"));
	 * clickonrelationships.click(); WebElement workwithrelationship =
	 * AbstractPage.driver.findElement(By.xpath(
	 * "//a[contains(@id,'CB_2_1_anchorId')]")) ; workwithrelationship.click();
	 * WebElement addarelationship = AbstractPage.driver.findElement(By.xpath(
	 * "//a[contains(@id,'60D_1_1_anchorId')]")) ; addarelationship.click();
	 * WebElement enterrelationship = AbstractPage.driver.findElement(By.xpath(
	 * "//input[@fieldref='PartyRelationshipInput.RelationshipTypeCode']"));
	 * enterrelationship.sendKeys(RelationshipTypeCode);
	 * enterrelationship.sendKeys(Keys.ENTER); WebElement clickrelatedpartyname
	 * = AbstractPage.driver.findElement(By.xpath(
	 * "//a[contains(@id,'17_1_1_anchorId')]")) ; clickrelatedpartyname.click();
	 * 
	 * }
	 * 
	 * @Then(
	 * "^the relationship must get updated sucessfully \"([^\"]*)\" \"([^\"]*)\"$"
	 * ) public void the_relationship_must_get_updated_sucessfully(String
	 * RelationshipTypeCode, String relationshipname) throws Throwable {
	 * 
	 * }
	 */

	@When("^update the phonenumber \"([^\"]*)\" for the party$")
	public void update_the_phonenumber_email_for_the_party(String PhoneNum) throws Throwable {
		update.addphnum(PhoneNum);
		
		
	}

	@Then("^the phonenumber \"([^\"]*)\" must get updated successfully$")
	public void the_phonenumber_email_must_get_updated_successfully(String phnum) throws Throwable {
	   
		update.verifyphnum(phnum);
		
	}

	@When("^update the email \"([^\"]*)\" for the party$")
	public void update_the_email_for_the_party(String email) throws Throwable {
		update.addemail(email);
	}

	@Then("^the email \"([^\"]*)\" must get updated successfully$")
	public void the_email_must_get_updated_successfully(String email) throws Throwable {
		update.verifyemail(email);
	}

	@When("^update the Address \"([^\"]*)\" city \"([^\"]*)\"state\"([^\"]*)\"zipcode \"([^\"]*)\" for the party$")
	public void updatelocation(String address, String city, String state, String zipcode) throws Throwable {

		update.addlocation(address, city, state, zipcode);

	}

	@Then("^the Address \"([^\"]*)\" must get updated successfully$")
	public void verifylocation(String address) throws Throwable {

		update.verifyaddedlocation(address);

	}

}
