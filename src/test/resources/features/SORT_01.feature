Feature: Sorting Product

  Scenario: TC_SORT_01
    Given The user on the login page
    When The user click sorting button
    And The user choose High to Low
    Then The product should be sorting from high to low price

  Scenario: TC_SORT_02
    Given The user on the login page
    When The user click sorting button
    And The user choose Low to High
    Then The product should be sorting from low to high price

  Scenario: TC_SORT_03
    Given The user on the login page
    When The user click sorting button
    And The user choose A to Z
    Then The name product should be sorting from A to Z

  Scenario: TC_SORT_04
    Given The user on the login page
    When The user click sorting button
    And The user choose Z to A
    Then The name product should be sorting from Z to A

  Scenario: TC_SORT_05
    Given The user on the login page
    When The user click change display
    And The user click sorting button
    And The user choose High to Low
    Then The product should be sorting from high to low price

  Scenario: TC_SORT_06
    Given The user on the login page
    When The user click change display
    And The user click sorting button
    And The user choose Low to High
    Then The product should be sorting from low to high price

  Scenario: TC_SORT_07
    Given The user on the login page
    When The user click change display
    And The user click sorting button
    And The user choose A to Z
    Then The name product should be sorting from A to Z

  Scenario: TC_SORT_08
    Given The user on the login page
    When The user click change display
    And The user click sorting button
    And The user choose Z to A
    Then The name product should be sorting from Z to A

  Scenario: TC_SORT_09
    Given The user on the login page
    When The user click sorting button
    And The user choose cancel
    Then The user should back to the product page

