@SanityTest1
Feature: To verify the login functionality

  Scenario Outline: To verify the functionality of login correct patient credentials
    Given Patient is on login page
    When Patient select country code for login "<countryCode>"
    And Patient enter username "<userName>"
    And Patient enter password "<password>"
    And Patient click on Login button
    Then I verify the success message of the login

    Examples: 
      | countryCode | userName   | password |
#     | India       | 9988774404 | Pass@123 |
#     | India				|9881716175	 | Pass@123 |	
# 		| India       |9881718171  | Pass@123 | 
 			| India       |988171817  | Pass@123 |
#@RegressionTest1 
#  Scenario: To verify the functionality of login after leaving CountryCode Field blank 
#    Given Patient is on login page
#    When Patient click on CountryCode cross icon
#    And Patient click on Login button
#    Then I verify the error message for the blank countrycode field
#
#
#
#@RegressionTest2
#  Scenario Outline: To verify the functionality of login after leaving UserName Field blank
#    Given Patient is on login page
#    When Patient select country code for login "<countryCode>"
#    And Patient enter password "<password>"
#    And Patient click on Login button
#    Then I verify the error message for the blank username field
#
#Examples: 
#      | countryCode  |  password  |
#      | India |      Pass@123 |
#      
#@RegressionTest3
#  Scenario Outline: To verify the functionality of login after leaving password field blank
#    Given Patient is on login page
#    When Patient select country code for login "<countryCode>"
#    And Patient enter username "<userName>"
#    And Patient click on Login button
#    Then I verify the error message for the blank password field
#
#Examples: 
#      | countryCode  | userName | 
#      | India |     9988774404 | 
#      
#      
#@RegressionTest4      
#    Scenario Outline: To verify the functionality of login with invalid patient credentials
#    Given Patient is on login page
#    When Patient select country code for login "<countryCode>"
#    And Patient enter username "<userName>"
#    And Patient enter password "<password>"
#    And Patient click on Login button
#    Then I verify the alert message for the invalid credentials
#
#Examples: 
#      | countryCode  | userName | password  |
#      | India |     9988774212 | Pass@123 |
#      
#
#@SanityTest2     
#    Scenario Outline: To verify the functionality of login with OTP
#    Given Patient is on login page
#   	When Patient click on Login with OTP option
#    And Patient select country code for login "<countryCode>"
#    And Patient enter username "<userName>"
#    And Patient enter captcha "<captcha>"
#    And Patient click on Login with Otp button
#    And Patient enter the OTP "<otp>"
#    And Patient click on Login button with OTP
#    Then I verify the success message of the login
#
#Examples: 
#      | countryCode  | userName | captcha  | otp |
#      | India |     9988774404 | 123456 | 999999 |
#      
#
#@RegressionTest5     
#    Scenario Outline: To verify the functionality of login with invalid OTP
#    Given Patient is on login page
#   	When Patient click on Login with OTP option
#    And Patient select country code for login "<countryCode>"
#    And Patient enter username "<userName>"
#    And Patient enter captcha "<captcha>"
#    And Patient click on Login with Otp button
#    And Patient enter the OTP "<otp>"
#    And Patient click on Login button with OTP
#    Then I verify the error message for the invalid OTP 
#
#Examples: 
#      | countryCode  | userName | captcha  | otp |
#      | India |     9988774404 | 123456 | 999989 |      
       	