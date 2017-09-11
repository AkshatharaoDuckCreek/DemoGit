package com.cucumber.pageObject.CreateNewParty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public void login(String uname, String pwd) {

		WebElement username = AbstractPage.driver.findElement(By.id("username"));
		username.sendKeys(uname);
		WebElement password = AbstractPage.driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		WebElement clicklogin = AbstractPage.driver.findElement(By.xpath("//span[text()='Login']"));
		clicklogin.click();

	}

	public void navigateToAddParty() {

		AbstractPage.driver.findElement(By.id("Party")).click();

	}

}
