package com.zazu.cucumber.features;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zazu.cucumber.WebdriverInitializer;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Managing_Contact_form {

	private WebDriver driver = WebdriverInitializer.getWebdriver();

	@Given("^I am on the Zoo website$")
	public void i_am_on_the_Zoo_website() throws Throwable {
		driver.navigate().to("http://thetestroom.com/webapp/");
	}

	@When("^I click on the \"([^\"]*)\" link$")
	public void i_click_on_the_link(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	}

	@When("^Fill in the form with valid data$")
	public void fill_in_the_form_with_valid_data(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
		driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I see a confirmationpage the text \"([^\"]*)\"$")
	public void i_see_a_confirmationpage_the_text(String message) throws Throwable {
		Assert.assertEquals(message, driver.findElement(By.cssSelector("td.content > h1")).getText());
		driver.close();
	}

}
