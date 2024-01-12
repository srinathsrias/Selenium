@reg @E2E
Feature: To validate Registration functionalities of ASOS Application.

  Background: 
    Given The User should be in the Home page of the Application.
    Then The User should place the cursor on the account icon.

  @smoke
  Scenario: To validate registration with valid data_1.
    Then The User should click the "join" button.
    And The User should enter all the given basic details.
      | srinathsrinathas2610@gmail.com |
      | Srinath                        |
      | Alagesan                       |
      | Srinath@123                    |
      |                             29 |
      |                             10 |
      |                           2001 |
    Then The User should click join asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to my-account page

  @sanity
  Scenario: To validate registration with valid data_2.
    Then The User should click the "join" button.
    And The User should enter all the given basic details.
      | pathma3402@gmail.com |
      | Pathma               |
      | Elangovan            |
      | Pathma@019           |
      |                   19 |
      |                    4 |
      |                 2002 |
    Then The User should click join asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to my-account page

  @regression
  Scenario: To validate registration with valid data_3.
    Then The User should click the "join" button.
    And The User should enter all the given basic details.
      | shandhini2001@gmail.com |
      | Shandhini               |
      | Periyasamy              |
      | Shandhu@2001            |
      |                      24 |
      |                      10 |
      |                    2001 |
    Then The User should click join asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to my-account page

  @retest
  Scenario: To validate registration with valid data_4.
    Then The User should click the "join" button.
    And The User should enter all the given basic details.
      | pdharanibvn@gmail.com |
      | Dharani               |
      | Palraj                |
      | Dhaaru@2506           |
      |                    25 |
      |                     6 |
      |                  2002 |
    Then The User should click join asos button.
    And The User need to click I am not robot button.
    Then The User will navigate to my-account page
