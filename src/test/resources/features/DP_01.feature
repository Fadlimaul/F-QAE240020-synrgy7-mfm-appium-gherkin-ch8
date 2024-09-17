Feature: Display Product

  Scenario: TC_DP_01
    Given The user is on the login page
    When The user enter username "standard_user" and password "secret_sauce"
    And The user click button login
    And The user click change display product button
    Then The product display should be change

  Scenario: TC_DP_02
    Given The user is on the login page
    When The user enter username "standard_user" and password "secret_sauce"
    And The user click button login
    And The user click on the product
    Then The product inventory should be dispayed

