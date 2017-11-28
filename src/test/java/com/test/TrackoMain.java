package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TrackoMain 
{

	WebDriver driver;
	
	@Parameters("browserParameter")
	@BeforeTest
	public void setup(String Comingvalue)
	{
		String browser = Comingvalue;

		if(browser.equals("chrome"))
		{ System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		}

		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("html"))
		{
			//System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
			driver = new HtmlUnitDriver();
		}
		else if (browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		else{
			System.out.println("No browser specified");
		}
		
		driver.get("https://dev.tracko.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void login()
	{
		

	}
	
	
	@Test(priority=1)
	public void signUp()
	{
		SignUpClass sign= new SignUpClass(driver);
		sign.signup();
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
}
