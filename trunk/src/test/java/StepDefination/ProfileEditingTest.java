package StepDefination;


import static org.testng.Assert.assertEquals;

import Messages.ProfileUpdateMessages;
import PageObjects.BaseClass;
import PageObjects.LoginPage;
import PageObjects.ProfileEditingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileEditingTest {
	private BaseClass baseClass;
	private LoginPage login;
	private ProfileUpdateMessages messages;
	private ProfileEditingPage profileEdit;
	private String userNamePatient = "9694665596";
	private String userNameDoctor = "9694665594";
	private String userNameAccountant = "9638527411";
	private String userNameReceptionist = "3695247851";
	private String userNamePCC = "5647891256";
	private String userNameLaboratory = "1547836987";
	private String userNamePharmacy = "5698412369";
	private String userNameNurse = "6932587415";
//	private String userNameAdminHR = "3698521475";	
	private String userNameRadiographer = "5896471236";
/*	private String userNameMainAdmin = "2222222222";
	private String passwordMainAdmin = "gfp2fJ$g2UV3";*/
	private int waitTime = 2000;
	private String password = "Pass@123";
	
	
	@Given("User is on Patient Profile page")
	public void user_is_on_patient_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNamePatient);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickProfileTab();
		profileEdit.clickEditBtn();
	}
	
	@Given("User is on Doctor Profile page")
	public void user_is_on_doctor_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameDoctor);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}
	
	
	@Given("User is on Accountant Profile page")
	public void user_is_on_accountant_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameAccountant);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}
	
	/*	@Given("User is on Adminhr Profile page")
	public void user_is_on_adminhr_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameAdminHR);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	} */
	
		@Given("User is on Receptionist Profile page")
	public void user_is_on_receptionist_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameReceptionist);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}
	
	@Given("User is on PCC Profile page")
	public void user_is_on_pcc_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNamePCC);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}
	
	@Given("User is on Laboratory Profile page")
	public void user_is_on_laboratory_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameLaboratory);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}

	@Given("User is on pharmacy Profile page")
	public void user_is_on_pharmacy_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNamePharmacy);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}
	
	@Given("User is on Nurse Profile page")
	public void user_is_on_nurse_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameNurse);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}
	
	@Given("User is on Radiographer Profile page")
	public void user_is_on_radiographer_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameRadiographer);
		login.enterPassword(password);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}	

/*	@Given("User is on Main Admin Profile page")
	public void user_is_on_main_admin_profile_page() {
		baseClass = new BaseClass();
		baseClass.setupBrowser("Chrome");
		baseClass.handleChatBot();
		baseClass.openUrl();
		login = new LoginPage(baseClass.getDriver());
		messages = new ProfileUpdateMessages(baseClass.getDriver());
		profileEdit = new ProfileEditingPage(baseClass.getDriver());
		login.enterUserName(userNameMainAdmin);
		login.enterPassword(passwordMainAdmin);
		login.clickLoginBtnWithPass();
		login.handleLoginConfirmationPopup();
		profileEdit.clickDoctorProfileTab();
		profileEdit.clickDoctorProfileEditBtn();
	}		
*/		
	
	@Given("User select Doctor Prefix {string}")
	public void user_select_doctor_prefix(String prefix) {
		profileEdit.selectDoctorPrefix(prefix);
	}
	
	@Given("User select Doctor DOB for Editing {string}")
	public void user_select_doctor_dob_for_editing(String dob) {
		profileEdit.selectDoctorDOB(dob);
	}
	
	@Given("User enter doctor AlternateContact Number for Editing {string}")
	public void user_enter_doctor_alternate_contact_number_for_editing(String alternateContact) {
		profileEdit.enterDocAlternateContactNumber(alternateContact);
	}
	
	@Given("User select doctor experience for Editing {string}")
	public void user_select_doctor_experience_for_editing(String experience) {
		profileEdit.enterDoctorExperience(experience);
	}
	
	@Given("User enter Doctor AboutMe for Editing {string}")
	public void user_enter_doctor_aboutme_for_editing(String aboutMe) {
		profileEdit.enterDoctorAbout(aboutMe);
	}
	
	@Given("User enter Doctor LicenceNo for Editing {string}")
	public void user_enter_doctor_licenceno_for_editing(String licenceNo) {
		profileEdit.enterDoctorLicenceNumber(licenceNo);
	}
	@Given("User select Doctor LicenceNo ExpiryDate for Editing {string}")
	public void user_enter_doctor_licenceno_expirydate_for_editing(String expiryDate) {
		profileEdit.enterDoctorLicenceExpiryDate(expiryDate);
	}
	@Given("User enter ConsultancyFee for Editing {string}")
	public void user_enter_consultancyfee_for_editing(String consutancyFee) {
		profileEdit.enterDoctorConsultancyFee(consutancyFee);
	}
    
	@Given("User upload profile image {string}")
	public void user_upload_profile_image(String profilePhotoPath) {
		profileEdit.uploadPatientProfileImage(profilePhotoPath);
	}
	
	@Given("User enter FirstName for Editing {string}")
	public void user_enter_first_name_for_editing(String firstName) {
	profileEdit.enterFirstName(firstName);
	}

	@Given("User enter LastName for Editing {string}")
	public void user_enter_last_name_for_editing(String lastName) {
		profileEdit.enterLastName(lastName);
	}

	@Given("User select DOB for Editing {string}")
	public void user_select_dob_for_editing(String dob) {
		profileEdit.enterDOB(dob);
	}

	@Given("User select Gender for Editing {string}")
	public void user_select_gender_for_editing(String gender) {
	  profileEdit.selectGender(gender);
	}

	@Given("User enter AlternateEmail for Editing {string}")
	public void user_enter_alternate_email_for_editing(String alternateEmail) {
	profileEdit.enterAlternateEmailId(alternateEmail);
	}

	@Given("User select AlternateContact Number for Editing {string}")
	public void user_select_alternate_contact_number_for_editing(String alternateContact) {
		profileEdit.enterAlternateContactNuber(alternateContact);
	}

	@Given("User select Country for Editing {string}")
	public void user_select_country_for_editing(String country) {
	 profileEdit.selectCountry(country);
	}

	@Given("User select State for Editing {string}")
	public void user_select_state_for_editing(String state) throws InterruptedException {
	    Thread.sleep(waitTime);
		profileEdit.selectState(state);
	}

	@Given("User select City for Editing {string}")
	public void user_select_city_for_editing(String city) throws InterruptedException {
		Thread.sleep(waitTime);
	    profileEdit.selectCity(city);
	}

	@Given("User enter PostalCode for Editing {string}")
	public void user_enter_postal_code_for_editing(String postalCode) {
	   profileEdit.enterPostalCode(postalCode);
	}

	@Given("User enter PermanentAddress for Editing {string}")
	public void user_enter_permanent_address_for_editing(String permanentAddress) {
	   profileEdit.enterPermanentAddress(permanentAddress);
	}

	@Given("User enter ResidentialAddress for Editing {string}")
	public void user_enter_residential_address_for_editing(String residentialAddress) {
	  profileEdit.enterResidentialAddress(residentialAddress);
	}

	@Given("User select BloodGroup for Editing {string}")
	public void user_select_blood_group_for_editing(String bloodGroup) {
	    profileEdit.selectBloodGroup(bloodGroup);
	}

	@Given("User select AnyInsurance for Editing {string}")
	public void user_select_any_insurance_for_editing(String anyInsurance) {
	  profileEdit.selectAnyInsurance(anyInsurance);
	}

	@Given("User select TimeZone for Editing {string}")
	public void user_select_time_zone_for_editing(String timeZone) {
	    profileEdit.selectTimeZone(timeZone);
	}

	@When("User click on Submit button")
	public void user_click_on_submit_button() {
	    profileEdit.clickSubmitBtn();
	}

	@When("User leaves FirstName field blank during profile Editing {string}")
	public void user_leaves_firstname_field_blank_during_profile_editing(String firstName) {
	    profileEdit.enterFirstName(firstName);
	}
	
	@When("User leaves LastName field blank during profile Editing {string}")
	public void user_leaves_lastname_field_blank_during_profile_editing(String lastName) {
	    profileEdit.enterLastName(lastName);
	}
	
	
	@Then("I validate the success message for the profile update")
	public void i_validate_the_success_message_for_the_profile_update() {
		   String actualMessage = profileEdit.checkUpdateSuccess();
		   String expectedMessage = messages.updateSuccessMsg();
		assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for blank first name")
	public void i_validate_the_error_message_for_blank_first_name() {
		   String actualMessage = profileEdit.actualFirstNameErrorMessage();
		   String expectedMessage = messages.expectedBlankFirstNameErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for less first name value")
	public void i_validate_the_error_message_for_less_first_name_value() {
		String actualMessage = profileEdit.actualFirstNameErrorMessage();
		   String expectedMessage = messages.expectedLessFirstNameErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for blank last name")
	public void i_validate_the_error_message_for_blank_last_name() {
		   String actualMessage = profileEdit.actualLastNameErrorMessage();
		   String expectedMessage = messages.expectedBlankLastNameErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for less last name value")
	public void i_validate_the_error_message_for_less_last_name_value() {
		String actualMessage = profileEdit.actualLastNameErrorMessage();
		   String expectedMessage = messages.expectedLessLastNameErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}

	@Then("I validate the error message for blank gender field")
	public void i_validate_the_error_message_for_blank_gender_field() {
		String actualMessage = profileEdit.actualGenderErrorMessage();
		   String expectedMessage = messages.expectedBlankGenderErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for invalid Alternate Email id")
	public void i_validate_the_error_message_for_invalid_alternate_email_id() {
		String actualMessage = profileEdit.actualAlternateEmailErrorMessage();
		   String expectedMessage = messages.expectedInvalidAlternateEmailErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for blank State field")
	public void i_validate_the_error_message_for_blank_state_field() {
		String actualMessage = profileEdit.actualStateErrorMessage();
		   String expectedMessage = messages.expectedBlankStateErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
	}
	
	@Then("I validate the error message for blank permanent address field")
	public void i_validate_the_error_message_for_blank_permanent_address_field() {
		String actualMessage = profileEdit.actualPermanentAddressErrorMessage();
		   String expectedMessage = messages.expectedBlankPermanentAddressErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();
		
	}
	
	@Then("I validate the error message for blank timezone field")
		public void i_validate_the_error_message_for_blank_timezone_field() {
		String actualMessage = profileEdit.actualTimeZoneErrorMessage();
		   String expectedMessage = messages.expectedBlankTimeZoneErrorMsg();
		   assertEquals(expectedMessage , actualMessage);
		   baseClass.tearDown();	
		}
	

	
	}
	
