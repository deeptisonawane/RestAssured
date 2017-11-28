package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpClass
{
WebDriver driver;
	
	public SignUpClass(WebDriver driver2) {
		driver=driver2;
}

	public void signup()
	{
		WebElement signup_button=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		signup_button.click();
		
		WebElement signUsername_textBox=driver.findElement(By.id("name"));
		signUsername_textBox.sendKeys("Saurab");
		
		WebElement signEmail_textbox=driver.findElement(By.id("email"));
		signEmail_textbox.sendKeys("emai1@gmail.com");
		
		WebElement signMobile_textbox=driver.findElement(By.id("mobile"));
		signMobile_textbox.sendKeys("8787876761");
		
		WebElement signSignUpBtn=driver.findElement(By.id("sub_btn_signup"));
		signSignUpBtn.click();
	}
}
