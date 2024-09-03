package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage_POM {
	
	public WebDriver driver;
	
	public RegisterPage_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* = = = = = = = Breadcrumb = = = = = = = = */
	@FindBy(xpath = "(//ul[@class='breadcrumb']//li)[2]")
	private WebElement breadcrumb_account;
	
	public boolean verify_account_display_in_breadcrumb() {
		return breadcrumb_account.isDisplayed();
	}
	
	@FindBy(xpath = "(//ul[@class='breadcrumb']//li)[3]")
	private WebElement breadcrumb_register;
	
	public boolean verify_register_display_in_breadcrumb() {
		return breadcrumb_register.isDisplayed();
	}
	
	/* = = = = = = = = = Headings = = = = = = = */
	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement pageHeading;
	
	public String get_pageHeading() {
		try {
			return pageHeading.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public boolean verify_pageHeading_displaying() {
			return pageHeading.isDisplayed();
	}
	
	@FindBy(xpath = "//fieldset[@id='account']//legend")
	private WebElement pageTitle;
	
	public String get_pageTitle() {
		try {
			return pageTitle.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	
	/* = = = = = = = = = Firstname = = = = = = = */
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement tet_FirstName;

	public String set_FirstName(String fname) {
		tet_FirstName.sendKeys(fname);
		return fname;
	}

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement txt_LastName;

	public String set_LastName(String lname) {
		txt_LastName.sendKeys(lname);
		return lname;
	}

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement txt_Email;

	public String set_Email(String email) {
		txt_Email.sendKeys(email);
		return email;
	}

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement txt_Telephone;

	public String set_Telephone(String teleNumber) {
		txt_Telephone.sendKeys(teleNumber);
		return teleNumber;
	}

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement txt_Password;

	public String set_Password(String password) {
		txt_Password.sendKeys(password);
		return password;
	}

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement txt_ConfirmPassword;

	public void set_ConfirmPassword(String confirmpassword) {
		txt_ConfirmPassword.sendKeys(confirmpassword);
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chk_CheckBox;

	public void clickCheckBox() {
		chk_CheckBox.click();
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btn_Continue;

	public void clickContinue() {
		btn_Continue.click();
	}

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement rdo_Yes_radio;

	public void clickYes_radio() {
		rdo_Yes_radio.click();
	}

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement rdo_No_radio;

	public void clickNo_radio() {
		rdo_No_radio.click();
	}

	/* = = = = = = = = Error Messages = = = = = = = = */
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement errorMsg_privacypolicy_and_errorMsg_exitingEmail;

	public String get_errorMsg_privacypolicy_and_errorMsg_exitingEmail() {
		try {
			return errorMsg_privacypolicy_and_errorMsg_exitingEmail.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "(//div[@class='text-danger'])[1]")
	private WebElement errorMsg_firstname;

	public String get_errorMsg_firstname() {
		try {
			return errorMsg_firstname.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "(//div[@class='text-danger'])[2]")
	private WebElement errorMsg_lastname;

	public String get_errorMsg_lastname() {
		try {
			return errorMsg_lastname.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "(//div[@class='text-danger'])[3]")
	private WebElement errorMsg_email;

	public String get_errorMsg_email() {
		try {
			return errorMsg_email.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "(//div[@class='text-danger'])[4]")
	private WebElement errorMsg_telephone;

	public String get_errorMsg_telephone() {
		try {
			return errorMsg_telephone.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "(//div[@class='text-danger'])[5]")
	private WebElement errorMsg_password;

	public String get_errorMsg_password() {
		try {
			return errorMsg_password.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "//div[@class='text-danger' or @class='text-danger']")
	private WebElement errorMsg_passwordconfirm;

	public String get_errorMsg_passwordconfirm() {
		try {
			return errorMsg_passwordconfirm.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@FindBy(xpath = "(//div[@class='text-danger'])[5]")
	private WebElement errorMsg_passwordconfirm2;

	public String get_errorMsg_passwordconfirm2() {
		try {
			return errorMsg_passwordconfirm2.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@FindBy(xpath = "")
	private WebElement errorMsg_exitingEmail;

	public String get_errorMsg_exitingEmail() {
		try {
			return errorMsg_exitingEmail.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
