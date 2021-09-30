Feature: Login functionality

  @burger
  Scenario Outline: User with invalid username should get an error message
    Given a user is on the home page of Amazon
    When he hovers the pointer over Hello Sign in menu
    And he clicks on Sign in button in the sub menu
    And he enters an invalid username as "<username>"
    And he clicks on Continue button
    Then he should see the error message as "<message>"
    Examples:
    |username|message|
    |batman554466@gmail.com|We cannot find an account with that email address|
    |superman554466@gmail.com|We cannot find an account with that email address |
    |ironman554466@gmail.com |We cannot find an account with that email address|
    |spiderman554466@gmail.com|We cannot find an account with that email address|
    |captainplanet554466@gmail.com|We cannot find an account with that email address|