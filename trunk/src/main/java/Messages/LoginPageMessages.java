package Messages;


import org.openqa.selenium.WebDriver;


public class LoginPageMessages {
	private WebDriver driver;
	
	public LoginPageMessages(WebDriver driver) {
		this.driver = driver;
	
	}
	
	private String expectedBlankCountryCodeErrorMsg = "The Country Code field is required.";
	private String expectedBlankUserNameErrorMsg = "The User Name field is required.";
	private String expectedBlankPasswordErrorMsg = "Invalid username or password.";
	private String expectedInvalidEmailErrorMsg = "Please enter a valid email.";
	private String expectedInvalidOtpErrorMsg = "Invalid OTP";
	
	public String blankCountryCodeMessage() {
		String message = expectedBlankCountryCodeErrorMsg;
		return message;
		
	}
	
	
	public String blankUserNameErrorMessage() {
		String message = expectedBlankUserNameErrorMsg;
		return message;
		
	}
	public String blankPasswordErrorMessage() {
		String message = expectedBlankPasswordErrorMsg;
		return message;
		
	}
	
	public String invalidOtpErrorMessage() {
		String message = expectedInvalidOtpErrorMsg;
		return message;
		
	}
	public String invalidEmailErrorMessage() {
		String message = expectedInvalidEmailErrorMsg;
		return message;
		
	}
}
