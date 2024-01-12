@log @E2E
Feature: To validate Login functionalities of ASOS Application.

  Background: 
    Given The User should be in the Home page of the Application.
    Then The User should place the cursor on the account icon.

  @smoke
  Scenario: To validate Login with valid data_1.
    Then The User should click the "Signin" button.
    And The User should enter all the given details.
      | srinathsrinathas2610@gmail.com |
      | Srinath@123                    |
    Then The User should click signin asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to men page

  @sanity
  Scenario: To validate Login with valid data_2.
    Then The User should click the "Signin" button.
    And The User should enter all the given details.
      | pathma3402@gmail.com |
      | Pathma@019           |
    Then The User should click signin asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to men page

  @regression
  Scenario: To validate Login with valid data_3.
    Then The User should click the "Signin" button.
    And The User should enter all the given details.
      | shandhini2001@gmail.com |
      | Shandhu@2001            |
    Then The User should click signin asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to men page

  @retest
  Scenario: To validate Login with valid data_4.
    Then The User should click the "Signin" button.
    And The User should enter all the given details.
      | pdharanibvn@gmail.com |
      | Dhaaru@2506           |
    Then The User should click signin asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to men page
