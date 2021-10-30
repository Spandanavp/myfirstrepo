package com.stratzy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	@FindBy(xpath = "")
	private WebElement email;

	public LoginPage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);
	}

	public void setEmail() {
		this.email.sendKeys("a@gmail.com");
	}
}
