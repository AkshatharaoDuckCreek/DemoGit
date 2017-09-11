package com.cucumber.MavenStepDefinitions.Party;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.pageObject.CreateNewParty.AbstractPage;
import com.cucumber.pageObject.CreateNewParty.AddParty;
import com.cucumber.pageObject.CreateNewParty.LoginPage;
import com.cucumber.pageObject.CreateNewParty.SearchandValidate;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchParty {
	
	SearchandValidate search = new SearchandValidate(AbstractPage.driver);

	@When("^I click on the Search for Person or Place$")
	public void Search_for_Person_or_Place() throws Throwable {
		search.clicksearchparty();
	}

	@When("^I enter details in Search for Person or Place\"([^\"]*)\" and \"([^\"]*)\"$")
	public void search_for_a_Person_or_Place(String name, String state) throws Throwable {

		search.adddetails(name,state);
	}

	@Then("^click Select \"([^\"]*)\"$")
	public void click_Select(String orgname) throws Throwable {
		search.clickselect(orgname);
	}

}
