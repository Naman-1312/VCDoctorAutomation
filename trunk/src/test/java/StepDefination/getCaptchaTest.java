package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.BaseClass;
import PageObjects.RegistrationPage;

public class getCaptchaTest {

    private static WebDriver driver;

    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass();
        baseClass.setupBrowser("Chrome");
        driver = baseClass.getDriver(); 
        baseClass.handleChatBot();
        baseClass.openUrl();
        
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.selectSignupUserType("Clinic/Practice");
        
        WebElement captchaElement = driver.findElement(By.id("scaptcha"));
       // System.out.println("Captcha Value is : " + captchaValue.getText());
        String captcha = captchaElement.getText();
        driver.findElement(By.id("CaptchaValue")).sendKeys(captcha);
        
        
    }
}