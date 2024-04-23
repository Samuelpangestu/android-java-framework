Feature: Login

  @Android @LoginFeature
    Scenario:[Android] Success login
    Given User is on stockbit landingpage
    When User click login
    And User input username as "USERNAMES"
    And User input password as "PASSWORD"
    And User click button login
    Then User see watchlist page