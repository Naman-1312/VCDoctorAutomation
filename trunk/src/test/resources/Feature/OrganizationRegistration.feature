@tag
Feature: To verify the functionality of Location & Organization Registration

  @SanityTest
  Scenario Outline: To verify the functionality of Organization registration with valid data
    Given User is on registration page
    And User select country code "<CountryCode>"
    And User enter PhoneNumber "<PhoneNumber>"
    And User enter FirstName "<FirstName>"
    And User enter LastName "<LastName>"
    And User enter Designation "<Designation>"
    And User enter Email "<Email>"
    And User enter Captcha
    When User click on Signup button
    Then I validate the success message of Organization registration

    Examples: 
      | CountryCode | PhoneNumber | FirstName | LastName | Designation  | Email                  | 
      | India       |  9882118245 |    Naman |   999999 | Oakmont Comm | Automation18@yopmail.com | 


  #@SanityTest
  #Scenario Outline: To verify the functionality of Location registration with valid data
   # Given User is on registration page
    #And User Select Location Radio button
    #And User select country code "<CountryCode>"
    #And User enter PhoneNumber "<PhoneNumber>"
    #And User enter FirstName "<FirstName>"
    #And User enter LastName "<LastName>"
    #And User enter Designation "<Designation>"
    #And User enter Email "<Email>"
    #And User enter Captcha 
    #When User click on Signup button
    #Then I validate the success message of Location registration

    #Examples: 
     # | CountryCode | PhoneNumber | FirstName | LastName | Designation  | Email                  | 
      #| India       |  9854716171 |    123456 |   999999 | Oakmont Comm | Automation10@yopmail.com | 
 
 @RegressionTest1
  Scenario Outline: To verify the functionality of Organization registration after leaving countrycode blank
    Given User is on registration page
    And User leaves countrycode field blank
    And User enter PhoneNumber "<PhoneNumber>"
    And User enter FirstName "<FirstName>"
    And User enter LastName "<LastName>"
    And User enter Designation "<Designation>"
    And User enter Email "<Email>"
    And User enter Captcha
    When User click on Signup button
    Then I validate the validation message for the blank countrycode

    Examples: 
       | PhoneNumber | FirstName | LastName | Designation  | Email                  | 
       |  9882118245 |    Naman |   999999 | Oakmont Comm | Automation18@yopmail.com | 
      
@RegressionTest2
  Scenario Outline: To verify the functionality of Organization registration after leaving Phonenumber field blank
    Given User is on registration page
    And User select country code "<CountryCode>"
    And User enter FirstName "<FirstName>"
    And User enter LastName "<LastName>"
    And User enter Designation "<Designation>"
    And User enter Email "<Email>"
    And User enter Captcha
    When User click on Signup button
    Then I validate the validation message for the blank phonenumber field 

    Examples: 
      | CountryCode | FirstName | LastName | Designation  | Email                  | 
      | India       | Naman |   999999 | Oakmont Comm | Automation18@yopmail.com | 

@RegressionTest3
  Scenario Outline: To verify the functionality of Organization registration after enter less value phonenumber
    Given User is on registration page
    And User select country code "<CountryCode>"
    And User enter PhoneNumber "<PhoneNumber>"
    And User enter FirstName "<FirstName>"
    And User enter LastName "<LastName>"
    And User enter Designation "<Designation>"
    And User enter Email "<Email>"
    And User enter Captcha
    When User click on Signup button
    Then I validate the validation message for the less phonenumber field

    Examples: 
      | CountryCode | PhoneNumber | FirstName | LastName | Designation  | Email                  | 
      | India       |  98821145 |    Naman |   999999 | Oakmont Comm | Automation18@yopmail.com | 

      
@RegressionTest4
  Scenario Outline: To verify the functionality of Organization registration after leaving first name field blank
    Given User is on registration page
    And User select country code "<CountryCode>"
    And User enter PhoneNumber "<PhoneNumber>"
    And User enter LastName "<LastName>"
    And User enter Designation "<Designation>"
    And User enter Email "<Email>"
    And User enter Captcha
    When User click on Signup button
    Then I validate the validation message for the blank firstname 

    Examples: 
      | CountryCode | PhoneNumber |  LastName | Designation  | Email                  | 
      | India       |  9882118245 |    999999 | Oakmont Comm | Automation18@yopmail.com | 
