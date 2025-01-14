package PageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
/*import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	private WebDriverWait wait;
	private WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	}

	// Action Buttons Locator methods

	private WebElement getSignupButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='helpsupport']")));
	}
	private WebElement getCountryCode() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-CountryCode-container")));
	}
	private WebElement getOrganizationCountryCode() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-PrimaryMobileCode-container")));
	}
	private WebElement getPhoneNumberField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("PhoneNumber")));
	}
	private WebElement getCaptchaField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("cpatchaTextBox")));
	}
	private WebElement getSubmitButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCapcha")));
	}
	private WebElement getOtpButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("btnGetOTP")));
	}
	private WebElement getOtpField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("OTP")));
	}
	private WebElement getVerifyOtpButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("btnVerifyOTP")));
	}
	private WebElement getAssociatePracticeNoRadioBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='No']")));
	}
	private WebElement getAssociatePracticeYesRadioBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Yes']")));
	}
	private WebElement getPracticeLocationDD() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("OrgLocId")));
	}
	private WebElement getFirstNameField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName")));
	}
	private WebElement getLastNameField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("LastName")));
	}
	private WebElement getNewPasswordField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("Password")));
	}
	private WebElement getReEnterPasswordField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("ConfirmPassword")));
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
	private WebElement getReferenceDD() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("ReferenceType")));
	}
	private WebElement getPostalCodeField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("ZipCode")));
	}
	private WebElement getEmailField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PatientForm']/div[13]/div[2]/div/input")));
	}
	private WebElement getLocationRadioButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='solo Practice']")));
	}
	private WebElement getTimeZoneDD() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("TimeZone")));
	}
	private WebElement getSignUpBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PatientForm']/div[15]/button")));
	}
	private WebElement getPhysicianSignUpBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PhysicianForm']/div[15]/button")));
	}
	private WebElement getConsentCheckBox() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.name("AcceptConsent")));
	}
	private WebElement getFinalSubmitBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='text-center']/button")));
	}
	
	// Doctor Action Button Locators
	
	private WebElement getDoctorNameField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName")));
	}
	private WebElement getPhysicianFeeField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("PhysicianFee")));
	}
	private WebElement getNPINumberField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("NPINumber")));
	}
	private WebElement getPhysicianEmailField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("EmailId")));
	}
	private WebElement getSpecialityDropdown() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("Speciality")));
	}
	private WebElement getLicenceNumberField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("LicenceNo")));
	}
	private WebElement getCountryCodeCrossIcon() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='select2-CountryCode-container']/span")));	
	}
	private WebElement getCountryCodeDDIcon() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='selection']/span/span[2]")));	
	}
	
	
	// Location & Organization Registration Elements
	
	private WebElement getCountryCodeCrossIconOrganization() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='select2-PrimaryMobileCode-container']/span")));	
	}
	private WebElement getPrimaryContactNumberOrganization() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("PrimaryMobileNumber")));	
	}
	private WebElement getDesignationOrganization() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("Designation")));	
	}
	private WebElement getEmailOrganization() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("AlternateEmail")));	
	}
	private WebElement getCaptchaOrganization() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("CaptchaValue")));	
	}
	private WebElement getSignupOrganization() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PhysicianForm']/div[4]/button")));	
	}

	
		// Messages Locators
	
	private WebElement getSuccessMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.className("alert alert-success success1 alert-dismissible alertStyle fade show")));
}  
	private WebElement getBlankCountryCodeMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CountryCodevaliedatiommessgae")));	
	}
	private WebElement getInvalidPhoneNumberMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='PhoneNumber']")));	
	}
	private WebElement getBlankPhoneNumberMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PhoneNumbervaliedatiommessgae")));	
	}
/*	private WebElement getInvalidCaptchaErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientForm']/div[2]/span")));	
	}
	private WebElement getBlankCaptchaErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientForm']/div[2]/span")));	
	}*/
	
	private WebElement getInvalidCaptchaErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".submit__error.captch-box")));	
	}
	private WebElement getLessOtpValueErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='field-validation-error']/span")));	
	}
	private WebElement getBlankOtpErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));	
	}
	private WebElement getBlankFirstNameErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='FirstName']")));	
	}
	private WebElement getInvalidFirstNameErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientForm']/div[8]/div[1]/div/span/span")));	
	}
	private WebElement getBlankLastNameErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientForm']/div[8]/div[2]/div/span/span")));	
	}
	private WebElement getInvalidLastNameErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientForm']/div[8]/div[2]/div/span/span")));	
	}
	private WebElement getBlankPasswordErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='Password']")));	
	}
	private WebElement getInvalidPasswordErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='Password']")));	
	}
	private WebElement getBlankConfirmPasswordErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='ConfirmPassword']")));	
	}
	private WebElement getDifferentConfirmPasswordErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='ConfirmPassword']")));	
	}
	private WebElement getBlankCountryErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='Country']")));	
	}
	private WebElement getBlankStateErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='State']")));	
	}
	private WebElement getBlankEmailErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='Email']")));	
	}
	private WebElement getInvalidEmailErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='Email']")));	
	}
	private WebElement getBlankSpecialityErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='Speciality']")));	
	}
	private WebElement getUncheckedConsentCheckboxErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ConsentForm']/div[3]/div[2]/span")));	
	}
	private WebElement getBlankOtpMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.className("toast-message")));
		//Please enter phone number and OTP!
	}
	
// Location & Organization Error Message Locators
	
	private WebElement getBlankCountryCodeErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PrimaryMobileCodevaliedatiommessgae")));	
	}
	private WebElement getBlankPhoneNumberErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PrimaryMobileNumbervaliedatiommessgae")));	
	}
	private WebElement getBlankFirstNameErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("FirstNamevaliedatiommessgae")));	
	}
	private WebElement getBlankLastNameErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("LastNamevaliedatiommessgae")));	
	}
	private WebElement getBlankDesignationErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Designationvaliedatiommessgae")));	
	}
	private WebElement getBlankEmailErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("AlternateEmailvaliedatiommessgae")));	
	}
	private WebElement getBlankCapthcaErrorMsgLocation() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("captchaVal")));	
	}
	
	
	
	// Action methods for the fields

	public void selectSignupUserType(String userType) {
		WebElement signUpBtn = getSignupButton();
		signUpBtn.click();

		WebElement selectedOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(userType)));
		selectedOption.click();

	}
	public void selectCountryCode(String countryCode) {
		WebElement countryCodeField = getCountryCode();
		countryCodeField.click();
		WebElement searchBox = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.select2-search__field")));
		searchBox.sendKeys(countryCode);
		WebElement selectedOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), '" + countryCode + "')]")));
		selectedOption.click();
	}
	public void enterPhoneNumber(String phoneNumber) {
		WebElement phoneNumberField = getPhoneNumberField();
		phoneNumberField.sendKeys(phoneNumber);
	}
	public void enterCaptcha(String captcha) {
		WebElement captchaField = getCaptchaField();
		captchaField.sendKeys(captcha);
	}
	public void clickSubmitButton() {
		WebElement submitBtn = getSubmitButton();
		submitBtn.click();
	}
	public void clickSendOtpButton() {
		WebElement getOtpbtn = getOtpButton();
		getOtpbtn.click();
	}
	public void enterOtpField(String OTP) {
		WebElement otpField = getOtpField();
		otpField.sendKeys(OTP);
	}
	public void clickVerifyOtpButton() {
		WebElement verifyOtpBtn = getVerifyOtpButton();
		verifyOtpBtn.click();
	}
	public void clickAssociatePracticeNoRadioButton() {
		WebElement verifyNoRadioBtn = getAssociatePracticeNoRadioBtn();
		if (!verifyNoRadioBtn.isSelected()) {
			verifyNoRadioBtn.click();
		}else {
			System.out.println("Radio Button is already selected");
		}

	}
	public void clickAssociatePracticeYesRadioButton() {
		WebElement verifyYesRadioBtn = getAssociatePracticeYesRadioBtn();
		if (!verifyYesRadioBtn.isSelected()) {
			verifyYesRadioBtn.click();
		}else {
			System.out.println("Radio Button is already selected");
		}
	}
	public void selectPracticeLocationOption(String practiceLocation) {
		WebElement practiceLocationDd = getPracticeLocationDD();
		practiceLocationDd.sendKeys(practiceLocation);
	}
	public void enterFirstName(String firstName) {
		WebElement firstNameField = getFirstNameField() ;
		firstNameField.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		WebElement lastNameField = getLastNameField() ;
		lastNameField.sendKeys(lastName);
	}
	public void enterNewPassword(String newPassword) {
		WebElement newPasswordField = getNewPasswordField() ;
		newPasswordField.sendKeys(newPassword);
	}
	public void enterConfirmPassword(String confirmPassword) {
		WebElement confirmPasswordField = getReEnterPasswordField();
		confirmPasswordField.sendKeys(confirmPassword);
	}
	public void selectCountryOption(String country) {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement countryDd = getCountryDD();
		countryDd.sendKeys(country);
	}
	public void selectStateOption(String state) {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement stateDd = getStateDD();
		stateDd.sendKeys(state);
	}
	public void selectCityOption(String city) {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement cityDd = getCityDD();
		cityDd.sendKeys(city);
	}
	public void selectReferenceTypeOption(String referenceType) {
		WebElement referenceTypeDd = getReferenceDD();
		referenceTypeDd.sendKeys(referenceType);
	}
	public void enterPostalCode(String postalCode) {
		WebElement postalCodeField = getPostalCodeField();
		postalCodeField.sendKeys(postalCode);
	}
	public void enterEmail(String email) {
		WebElement emailField = getEmailField();
		emailField.sendKeys(email);
	}
	
	public void enterPhysicianEmail(String email) {
		WebElement physicianEmailField = getPhysicianEmailField();
		physicianEmailField.sendKeys(email);
	}
	
	
	
	
	public void selectTimeZoneOption(String timeZone) {
		WebElement timeZoneDd = getTimeZoneDD();
		timeZoneDd.sendKeys(timeZone);
	}
	public void clickSignUpButton() {
		WebElement signUpBtn = getSignUpBtn();
		signUpBtn.click();
	}
	public void clickPhysicianSignUpButton() {
		WebElement signUpBtn = getPhysicianSignUpBtn();
		signUpBtn.click();
	}
	public String isRegistrationSuccess() {
		WebElement successMessage = getSuccessMessage();
		String registrationSuccessMessage = successMessage.getText();
		return registrationSuccessMessage;
	}
	

	// Prefix Action Methods
	/*	public void selectPrefix(String prefix) {
		WebElement prefixField =  ();
		prefixField.click();
		WebElement searchBox = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.select2-search__field")));
		searchBox.sendKeys(prefix);
		WebElement selectedOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), '" + prefix + "')]")));
		selectedOption.click();
	}
	 */
	public void checkConsentCheckbox() {
		WebElement checkbox = getConsentCheckBox();
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
		else {
			System.out.println("Checkbox check nhi hua");
		}




	}
	public void clickFinalSubmitButton(){
		WebElement finalSubmitBtn = getFinalSubmitBtn();
		finalSubmitBtn.click();
	}
	public void enterDoctorName(String doctorName) {
		WebElement doctorNameField = getDoctorNameField();
		doctorNameField.sendKeys(doctorName);
	}
	public void enterPhysicianFee(String physicianFee) {
		WebElement physicianFeeField = getPhysicianFeeField();
		physicianFeeField.clear();		
		physicianFeeField.sendKeys(physicianFee);
	}
	public void enterNPINumber(String Npinumber) {
		WebElement npiNumberField = getNPINumberField();
		npiNumberField.sendKeys(Npinumber);
	}
	public void enterLicenceNumber(String licenceNumber) {
		WebElement licenceNumberField = getLicenceNumberField();
		licenceNumberField.sendKeys(licenceNumber);
	}
	public void selectSpecialityDropdown(String speciality) {
		WebElement doctorSpecialityDD = getSpecialityDropdown();
		doctorSpecialityDD.sendKeys(speciality);
	}
	public void drawSignature(String canvasSelector) {
		// Locate the canvas element
		WebElement canvas = driver.findElement(By.cssSelector(canvasSelector));

		Actions actions = new Actions(driver);

		// Move to the starting point of the circle
		actions.moveToElement(canvas, 5, 5).clickAndHold();

		// Draw the circle by moving the mouse in small increments
		for (int i = 0; i < 360; i += 10) {
			double angle = Math.toRadians(i);
			int xOffset = (int) (2 * Math.cos(angle)); // Radius of 10 pixels
			int yOffset = (int) (2 * Math.sin(angle));
			actions.moveByOffset(xOffset, yOffset);
		}
// Release the mouse button to complete the drawing
		actions.release().build().perform();
	}
	public void clickCountryCodeCrossIcon() {
		WebElement crossIcon = getCountryCodeCrossIcon();
		crossIcon.click();
	}
	
	public void clickCountryCodeDDIcon() {
		WebElement ddIcon = getCountryCodeDDIcon();
		ddIcon.click();
	}
	
	
	
	public boolean physicianRegistrationSuccessCheck(){
		String actualUrl = driver.getCurrentUrl(); 
		return "https://qa.vcdoctor.com/Account/RegisterSucess?RoleName=Physician".equals(actualUrl);
		
}
	public boolean patientRegistrationSuccessCheck(){
		String actualUrl = driver.getCurrentUrl(); 
		return "https://qa.vcdoctor.com/Account/RegisterSucess?RoleName=Patient".equals(actualUrl);
		
	}
	
	public boolean locationRegistrationSuccessCheck(){
		String actualUrl = driver.getCurrentUrl(); 
		return "https://qa.vcdoctor.com/Account/RegisterSucess?RoleName=Location&UserProfileId=0".equals(actualUrl);
		
	}
	/*public boolean organizationRegistrationSuccessCheck(){
		String actualUrl = driver.getCurrentUrl(); 
		return "https://qa.vcdoctor.com/Account/RegisterSucess?RoleName=Organization&UserProfileId=0".equals(actualUrl);
		
	}*/
	public boolean organizationRegistrationSuccessCheck() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	    return wait.until(ExpectedConditions.urlToBe("https://qa.vcdoctor.com/Account/RegisterSucess?RoleName=Organization&UserProfileId=0"));
	}
	
	// To handle the pop-up of chatbot
	
/*	public void chatBotHandle() {
	    String idName = "tawk-chat-message-container";
	    // Second id = tawk-message-preview
	    // class = tawk-flex
	    try {
	        // Locate the element by ID
	        WebElement scriptElement = driver.findElement(By.id(idName));  // 
	        
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("var element = document.getElementById(arguments[0]); if (element) { element.remove(); }", idName);
	        
	        System.out.println("ChatBot delete kr dia" + scriptElement);
	    } catch (NoSuchElementException e) {
	        System.out.println("Chatbot delete nhi ho paya");
	    }
	}
*/
	
	
/*
	public void chatBotHandle() throws TimeoutException {
	    String idName = "tawk-chat-message-container";
	    int timeoutInSeconds = 30;  // Adjust timeout if needed
	   

	    try {
	        // Check if the element is inside an iframe and switch context if necessary
	        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	        if (!iframes.isEmpty()) {
	            for (WebElement iframe : iframes) {
	                driver.switchTo().frame(iframe);  // Switch to the iframe
	                WebElement chatElement = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
					        .until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));

					// If found inside this iframe, proceed with deletion
					JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
					jsExecutor.executeScript("var element = document.getElementById(arguments[0]); if (element) { element.remove(); }", idName);

					System.out.println("ChatBot deleted successfully inside iframe");
					driver.switchTo().defaultContent();  // Switch back to the main page
					return;  // Exit after successful deletion
	            }
	        }

	        // Try finding the element in the main page if not in any iframe
	        WebElement chatElement = new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));

	        // Proceed with deletion
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("var element = document.getElementById(arguments[0]); if (element) { element.remove(); }", idName);

	        System.out.println("ChatBot deleted successfully on the main page");
	        
	    } catch (NoSuchElementException e) {
	        System.out.println("ChatBot element not found or could not be deleted");
	    }
	}

	 */       
	
	
	// Organization & Location Registration Action Methods
	
	
	public void selectOrganizationCountryCode(String countryCode) {
		WebElement countryCodeField = getOrganizationCountryCode();
		countryCodeField.click();
		WebElement searchBox = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.select2-search__field")));
		searchBox.sendKeys(countryCode);
		WebElement selectedOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), '" + countryCode + "')]")));
		selectedOption.click();
	}
	
	public void checkLocationRadioButton() {
		WebElement locationRadioBtn = getLocationRadioButton();
		locationRadioBtn.click();
	}
	
	
	public void clickCountryCodeCrossIconOrganization() {
		WebElement countryCodeDD = getCountryCodeCrossIconOrganization();
		countryCodeDD.click();
	}
	
	public void enterPhoneNumberOrganization(String PhoneNumber) {
		WebElement phoneNumber = getPrimaryContactNumberOrganization();
		phoneNumber.sendKeys(PhoneNumber);
	}
	
	public void enterDesignationOrganization(String Designation) {
		WebElement designationField = getDesignationOrganization();
		designationField.sendKeys(Designation);
	}
	
	public void enterEmailOrganization(String Email) {
		WebElement emailField = getEmailOrganization();
		emailField.sendKeys(Email);
	}
	
/*	public void enterCaptchaOrganization(String captcha) {
		WebElement captchaField = getCaptchaOrganization();
		captchaField.sendKeys(captcha);
	}
	*/
	public void enterCaptchaOrganization() {
		WebElement captchaField = getCaptchaOrganization();
		WebElement captchaElement = driver.findElement(By.id("scaptcha"));
		String captcha = captchaElement.getText();
		captchaField.sendKeys(captcha);
	}
	public void clickOrganizationSignUpBtn() {
		WebElement signupBtn = getSignupOrganization();
		signupBtn.click();
	}
	
	

	// Field Messages Method
	
	public String checkBlankCountryCodeErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankCountryCodeMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkLessPhoneNumberErrorMsg() {
	WebElement lessPhoneNumberFieldErrorMsg = getInvalidPhoneNumberMessage(); 
	String actualErrorMessage =	lessPhoneNumberFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankPhoneNumberErrorMsg() {
	WebElement blankPhoneNumberFieldErrorMsg = getBlankPhoneNumberMessage(); 
	String actualErrorMessage =	blankPhoneNumberFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkInvalidCaptchaErrorMsg() {
	WebElement invalidCaptchaFieldErrorMsg = getInvalidCaptchaErrorMessage(); 
	String actualErrorMessage =	invalidCaptchaFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankCaptchaErrorMsg() {
	WebElement blankCaptchaFieldErrorMsg = getInvalidCaptchaErrorMessage(); 
	String actualErrorMessage =	blankCaptchaFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkLessOtpValueErrorMsg() {
	WebElement lessOtpValueFieldErrorMsg = getLessOtpValueErrorMessage(); 
	String actualErrorMessage =	lessOtpValueFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankOtpErrorMsg() {
	WebElement blankOtpFieldErrorMsg = getBlankOtpErrorMessage(); 
	String actualErrorMessage =	blankOtpFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkInvalidOtpErrorMsg() {
	WebElement invalidOtpFieldErrorMsg = getBlankOtpErrorMessage(); 
	String actualErrorMessage =	invalidOtpFieldErrorMsg.getText();
	return actualErrorMessage;
}
	
		
	
	public String checkBlankFirstNameErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankFirstNameErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkInvalidFirstNameErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getInvalidFirstNameErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankLastNameErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankLastNameErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkInvalidLastNameErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getInvalidLastNameErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankPasswordErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankPasswordErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkInvalidPasswordErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getInvalidPasswordErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}	
	public String checkBlankConfirmPasswordErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankConfirmPasswordErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkDifferentConfirmPasswordErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getDifferentConfirmPasswordErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}	
	public String checkBlankCountryErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankCountryErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankStateErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankStateErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankEmailErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getBlankEmailErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkInvalidEmailErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getInvalidEmailErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkUncheckedConsentErrorMsg() {
	WebElement blankCountryCodeFieldErrorMsg = getUncheckedConsentCheckboxErrorMessage(); 
	String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
	return actualErrorMessage;
}
	public String checkBlankOtpMessage() {
		WebElement blankOtpMessage = getBlankOtpMessage();
		String blankOtpMsg = blankOtpMessage.getText();
		return blankOtpMsg;
	}
	
	public String checkBlankSpecialityMessage() {
		WebElement blankSpecialityMsg = getBlankSpecialityErrorMessage();
		String blankSpecialityMessage = blankSpecialityMsg.getText(); 
	return blankSpecialityMessage;
	}


// Location & Organization Error Messages Methods

public String checkBlankCountryCodeMessageLocation() {
	WebElement blankCountryCodeMsg = getBlankCountryCodeErrorMsgLocation();
	String blankCountryCodeMessage = blankCountryCodeMsg.getText(); 
return blankCountryCodeMessage;
}

public String checkBlankPhoneNumberMessageLocation() {
	WebElement blankPhoneNumberMsg = getBlankPhoneNumberErrorMsgLocation();
	String blankPhoneNumberMessage = blankPhoneNumberMsg.getText(); 
return blankPhoneNumberMessage;
}
public String checkLessPhoneNumberMessageLocation() {
	WebElement lessPhoneNumberMsg = getBlankPhoneNumberErrorMsgLocation();
	String lessPhoneNumberMessage = lessPhoneNumberMsg.getText(); 
return lessPhoneNumberMessage;
}
public String checkBlankFirstNameMessage() {
	WebElement blankFirstNameMsg = getBlankFirstNameErrorMsgLocation();
	String blankFirstNameMessage = blankFirstNameMsg.getText(); 
return blankFirstNameMessage;
}
public String checkBlankLastNameMessageLocation() {
	WebElement blankLastNameMsg = getBlankLastNameErrorMsgLocation();
	String blankLastNameMessage = blankLastNameMsg.getText(); 
return blankLastNameMessage;
}
public String checkBlankDesignationMessageLocation() {
	WebElement blankDesignationMsg = getBlankDesignationErrorMsgLocation();
	String blankDesignationMessage = blankDesignationMsg.getText(); 
return blankDesignationMessage;
}
public String checkBlankEmailMessageLocation() {
	WebElement blankEmailMsg = getBlankEmailErrorMsgLocation();
	String blankEmailMessage = blankEmailMsg.getText(); 
return blankEmailMessage;
}
public String checkBlankCaptchaErrorMessage() {
	WebElement blankCaptchaMsg = getBlankCapthcaErrorMsgLocation();
	String blankCaptchaMessage = blankCaptchaMsg.getText(); 
return blankCaptchaMessage;
}
}







