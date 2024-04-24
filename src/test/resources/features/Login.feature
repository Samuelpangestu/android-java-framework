Feature: Login Page

  @Android @Login @LoginPage @Positive
  Scenario Outline:[Android] User successfully login
    Given User is on login page
    #Register
    When User click create account
    And User input name as "<name>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    And User click button register
    Then User see registration successful notification
    #Login
    And User click back
    And User input email as "<email>"
    And User input password as "<password>"
    And User click button login
    Then User see homepage

    Examples:
      | name   | email                | password   | confirm_password |
      | Indah  | ngantuk@yahoo.com    | rahasia    | rahasia          |
      | T      | bes0l4njut@gmail.com | r4has1a    | r4has1a          |
      | Rahmat | tanggung@peran.com   | rahasia!@# | rahasia!@#       |

  @Android @Login @LoginPage @Negative
  Scenario Outline:[Android] User failed to login with invalid email
    Given User is on login page
    And User input email as "<email>"
    And User input password as "<password>"
    And User click button login
    Then User see error invalid email notification

    Examples:
      | email      | password   |
      | ngantuk    | benar      |
      | @gmail.com | r4has1a    |
      |            | rahasia!@# |

  @Android @Login @LoginPage @Negative
  Scenario Outline:[Android] User failed to login with wrong email and password
    Given User is on login page
    And User input email as "<email>"
    And User input password as "<password>"
    And User click button login
    Then User see error email and password is wrong

    Examples:
      | email          | password   |
      | test@gmail.com | benar      |
      | test@gmail.com | r4has1a    |
      | test@gmail.com | rahasia!@# |
