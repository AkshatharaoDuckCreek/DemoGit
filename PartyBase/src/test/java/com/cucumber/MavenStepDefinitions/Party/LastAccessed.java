package com.cucumber.MavenStepDefinitions.Party;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.cucumber.pageObject.CreateNewParty.AbstractPage;
import com.cucumber.pageObject.CreateNewParty.ClickLastAccess;
import com.cucumber.pageObject.CreateNewParty.SearchandValidate;
import com.cucumber.pageObject.CreateNewParty.UpdateParty;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LastAccessed {

	ClickLastAccess lastaccess = new ClickLastAccess(AbstractPage.driver);

	@When("^I select the recently created organization \"([^\"]*)\"$")
	public void i_select_the_recently_created_organization(String orgname) throws Throwable {

		lastaccess.selectcreatedparty(orgname) ; 

	}

	@Then("^I verify the organization \"([^\"]*)\" created$")
	public void i_verify_the_organization_created(String orgname) throws Throwable {
		
		lastaccess.verifyselectedparty(orgname) ; 

	}

}
