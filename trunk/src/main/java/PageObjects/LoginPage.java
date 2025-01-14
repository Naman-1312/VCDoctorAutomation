package PageObjects;

import java.time.Duration;
//import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriverWait wait;
	private WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	}



	// Locator methods

	private WebElement getCountryCode() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-CountryCode-container")));
	}
	private WebElement getCountryCodeCrossIcon() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.className("select2-selection__clear")));
	}
	private WebElement getUserNameField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("UserName")));
	}
	private WebElement getPasswordField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("Password")));
	}
	private WebElement getOTPOption() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("btnotpclick")));
	}
	private WebElement getOTPBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='loginwithotp']/button[2]")));
	}
	private WebElement getLoginBtnPass() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='loginwithpass']/button")));
	}
	private WebElement getLoginBtnOtp() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='loginwithotp']/button")));
	}	
	
	private WebElement getCaptchaField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("CaptchaValue")));
	}
	private WebElement getOTPField() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("OTP")));
	}
	private WebElement getBlankCountryCodeErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CountryCodevaliedatiommessgae")));
	}
	private WebElement getBlankUserNameErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PhoneNumbervaliedatiommessgae")));
	}
	private WebElement getInvalidUserNameErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LoginForm']/div/ul/li")));
	}
	
	private WebElement getInvalidOTPErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LoginForm']/div/ul/li")));
	}
	
	private WebElement getLoginConfirmationPopup() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='confirmbox']/div/div")));
	}
	
/*	private WebElement getChatBotPopUp() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tawk-bubble-container")));
	}
	*/
/*	private WebElement getConfirmationPopUp() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='confirmbox']/div/div")));
	}	
*/	
	
/*	private Boolean patientLoginSuccessCheck() {
		return wait.until(ExpectedConditions.urlToBe("https://qa.vcdoctor.com/Dashboard/PatientDashBoard"));
	} */
	
/*	private Boolean physicianLoginSuccessCheck() {
		return wait.until(ExpectedConditions.urlToBe("https://qa.vcdoctor.com/Dashboard/PhysicianDashBoard"));
	} */
	
	
	
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
	public void clickCountryCodeCrossIcon() {
		WebElement crossIcon = getCountryCodeCrossIcon();
		crossIcon.click();
	}
	public void enterUserName(String userName) {
		WebElement userNameField = getUserNameField();
		userNameField.sendKeys(userName);
	}
	public void enterPassword(String password) {
		WebElement passwordField = getPasswordField();
		passwordField.sendKeys(password);
	}
	public void clickLoginWithOtpOption() {
		WebElement loginWithOtpOption = getOTPOption();
		loginWithOtpOption.click();
	}
	
	public void clickLoginWithOtpBtn() {
		WebElement loginWithOtpBtn = getOTPBtn();
		loginWithOtpBtn.click();
	}
	
public void clickLoginBtnWithPass() {
		WebElement loginBtn = getLoginBtnPass();
		loginBtn.click();
	}
	
	/*
	public void clickLoginBtnWithPass() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement chatBotPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='tawk-min-container']/button")));
            // Locate the chatbot container
//            WebElement chatBotPopup = driver.findElement(By.id("tawk-bubble-container"));
            // Check if the chatbot popup is displayed
            if (chatBotPopup.isDisplayed()) {
                // Locate the cross icon button (you might need to adjust the locator as per the actual HTML)
                WebElement closeButton = driver.findElement(By.xpath("//*[@id='tawk-mpreview-close']/i"));
                
                // Click the close button
                closeButton.click();
                
                System.out.println("Chatbot popup bnd kr dia");
            }
        } catch (NoSuchElementException e) {
            // If the element is not found, proceed with the next action
            System.out.println("Chatbot nhi aya");
        }
		WebElement loginBtn = getLoginBtnPass();
		loginBtn.click();
	} 
	*/
	
	
	public void clickLoginBtnWithOtp() {
		WebElement loginBtn = getLoginBtnOtp();
		loginBtn.click();
	}
	
	//
	public void enterCaptcha(String captcha) {
		WebElement captchaField = getCaptchaField();
		captchaField.sendKeys(captcha);
	}
	public void enterOTP(String otp) {
		WebElement otpField = getOTPField();
		otpField.sendKeys(otp);
	}
/*	public boolean checkPatientDashboardPageVisible() {
		String actualUrl = driver.getCurrentUrl(); 
	return "https://qa.vcdoctor.com/Dashboard/PatientDashBoard".equals(actualUrl);
	}
	*/
	
	public boolean checkPatientDashboardPageVisible() {
	    // Set the explicit wait
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    boolean isUrlCorrect = wait.until(ExpectedConditions.urlToBe("https://qa.vcdoctor.com/Dashboard/PatientDashBoard"));
	    return isUrlCorrect;
	}
	
	
/*	public boolean checkPhysicianDashboardPageVisible() {
	String actualUrl = driver.getCurrentUrl(); 
	return "https://qa.vcdoctor.com/Dashboard/DoctorDashboard".equals(actualUrl);
	
	}
	*/
	
	public boolean checkPhysicianDashboardPageVisible(WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    boolean isUrlCorrect = wait.until(ExpectedConditions.urlToBe("https://qa.vcdoctor.com/Dashboard/DoctorDashBoard"));
	    return isUrlCorrect;
	}

	public String checkBlankCountryCodeErrorMsg() {
		WebElement blankCountryCodeFieldErrorMsg = getBlankCountryCodeErrorMessage(); 
		String actualErrorMessage =	blankCountryCodeFieldErrorMsg.getText();
		return actualErrorMessage;
	}
	
	public String checkBlankUserNameErrorMsg() {
		WebElement blankUserNameFieldErrorMsg = getBlankUserNameErrorMessage(); 
		String actualErrorMessage =	blankUserNameFieldErrorMsg.getText();
		return actualErrorMessage;
	}
	
	public String checkInvalidUserNameErrorMsg() {
		WebElement invalidUserNameFieldErrorMsg = getInvalidUserNameErrorMessage(); 
		String actualErrorMessage =	invalidUserNameFieldErrorMsg.getText();
		return actualErrorMessage;
	}
	
	public String checkInvalidOTPErrorMsg() {
		WebElement invalidOTPFieldErrorMsg = getInvalidOTPErrorMessage(); 
		String actualErrorMessage =	invalidOTPFieldErrorMsg.getText();
		return actualErrorMessage;
	}
	
public void handleLoginConfirmationPopup() {
	    try {
	      
	    	WebElement popup = getLoginConfirmationPopup();
	        // Check if pop-up is displayed
	        if (popup.isDisplayed()) {
	            // Wait for the "Yes" button to be clickable
	            WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Yes']")));
	            yesButton.click();
	            System.out.println("Yes button click kr dia.");
	        }
	    } catch (TimeoutException e) {
	        
	    	// Case where the Popup show nhi hua
	        System.out.println("Pop-up show nhi hua");

	}
}

/*	public void handleLoginConfirmationPopup() {
	    try {
	        // Check if pop-up is visible
	        WebElement popup = getLoginConfirmationPopup();
	        
	        if (popup.isDisplayed()) {
	            // If pop-up is displayed, Yes Button click krne k lie
	            WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Yes']")));
	            yesButton.click();
	            System.out.println("Yes button clicked.");
	        }
	    } catch (TimeoutException e) {
	        
	    	// Case where the Popup show nhi hua
	        System.out.println("Pop-up show nhi hua");
	    } catch (NoSuchElementException e) {
	        // Catch the case where the element is not found
	        System.out.println("Pop-up Ya Yes button not found.");
	    } catch (Exception e) {
	        // General catch block to handle any other exceptions
	        System.out.println("An unexpected error occurred: " + e.getMessage());
	    }
	}	
	*/
   
  /*  public void handleChatBotPopup() {
        try {
            // Locate the chatbot container
            WebElement chatBotPopup = driver.findElement(By.id("tawk-chat-message-container"));
            
            // Check if the chatbot popup is displayed
            if (chatBotPopup.isDisplayed()) {
                // Locate the cross icon button (you might need to adjust the locator as per the actual HTML)
                WebElement closeButton = driver.findElement(By.xpath("//*[@id='tawk-mpreview-close']/i"));
                
                // Click the close button
                closeButton.click();
                
                System.out.println("Chatbot popup bnd kr dia");
            }
        } catch (NoSuchElementException e) {
            // If the element is not found, proceed with the next action
            System.out.println("Chatbot nhi aya");
        }
    } */
	
    public void handleOtpSentSuccessAlert() {
    	Alert alert = driver.switchTo().alert();
    	// Get the text from the alert
    	String alertText = alert.getText();
    	System.out.println("Alert text is: " + alertText);
    	alert.accept();
    	
    }
}


