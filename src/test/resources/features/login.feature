Feature: Xfleet login feature

  Background:
    Given user is on the xfleet login page

  Scenario: Login as sales manager
    When user enters sales manager username
    And user enters sales manager password
    And user should see the password in bullet signs by default
    And user clicks on the login button
    Then user should see the Dashboard

  Scenario: Login as store manager
    When user enters store manager username
    And user enters store manager password
    And user should see the password in bullet signs by default
    And user clicks on the login button
    Then user should see the Dashboard


  Scenario: Login as truck driver
    When user enters truck driver username
    And user enters truck driver password
    And user should see the password in bullet signs by default
    And user clicks on the login button
    Then user should see the Quick Launchpad

  @XFLEET10-468
  Scenario: User land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link
    When user clicks on the Forgot your password? link
    Then she or he lands on "Forgot Password" page





#  1-All users can log in with valid credentials (We have 3 types of users: sales manager, store manager, truck driver).
#  *Driver should land on the "Quick Launchpad" page after successful login
#  *Sales Manager/ Store Manager should land on the "Dashboard" page after successful login
#
#  2- The system shouldn't allow users to login to application without providing valid credentials
#  *(for example, copy the url after log in, then log out, paste the same url to browser and try to skip authentication step)
#
#  3- All users can see their own usernames in profile menu, after successful login
#
#  4-"Invalid username or password." error message should be displayed for invalid credentials
#
#  5-User should see the password in bullet signs by default
#
#  6-User land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link
#
#  7-User can see "Remember me on this computer" link on the login page and it should be clickable
#
#  8- Verify that user can use "Enter" key from their keyboard on the login page
#  *(Users click on "Username" input box, hit "Enter" button, then cursor appears on "Password" input box, hit "Enter" again, "Login" button gets clicked) */
