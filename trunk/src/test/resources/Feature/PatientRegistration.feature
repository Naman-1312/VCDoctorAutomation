@tag
Feature: To verify the Patient registration functionality

  @SanityTest
  Scenario Outline: To verify the functionality of patient registration with valid data
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    And Patient select Yes as Associated with a Practice
    And Patient select Practice Location "<PracticeLocation>"
    And Patient enter FirstName "<FirstName>"
    And Patient enter LastName "<LastName>"
    And Patient enter NewPassword "<NewPassword>"
    And Patient enter ConfirmPassword "<ConfirmPassword>"
    And Patient select Country "<Country>"
    And Patient select State "<State>"
    And Patient select City "<City>"
    And Patient select ReferenceType "<ReferenceType>"
    And Patient enter Postal Code "<PostalCode>"
    And Patient enter Email "<Email>"
    And Patient select TimeZone "<TimeZone>"
    And Patient click on Signup button
    And Patient check consent checkbox
    When Patient click on FinalSubmit button
    Then I validate the success message

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | PracticeLocation                                                 | FirstName  | LastName | NewPassword | ConfirmPassword | Country | State | City  | ReferenceType | PostalCode | Email                           | TimeZone                                        |
      | India       |  9884561171 |  123456 | 999999 | Oakmont Community Hospital - Dreamsoft4u Public Patient Location | Automation | Last     | Pass@123    | Pass@123        | India   | Delhi | Noida | Direct        |     123456 | automatonsmal44223@yopmail.com | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest1
  Scenario Outline: To verify the functionality of patient registration after leaving country code field blank
    Given Patient is on registration page
    And Patient click on countrycode cross icon
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    When Patient click on Submit button
    Then I validate the error message of blank CountryCode field

    Examples: 
      | PhoneNumber | Captcha |
      |  9891811818 |  123456 |

  @RegressionTest2
  Scenario Outline: To verify the functionality of patient registration with phone number less then 10 data
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    When Patient enter Captcha "<Captcha>"
   # When Patient click on Submit button
    Then I validate the error message for less phone number

    Examples: 
      | CountryCode | PhoneNumber | Captcha |
      | India       |    98918118 |  123456 |

  @RegressionTest3
  Scenario Outline: To verify the functionality of patient registration with blank phone number
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter Captcha "<Captcha>"
    When Patient click on Submit button
    Then I validate the error message of blank PhoneNumber field

    Examples: 
      | CountryCode | Captcha |
      | India       |  123456 |

  @RegressionTest4
  Scenario Outline: To verify the functionality of patient registration after entering invalid captcha
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter invalid Captcha "<Captcha>"
    When Patient click on Submit button
    Then I validate the error message for invalid captcha

    Examples: 
      | CountryCode | PhoneNumber | Captcha |
      | India       |  9891811818 |   12345 |

  @RegressionTest5
  Scenario Outline: To verify the functionality of patient registration after leaving captcha field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    When Patient click on Submit button
    Then I validate the error message for blank captcha

    Examples: 
      | CountryCode | PhoneNumber |
      | India       |  9891811818 |

  @RegressionTest6
  Scenario Outline: To verify the functionality of patient registration after less character in otp field
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    When Patient enter OTP "<OTP>"
    # When Patient click on VerifyOTP button
    Then I validate the error message for less value OTP

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP |
      | India       |  9891811818 |  123456 | 123 |

  @RegressionTest7
  Scenario Outline: To verify the functionality of patient registration after entering invalid OTP
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    When Patient click on VerifyOTP button
    Then I validate the error message for invalid OTP

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP |
      | India       |  9891811818 |  123456 | 123 |

  @RegressionTest8
  Scenario Outline: To verify the functionality of patient registration after leaving otp field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    When Patient click on VerifyOTP button
    Then I validate the error message for blank OTP

    Examples: 
      | CountryCode | PhoneNumber | Captcha |
      | India       |  9891811818 |  123456 |

  @RegressionTest9
  Scenario Outline: To verify the functionality of patient registration after leaving FirstName field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank FirstName field

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest10
  Scenario Outline: To verify the functionality of patient registration after entering less than required character in FirstName field
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    And Patient enter FirstName "<FirstName>"
    When Patient click on Signup button
    Then I validate the error message for the invalid firstname

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | FirstName |
      | India       |  9891811818 |  123456 | 999999 | as        |

  @RegressionTest11
  Scenario Outline: To verify the functionality of patient registration after leaving LastName field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank LastName field

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest12
  Scenario Outline: To verify the functionality of patient registration after entering less than required character in LastName field
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    And Patient enter LastName "<LastName>"
    When Patient click on Signup button
    Then I validate the error message for the invalid lastname

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | LastName |
      | India       |  9891811818 |  123456 | 999999 | as       |

  @RegressionTest13
  Scenario Outline: To verify the functionality of patient registration after leaving password field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank Password field

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest14
  Scenario Outline: To verify the functionality of patient registration after entering less than required character in Password field
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    And Patient enter NewPassword "<NewPassword>"
    When Patient click on Signup button
    Then I validate the error message for the invalid Password

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | NewPassword |
      | India       |  9891811818 |  123456 | 999999 | as          |

  @RegressionTest15
  Scenario Outline: To verify the functionality of patient registration after leaving confirmpassword field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank ConfirmPassword field

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest16
  Scenario Outline: To verify the functionality of patient registration after entering Different Confirm Password
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    And Patient enter NewPassword "<NewPassword>"
    And Patient enter ConfirmPassword "<ConfirmPassword>"
    When Patient click on Signup button
    Then I validate the error message for the different confirmPassword

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | NewPassword | ConfirmPassword |
      | India       |  9891811818 |  123456 | 999999 | Pass@123    | swd             |

  @RegressionTest17
  Scenario Outline: To verify the functionality of patient registration after leaving country dropdown blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank Country Dropdown

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest18
  Scenario Outline: To verify the functionality of patient registration after leaving state dropdown blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank State Dropdown

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest19
  Scenario Outline: To verify the functionality of patient registration after leaving email field blank
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    Then I validate the error message for blank email id field

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    |
      | India       |  9891811818 |  123456 | 999999 |

  @RegressionTest20
  Scenario Outline: To verify the functionality of patient registration after entering invalid email id
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    When Patient click on Signup button
    And Patient enter Email "<Email>"
    Then I validate the error message for invalid email id

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | Email   |
      | India       |  9891811818 |  123456 | 999999 | effeefw |

  @RegressionTest21
  Scenario Outline: To verify the functionality of patient registration without checking the consent checkbox
    Given Patient is on registration page
    And Patient select country code "<CountryCode>"
    And Patient enter PhoneNumber "<PhoneNumber>"
    And Patient enter Captcha "<Captcha>"
    And Patient click on Submit button
    And Patient click on SendOTP button
    And Patient enter OTP "<OTP>"
    And Patient click on VerifyOTP button
    And Patient select Yes as Associated with a Practice
    And Patient select Practice Location "<PracticeLocation>"
    And Patient enter FirstName "<FirstName>"
    And Patient enter LastName "<LastName>"
    And Patient enter NewPassword "<NewPassword>"
    And Patient enter ConfirmPassword "<ConfirmPassword>"
    And Patient select Country "<Country>"
    And Patient select State "<State>"
    And Patient select City "<City>"
    And Patient select ReferenceType "<ReferenceType>"
    And Patient enter Postal Code "<PostalCode>"
    And Patient enter Email "<Email>"
    And Patient select TimeZone "<TimeZone>"
    And Patient click on Signup button
    When Patient click on FinalSubmit button
    Then I validate the error message for the unchecked consent checkbox

    Examples: 
      | CountryCode | PhoneNumber | Captcha | OTP    | PracticeLocation                                                 | FirstName  | LastName | NewPassword | ConfirmPassword | Country | State | City  | ReferenceType | PostalCode | Email                       | TimeZone                                        |
      | India       |  9891811818 |  123456 | 999999 | Oakmont Community Hospital - Dreamsoft4u Public Patient Location | Automation | Last     | Pass@123    | Pass@123        | India   | Delhi | Noida | Direct        |     123456 | automationemail@yopmail.com | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |
