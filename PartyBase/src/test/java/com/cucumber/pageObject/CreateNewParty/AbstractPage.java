package com.cucumber.pageObject.CreateNewParty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AbstractPage {

	public static WebDriver driver;
	// public static Object AbstractPage;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;

	}
}
