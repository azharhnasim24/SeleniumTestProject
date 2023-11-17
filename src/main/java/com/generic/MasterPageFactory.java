package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);//handle the null pointer exception
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Login')]")
	private WebElement loginBtnHome;
	
	@FindBy(xpath = "(//*[@name='email'])[1]")
	private WebElement emailfield;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement passwordfield;
	
	@FindBy(xpath = "//button[contains(text(), 'Login')]")
	private WebElement loginBtn2;

	public WebElement getLoginBtnHome() {
		return loginBtnHome;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginBtn2() {
		return loginBtn2;
	}
	
	

}
