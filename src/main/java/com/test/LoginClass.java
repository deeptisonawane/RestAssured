package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass 
{
WebDriver driver;
	
	public void login()
	{
		WebElement login_up_button=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		login_up_button.click();
	}
}
