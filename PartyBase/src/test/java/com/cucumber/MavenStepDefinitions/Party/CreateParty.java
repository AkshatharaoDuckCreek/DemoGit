package com.cucumber.MavenStepDefinitions.Party;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import com.cucumber.pageObject.CreateNewParty.AbstractPage;
import com.cucumber.pageObject.CreateNewParty.AddParty;
import com.cucumber.pageObject.CreateNewParty.LoginPage;
import com.cucumber.pageObject.CreateNewParty.PartyValidation;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateParty {

	LoginPage login;
	AddParty addparty = new AddParty(AbstractPage.driver);
	PartyValidation validate = new PartyValidation(AbstractPage.driver);;

	@Before
	public void launchbrowser() {
		AbstractPage.driver = new FirefoxDriver();
		String url = "https://pcdev03.accs54683.asw.accenture.com:8080/BASE_Express/default.aspx";

		AbstractPage.driver.get(url);
		AbstractPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	
	public void closebrowser(){
		AbstractPage.driver.close();
	
	}

	@Given("^The application is launched is with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login(String arg1, String arg2) throws Throwable {
		login = new LoginPage();
		login.login(arg1, arg2);
	}

	@When("^I click on Party button$")
	public void i_click_on_Party_button() throws Throwable {

		login.navigateToAddParty();

	}

	@When("^I click on Add new Person Or Place$")
	public void i_click_on_Add_new_Person_Or_Place() throws Throwable {

		// addparty(AbstractPage.driver) ;
		addparty.clickaddparty();
	}

	@When("^I select organization$")
	public void i_select_organization() throws Throwable {

		addparty.selectorganization();

	}

	@When("^I enter the  partyname \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_partyname_and(String arg1, String arg2) {

		addparty.addpartyname(arg1, arg2);
	}

	@When("^I enter the address \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_and_and(String arg1, String arg2, String arg3) throws Throwable {

		addparty.addaddress(arg1, arg2, arg3);
	}

	@When("^I click on Done$")
	public void i_click_on_Done() throws Throwable {

		addparty.clickdone();
	}

	@Then("^Verify the \"([^\"]*)\" created$")
	public void verify_the_Party_created(String arg1) throws Throwable {

		validate.verifypartyname(arg1);

	}

}
