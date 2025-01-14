package StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import Messages.RegistrationPageMessages;
import PageObjects.BaseClass;
import PageObjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhysicianRegistrationTest {

	private BaseClass baseClass;
	private RegistrationPage registrationPage;
	private RegistrationPageMessages rpm;
	
	@Given("Physician is on registration page")
	public void physician_is_on_registration_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		registrationPage = new RegistrationPage(baseClass.getDriver());
		rpm = new RegistrationPageMessages(baseClass.getDriver());
		registrationPage.selectSignupUserType("Physician");
	}

	@Given("Physician select country code {string}")
	public void physician_select_country_code(String countryCode) {
	    registrationPage.selectCountryCode(countryCode);
	    }

	@Given("Physician enter PhoneNumber {string}")
	public void physician_enter_phone_number(String phoneNumber) {
	    registrationPage.enterPhoneNumber(phoneNumber);
	}

	@Given("Physician enter Captcha {string}")
	public void physician_enter_captcha(String captcha) {
	    registrationPage.enterCaptcha(captcha);
	}

	@Given("Physician click on Submit button")
	public void physician_click_on_submit_button() {
	    registrationPage.clickSubmitButton();
	}

	@Given("Physician click on SendOTP button")
	public void physician_click_on_send_otp_button() {
	    registrationPage.clickSendOtpButton();
	}

	@Given("Physician enter OTP {string}")
	public void physician_enter_otp(String otp) {
	    registrationPage.enterOtpField(otp);
	}

	@Given("Physician click on VerifyOTP button")
	public void physician_click_on_verify_otp_button() {
	    registrationPage.clickVerifyOtpButton();
	}

	@Given("Physician select Yes as Associated with a Practice")
	public void physician_select_yes_as_associated_with_a_practice() {
	    registrationPage.clickAssociatePracticeYesRadioButton();
	}

	@Given("Physician select Practice Location {string}")
	public void physician_select_practice_location(String practiceLocation) {
	    registrationPage.selectPracticeLocationOption(practiceLocation);
	}

	@Given("Physician enter DoctorName {string}")
	public void physician_enter_doctor_name(String doctorName) {
	    registrationPage.enterDoctorName(doctorName);
	}

	@Given("Physician enter NewPassword {string}")
	public void physician_enter_new_password(String password) {
	    registrationPage.enterNewPassword(password);
	}

	@Given("Physician enter ConfirmPassword {string}")
	public void physician_enter_confirm_password(String cPassword) {
	registrationPage.enterConfirmPassword(cPassword);
	}

	@Given("Physician select Country {string}")
	public void physician_select_country(String country) {
	    registrationPage.selectCountryOption(country);
	}

	@Given("Physician select State {string}")
	public void physician_select_state(String state) throws InterruptedException {
		Thread.sleep(3000);
		registrationPage.selectStateOption(state);
	}

	@Given("Physician select City {string}")
	public void physician_select_city(String city) throws InterruptedException {
		Thread.sleep(3000);
	 registrationPage.selectCityOption(city);
	}

	@Given("Physician enter Postal Code {string}")
	public void physician_enter_postal_code(String postalCode) {
	    registrationPage.enterPostalCode(postalCode);
	}

	@Given("Physician enter Email {string}")
	public void physician_enter_email(String email) {
	    registrationPage.enterPhysicianEmail(email);
	}

	@Given("Physician enter NPINumber {string}")
	public void physician_enter_npi_number(String npiNumber) {
	    registrationPage.enterNPINumber(npiNumber);
	}

	@Given("Physician enter PhysicianFee {string}")
	public void physician_enter_physician_fee(String physicianFee) {
	   registrationPage.enterPhysicianFee(physicianFee);
	}

	@Given("Physician select speciality {string}")
	public void physician_select_speciality(String speciality) {
	   registrationPage.selectSpecialityDropdown(speciality);
	}

	@Given("Physician enter LicenceNo {string}")
	public void physician_enter_licence_no(String licenceNo) {
	 registrationPage.enterLicenceNumber(licenceNo);
	}

	@Given("Physician click on Signup button")
	public void physician_click_on_signup_button() {
	    registrationPage.clickPhysicianSignUpButton();
	}

	@Given("Physician check consent checkbox")
	public void physician_check_consent_checkbox() {
	    registrationPage.checkConsentCheckbox();
	}

	@Given("Physician Draw their signature")
	public void physician_draw_their_signature() {
	    registrationPage.drawSignature("#signature canvas.jSignature");
	}

	@When("Physician click on FinalSubmit button")
	public void physician_click_on_final_submit_button() {
	  registrationPage.clickFinalSubmitButton();
	}
	
	@Then("I validate the success message for physician registration")
	public void i_validate_the_success_message_for_physician_registration() {
		assertTrue(registrationPage.physicianRegistrationSuccessCheck());
		baseClass.tearDown();
	}
	@When("Physician click on countrycode cross icon")
		public void physician_click_on_countrycode_cross_icon() {
		registrationPage.clickCountryCodeCrossIcon();
		registrationPage.clickCountryCodeDDIcon();
	}
	@Then("I validate the error message of blank CountryCode field for physician")
	public void i_validate_the_error_message_of_blank_CountryCode_field_for_physician() {
		String actualMessage = registrationPage.checkBlankCountryCodeErrorMsg();
	    String expectedMessage = rpm.blankCountryCodeMessagePhysician();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	
	@Then("I validate the error message for less phone number on physician registration")
	public void i_validate_the_error_message_for_less_phone_number_on_physician_registration() {
		String actualMessage = registrationPage.checkLessPhoneNumberErrorMsg();
		String expectedMessage = rpm.lessPhoneNumberErrorMessagePhysician();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	
	@Then ("I validate the error message of blank PhoneNumber field for Physician")
	public void i_validate_the_error_message_of_blank_phonenumber_field_for_physician() {
		String actualMessage = registrationPage.checkBlankPhoneNumberErrorMsg();
		String expectedMessage = rpm.blankPhoneNumberErrorMessagePhysician();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	@Then ("I validate the error message for invalid captcha for Physician")
	public void  i_validate_the_error_message_for_invalid_captcha_for_physician() {
		String actualMessage = registrationPage.checkInvalidCaptchaErrorMsg();
		String expectedMessage = rpm.invalidCaptchaErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	
	@Then ("I validate the error message for blank captcha for Physician")
	public void i_validate_the_error_message_for_blank_captcha_for_physician() {
		String actualMessage = registrationPage.checkBlankCaptchaErrorMsg();
		String expectedMessage = rpm.blankCaptchaErrorMessage();
	    assertEquals(expectedMessage , actualMessage);
	    baseClass.tearDown();
	}
	
	   @Then("I validate the error message for less value OTP for Physician")
	   public void i_validate_the_error_message_for_less_value_otp_for_physician() {
			String actualMessage = registrationPage.checkLessOtpValueErrorMsg();
			String expectedMessage = rpm.lessOtpValueErrorMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();
		   
	   }
	   
	   @Then("I validate the error message for invalid OTP for physician")
	   public void i_validate_the_error_message_for_invalid_otp_for_physician() {
		   String actualMessage = registrationPage.checkInvalidOtpErrorMsg();
			String expectedMessage = rpm.invalidOtpValueErrorMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();
	   }
	   @Then ("I validate the error message for blank OTP for physician")
	  public void i_validate_the_error_message_for_blank_otp_for_physician() {
		   String actualMessage = registrationPage.checkBlankOtpErrorMsg();
			String expectedMessage = rpm.blankOtpValueErrorMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();
	   } 
	   
	   @Then ("I validate the error message for blank DoctorName")
	   public void i_validate_the_error_message_for_blank_doctorname() {
		   String actualMessage = registrationPage.checkBlankFirstNameErrorMsg();
			String expectedMessage = rpm.blankDoctorNameMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();
	   }
	   @Then ("I validate the error message for the invalid doctorname")
	   public void i_validate_the_error_message_for_the_invalid_doctorname() {
		   String actualMessage = registrationPage.checkBlankFirstNameErrorMsg();
			String expectedMessage = rpm.invalidDoctorNameMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();
	   }
	   @Then ("I validate the error message for blank Password field for Doctor")
	   public void i_validate_the_error_message_for_blank_password_field_for_doctor() {
		   String actualMessage = registrationPage.checkBlankPasswordErrorMsg();
			String expectedMessage = rpm.blankPasswordMessageDoctor();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();
	   }
	   @Then ("I validate the error message for the invalid Password for doctor") 
	   public void i_validate_the_error_message_for_the_invalid_password_for_doctor() {
		   String actualMessage = registrationPage.checkInvalidPasswordErrorMsg();
			String expectedMessage = rpm.invalidPasswordMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
	   }
	   
	   @Then("I validate the error message for blank ConfirmPassword field for Doctor")
	   public void i_validate_the_error_message_for_blank_confirmpassword_field_for_doctor() {
		   String actualMessage = registrationPage.checkBlankConfirmPasswordErrorMsg();
			String expectedMessage = rpm.blankConfirmPasswordMessageDoctor();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
}
	   @Then ("I validate the error message for the different confirmPassword for doctor")
	   public void i_validate_the_error_message_for_the_different_confirmpassword_for_doctor() {
		   String actualMessage = registrationPage.checkDifferentConfirmPasswordErrorMsg();
			String expectedMessage = rpm.differentConfirmPasswordMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
	   }
	   @Then ("I validate the error message for blank Country Dropdown for doctor")
	   public void i_validate_the_error_message_for_blank_country_dropdown_for_doctor() {
		   String actualMessage = registrationPage.checkBlankCountryErrorMsg();
			String expectedMessage = rpm.blankCountryMessageDoctor();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
	   }
	   @Then("I validate the error message for blank State Dropdown for Doctor")
		   public void i_validate_the_error_message_for_blank_state_dropdown_for_doctor() {
		   String actualMessage = registrationPage.checkBlankStateErrorMsg();
					String expectedMessage = rpm.blankStateMessage();
				    assertEquals(expectedMessage , actualMessage);
				    baseClass.tearDown();   
	   }
	   @Then ("I validate the error message for blank email id field for doctor")
	   public void i_validate_the_error_message_for_blank_email_id_field_for_doctor() {
		   String actualMessage = registrationPage.checkBlankEmailErrorMsg();
			String expectedMessage = rpm.blankEmailMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
	   }
	   @Then ("I validate the error message for invalid email id for doctor")
	   public void i_validate_the_error_message_for_invalid_email_id_for_doctor() {
		   String actualMessage = registrationPage.checkInvalidEmailErrorMsg();
			String expectedMessage = rpm.invalidEmailMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
	   }
	   @Then ("I validate the error message for blank speciality")
	   public void i_validate_the_error_message_for_blank_speciality() {
		   String actualMessage = registrationPage.checkBlankSpecialityMessage();
			String expectedMessage = rpm.blankSpecialityMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   
	   }
	   @Then("I validate the error message for unchecked consent checkbox")
	   public void i_validate_the_error_message_for_unchecked_consent_checkbox() {
		   String actualMessage = registrationPage.checkUncheckedConsentErrorMsg();
			String expectedMessage = rpm.uncheckConsentCheckboxMessage();
		    assertEquals(expectedMessage , actualMessage);
		    baseClass.tearDown();   

}
}