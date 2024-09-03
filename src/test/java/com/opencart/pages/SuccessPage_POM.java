package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage_POM {

	public WebDriver driver;
	
	public SuccessPage_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@id='content']//p)[1]")
	private WebElement successMsg;
	public String get_successMsg() {
		return successMsg.getText();
	}
	
	@FindBy(xpath = "//div[@id='logo']//h1//a")
	private WebElement logo;
	public void btn_logo() {
		logo.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement Continue;
	public void btn_Continue() {
		Continue.click();
	}
	
	
}
