package StepDefination;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import Messages.LoginPageMessages;
import PageObjects.BaseClass;
import PageObjects.LoginPage;
//import PageObjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	private BaseClass baseClass;
	private LoginPage login;
	private LoginPageMessages lpg;
//	private RegistrationPage rpg;
	
	@Given("Patient is on login page")
	public void patient_is_on_login_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
//		rpg = new RegistrationPage(baseClass.getDriver());
		login = new LoginPage(baseClass.getDriver());
		lpg = new LoginPageMessages(baseClass.getDriver());
	}

	@When("Patient select country code for login {string}")
	public void patient_select_country_code_for_login(String countryCode) {
		login.selectCountryCode(countryCode);
		
	}

	@When("Patient enter username {string}")
	public void patient_enter_username(String userName) {
	    login.enterUserName(userName);
	}

	@When("Patient enter password {string}")
	public void patient_enter_password(String password) {
	   login.enterPassword(password);
	}


	@When("Patient click on Login button")
	public void patient_click_on_login_button() {
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
	}

	@Then("I verify the success message of the login")
	public void i_verify_the_success_message_of_the_login() {
	assertTrue(login.checkPatientDashboardPageVisible());
	baseClass.tearDown();
	}
	
	@When("Patient click on CountryCode cross icon")
	public void patient_click_on_country_code_cross_icon() {
		login.clickCountryCodeCrossIcon();
	}

	@Then("I verify the error message for the blank countrycode field")
	public void i_verify_the_error_message_for_the_blank_countrycode_field() {
	    String actualMessage = login.checkBlankCountryCodeErrorMsg();
		String expectedMessage = lpg.blankCountryCodeMessage();
		System.out.println("Actual Message for Blank CountryCode:" + actualMessage);
		System.out.println("Expected Message for Blank CountryCode:" + expectedMessage);
	    assertEquals(expectedMessage , actualMessage);
		baseClass.tearDown();
	}

	@Then("I verify the error message for the blank username field")
	public void i_verify_the_error_message_for_the_blank_username_field() {
	   String actualMessage = login.checkBlankUserNameErrorMsg();
	   String expectedMessage = lpg.blankUserNameErrorMessage();
		System.out.println("Actual Message for Blank Username:" + actualMessage);
		System.out.println("Expected Message for Blank Username:" + expectedMessage);
	   assertEquals(expectedMessage , actualMessage);
	   baseClass.tearDown();
	}

	@Then("I verify the error message for the blank password field")
	public void i_verify_the_error_message_for_the_blank_password_field() {
	    String actualMessage = login.checkInvalidUserNameErrorMsg();
	    String expectedMessage = lpg.blankPasswordErrorMessage();
		System.out.println("Actual Message for Blank Password:" + actualMessage);
		System.out.println("Expected Message for Blank Password:" + expectedMessage);
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}

	@Then("I verify the alert message for the invalid credentials")
	public void i_verify_the_alert_message_for_the_invalid_credentials() {
		String actualMessage = login.checkInvalidUserNameErrorMsg();
	    String expectedMessage = lpg.blankPasswordErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	
	@When("Patient click on Login with OTP option")
	public void patient_click_on_login_with_otp_option() {
	   login.clickLoginWithOtpOption();
	}

	@When("Patient enter captcha {string}")
	public void patient_enter_captcha(String captcha) {
//		login.handleChatBotPopup();
		login.enterCaptcha(captcha);
	}
	
	@When("Patient enter the OTP {string}")
	public void patient_enter_the_otp(String OTP) {
//		login.handleChatBotPopup();
		login.enterOTP(OTP);
	}

	@When("Patient click on Login with Otp button")
	public void patient_click_on_login_with_otp_button() {
//		login.handleChatBotPopup();
		login.clickLoginWithOtpBtn();
	    login.handleOtpSentSuccessAlert();
	}
	
	@When("Patient click on Login button with OTP")
	public void patient_click_on_login_button_with_otp() {
		login.clickLoginBtnWithOtp();
		login.handleLoginConfirmationPopup();
	}
	@Then("I verify the error message for the invalid OTP")
	public void i_verify_the_error_message_for_the_invalid_OTP() {
		String actualMessage = login.checkInvalidOTPErrorMsg();
	    String expectedMessage = lpg.invalidOtpErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	
}
