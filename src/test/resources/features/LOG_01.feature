Feature: Login

  Scenario: TC_LOG_01
    Given The user is on the log in
    When The user enters valid username "standard_user" and password "secret_sauce"
    And The user click login button
    Then The user directed to the home page

  Scenario: TC_LOG_02
    Given The user is on the log in
    When The user enters valid username "standard_user" and password "secret"
    And The user click login button
    Then The user should see an error message

  Scenario: TC_LOG_03
    Given The user is on the log in
    When The user enters valid username "standard" and password "secret_sauce"
    And The user click login button
    Then The user should see an error message

  Scenario: TC_LOG_04
    Given The user is on the log in
    When The user enters valid username "" and password "secret_sauce"
    And The user click login button
    Then The user should see an error message below username field

  Scenario: TC_LOG_05
    Given The user is on the log in
    When The user enters valid username "standard_user" and password ""
    And The user click login button
    Then The user should see an error message below password field

  Scenario: TC_LOG_06
    Given The user is on the log in
    When The user click login button
    Then The user should see an error message below username field

  Scenario: TC_LOG_07
    Given The user is on the log in
    When The user click username text
    And The user click login button
    Then The user should see the products page

  Scenario: TC_LOG_08
    Given The user is on the log in
    When The user enters valid username "standard_user" and password "secret_sauce"
    And The user click login button
    And The user click menu button
    And The user click logout button
    Then The user should see the logo displayed