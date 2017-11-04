package com.seleniumeasy.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenBrowser {

	public WebDriver webdriver;

	@Parameters("browser")
	@Test
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("Firefox")) {
			System.getProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			webdriver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			webdriver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			webdriver = new InternetExplorerDriver();
		}
		webdriver.get("www.seleniumeasy.com/test/");
		webdriver.manage().window().maximize();
	}

}
