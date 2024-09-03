package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage_POM {

	public WebDriver driver;
	
	public LandingPage_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* ===================== My Account ========================*/
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement lnk_MyAccount;
	public void clickMyAccount() {
		lnk_MyAccount.click();	
	}
	
	
	/* = = = = = = = = = = = Register = = = = = = = = */
	@FindBy(linkText = "Register")
	private WebElement lnk_Register;
	public void ClickRegister() {
		lnk_Register.click();
		
	}
	
	/* = = = = = = = = = = = Login = = = = = = = = */
	@FindBy(linkText = "Login")
	private WebElement btn_login;
	public void ClickLogin() {
		btn_login.click();
	}
}
