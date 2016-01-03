package com.zazu.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverInitializer {

	private static WebDriver driver;

	public static WebDriver getWebdriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
