package com.opencart.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.opencart.testbase.BasePage;
import com.opencart.utilities.Randoms;

public class TestingPage2 extends BasePage {

	@Test(priority = 1,groups = {"Sanity","Master"})
	public void testinggxcxzxc() {
		try {
			landingpage.clickMyAccount();
			logger.info("Clicked on myaccount link");

			landingpage.ClickRegister();
			logger.info("Clicked on register link");

			registerpage.set_FirstName(Randoms.name());
			logger.info("Entered firstname");

			registerpage.set_LastName(Randoms.name());
			logger.info("Entered lastname");

			registerpage.set_Email(Randoms.valid_emails());
			logger.info("Entered email");

			registerpage.set_Telephone(Randoms.phone_number());
			logger.info("Entered phone number");

			String pwd = registerpage.set_Password(Randoms.password());
			logger.info("Entered password");

			registerpage.set_ConfirmPassword(pwd);
			logger.info("Entered confirm password");

			registerpage.clickCheckBox();
			logger.info("Clicked on check box");

			registerpage.clickContinue();
			logger.info("Clicked on Continue button");
			String actualmgs = successPage.get_successMsg();
			String expectedmgs = "Congratulations! Your new account has been successfully created!";

			assertEquals(actualmgs, expectedmgs);
			logger.info("Actaul and expected success message got matched");

		} catch (AssertionError ae) {
			logger.error("Test failed ==> Assertion Error => " + ae);
			logger.info("Actaul and expected success message doesn't matched");
			Assert.fail();
		} catch (Exception e) {
			logger.error("Test failed ==> Exception Error ==> " + e);
			logger.info("Actaul and expected success message doesn't matched");
			Assert.fail();
		}

	}
	
	@Test(priority = 2,groups = {"Regression","Master"})
	public void testinggxcxzxc1() {
		try {
			landingpage.clickMyAccount();
			logger.info("Clicked on myaccount link");

			landingpage.ClickRegister();
			logger.info("Clicked on register link");

			registerpage.set_FirstName(Randoms.name());
			logger.info("Entered firstname");

			registerpage.set_LastName(Randoms.name());
			logger.info("Entered lastname");

			registerpage.set_Email(Randoms.valid_emails());
			logger.info("Entered email");

			registerpage.set_Telephone(Randoms.phone_number());
			logger.info("Entered phone number");

			String pwd = registerpage.set_Password(Randoms.password());
			logger.info("Entered password");

			registerpage.set_ConfirmPassword(pwd);
			logger.info("Entered confirm password");

			registerpage.clickCheckBox();
			logger.info("Clicked on check box");

			registerpage.clickContinue();
			logger.info("Clicked on Continue button");
			String actualmgs = successPage.get_successMsg();
			String expectedmgs = "Congratulations! Your new account has been successfully created!";

			assertEquals(actualmgs, expectedmgs);
			logger.info("Actaul and expected success message got matched");

		} catch (AssertionError ae) {
			logger.error("Test failed ==> Assertion Error => " + ae);
			logger.info("Actaul and expected success message doesn't matched");
			Assert.fail();
		} catch (Exception e) {
			logger.error("Test failed ==> Exception Error ==> " + e);
			logger.info("Actaul and expected success message doesn't matched");
			Assert.fail();
		}

	}
}
