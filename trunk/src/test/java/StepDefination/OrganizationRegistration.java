package StepDefination;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import Messages.RegistrationPageMessages;
//import Messages.RegistrationPageMessages;
import PageObjects.BaseClass;
import PageObjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrganizationRegistration {
	private BaseClass baseClass;
	private RegistrationPage registrationPage;
	private RegistrationPageMessages rpm;
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		registrationPage = new RegistrationPage(baseClass.getDriver());
		registrationPage.selectSignupUserType("Clinic/Practice");
		rpm = new RegistrationPageMessages(baseClass.getDriver());
	}

	@Given("User select country code {string}")
	public void user_select_country_code(String countryCode) {
		registrationPage.selectOrganizationCountryCode(countryCode);
		
	}

	@Given("User enter PhoneNumber {string}")
	public void user_enter_phone_number(String phoneNumber) {
	    registrationPage.enterPhoneNumberOrganization(phoneNumber);
	}

	@Given("User enter FirstName {string}")
	public void user_enter_first_name(String firstName) {
	   registrationPage.enterFirstName(firstName);
	}

	@Given("User enter LastName {string}")
	public void user_enter_last_name(String lastName) {
		registrationPage.enterLastName(lastName);
	}

	@Given("User enter Designation {string}")
	public void user_enter_designation(String designation) {
	    registrationPage.enterDesignationOrganization(designation);
	}
	
	
	@Given("User enter Email {string}")
	public void user_enter_confirm_password(String email) {
	    registrationPage.enterEmailOrganization(email);
	}

/*	@Given("User enter Captcha {string}")
	public void user_enter_captcha(String captcha) {
	    registrationPage.enterCaptchaOrganization(captcha);
	}
*/
	
	@Given("User enter Captcha")
	public void user_enter_captcha() {
	    registrationPage.enterCaptchaOrganization();
	}
	

	
	@When("User click on Signup button")
	public void user_click_on_signup_button() {
	registrationPage.clickOrganizationSignUpBtn();
	}

/*	@Then("I validate the success message of Location registration")
	public void i_validate_the_success_message_of_location_registration() {
		assertTrue(registrationPage.locationRegistrationSuccessCheck());
		baseClass.tearDown();
	}
	*/
	
	@Then("I validate the success message of Organization registration")
	public void i_validate_the_success_message_of_organization_registration() {
		assertTrue(registrationPage.organizationRegistrationSuccessCheck());
		baseClass.tearDown();
	}
	
	@When("User Select Location Radio button")
	public void user_select_location_radio_button() {
	registrationPage.checkLocationRadioButton();
	}
	
	@Given("User leaves countrycode field blank")
	public void user_leaves_countrycode_field_blank() {
	registrationPage.clickCountryCodeCrossIconOrganization();	
	}
	
	@Then("I validate the validation message for the blank countrycode")
	public void i_validate_the_validation_message_for_the_blank_countrycode() {
		String actualMessage = registrationPage.checkBlankCountryCodeMessageLocation();
	    String expectedMessage = rpm.blankCountryCodeMsgLocation();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	@Then("I validate the validation message for the blank phonenumber field")
	public void i_validate_the_validation_message_for_the_blank_phonenumber_field() {
		String actualMessage = registrationPage.checkBlankPhoneNumberMessageLocation();
		String expectedMessage = rpm.blankPhoneNumberMessageLocation();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	@Then("I validate the validation message for the less phonenumber field")
	public void i_validate_the_validation_message_for_the_less_phonenumber_field() {
		String actualMessage = registrationPage.checkBlankPhoneNumberMessageLocation();
	    String expectedMessage = rpm.lessPhoneNumberMessageLocation();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the validation message for the blank firstname")
	public void i_validate_the_validation_message_for_the_blank_firstname() {
		String actualMessage = registrationPage.checkBlankFirstNameErrorMsg();
	    String expectedMessage = rpm.blankFirstNameMessageLocation();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	
}
// Need to add for Already Registered Email Class = toast-message "Message : Email Already Exists"