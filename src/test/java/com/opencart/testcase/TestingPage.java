package com.opencart.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.opencart.testbase.BasePage;
import com.opencart.utilities.Randoms;

public class TestingPage extends BasePage {

	@Test(priority = 1, groups = {"Sanity","Regression","Master"})
	public void testingg1() {
		logger.info(" ********** Started testingg1 ********** ");
		BasePage.test.log(Status.INFO, "Clicked on myaccount link");
		try {
			landingpage.clickMyAccount();
			logger.info("Clicked on myaccount link");
			BasePage.test.log(Status.INFO, "Clicked on myaccount link");

			landingpage.ClickRegister();
			logger.info("Clicked on register link");
			BasePage.test.log(Status.INFO, "Clicked on register link");

			registerpage.set_FirstName(Randoms.name());
			logger.info("Entered firstname");
			BasePage.test.log(Status.INFO, "Entered firstname");

			registerpage.set_LastName(Randoms.name());
			logger.info("Entered lastname");
			BasePage.test.log(Status.INFO, "Entered lastname");

			registerpage.set_Email(Randoms.valid_emails());
			logger.info("Entered email");
			BasePage.test.log(Status.INFO, "Entered email");

			registerpage.set_Telephone(Randoms.phone_number());
			logger.info("Entered phone number");
			BasePage.test.log(Status.INFO, "Entered phone number");

			String pwd = registerpage.set_Password(Randoms.password());
			logger.info("Entered password");
			BasePage.test.log(Status.INFO, "Entered password");

			registerpage.set_ConfirmPassword(pwd);
			logger.info("Entered confirm password");
			BasePage.test.log(Status.INFO, "Entered confirm password");

			registerpage.clickCheckBox();
			logger.info("Clicked on check box");
			BasePage.test.log(Status.INFO, "Clicked on check box");

			registerpage.clickContinue();
			logger.info("Clicked on Continue button");
			BasePage.test.log(Status.INFO, "Clicked on Continue button");
			String actualmgs = successPage.get_successMsg();
			String expectedmgs = "Congratulations! Your new account has been successfully created!";
			
			assertEquals(actualmgs, expectedmgs);
			logger.info("Actaul and expected success message got matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message got matched");
			
			logger.info(" ********** Finished testingg1 ********** ");
		} catch (AssertionError ae) {
			logger.error("Test failed ==> Assertion Error => " + ae);
			BasePage.test.log(Status.INFO, "Test failed ==> Assertion Error => " + ae);
			logger.info("Actaul and expected success message doesn't matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message doesn't matched");
			
			Assert.fail();
		} catch (Exception e) {
			logger.error("Test failed ==> Exception Error ==> " + e);
			BasePage.test.log(Status.INFO, "Test failed ==> Exception Error ==> " + e);
			logger.info("Actaul and expected success message doesn't matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message doesn't matched");
			Assert.fail();
		}

	}
	
	@Test(priority = 2,groups = {"Regression","Master"})
	public void testingg2() {
		logger.info(" ********** Started testingg2 ********** ");
		BasePage.test.log(Status.INFO, "Clicked on myaccount link");
		try {
			landingpage.clickMyAccount();
			logger.info("Clicked on myaccount link");
			BasePage.test.log(Status.INFO, "Clicked on myaccount link");

			landingpage.ClickRegister();
			logger.info("Clicked on register link");
			BasePage.test.log(Status.INFO, "Clicked on register link");

			registerpage.set_FirstName(Randoms.name());
			logger.info("Entered firstname");
			BasePage.test.log(Status.INFO, "Entered firstname");

			registerpage.set_LastName(Randoms.name());
			logger.info("Entered lastname");
			BasePage.test.log(Status.INFO, "Entered lastname");

			registerpage.set_Email(Randoms.valid_emails());
			logger.info("Entered email");
			BasePage.test.log(Status.INFO, "Entered email");

			registerpage.set_Telephone(Randoms.phone_number());
			logger.info("Entered phone number");
			BasePage.test.log(Status.INFO, "Entered phone number");

			String pwd = registerpage.set_Password(Randoms.password());
			logger.info("Entered password");
			BasePage.test.log(Status.INFO, "Entered password");

			registerpage.set_ConfirmPassword(pwd);
			logger.info("Entered confirm password");
			BasePage.test.log(Status.INFO, "Entered confirm password");

			registerpage.clickCheckBox();
			logger.info("Clicked on check box");
			BasePage.test.log(Status.INFO, "Clicked on check box");

			registerpage.clickContinue();
			logger.info("Clicked on Continue button");
			BasePage.test.log(Status.INFO, "Clicked on Continue button");
			String actualmgs = successPage.get_successMsg();
			String expectedmgs = "Congratulations! Your new account has been successfully created!";
			
			assertEquals(actualmgs, expectedmgs);
			logger.info("Actaul and expected success message got matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message got matched");
			
			logger.info(" ********** Finished testingg1 ********** ");
		} catch (AssertionError ae) {
			logger.error("Test failed ==> Assertion Error => " + ae);
			BasePage.test.log(Status.INFO, "Test failed ==> Assertion Error => " + ae);
			logger.info("Actaul and expected success message doesn't matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message doesn't matched");
			
			Assert.fail();
		} catch (Exception e) {
			logger.error("Test failed ==> Exception Error ==> " + e);
			BasePage.test.log(Status.INFO, "Test failed ==> Exception Error ==> " + e);
			logger.info("Actaul and expected success message doesn't matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message doesn't matched");
			Assert.fail();
		}

	}
	
	@Test(priority = 3,groups = {"Sanity","Master"})
	public void testingg3() {
		logger.info(" ********** Started testingg3 ********** ");
		BasePage.test.log(Status.INFO, "Clicked on myaccount link");
		try {
			landingpage.clickMyAccount();
			logger.info("Clicked on myaccount link");
			BasePage.test.log(Status.INFO, "Clicked on myaccount link");

			landingpage.ClickRegister();
			logger.info("Clicked on register link");
			BasePage.test.log(Status.INFO, "Clicked on register link");

			registerpage.set_FirstName(Randoms.name());
			logger.info("Entered firstname");
			BasePage.test.log(Status.INFO, "Entered firstname");

			registerpage.set_LastName(Randoms.name());
			logger.info("Entered lastname");
			BasePage.test.log(Status.INFO, "Entered lastname");

			registerpage.set_Email(Randoms.valid_emails());
			logger.info("Entered email");
			BasePage.test.log(Status.INFO, "Entered email");

			registerpage.set_Telephone(Randoms.phone_number());
			logger.info("Entered phone number");
			BasePage.test.log(Status.INFO, "Entered phone number");

			String pwd = registerpage.set_Password(Randoms.password());
			logger.info("Entered password");
			BasePage.test.log(Status.INFO, "Entered password");

			registerpage.set_ConfirmPassword(pwd);
			logger.info("Entered confirm password");
			BasePage.test.log(Status.INFO, "Entered confirm password");

			registerpage.clickCheckBox();
			logger.info("Clicked on check box");
			BasePage.test.log(Status.INFO, "Clicked on check box");

			registerpage.clickContinue();
			logger.info("Clicked on Continue button");
			BasePage.test.log(Status.INFO, "Clicked on Continue button");
			String actualmgs = successPage.get_successMsg();
			String expectedmgs = "Congratulations! Your new account has been successfully created!";
			
			assertEquals(actualmgs, expectedmgs);
			logger.info("Actaul and expected success message got matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message got matched");
			
			logger.info(" ********** Finished testingg1 ********** ");
		} catch (AssertionError ae) {
			logger.error("Test failed ==> Assertion Error => " + ae);
			BasePage.test.log(Status.INFO, "Test failed ==> Assertion Error => " + ae);
			logger.info("Actaul and expected success message doesn't matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message doesn't matched");
			
			Assert.fail();
		} catch (Exception e) {
			logger.error("Test failed ==> Exception Error ==> " + e);
			BasePage.test.log(Status.INFO, "Test failed ==> Exception Error ==> " + e);
			logger.info("Actaul and expected success message doesn't matched");
			BasePage.test.log(Status.INFO, "Actaul and expected success message doesn't matched");
			Assert.fail();
		}

	}
}
