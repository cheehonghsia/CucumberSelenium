package com.zazu.cucumber.features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zazu.cucumber.WebdriverInitializer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Check_Title {

	WebDriver driver = WebdriverInitializer.getWebdriver();

	@Given("^I am on the Zoo page$")
	public void i_am_on_the_Zoo_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp/");
	}

	@When("^I click on ([^\"]*)$")
	public void i_click_on_link(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	}

	@Then("^I see that the title is ([^\"]*)$")
	public void i_see_that_the_title_is_Adoption(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
		driver.close();
	}
}
