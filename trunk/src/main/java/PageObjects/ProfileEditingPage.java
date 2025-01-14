package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfileEditingPage {
	
	private WebDriverWait wait;
	private WebDriver driver;

	public ProfileEditingPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	}
	
	// Patient Locator methods

		private WebElement getProfileTab() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Patient/MyProfile']")));
		}
		private WebElement getProfileEditBtn() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@onclick=\"showModal('/Patient/EditPatientProfile')\"]")));
		}
		private WebElement getAddNewImageBtn() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='row']/div/button")));
		}
		private WebElement getRemoveImageBtn() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='row']/div/button[2]")));
		}
		private WebElement getFirstNameField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName")));
		}
		private WebElement getLastNameField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("LastName")));
		}
		private WebElement getDOBField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("DateofBirth")));
		}
		private WebElement getGenderDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("Gender")));
		}
		private WebElement getAlternateEmailField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("AlternateEmail")));
		}
		private WebElement getAlternateContactNumberField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("AlternateMobile")));
		}
		private WebElement getCountryDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("Country")));
		}
		private WebElement getStateDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("State")));
		}
		private WebElement getCityDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("City")));
		}
		private WebElement getPostalCodeField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("ZipCode")));
		}
		private WebElement getPermanentAddressField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("Address")));
		}
		private WebElement getResidentialAddressField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("ResidentialAddress")));
		}
		private WebElement getBloodTypeDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("BloodGroup")));
		}
		private WebElement getAnyInsuranceDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlIsInsurance")));
		}
		private WebElement getTimeZoneDD() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("TimeZone")));
		}
		private WebElement getSubmitBtn() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
			}
		private WebElement getCancelBtn() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='model']/div/div[3]/button")));
			}
		private WebElement getUpdateSuccessAlert() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-success")));
		}
		
// Doctor Locator Methods
		
		private WebElement getDoctorProfileTab() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Physician/MyProfile']")));
		}
		
		private WebElement getDoctorProfileEditBtn() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@onclick=\"showModal('/Physician/EditDoctorProfile')\"]")));
		}
		
		private WebElement getDoctorPrefix() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("NamePre")));
		}
		
		private WebElement getDoctorDOB() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("DateOfBirth")));
		}
		private WebElement getDoctorAlternateContactNumberField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("AlternateContactNumber")));
		}
		private WebElement getDoctorExperienceField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("Expierence")));
		}
		
		private WebElement getDoctorAboutField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("About")));
		}
		private WebElement getDoctorLicenceNumberField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("NPINumber")));
		}
		private WebElement getDoctorLicenceExpireDateField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("Exrdate")));
		}
		private WebElement getDoctorConsultancyFeeField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("Fee")));
		}
		
		private WebElement getRadiologistLicenceNumberField() {
			return wait.until(ExpectedConditions.elementToBeClickable(By.id("NPINumber")));
		}
		
		
		
	// Message Locators
		
		private WebElement getFirstNameErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='FirstName']")));
		}
		private WebElement getLastNameErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='LastName']")));
		}
		private WebElement getGenderErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='Gender']")));
		}
		private WebElement getEmailErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='Email']")));
		}
		private WebElement getAlternateEmailErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='AlternateEmail']")));
		}
		private WebElement getStateErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='State']")));
		}
		private WebElement getPermanentAddressErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='Address']")));
		}
		private WebElement getTimeZoneErrorMessage() {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@for='TimeZone']")));
		}
		
		
		
		// Action Methods

		public void clickProfileTab() {
			WebElement profileTab = getProfileTab();
			profileTab.click();
		}
		
		public void clickEditBtn() {
			WebElement editBtn = getProfileEditBtn();
			editBtn.click();
		}
		
/*		public void uploadPatientProfileImage(String profilePhotoPath) {
			WebElement imageUploader = getAddNewImageBtn();
			imageUploader.click();
			imageUploader.sendKeys(profilePhotoPath);
		}
*/
		public void uploadPatientProfileImage(String profilePhotoPath) {
		//    WebElement addNewImageBtn = getAddNewImageBtn();
	//	    addNewImageBtn.click();

		    // Wait for the file input element to be present after the button click
		    WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));

		    // Send the file path to the input element to upload the image
		    fileInput.sendKeys(profilePhotoPath);
		}
		
		public void clickRemoveProfileBtn() {
			WebElement imageRemoveBtn = getRemoveImageBtn();
			imageRemoveBtn.click();
		}
		
		public void enterFirstName(String firstName) {
			WebElement firstNameField = getFirstNameField();
			firstNameField.clear();
			firstNameField.sendKeys(firstName);
		}
		
		public void enterLastName(String lastName) {
			WebElement lastNameField = getLastNameField();
			lastNameField.clear();
			lastNameField.sendKeys(lastName);
		}
		public void enterDOB(String dob) {
			WebElement dobField = getDOBField();
			dobField.clear();
			dobField.sendKeys(dob);
		}
		public void selectGender(String gender) {
			WebElement genderDD = getGenderDD();
			genderDD.sendKeys(gender);
		}
		
		public void enterAlternateEmailId(String alternateEmailId) {
			WebElement alternateEmail = getAlternateEmailField();
			alternateEmail.clear();
			alternateEmail.sendKeys(alternateEmailId);
		}
		public void enterAlternateContactNuber(String alternateContactNo) {
			WebElement alternateContactNumber = getAlternateContactNumberField();
			alternateContactNumber.clear();
			alternateContactNumber.sendKeys(alternateContactNo);
		}
		
		public void selectCountry (String country) {
			WebElement countryDD = getCountryDD();
			countryDD.sendKeys(country);
		}
		
		public void selectState (String state) {
			WebElement stateDD = getStateDD();
			stateDD.sendKeys(state);
		}
		
		public void selectCity (String city) {
			WebElement cityDD = getCityDD();
			cityDD.sendKeys(city);
		}
		
		public void enterPostalCode (String postalCode) {
			WebElement postalCodeField = getPostalCodeField();
			postalCodeField.clear();
			postalCodeField.sendKeys(postalCode);
		}
		public void enterPermanentAddress (String permanentAddress) {
			WebElement permanentAddressField = getPermanentAddressField();
			permanentAddressField.clear();
			permanentAddressField.sendKeys(permanentAddress);
		}
		public void enterResidentialAddress (String residentialAddress) {
			WebElement residentialAddressField = getResidentialAddressField();
			residentialAddressField.clear();
			residentialAddressField.sendKeys(residentialAddress);
		}
		
		public void selectBloodGroup (String bloodGroup) {
			WebElement bloodGroupDD = getBloodTypeDD();
			bloodGroupDD.sendKeys(bloodGroup);
		}
		
		public void selectAnyInsurance (String insurance) {
			WebElement insuranceDD = getAnyInsuranceDD();
			insuranceDD.sendKeys(insurance);
		}
		
		public void selectTimeZone (String timeZone) {
			WebElement timeZoneDD = getTimeZoneDD();
			timeZoneDD.sendKeys(timeZone);
		}
		public void clickSubmitBtn() {
			WebElement submitBtn = getSubmitBtn();
			submitBtn.click();
		}
		public void clickCancelBtn() {
			WebElement cancelBtn = getCancelBtn();
			cancelBtn.click();
		}
		
		public String checkUpdateSuccess() {
			WebElement successAlert = getUpdateSuccessAlert();
			String alertText = successAlert.getText();
			String normalizedAlertText = alertText.replaceAll("\\s+", " ").trim();
			return normalizedAlertText;
		}
		
		// Error Message Action Methods
		
		public String actualFirstNameErrorMessage() {
			WebElement firstNameErrorMsg = getFirstNameErrorMessage();
			String actualMsg = firstNameErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualLastNameErrorMessage() {
			WebElement lastNameErrorMsg = getLastNameErrorMessage();
			String actualMsg = lastNameErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualGenderErrorMessage() {
			WebElement genderErrorMsg = getGenderErrorMessage();
			String actualMsg = genderErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualEmailErrorMessage() {
			WebElement emailErrorMsg = getEmailErrorMessage();
			String actualMsg = emailErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualAlternateEmailErrorMessage() {
			WebElement alternateEmailErrorMsg = getAlternateEmailErrorMessage();
			String actualMsg = alternateEmailErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualStateErrorMessage() {
			WebElement stateErrorMsg = getStateErrorMessage();
			String actualMsg = stateErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualPermanentAddressErrorMessage() {
			WebElement permanentAddressErrorMsg = getPermanentAddressErrorMessage();
			String actualMsg = permanentAddressErrorMsg.getText();
			return actualMsg;
		}
		
		public String actualTimeZoneErrorMessage() {
			WebElement timeZoneErrorMsg = getTimeZoneErrorMessage();
			String actualMsg = timeZoneErrorMsg.getText();
			return actualMsg;
		}
		
		// Doctor Action Methods
		
		public void clickDoctorProfileTab() {
			WebElement docProfileTab = getDoctorProfileTab();
			docProfileTab.click();
		}
		
		public void clickDoctorProfileEditBtn() {
			WebElement docprofileEditBtn = getDoctorProfileEditBtn();
			docprofileEditBtn.click();
		}
		
		public void selectDoctorPrefix(String prefix) {
			WebElement docPrefix = getDoctorPrefix();
			docPrefix.sendKeys(prefix);
		}
		public void selectDoctorDOB(String dob) {
			WebElement docDOB = getDoctorDOB();
			docDOB.clear();
			docDOB.sendKeys(dob);
		}
		public void enterDocAlternateContactNumber(String alternateContactNumber) {
			WebElement docAContact = getDoctorAlternateContactNumberField();
			docAContact.clear();
			docAContact.sendKeys(alternateContactNumber);
		}
		
		public void enterDoctorExperience(String experience) {
			WebElement docExperience = getDoctorExperienceField();
		//	docExperience.clear();
			docExperience.sendKeys(experience);
		}

		public void enterDoctorAbout(String about) {
			WebElement docAbout = getDoctorAboutField();
			docAbout.clear();
			docAbout.sendKeys(about);
		}
		
		public void enterDoctorLicenceNumber(String licenceNumber) {
			WebElement docLicenceNumber = getDoctorLicenceNumberField();
			docLicenceNumber.clear();
			docLicenceNumber.sendKeys(licenceNumber);
		}
		
		public void enterDoctorLicenceExpiryDate(String licenceExpiryDate) {
			WebElement docLicenceExpiry = getDoctorLicenceExpireDateField();
			docLicenceExpiry.clear();
			docLicenceExpiry.sendKeys(licenceExpiryDate);
		}
		
		
		
		public void enterDoctorConsultancyFee(String consultancyFee) {
			WebElement docConsultancyFee = getDoctorConsultancyFeeField();
			docConsultancyFee.clear();
			docConsultancyFee.sendKeys(consultancyFee);
		}
		
		public void enterRadiologistLicenceNumber(String radiologistLicenceNumber) {
			WebElement radiologistLicenceNo = getRadiologistLicenceNumberField();
			radiologistLicenceNo.clear();
			radiologistLicenceNo.sendKeys(radiologistLicenceNumber);
		}
		
		
}



