@tag
Feature: To verify the functionality of User profile editing

  @SanityTest1
  Scenario Outline: To verify the functionality of Patient profile updating with all valid data
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | Updated   | Automation | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @SanityTest2
  Scenario Outline: To verify the functionality of Doctor profile updating with all valid data
    Given User is on Doctor Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Updated   | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @SanityTest3
  Scenario Outline: To verify the functionality of Accountant profile updating with all valid data
    Given User is on Accountant Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName  | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Accountant | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  # Profile option for the Admin hr is not clickable
  #@SanityTest4
  #  Scenario Outline: To verify the functionality of Admin Hr profile updating with all valid data
  #    Given User is on Adminhr Profile page
  #    And User select Doctor Prefix "<prefix>"
  #    And User enter FirstName for Editing "<firstName>"
  #    And User enter LastName for Editing "<lastName>"
  #    And User select Doctor DOB for Editing "<dob>"
  #    And User select Gender for Editing "<gender>"
  #    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
  #    And User enter AlternateEmail for Editing "<alternateEmail>"
  #    And User select doctor experience for Editing "<experience>"
  #    And User select Country for Editing "<country>"
  #    And User select State for Editing "<state>"
  #    And User select City for Editing "<city>"
  #    And User enter PostalCode for Editing "<postalCode>"
  #    And User enter PermanentAddress for Editing "<permanentAddress>"
  #    And User enter ResidentialAddress for Editing "<residentialAddress>"
  #    And User enter Doctor AboutMe for Editing "<aboutMe>"
  #    And User enter Doctor LicenceNo for Editing "<licenceNo>"
  #    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
  #    And User select TimeZone for Editing "<timeZone>"
  #    And User enter ConsultancyFee for Editing "<consultancyFee>"
  #    And User upload profile image "<imagePath>"
  #    When User click on Submit button
  #    Then I validate the success message for the profile update
  #
  #    Examples:
  #      | prefix | firstName | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
  #      | Dr.    | Admin   | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 | 100   |  737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |
  @SanityTest5
  Scenario Outline: To verify the functionality of Receptionist profile updating with all valid data
    Given User is on Receptionist Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName    | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Receptionist | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @SanityTest6
  Scenario Outline: To verify the functionality of PCC profile updating with all valid data
    Given User is on PCC Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | PCC       | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @SanityTest7
  Scenario Outline: To verify the functionality of Laboratory profile updating with all valid data
    Given User is on Laboratory Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName  | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Laboratory | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @SanityTest8
  Scenario Outline: To verify the functionality of Pharmacy profile updating with all valid data
    Given User is on pharmacy Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Pharmacy  | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @SanityTest9
  Scenario Outline: To verify the functionality of Nurse profile updating with all valid data
    Given User is on Nurse Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Nurse     | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @SanityTest10
  Scenario Outline: To verify the functionality of Radiographer profile updating with all valid data
    Given User is on Radiographer Profile page
    And User select Doctor Prefix "<prefix>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select Doctor DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter doctor AlternateContact Number for Editing "<alternateContactNumber>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select doctor experience for Editing "<experience>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User select City for Editing "<city>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User enter Doctor AboutMe for Editing "<aboutMe>"
    And User enter Doctor LicenceNo for Editing "<licenceNo>"
    And User select Doctor LicenceNo ExpiryDate for Editing "<expiryDate>"
    And User select TimeZone for Editing "<timeZone>"
    And User enter ConsultancyFee for Editing "<consultancyFee>"
    And User upload profile image "<imagePath>"
    When User click on Submit button
    Then I validate the success message for the profile update

    Examples: 
      | prefix | firstName    | lastName   | dob        | gender | alternateContactNumber | alternateEmail             | experience | country | state | city | postalCode | permanentAddress  | residentialAddress | aboutMe            | licenceNo  | expiryDate | timeZone                                        | consultancyFee | imagePath                |
      | Dr.    | Radiographer | Automation | 12/13/2001 | Male   |             8191911919 | alternateemail@yopmail.com |       2023 |     100 |   737 | 7398 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | Automation Updated | 1234567890 | 10/26/2024 | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |           1000 | D:\\ImagePath\\Human.jpg |

  @RegressionTest1
  Scenario Outline: To verify the functionality of Patient profile updating after leaving first name field blank
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User leaves FirstName field blank during profile Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for blank first name

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg |           | Automation | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest2
  Scenario Outline: To verify the functionality of Patient profile updating after entering less value in first name field
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for less first name value

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | ds        | Automation | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest3
  Scenario Outline: To verify the functionality of Patient profile updating after entering blank value in Last name field
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User leaves LastName field blank during profile Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for blank last name

    Examples: 
      | imagePath                | firstName | lastName | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | ds        |          | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest4
  Scenario Outline: To verify the functionality of Patient profile updating after entering less value in last name field
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for less last name value

    Examples: 
      | imagePath                | firstName | lastName | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | Updated   | Au       | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest5
  Scenario Outline: To verify the functionality of Patient profile updating after leaving Gender field blank
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for blank gender field

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender     | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | Updated   | Automation | 12/13/2001 | - Select - | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest6
  Scenario Outline: To verify the functionality of Patient profile updating after entering invalid Alternate Email
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for invalid Alternate Email id

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail | alternateContactNumber | country | state | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | Updated   | Automation | 12/13/2001 | Male   | alternateema   |             9821181818 |     100 |  1663 | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest7
  Scenario Outline: To verify the functionality of Patient profile updating after entering leaving state field blank
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for blank State field

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail             | alternateContactNumber | country | state          | city | postalCode | permanentAddress  | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | Updated   | Automation | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 | -Select State- | 7415 |     123456 | Gopalpura, Jaipur | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest8
  Scenario Outline: To verify the functionality of Patient profile updating after leaving permanent address field blank
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for blank permanent address field

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress | residentialAddress | bloodGroup | insurance | timeZone                                        |
      | D:\\ImagePath\\Human.jpg | Updated   | Automation | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 |                  | Mansarovar, Jaipur | B+         | No        | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

  @RegressionTest9
  Scenario Outline: To verify the functionality of Patient profile updating after leaving TimeZone field blank
    Given User is on Patient Profile page
    And User upload profile image "<imagePath>"
    And User enter FirstName for Editing "<firstName>"
    And User enter LastName for Editing "<lastName>"
    And User select DOB for Editing "<dob>"
    And User select Gender for Editing "<gender>"
    And User enter AlternateEmail for Editing "<alternateEmail>"
    And User select AlternateContact Number for Editing "<alternateContactNumber>"
    And User select Country for Editing "<country>"
    And User select State for Editing "<state>"
    And User enter PostalCode for Editing "<postalCode>"
    And User enter PermanentAddress for Editing "<permanentAddress>"
    And User enter ResidentialAddress for Editing "<residentialAddress>"
    And User select BloodGroup for Editing "<bloodGroup>"
    And User select AnyInsurance for Editing "<insurance>"
    And User select TimeZone for Editing "<timeZone>"
    When User click on Submit button
    Then I validate the error message for blank timezone field

    Examples: 
      | imagePath                | firstName | lastName   | dob        | gender | alternateEmail             | alternateContactNumber | country | state | city | postalCode | permanentAddress | residentialAddress | bloodGroup | insurance | timeZone           |
      | D:\\ImagePath\\Human.jpg | Updated   | Automation | 12/13/2001 | Male   | alternateemail@yopmail.com |             9821181818 |     100 |  1663 | 7415 |     123456 |                  | Mansarovar, Jaipur | B+         | No        | -Select Time Zone- |
