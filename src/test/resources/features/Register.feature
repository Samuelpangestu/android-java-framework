Feature: Register Page

  @Android @Register @RegisterPage @Positive
  Scenario Outline:[Android] User successfully register
    Given User is on login page
    When User click create account
    And User input name as "<name>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    And User click button register
    Then User see registration successful notification

    Examples:
      | name   | email                | password   | confirm_password |
      | Indah  | ngantuk@yahoo.com    | rahasia    | rahasia          |
      | T      | bes0l4njut@gmail.com | r4has1a    | r4has1a          |
      | Rahmat | tanggung@peran.com   | rahasia!@# | rahasia!@#       |

  @Android @Register @RegisterPage @Negative
  Scenario Outline:[Android] User failed to register with invalid name
    Given User is on login page
    When User click create account
    And User input name as "<name>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    And User click button register
    Then User see error invalid name notification

    Examples:
      | name | email          | password | confirm_password |
      |      | test@gmail.com | benar    | benar            |
#      | !!@# | test@gmail.com | rahasia!@# | rahasia!@#       |

  @Android @Register @RegisterPage @Negative
  Scenario Outline:[Android] User failed to register with invalid email
    Given User is on login page
    When User click create account
    And User input name as "<name>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    And User click button register
    Then User see error invalid email notification

    Examples:
      | name  | email      | password   | confirm_password |
      | Putra | ngantuk    | benar      | benar            |
      | Raja  | @gmail.com | r4has1a    | r4has1a          |
      | Handi |            | rahasia!@# | rahasia!@#       |

  @Android @Register @RegisterPage @Negative
  Scenario Outline:[Android] User failed to register with invalid email
    Given User is on login page
    When User click create account
    And User input name as "<name>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    And User click button register
    Then User see error invalid email notification

    Examples:
      | name  | email      | password   | confirm_password |
      | Putra | ngantuk    | benar      | benar            |
      | Raja  | @gmail.com | r4has1a    | r4has1a          |
      | Handi |            | rahasia!@# | rahasia!@#       |

  @Android @Register @RegisterPage @Negative
  Scenario:[Android] User failed to register with exist email
    Given User is on login page
    When User click create account
    And User input name as "Rahmat"
    And User input email as "test@gmail.com"
    And User input password as "belajar"
    And User input confirmation password as "belajar"
    And User click button register
    Then User see registration successful notification
    And User input name as "Beta"
    And User input email as "test@gmail.com"
    And User input password as "belajar"
    And User input confirmation password as "belajar"
    And User click button register
    Then User see error email already exists notification

  @Android @Register @RegisterPage @Negative
  Scenario:[Android] User failed to register with blank password
    Given User is on login page
    When User click create account
    And User input name as "Rahmat"
    And User input email as "test@gmail.com"
    And User input password as "belajar"
    And User input confirmation password as "belajar"
    And User click button register
    And User see error enter password notification

  @Android @Register @RegisterPage @Negative
  Scenario Outline:[Android] User failed to register with unmatch password
    Given User is on login page
    When User click create account
    And User input name as "<name>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    And User click button register
    And User see error password is not match notification

    Examples:
      | name  | email           | password | confirm_password |
      | Ahmad | test@gmail.com  | @@       | benar            |
      | Raja  | test1@gmail.com | r4has1a  |                  |
