package Messages;

import org.openqa.selenium.WebDriver;

public class ProfileUpdateMessages {
private WebDriver driver;
	
	public ProfileUpdateMessages(WebDriver driver) {
		this.driver = driver;
	
	}
	private String expectedProfileSuccessMsg = "× Updated Successfully";
	private String blankFirstNameErrorMsg = "The First Name field is required.";
	private String lessFirstNameErrorMsg = "The field First Name must be a string with a minimum length of 3 and a maximum length of 30.";
	private String blankLastNameErrorMsg = "The Last Name field is required.";
	private String lessLastNameErrorMsg = "The field Last Name must be a string with a minimum length of 3 and a maximum length of 30.";
	private String blankGenderErrorMsg = "The Gender field is required.";
	private String blankEmailErrorMsg = "The Email field is required.";
	private String invalidEmailErrorMsg = "The Email field is not a valid e-mail address.";
	private String invalidAlternateEmailErrorMsg = "The Alternate Email field is not a valid e-mail address.";
	private String blankStateErrorMsg = "The State field is required.";
	private String blankPermanentAddressErrorMsg = "The Permanent Address field is required.";
	private String blankTimeZoneErrorMsg = "The Time Zone field is required.";
	
	
	public String updateSuccessMsg() {
		String message = expectedProfileSuccessMsg;
		return message;
		
	}

	public String expectedBlankFirstNameErrorMsg() {
		String message = blankFirstNameErrorMsg;
		return message;
	}
	
	public String expectedLessFirstNameErrorMsg() {
		String message = lessFirstNameErrorMsg;
		return message;
	}
	public String expectedBlankLastNameErrorMsg() {
		String message = blankLastNameErrorMsg;
		return message;
	}
	
	public String expectedLessLastNameErrorMsg() {
		String message = lessLastNameErrorMsg;
		return message;
	}
	public String expectedBlankGenderErrorMsg() {
		String message = blankGenderErrorMsg;
		return message;
	}
	public String expectedBlankEmailErrorMsg() {
		String message = blankEmailErrorMsg;
		return message;
	}
	public String expectedInvalidEmailErrorMsg() {
		String message = invalidEmailErrorMsg;
		return message;
	}
	
	public String expectedInvalidAlternateEmailErrorMsg() {
	String message = invalidAlternateEmailErrorMsg;
	return message;
}
	public String expectedBlankStateErrorMsg() {
		String message = blankStateErrorMsg;
		return message;
	}
	
	public String expectedBlankPermanentAddressErrorMsg() {
		String message = blankPermanentAddressErrorMsg;
		return message;
	}
	public String expectedBlankTimeZoneErrorMsg() {
		String message = blankTimeZoneErrorMsg;
		return message;
	}
}
