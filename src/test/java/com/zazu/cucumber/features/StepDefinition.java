package com.zazu.cucumber.features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	private WebDriver driver;

	@Before
	public void setUpDriver() {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDownDriver() {
		driver.close();
	}

	@Given("^I am on the Zoo website$")
	public void i_am_on_the_Zoo_website() throws Throwable {
		driver.navigate().to("http://thetestroom.com/webapp/");
	}

	@When("^I click on the About link$")
	public void i_click_on_the_About_link() throws Throwable {
		driver.findElement(By.id("about_link")).click();
	}

	@Then("^I see the header displaying \"(.*?)\"$")
	public void i_see_the_header_displaying(String header) throws Throwable {
		Assert.assertEquals(header, driver.findElement(By.cssSelector("td.content > h1")).getText());
	}
}