Feature: login page

  @Android @Register @LoginPage
    Scenario Outline:[Android] User successfully register
    Given User is on login page
    When User click create account
    And User input name as "<name>"
    And User input name as "<email>"
    And User input password as "<password>"
    And User input confirmation password as "<confirm_password>"
    Then User see registration successful notification

  Examples:
    | name         | email                | password   | confirm_password |
    | Indah        | ngantuk@yahoo.com    | rahasia    | rahasia       |
    | bakalanMalam | bes0l4njut@gmail.com | r4has1a    | R4has1a       |
    | b3lumt1dur   | tanggung@peran.com   | rahasia!@# | rahasia!@#    |
