/*package StepDefination;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import Messages.RegistrationPageMessages;
import PageObjects.BaseClass;
import PageObjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientRegistrationWait {

	private BaseClass baseClass;
	private RegistrationPage registrationPage;
	private RegistrationPageMessages rpm;
	int waitTime = 2000; 
	
	@Given("Patient is on registration page")
	public void patient_is_on_registration_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		registrationPage = new RegistrationPage(baseClass.getDriver());
		rpm = new RegistrationPageMessages(baseClass.getDriver());
		registrationPage.selectSignupUserType("Patient");
		 
	}

	@Given("Patient select country code {string}")
	public void patient_select_country_code(String countryCode) throws InterruptedException {
		registrationPage.selectCountryCode(countryCode);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter PhoneNumber {string}")
	public void patient_enter_phone_number(String phoneNumber) throws InterruptedException {
		registrationPage.enterPhoneNumber(phoneNumber);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter Captcha {string}")
	public void patient_enter_captcha(String captcha) throws InterruptedException {
		registrationPage.enterCaptcha(captcha);
		Thread.sleep(waitTime);
	}

	@Given("Patient click on Submit button")
	public void patient_click_on_submit_button() throws InterruptedException {
		registrationPage.clickSubmitButton();
		Thread.sleep(waitTime);
	}

	@Given("Patient click on SendOTP button")
	public void patient_click_on_SendOTP_button() throws InterruptedException {
		registrationPage.clickSendOtpButton();
		Thread.sleep(waitTime);
	}


	@Given("Patient enter OTP {string}")
	public void patient_enter_otp(String otp) throws InterruptedException {
		registrationPage.enterOtpField(otp);
		Thread.sleep(waitTime);
	}

	@Given("Patient click on VerifyOTP button")
	public void patient_click_on_verify_otp_button() throws InterruptedException {
		registrationPage.clickVerifyOtpButton();
		Thread.sleep(waitTime);
	}

	@Given("Patient select Yes as Associated with a Practice")
	public void patient_select_yes_as_associated_with_a_practice() throws InterruptedException {
		registrationPage.clickAssociatePracticeYesRadioButton();
		Thread.sleep(waitTime);
	}

	@Given("Patient select Practice Location {string}")
	public void patient_select_practice_location(String practiceLocation) throws InterruptedException {
		registrationPage.selectPracticeLocationOption(practiceLocation);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter FirstName {string}")
	public void patient_enter_first_name(String firstName) throws InterruptedException {
		registrationPage.enterFirstName(firstName);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter LastName {string}")
	public void patient_enter_last_name(String lastName) throws InterruptedException {
		registrationPage.enterLastName(lastName);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter NewPassword {string}")
	public void patient_enter_new_password(String newPassword) throws InterruptedException {
		registrationPage.enterNewPassword(newPassword);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter ConfirmPassword {string}")
	public void patient_enter_confirm_password(String confirmPassword) throws InterruptedException {
		registrationPage.enterConfirmPassword(confirmPassword);
		Thread.sleep(waitTime);
	}

	@Given("Patient select Country {string}")
	public void patient_select_country(String country) throws InterruptedException {
		registrationPage.selectCountryOption(country);
		Thread.sleep(waitTime);
	}

	@Given("Patient select State {string}")
	public void patient_select_state(String state) throws InterruptedException {
		registrationPage.selectStateOption(state);
		Thread.sleep(waitTime);
	}

	@Given("Patient select City {string}")
	public void patient_select_city(String city) throws InterruptedException {
		registrationPage.selectCityOption(city);
		Thread.sleep(waitTime);
	}

	@Given("Patient select ReferenceType {string}")
	public void patient_select_reference_type(String referenceType) throws InterruptedException {
		registrationPage.selectReferenceTypeOption(referenceType);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter Postal Code {string}")
	public void patient_enter_postal_code(String postalCode) throws InterruptedException {
		registrationPage.enterPostalCode(postalCode);
		Thread.sleep(waitTime);
	}

	@Given("Patient enter Email {string}")
	public void patient_enter_email(String email) throws InterruptedException {
		registrationPage.enterEmail(email);
		Thread.sleep(waitTime);
	}

	@Given("Patient select TimeZone {string}")
	public void patient_select_time_zone(String timeZone) throws InterruptedException {
		registrationPage.selectTimeZoneOption(timeZone);
		Thread.sleep(waitTime);
	}
	

@Given("Patient click on Signup button")
	public void patient_click_on_signup_button() throws InterruptedException {
	    registrationPage.clickSignUpButton();
	    Thread.sleep(waitTime);
}
	
	@Given("Patient check consent checkbox")
	public void patient_check_consent_checkbox() throws InterruptedException {
		registrationPage.checkConsentCheckbox();;
		Thread.sleep(waitTime);
	}
	
	@Given("Patient click on countrycode cross icon")
	public void patient_click_on_countrycode_cross_icon() {
		registrationPage.clickCountryCodeCrossIcon();
		registrationPage.clickCountryCodeDDIcon();	}
	
	 
	
	@When("Patient click on FinalSubmit button")
	public void patient_click_on_finalsubmit_button() throws InterruptedException {
		registrationPage.clickFinalSubmitButton();
		Thread.sleep(waitTime);
	}

	@Then("I validate the success message")
	public void i_validate_the_success_message() throws InterruptedException {
	assertTrue(registrationPage.patientRegistrationSuccessCheck());
	Thread.sleep(waitTime);
	baseClass.tearDown();
	} 
	
	@Then("I validate the error message of blank CountryCode field")
	public void i_validate_the_error_message_of_blank_countrycode_field() {
		String actualMessage = registrationPage.checkBlankCountryCodeErrorMsg();
	    String expectedMessage = rpm.blankCountryCodeMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	@Then("I validate the error message for less phone number")
	public void i_validate_the_error_message_for_less_phone_number() {
		String actualMessage = registrationPage.checkLessPhoneNumberErrorMsg();
	    String expectedMessage = rpm.lessPhoneNumberErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		
		} 
	
	@Then("I validate the error message of blank PhoneNumber field")
	public void i_validate_the_error_message_of_blank_phonenumber_field() {
		String actualMessage = registrationPage.checkBlankPhoneNumberErrorMsg();
	    String expectedMessage = rpm.blankPhoneNumberErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	
		} 
	
	@When("Patient enter invalid Captcha {string}")
	public void patient_enter_invalid_captcha(String captcha) {
		registrationPage.enterCaptcha(captcha);
		} 
	
	@Then("I validate the error message for invalid captcha")
	public void i_validate_the_error_message_for_invalid_captcha() {
		String actualMessage = registrationPage.checkInvalidCaptchaErrorMsg();
	    String expectedMessage = rpm.invalidCaptchaErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	@Then("I validate the error message for blank captcha")
	public void i_validate_the_error_message_for_blank_captcha() {
		String actualMessage = registrationPage.checkBlankCaptchaErrorMsg();
	    String expectedMessage = rpm.blankCaptchaErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	
	
	
	@Then("I validate the error message for less value OTP")
	public void i_validate_the_error_message_for_less_value_otp() {
		String actualMessage = registrationPage.checkLessOtpValueErrorMsg();
	    String expectedMessage = rpm.lessOtpValueErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	@Then("I validate the error message for invalid OTP")
	public void i_validate_the_error_message_for_invalid_otp() {
		String actualMessage = registrationPage.checkBlankOtpErrorMsg();
	    String expectedMessage = rpm.invalidOtpValueErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 
	
	@Then("I validate the error message for blank OTP")
	public void i_validate_the_error_message_for_blank_otp() {
		String actualMessage = registrationPage.checkBlankOtpErrorMsg();
	    String expectedMessage = rpm.blankOtpValueErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 	
	
	@Then("I validate the error message for blank FirstName field")
	public void i_validate_the_error_message_for_blank_firstname_field() {
		String actualMessage = registrationPage.checkBlankFirstNameErrorMsg();
	    String expectedMessage = rpm.blankFirstNameMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 	

	@Then("I validate the error message for the invalid firstname")
	public void i_validate_the_error_message_for_invalid_firstname() {
		String actualMessage = registrationPage.checkInvalidFirstNameErrorMsg();
	    String expectedMessage = rpm.invalidFirstNameMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 	
	
	@Then("I validate the error message for blank LastName field")
	public void i_validate_the_error_message_for_blank_lastname_field() {
		String actualMessage = registrationPage.checkBlankLastNameErrorMsg();
	    String expectedMessage = rpm.blankLastNameMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		} 	

	@Then("I validate the error message for the invalid lastname")
	public void i_validate_the_error_message_for_the_invalid_lastname() {
		String actualMessage = registrationPage.checkInvalidLastNameErrorMsg();
	    String expectedMessage = rpm.invalidLastNameMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for blank Password field")
	public void i_validate_the_error_message_for_blank_password_field() {
		String actualMessage = registrationPage.checkBlankPasswordErrorMsg();
	    String expectedMessage = rpm.blankPasswordMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for the invalid Password")
	public void i_validate_the_error_message_for_the_invalid_password() {
		String actualMessage = registrationPage.checkInvalidPasswordErrorMsg();
	    String expectedMessage = rpm.invalidPasswordMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for blank ConfirmPassword field")
	public void i_validate_the_error_message_for_blank_confirmpassword_field() {
		String actualMessage = registrationPage.checkBlankConfirmPasswordErrorMsg();
	    String expectedMessage = rpm.blankConfirmPasswordMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for the different confirmPassword")
	public void i_validate_the_error_message_for_the_different_confirmpassword() {
		String actualMessage = registrationPage.checkDifferentConfirmPasswordErrorMsg();
	    String expectedMessage = rpm.differentConfirmPasswordMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for blank Country Dropdown")
	public void i_validate_the_error_message_for_blank_country_dropdown() {
		String actualMessage = registrationPage.checkBlankCountryErrorMsg();
	    String expectedMessage = rpm.blankCountryMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for blank State Dropdown")
	public void i_validate_the_error_message_for_blank_state_dropdown() {
		String actualMessage = registrationPage.checkBlankStateErrorMsg();
	    String expectedMessage = rpm.blankStateMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}	

	@Then("I validate the error message for blank email id field")
	public void i_validate_the_error_message_for_blank_email_id_field() {
		String actualMessage = registrationPage.checkBlankEmailErrorMsg();
	    String expectedMessage = rpm.blankEmailMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}
	
	@Then("I validate the error message for invalid email id")
	public void i_validate_the_error_message_for_invalid_email_id() {
		String actualMessage = registrationPage.checkInvalidEmailErrorMsg();
	    String expectedMessage = rpm.invalidEmailMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}	
	
	@Then("I validate the error message for the unchecked consent checkbox")
	public void i_validate_the_error_message_for_the_unchecked_consent_checkbox() {
		String actualMessage = registrationPage.checkUncheckedConsentErrorMsg();
	    String expectedMessage = rpm.uncheckConsentCheckboxMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
		}	
	
}*/



