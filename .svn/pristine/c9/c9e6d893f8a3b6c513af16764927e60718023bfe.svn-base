@tag
Feature: To verify the Physician registration functionality

  @SanityTest
  Scenario Outline: To verify the functionality of physician registration with valid data
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    And Physician select Yes as Associated with a Practice
    And Physician select Practice Location "<PracticeLocation>"
    And Physician enter DoctorName "<DoctorName>"
    And Physician enter NewPassword "<NewPassword>"
    And Physician enter ConfirmPassword "<ConfirmPassword>"
    And Physician select Country "<Country>"
    And Physician select State "<State>"
    And Physician select City "<City>"
    And Physician enter Postal Code "<PostalCode>"
    And Physician enter Email "<Email>"
    And Physician enter NPINumber "<NPINumber>"
    And Physician enter PhysicianFee "<PhysicianFee>"
    And Physician select speciality "<speciality>"
    And Physician enter LicenceNo "<LicenceNo>"
    And Physician click on Signup button
    And Physician check consent checkbox
    And Physician Draw their signature
    When Physician click on FinalSubmit button
    Then I validate the success message for physician registration

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | PracticeLocation                                                 | DoctorName | NewPassword | ConfirmPassword | Country | State | City  | PostalCode | Email                         | NPINumber | PhysicianFee | speciality | LicenceNo |
      | India       |  9889814217|  123456 | 999999 | Oakmont Community Hospital - Dreamsoft4u Public Patient Location | Naman      | Pass@123    | Pass@123        | India   | Delhi | Noida |      12345 | automashonnam104@yopmail.com |    124433 |          100 | Dental     |   3343344 |

      
@RegressionTest1
  Scenario Outline: To verify the functionality of doctor registration after leaving country code field blank
    Given Physician is on registration page
    And Physician click on countrycode cross icon
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    When Physician click on Submit button
    Then I validate the error message of blank CountryCode field for physician 

    Examples: 
      | PhoneNumber | Captcha |
      |  9891811818 |  123456 |
      

@RegressionTest2
  Scenario Outline: To verify the functionality of physician registration with phone number less then 10 data
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    When Physician enter Captcha "<Captcha>"
   # When Patient click on Submit button
    Then I validate the error message for less phone number on physician registration

    Examples: 
      | CountryCode | PhoneNumber | Captcha |
      | India       |    98918118 |  123456 |
      
@RegressionTest3
  Scenario Outline: To verify the functionality of physician registration with blank phone number
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter Captcha "<Captcha>"
    When Physician click on Submit button
    Then I validate the error message of blank PhoneNumber field for Physician

    Examples: 
      | CountryCode | Captcha |
      | India       |  123456 |
      
@RegressionTest4
  Scenario Outline: To verify the functionality of physician registration after entering invalid captcha
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    When Physician click on Submit button
    Then I validate the error message for invalid captcha for Physician

    Examples: 
      | CountryCode | PhoneNumber | Captcha |
      | India       |  9891811818 |   12345 |      
      
 @RegressionTest5
  Scenario Outline: To verify the functionality of physician registration after leaving captcha field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    When Physician click on Submit button
    Then I validate the error message for blank captcha for Physician

    Examples: 
      | CountryCode | PhoneNumber |
      | India       |  9891811818 |     
      
   @RegressionTest6
  Scenario Outline: To verify the functionality of physician registration after less character in otp field
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    When Physician enter OTP "<OTP>"
    Then I validate the error message for less value OTP for Physician

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP |
      | India       |  9891811818 |  123456 | 123 |

@RegressionTest7
  Scenario Outline: To verify the functionality of physician registration after entering invalid OTP
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    When Physician click on VerifyOTP button
    Then I validate the error message for invalid OTP for physician

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP |
      | India       |  9891811818 |  123456 | 123456 |
      
 @RegressionTest8
  Scenario Outline: To verify the functionality of physician registration after leaving otp field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    When Physician click on VerifyOTP button
    Then I validate the error message for blank OTP for physician

    Examples: 
      | CountryCode | PhoneNumber | Captcha |
      | India       |  9891811818 |  123456 |      
      
 @RegressionTest9
  Scenario Outline: To verify the functionality of physician registration after leaving FirstName field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank DoctorName

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |     
      
  @RegressionTest10
  Scenario Outline: To verify the functionality of physician registration after entering less than required character in FirstName field
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    And Physician enter DoctorName "<DoctorName>"
    When Physician click on Signup button
    Then I validate the error message for the invalid doctorname

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | DoctorName |
      | India       |  9891811818 |  123456 | 999999 | as        |      

@RegressionTest13
  Scenario Outline: To verify the functionality of physician registration after leaving password field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank Password field for Doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 | 
      
  @RegressionTest14
  Scenario Outline: To verify the functionality of physician registration after entering less than required character in Password field
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    And Physician enter NewPassword "<NewPassword>"
    When Physician click on Signup button
    Then I validate the error message for the invalid Password for doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | NewPassword |
      | India       |  9891811818 |  123456 | 999999 | as          | 
      
      
  @RegressionTest15
  Scenario Outline: To verify the functionality of physician registration after leaving confirmpassword field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank ConfirmPassword field for Doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |  
      
   @RegressionTest16
  Scenario Outline: To verify the functionality of physician registration after entering Different Confirm Password
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    And Physician enter NewPassword "<NewPassword>"
    And Physician enter ConfirmPassword "<ConfirmPassword>"
    When Physician click on Signup button
    Then I validate the error message for the different confirmPassword for doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | NewPassword | ConfirmPassword |
      | India       |  9891811818 |  123456 | 999999 | Pass@123    | swd             |
      
 @RegressionTest17
  Scenario Outline: To verify the functionality of physician registration after leaving country dropdown blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank Country Dropdown for doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |     
      
  @RegressionTest18
  Scenario Outline: To verify the functionality of physician registration after leaving state dropdown blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank State Dropdown for Doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |     
      
 @RegressionTest19
  Scenario Outline: To verify the functionality of physician registration after leaving email field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank email id field for doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |
 
 @RegressionTest20
  Scenario Outline: To verify the functionality of physician registration after entering invalid email id
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    And Physician enter Email "<Email>"
    When Physician click on Signup button
    Then I validate the error message for invalid email id for doctor

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | Email   |
      | India       |  9891811818 |  123456 | 999999 | effeefw |
      
 @RegressionTest21
  Scenario Outline: To verify the functionality of physician registration after leaving speciality field blank
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    When Physician click on Signup button
    Then I validate the error message for blank speciality

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | 
      | India       |  9891811818 |  123456 | 999999 | 
      
    @RegressionTest22
  Scenario Outline: To verify the functionality of physician registration with valid data
    Given Physician is on registration page
    And Physician select country code "<CountryCode>"
    And Physician enter PhoneNumber "<PhoneNumber>"
    And Physician enter Captcha "<Captcha>"
    And Physician click on Submit button
    And Physician click on SendOTP button
    And Physician enter OTP "<OTP>"
    And Physician click on VerifyOTP button
    And Physician select Yes as Associated with a Practice
    And Physician select Practice Location "<PracticeLocation>"
    And Physician enter DoctorName "<DoctorName>"
    And Physician enter NewPassword "<NewPassword>"
    And Physician enter ConfirmPassword "<ConfirmPassword>"
    And Physician select Country "<Country>"
    And Physician select State "<State>"
    And Physician select City "<City>"
    And Physician enter Postal Code "<PostalCode>"
    And Physician enter Email "<Email>"
    And Physician enter NPINumber "<NPINumber>"
    And Physician enter PhysicianFee "<PhysicianFee>"
    And Physician select speciality "<speciality>"
    And Physician enter LicenceNo "<LicenceNo>"
    And Physician click on Signup button
    And Physician Draw their signature
    When Physician click on FinalSubmit button
    Then I validate the error message for unchecked consent checkbox      

Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | PracticeLocation                                                 | DoctorName | NewPassword | ConfirmPassword | Country | State | City  | PostalCode | Email                         | NPINumber | PhysicianFee | speciality | LicenceNo |
      | India       |  9891813421|  123456 | 999999 | Oakmont Community Hospital - Dreamsoft4u Public Patient Location | Naman      | Pass@123    | Pass@123        | India   | Delhi | Noida |      12345 | automationnama13@yopmail.com |    124433 |          100 | Dental     |   3343344 |

              